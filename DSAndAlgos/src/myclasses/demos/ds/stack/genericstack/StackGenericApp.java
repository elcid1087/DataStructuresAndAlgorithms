package myclasses.demos.ds.stack.genericstack;


public class StackGenericApp {

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("***********************GENERIC STACK**********************");
    StackGeneric<Integer> stackGInteger = new StackGeneric<Integer>(2);
    stackGInteger.push(1);
    stackGInteger.push(2);
    stackGInteger.pop();
    StackGeneric<Float> stackGFloat = new StackGeneric<Float>(2);
    stackGFloat.push(1.0F);
    stackGFloat.push(2.0F);
    stackGFloat.pop();
    StackGeneric<Character> stackGChar = new StackGeneric<Character>(2);
    stackGChar.push('a');
    stackGChar.push('b');
    stackGChar.pop();
    StackGeneric<String> stackString = new StackGeneric<String>(2);
    stackString.push("abc");
    stackString.push("xyz");
    stackString.pop();
    System.out.println("*********************************************************");
  }

}
