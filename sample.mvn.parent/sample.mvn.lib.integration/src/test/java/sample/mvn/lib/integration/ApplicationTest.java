package sample.mvn.lib.integration;

import at.bestsolution.fx.test.e4.junit.E4JunitTestCase;
import at.bestsolution.fx.test.junit.FXRunner;
import at.bestsolution.fx.test.rcontrol.RNode;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FXRunner.class)
public class ApplicationTest extends E4JunitTestCase {

    public ApplicationTest() {
        super("sample.mvn.app.product");
    }

    @Test
    public void testA() {
        rcontroller().cssFirst(".my-button").get().click();
    }

    @Test
    public void testB() {
        rcontroller().cssFirst(".my-button2").get().click();
    }

    @Test
    public void testC() {
        rcontroller().css(".button").forEach(RNode::click);
    }
}