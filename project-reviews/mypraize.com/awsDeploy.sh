#!/bin/sh

cd "$(dirname "$0")"

cd ..

export LOCAL_VERSION=`/usr/bin/git rev-parse HEAD`
/usr/bin/aws elasticbeanstalk delete-application-version --application-name "My First Elastic Beanstalk Application" --version-label $LOCAL_VERSION --delete-source-bundle

cd /home/ec2-user/mypraize
/usr/bin/git pull
export LOCAL_VERSION=`/usr/bin/git rev-parse HEAD`
/usr/local/bin/bower install --allow-root --config.interactive=false
/usr/local/apache-maven/bin/mvn clean install -DskipTests
/usr/bin/aws s3 cp target/mypraize-0.1.war s3://app.mypraize.com/mypraize-$LOCAL_VERSION.war
/usr/bin/aws elasticbeanstalk create-application-version --application-name "My First Elastic Beanstalk Application" --description "Uploaded From Mongo" --version-label $LOCAL_VERSION --source-bundle S3Bucket="app.mypraize.com",S3Key="mypraize-$LOCAL_VERSION.war"
/usr/bin/aws elasticbeanstalk update-environment --environment-name "mypraize-dev" --version-label $LOCAL_VERSION
echo "Done!\n\n"