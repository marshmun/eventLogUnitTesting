
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class EventLogTest {

    private EventLog testEventLog = new EventLog();
    private Event testEvent;

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting it up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing it down");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void nullEventTest() throws IllegalArgumentException {
        System.out.println("Attempting null event...");
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }

    @Test
    public void bothEventVariablesNullTest() throws IllegalArgumentException {
        System.out.println("Attempting with two null variables...");
        testEvent = new Event();
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }

    @Test
    public void oneEventVariableNullTest() throws IllegalArgumentException {
        System.out.println("Attempting event with one null variable...");
        testEvent = new Event();
        testEvent.setName("some test event name");
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }

    @Test
    public void invalidActionVariableTest() throws IllegalArgumentException {
        System.out.println("Attempting event with invalid action variable...");
        testEvent = new Event();
        testEvent.setName("Text");
        testEvent.setAction("invalid action");
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }

    @Test
    public void validEventAddedToEventListTest() throws IllegalArgumentException {
        System.out.println("Attempting valid event to event list...");
        testEvent = new Event();
        testEvent.setName("some test event name");
        testEvent.setAction("TextMessaging");
        assertTrue("Should return true", testEventLog.addEvent(testEvent));
        assertTrue("Should have been added to event list", testEventLog.getNumEvents() == 1);
        System.out.println("SUCCESS");
    }
}