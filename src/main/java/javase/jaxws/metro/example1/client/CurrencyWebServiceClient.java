package javase.jaxws.metro.example1.client;

import javase.jaxws.metro.example1.stub.Currency;
import javase.jaxws.metro.example1.stub.CurrencyConvertor;

public class CurrencyWebServiceClient {
    public static double USD2HK() {
        CurrencyConvertor currencyConvertor = new CurrencyConvertor();
        return currencyConvertor.getCurrencyConvertorSoap().conversionRate(Currency.USD, Currency.HKD);	
    }
    
    public static void main(String[] args) {
    	System.out.println(USD2HK());
    }
}

