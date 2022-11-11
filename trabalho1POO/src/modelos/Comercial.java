/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Comercial extends Imovel{
    protected float taxaImpostoFederal;

    public Comercial(float taxaImpostoFederal, int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIptu, valorVenda, valorAluguel);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    
    public float getValorAluguel(){
        return this.taxaImpostoFederal + this.valorAluguel;
    }
    
    
    @Override
    public String toString() {
        return "Comercial{" + "codigoImovel=" + codigoImovel + ", endereco=" + endereco + ", dataConstrucao=" + dataConstrucao + ", areaTotal=" + areaTotal + ", areaConstruida=" + areaConstruida + ", qtdDormitorios=" + qtdDormitorios + ", qtdBanheiros=" + qtdBanheiros + ", qtdVagasGaragem=" + qtdVagasGaragem + ", valorIptu=" + valorIptu + ", valorVenda=" + valorVenda + ", valorAluguel=" + valorAluguel + "taxaImpostoFederal=" + taxaImpostoFederal + '}';
    }
    
    
    
    
}
