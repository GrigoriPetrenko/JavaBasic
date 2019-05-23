package marsel.lessons_1.maven.http.servlets.taskbox_2;

public class Table implements Box {

    private int countOfLegs;
    private double weight;

    public Table(int countOfLegs, double weight){
        this.countOfLegs = countOfLegs;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
