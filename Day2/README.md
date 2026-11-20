# Day 02 - Maven Project Basics

## What is Maven?
Maven is a build and project management tool for Java. It creates the project structure, manages the jar files (dependencies) and builds the project.

## Why Maven?
- No need to download and add jar files manually.
- We just add a dependency in `pom.xml` and Maven downloads the required jars.
- Gives the same standard project structure for every project.

## Project Structure
- `src/main/java` - main Java code
- `src/test/java` - test code
- `pom.xml` - Maven configuration file

A Maven project runs the same way as a normal Java project. Only the project structure is different.

## pom.xml (Project Object Model)
The important file in a Maven project. It is an XML file. Fields in it:

- **modelVersion** - version of the POM model.
- **groupId** - company or organization name (package style).
- **artifactId** - project name.
- **version** - project version.
- **packaging** - type of output (jar, war).
- **properties** - used to define values once (like Java version, encoding) and reuse them.
- **dependencies** - jar files needed by the project. Added based on the requirement.
- **dependencyManagement** - manages dependency versions in one place.
- **build** - build related settings.
- **plugins** - extra functionality used in the build. Maven works through plugins.
- **pluginManagement** - manages plugin versions and configuration in one place.
- **repositories** - places from where jars are downloaded.

## Repositories
- Maven downloads the jar files from repositories.
- Public repository: Maven Central.
- Companies use their own private repository (for example Nexus). The URL is confidential and given by the company.
- To use it, add the repository in `pom.xml` and replace the example URL with the organization URL.
- The same is used for uploading and publishing (updating) artifacts.

## Running a Maven Project
1. Create the Maven project.
2. Java code is under `src/main/java`.
3. Open the default class and run it.
4. We get the output in the console.

## Key Points
- Understand why we create a Maven project and what files it has.
- Understand the fields available in `pom.xml`.
- Maven project and normal project run the same way, only the structure is different.
