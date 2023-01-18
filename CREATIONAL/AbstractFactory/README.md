# Abstract Factory

- Abstract factory is used when we have two or more objects which work together forming a kit or set
- Separate client code from concrete objects forming such a set and also from the code that creates the set

- this helps helps control nested if-else
- as it groups things to be created or instantiated together
- abstract factory uses factory-design pattern

# Implementation Considerations
- Factories can be implemented as singletons, we typically ever need only one instance
- Adding a new product type (e.g network) requires changes to the base factory as well as all implementation of factory
- We provide the client code with concrete factory so that it can create the objects.


# Design Considerations
- When you want to **constrain objects creation** so that they all work together
- Abstract factory uses factory method pattern
- If objects are expensive to create then you can transparently switch factory implementations to use prototype design pattern


# Difference from Factory Method
- Abstract Factory                         |                   Factory Method
  --------------------------------------------------------------------------------
- - Hides factories as well as concrete    |    - Hides the concrete objects which are used from the client code
-  objects used from client code           |
- 
-  suitable when multiple objects are      |    concerned with on product and its sub classes
- designed to work together





# Pit Falls
- A lot more complex to implement than factory method
- Adding a new product requires changes to the base factory as well as ALL implementations of factory
- Difficult to visualize the need at start of development and usually starts out as afactory method
- Abstract factory design pattern is very specific to the problem of "product families"