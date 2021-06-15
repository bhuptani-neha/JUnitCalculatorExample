package org.example;

import org.junit.runner.JUnitCore;

public class JUnitRunListener {

    public static void main(String[] args)
    {
        JUnitCore runner = new JUnitCore();
            runner.addListener(new Listener());
        runner.run(ParameterizedTest.class);
    }
}
