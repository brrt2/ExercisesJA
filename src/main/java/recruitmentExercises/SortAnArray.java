package recruitmentExercises;

import java.util.Arrays;

public class SortAnArray {

  public static void main(String[] args) {

    int[] arrayToSort = {1, 45, 2, 3, 0, 12, 4, 2, 54, 43, 32, 43, 3, 5, 53, 11, 4};

    int[] sortedArray = sortWithBubbleSort(arrayToSort);
    System.out.println(Arrays.toString(sortedArray));


    int[] sortedArray1 = sortWithSelectionSort(arrayToSort);
    System.out.println(Arrays.toString(sortedArray1));

    int[] sortedArray2 = sortWithInsertionSort(arrayToSort);
    System.out.println(Arrays.toString(sortedArray2));

  }

  private static int[] sortWithBubbleSort(int[] arrayToSort) {

    for (int i = arrayToSort.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arrayToSort[j] > arrayToSort[j + 1]) {
          int temp = arrayToSort[j];
          arrayToSort[j] = arrayToSort[j + 1];
          arrayToSort[j + 1] = temp;
        }
      }
    }
    return arrayToSort;
  }


  private static int[] sortWithSelectionSort(int[] arrayToSort){

    for(int x=0; x < arrayToSort.length; x++){
      int minimum = x;

      for(int y=x; y < arrayToSort.length; y++){

        if(arrayToSort[minimum] > arrayToSort[y]){
          minimum = y;
        }
      }

      int temp = arrayToSort[x];
      arrayToSort[x] = arrayToSort[minimum];
      arrayToSort[minimum] = temp;
    }
    return arrayToSort;
  }

  private static int[] sortWithInsertionSort(int[] arrayToSort) {

    int j,key;

    for (int i = 1; i < arrayToSort.length; i++) {
    key = arrayToSort[i];
    j = i-1;

      while(j >= 0 && key < arrayToSort[j]) {
        int temp = arrayToSort[j];
        arrayToSort[j] = arrayToSort[j+1];
        arrayToSort[j+1] = temp;
      }
    }

    return arrayToSort;
  }








}
