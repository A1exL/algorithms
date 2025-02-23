package best.time.to.buy.and.sell.stocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStocksTest {

    @Test
    void maxProfit() {
        BestTimeToBuyAndSellStocks sut = new BestTimeToBuyAndSellStocks();
        assertEquals(5, sut.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, sut.maxProfit(new int[]{7, 6, 4, 3, 1}));
        assertEquals(3, sut.maxProfit(new int[]{2, 5, 1, 2}));
        assertEquals(0, sut.maxProfit(new int[]{1}));
    }

}