Why can’t you instantiate the Enemy class?
You cannot instantiate the enemy class because it is an abstract class. When you make an abstract class objects cannot be an instance of that class.


What would happen if a subclass did not implement update() or attack()?
You would get an error. The point of an abstract method is that the child classes must implement that method in their class.


How does using Enemy[] demonstrate polymorphism?
Using Enemy[] demonstrates polymorphism because each sub enemy is still a child of Enemy meaning it inherits from that class and can and must use its methods.


Why is it helpful for Enemy to have a concrete method like takeDamage()?
It is helpful for Enemy to have a concrete method like takeDamage() because all of the child classes can use it and it makes things more efficient. You don't have any unique details for take damage so you can easily centralize it with takeDamage();


Could this design be implemented using interfaces alone? Why or why not?
I don't think it's possible to do this using interfaces alone because you would need the sub enemies to be classes so you could create objects with them. And even if you could do it with only interfaces I feel like it would be way more work and would not be efficient.
