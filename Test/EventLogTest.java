import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventLogTest {
    private EventLog testEventLog = new EventLog();
    private Event testEvent;
    @Before
    public void setUp() throws Exception {
        System.out.println("set up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tear down");
    }

    @Test
    public void addEvent() throws  Exception {
        System.out.println("attempting to add illigal argument excepetion");
        assertFalse(testEventLog.addEvent(testEvent));
        System.out.println("Sucsess");
    }


}