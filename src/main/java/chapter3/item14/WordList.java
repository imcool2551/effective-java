package chapter3.item14;

import java.math.BigDecimal;

public class WordList {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("1.00");

        System.out.println(bigDecimal1.compareTo(bigDecimal2));
    }
}
