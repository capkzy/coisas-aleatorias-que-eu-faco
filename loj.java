import java.util.random.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
@SuppressWarnings("all")
public class loj {
    static String arroz = "arroz";
    static String feijao = "feijão";
    static String macarrao = "macarrão";
    static String carne = "carne";
    static String frango = "frango";
    static String peixe = "peixe";
    static String leite = "leite";
    static String ovos = "ovos";
    static String pao = "pão";
    static String queijo = "queijo";
    static String manteiga = "manteiga";
    static String wagyu = "carne Wagyu";
    static ArrayList <String> mercado = new ArrayList<String>();
    static int mercadoria;
    static int dinheiro = 10;
    static Compras mercad = new Compras();
    static Scanner sc = new Scanner(System.in);
    static Produtos prod = new Produtos();
    public static void main(String[] args){
        while (true){
        System.out.println("bem vindo ao mercado do jão suas mercadorias ate agora são: "+ mercadoria + " mercadorias \n");
        System.out.println("deseja comprar algo (1) = sim ,(2) = não, (3) = ver produtos, (4) = sair");
        String comprar = sc.nextLine();
        if (comprar.equalsIgnoreCase("1")){
            System.out.println("caminhando até a loja");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
            mercad.produtos_venda(null);
            break;
        }
        else if (comprar.equalsIgnoreCase("2")){
            System.out.println("continuando...");

        }
        else if(comprar.equalsIgnoreCase("3")){
            System.out.println("executando silaba 123...");
            for(int i = 0; i < 3; i++){
                System.out.println(".");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
                System.out.println("..");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
                System.out.println("...");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
            }
            prod.ver_produtos(null);
        }
        else if(comprar.equalsIgnoreCase("4")){
            System.out.println("saindo...");
            for(int i = 0; i < 1; i++){
                System.out.println(".");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
                System.out.println("..");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
                System.out.println("...");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.err.println("erero bora bill");
                }
            }
            return;
        }
        else{
            System.out.println("digite (1) (2) (3) ou (4) para sair");
            continue;
        }
    }
    }
    public static class Produtos{
        void ver_produtos(String produtos){
            System.out.println(mercado);
        }

    }
    public static class Compras{
        void produtos_venda(String produto){
            while (true){
            System.out.println("produtos a venda: \n");
            System.out.println("1 - arroz, 5$, kg \n");
            System.out.println("2 - feijão, 3$, kg \n");
            System.out.println("3 - macarrão, 6$, 100g \n");
            System.out.println("4 - carne, 25$, kg \n");
            System.out.println("5 - frango, 16$, kg \n");
            System.out.println("6 - peixe, 15$, kg \n");
            System.out.println("7 - leite, 5$ \n");
            System.out.println("8 - ovos, 10$, 20 unidades \n");
            System.out.println("9 - pão, 20$, 30 unidades \n");
            System.out.println("10 - queijo, 3$ \n");
            System.out.println("11 - manteiga, 4$ \n");
            System.out.println("12 - carne Wagyu, 400$ , kg \n");
            System.out.println();
            System.out.println("deseja comprar qual? digite o numero do produto \n");
            System.out.println("ou deseja cancelar a comprar digite (0) \n");
            String deseja = sc.nextLine();
            if (dinheiro <= 0){
                System.out.println("dinheiro insuficiente para comprar qualquer produto");
                loj.main(null);
            }
            else if (deseja.equalsIgnoreCase("1")){
                mercadoria++;
                dinheiro -= 5;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.arroz);
            }
            else if (deseja.equalsIgnoreCase("2")){
                mercadoria++;
                dinheiro -= 3;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.feijao);
            }
            else if (deseja.equalsIgnoreCase("3")){
                mercadoria++;
                dinheiro -= 6;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.macarrao);
            }
            else if (deseja.equalsIgnoreCase("4")){
                mercadoria++;
                dinheiro -= 25;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.carne);
            }
            else if (deseja.equalsIgnoreCase("5")){
                mercadoria++;
                dinheiro -= 16;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.frango);
            }
            else if (deseja.equalsIgnoreCase("6")){
                mercadoria++;
                dinheiro -= 15;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.peixe);
            }
            else if (deseja.equalsIgnoreCase("7")){
                mercadoria++;
                dinheiro -= 5;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.leite);
            }
            else if (deseja.equalsIgnoreCase("8")){
                mercadoria++;
                dinheiro -= 10;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.ovos);
            }
            else if (deseja.equalsIgnoreCase("9")){
                mercadoria++;
                dinheiro -= 20;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.pao);
            }
            else if (deseja.equalsIgnoreCase("10")){
                mercadoria++;
                dinheiro -= 3;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.queijo);
            }
            else if (deseja.equalsIgnoreCase("11")){
                mercadoria++;
                dinheiro -= 4;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.manteiga);
        }
        else if (deseja.equalsIgnoreCase("12")){
                mercadoria++;
                dinheiro -= 400;
                System.out.println("compra realizada com sucesso! \n");
                loj.mercado.add(loj.wagyu);
            }
            else{
                System.out.println("produto não encontrado, tente novamente");
                produtos_venda(null);
                continue;
            }
            }
        }
    }
}
