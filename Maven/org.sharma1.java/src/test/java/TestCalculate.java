import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    @Test
    public void testadd(){
        Calculate c = new Calculate();
    Assert.assertEquals(8 ,c.add(3,5));
    //Assert.assertEquals(8 ,c.add(2,5));
        System.out.println("Test Passed successfully");
    }

}
