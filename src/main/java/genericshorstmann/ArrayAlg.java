package genericshorstmann;

public class ArrayAlg {

  public static <T extends Comparable> Pair<T> minmax(T[] a) {
    if (a == null || a.length == 0) {
      return null;
    }

    T min = a[0];
    T max = a[0];

    for (int i = 1; i < a.length; i++) {
      if (min.compareTo(a[i]) > 0) {
        min = a[i];
      }
      if (max.compareTo(a[i]) < 0) {
        max = a[i];
      }
    }

    return new Pair<>(min, max);
  }

  public static <T extends Comparable> T min(T[] a) {
    if (a == null || a.length == 0) {
      return null;
    }

    T smallest = a[0];

    for (int i = 1; i < a.length; i++) {
      if (smallest.compareTo(a[i]) > 0) {
        smallest = a[i];
      }
    }
    return smallest;
  }
}
