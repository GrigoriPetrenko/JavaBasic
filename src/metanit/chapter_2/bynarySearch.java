public class bynarySearch {
  
  int low;
  int high;
  int mid;
  int guess;
  
  public bynarySearch(int[] list, int item){
   low = 0;
   high = -1;
    
    while (low <= high){
    	mid = (low + high) / 2;
      	guess = list[mid];
      if (guess == item) {
        return mid;
      }
      if (gues > item){
       high = mid -1; 
      }
      else{
        low = high -1;
      }
      return null;
    }
    
  }
 
  public static void main(String[] args){
    int[] myList = {1, 2, 3, 4};
    
   System.out.println(myList, 3); 
   
  }
}

https://www.compilejava.net/
https://github.com/egonSchiele/grokking_algorithms/blob/master/01_introduction_to_algorithms/java/01_binary_search/src/BinarySearch.java
https://www.w3schools.com/java/java_constructors.asp