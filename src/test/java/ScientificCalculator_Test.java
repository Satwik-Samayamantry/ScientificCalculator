import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigInteger;

public class ScientificCalculator_Test {

    ScientificCalculator scientificCalculator = new ScientificCalculator();

    @Test
    public void sq_rootTest1(){
        assertEquals(2.0, scientificCalculator.sq_root(4), 1e-15);
    }

    @Test
    public void sq_rootTest2(){
        assertEquals(4.0, scientificCalculator.sq_root(16), 1e-15);
    }

    @Test
    public void factorialTest1(){
        assertEquals(BigInteger.valueOf(6), scientificCalculator.factorial(3));
    }

    @Test
    public void factorialTest2(){
        assertEquals(BigInteger.valueOf(120), scientificCalculator.factorial(5));
    }

    @Test
    public void logTest1(){
        assertEquals(1.9999924078065106, scientificCalculator.log(7.389), 1e-15);
    }

    @Test
    public void logTest2(){
        assertEquals(3.2188758248682006, scientificCalculator.log(25), 1e-15);
    }

    @Test
    public void powerTest1(){
        assertEquals(8.0, scientificCalculator.power(2,3), 1e-15);
    }

    @Test
    public void powerTest2(){
        assertEquals(25.0, scientificCalculator.power(5,2), 1e-15);
    }

}