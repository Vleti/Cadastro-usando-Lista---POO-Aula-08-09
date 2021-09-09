
package datadrivenpessoa;

public class DataDrivenPessoa {

    public static void main(String[] args) {
       Pessoa p1=new Pessoa();
       p1.setNome("João");
       p1.setEndereco("Rua A");
       p1.setTelefone("3268-7567");
       p1.setIdade(19);
       
       Pessoa p2=new Pessoa();
       p2.setNome("José");
       p2.setEndereco("Rua B");
       p2.setTelefone("3363-3412");
       p2.setIdade(23);
       
       Pessoa p3=new Pessoa();
       p3.setNome("Ana");
       p3.setEndereco("Rua C");
       p3.setTelefone("3523-1254");
       p3.setIdade(34);
               
       Pessoa p4=new Pessoa();
       p4.setNome("Julia");
       p4.setEndereco("Rua D");
       p4.setTelefone("3397-4256");
       p4.setIdade(21);
               
       Pessoa p5=new Pessoa();
       p5.setNome("Maria");
       p5.setEndereco("Rua E");
       p5.setTelefone("3391-7461");
       p5.setIdade(53);
       
       CadastraPessoa cadastro=new CadastraPessoa();
       cadastro.addPessoa(p1);
       cadastro.addPessoa(p2);
       cadastro.addPessoa(p3);
       cadastro.addPessoa(p4);
       cadastro.addPessoa(p5);
       cadastro.imprimirPessoas();
    }
}
