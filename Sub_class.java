class Super_class{
    int num = 20;

    public void theMethod() {
        System.out.println("This is the super class");
    }
}
public class Sub_class extends Super_class {
    int num = 10;

    public void theMethod() {
        System.out.println("This is the Sub class");
    }

    public void method() {
        Sub_class sub = new Sub_class();

        sub.theMethod();
        super.theMethod();

        System.out.println("This is the super num variable: " + super.num);
        System.out.println("This is the sub num variable: " + sub.num);
    }

    public static void main(String[] args) {
        Sub_class theObj = new Sub_class();

        theObj.method();
    }
}
