import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void before(){
        System.out.println("TEST-BEFORE");
    }

    @After
    public void after(){
        System.out.println("TEST-AFTER");
    }
    @Test(timeout = 90)

    public void getname() {
        assertEquals("Спирин Кирилл Павлович", "Спирин Кирилл Павлович");
    }

    @Test
    public void difference() {

        assertEquals(15, 15);
    }

    @Test
    public void sum() {
        assertEquals(9,9);
    }


}