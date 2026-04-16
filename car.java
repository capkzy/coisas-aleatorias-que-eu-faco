package Java;
import java.util.Scanner;
public class car {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Nave nav = new Nave();
        nav.voar = false;
        nav.combustivel = 100;
        System.out.println("deseja ligar o motor");
        String deseja = sc.nextLine();
        if (deseja.equalsIgnoreCase("sim")){
            nav.ligar(nav);
            System.out.println("nivel de combustivel "+ nav.combustivel);
        }
        else if(deseja.equalsIgnoreCase("nao" ) ||  deseja.equalsIgnoreCase("não")){
            System.out.println("ok");
            return;
        }
        else{
            System.out.println("escreva direito");
        }
        if (nav.combustivel <= 0 ){
            System.out.println("acabou o combustivel");
            return;
        }
        System.out.println("deseja voar");
        String voar = sc.nextLine();
        if(voar.equalsIgnoreCase("sim")){
            nav.voar = true;
            nav.voar();
        }
        else if (voar.equalsIgnoreCase("nao") || voar.equalsIgnoreCase("não")){
            System.out.println("kitando do game tchauuuu");
            return;
        }
        else{
            System.out.println("escreva direito!");
            return;
        }
    }
    public static class Nave{
        String nave;
        int combustivel;
        boolean voar;
        void ligar(Nave ligar){
            combustivel -= 10;
            System.out.println("ligando motor");
            
        }
        void voar(){
           while(voar) {
            System.out.println("voando...");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.err.println("a nave acabou caindo!");
            }
            combustivel -= 10;
            if (combustivel <= 0){
                System.out.println("acabou o combustivel");
                break;
            }
            System.out.println("deseja continuar");
            String continuar = sc.nextLine();
            if (continuar.equalsIgnoreCase("sim")){
                System.out.println("continuando!");
                System.out.println("nivel de combustivel "+ combustivel);
                continue;
            }
            else if(continuar.equalsIgnoreCase("nao") || continuar.equalsIgnoreCase("não")){
                System.out.println("pousando a nave!");
                break;
            }
            else{
                System.out.println("escreva direito");
                return;
            }
           }
        }
    }
}
