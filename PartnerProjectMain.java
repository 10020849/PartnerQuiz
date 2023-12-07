


public class PartnerProjectMain {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        NumberOperation2 addOperation = (x, y) -> {
            int sum = 0;
            for (int i = x; i <= y; i++)
                sum += i;
            return sum;
        };
        int result = addOperation.operate(a, b);
        System.out.println(result);
    }
}
