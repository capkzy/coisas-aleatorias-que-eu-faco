import java.io.*;
public class Pessoa implements Serializable{
    private String nome;
    private int idade;
    private double altura; 
    private transient String senha;
    public Pessoa(String nome, int idade, double altura, String senha){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.senha = senha;
    }
    public String toString(){
        return "Pessoa{nome=" + nome + ",idade=" + idade + ",altura=" + altura + ",senha=" + senha + "}";
    }
}
