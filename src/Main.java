public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightsm = 161.5f;
        float weightkg = 48.5f;
        float bmi = service.calculate(heightsm, weightkg);
        System.out.println(bmi);
    }
}
