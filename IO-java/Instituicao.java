import java.io.*;
public class Instituicao implements Serializable{
    private String nome;
    private int money;
    public Instituicao(String nome, int money){
        this.nome = nome;
        this.money = money;
    }
    public String toString(){
        return "Instituicao{nome=" + nome + ",money=" + money + "}";
    }
}
