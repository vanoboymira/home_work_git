import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewTest {
    @Test
    int i = 2; 
    void newTest(){
        System.out.println("This is the best Test");
        Assertions.assertTrue(i>2);
    }

}
