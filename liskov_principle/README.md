# LISKOV PRINCIPLE

-  A form of polymorphism using the is-A  association
- Child Extending a parent, is also same as that parent
- hence passing in the child where the parent is expected should not break anything

- however since width of a square is not necessarily same as width of rectangle,
- this principle is violated

## To RECTIFY,
- we create an interface   **which we call shape**
- this way **rectangle** and **square** implements shape
- this way the is not direct relationship between, rectangle and square

## to run pass -ea to the VM-OPTIONS