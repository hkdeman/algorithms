public class Test {
    public static void main(String args[]) {
        ArrayStack<String> stack = new ArrayStack<String>(10);

        for(int i=0;i<10;i++) {
            stack.push("s"+i);
        }

        System.out.println(stack);

        // stack.push("s"); // stack overflow!

        System.out.println(stack.pop());

        System.out.println(stack);
    }
}