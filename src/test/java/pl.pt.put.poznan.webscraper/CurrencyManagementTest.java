package pl.pt.put.poznan.webscraper;

import org.junit.Test;
import pl.pt.put.poznan.webscraper.beans.CurrencyValue;

import java.util.List;

public class CurrencyManagementTest {
    CurrencyManagement currencyManagement = CurrencyManagement.getInstance();

    @Test
    public void connectionTest() {
        List<CurrencyValue> currency = currencyManagement.getEntities(CurrencyValue.class);
        for (CurrencyValue currencies : currency) {
            System.out.println(currencies.getPriceInDollars());
        }
    }
}