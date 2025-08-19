package com.mycompany.prjtestejavaforms.classes;

import com.mycompany.prjtestejavaforms.objetos.DadosEntradaEqSegGrau;
import com.mycompany.prjtestejavaforms.objetos.DadosSaidaEqSegGrau;

/**
 *
 * @author IFTM
 */
public class CalculadoraEqSegGrau {
    public void calcularDelta(DadosEntradaEqSegGrau de, DadosSaidaEqSegGrau ds){
        ds.setDelta((de.getB()*de.getB()) - 4*de.getA()*de.getC());
    }
    public void calcularX1L(DadosEntradaEqSegGrau de, DadosSaidaEqSegGrau ds){ //(-b ± √(delta)) / 2a
        if(ds.getDelta() < 0){
            ds.setX1L(0);
        } else {
            ds.setX1L((float) (-(de.getB()) + Math.sqrt(ds.getDelta())) / (2 * de.getA()));
        }
    }
    public void calcularX2L(DadosEntradaEqSegGrau de, DadosSaidaEqSegGrau ds){ // (-b ± √(delta)) / 2a
        if(ds.getDelta() < 0){
            ds.setX2L(0);
        } else {
            ds.setX2L((float) (-(de.getB()) - Math.sqrt(ds.getDelta())) / (2 * de.getA()));
        }
    }
    public void calcularXv(DadosEntradaEqSegGrau de, DadosSaidaEqSegGrau ds){ // x = -b / 2a
        ds.setXv((-(de.getB())) / (2 * de.getA()));
    }
    public void calcularYv(DadosEntradaEqSegGrau de, DadosSaidaEqSegGrau ds){ // (-(delta)) / (4a)
        ds.setYv(-(ds.getDelta() / (4 * de.getA())));
    }
}
