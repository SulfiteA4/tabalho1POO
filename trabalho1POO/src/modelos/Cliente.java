
package modelos;

import java.time.LocalDate;

/**
 *
 * @author Martines
 */
public class Cliente extends Usuario {
    protected LocalDate dataCadastro; 

    public Cliente(LocalDate dataCadastro, int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }


    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {  
        return "Cliente{" + "codigoUsuario=" + codigoUsuario + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", cep=" + cep + ", telefone=" + telefone + ", email=" + email +", dataCadastro=" + dataCadastro + '}';
    }
    
   
    
}