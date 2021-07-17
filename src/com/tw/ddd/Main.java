package com.tw.ddd;

import com.tw.ddd.domain.Cart;
import com.tw.ddd.domain.Price;
import com.tw.ddd.domain.Product;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static final String I_PAD_PRO = "IPad Pro";
    public static final String HERO_INK_PEN = "Hero Ink Pen";
    public static final String G_M_CRICKET_BAT = "G.M Cricket Bat";

    public static void main(String[] args) {
        Map<String, BigDecimal> competitorProductPrice = new HashMap<>();
        competitorProductPrice.put("IPad Pro", new BigDecimal(1000));
        competitorProductPrice.put("Hero Ink Pen", new BigDecimal(50));
        competitorProductPrice.put("G.M Cricket Bat", new BigDecimal(1000));

        Currency inrCurrency = Currency.getInstance(new Locale("en", "in"));

        BigDecimal ipadPrice = calculateProductPrice(competitorProductPrice.get(I_PAD_PRO));
        Product ipad = new Product(I_PAD_PRO, new Price(inrCurrency, ipadPrice));

        BigDecimal heroInkPenPrice = calculateProductPrice(competitorProductPrice.get(HERO_INK_PEN));
        Product heroInkPen = new Product(HERO_INK_PEN,new Price(inrCurrency, heroInkPenPrice));

        BigDecimal cricketBatPrice = calculateProductPrice(competitorProductPrice.get(G_M_CRICKET_BAT));
        Product cricketBat = new Product(G_M_CRICKET_BAT,new Price(inrCurrency, cricketBatPrice));


        Cart cart1 = new Cart();
        printPrice(ipad);
        cart1.addProduct(ipad);
        printPrice(heroInkPen);
        cart1.addProduct(heroInkPen);
        printPrice(cricketBat);
        cart1.addProduct(cricketBat, 2);

        cart1.removeProduct(ipad);
        cart1.viewRemovedItems();

        Cart cart2 = new Cart();
        printPrice(ipad);
        cart2.addProduct(ipad);

    }

    private static BigDecimal calculateProductPrice(BigDecimal competitor_Product_Price) {
        return competitor_Product_Price.subtract(competitor_Product_Price.multiply(BigDecimal.valueOf(0.10)));

    }

    private static void printPrice(Product ipad) {
        System.out.println("Price of " + ipad.getName() + " " + ipad.getPrice());
    }
}
