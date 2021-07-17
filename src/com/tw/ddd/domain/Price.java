package com.tw.ddd.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {
    private Currency currency;
    private BigDecimal price;

    public Price(Currency currency, BigDecimal price) {
        this.currency = currency;
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency=" + currency +
                ", price=" + price +
                '}';
    }
}
