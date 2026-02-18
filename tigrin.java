package Java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class sla {
    static int money = 3;
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<String> armas = new ArrayList<>();

    public static void main(String[] args) {
        boolean promoFinalizada = false;// deixar assim ou vai dar unreachable code
        while (!promoFinalizada) {
            System.out.println("bem vindo");
            System.out.println("deseja colocar um codigo promocional");
            String cod = sc.nextLine();

            if (cod.equalsIgnoreCase("sim")) {
                System.out.println("coloca ai pow tem uma chance");
                int chance = 1;
                String cc = sc.nextLine();

                if (cc.equalsIgnoreCase("agiota")) {
                    System.out.println("voce roubou do agiota kk");
                    money += 20;
                    System.out.println("o agiota estava pobre e voce achou so uma nota de 20 da pra apostar");
                    break;
                } else {
                    chance -= 1;
                    System.out.println("paia");
                    break;
                }

                } 
                else if (cod.equalsIgnoreCase("nop")) {
                System.out.println("ok");
                break;
            } else {
                System.out.println("resposta invalida!");
                continue;
            }
        }

        boolean escl = false; // tive que usar um pouco de gpt porque tava dando um erro que fiquei umas horas quebrando a cabeça e deu nisso 
        // mais eu vou tentar deixar o mais autentico possivel ok!
        while (!escl) {
            System.out.println("Deseja comecar!");
            String deseja = sc.nextLine();

            if (deseja.equalsIgnoreCase("sim")) {
                System.out.println("perfeito");
                tigrin(args);
                escl = true;
            } else if (deseja.equalsIgnoreCase("nop")) {
                System.out.println("ok");
                return;
            } else {
                System.out.println("Resposta invalida");
            }
        }
    }

    public static void tigrin(String[] args) {
        System.out.println("");
        while (money > 0) {
            System.out.println("Deseja apostar quanto? voce tem " + money + " moedas?");
            System.out.println("se voce quiser apostar tudo digite '4'");
            System.out.println("digite '0' para sair");
            String apst = sc.nextLine();
            if (apst.equalsIgnoreCase("0")){
                System.out.println("tigrin ta pobre e não quer que você saia");
                continue;
            }
            else if (apst.equalsIgnoreCase("1")) {
                if (money <= 0) {
                    System.out.println("voce nao tem moedas suficientes");
                    System.out.println("vai pagar o tigrin como? kk");
                    System.out.println("sobrou nada kk");
                    return;
                } else {
                    money -= 1;
                    if (r.nextInt(1, 101) <= 45) {
                        System.out.println("voce ganhou 2 moedas");
                        money += 2;
                        continue;
                    } else {
                        System.out.println("voce não ganhou");
                        continue;
                    }
                }
            }
            else if (apst.equalsIgnoreCase("2")) {
                if (money <= 0) {
                    System.out.println("voce nao tem moedas suficientes");
                    System.out.println("vai pagar o tigrin como? kk");
                    System.out.println("sobrou nada kk");
                    return;
                } else {
                    money -= 2;
                    if (r.nextInt(1, 101) <= 40) {
                        System.out.println("voce ganhou 4 moedas");
                        money += 4;
                        continue;
                    } else {
                        System.out.println("voce não ganhou");
                        continue;
                    }
                }
            }
            else if (apst.equalsIgnoreCase("3")) {
                if (money <= 0) {
                    System.out.println("voce nao tem moedas suficientes");
                    System.out.println("vai pagar o tigrin como? kk");
                    System.out.println("sobrou nada kk");
                    return;
                } else {
                    money -= 3;
                    if (r.nextInt(1, 101) <= 30) {
                        System.out.println("voce ganhou 6 moedas");
                        money += 6;
                        continue;
                    } else {
                        System.out.println("voce não ganhou");
                        continue;
                    }
                }
            }
            else if (apst.equalsIgnoreCase("4")) {
                if (money <= 0) {
                    System.out.println("voce nao tem moedas suficientes");
                    System.out.println("vai pagar o tigrin como? kk");
                    System.out.println("sobrou nada kk");
                    return;
                } else {
                    money -= money;
                    if (r.nextInt(1, 101) <= 100) {
                        money += 200;
                        money *= 2;
                        System.out.println("voce ganhou "+ money +" moedas");
                        continue;
                    } else {
                        System.out.println("voce não ganhou");
                        continue;
                    }
                }
            }
        }
        System.out.println("é mano perdeu tudo sobrou nada");
    }
}
