package myclasses.demos.ds.stack.genericstack;


public class StackGeneric<T> {

  private final T[] stackArray;
  private int top;
  private final int maxSize;


  public StackGeneric(int size) {

    maxSize = size;
    stackArray = (T[]) new Object[maxSize];
    top = -1;
  }


  public boolean isEmpty() {

    return top == -1;
  }


  public boolean isFull() {

    return top == maxSize - 1;
  }


  public void push(T iValue) {

    if (!isFull()) {
      stackArray[++top] = iValue;
      System.out.println("Successfully inserted " + iValue);
    }
  }


  public void pop() {

    if (!isEmpty()) {
      T out = stackArray[top];
      top--;
      System.out.println("Poped element: " + out);
    }
  }

}
