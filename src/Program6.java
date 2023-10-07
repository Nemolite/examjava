// Абстрактный класс с абстрактным методом
abstract class Master{
    abstract void mymethod();
}

class SubMaster extends Master{
    void mymethod(){
        System.out.println("SubMaster");
    }
}

// Наследование абстрактного класса
abstract  class Slaver extends Master{
    abstract double slavmethod(double a, double b);
}

public class Program6 {
    public static void main(String[] args) {
        SubMaster obj = new SubMaster();
        obj.mymethod();



    }
}
