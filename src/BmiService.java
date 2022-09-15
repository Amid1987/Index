public class BmiService {
    public double calculate(double growth, double weight) {
        double massIndex = weight / (growth * growth);
        return massIndex;
    }
}
