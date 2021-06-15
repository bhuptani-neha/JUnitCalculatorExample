package org.example;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelRunner {

    @Test
    public void test() {
        Class[] cls = { ParameterizedTest.class, TimeOutRule.class };

        // Parallel among classes
        JUnitCore.runClasses(ParallelComputer.classes(), cls);

        System.out.println("--------------1--------------");

        // Parallel among methods in a class
        JUnitCore.runClasses(ParallelComputer.methods(), cls);

        System.out.println("--------------1--------------");

        // Parallel all methods in all classes
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }
}
