public class Stack {
   private int maxSize; // size of stack array 
   private char[] stackArray;
   private int top; // top of stack

   public Stack(int size) {
    maxSize = size; //set array size
    stackArray = new char[size]; //create array
    top = -1; //no items yet
   }

   public void push(char i) {
    top++; //increment top
    stackArray[top] = i; //insert item in new empty element
   }

   public char pop() {
    char currentTop = stackArray[top]; //store current top value
    top--; //decrement top
    return currentTop; //return old top to show what was popped
   }

   public int peek() {
    return stackArray[top];
   }

   public boolean isEmpty() {
    return (top == -1);
   }

   public boolean isFull() {
    return (top == maxSize - 1);
   }
}
