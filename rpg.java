package Java;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import javax.management.timer.Timer;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class rpg {
    // definindo variaveis 
   static int xp = 0;
   static int lvl = 0;
   static int hp = 0;
   static int forca = 0;
   static int gold = 0;
   static int magia = 0;
    @SuppressWarnings("unused")
    public static void main(String[] args){
        ArrayList<String> inv = new ArrayList<>();
        inv.add("espada de pedra");
        inv.add("poção");
        inv.add("espada do escolhido");
        inv.add("escudo");
        inv.add("armadura");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        while (true) {
        int pontos = 80;;
        System.out.println("escolha seus pontos de status");
        System.out.println("você tem " + pontos + " pontos");
        System.out.println("quantos pontos de força?");
        String pt = sc.nextLine();
        int ptint;
        try {
            ptint = Integer.parseInt(pt);
        } catch (NumberFormatException e) {
            System.out.println("digite um número válido");
            continue;
        }
        if (ptint > 80){
            System.out.println("muitos pontos");
            continue;
        }
        if (ptint <= 0) {
            System.out.println("pontos negativos");
            continue;
        }
        else {
            System.out.println( "você tem 80 pontos");
        }
        if(pt.equalsIgnoreCase(pt)) {
            System.out.println("você colocou "+ ptint + " pontos em força");
            pontos -= ptint;
            forca += ptint;
        }
        if (pontos <= 0){
            System.out.println("pontos zerados começando game");
            break;
        }
        System.out.println("você tem "+ pontos +" pontos");
        System.out.println("quantos pontos de magia");
        String mg = sc.nextLine();
        int mgint = Integer.parseInt(mg);
        if (mgint > 80){
            System.out.println("muitos pontos");
            continue;
        }
        if (mgint <= 0){
            System.out.println("pontos negativos");
            continue;
        }
        else {
            System.out.println("você tem "+ pontos +" pontos");
            
        }
        if (mg.equalsIgnoreCase(mg)){
            System.out.println("você colocou "+ mgint + " pontos em Magia");
            pontos -= mgint;
            magia += mgint;
            System.out.println(mgint);
            System.out.println(pontos);
        }
        if (pontos <= 0){
            System.out.println("pontos zerados iniciando game");
            break;
        }
        System.out.println("você tem "+ pontos +" pontos");
        System.out.println("quantos pontos que colocar de hp/vida");
        String vd = sc.nextLine();
        int vdint = Integer.parseInt(vd);
        if (vdint > 80) {
            System.out.println("muito pontos");
            continue;
        }
        if (vdint <= 0){
            System.out.println("pontos negativos");
            continue;
        }
        else {
            System.out.println("você tem "+ pontos +" pontos");
            
        }
        if (vd.equalsIgnoreCase(vd)){
            System.out.println("você colocou "+ pontos +" pontos");
            System.out.println("pontos de vida são multiplicados");
            pontos -= vdint;
            hp += vdint * 2;
        }
        try{
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
        break;
        }
        System.out.println("qual é seu nome");
        String nome = sc.nextLine();
        
        System.out.println("olá " + nome); 
        while (true) {
            System.out.println("deseja lutar");
            String lutar = sc.nextLine(); 
            if (lutar.equalsIgnoreCase("sim")){
                if (r.nextInt(1, 100 + 1) <= 50){
                    System.err.println("você chega em um monstro");
                    monstro(args, sc);
                    break;
                }
                else{
                    System.out.println("você não encontra nenhum monstro");
                    floresta(args, sc, r);
                    break;
                }
        }
        else if(lutar.equalsIgnoreCase("não")){
            System.err.println("ok");
            break;
        }
        else{
            System.out.println("resposta invalida!");
            continue;
        }
        }
        sc.close();
    }
    public static void monstro(String[] args, Scanner sc){
        Random r = new Random();
        int fc_mns = 4;
        int hp_mns = 35;
        int dano;
        System.out.println("preprarandom luta!");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Luta iniciada!");
        while (hp > 0 && hp_mns > 0) {
            System.out.println("vida atual: " + hp);
            System.out.println("vida do monstro: " + hp_mns);
            System.err.println("'1' atacar");
            System.err.println("'2' defender");
            String deseja = sc.nextLine();
            if (deseja.equalsIgnoreCase("1")){
                if (r.nextInt(1, 100) <= 35) {
                    System.out.println("monstro esquivou");
                }
                else {
                    dano = forca + r.nextInt(1, 9 + 1);
                    System.out.println("você causou " + dano + " de dano no monstro");
                    if (r.nextInt(1, 100 + 1) <= 20 ) {
                        dano *=3;
                        System.out.println("CRITICO! você causou " + dano + " de dano no monstro");
                    }
                    hp_mns -= dano;
                }
            }
            else if (deseja.equalsIgnoreCase("2")) {
                if (r.nextInt(1, 100 + 1) <= 35) {
                   System.out.println("você defendeu");
                   continue;
                }
                else {
                    System.out.println("você não defendeu");
                }
            }
            else {
                System.err.println("é '1' ou '2' entendeu");
                continue;
            }
            if (hp_mns <= 0) {
                System.out.println("você matou o monstro");
                gold += 10;
                xp += 120;
                System.out.println();
                System.out.println("você ganhou 10 de ouro e 120 de xp");
                break;
            }
            if (hp <= 0) {
                System.err.println("game over");
                main(null);
                break;
            }
            // turno do monstro
            if (r.nextInt(1, 100 + 1)<= 30) {
                System.out.println("você esquivou do monstro");
                continue;
            }
            else {
                dano = fc_mns + r.nextInt(1, 8 + 1);
                if (r.nextInt(1, 100)<= 30) {
                    System.out.println("o monstro deu um critico em você");
                    dano *= 2;
                }
                hp -= dano;
                System.out.println("o monstro deu " + dano + " de dano");
            }
        }
    }
    public static void floresta(String[] args, Scanner sc, Random r) {
        if (xp > 200) {
            System.out.println("parabéns você subiu de Level");
            lvl = 1;
            xp = 0;
            System.out.println(lvl);
            System.out.println(xp);
        }
    }
}   

