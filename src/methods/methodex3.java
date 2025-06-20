package methods;

public class methodex3 {
    float num1 = 4f;
    int num2 = 4;

    public int add(float num1,int num2) {
        System.out.println("float num1=" +num1 +", int num2=" +num2);
        return 0;
    }

    public static void main(String[] args) {
        methodex3 obj = new methodex3();
        obj.add(4f,4);
    }
}
