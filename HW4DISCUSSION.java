
public class HW4DISCUSSION {
	public static void main(String[] args) {
	ArrayBag<String> animalBag=new ArrayBag<String>();
	animalBag.add("ant"); // The numberOfEntries is 1; The bag has "ant";
	animalBag.add("cat"); // The numberOfEntries is 2; The bag has "ant", "cat";
	animalBag.add("dog"); // The numberOfEntries is 3; The bag has "ant", "cat", "dog";
	animalBag.add("cat"); // The numberOfEntries is 4; The bag has "ant", "cat",  "dog", "cat"; 
	animalBag.add("fish"); // The numberOfEntries is 5; The bag has "ant", "cat",  "dog", "cat", "fish";
	animalBag.add("oxen"); // The numberOfEntries is 6; The bag has "ant", "cat",  "dog", "cat", "fish", "oxen";
	animalBag.add("giraffe"); // The numberOfEntries is 7; The bag has "ant", "cat",  "dog", "cat", "fish", "oxen","giraffe";
	System.out.println(animalBag.remove("giraffe")); // true, The numberOfEntries is 6; The bag has "ant", "cat",  "dog", "cat", "fish", "oxen";
	System.out.println(animalBag.remove("ant")); //true, The numberOfEntries is 5; The bag has "cat",  "dog", "cat", "fish", "oxen";
	System.out.println(animalBag.remove("cat")); //true, The numberOfEntries is 4; The bag has "dog", "cat", "fish", "oxen";
	System.out.println(animalBag.remove("oxen"));//true, The numberOfEntries is 3; The bag has "dog", "cat", "fish";
	animalBag.clear(); //Now, the bag is empty.The numberOfEntries is 0; 
	}
}
