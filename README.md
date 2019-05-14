# Testing Legacy Code with jUnit

Testing your code will help you to keep it clean, maintainable and reusable, one of the hardest parts of testing is when face legacy code that was written by others. In this module we will go through a small example of how that looks like and apply some of the best TDD practices.

To achieve those goals we will use the jUnit dependency thru Maven, so just start by [creating a Maven project](https://java.codeup.com/java-iii/deployment-and-dependencies/#creating-a-new-maven-project-with-intellij) and add the following dependency to your `pom.xml` file.

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
```

The [Kitchen class](/src/main/java/Kitchen.java) that we will be testing already has a lot of functionality done for us, during our process we will test every single method and might find some opportunities to improve and refactor the code.

