package recruitmentExercises;

import java.util.Arrays;

public class MyArrayList<E> {

  Object[] elements;
  private int size;
  private int DEFAULT_SIZE = 10;


  public MyArrayList() {
    elements = new Object[DEFAULT_SIZE];
  }

  public MyArrayList(int initialCapacity) {
    elements = new Object[initialCapacity];
  }

  public void add(E element) {

    if (size == elements.length) {
      ensureCapacity();
    }
    elements[size++] = element;

  }

  @SuppressWarnings("unchecked")
  public E get(int index) {

    if (index < 0 || index >= elements.length) throw new IndexOutOfBoundsException("Index out of bounds");
    return (E) elements[index];

  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }


  private void ensureCapacity() {
    int newSize = size * 2;
    elements = Arrays.copyOf(elements, newSize);
  }

  public E remove(int index) {

    E oldValue = (E) elements[index];

    int numMoved = size - index - 1;
    if (numMoved > 0)
      System.arraycopy(elements, index + 1, elements, index,
              numMoved);
    elements[--size] = null; // clear to let GC do its work

    return oldValue;
  }

  public E set(int index, E element) {
    if (index < 0 || index >= elements.length) throw new IndexOutOfBoundsException("Index out of bounds");

    E oldValue = (E) elements[index];
    elements[index] = element;
    return oldValue;
  }

}
