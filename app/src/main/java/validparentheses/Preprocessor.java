package validparentheses;

import java.util.Arrays;
import java.util.List;

/**
 * Class that processes the input strings received from the command line
 */
public class Preprocessor {

  /**
   * Preprocesses the {@code rawInput} by removing any characters that are
   * not opening or closing brackets such as {@code (, [} and curly braces.
   * 
   * @param rawInput Any string, but it cannot be null.
   * 
   * @return String containing only brackets
   */
  public String preprocess(String rawInput) {
    List<Character> acceptableBrackets = Arrays.asList('(', ')', '[', ']', '{', '}');

    StringBuilder bracketsOnly = new StringBuilder();

    for (char character : rawInput.toCharArray()) {
      if (acceptableBrackets.contains(character))
        bracketsOnly.append(character);
    }

    return bracketsOnly.toString();
  }

}
