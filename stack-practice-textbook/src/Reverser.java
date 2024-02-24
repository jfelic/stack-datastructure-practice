public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public String doReverse() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize); //create stack object

        //Push every char to the new stack
        for(int i = 0; i < stackSize; i++){
            char ch = input.charAt(i);
            theStack.push(ch);
        }

        //Prepare output for concatentation
        output = "";

        //Pop all of the chars and concatenate to output
        while( !theStack.isEmpty() ) {
            char ch = theStack.pop();
            output += ch;
        }
        return output;
    }
}
