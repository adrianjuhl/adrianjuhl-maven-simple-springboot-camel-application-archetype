# Usage guide

Steps to use the `simple-springboot-camel-application-archetype` to generate a new springboot camel project:

1. On the command line, navigate to where the project is to be generated. Maven will create a new directory here, naming it the same as the new project's artifactId, and the project will be initialized within it.

1. Run the following Maven `archetype:generate` command to generate the project. Use the following, with values for `groupId`, `artifactId`, `version`, `name` and `description`, that are appropriate for the new project.
    ```
    mvn archetype:generate \
      -DinteractiveMode=false \
      -DarchetypeGroupId=io.github.adrianjuhl.archetype \
      -DarchetypeArtifactId=simple-springboot-camel-application-archetype \
      -DarchetypeVersion=0.0.1-SNAPSHOT \
      -DgroupId=com.example \
      -DartifactId=my-springboot-camel-application \
      -Dversion=1.0.0-SNAPSHOT \
      -Dname="My Springboot Camel Application" \
      -Ddescription="A springboot Camel application ..."
    ``` 
