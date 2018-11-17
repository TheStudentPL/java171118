public class Loops {
    public static void main(String[] args) {
    //FOR
        for (int i=1;i<10;i++){
            System.out.println("Petla skonczona: < 100 "+i);
        }
    //WHILE
        int i = 0;
        while (i<10){
            System.out.println("Zmien haslo! ");
            i++;
        }
    //DO WHILE
        int j = 0;
        do {
            System.out.println("OBIAD! ");
            j++;
            } while (j <10);

        // BREAK
        final String EXIT = "dwa";
        String[] str = {"raz", "dwa", "trzy"};
        int k = 0;
        while(k<str.length){
            /*if(str[k].equals(EXIT)){
                break;
            }*/
            System.out.println(str[k]);
            k++;
        }

    for (int m = 0; m<10;m++){
            for (int n = 0; n<10;n++){
                System.out.println("i= "+m+", j= "+n);
            }
    }

    }

}
