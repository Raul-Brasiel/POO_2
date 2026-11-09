/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_poo2_padrao_strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Iftm
 */
public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public boolean pay(int paymentAmount){
        if(cardIsPresent()){
            System.out.println("Paying " + paymentAmount + " using credit card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void collectPaymentDetails(){
        try{
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.println("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    private boolean cardIsPresent(){
        return card != null;
    }
}
