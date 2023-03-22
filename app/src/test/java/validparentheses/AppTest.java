package validparentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void emptyString() {
        // There is no assertion in this unit test.
        // The test can only fail when an exception is thrown.
        String[] arguments = { "" };
        App.main(arguments);
    }

    @Test
    void noArguments() {

        String[] arguments = {};
        /*
         * () -> ... is an anonymous function in Java.
         * A function without a name is also called a closure.
         * Closures have access to the outer scope variables. That's why the variable
         * 'arguments' is accessible inside the right hand side of the closure.
         */
        assertThrows(IllegalArgumentException.class, () -> App.main(arguments));
    }

    /*
     * If you want to test the entire app, you need to do integration testing.
     * 
     * Unit tests are not meant for that. They are for individual units inside a
     * program. So for your project, you must click around yourself.
     * 
     * Integration testing requires the entire project to be built into an
     * executable. Then, you would develop a secondary program that sends testing
     * input and analyzes output from your program. The secondary program can be in
     * a different programming language. Sometimes, the integrations tests are not
     * even written with a general purpose language like Java, but with a domain
     * specific language (DSL).
     */
}
