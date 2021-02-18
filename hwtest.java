import java.awt.List;
import java.util.Arrays;

public class hwtest {
	public static void main(String[] args) {
		/*System.out.println(methodA(4));
		System.out.println(methodA(0));
		System.out.println(methodA(-3));
		System.out.println(methodB("eieio",'e'));
		System.out.println(methodB("hello there",'h'));
		
		System.out.println(countEvens(new int[] { 1, 2, 3, 4, 5 ,6}));
		*/
		System.out.println(method1(13));
		System.out.println(method2(13));
		System.out.println(countZeros(new int[] { 0,0,0,0,1, 2, 3, 4, 5 }));
	}
	
	public static int countZeros(int[] array) {
		 return countZerosHelper(array, 0, array.length, 0);
		}

		private static int countZerosHelper(int[] array, int start, int stop, int count) {
		 if(start < stop) {
		 if(array[start] == 0) {
		 count++;
		 }
		 countZerosHelper(array, start+1, stop, count);
		 }
		 return count;
		}
	
	public static int countOdds(int[] array) {
		   return countOddsHelper(array, 0, array.length);
		}

		private static int countOddsHelper(int[] array, int start, int stop) {
		   int count = 0;
		   if(start < stop) {
		      if(array[start] % 2 == 1) {
		         count++;
		      }
		     countOddsHelper(array, start+1, stop);
		   }
		    return count;
		}
	
	public static int methodA(int n) {
		   if(n==0) {
		      return 0;
		   } else if(n>0) {
		      return 1 + methodA(n-1);
		   } else {
		      return 1 + methodA(n+1);
		   }
		}
	public static int methodB(String s, char c) {
		   if(s.length()==0) {
		      return 0;
		   } else {
		      return (s.charAt(0)==c ? 1 : 0) + methodB(s.substring(1), c);
		   }
		}
	
	public static int countEvens(int[] array) {
		   return countEvensHelper(array, 0, array.length);
		}

		private static int countEvensHelper(int[] array, int start, int stop) {
		   int count = 0;
		   if(start==stop) {
		      return count;
		   } else {
		      if(array[start] % 2 == 0) {
		         count = 1 + countEvensHelper(array, start+1, stop);
		      }
		      return count;
		   }
		}
		
		public static void recMethod(int[] array, int start, int end) {
			if(start<end){
			System.out.println(Arrays.toString(array));
			      array[start]=array[start]*2;
			     
			      recMethod(array, start+1, end);

			      System.out.println(Arrays.toString(array));

			   } else {
			      System.out.println( "done");
			   }
			}
		public static void recMethod(Node firstNode) {
			Node currentNode= firstNode;   
			while(currentNode!=null) {
				System.out.println(currentNode.data);
				currentNode=currentNode.next;
			}
			   if(firstNode.next!=null) {
			      firstNode.data=10000;
			      recMethod(firstNode.next.next);
			   } else {
			      System.out.println( "done");
			   }
			   Node afterNode=firstNode;
			   while(afterNode!=null) {
					System.out.println(afterNode.data);
					afterNode=afterNode.next;
				}
			}
		public static int infiniteRecursion(int n) {
			   if (n > 0) {
			      return infiniteRecursion(n)   -  2;
			   } else {
			      return 0;
			   }
			}
		public static int method1(int x) {
			   if (x > 0) {
			      return method1(--x) + 1;
			   } else {
			      return 0; 
			   }
			}

			public static  int method2(int x) {
			   if (x <= 0) {
			      return 0; 
			   } else {
			      return 1 + method2(--x);
			   }
			}
}
