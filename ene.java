package Java;
import java.util.Scanner;
public class ene{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //criando classe
         Energia ener = new Energia();
         //
         //definindo, objetos e variaveis e inteiros
         ener.energia = 0;
         ener.ligada = false;
         ener.enep = false;
         ener.money = 100;
        //
         while(true){
            System.out.println("dinheiro total "+ ener.money);
         System.out.println("deseja pagar a energia custa 10 reais");
         String pagar = sc.nextLine();
         if (pagar.equalsIgnoreCase("sim")){
            System.out.println("pagando");
            ener.money -= 10;
            System.out.println("dinheiro total "+ ener.money);
            ener.enep = true;
            ener.energia = 20;
            System.out.println("energia total "+ ener.energia);
            break;
         }
         else if(pagar.equalsIgnoreCase("nao")||pagar.equalsIgnoreCase("não")){
            System.out.println("ok");
            break;
         }
         else{
            System.err.println("o usuario/user não escreveu o comando direito error 404 comando não encontrado");
            System.out.println("escreva direito");
            continue;
         }
        }
        for(int i = 0; i < 51; i++){
            System.out.println();
         }
        System.out.println("deseja ligar a energia");
        String ligar = sc.nextLine();
        if(ligar.equalsIgnoreCase("sim") ||ligar.equalsIgnoreCase("yes")){
            System.out.println("ligando...");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.err.println("erro 534 erro de execução"); // einstein fez assim
            }
            if(ener.energia <=0){
                System.out.println("você não pagou a conta de energia vá pagar e quando pagar volte");
                return;
            }
            System.out.println("energia ligada");
            ener.energia();
        }
    }
    public static class Energia{
        // variaveis, objetos e inteiros
        int energia;
        boolean ligada;
        int money;
        boolean enep;
        //
        void energia(){
            while(enep){
                if(energia <=0){
                    System.out.println("energia acabou");
                    System.err.println("conclusion 456: power is out");
                    return;
                }
                System.out.println("usando energia");
                energia -= 5;
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.err.println("erro 534 erro de execução"); //to sabido
            }
            System.out.println("deseja continuar");
            String continuar = sc.nextLine();
            if(continuar.equalsIgnoreCase("sim")){
                System.out.println("continuando");
                continue;
            }
            else if(continuar.equalsIgnoreCase("nao")||continuar.equals("não")){
                System.out.println("ok");
                return;
            }
            else{
            System.err.println("o usuario/user não escreveu o comando direito error 404 comando não encontrado");
            System.out.println("escreva direito");
            continue;
            }
            }
        }
    }
}
//quase 100 linhas de codigo
//agora deu 100 linhas
//