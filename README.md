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

The [Kitchen class](/src/main/java/Kitchen.java) that we will be testing, already has a lot of functionality done for us, during our process we will test every single method and might find some opportunities to improve and refactor the code.

### Assertions

Having the following `Calculator.java` class that calculates the total sum of every number in a expression that looks like: `5+8+10`, we can start to test our code.

```java
public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
```

### @Test annotation

The `@Test` annotation tells JUnit that the `public void` method to which it is attached can be run as a test case. To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method. Any exceptions thrown by the test will be reported by JUnit as a failure. If no exceptions are thrown, the test is assumed to have succeeded.

The `CalculatorTest.java` class, should be created in the following directory `src/test/java/` and java class would look like this:

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
```

### @Before annotation

When writing tests, it is common to find that several tests need similar objects created before they can run. Annotating a public void method with `@Before` causes that method to be run before the Test method. The `@Before` methods of superclasses will be run before those of the current class.

Here is a simple example:

```java
public class Example {
    List empty;
    
    @Before 
    public void initialize() {
       empty = new ArrayList();
    }
    
    @Test public void size() {
       //...
    }
    
    @Test public void remove() {
       //...
    }
 }
```

### Further reading

- [List of assertions with examples](https://github.com/junit-team/junit4/wiki/Assertions)
- [Wiki](https://github.com/junit-team/junit4/wiki)
