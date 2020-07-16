public class BmiService {
    public float calculate(float height, float weight) {
        float bmi = weight * 10000 / height / height;
        return bmi;
    }
}
