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
public class CasaResidencial extends Imovel{

    public CasaResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu, float valorVenda, float valorAluguel, boolean disponivelAluguel, boolean disponivelVenda) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIptu, valorVenda, valorAluguel, disponivelAluguel, disponivelVenda);
    }

    

    @Override
    public String toString() {
        return "CasaResidencial{" + "codigoImovel=" + codigoImovel + ", endereco=" + endereco + ", dataConstrucao=" + dataConstrucao + ", areaTotal=" + areaTotal + ", areaConstruida=" + areaConstruida + ", qtdDormitorios=" + qtdDormitorios + ", qtdBanheiros=" + qtdBanheiros + ", qtdVagasGaragem=" + qtdVagasGaragem + ", valorIptu=" + valorIptu + ", valorVenda=" + valorVenda + ", valorAluguel=" + valorAluguel + '}';
    }

    
    
}
