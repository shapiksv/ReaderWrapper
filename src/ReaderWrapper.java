import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReaderWrapper {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream cons = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        result = result.toUpperCase();

        System.setOut(cons);
        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
