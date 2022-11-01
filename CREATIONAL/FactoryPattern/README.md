## Factory Pattern
- We want to move object creation logic from our code to a separate class
- 
- we use this patten when we do not know in advance which class we may need to instantiate beforehand & also to allow 
- - new classes to be added to system and handle creation without affecting client code
- 
- we let subclasses decide which object to instantiate by overriding the factory method (base class or  interface)


## PitFalls
- More complex to implement. More classes are involved and need unit testing
- You have to start with Factory method design pattern from the beginning.
- - it's not easy to refactor existing code into factory method pattern
- Sometimes this pattern forces you to subclass just to create appropriate instance