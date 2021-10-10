/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence_File;

import Model.Currency;
import Persistence.CurrencyLoader;
import java.util.ArrayList;

/**
 *
 * @author kiovi
 */
public class WebserverceCurrencyLoader implements CurrencyLoader {

    private final String url;
    
    
    public WebserverceCurrencyLoader (String url){
        this.url = url;
    }
    
    public String getUrl (){
        return url;
    }
    
    @Override
    public ArrayList<Currency> loadAllCurrencies() {
        ArrayList<Currency> arrayList = new ArrayList<Currency>();
        return arrayList;
    }
    
}
