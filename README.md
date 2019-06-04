# Testing Legacy Code with JUnit

We will use the JUnit 4 dependency thru Maven, so just start by [creating a Maven project](https://java.codeup.com/java-iii/deployment-and-dependencies/#creating-a-new-maven-project-with-intellij) and add the following dependency to your `pom.xml` file.

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
```

## Getting Started
1. Fork this repository to make a copy on your own GitHub account.
1. Make sure that your browser is showing this project in your own repositories list in your own account.
1. Click the green button on the right that says "Clone or Download". 
1. The clone address should look like `git@github.com:your-github-username/junit-tests.git`, where `your-github-username` is actually your own username on GitHub.
1. Once you've copied your repo's clone address, it's time to clone the project in one of two ways: 
    - If you're using IntelliJ, choose New->Project From Version Control->Git and then paste in the clone address.`git clone git@github.com:your-github-username/junit-tests.git`.
    - If you're using command line, then execute the following command line command: `git clone git@github.com:your-github-username/junit-tests.git`.
1. Once cloned to your projects directory, open up the project.


### Project Structure
- The `Kitchen.java` class file already has a lot of functionality done for us, during our process we will test every single method and we might find some opportunities to improve and refactor the original code, but first let's talk about the basics.
- The `KitchenTest.java` class, should be created in the following directory `/src/test/java`.
- The `App.java` class file contains the implementation code. An "implementation" means the code that is meant to solve a problem, fix a bug, or add a feature.

### Exercise 

We will follow the best practices of TDD and we will build the tests first and write production code once we see the test fail first. We will create a `BlogApp` class for a blog application, these are the requirements for that feature:

The app should be able to create posts, each post should contain a `userId, title and content`.
 
- `userId` should be a `long` number used to represent a "user" in our application.
- `title` is a `String` that holds the title of the blog post.
- `content` is a `String` that contains the whole post of the blog post.

1. Create a `BlogAppTest.java` file inside of `src/test/java` and remember to write the test before the actual code. We will simulate the `C(reate) R(ead)` from the `CRUD` functionality in our blog application so your should be able to test and create the following:

- A Java class named `Post` with a constructor that includes all 3 private fields and each one has their respective getter method.
- A Java class named `BlogApp` that has the following:
    - An `ArrayList` of Post instances called `posts`.
    - A `savePost()` method that takes a `Post` as an argument and adds it to an ArrayList, it returns the saved Post.
    - A `findAllPosts()` method takes no arguments and returns the ArrayList of `Post` elements.
    - A `findPost` method that takes in an id as an argument and returns the specific `Post` corresponding to the index from the ArrayList.
- At the end of the exercise you will ended up with a `BlogApp.java` class, a `BlogAppTest.java` class and a `Post.java` class.

#### Bonus

- Go ahead and try to add the rest of the `CRUD` tests and functionality, write the methods for `updatePost()` and `deletePost()`.