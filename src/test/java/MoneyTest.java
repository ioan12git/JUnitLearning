import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void constructorShouldSetAmountAndCurrency(){
        Money money = new Money(10,"USD");

        Assert.assertEquals(10,money.getAmount());
        Assert.assertEquals("USD",money.getCurrency());
    }
}