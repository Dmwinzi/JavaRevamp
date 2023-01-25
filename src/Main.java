public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Dummmy 4 digit otp


        for (int i = 0; i < 10; i++){

            double  generate  = (Math.random() * 9000 )+ 1000;

            int gen = Double.valueOf(generate).intValue();

            System.out.println(gen);

        }

        int age  = 25;
        int votingage  = 18;

        if (age > votingage){
            System.out.println(true);
        } else  {
            System.out.println(false);
        }

        int days  = 8;

        switch (days){

            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Your own day");

        }

        //Dummy 6 Otp using while loop


        int i = 0;

        while (i < 10){

            double  generate  = (Math.random() * 9000 )+ 100000;
            int gen = Double.valueOf(generate).intValue();

            System.out.println(gen);
           i++;
        }


        String cars []  = {"Subaru","BMW","Mercedes","Audi"};

        for (String car : cars){
            System.out.println(car);
        }

        int [] [] nums  = {{1,2,3,4},{5,6,7,8}};

        System.out.println(nums[0][2] + nums[1][2]);


        for (i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                System.out.println(nums[i][j]);
            }
        }


        mymethod();

        System.out.println(add(5,6));
        add(4.5,2.2);

        System.out.println(sum(5));


        Practical prac = new Practical("Mwinzi");

        System.out.println(prac.x);
        prac.add(6);
        Practical.Hello();

        Person person = new Person();
        person.setName("Mwinzi");
        person.setAge(5);
        person.setFavcolor("Blue");
        System.out.println("Hi my name is" + person.getName());

        Constructor cons  = new Constructor("Dan",22);
        System.out.println("I am\t" + cons.age + "\t years old");


    }

    static void mymethod(){
        System.out.println("Java Method");
    }

    static int add(int x,int y){

        return x + y;
    }

    static void add(Double x, Double y){
        System.out.println(x+y);
    }

    //recursion

    static int sum(int k){

        if(k > 0){
            return k + sum( k -1);
        } else {
            return 0;
        }

    }



}