package validparentheses;

import java.util.Arrays;
import java.util.List;

public class Preprocessor {

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
