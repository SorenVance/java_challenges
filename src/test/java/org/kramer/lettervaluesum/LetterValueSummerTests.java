package org.kramer.lettervaluesum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterValueSummerTests {

  public static final LetterValueSummer SUMMER = new LetterValueSummer();

  @ParameterizedTest(name = "given ''{0}''")
  @NullAndEmptySource
  void sum_givenEmptyOrNullString_ShouldReturnZero(String input) {
    assertEquals(0, SUMMER.sum(input));
  }

  @ParameterizedTest(name = "Given Input of ''{0}'', should return {1}")
  @CsvSource({"a, 1", "z, 26"})
  void sum_givenInputString_ShouldSumCharacters(String input, int expectedSum) {
    assertEquals(expectedSum, SUMMER.sum(input));
  }
}