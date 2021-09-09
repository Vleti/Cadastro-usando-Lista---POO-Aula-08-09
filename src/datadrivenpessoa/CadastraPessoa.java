
package datadrivenpessoa;

import java.util.ArrayList;
import java.util.List;

public class CadastraPessoa {
    //Cadastro Usando Lista
    List<Pessoa> pessoas=new ArrayList<>();
    
    
    public void addPessoa(Pessoa p){
        pessoas.add(p);
    }
    
    public void imprimirPessoas(){
        for(int i=0;i<pessoas.size();i++){
            System.out.println("Cadastro "+(i+1));
            System.out.println("Nome:"+pessoas.get(i).getNome());
            System.out.println("Endereço:"+pessoas.get(i).getEndereco());
            System.out.println("Telefone:"+pessoas.get(i).getTelefone());
            System.out.println("Idade:"+pessoas.get(i).getIdade()+"\n");
        }
    }
}
    //Usando vetores
    /*Pessoa[] pessoas=new Pessoa[3];
    int indice=0;
     
    public void addPessoa(Pessoa p){
        pessoas[indice]=p;
        indice++;
     }
     
    public void imprimirPessoas(){
        for(int i=0;i<pessoas.size();i++){
            System.out.println(pessoas.get(i).getNome());
        }
    }*/