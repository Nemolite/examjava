import java.io.*;
class GetSimbolOfFile{
    String file;
    GetSimbolOfFile(String file) {
        this.file = file;
    }
    public void getsimbol()  throws IOException{

        FileInputStream fin = new FileInputStream(this.file);
        do{
            i = fin.read();
            if (i!=-1){
                System.out.println((char)i);
            }
        }while (i!=-1);

        fin.close();
    }
    int i;

}
public class Example4 {
    public static void main(String[] args) {
        GetSimbolOfFile getfin = new GetSimbolOfFile("D:\\Java\\myproject\\untitled\\src\\text.txt");
        try{
            getfin.getsimbol();
        } catch (IOException e){
            System.out.println("Возникли проблемы при работе с файлом");
        }


    }
}
