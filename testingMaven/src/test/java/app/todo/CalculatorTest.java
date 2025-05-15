package app.todo;

import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {

    @Test
    public void testThatCalculator_Can_Add() {
        Calculator newCalculator = new Calculator();
        assertThat(newCalculator.add(2, 3), is(5));
    }
}