class Glav{
    void examp(){
        System.out.println("Galv");
    }
}

class PotGlav1 extends Glav{
    void examp(){
        System.out.println("PotGlav1");
    }
}

class PotGlav2 extends Glav{
    void examp(){
        System.out.println("PotGlav2");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Glav obj = new Glav();
        PotGlav1 obj1 = new PotGlav1();
        PotGlav2 obj2 = new PotGlav2();

        Glav tester;
        tester = obj;
        tester.examp();

        tester = obj1;
        tester.examp();

        tester = obj2;
        tester.examp();


    }
}
