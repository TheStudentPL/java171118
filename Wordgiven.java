public class Wordgiven {
    public static void main(String[] args) {

        String numb;
        numb = args[0];

        System.out.println("Wpisałeś liczbę: " + numberMethod(numb));
    }
    static long numberMethod(String number){
        String name="";
        long l=0;
        switch (number) {
            case "jeden": l = 1; break;
            case "dwa": l = 2; break;
            case "trzy": l = 3; break;
            case "cztery": l = 4; break;
            case "pięć": l = 5; break;
            case "sześć": l = 6; break;
            case "siedem": l = 7; break;
            case "osiem": l = 8; break;
            case "dziewięć": l = 9; break;
            case "dziesięć": l = 10; break;
        }
        return l;
    }
}