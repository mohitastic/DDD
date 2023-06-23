package domain.model;

import java.util.Currency;

public class Price {

    Currency currency;

    Integer value;

    public Price(Currency currency, Integer value) {
        this.currency = currency;
        this.value = value;
    }
}
