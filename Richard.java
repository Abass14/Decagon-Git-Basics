public class Richard extends Abass{
    private int age;
    public Richard (String name, int age){
        super(name);
        System.out.println("This is " + name + "'s " + "age: " + age);
     }

     public static void main(String[] args) {
         Richard a = new Richard("Richard", 17);
         Abass b = new Richard("Abass", 25);

     }
}
