public class Example1 {
    public static void main(String[] args) {
        int[]  nums1 =  {1,2,3,4,5};
        int[]  nums2 =  {1,0,3,0,5};

        for(int i =0;i<=4;i++){
            try {
               double res =  nums1[i] / nums2[i];
                System.out.println("Резульат= " + res );
            }
            catch (ArithmeticException e){
                System.out.println("Warning! Divader on zero");
                System.out.println(e);
            }
        }
    }

}
