class Father {
    double innerVar1;
    Father(double var1){
        this.innerVar1 = var1;
    }
}

class Child extends Father{
    double innerVar2;
    int innerVar3;

    Child(double var2,int var3){

        super(var2);
        this.innerVar3 = var3;

    }
}

public class Program4 {
    public static void main(String[] args) {
       Father obj1 = new Father(22.3);
       Child obj2 = new Child(11.2, 57);
       Father exobj = obj1;
       Father ex2obj = obj2;  // Ссылка на объект подкласса

    }
}
