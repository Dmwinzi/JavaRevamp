public class Practical {

    int x = 6;
    final double pi = 3.14;

    public Practical(String name) {
        System.out.println("Hello" + name);
    }

    public void add(int y){
        int sum = y + x;
        System.out.println(sum);
    }

   public static void Hello(){
        System.out.println("I am static");
    }

}
