# Cark Park System (Java)
 
# 1. Analysis & Specification
- Implement a car parking system that records which cars are currently parked in the car park. 
- Only registered cars must be allowed to enter the car park so the system must be able to keep a list of authorized vechiles (name of the owners) as well as thoose actually parked at the particular time.

The system must be able to provide a series of reports, for example indication whether or not the car park is full, displaying lists of registered vechiles and those parked.

## Requirement Specification for Car parking system
1. Records of the vechile:
  - Is the vechile register -> if so that means the user is authorized for parking
  - Is the vechile not registered -> if so then that means the user can sign up or cannot be aloud to park
2. System can keep a list of cars parked (This is to see if the car park is full or not)
3. System should provide a series of reports:
  - List of registered vechiles
  - List of parked cars currently at the time

# 2. The Design

The two core classes for the system is registeredCar and parkedCar
  - registeredCar & parkedCar -> these classes will store data inputed by the users into a collection class as an array list.

## Instance 

The instance of the registeredCar class and instance of parkedCar will be held in seprate class collections, registeredCarList and parkedCarList;
  - Both collection classes are stored in a Array set Data Structure (Will be explained why in 3.2) -> This is because if users have similar name it can be stored and also be sorted with a unique ID.
The report class within the Main Menu class will hold both of the collection classes along with a class to see reports.

## UML (Unified Modeling Language) Diagram
![image](https://user-images.githubusercontent.com/77361838/157608715-84a8d5ab-2dbb-4967-ab97-aded34a515f3.png)

# 3.1 Implementing the <i>parkedCar</i> Class

The programming language we are using to implement this deisgn is Java, the object oriented language allows us access too concepts including abstraction, encapsulation, inheritance and polymorphism which will later be shown, we will also head into GUI (Graphical User Interface) using JavaFX and also Java Data Structure such as List, Set, Queue and HashMap.
So throughout the implementation;
  - Throughout this case study we will be using the <code>Javadoc</code> style of comments which will document our classes.
  - The code for the <code>parkedCar</code> Class is shown below:
 
 ![image](https://user-images.githubusercontent.com/77361838/157614216-c56b593d-7d64-498e-b2e6-376a1ec697eb.png)
 
 As you can see, this is quite simple and does not require mcuh explaination, however we did override the toString method to provide a way to print parkedCar object.
 
 ![image](https://user-images.githubusercontent.com/77361838/157614445-f8d5dbb5-8026-41f3-8ff2-44a6d28e568e.png)

Before we embed this into a larger program we need to test this first too see if it works and is working reliably so we do some <code>Unit Tesing</code>.

To start this we implement a separate file and create a class specifically for testing the class we want too. Inside the test class will contain a main method that will act as a <code>Driver</code> for the class we are tesing, in this instance the <code>parkedCar</code> class.
We create and object which then allows us to test and call in the methods, when we are tesing the class by generating objects and calling method, we wanted to display the result on the screen such as data stored inside the object, we can access the data by calling the appropriate methods.

![image](https://user-images.githubusercontent.com/77361838/157619513-7330e33f-ed12-470d-b5ef-290525b37eef.png)

This will display the expected output:<br>
<code>Name: Manjil</code><br>
<code>ID: 1</code><br>
<code>Registerd: Car is registered in the system</code><br>
<code>(The car owner Manjil, 1, Car is registered in the system)</code><br>

## 3.2 The <code>parkedCarList</code> Class

When making a collection class we must think of the most suitable, for <code>parkedCarList</code> the most suitable was set (specifically HashSet) and heres why:

  - There is no specific order of the elements(Cars).
  - Each car can be in the parking only once.
  - Set doesnt allow duplication so users with same ID cannot enter at the same time, removes confusion, tresspassing and identity theft.
Here some reasons why other Java Data strucutres such as List, Queue and Stack are not required here:
  - List: Ordering of elements is not userful here and duplication ignores the principles above.
  - Queue: Next element to be deleted is not necessarily the first that has been added.
  - Stack: Next element to be deleted is typicaly not the last that has been added.

More specifically we will be using HashSet and heres why:
  - HashSet stores the elements using a mechanism called <code>hashing</code>.
  - HashSet contains unique elements only, allows us to prevent duplicates more easily, how, because it will give unique a key that will hold as its unique identifier.
  - HashSet allows null values, this means we can insert null values even to index values with no object.

For our <code>parkedCarList</code> we also inclded a constant MAX allowing us to record a maximum number of records we would like in our set data strucuture, As max is a constant type its a <code>+</code> symbol given public visibility. 

As well as a constructor, there are methods to add new cars, remove them, view full HashSet, view the total and a toString method for an easy of unit testing as its overridden. 
Below there is the code for parkedCarList:

![image](https://user-images.githubusercontent.com/77361838/157635352-5771bac5-6700-48d0-abb7-caed6c9c9145.png)

1. First you must import the Set collection framework from the <code>java.util.*</code>, the <code>*</code> is a selector for all too make things easier, however in production base its better to use just import the required framework to prevent problems with bottle necking. 

![image](https://user-images.githubusercontent.com/77361838/157636031-a5f87210-4774-4ff6-b8b6-fc94048a7283.png)

2. We make a HashSet using the Set to store a collection in the pSet variable. We also want to set our constant value MAX which will be public to record the maximum number of cars to be recorded into the HashSet. 

![image](https://user-images.githubusercontent.com/77361838/157636399-9d30efd6-0e56-424f-9720-e31323d0b0ac.png)

3. Here we initialise the pSet variable and set te value of MAX to a parameter maxIn sent to the constructor. 

![image](https://user-images.githubusercontent.com/77361838/157636658-62fd3a0e-4cbb-4720-a9bc-0f0883727f77.png)

4. To check if the HashSet is at its maximum capacity we place a method capacity which will return a boolean value, if true then the set is full and false if not full using the Set method size() to determine if it is equal to MAX, if it is returns true, if not then false. 

![image](https://user-images.githubusercontent.com/77361838/157637036-45367873-b59c-4163-9cf2-e004f6ff0e25.png)

5. To get the total we will just return a int to the method simply using the same Set method size() giving us a int value of the number of objects inside the HashSet. 

![image](https://user-images.githubusercontent.com/77361838/157637489-ced5ae8e-365d-4212-9b34-d71d7955fe20.png)

6. Here we develop a method that returns a boolean value again, this due to the method add() reutrning either true or false, if its true then the parameter from <code>parkedCar</code> class of userIn will add the following object into the HashSet collection, if false it will not add it to the collection. 

![image](https://user-images.githubusercontent.com/77361838/157638088-4f4d8c5f-a809-455d-9955-d39df72d64af.png)

7. To remove the car from the <code>parkedCarList</code> HashSet collection we create another boolean method, if it returns true then the following object will be removed, if false then it will not. First we must make a parameter which is extended to <code>parkedCar</code> class with the variable being userID, then we create a boolean value to see if the userID given too the parameter is in the HashSet collection, if it is then it will return the findP variable to be true and false if not found in the collection. 
We then initiate a if statement where the condition is that findP is equal to true, if it is true meaning that the ID is inside the collection then it will use the HashSet method remove to delete the object from the collection, if the condition is not equal to true and is false then it will not delete the following object as it doesnt exist in the collection. 

8. We also include a toString method for testing which is overridden so we can print it easily in our test file. 

## 3.3 Testing the <code>parkedCarList</code> Class

It is important to test classes to ensure that they function correctly before moving on to the rest of the implementation on the development. Where parkedCar was a form of unit testing, parkedCarList is an example of integration testing as it working in conjuction with the parkedCar Class, where we test parkedCarList methods. 
Here are some method to test our parkedCarList:
  - limit the size of the class to a small number like 4 using the MAX in the constructor
  - add two parkedCar objects to the set using addCarToPark() method
  - display the HashSet using toString() method to check if its successfully been added
  - check too see if the capacity() method returns false, as there shouldnt be 4, add 4 objects to see if it returns true also
  - display the total number of cars currently parked using getTotal() method
  - add another object too see if the set doesnt add anymore than its max
This test strategy will test if each of the methods in parkedCarList class passes or fails, if pass then its successfull, if fail we find the reason to the failure and debug this.

## 3.4 Test log for parkedCarList Class

The driver for this system will be menu driven program, one possible drive we used developed in order to process the actions given in this tes log: 

![image](https://user-images.githubusercontent.com/77361838/158152312-ec57eafe-9d4b-44cd-bebc-f59f6b5352de.png)

Our EasyScanner class is being used in this tester for ease of scanner system input and keyboard input, this is the output in the terminal when setting a max value to our HashSet;

![image](https://user-images.githubusercontent.com/77361838/158153022-9b961c06-c7e7-435f-b6bd-3a39149e8c80.png)
We input 5 where it will be scored inside our easyscanner variable to be stored as our maximum number of value's permitted.

Similary the output for objects will result in for toString() method;
<code>[(The car owner Manjil, 1, Car is registered in the System)]</code>

When the terminal is outputing unexpected results during the tesing, you should stop and identify the cause of the error in the class that you are testing, documenting the the error and the steps you took to fix it is also important, logging these data can help with maintaining the code and reference to peers when they review your code. 





