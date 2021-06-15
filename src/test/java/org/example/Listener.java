package org.example;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {

    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Test Run Started "+description.isTest());
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Test Run Finished "+result.getRunCount());
    }
}
