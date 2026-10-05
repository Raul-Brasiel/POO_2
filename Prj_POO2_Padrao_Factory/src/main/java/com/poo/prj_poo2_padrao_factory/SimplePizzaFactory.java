/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_poo2_padrao_factory;

/**
 *
 * @author Iftm
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza p = null;
        
        if(type.equals("cheese")){
            p = new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            p = new PepperoniPizza();
        }
        else if(type.equals("clam")){
            p = new ClamPizza();
        }
        else if(type.equals("veggie")){
            p = new VeggiePizza();
        }
        
        return p;
    }
}
