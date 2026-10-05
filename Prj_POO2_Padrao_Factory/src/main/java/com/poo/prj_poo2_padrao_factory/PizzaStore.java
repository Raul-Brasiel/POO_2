/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_poo2_padrao_factory;

/**
 *
 * @author Iftm
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type){
        Pizza p;
        p = factory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        
        return p;
    }
}
