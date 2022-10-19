## Builder Patten

- most commonly used when we have too many arguments for a constructor
- or creating an object requires multiple steps 
- e.g User class, requiring a List<Roles>, Set<Permissions> where these need be initialized first before building the object
- examples in Java : String Builder (not 100%), Calender.Builder
- Gof (gang of four) states that builder has potential to build different representations of product interfaces using same steps
- which StringBuilder does not conform with


- for type inner static class
- we would generally mark the setter methods as private but use it withing the class during the **build()** process
- however, lombok uses the **allArgsConstructor** during the **build()** process

## Advantages
- we can work with complex constructor
- we can create a builder as separate class and so it can work with legacy code

## PitFalls
- new Java devs can find it difficult to understand method chaining
- possibility of partially initialized object
- for cases where some fields are mandatory, we can provide sensible defaults or throw an exception