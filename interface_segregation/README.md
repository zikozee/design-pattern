# Interface Segregation
- Client do not have to depend on interface they don't use
- break down interfaces into smaller and relatable chunks so you implement only what you need

- orderpersistence is implementing persistence
- but order persistence does not have a name attribute
- hence the find by name is useless

- solution -
- break up the interfaces and only implement what you need