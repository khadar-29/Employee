public class Employee {
    String name;
    int id;
    double salary;
    String cell;
    Employee(String n, int i, double s, String c){
        this.name=n;
        this.id=i;
        this.salary=s;
        this.cell=c;
    }
    void displayinfo(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);
        System.out.println("Employee cell : "+cell);
    }
    public static void main(String[] args){
        Employee emp1=new Employee("KV",21,50000,1234567789);
        emp1.displayinfo();
    }
}
