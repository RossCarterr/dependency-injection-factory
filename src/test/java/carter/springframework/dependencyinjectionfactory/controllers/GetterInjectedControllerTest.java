package carter.springframework.dependencyinjectionfactory.controllers;

import carter.springframework.dependencyinjectionfactory.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.SAY_HELLO, getterInjectedController.sayHello());
    }
}