/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjpetshop_poo2;

import com.poo.prjpetshop_poo2.dao.PessoaDAO;
import com.poo.prjpetshop_poo2.forms.FormCadastroPessoa;
import com.poo.prjpetshop_poo2.objects.Pessoa;
import com.poo.prjpetshop_poo2.util.Conexao;
import java.sql.SQLException;

/**
 *
 * @author IFTM
 */
public class PrjPetShop_POO2 {

    public static void main(String[] args){
        FormCadastroPessoa form = new FormCadastroPessoa();
        form.setVisible(true);
    }
}
