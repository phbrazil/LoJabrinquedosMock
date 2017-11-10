/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

/**
 *
 * @author paulo.hbezerra
 */
public class PesquisaCPF {

    private String nomecliente = "";

    public void PesquisaCPF(String CPF) {

        if (CPF.equals("375.197.588-85")) {

            nomecliente = "Paulo Henrique Bezerra";

        } else if (CPF.equals("434.696.268-80")) {

            nomecliente = "Lucas Medeiros";

        }

    }

    public String Getnome() {

        return nomecliente;
    }

}
