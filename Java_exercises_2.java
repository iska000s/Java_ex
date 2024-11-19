import java.util.Scanner;

public class Exercises{
    

//     public static void main(String[] args){
//         System.out.println("Hello Java");
//         System.out.println("Hello Coders Lab");
//         System.out.print("Hello Coders Lab");
//         System.out.print("Hello Coders Lab");
//     }

    
    
    
    
    public static void main(String[] args){
        String name = "Iza";
        System.out.printf("Witaj, %s! ", name);
        System.out.println("Czy możemy w czymś Ci pomóc, " + name + "?");
        
        int age;
        System.out.printf("%s, czy możesz podać nam swój wiek?", name);
        System.out.println(" Wiek: ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        System.out.println("Dzięki " + name + "! " + "Teraz możesz swobodnie korzystać ze strony.");
        
        scanner.close();
        
        for(int i = 0; i <= 20; i++){
            System.out.println(i);
        }
        
    }
    
}