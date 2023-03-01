package ma.projet.android.testjunit;

import org.junit.runner.JUnitCore;

import kotlin.Result;

public class TestRunner {
    public static void main(String[] agrs) {
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());

        }
        System.out.println(result.wasSuccessful());
    }
}
