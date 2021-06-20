public class Employee {

    String empName;
    int empAge;
    double empSalary;

    public Employee (int age){
        this.empAge = age;
    }

    public void setName(String name) {
        empName = name;
    }

    public void setSalary(double salary) {
        empSalary = salary;
    }

    // public void getAge(){
    //     System.out.println("Age: " + empAge);
    // }

    // public void getSalary(){
    //     System.out.println("Salary: " + empSalary);
    // }

   public void printEmployee(){
       System.out.println("Name: " + empName);
       System.out.println("Age: " + empAge);
       System.out.println("Salary: " + empSalary);

   }

}
