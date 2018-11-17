import java.awt.*;

public class ScopeTest {

    int test = 10; //typ prosty
    Point point = new Point(12,34); // obiekt

    void printTest(){
        int test = 20;
        System.out.println(test);
        System.out.println(this.test);
    }

    void changePoint(){
        point.x = 10;
        point.y = 345;
    }

    void changeTest(int test){
        test = 15;
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        //scopeTest.printTest();

        System.out.println("Test1: "+ scopeTest.test);
        System.out.println("Point: "+ scopeTest.point);
        System.out.println("----------------------------");

        scopeTest.changePoint();
        scopeTest.changeTest(12);

        System.out.println("Test2: "+ scopeTest.test);
        System.out.println("Point: "+ scopeTest.point);

    }
}
