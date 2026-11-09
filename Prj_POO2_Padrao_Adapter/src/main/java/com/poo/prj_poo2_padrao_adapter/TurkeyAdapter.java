/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_poo2_padrao_adapter;

/**
 *
 * @author Iftm
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    public void quack(){
        turkey.gobble();
    }
    
    public void fly(){
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
