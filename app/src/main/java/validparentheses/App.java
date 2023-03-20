package validparentheses;

/**
 * Main execution class for the command line app
 */
public class App {

    /**
     * Main method accepting one argument via the command line.
     * 
     * @param args List of command line arguments, only the first one is used.
     */
    public static void main(String[] args) {

        // receive input
        Preprocessor preprocessor = new Preprocessor();
        String preprocessed = preprocessor.preprocess(args[0]);
        System.out.println("Supplied string is " + args[0]);
        System.out.println("Preprocessed (brackets only) result: " + preprocessed);

        // compute answer
        Validator validator = new Validator();
        boolean isValidParentheses = validator.isValid(preprocessed);
        System.out.println("String is " + (isValidParentheses ? "valid" : "invalid"));
    }
}
