#!/bin/sh

ssh -i ~/.ssh/servers/mypraize-beanstalk.pem ec2-user@54.164.22.48 './mypraize/deployment-tools/awsDeploy.sh'
