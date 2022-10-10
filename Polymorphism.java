package pgm;


class Animal
{
	void noise()
	{
		System.out.println("some noise");
	}
}

class Cat extends Animal
{
	void noise()
	{
		System.out.println("The cat noise is mew mew..");
	}
}

class Dog extends Animal
{
	void noise()
	{
		System.out.println("The dog noise is bow bow..");
	}
}

class Snake extends Animal
{
	void noise()
	{
		System.out.println("The snake noise is buzz buzz..");
	}
}

class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}


public class Polymorphism {
	
	public static void main(String[] args) {
		Animal a=new Animal();
		Cat c=new Cat();
		Dog d=new Dog();
		Snake s=new Snake();
		
		Stimulator.ansim(c);
		Stimulator.ansim(d);
		Stimulator.ansim(s);

	}

}
