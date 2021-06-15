package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import com.epam.tat.module4.*;


public class TimeOutRule {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void TestTimeOutPositive() throws InterruptedException {
        com.epam.tat.module4.Timeout.sleep(5);
        System.out.println("In Positive TimeOut");
    }

    @Test
    public void TestTimeOutNegative() throws InterruptedException {
        com.epam.tat.module4.Timeout.sleep(100);
        System.out.println("In Negative TimeOut");
    }
}
