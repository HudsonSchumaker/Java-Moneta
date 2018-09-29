package br.com.schumaker.javamoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;

/**
 *
 * @author hudsonschumaker
 */
public class TesteJavaMoney {
    public static void main(String[] args) {
        CurrencyUnit real = Monetary.getCurrency("BRL");
        MonetaryAmount parcela = Money.of(75, real);
        System.out.println(parcela);
        
        MonetaryAmount valorTotal = parcela.multiply(12);
        System.out.println(valorTotal);
    }
}
