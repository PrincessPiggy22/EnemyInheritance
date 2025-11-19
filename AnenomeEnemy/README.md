# Reflection Questions (Answer in Comments)
### Why can’t you instantiate the Enemy class?
Because it's abstracted, you can't directly make an Enemy, but you can make it's child.
### What would happen if a subclass did not implement update() or attack()?
There would be an error, update and attack were never defined in Enemy, so it needed to in the children.
### How does using Enemy[] demonstrate polymorphism?
Enemy has 'many forms' being Slime, Dragon and Skeleton
### Why is it helpful for Enemy to have a concrete method like takeDamage()?
Because all the children takeDamage the same way, so there isn't a need to continuosly make it in each child.
### Could this design be implemented using interfaces alone? Why or why not?
No, the parent could be an interface, but not all of them. As interfaces can only define methods, but can't have them do anything.
