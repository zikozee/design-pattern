# Simple Factory
- we move the instantiation logic to a separate class and most commonly to a static method of this class
- its not considered as a design pattern as its simply a method that encapsulates object instantiation
- Different from Factory Pattern
- Used when we have more than one option when instantiating object and a simple logic is used to choose correct class
- simply an argument is used to determine object to be instantiated
- see **PostFactory class**

## Example
    - java.text.NumberFormat


## Difference Between SimpleFactory and Factory Method
- We simply move our instantiation logic to a static method     -----   Factory method is used when you want to delegate object creation to subclasses
- know about all the classes whose object it can create   ---- we don't know in advance all product subclasses


## PitFalls
- the criteria used to create object can become convoluted/complex over time
- when this happens, its a good indicator to use factory patterns
