# Assignment 1 SOFE3650U
This Repo is for Class SOFE3650U, Assignment 1.
Done by Group 2.

# Setup and Install
> [!IMPORTANT]
> These commands below will allow you to run this code on
> your linux distro given you have java installed.

```
mkdir YourDirectoryName

cd YourDirectoryName

git clone https://github.com/JulianoF/Assignment_1_SOFE3650U.git

cd Assignment_1_SOFE3650U/Assignment_1_SOFE3650/src/main/java

javac -classpath -sourcepath TestPackage/Assignment_1_SOFE3650.java MainPackage/*.java

java TestPackage/Assignment_1_SOFE3650
```

# Structure of Repo (Assignment_1_SOFE3650 Wrapper Folder)
- Directory src/main/java: Contains Packages and Java Files
	- MainPackage : Contains all interfaces and relevant factory classses
		- Apple.java : Creates an apple class implementing the GroceryProduct 
		- AppleFactory.java : Creates an AppleFactory implementing the GroceryProductFactory
		- Banana.java : Creates a Banana class implementing the GroceryProduct 
		- BananaFactory.java : Create a BananaFactory implementing the GroceryProductFactory
		- GroceryProduct.java : An interface with getter and setters for product names, and price
		- GroceryProductFactory.java : An interface with an Apple and Banana objects calling each respective factory
	- TestPackage : Contains main class for testing factory classes
		-Assignment_1_SOFE3650.java : Create implementations of Apple and Banana factories and products.
	- ProductList.txt : Contains a list of Fruit and their price
- ProductList.txt : Contains a list of Fruit and their price
- pom.xml : Project Configuration File, Used by Maven to build the project
> [!NOTE]
> ProductList.txt appears twice to allow for seemless running on either linux or windows.
# Test Method Execution Snippets

![Alt text](/MainDriverJavaCode.jpg?raw=true "Main Java Code")

![Alt text](/TestRun.jpg?raw=true "Run From Following Steps")
