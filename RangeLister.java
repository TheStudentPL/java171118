public class RangeLister {

    private String name;

    public static void main(String[] args) {
        RangeLister rangeLister = new RangeLister();
        int[] range = rangeLister.makeRange(4,44);
        rangeLister.show(range);


    }
    int[] makeRange(int lower, int upper){
        int[] range = new int[(upper-lower)+1];
        for(int i = 0;i<range.length;i++){
            range[i] = lower++;
        }
        return range;
    }

    void show(int[] range){
        System.out.print("Array: [ ");
        for (int i = 0; i< range.length; i++){
            System.out.print(" "+range[i]);
        }
        System.out.println(" ]");
    }
    //uzywanie this
    void setName(String name){
        this.name = name;
    }
}
