# Git Best Practices

![Git Flow Example](http://nvie.com/img/git-model@2x.png "Git Flow Example")

## What is Git Flow

Git Flow is fundamentally a set of best practices and standardization of git repositories.

This is the skinny:

* All code changes are made in a branch. That branch is prefixed by what kind of change it is (feature, hotfix, etc.)
* Your development enviornment is to reflect the code in the `develop` branch, and production is to reflect `master`
* Versions are to be marked using tags

Based on this, a command line tool has been made to assist in performing these tasks effectively.

## Application

Git flow rocks especially for when you have multiple developers rolling on a production project, right? What happens when you are just one developer on a dev project?

Let's consider the scenarios:

### Single Developer, in Development

Screw it, as long as you use Git at all, you are golden.  May be helpful to use branches for big features.

### Single Developer, in Production

Use two branches, use `develop` and `master`.  Develop using develop, and make sure master is only master.  Then you can `git pull` on production with the master branch selected.

### Multiple (3+) Developers

I recommend using Git Flow no matter what. Don't worry about the `develop` branch, but this will really help.

## More Resources & Reading

* [Git Flow Library](https://github.com/nvie/gitflow)
* [Git Flow Manifesto](http://nvie.com/posts/a-successful-git-branching-model/)
* [Other Various Git Workflows](https://www.atlassian.com/git/tutorials/comparing-workflows/centralized-workflow)
