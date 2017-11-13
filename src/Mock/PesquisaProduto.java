/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class PesquisaProduto {

    private int tamanho = 10;
    //private int contador = 1;

    private int[] codigobarras = new int[tamanho];

    private String[] nomeproduto = new String[tamanho];

    private double[] valor = new double[tamanho];

    private double[] valordesconto = new double[tamanho];
    private String[] FaixaEtaria = new String[tamanho];
    private String[] Fabricante = new String[tamanho];
    private String[] PrazoGarantia = new String[tamanho];
    private int[] Quantidade = new int[tamanho];
    private int[] idproduto = new int[tamanho];

    public void AlimentarEstoque(int idproduto, String nomeproduto, double valor, String faixaetaria, String fabricante, String prazogarantia, int quantidade) {
        if(idproduto<=10){
        this.idproduto[idproduto] = idproduto;
        this.codigobarras[idproduto] = idproduto;
        this.nomeproduto[idproduto] = nomeproduto;
        this.valor[idproduto] = valor;
        this.FaixaEtaria[idproduto] = fabricante;
        this.Fabricante[idproduto] = fabricante;
        this.PrazoGarantia[idproduto] = prazogarantia;
        this.Quantidade[idproduto] = quantidade;
                    System.out.println("uehueu"+this.nomeproduto[idproduto]);

        }else{
            
            JOptionPane.showMessageDialog(null, "Lista cheia ou id inválido");
        }

    }

    public String GetNomeProduto(int idproduto) {

        return nomeproduto[idproduto];

    }

    public double GetPreco(int idproduto) {

        return valor[idproduto];

    }

}
