public class swap_1 {
    public static void main(String[] args) {
       // int a=10,b=20;
       // System.out.println(a+" "+b);10 20 
       // int temp=a;
       // a=b;
       // b=temp;
       // System.out.println(a+" "+b);20 10
       int a=10,b=20;
       swap(20,30);
       System.out.println(a+" "+b);//10 20

    }
   static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);//30 20 
    }
}
