package HW3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
	/*	ListInterface<String> wordList = new AList<>();
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("carrot"); 
		wordList.add("watermelon");
		for(int i=1; i<=wordList.getLength(); i++) {
		     wordList.remove(i);
		}
		System.out.println(wordList.isEmpty());
		
		wordList.add("sun");
		wordList.add("tree");
		wordList.add("bird"); 
		wordList.add("ocean");
		for(int i=0; i<wordList.getLength(); i++) {
		     System.out.println(wordList.getEntry(i));
		}
		
		wordList.add("car");
		wordList.add("boat");
		wordList.add("plane"); 
		wordList.clear(); 
		System.out.println(wordList.isEmpty());
		
		wordList.add("sun");
		wordList.add("tree");
		wordList.add("bird"); 
		wordList.add("ocean");
		System.out.println(wordList.contains("snow"));
		
		wordList.add("sun");
		wordList.add("tree");
		wordList.add("bird"); 
		wordList.add("ocean");
		System.out.println(wordList.contains("bird"));
		
		wordList.add("car");
		wordList.add("boat");
		wordList.add("plane"); 
		System.out.println(wordList.replace(4, "train"));
		
		wordList.add("car");
		wordList.add("boat");
		wordList.add("plane"); 
		System.out.println(wordList.replace(2, "train"));
		
		wordList.add("car");
		wordList.add("boat");
		wordList.add("plane"); 
		wordList.add("car");
		wordList.add("bike");
		wordList.remove(2);
		System.out.println(wordList.getLength());
		
		wordList.add("house");
		wordList.add("yard");
		wordList.add("car"); 
		wordList.add("street");
		System.out.println(wordList.remove(5));
		
		wordList.add("house");
		wordList.add("yard");
		wordList.add("car"); 
		wordList.add("street");
		System.out.println(wordList.remove(2));
		
		wordList.add("adriana");
		wordList.add("bob");
		wordList.add("frank"); 
		wordList.add("edna");
		System.out.println(wordList.getEntry(0));
		
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("cat"); 
		wordList.add(2, "dog");
		System.out.println(wordList.getEntry(3));
		
		wordList.add("adriana");
		wordList.add("bob");
		wordList.add("frank"); 
		wordList.add("edna");
		System.out.println(wordList.getEntry(2));
		
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("cat"); 
		wordList.add(2, "dog");
		System.out.println(wordList.getLength());
		*/
		
		
		/*BagInterface<String> wordBag = new ArrayBag<>();
		boolean actualResult = isSet(wordBag);
		System.out.println("1: "+actualResult);
		
		wordBag.add("hi");
		boolean actualResult1 = isSet(wordBag);
		System.out.println("2: "+actualResult1);
		
		wordBag.add("HI");			wordBag.add("hello");
		boolean actualResult2 = isSet(wordBag);
		System.out.println("3: "+actualResult2);
		
		wordBag.clear();
		wordBag.add("a");			wordBag.add("b");		wordBag.add("d");
		wordBag.add("e");			wordBag.add("c");		wordBag.add("c");
		boolean actualResult4 = isSet(wordBag);
		System.out.println("4: "+actualResult4);
		
		wordBag.clear();
		wordBag.add("HI");			wordBag.add("hello"); wordBag.add("HI");
		boolean actualResult5 = isSet(wordBag);
		System.out.println("5: "+actualResult5);*/
		
		/*
		BagInterface<String> wordBag = new ArrayBag<>();
		wordBag.add("bird");
		wordBag.add("tree");
		wordBag.add("dog"); 
		while(!wordBag.isEmpty()) {     
		     wordBag.remove("cat"); 
		}
		
		wordBag.add("bird");
		wordBag.add("tree");
		wordBag.add("bird"); 
		while(wordBag.contains("bird")) {     
		     wordBag.remove("bird"); 
		}
		
		wordBag.add("apple");
		wordBag.add("banana");
		wordBag.clear();
		System.out.println(wordBag.remove());
		
		wordBag.add("apple");
		wordBag.add("banana");
		wordBag.add("cat");
		wordBag.add("frog");
		System.out.println(wordBag.remove("melon"));
		
		wordBag.add("apple");
		wordBag.add("banana");
		wordBag.add("cat");
		wordBag.add("frog");
		System.out.println(wordBag.remove("banana"));

		wordBag.add("apple");
		wordBag.add("dog");
		wordBag.add("cat");
		wordBag.add("banana");
		System.out.println(wordBag.remove());
		
		wordBag.add("apple");
		wordBag.add("frog");
		wordBag.add("banana");
		wordBag.add("frog");
		wordBag.add("elephant"); 
		System.out.println(wordBag.getFrequencyOf("giraffe"));
		
		wordBag.add("apple");
		wordBag.add("dog");
		wordBag.add("cat");
		wordBag.add("banana");
		System.out.println(wordBag.contains("cat"));
		
		wordBag.add("apple");
		wordBag.add("frog");
		wordBag.add("banana");
		wordBag.add("frog");
		wordBag.add("elephant"); 
		System.out.println(wordBag.getFrequencyOf("frog"));
		
		wordBag.add("apple");
		wordBag.add("banana");
		wordBag.add("apple");
		wordBag.add("cat"); 
		wordBag.remove("apple");
		System.out.println(wordBag.getCurrentSize());
		
		wordBag.add("apple");
		wordBag.add("banana");
		wordBag.add("dog");
		wordBag.add("cat"); 
		System.out.println(wordBag.getCurrentSize());
		
		List<String> wordList=new ArrayList<String> ();
		wordList.add("sun");
		wordList.add("tree");
		wordList.add("bird"); 
		wordList.add("ocean");
		for(int i=0; i<wordList.size(); i++) {
		     System.out.println(wordList.get(i));
		}
		
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("cat"); 
		wordList.add(2, "dog");
		System.out.println(wordList.size());
		
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("cat"); 
		wordList.add(2, "dog");
		System.out.println(wordList.get(3));
		
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("cat"); 
		wordList.add("dog");
		System.out.println(wordList.get(4));
		
		wordList.add("house");
		wordList.add("yard");
		wordList.add("car"); 
		wordList.add("street");
		System.out.println(wordList.remove(2));
		
		wordList.add("house");
		wordList.add("yard");
		wordList.add("car"); 
		wordList.add("street");
		System.out.println(wordList.remove(6));
		
		wordList.add("car");
		wordList.add("boat");
		wordList.add("plane"); 
		System.out.println(wordList.set(2, "train"));
		
		wordList.add("car");
		wordList.add("boat");
		wordList.add("plane"); 
		System.out.println(wordList.set(6, "train"));
		
		wordList.add("sun");
		wordList.add("tree");
		wordList.add("bird"); 
		wordList.add("ocean");
		for(String word : wordList) { 
		     System.out.println(word);
		}
		
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("carrot"); 
		wordList.add("watermelon");
		for(int i=0; i<wordList.size(); i++) {
		     wordList.remove(i);
		}
		System.out.println(wordList.isEmpty());*/
		ListInterface<String> wordList = new AList<>();
		wordList.add("apple"); 	
		wordList.add("anna"); 	
		wordList.add("bob"); 
		wordList.add("ANIMAL");
		wordList.add("canal"); 	
		wordList.add("frog");
		wordList.add("cat"); 	
		ListInterface<String> resultList = createListContainingChar(wordList, "a");
		Object[] resultListArray = resultList.toArray();
		System.out.println("\t   Returned list created:  "  + Arrays.toString(resultListArray));
		
	}

	public static ListInterface<String> createListContainingChar(ListInterface<String> wordList, String key) {
		 ListInterface<String> list = new AList<String>();
		   for (int i = 1; i <= wordList.getLength(); i++) {
		        String str = wordList.getEntry(i);
		        if (str.contains(String.valueOf(key))) {
		             list.add(str);
		        }
		    }
		    return list;
	}

	private static boolean isSet(BagInterface<String> wordBag) {
		boolean bagIsSet=false;
		Integer size=wordBag.getCurrentSize();
		BagInterface<String> tempBag=new ArrayBag<> ();
		ArrayList<String> newWordBag=new ArrayList<> ();
		
		while(!wordBag.isEmpty()) {
			String addToArray=wordBag.remove();
			newWordBag.add(addToArray);
			tempBag.add(addToArray);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(newWordBag.get(i));
		}
		
		if(newWordBag.size()==0||newWordBag.size()==1){
			bagIsSet=true;
			}else {
				for (int i = 0; i < size; i++) { 
					for (int j = i + 1 ; j < size; j++) { 
						if (newWordBag.get(i).equals(newWordBag.get(j))) { 
							bagIsSet=false;
						}else {
							bagIsSet=true;
						}
					}
				}
			}
		
		while (!tempBag.isEmpty()){
			wordBag.add(tempBag.remove());
		}
		
		return bagIsSet;
	}
}
