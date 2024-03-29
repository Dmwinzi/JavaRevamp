import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        Vehicle vehicle  = new Vehicle();
       vehicle.carname = "Volkswagen";
        System.out.println(vehicle.carname);
        vehicle.cartype();
        vehicle.enginetype();
        vehicle.manufacturer();

        Pig pig  = new Pig();
        pig.animalsound();

        Innerclass  innerclass  = new Innerclass();
        Innerclass.Deep  inn  = innerclass.new Deep();

        System.out.println(innerclass.name + "\t" + inn.name);

        Cow cow  = new Cow();
        cow.sound();
        cow.isMammal();

        NetworkImpl  network  = new NetworkImpl();
        System.out.println("Please enter username");
        Scanner scanner  = new Scanner(System.in);
        String username  = scanner.nextLine();
        network.login(username);
        System.out.println("Would you like to exit yes/no?");
        String exit = scanner.nextLine();

        if (exit.equals("yes")){
            network.logout();
        } else  {
            System.out.println("Welcome" + username);
        }

        System.out.println("Password test enter password");
        String password =  scanner.nextLine();
        network.passwordtest(password);


        Employee employee  = new Employee("Daniel",001);
        System.out.println(employee.getName());
        System.out.println(employee.getNumber());

        Employeerecord  employeerecord  = new Employeerecord("Mwinzi",002);
        System.out.println(employeerecord.name());
        System.out.println(employeerecord.number());

        List<People> people  = new ArrayList<>();
        people.add(new People("Daniel","Mwinzi",90000,20,"Male"));
        people.add(new People("Aginetor","Wango",250000,30,"Female"));
        people.add(new People("Joseph","Kavisu",350000,40,"Male"));
        people.add(new People("Ann","Mutheu",150000,26,"Female"));
        people.add(new People("Tabitha","Muthina",100000,24,"Female"));

        //imperative
        for (People people1 : people){

            if (people1.gender.equals("Male")){
                System.out.println(people1);
            }
        }

        //Simplified the filtering
        //declaritive
        List<People> femal = people.stream().filter(female -> female.gender.equals("Female"))
                .collect(Collectors.toList());

        femal.forEach(System.out::println);

       List<People> sorted =  people.stream().sorted(Comparator.comparing(People::getAge).reversed())
               .collect(Collectors.toList());

       sorted.forEach(System.out::println);




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