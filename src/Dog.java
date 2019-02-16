
public class Dog {
	String name; // instance variable
	int nrofpuppies; // instance variable

	public static void main(String args[]) {
		Dog father = new Dog();
		father.name = "Max";
		father.nrofpuppies = 1; // set variable
		// read variable
		System.out.println(father.name + "has" + father.nrofpuppies + "puppies");

	}
}
