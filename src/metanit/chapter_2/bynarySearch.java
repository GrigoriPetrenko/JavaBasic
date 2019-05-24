package metanit.chapter_2;

public class bynarySearch {

    public static class BinarySearch {

        // has to return boxed integer in order to comfort to interface defined in the book
        private static Integer binarySearch(int[] list, int item) {
            int low = 0;
            int high = list.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int guess = list[mid];
                if (guess == item) {
                    return mid;
                }
                if (guess > item) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return null;
        }

        public static void main(String[] args) {
            int[] myList = {1, 3, 5, 7, 9};
    
   System.out.println(binarySearch(myList, 3);
   System.out.println(binarySearch(myList, -1)); // null
  }


//https://www.compilejava.net/
//https://github.com/egonSchiele/grokking_algorithms/blob/master/01_introduction_to_algorithms/java/01_binary_search/src/BinarySearch.java
//https://www.w3schools.com/java/java_constructors.asp