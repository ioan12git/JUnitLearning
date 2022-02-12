import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MoneyParametrizedTest {
    private static final Object[] getMoney(){
        return new Object[]{
                new Object[] {10,"USD"},
                new Object[] {20,"EUR"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount, String currency){
        Money money = new Money(amount,currency);
        Assertions.assertEquals(amount,money.getAmount());
        Assertions.assertEquals(currency,money.getCurrency());
    }
}
