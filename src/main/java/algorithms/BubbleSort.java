package algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,8,1,15,2,0,34,6,9,2,1};
        int[] sorted = new BubbleSort().bubblePort(arr);

        for(int s : sorted){
            System.out.print(s + " ");
        }
    }

    private int[] bubblePort(int[] toSort) {

        for(int i = toSort.length - 1; i > 0; i --) {

            for (int j = 0; j < i ; j++) {

                if(toSort[j] > toSort[j+1]) {
                    int temp = toSort[j];
                    toSort[j] = toSort[j+1];
                    toSort[j+1] = temp;
                }
            }
        }
        return toSort;
    }
}
