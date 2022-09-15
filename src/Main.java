public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.85;
        double weight = 94;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);
    }
}
