/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Aluguel {
    private int codigoAluguel;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean pago;

    public Aluguel(int codigoAluguel, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAluguel, Pagamento formaPagamento, boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAluguel = valorTotalAluguel;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = new ArrayList();
        this.pago = pago;
    }

    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }

    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }

    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(float valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    //depois temos que ver esse to string que retorna um ArrayList
    @Override
    public String toString() {
        return "Aluguel{" + "codigoAluguel=" + codigoAluguel + ", cliente=" + cliente + ", corretor=" + corretor + ", imovel=" + imovel + ", dataAluguel=" + dataAluguel + ", dataDevolucao=" + dataDevolucao + ", dataPagamentoMensal=" + dataPagamentoMensal + ", valorTotalAluguel=" + valorTotalAluguel + ", formaPagamento=" + formaPagamento + ", segurosContratados=" + segurosContratados + ", pago=" + pago + '}';
    }
    //para as funções que ainda não criamos coloquei um retorno ppadrao só pra não dar erro.
    public float calcularValorTotal(){
        return 0;
    }
    
    public boolean possuiSeguro(){
        return false;
    }
    
    public boolean verificarAtraso(){
        return false;
    }
    
}
