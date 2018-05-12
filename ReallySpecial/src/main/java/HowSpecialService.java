import org.apache.commons.math3.distribution.NormalDistribution;

public class HowSpecialService {

    public static void main(String[] args) {

        System.out.println(howSpecialAmI( 20 ));

    }

    private static double howSpecialAmI(double yourGrade) {

        return new NormalDistribution(9.77, 4.42).cumulativeProbability(yourGrade);
    }
}