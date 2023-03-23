package validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Class containing the validation logic for bracket closure
 */
public class Validator {

  /**
   * Checks whether the bracket-only string is valid. Validity is determined by
   * looking at whether the brackets are closed properly.
   * 
   * @param stringToValidate Bracket-only string
   * @return Whether the given string has valid parenthesis construction
   */
  public boolean isValid(String stringToValidate) {

    // Implementing the pseudocode in the README.md file.

    Stack<Character> openingBrackets = new Stack<>();

    Map<Character, Character> closingBracketToOpening = new HashMap<>();

    closingBracketToOpening.put(')', '(');
    closingBracketToOpening.put('}', '{');
    closingBracketToOpening.put(']', '[');

    for (char character : stringToValidate.toCharArray()) {

      // push an opening bracket to the stack
      if (!closingBracketToOpening.containsKey(character)) {
        openingBrackets.push(character);
        continue;
      }

      // closing bracket cannot be paired
      if (openingBrackets.size() == 0)
        return false;

      char lastOpeningBracket = openingBrackets.pop();
      if (lastOpeningBracket != closingBracketToOpening.get(character))
        return false;

    }

    if (openingBrackets.size() == 0)
      return true;

    return false;
  }

  private void doNothing() {

  }
}
