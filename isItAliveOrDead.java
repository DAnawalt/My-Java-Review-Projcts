package easyprojects;

/* Line 9 and/or 10: modify both instances of "name" to be self.name and output the results.*/

public class Human {
	public String name;
	
	public Human(String inputName) {
		name = inputName;
	}
	public void sayName(String name) {
		System.out.println(name);
	}
	public static void main(String args[]) {
		Human vodooZombie = new Human("Dead");
		vodooZombie.sayName("Actually alive baaabbyyyy!");
	}
}
