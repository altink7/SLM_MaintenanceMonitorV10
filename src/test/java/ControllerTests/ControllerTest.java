package ControllerTests;

import altinpc.fh.slm_maintenancemonitorv10.controller.MonitorController;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControllerTest {

    @Test //this Test gets the variable and compares it
    public void testGetStatus(){
        MonitorController  controller = new MonitorController();
        controller.setStatus("-"); // Reset the RestAPI message

        String s = controller.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals(s,excepted,"Should be \"-\" ");
    }

    @Test //This Test sets the Status and tests the setMethod
    public void testSetStatus(){
        MonitorController  controller = new MonitorController();
        controller.setStatus("-"); // Reset the RestAPI message

        controller.setStatus("test");

        String s = controller.getStatus();//actual
        String excepted = "test";//excepted

        Assert.assertEquals(s,excepted,"Should be \"Test\" ");
    }

    @Test //This Test sets the Status with Null Value and tests the setMethod
    public void testSetStatusNull(){
        MonitorController  controller = new MonitorController();
        controller.setStatus("-"); // Reset the RestAPI message

        controller.setStatus(null);

        String s = controller.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals(s,excepted,"Should be \"-\" ");
    }

    @Test //This Test sets the Status with Blank Value and tests the setMethod
    public void testSetStatusBlank(){
        MonitorController  controller = new MonitorController();
        controller.setStatus("-"); // Reset the RestAPI message

        controller.setStatus("");

        String s = controller.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals(s,excepted,"Should be \"-\" ");
    }

}
