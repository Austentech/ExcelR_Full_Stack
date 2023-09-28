class Animal 
{
	static void makeSound()
	{
		System.out.println("Generic Animal Sound");
	}

}

class Dog extends Animal
{
	static void makeSound()
	{
		System.out.println("Bark");
	}
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		Dog dog = new Dog();

		animal.makeSound();
		dog.makeSound();
	}
}
