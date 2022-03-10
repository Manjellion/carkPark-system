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
  - Both collection classes are stored in a Array HashMap -> This is because if users have similar name it can be stored and also be sorted with a unique ID.
The report class within the Main Menu class will hold both of the collection classes along with a class to see reports.

## UML (Unified Modeling Language) Diagram
![image](https://user-images.githubusercontent.com/77361838/157608715-84a8d5ab-2dbb-4967-ab97-aded34a515f3.png)

# 3. Implementing the <i>parkedCar</i> Class

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

![image](https://user-images.githubusercontent.com/77361838/157615207-71ba762c-5d2e-4154-9c77-e372ea49f945.png)

This will display the expected output:
<code>Name: Manjil</code>
<code>ID: 1</code>
<code>Registerd: Car is registered in the system</code>
<code>(The car owner Manjil, 1, Car is registered in the system</code>


