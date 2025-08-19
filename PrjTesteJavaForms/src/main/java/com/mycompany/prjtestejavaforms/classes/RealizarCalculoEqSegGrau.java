package com.mycompany.prjtestejavaforms.classes;

import com.mycompany.prjtestejavaforms.objetos.DadosEntradaEqSegGrau;
import com.mycompany.prjtestejavaforms.objetos.DadosSaidaEqSegGrau;
import javax.swing.JOptionPane;

/**
 *
 * @author IFTM
 */
public class RealizarCalculoEqSegGrau {
    public DadosSaidaEqSegGrau realizarCalculo(DadosEntradaEqSegGrau de){
        CalculadoraEqSegGrau calcSegGrau = new CalculadoraEqSegGrau();
        DadosSaidaEqSegGrau ds = new DadosSaidaEqSegGrau();
        calcSegGrau.calcularDelta(de, ds);
        if(ds.getDelta() < 0){
            JOptionPane.showMessageDialog(null, "Delta menor que zero. Não há raízes reais.");
            ds.setX1L(Float.NaN);
            ds.setX2L(Float.NaN);
        } else {
            calcSegGrau.calcularX1L(de, ds);
            calcSegGrau.calcularX2L(de, ds);
        }
        calcSegGrau.calcularXv(de, ds);
        calcSegGrau.calcularYv(de, ds);
        return ds;
    }
}
