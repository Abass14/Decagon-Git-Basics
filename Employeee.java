public class Employeee {
        private String name;
        private String address;
        private int number;
     
        public Employeee(String name, String address, int number) { //The Super class Constructor
           System.out.println("Constructing an Employee");
           this.name = name;
           this.address = address;
           this.number = number;
        }
     
        public void mailCheck() {
           System.out.println("Mailing a check to " + this.name + " " + this.address);
        }
     
        public String toString() {
           return name + " " + address + " " + number;
        }
     
        public String getName() {
           return name;
        }
     
        public String getAddress() {
           return address;
        }
     
        public void setAddress(String newAddress) {
           address = newAddress;
        }
     
        public int getNumber() {
           return number;
        }

}
