package Java;
import static com.almasb.fxgl.dsl.FXGL.random;

import java.util.Scanner;
public class batalha {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("qual personagem você quer ser cleiton ou junior");// a bet ksksksk
        String escolha = sc.nextLine();
        if(escolha.equalsIgnoreCase("cleiton")){
            System.out.println("otima escolha");
        }
        else if(escolha.equalsIgnoreCase("junior")){
            System.out.println("foda");
        }
        else{
            System.out.println("escreva direito  asdasddawdasddw");
            return;
        }
        perso play = new perso();
        play.nome = "junior";
        play.vida = 100;
        play.dano = 25; 
        perso mons = new perso();
        mons.nome = "cleiton";
        mons.vida = 120; // cleiton é melhor e mais forte
        mons.dano = 26;
        while (play.vida >0 && mons.vida >0){
            play.atacar(mons);
            if (mons.vida <= 0) {
                System.out.println("monstro foi mogado betinha");
                break;
            }
            mons.atacar(play);
            if (play.vida <= 0){
                System.out.println("mogged");
                break;
            }
        }
        if(play.vida >0) {
            System.out.println("o vencedor foi " + play.nome);
        }
        else {
            System.out.println("o vencedor foi "+ mons.nome);
        }
        
    }
    public static class perso{
    String nome;
    int vida;
    int dano;
    void atacar(perso alvo){
        alvo.vida -= dano;
    }
    }
}
