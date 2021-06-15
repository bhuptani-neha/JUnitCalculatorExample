package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;

public class JUnitRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JUnitTestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

    }
}
