# Spring Boot Actuator Example

Sets up several Spring Boot actuators, and a webpage to list and access them.

Just run it:

```
mvn spring-boot:run
```

Then visit [http://localhost:8080/](http://localhost:8080/).

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

- Spring Boot Actuators
- Custom actuator endpoint
- Custom Health Indicator
- Custom Info Contributor
- Info actuator showing git and build info

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
mvn verify site
```

The verify phase is required, otherwise some of the reports won't be generated.

## Running the tests

The project requires a database and a server for being able to run the integration tests.

Just like running the project, an embedded server with an in-memory database can be used:

```
mvn verify
```

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under the [MIT License][license].

[issues]: https://github.com/bernardo-mg/spring-boot-actuator-example/issues
[javadoc-develop]: https://docs.bernardomg.com/development/maven/spring-boot-actuator-example/apidocs
[javadoc-release]: https://docs.bernardomg.com/maven/spring-boot-actuator-example/apidocs
[license]: https://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/spring-boot-actuator-example
[site-develop]: https://docs.bernardomg.com/development/maven/spring-boot-actuator-example
[site-release]: https://docs.bernardomg.com/maven/spring-boot-actuator-example
