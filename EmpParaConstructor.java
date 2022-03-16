package DemoPack;

public class EmpParaConstructor {
    String Empname;
    long EmpSalary;
    int  Empid;
    String EmpDesignation;
    String EmpPlace;
    public EmpParaConstructor() {
        System.out.println("Default constructor");
    }
       public EmpParaConstructor(String name,String title,String city,int num,long sal){
        this.EmpDesignation=title;
        this.EmpPlace=city;
        this.Empname=name;
        this.Empid=num;
        this.EmpSalary=sal;
        System.out.println("Employee Name:  "+name);
        System.out.println("Employee Id:  "+num);
        System.out.println("Employee PLace : "+city);
        System.out.println("Employee Title : "+title);
        System.out.println("Empplyee Salary : "+sal);
    }


    public static void main(String[] args) {
        EmpParaConstructor emp=new EmpParaConstructor();
        emp.EmpSalary=15678903l;
        emp.Empid=15056789;
        emp.EmpPlace="Pune";
        emp.EmpDesignation="Senior Consultant";
        emp.Empname="XYZP";
        System.out.println("Name:  "+emp.Empname+"   Designation:  "+emp.EmpDesignation+"  City:  "+emp.EmpPlace+"   Id:  "+emp.Empid+"  Salary:  "+emp.EmpSalary);

        EmpParaConstructor emp1=new EmpParaConstructor("Saritha","Java Developer","Hyderabad",16032022,100000l);

    }
}
