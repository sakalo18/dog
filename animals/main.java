import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        Animal[] animals = new Animal[]{
                new Cat("Murka"),
                new Dog("Bobik"),
                new Dog("Sharik"),


        };
        // running
        System.out.println("Let them run:");
        int letItRun = sc.nextInt(); // from console
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            int dist = a.run(letItRun);
            if (letItRun > dist) {
                System.out.println(a.getKind() + " " + a.getName() + " ran " + dist + " meters.");
            } else {
                System.out.println(a.getKind() + " " + a.getName() + " cannot run.");
            }

        }
        System.out.println("Let them swim:");
        int letItswim = sc.nextInt(); // from console
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            int dist = a.run(letItswim);
            if (letItswim > dist) {
                System.out.println(a.getKind() + " " + a.getName() + " swam " + dist + " meters.");
            } else {
                System.out.println(a.getKind() + " " + a.getName() + " cannot swam.");
            }
        }
    }
}



