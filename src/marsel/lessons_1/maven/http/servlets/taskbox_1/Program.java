package marsel.lessons_1.maven.http.servlets.taskbox_1;

import java.util.Scanner;

class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input mass of baggage: ");
        double weight = scanner.nextDouble();

        System.out.println("Input the distance of transport: ");
        int distance = scanner.nextInt();


        System.out.println("The transport coust: ");
        double coust = 30 * distance + 500 * weight;
        System.out.println(coust);

    }
}