package recruitmentExercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class PrevRecruitments {



  public static void main(String[] args) {
//
//    System.out.println(calculateFactorial(6));
//    System.out.println(calculatePower(5,2));

    byte[] bitArray = {9,9};
//    System.out.println(addElement(bitArray));

//    List<Integer> list = new LinkedList<>();
//    list.add(5);
//    list.add(7);
//    list.add(9);
//    list.add(2);
//    list.add(4);


//    System.out.println(findMiddleElement(list));


    byte[] returnedArray = addOneElement(bitArray);

    System.out.println(Arrays.toString(returnedArray));


//    System.out.println(sumAllEvenIntegers(list));
//    System.out.println(sumAllEvenIntegersWithReduce(list));
//
//    System.out.println(reverseStringWithStream("komputer"));

  }


  private static int calculateFactorial(int n) {

    if(n == 0) return 1;

    return n * calculateFactorial(n-1);
  }

  private static int calculatePower(int first, int second) {

    if(second == 0) return 1;

    return first * calculatePower(first,second -1);
  }


  public int strDist(String str, String sub)
  {
    int strLen = str.length();
    int subLen = sub.length();

    if(strLen < subLen) return 0;
    if(str.substring(0 , subLen).equals(sub)) {
      if (str.substring(strLen - subLen,strLen).equals(sub)){
        return strLen;
      }
      return strDist(str.substring(0,strLen - 1),sub);
    }
    return strDist(str.substring(1),sub);
  }

  public static int findMiddleElement(List<Integer> list) {

    int middle = 0;

    Iterator<Integer> it1 = list.iterator();
    Iterator<Integer> it2 = list.iterator();

    while(it1.hasNext()){

      it1.next();

      if(it1.hasNext()) {
        it1.next();

      }

      middle = it2.next();
    }

    return middle;
  }

  private static byte[] addOneElement(byte[] array) {
    int i;

    for(i = array.length - 1; i >= 0; i--) {

      if(array[i] == 9 ) {
        array[i] = 0;
      }else {
        array[i]++;
        break;
      }
    }

    if(i == -1) {

      byte[] result = new byte[array.length + 1];
      Arrays.fill(result, (byte)0);
      result[0] = 1;
      return result;
    }
    return array;
  }


  private boolean checkIfAllNines(byte[] array) {
    for (int i = 0; i < array.length ; i++) {
      if(array[i]==9) return false;
    }
    return true;
  }


  public static int sumAllEvenIntegers(List<Integer> list) {

    int summedList = list.stream()
        .filter(x -> x % 2 == 0)
        .mapToInt(x -> x * 10)
        .sum();

    return summedList;
  }

  public static int sumAllEvenIntegersWithReduce(List<Integer> list) {

    Optional op = list.stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x * 10)
        .reduce((a,b) -> a+b);

    return (int) op.get();
  }

  private static String reverseStringWithStream(String s) {

    return s.chars().mapToObj(x -> String.valueOf((char) x)).reduce((a,b) -> b+a).get();
  }







}
