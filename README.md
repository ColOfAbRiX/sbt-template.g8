# SBT Templates

A series of SBT [Giter8](http://www.foundweekends.org/giter8/) templates for structured projects!

It includes:

* Best practice SBT plugins and configuration for Functional Programming
* Most commonly used libraries
* Standard simple SBT single project
* A module with for an application with a standard Main method
* A module for an application that uses Cat's IO
* A module for a complex application with predefined libraries and configuration
* A module for a HTTP service with predefined libraries and configuration

## Using the template

To create a new project with SBT using this template run:

```shell
sbt new colofabrix/sbt-template.g8
```

You will be asked to choose the configuration for you project using the following variables.

## Variables

### General

* `name`: Name of the repository. Defaults to: `Sample`
* `project`: Name of the project. Defaults to: `Basic`
* `scalaVersion`: Version of Scala. Defaults to: `2.13.0`
* `desc`: Description of the project. Defaults to: `Sample Scala SBT project`
* `organization`: Root package. Defaults to: `com.colofabrix.scala`

### Enabled modules

* `useRoot`: Create the standard SBT module. Defaults to `yes`
* `useBasic`: Create the standard main application module. Defaults to `no`
* `useIoBasic`: Create the Cat's IO application module. Defaults to `no`
* `useApp`: Create the complex application module. Defaults to `no`
* `useWeb`: Create the http service module. Defaults to `no`

### Modules configuration

* `basicProject`: Name of the standard main application module. Defaults to `basic`
* `ioBasicProject`: Name of the Cat's IO application module. Defaults to `ioBasic`
* `appProject`: Name of the complex application module. Defaults to `app`
* `webProject`: Name of the http service module. Defaults to `web`

## License

CC0 1.0

## Author Information

Fabrizio Colonna (@ColOfAbRiX)
