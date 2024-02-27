package Calculator2;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculateTest {
    Calculate calculate=new Calculate();

    @Test
    public void Test(){
        Assert.assertEquals(3,calculate.max(1,2,3));
        Assert.assertEquals(3,calculate.max(3,2,1));
        Assert.assertEquals(3,calculate.max(1,3,2));
        Assert.assertEquals(3,calculate.max(2,3,1));
        Assert.assertEquals(1,calculate.max(1,1,1));
        assertEquals(3,calculate.max(1,2,3));
        assertEquals(3,calculate.max(2,1,3));
        assertEquals(3,calculate.max(3,1,2));
        assertEquals(3,calculate.max(3,2,1));
        assertEquals(3,calculate.max(1,3,2));
        assertEquals(3,calculate.max(2,3,1));

    }
    // a <b   a<c



}
