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

    public void AlimentarEstoque(int contador, String nomeproduto, double valor, String faixaetaria, String fabricante, String prazogarantia, int quantidade) {

        this.idproduto[contador] = contador;
        this.codigobarras[contador] = contador;
        this.nomeproduto[contador] = nomeproduto;
        this.valor[contador] = valor;
        this.FaixaEtaria[contador] = fabricante;
        this.Fabricante[contador] = fabricante;
        this.PrazoGarantia[contador] = prazogarantia;
        this.Quantidade[contador] = quantidade;
        contador++;

    }

    public String GetNomeProduto(int idproduto) {

        return nomeproduto[idproduto];

    }

    public double GetPreco(int idproduto) {

        return valor[idproduto];

    }

}
