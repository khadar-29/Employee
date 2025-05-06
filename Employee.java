public class Employee {
    String name;
    int id;
    double salary;
    Employee(String n, int i, double s){
        this.name=n;
        this.id=i;
        this.salary=s;
    }
    void displayinfo(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);
    }
    public static void main(String[] args){
        Employee emp1=new Employee("KV",21,50000);
        emp1.displayinfo();
    }
}
