import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> bingoNumbers = new ArrayList<String>();
		bingoNumbers.add("N32");
		bingoNumbers.add("B7");
		bingoNumbers.add("I26");
		printArrayList(bingoNumbers);
		bingoNumbers.add(1, "G49");
		bingoNumbers.add("N32");
		printArrayList(bingoNumbers);
		String number = bingoNumbers.remove(2);
		System.out.println("Removed " + number);
		printArrayList(bingoNumbers);
		boolean found = bingoNumbers.remove("N32");
		if (found) {
			System.out.println("Removed item");
		} else {
			System.out.println("Item not found");
		}
		printArrayList(bingoNumbers);
		System.out.println(bingoNumbers.indexOf("X77"));
		
	}
	
	public static void printArrayList(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}
}
