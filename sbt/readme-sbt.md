# How to SBT

```
name := "Hello"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.1"
```

- name and version of project
- scala version
- MUST delimit each setting directive by a blank line


-------

# Tests

Put this in these directories

```bash
mkdir -p src/test/scala
mkdir -p src/main/scala
``` 

------

# Add sbt test to the lib dep

+= "<GROUP_ID>" "<ARTIFACT_ID_<VERSION>>" "<VERSION>" "<config-param-for-sbt>"

eg the last config was only for the test configuration

```
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.7" % "test"
```
