package marsel.lessons_1.maven.http.servlets.taskbox_4;

//import target.src.CostCalculator;


import marsel.lessons_1.maven.http.servlets.taskbox_2.CostCalculator;

public class Program {
    public static void main(String[] args){
        Table table = new Table(3, 4);
        Table bigTable = new Table(6,20);

        CostCalculator cC = new CostCalculator(2.4,10);

        double cost1 = cC.calcCoust(table, 30);
        double cost2 = cC.calcCoust(bigTable, 80);

        System.out.println(cost1);
        System.out.println(cost2);

    }
}
