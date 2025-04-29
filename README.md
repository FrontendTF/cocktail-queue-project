# cocktail-queue-project

## Description

The program allows you to create various cocktails with an arbitrary number of ingredients that you can choose.This project focuses on logic validation through unit testing and documentation generation — it is not intended as a runnable application.

## Installation & Requirements

To get working on the project you need to clone the repository. To clone you can simply copy the repository URL and type the following command into your terminal.

```bash
git clone https://github.com/MarkusRossmannFHJ/cocktail-queue-project.git
```

The program is written in Java and therefore requires a JDK. The following link takes you to the download page for JDKs.
[www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)

 **Note:** The java version used for this project is 21.0.4 2024-07-16 LTS

## How to run the **Build**,**Test** and **Document**

### -1

**Note:** Make sure you are on the correct working directory. To navigate to your desired directory you can use the following command:

```bash
cd <your-path>/cocktail-queue-project
```

### -2

Build the project and run tests:

```bash
mvn clean install
mvn test
```

### -3

```bash
mvn site
```

The generated documentation will be available under: target/site/index.html

## Contributing

It is highly appreciated to add more features to the program.

Please make sure additional features are tested thoroughly.

## Contact

If there is anything you want to discuss about the program or
further elaboration feel free to contact us via mail.
[foo.bar[at]fhj.com](mailto:foo.bar@fhj.com)

## License

[FHJ](https://www.fh-joanneum.at/)

## Contributors

Thomas Feyerl – Markus Rossmann

We are currently studying **Mobile Software Development** at FH Joanneum in our second semester.

## task list

### Feyerl

- [x] add developer info in pom.xml
- [x] fix existing bugs
- [x] create DrinkQueue class and methods
- [x] write tests
- [x] create maven site
- [x] write JavaDoc for classes and methods
- [x] check final README.md

### Rossmann

- [x] write this README
- [x] create maven project
- [x] extent pom.xml
- [x] create Cocktail class
- [x] add methods in DrinkQueue class
- [x] write tests
- [x] write JavaDoc for classes and methods

### Links

#### Our GitHub profiles

[GitHub Feyerl](https://github.com/FrontendTF)

[GitHub Rossmann](https://github.com/MarkusRossmannFHJ)