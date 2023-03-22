package validparentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidatorTest {
  @Test
  void testIsValid() {

    Validator validator = new Validator();

    // simple positive cases
    assertTrue(validator.isValid(""));
    assertTrue(validator.isValid("()"));
    assertTrue(validator.isValid("[]"));
    assertTrue(validator.isValid("{}"));

    // simple negative cases
    assertFalse(validator.isValid(")"));
    assertFalse(validator.isValid("]"));
    assertFalse(validator.isValid("}"));
    assertFalse(validator.isValid("("));
    assertFalse(validator.isValid("["));
    assertFalse(validator.isValid("{"));

    // complex positive cases
    assertTrue(validator.isValid("()[]{}"));
    assertTrue(validator.isValid("([{}])"));
    assertTrue(validator.isValid("({[]})"));
    assertTrue(validator.isValid("({[{}]}())"));

    // complex negative cases
    assertFalse(validator.isValid("(([]){}]"));
    assertFalse(validator.isValid("([)]"));
    assertFalse(validator.isValid("([})"));
    assertFalse(validator.isValid("({[{}]}())("));
  }
}
