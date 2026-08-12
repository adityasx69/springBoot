# Spring Boot Practice Workspace

This workspace contains several small Java and Spring Boot projects used to learn and practice core Java, Maven, Spring Core, and Spring Boot concepts.

## Included modules

- `CoreDemo` – Java-based service and notification examples
- `demo` – Spring Boot application starter project
- `mavenDemo` – Maven-based Java demo
- `springCoreDemo` – Spring Core dependency injection and configuration examples
- `springCoreDemo2` – additional Spring Core practice examples

## Prerequisites

- Java JDK 17 or newer
- Maven 3.8+
- Optional: Spring Boot CLI or IDE support

## Run a project

From the workspace root, navigate to a module and run:

```bash
cd demo
./mvnw spring-boot:run
```

For Maven-based modules:

```bash
cd springCoreDemo
mvn clean install
mvn spring-boot:run
```

Some modules may use direct Java entry points instead of Spring Boot runners, depending on the example.

## Project structure

```text
springboot/
├── CoreDemo/
├── demo/
├── mavenDemo/
├── springCoreDemo/
├── springCoreDemo2/
├── README.md
├── .gitignore
└── .vscode/   (optional local editor files)
```

## Notes

These projects are intended for learning and experimentation. They are not a single production application, but a collection of small exercises and examples.
