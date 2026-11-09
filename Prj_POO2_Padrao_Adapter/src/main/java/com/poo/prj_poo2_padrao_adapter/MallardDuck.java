/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_poo2_padrao_adapter;

/**
 *
 * @author Iftm
 */
public class MallardDuck implements Duck{

    @Override
    public void quack(){
        System.out.println("Quack");
    }

    @Override
    public void fly(){
        System.out.println("I'm Flying");
    }
}