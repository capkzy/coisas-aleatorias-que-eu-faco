import java.io.*;
@SuppressWarnings("all")
public class io {
    public static void main(String[] args) {
         try (BufferedReader brr = new BufferedReader(new FileReader("/home/capkzy/vscode/linguagens/java/sla.txt"));
            BufferedWriter br = new BufferedWriter(new FileWriter("/home/capkzy/vscode/linguagens/java/falha.txt"));){
            String linha;
            while((linha = brr.readLine()) != null){
            if (linha.contains("BORA")){
                br.write(linha);
                br.newLine();
                
            }
        }
         }
         catch(IOException e){
            System.out.println("ererp");
         }
    }
}
