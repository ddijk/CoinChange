/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class CoinChangeTest {

    @Test
    public void testChange2Coins_1() {
        Assert.assertEquals(2, CoinChange.change(5, Arrays.asList(1, 5)));
    }

    @Test
    public void testChange2Coins_2() {
        Assert.assertEquals(2, CoinChange.change(7, Arrays.asList(1, 5)));
    }

    @Test
    public void testChange2Coins_3() {
        Assert.assertEquals(6, CoinChange.change(15, Arrays.asList(1, 5, 10)));
    }

}
