
package moneycalculator_ade;

import Model.Currency;
import Persistence_File.FileCurrencyLoader;
import Persistence_File.WebserverceCurrencyLoader;
import java.util.ArrayList;


public class MoneyCalculator_ADE {
    
    
    public static void main(String[] args){
        FileCurrencyLoader fileCurrencyLoader= new FileCurrencyLoader ("C:\\Users\\kiovi\\Documents\\NetBeansProjects\\MoneyCalculator_ADE\\src\\currencyTXT");
        
        
        WebserverceCurrencyLoader webserviceCurrencyLoader = new WebserverceCurrencyLoader (".....");
        
        ArrayList<Currency> loadAllCurenciesfromfile = fileCurrencyLoader.loadAllCurrencies();
    }
}
