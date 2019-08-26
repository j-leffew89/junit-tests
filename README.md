# Testing Legacy Code with JUnit

### Getting Started
1. Fork this repository to make a copy on your own GitHub account.
1. Make sure that your browser is showing this project in your own repositories list in your own account.
1. Click the green button on the right that says "Clone or Download". 
1. The clone address should look like `git@github.com:your-github-username/junit-tests.git`, where `your-github-username` is actually your own username on GitHub.
1. Once you've copied your repo's clone address, it's time to clone the project in one of two ways: 
    - If you're using IntelliJ, choose New->Project From Version Control->Git and then paste in the clone address.`git clone git@github.com:your-github-username/junit-tests.git`.
    - If you're using command line, then execute the following command line command: `git clone git@github.com:your-github-username/junit-tests.git`.
1. Once cloned to your projects directory, open up the project.

### Exercises

#### Part One: The Test Driven Cycle (Red, Green, Refactor) 

We will follow the best practices of TDD and we will create our tests first and write production code once we see the test fail. We will create a `Student` and a `StudentTest` class for a grades application, let's analyse the requirements for the `Student` class:
 
- `id` should be a `long` number used to represent a "unique user" in our application.
- `name` is a `String` that holds the name of the student.
- `grades` is an `ArrayList` that contains a list of `Integer` numbers.

1. Create a `StudentTest.java` class file inside of `src/test/java` and remember to write the test before the actual production code. We will simulate the `C(reate) R(ead)` from the `CRUD` functionality in our grades application so your should be able to test and create the following:

    - The `Student` class should have a constructor that sets the name and id property, and initializes the grades property as an empty ArrayList.
    - The `Student` class should have the following methods:
    ```java
        // returns the student's id
        public long getId();  
        // returns the student's name
        public String getName();
        // adds the given grade to the grades property
        public void addGrade(int grade);
        // returns the average of the students grades
        public double getGradeAverage();
    ```
At the end of the exercise you will ended up with a `Student.java` and a `StudentTest.java` class.

#### Part Two: Testing Legacy Code

For the last part, once you finished the `Student.java` class, you will find a `Cohort.java` class inside the `src/main/java` folder, this class has already a couple of methods to calculate the cohort average grade and add a student. Let's go ahead and make sure there's sufficient tests for this class to be deploy to production:

Create a test for each of the following concerns and provide any extra tests as needed. 

1. A Cohort instance always have students before being used.
1. A Cohort instance can add a `Student` to the `List` of students.
1. A Cohort instance can get the list of students.

#### Bonus

- Go ahead and try to add the rest of the `CRUD` tests and functionality, write the methods for `updateGrade()` and `deleteGrade()` in the `Student` class.