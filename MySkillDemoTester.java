import static org.junit.Assert.*;
import org.junit.*;

public class MySkillDemoTester {
    @Test
    public void strCheck(){
        assertEquals("Hi", MySkillDemo.str("Hi")); //fixed!
    }
}
