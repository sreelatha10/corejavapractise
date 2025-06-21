package methods;

public class methodex2 {
    String name = "bulb";

     int cost = 5;

    public void display(String n, int c) {
        System.out.println("String name=" + n);
        System.out.println("int cost=" + c);

    }

    public static void main(String[] args) {
        methodex2 obj = new methodex2();
        obj.display(obj.name, obj.cost);
    }
}