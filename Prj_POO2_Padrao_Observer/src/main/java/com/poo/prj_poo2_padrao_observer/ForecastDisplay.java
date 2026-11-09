/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_poo2_padrao_observer;

/**
 *
 * @author Iftm
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure){
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display(){
        System.out.println("Forecast: ");
        
        if(currentPressure > lastPressure){
            System.out.print("Improving weather on the way!");
        }
        else if(currentPressure == lastPressure){
            System.out.print("More of the same");
        }
        else if(currentPressure < lastPressure){
            System.out.print("Watch out for cooler, rainy weather");
        }
    }
}