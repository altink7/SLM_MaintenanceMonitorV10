package ControllerTests;

import altinpc.fh.slm_maintenancemonitorv10.controller.MonitorController;
import org.junit.jupiter.api.BeforeEach;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControllerTest {

    @Test //this Test gets the variable and compares it
    public void testGetStatus(){
        MonitorController  controller = new MonitorController();
        String s = controller.getStatus();

        Assert.assertEquals(s,"-","Should be \"-\" ");
    }

    @Test //This Test sets the Status and tests the setMethod
    public void testSetStatus(){
        MonitorController  controller = new MonitorController();
        String s = controller.setStatus("test");

        String excepted = "test";

        Assert.assertEquals(excepted,s,"Should be \"Test\" ");
    }

}
