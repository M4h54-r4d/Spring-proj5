package ir.freeland.collection;

public class Application {

	public static void main(String[] args) {
		ListCreate addToList = new ListCreate();
		System.out.println("add");
		addToList.printPerson(addToList.addPerson());
		System.out.println("remove person whose name is sam");

	}
}