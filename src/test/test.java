///* 文件名 : Employee.java */
//abstract class Employee {
//    private String name;
//    private String address;
//    private int number;
//    public Employee(String name, String address, int number) {
//        System.out.println("Employee gouzao");
//        this.name = name;
//        this.address = address;
//        this.number = number;
//    }
//    public void mailCheck() {
//        System.out.println("youji to:" + this.name
//                + " " + this.address);
//    }
//    public String toString() {
//        return name + " " + address + " " + number;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getAddress() {
//        return address;
//    }
//    public void setAddress(String newAddress) {
//        address = newAddress;
//    }
//    public int getNumber() {
//        return number;
//    }
//}
///* 文件名 : Salary.java */
//class Salary extends Employee
//{
//    private double salary; // 全年工资
//    public Salary(String name, String address, int number, double salary) {
//        super(name, address, number);
//        setSalary(salary);
//    }
//    public void mailCheck() {
//        System.out.println("Salary mailCheck");
//        System.out.println("youji to" + getName()
//                + ",gongzi:" + salary);
//    }
//    public double getSalary() {
//        return salary;
//    }
//    public void setSalary(double newSalary) {
//        if(newSalary >= 0.0) {
//            salary = newSalary;
//        }
//    }
//    public double computePay() {
//        System.out.println("jisuan gongzi to:" + getName());
//        return salary/52;
//    }
//}
///* 文件名 : VirtualDemo.java */
//public class test {
//    public static void main(String [] args) {
//        Salary s = new Salary("A", "beijing", 3, 3600.00);
//        Employee e = new Salary("B", "shanghai", 2, 2400.00);
//        System.out.println("Salary to mailCheck--");
//        s.mailCheck();
//        System.out.println("\nEmployee to mailCheck--");
////        System.out.println(System.getProperty("file.encoding"));
//        e.mailCheck();
//    }
//}