# Zadanie2_Patronage

Test automation script prepared by using Selenium, Java, Maven and Chrome.


## Getting Started

  1. Download the repo by clicking Clone-or-Download green button and then by clicking "Download ZIP"
  2. Extract the project from a zip file and remember the path of the folder

### Prerequisites

* **JDK 1.7 or above**

* **Apache Maven 3.5.2** (Maven 3.5.2 is the latest release and recommended version for all users)


### Check if your environment is ready to execute the test

1. Go to the Therminal:
  
  a) check the Java JDK

```
$ java --version
```


In case you don´t have Java installed please go [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html) to download
Remember to set up the JAVA_HOME variable later in your system. Instructions [here] (https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html)

  b) check if Maven is installed:

```
$ mvn --version
```
In case you don't have it installed please download it and follow the instructions of adjusting variables from [here](https://maven.apache.org/download.cgi?Preferred=ftp%3A%2F%2Fmirror.reverse.net%2Fpub%2Fapache%2F)


## Running the test

1. Change the current directory in Terminal for the folder of the project you downloaded from GitHub

```
$ cd path_of_the_project_folder
```

2. Once you've changed the directory, check if POM.xml file is available:

for OS X:
```
$ ls
```
for Windows:
```
$ dir
```

3. Execute:
```
$ mvn clean test
```
## Built With

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - The Java IDE
* [Maven](https://maven.apache.org/) - Dependency Management
* [Selenium](http://www.seleniumhq.org/) - Used to automate browser


## Acknowledgments

* [EvilTester] (https://github.com/eviltester/automateGoogleSearch)
* [Stackoverflow] (https://stackoverflow.com/)
