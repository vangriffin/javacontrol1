package selectSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		 // An unsorted array
	    Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

	    // Sort using selection sort
	    selectionSort(array, 0, array.length);

	    // Verify sorted array
	    System.out.println(Arrays.toString(array));
	  }

	  @SuppressWarnings({ "rawtypes", "unchecked" })
	  public static void selectionSort(Object[] array, int fromIndex, int toIndex) {
	    Object item;
	    for (int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) {
	      int indexToMove = currentIndex;
	      for (int tempIndexInLoop = currentIndex
	          + 1; tempIndexInLoop < toIndex; tempIndexInLoop++) {
	        if (((Comparable) array[indexToMove]).compareTo(array[tempIndexInLoop]) > 0) {
	          // Swapping
	          indexToMove = tempIndexInLoop;
	        }
	      }
	      item = array[currentIndex];
	      array[currentIndex] = array[indexToMove];
	      array[indexToMove] = item;
	    }
	  }

	}
	}

}
