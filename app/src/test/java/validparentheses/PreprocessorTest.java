package validparentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PreprocessorTest {

  @Test
  void testPreprocess() {
    Preprocessor preprocessor = new Preprocessor();

    assertEquals("", preprocessor.preprocess(""));
    assertEquals("", preprocessor.preprocess("anything"));
    assertEquals("()", preprocessor.preprocess("()"));
    assertEquals("()[]{}", preprocessor.preprocess("()[]{}"));
    assertEquals(")", preprocessor.preprocess("null)null"));
    assertEquals(")]}", preprocessor.preprocess("1)2]3}"));
  }
}