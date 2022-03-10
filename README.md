# Cark Park System (Java)
 
#1. Analysis & Specification
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

# The Design

The two core classes for the system is registeredCar and parkedCar
  - registeredCar & parkedCar -> these classes will store data inputed by the users into a collection class as an array list.

## Instance 

The instance of the registeredCar class and instance of parkedCar will be held in seprate class collections, registeredCarList and parkedCarList;
  - Both collection classes are stored in a Array HashMap -> This is because if users have similar name it can be stored and also be sorted with a unique ID.
The report class within the Main Menu class will hold both of the collection classes along with a class to see reports.

## UML(Unified Modeling Language) Diagram
![image](https://user-images.githubusercontent.com/77361838/157608715-84a8d5ab-2dbb-4967-ab97-aded34a515f3.png)
