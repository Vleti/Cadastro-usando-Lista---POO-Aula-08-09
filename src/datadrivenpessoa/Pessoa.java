
package datadrivenpessoa;


public class Pessoa {
    private String nome;                  //encapsulamento
    private String endereco;  //(atributos escondidos de acesso exteno)
    private String telefone;
    private int idade;
    
    //metodos acessores get e set
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
