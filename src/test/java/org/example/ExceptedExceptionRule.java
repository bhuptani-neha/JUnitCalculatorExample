package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.isA;

public class ExceptedExceptionRule {
    @Rule
        public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void ExceptedRulePositive() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectCause(isA(NullPointerException.class));
        thrown.expectMessage("This is illegal");

        throw new IllegalArgumentException("This is illegal", new NullPointerException());
    }

    @Test
    public void ExceptedRuleNegative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectCause(isA(NullPointerException.class));
        thrown.expectMessage("This is illegal");

        throw new IllegalArgumentException("This is illegal", new ArithmeticException());
    }

    @Test
    public void ExceptedRuleNegativeTest1() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectCause(isA(NullPointerException.class));
        thrown.expectMessage("This is illegal");

        throw new IllegalArgumentException("This is illegal", new IndexOutOfBoundsException());
    }
}
