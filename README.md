## BDD = Cucumber-jvm + java + selenium

This is a template application that allows you to start using cucumber-jvm with Java and Selenium to use BDD process in your project.
In the docs folder there is a presentation I made explaining the BDD concepts and the examples you're going to find in this project.
You can run the examples withing Eclipse by using JUnit. Just right-click in the JUnit class, then click Run As -> JUnit Test. If you want 
to use Maven or Ant, read the text bellow.

### Ant

Simply run:

```
ant download
ant runcukes
```

This runs Cucumber features using the Command Line Interface (CLI) runner. Note that the `RunCukes` junit class is not used at all.
If you remove it (and the `cucumber-junit` jar dependency), it will run just the same.

### Maven

Simply run:

```
mvn test
```

This runs Cucumber features using the JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukes` junit class
kicks off Cucumber.
