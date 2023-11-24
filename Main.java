public class Main {
    public static void main(String[] args) {
        // Employee em1 = new Employee("1", "chanadee", 30000);
        // em1.displayEmployee();

        // เข้าถึง static attribute จากคลาส Employee ได้โดยไม่ต้องสร้าง object
        // int result = Employee.minSalary;
        // System.out.println(result);

        // String nameCompany = Company.NAME;
        // System.out.println(nameCompany);
        // int createYear = Company.createAt;

        // System.out.printf("%s create at year %d%n", nameCompany, createYear);
        // Company.aboute();

        // Programmer pro1 = new Programmer("P2", "Beer");
        // pro1.setSalary(50000);
        // pro1.displayEmployee();

        // Accounting ac1 = new Accounting("AC1", "Yoyo");
        // ac1.setSalary(25000);
        // ac1.displayEmployee();

        //interface
        Ironman ir = new Ironman();
        ir.setName("Ironman");
        ir.setAge(35);
        ir.displayHero();
    }
}
