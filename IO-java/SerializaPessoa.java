import java.io.*;
import java.nio.charset.*;

public class SerializaPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Jeffrey", 21, 1.75, "senha");
        try(ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("pessoa.dat"))){
                oos.writeObject(p);
            }catch(IOException e){
                e.printStackTrace();
            }
        try(ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("pessoa.dat")
        )){
            Pessoa lida = (Pessoa) ois.readObject();
            System.out.println("Lido" + lida);
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}