package methods;

class student {
    String name = "Sreelatha";
    int age = 25;

    public void display (String n, int a){
        System.out.println("Student Name = "+ n);
        System.out.println("Student agr = "+a);

    }

    public static void main(String[] args) {
        student obj = new student();
        obj.display(obj.name,obj.age);

    }
}






