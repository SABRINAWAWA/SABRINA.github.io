package HW3;

import java.util.List;

public class Tester1 {
	public static int lastPosition(List<String> wordList, String target) {
		int position=wordList.size();
		int size=wordList.size();
		for (int i=0; i<=size;i++) {
			if (wordList.get(i).equals(target)) {
				i=position;
			}
		}
		return position;
	}
}
