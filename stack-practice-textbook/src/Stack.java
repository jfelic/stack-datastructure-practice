public class Stack {
   private int maxSize; // size of stack array 
   private int[] stackArray;
   private int top; // top of stack

   public Stack(int size) {
    maxSize = size; //set array size
    stackArray = new int[size]; //create array
    top = -1; //no items yet
   }

   public void push(int item) {
    top++; //increment top
    stackArray[top] = item; //insert item in new empty element
   }

   public int pop() {
    int currentTop = stackArray[top]; //store current top value
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
