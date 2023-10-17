import java.io.*;
public class Example3 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = new FileInputStream("D:\\Java\\myproject\\untitled\\src\\text.txt");
        do{
            i = fin.read();
            if (i!=-1){
                System.out.println((char)i);
            }
        }while (i!=-1);

        fin.close();

    }
}
