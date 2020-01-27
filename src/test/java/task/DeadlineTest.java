package task;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DeadlineTest {

    @Test
    void test(){
        Deadline deadline = new Deadline("project meeting ", LocalDate.parse("2020-12-12"));
        String expectedFirst = "[D][Not Done] project meeting (by: Dec 12 2020)";
        String actualFirst = deadline.toString();
        String expectedSec = "D/0/project meeting /2020-12-12\n";
        String actualSec = deadline.toStringTasks();
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSec, actualSec);
    }
}
