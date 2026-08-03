import java.io.*;
import java.nio.charset.StandardCharsets;
public class bora {
    static String loc = "/home/capkzy/vscode/linguagens/java/src/data.dat";
    public static void main(String[] args) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(loc))){
            dos.writeInt(21);
            dos.writeDouble(20.1000);
            dos.writeBoolean(true);
            dos.writeUTF("jeffrey");
        }catch(IOException e){
            e.printStackTrace();
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream(loc))){
            int idade = dis.readInt();
            double altura = dis.readDouble();
            boolean status = dis.readBoolean();
            String nome = dis.readUTF();
            

            System.out.println("idade: "+ idade);
            System.out.println("altura: "+ altura);
            System.out.println("nome: "+ nome);
            System.out.println("status: "+ status);
        }catch(IOException e){
            e.printStackTrace();
        }
}
}
