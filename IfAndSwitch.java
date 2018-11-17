public class IfAndSwitch {

    public static void main(String[] args) {

    /* if(args.length < 3) {
         System.out.println("Zabyt malo argumentow! ");
         System.exit(-1);
     }*/

     String server;

     if(args.length < 1){
        server = "localhost";
     } else {
         server = args[0];
     }

        System.out.println(server);

     // SWITCH
        char grade = 'D';
        switch (grade){
            case 'A':
            System.out.println("Wspaniale! NDST! ");
            break;
            case 'B':
                System.out.println("Dobrze! DOP! ");
                break;
            case 'C':
                System.out.println("Może być! masz na piwo! ");
                break;
            case 'D':
                System.out.println("Zmień szkole! ");
                break;
            default:
                System.out.println("Podaj ocene jeszcze raz!");
        }

        if(grade == 'A'){
            System.out.println("Wspaniale! A! ");
        }else if (grade == 'B'){
            System.out.println("Wspaniale! B! ");
        }else if (grade == 'C'){
            System.out.println("Wspaniale! C! ");
        }else if (grade == 'D'){
            System.out.println("Wspaniale! D ");
        } else {
            System.out.println("Zmien szkole :o)");
        }

        // operator 3 argumenty

        int myScore = 5;
        int yourScore = 7;
        int bestScore;

        bestScore = myScore>yourScore?myScore:yourScore;
        System.out.println(bestScore);
    }

}
