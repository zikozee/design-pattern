Prototype

- We have a complex object that is costly to create (performance, calculations, external resources outside our control)

- To create more instance of subclass we use an existing instance as our prototype

- Prototype will allow us to reate copies of existing object & save us from having to recreate objects from scratch

- in java the every object has  protected method called **clone()** (which what we are looking for)



Implementation
================
- The class must implement Cloneable interface

- Class should override clone method and return copy of itself.

- The method should declare CloneNotSupportedException in throws clause to give subclasses chance to decide
whether to support cloning


Clone method implementation should consider the deep & shallow copy and choose whichever is applicable

**Shallow Copy** >>> copy object properties into new object
**Deep Copy** >>> we will create all the bject that are needed by our prototype object


Implementation Considerations
============================
pay attention to the deep copy and shallow copy of references.
Immutable fields on clones save the trouble of deep copy

Make sure to reset the mutable state of object before returning  the prototype
Its a good idea to implement this in method to allow subclasses to initialize themselves

clone() method is protected in Object class and must be overridden to be public to be callable from outside the class