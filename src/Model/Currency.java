/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author kiovi
 */
public class Currency {
    private final String code,name, symbol;
    
    
    public Currency(String code, String name, String symbol){
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSymbol(){
        return symbol;
    }
}
