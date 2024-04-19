package powerpackage;

public class FindPower {
    public static int compute(int base, int power) {
        int result = 1;
        while(power != 0) {
            result *= base;
            power --;
        }
        return result;
    }
}
