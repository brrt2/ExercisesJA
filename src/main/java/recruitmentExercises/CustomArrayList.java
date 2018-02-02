package recruitmentExercises;

import java.util.Arrays;

public class CustomArrayList<E> {

  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];

  public CustomArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  public void add(E e) {
    if (size == elements.length) {
      ensureCapacity();
    }
    elements[size++] = e;
  }

//  public boolean add(E e) {
//    ensureCapacityInternal(size + 1);  // Increments modCount!!
//    elementData[size++] = e;
//    return true;
//  }
//
  private void ensureCapacity() {
    int newSize = elements.length * 2;
    elements = Arrays.copyOf(elements, newSize);
  }

  @SuppressWarnings("unchecked")
  public E get(int i) {
    if (i >= size || i <0) {
      throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
    }
    return (E) elements[i];
  }

  public E remove(int index) {
    rangeCheck(index);

    E oldValue = (E) elements[index];

    int numMoved = size - index - 1;
    if (numMoved > 0)
      System.arraycopy(elements, index+1, elements, index,
              numMoved);
    elements[--size] = null; // clear to let GC do its work

    return oldValue;
  }


  private void rangeCheck(int index) {
    if (index >= size)
      throw new IndexOutOfBoundsException("Index out of bounds");
  }

}

