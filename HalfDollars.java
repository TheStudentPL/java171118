public class HalfDollars {

    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000, 1_000_000, 2_400_000 };
        int[] philadelphia = {1_800_000, 5_000_000, 2_500_000, 2_500_000, 2_500_000};
        int[] total = new int [denver.length];
        int average;
        int sum = 0;

        for(int i = 0; i< denver.length;i++){
            total[i] = denver[i] + philadelphia[i];
            System.out.println("Produkcja w " + (2012 + i) + " : ");
            System.out.format("%,d%n", total[i]);
            sum+=total[i];
        }

        average = sum / denver.length;

        System.out.println("Srednia produkcja: ");
        System.out.format("%,d%n", average);
    }
}
