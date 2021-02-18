
public class ListDequeTester {
	public static void main(String[] args) {
		DequeInterface<String> oneDeque = new ListDeque<String>();
		oneDeque.addToFront("h");
		oneDeque.addToFront("b");
		oneDeque.addToFront("c");
		oneDeque.addToFront("d");
		oneDeque.addToFront("e");
		oneDeque.addToFront("a");
		oneDeque.addToBack("a");
		oneDeque.addToBack("b");
		oneDeque.addToBack("c");
		oneDeque.addToBack("d");
		oneDeque.addToBack("e");
		oneDeque.addToBack("f");
		System.out.println(oneDeque.getFront());
		System.out.println(oneDeque.getBack());
		System.out.println(oneDeque.isEmpty());
		oneDeque.removeBack();
		oneDeque.removeBack();
		oneDeque.removeBack();
		oneDeque.removeBack();
		oneDeque.removeFront();
		oneDeque.removeFront();
		oneDeque.removeFront();
		oneDeque.removeFront();
		oneDeque.clear();
	}
}
