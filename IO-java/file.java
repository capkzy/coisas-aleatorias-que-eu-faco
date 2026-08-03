import java.io.*;
public class file {
    public static void main(String[] args) {
        
    File dir = new File("/home/capkzy/vscode/linguagens/java/src");
        if (dir.isDirectory()){
            File[] archives = dir.listFiles();
            if (archives == null){
                System.out.println("tem nada no diretorio pow ou tá inacessivel da seus pulo mané");
                return;
            }
            System.out.println("arquivos em " + dir.getPath()+ ":");
            System.out.println();
            for (File f : archives){
                System.out.println("Name: " + f.getName());
                System.out.println("Size: "+ f.length() + " bytes");
                System.out.println("is Directory: " + f.isDirectory());
                System.out.println("is Archive: " + f.isFile());
                System.out.println();            }
            System.out.println("itens no total: "+ archives.length);
            System.out.println();
            System.out.println("ACABOU MULEKEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");

        }
    }
}
