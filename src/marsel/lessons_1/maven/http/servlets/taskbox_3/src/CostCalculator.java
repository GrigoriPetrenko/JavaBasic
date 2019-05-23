package marsel.lessons_1.maven.http.servlets.taskbox_3.src;


public class CostCalculator {
    private double kgCoust;
    private double kmCoust;

    public CostCalculator(double kgCoust, double kmCoust){
        this.kgCoust = kgCoust;
        this.kmCoust = kmCoust;
    }

    public double calcCoust(Box box, int km){

        return box.getWeight() * kgCoust + km * kmCoust;
    }
}
