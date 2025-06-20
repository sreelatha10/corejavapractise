package methods;

public class methodex3 {
    String name = "Bottle";
    int num = 3;

    public int display(String n, int a) {
        System.out.println("String name = " + n);
        System.out.println("int num = "+ a);
        return a;
    }

    public static void main(String[] args) {
        methodex3 obj = new methodex3();
        obj.display("Bottle" , 3);

    }
}
