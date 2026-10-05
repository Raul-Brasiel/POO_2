/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prj_poo2_padrao_factory;

/**
 *
 * @author Iftm
 */
public class Prj_POO2_Padrao_Factory {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        
        Pizza p = store.orderPizza("cheese");
        System.out.println("We ordered a " + p.getNome() + "\n");
        System.out.println(p);
        
        /*
        Pizza p = store.orderPizza("veggie");
        System.out.println("We ordered a " + p.getNome() + "\n");
        System.out.println(p);
        */
    }
}
