import java.io.*;
import java.util.*;
public class SerializaMoney {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Instituicao i = new Instituicao("carlos", 1002);
        System.out.println("digite o nome da sua conta bancaria");
        String nm = sc.nextLine();
        if (nm.equals("carlos")){
            try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("money.dat"))){
                oss.writeObject(i);
            } catch(IOException e){
                e.printStackTrace();
            }
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("money.dat"))){
                Instituicao lido = (Instituicao) ois.readObject();
                System.out.println("Lido: " + lido);
            }catch(IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Nome não encontrado");
        }
    }
}
