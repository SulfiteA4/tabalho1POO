/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Arquivos.IOArquivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Aluguel;
import modelos.ApartamentoResidencial;
import modelos.CasaResidencial;
import modelos.Cliente;
import modelos.Comercial;
import modelos.Configuracao;
import modelos.Corretor;
import modelos.Imobiliaria;
import modelos.Imovel;
import modelos.Seguro;
import modelos.Venda;

/**
 *
 * @author Lucas
 */
public class Controlador {
    
    public static Imobiliaria imobiliaria = new Imobiliaria();
    
    /* set e get das configuracoes*/
    public Configuracao getConfiguracoes(){
        return imobiliaria.getConfiguracoes();
    }
    
    public void setConfiguracoes(Configuracao config){
        imobiliaria.setConfiguracoes(config);
        IOArquivos arq = new IOArquivos();
        arq.escreverConfig(config);
        JOptionPane.showMessageDialog(null, "configurações slavas com sucesso!");
    }
    
    
    /* funções para recuperar arquivos de configurações */
    
    public String getConfigClientes(){
        return imobiliaria.getConfiguracoes().getArquivoClientes();
    }
    
    public String getConfigCorretores(){
        return imobiliaria.getConfiguracoes().getArquivoCorretores();
    }
    
    public String getConfigImoveis(){
        return imobiliaria.getConfiguracoes().getArquivoImoveis();
    }
    
    public String getConfigVendas(){
        return imobiliaria.getConfiguracoes().getArquivoVendas();
    }
    
    public String getConfigAlugueis(){
        return imobiliaria.getConfiguracoes().getArquivoAlugueis();
    }
    
    public String getConfigSeguros(){
        return imobiliaria.getConfiguracoes().getArquivoSeguros();
    }
    
    //funções para add registros aos arquivos
    
    public void addCliente(Cliente novoCliente){
        IOArquivos arq = new IOArquivos();
        arq.escreverCliente(novoCliente);
    }
    
    public void addCorretor(Corretor novoCorretor){
        IOArquivos arq = new IOArquivos();
        arq.escreverCorretor(novoCorretor);
    }
    
    public void addAluguel(Aluguel novoAluguel){
        IOArquivos arq = new IOArquivos();
        arq.escreverAlugueis(novoAluguel);
    }
    
    public void addImovel(Imovel novoImovel){
        IOArquivos arq = new IOArquivos();
        arq.escreverImovel(novoImovel);
    }
    
    public void addVenda(Venda novaVenda){
        IOArquivos arq = new IOArquivos();
        arq.escreverVenda(novaVenda);
    }
    
    public void addSeguro(Seguro novoSeguro){
        IOArquivos arq = new IOArquivos();
        arq.escreverSeguros(novoSeguro);
    }
    
    //funções para listagem dos imoveis
    //1. Listar todos os Imóveis cadastrados, seja Casa Residencial, Apartamento Residencial ou Comercial.
    public ArrayList<Imovel> listaTodosOsImoveis(){
        IOArquivos arq = new IOArquivos();
        return arq.lerImoveis();
    }
    
    //2. Listar todos os Imóveis de categoria Casa Residencial.
    public ArrayList<CasaResidencial> listaTodasAsCasasResidenciais(){
        IOArquivos arq = new IOArquivos();
        ArrayList<CasaResidencial> todasCasasResidenciais = new ArrayList();
        ArrayList<Imovel> todosOsImoveis= arq.lerImoveis();
        if(todosOsImoveis != null){
            for(int i =0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i) instanceof CasaResidencial){
                    todasCasasResidenciais.add((CasaResidencial)todosOsImoveis.get(i));
                }
            }
            return todasCasasResidenciais;
        }else{
            return null;
        }
    }
    
    //3. Listar todos os Imóveis de categoria Apartamento Residencial.
    public ArrayList<ApartamentoResidencial> listaTodosOsApartamentosResidenciais(){
        IOArquivos arq = new IOArquivos();
        ArrayList<ApartamentoResidencial> todosApartamentosResidenciais = new ArrayList();
        ArrayList<Imovel> todosOsImoveis= arq.lerImoveis();
        if(todosOsImoveis != null){
            for(int i =0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i) instanceof ApartamentoResidencial){
                    todosApartamentosResidenciais.add((ApartamentoResidencial)todosOsImoveis.get(i));
                }
            }
            return todosApartamentosResidenciais;
        }else{
            return null;
        }
    }
    
    //4. Listar todos os Imóveis de categoria Comercial.
    public ArrayList<Comercial> listaTodosOsComerciais(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Comercial> todosComerciais = new ArrayList();
        ArrayList<Imovel> todosOsImoveis= arq.lerImoveis();
        if(todosOsImoveis != null){
            for(int i =0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i) instanceof Comercial){
                    todosComerciais.add((Comercial)todosOsImoveis.get(i));
                }
            }
            return todosComerciais;
        }else{
            return null;
        }
    }
    
    //5. Listar todos os Imóveis disponíveis para locação (aluguel).
    public ArrayList<Imovel> listaImoveisDisponiveisLocacao(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosOsImoveis = arq.lerImoveis();
        ArrayList<Imovel> imoveisDisponiveis = new ArrayList();
        
        if(todosOsImoveis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i).isDisponivelAluguel() == true){
                    imoveisDisponiveis.add(todosOsImoveis.get(i));
                }   
            }
            return imoveisDisponiveis;
        }
    }
    
    //6. Listar todos os Imóveis não disponíveis para locação, ou seja, alugados ou vendidos.
    public ArrayList<Imovel> listaImoveisIndisponiveis(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosOsImoveis = arq.lerImoveis();
        ArrayList<Imovel> imoveisIndisponiveis = new ArrayList();
        
        if(todosOsImoveis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i).isDisponivelAluguel()== false || todosOsImoveis.get(i).isDisponivelVenda()== false ){
                    imoveisIndisponiveis.add(todosOsImoveis.get(i));
                }   
            }
            return imoveisIndisponiveis;
        }
    }
    
    //7. Listar todos os Imóveis disponíveis para vendas.
    public ArrayList<Imovel> listaImoveisDisponiveisCompra(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosOsImoveis = arq.lerImoveis();
        ArrayList<Imovel> imoveisDisponiveis = new ArrayList();
        
        if(todosOsImoveis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i).isDisponivelVenda() == true){
                    imoveisDisponiveis.add(todosOsImoveis.get(i));
                }   
            }
            return imoveisDisponiveis;
        }
    }
    
    //8. Listar todos os Imóveis com atraso no pagamento do aluguel.
    public ArrayList<Imovel> listaImoveisAlugueisAtrasados(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Aluguel> todosOsAlugueis = arq.lerAlugueis();
        ArrayList<Imovel> imoveisAtrasados = new ArrayList();
        
        if(todosOsAlugueis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsAlugueis.size(); i++){
                if(todosOsAlugueis.get(i).verificarAtraso()){
                    imoveisAtrasados.add(todosOsAlugueis.get(i).getImovel());
                }
            }
            return imoveisAtrasados;
        }
    }
    
    //9. Listar todos os Imóveis já alugados por um Cliente em específico.
    public ArrayList<Imovel> listaImoveisAlugadosClienteEspecifico(int codigoCliente){
        IOArquivos arq = new IOArquivos();
        ArrayList<Aluguel> todosAlugueis = arq.lerAlugueis();
        ArrayList<Imovel> imoveisDoCliente = new ArrayList();
        if(todosAlugueis == null){
            return null;
        }else{
            for(int i = 0; i < todosAlugueis.size() ; i++){
                if(todosAlugueis.get(i).getCliente().getCodigoUsuario() == codigoCliente){
                    imoveisDoCliente.add(todosAlugueis.get(i).getImovel());
                }
            }
            return imoveisDoCliente;
        }
    }
    
    //10. Listar todos os Imóveis já comprados por um Cliente em específico.
    public ArrayList<Imovel> listaImoveisCompradosClienteEspecifico(int codigoCliente){
        IOArquivos arq = new IOArquivos();
        ArrayList<Venda> todasVendas = arq.lerVendas();
        ArrayList<Imovel> imoveisDoCliente = new ArrayList();
        if(todasVendas == null){
            return null;
        }else{
            for(int i = 0; i < todasVendas.size() ; i++){
                if(todasVendas.get(i).getCliente().getCodigoUsuario() == codigoCliente){
                    imoveisDoCliente.add(todasVendas.get(i).getImovel());
                }
            }
            return imoveisDoCliente;
        }
    }
    
    //11. Listar todos os Corretores cadastrados.
    public ArrayList<Corretor> listarTodosOsCorretores(){
        IOArquivos arq = new IOArquivos();
        return arq.lerCorretores();
    }
    
    //12.  Listar o Corretores ganhadores do funcionário do mês, ou seja, os corretores que mais alugueis ou vendas realizaram em cada um dos meses.
    public Corretor corretorFuncionarioDoMes(String mes){
        return null;
    }
    
    //13.  Listar todos os Clientes cadastrados.
    public ArrayList<Cliente> getTodosClientes(){
        IOArquivos arq = new IOArquivos();
        return arq.lerClientes();    
    }
    
    //14. Listar o histórico de compras, imóveis comprados por um Cliente em específico.
    public ArrayList<Venda> listaHistoricoComprasClienteEspecifico(Cliente cliente){
        IOArquivos arq = new IOArquivos();
        ArrayList<Venda> todasVendas = arq.lerVendas();
        ArrayList<Venda> historico = new ArrayList();
        for(int i = 0; i < todasVendas.size(); i++){
            if(todasVendas.get(i).getCliente() == cliente){
                historico.add(todasVendas.get(i));
                
            }
        }
        return historico;
    }
    
    //15. Listar Clientes com alugueis em atraso.
    public ArrayList<Cliente> listaClientesComAlugueisAtrasados(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Aluguel> todosAlugueis = arq.lerAlugueis();
        ArrayList<Cliente> clientesAtrasados = new ArrayList();
        
        for(int i = 0; i < todosAlugueis.size(); i++){
            if(todosAlugueis.get(i).verificarAtraso()){
                clientesAtrasados.add(todosAlugueis.get(i).getCliente());
            }
        }
        return clientesAtrasados;
    }
    
    //16. Listar todos os Alugueis (Locações) realizados finalizados ou não.
    public ArrayList<Aluguel> listaTodosOsAlugueis(){
        IOArquivos arq = new IOArquivos();
        return arq.lerAlugueis();
    }
    
    //17. Listar todos os Alugueis finalizados, ou seja, que já concluíram contrato e foram devolvidos.
//    public ArrayList<Aluguel> listaAlugueisFinalizados(){;;
//        IOArquivos arq = new IOArquivos();
//        ArrayList<Aluguel> todosAlugueis = arq.lerAlugueis();
//        ArrayList<Aluguel> alugueisFinalizados = new ArrayList();
//        
//        for(int i = 0; i < todosAlugueis.size(); i++){
//            
//        }
//    }
    
    public ArrayList<Corretor> getTodosCOrretores(){
        IOArquivos arq = new IOArquivos(); 
        return arq.lerCorretores();
    }
    
    //Buscas de cliente/corretor/imovel/seguro Especifico
    public Cliente buscaClientePorCodigo(int codigo){
        IOArquivos arq = new IOArquivos();
        ArrayList<Cliente> todosClientes = arq.lerClientes();
        if(todosClientes == null){
            JOptionPane.showMessageDialog(null, "Ainda nao existem Clientes Cadastrados!");
        }else {
            for(int i = 0; i < todosClientes.size(); i++){
                if (todosClientes.get(i).getCodigoUsuario() == codigo){
                    return todosClientes.get(i);
                }
            }
        }
        return null;
    }
    
    public Corretor buscaCorretorPorCodigo(int codigo){
        IOArquivos arq = new IOArquivos();
        ArrayList<Corretor> todosCorretores = arq.lerCorretores();
        if(todosCorretores == null){
            JOptionPane.showMessageDialog(null, "Ainda nao existem Corretores Cadastrados!");
        }else {
            for(int i = 0; i < todosCorretores.size(); i++){
                if (todosCorretores.get(i).getCodigoUsuario() == codigo){
                    return todosCorretores.get(i);
                }
            }
        }
        return null;
    }   
    
    public Imovel buscaImovelPorCodigo(int codigo){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosImoveis = arq.lerImoveis();
        if(todosImoveis == null){
            JOptionPane.showMessageDialog(null, "Ainda nao existem Imoveis Cadastrados!");
        }else {
            for(int i = 0; i < todosImoveis.size(); i++){
                if (todosImoveis.get(i).getCodigoImovel() == codigo){
                    return todosImoveis.get(i);
                }
            }
        }
        return null;
    }   
    
    public Seguro buscaSeguroPorCodigo(int codigo){
        IOArquivos arq = new IOArquivos();
        ArrayList<Seguro> todosSeguros = arq.lerSeguros();
        if(todosSeguros == null){
            JOptionPane.showMessageDialog(null, "Ainda nao existem seguros Cadastrados!");
        }else {
            for(int i = 0; i < todosSeguros.size(); i++){
                if (todosSeguros.get(i).getCodigoSeguro() == codigo){
                    return todosSeguros.get(i);
                }
            }
        }
        return null;
    }   
    
    
}
    

    

