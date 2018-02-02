package collectionshorstmann;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class FindingTheLargestElement<T extends Comparable> {

  public static void main(String[] args) {

    Integer[] nums = {1, 2, 5, 1, 4, 56, 3, 1, 34, 12, 45, 34, 54, 43};
    List intList = Arrays.asList(nums);
    System.out.println("The largest value in the array : " + new FindingTheLargestElement().findLargestInArray(nums));
    System.out.println("The largest value in the list: " + new FindingTheLargestElement().findLargestInList(intList));
    System.out.println("The largest value in the linked list: " + new FindingTheLargestElement().findLargestInLinkedList(intList));
    System.out.println("The largest value from the generic method: " + new FindingTheLargestElement().max(intList));
  }

  private T findLargestInArray(T[] nums) {

    if (nums.length == 0) {
      throw new IllegalArgumentException();
    }
    T largest = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (largest.compareTo(nums[i]) < 0) {
        largest = nums[i];
      }
    }

    return largest;
  }

  private T findLargestInList(List<T> nums) {

    if (nums.size() == 0) {
      throw new IllegalArgumentException();
    }
    T largest = nums.get(0);
    for (int i = 0; i < nums.size(); i++) {
      if (largest.compareTo(nums.get(i)) < 0) {
        largest = nums.get(i);
      }
    }

    return largest;
  }

  private T findLargestInLinkedList(List<T> nums) {
    if (nums.size() == 0) {
      throw new IllegalArgumentException();
    }
    Iterator<T> it = nums.iterator();
    T largest = it.next();
    while (it.hasNext()) {
      T next = it.next();

      if (largest.compareTo(next) < 0) {
        largest = next;
      }
    }
    return largest;
  }

  private <T extends Comparable> T max(Collection<T> c) {
    if (c.isEmpty()) {
      throw new NoSuchElementException();
    }
    Iterator<T> iter = c.iterator();
    T largest = iter.next();
    while (iter.hasNext()) {

      T next = iter.next();
      if (largest.compareTo(next) < 0) {
        largest = next;
      }
    }
    return largest;
  }

}
