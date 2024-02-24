public class App {
    public static void main(String[] args) throws Exception {
        Stack myStack = new Stack(10);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        while( !myStack.isEmpty() ) {
            int popped = myStack.pop();
            System.out.println(popped);
        }
    }
}
