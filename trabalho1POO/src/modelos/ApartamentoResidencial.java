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
public class ApartamentoResidencial extends Imovel{
    protected int andar;
    protected float valorCondominio;

    public ApartamentoResidencial(int andar, float valorCondominio, int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIptu, valorVenda, valorAluguel);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    
    public float getValorAluguel(){
        return this.valorAluguel + this.valorCondominio;
    }

    @Override
    public String toString() {
        return "ApartamentoResidencial{" + "andar=" + andar + ", valorCondominio=" + valorCondominio + '}';
    }
    
    
    
    
}
