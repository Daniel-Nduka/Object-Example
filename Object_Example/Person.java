
public class Person {
	// 3 attributes String and age and a Person attribute for children
	private String name;
	private int age;
	private Person[] children = new Person[3];
	private int childrenCounter = 0;
	
	//the constructor
	public Person(String s, int a) {
		this.name = s;
		this.age = a;
	}
	// the method
	//a method to check first check if the method is a person and then compare the ages
	public boolean equals(Object o) {
		//first check type
		if(!(o instanceof Person)) {
			return false;
		}
		else {
			Person other = (Person)o;
			if(age == other.getAge()) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	//method to add children to the person object
	public void addChildren(Person kids) {
		
		if (childrenCounter >= 3) {
			//Increase the length of the array
			int currentLength = children.length;
			int newLength = currentLength + 10;
			Person[] moreKids = new Person[newLength];
			
			//copy kids into morekids
			for(int i = 0; i < currentLength; i++) {
				moreKids[i] = children[i];
			}
			// reset reference 
			children = moreKids;
		}
		children[childrenCounter] = kids;
		childrenCounter++;
		 
	}
	
	public String toString() {
		String line =  "my name is " + name + " My age is " + age;
		for (int i = 0; i < childrenCounter; i++) {
			line = line + "(" + children[i].getName() + ", " + children[i].getAge() + ")";
		}
		return line;
		
	}
	
	
	//Getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person[] getChildren() {
		return children;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	
}
