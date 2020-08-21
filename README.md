# Project Description

This application is a custom house builder and it assists the user in creating their own houses to be built with custom specifications ranging from the color of the house to whether it has a pool and the number of garages needed.

This application uses the Builder design pattern which consists of a House class to build the house but which is also nested with a HouseBuilder class which has access to the constructor of the House class in order to produce a House object with the required specifications. The Builder method makes it easy for the client to add or remove specifications from the house object they want to create without having to access the constructor of the House class and complicate the process.

This application is very flexible when it comes to adding new possible features to the houses that the client can select from. This is because each feature such as the square footage of the house is just an attribute in the House and the HouseBuilder classes and in order to add more customizations such as whether the house has a fireplace or not, all we have to do is add an attribute.

The application is simple and easy to understand by any programmer since all it consists of is two classes, one nested inside the other. The private constructor of the parent class House is accessed by the builder class in order to simplify the process of creating a complex object of House. 

Unfortunately, one of the downsides of the Builder pattern is the fact that it contains some duplicated code. The upside was providing a way for the client to easily create customizable House objects but the downside is that I had some duplicate code inside the HouseBuilder nested class which I also had inside the House parent class.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


