# SBT Templates

A series of SBT [Giter8](http://www.foundweekends.org/giter8/) templates for structured projects
in FP style!

It includes:

* SBT multi-module support
* Best practice SBT plugins and configuration for Functional Programming
* Most commonly used libraries for small and medium size projects
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
* `desc`: Description of the project. Defaults to: `Sample Scala SBT project`
* `organization`: Root package. Defaults to: `com.colofabrix.scala`
* `author`: Name of the author

### Options

* `enforceBestPractices`: Perform linting for Scala and FP best practices. Defaults to: `true`

### Enabled modules

* `addRootProject`: Create the standard flat SBT project. Defaults to `no`
* `addRootIoProject`: Create the standard flat SBT project that uses Cat's IOApp. Defaults to `yes`
* `addBasicModule`: Create the standard main application module. Defaults to `no`
* `addIoBasicModule`: Create the Cat's IO application module. Defaults to `no`
* `addAppModule`: Create the complex application module. Defaults to `no`
* `addWebModule`: Create the http service module. Defaults to `no`

### Modules configuration

* `basicModuleName`: Name of the standard main application module. Defaults to `basic`
* `ioBasicModuleName`: Name of the Cat's IO application module. Defaults to `ioBasic`
* `appModuleName`: Name of the complex application module. Defaults to `app`
* `webModuleName`: Name of the http service module. Defaults to `web`

## License

CC0 1.0

## Author Information

Fabrizio Colonna (@ColOfAbRiX)
