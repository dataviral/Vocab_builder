package main;
import com.aviral.Employee;

class Test{

public static void main(String[] args){
Employee v,w,x,y,z;
v= new Employee("A01",31,100000);
w= new Employee();
x= new Employee("Z03",24,213132);
y= new Employee();
z= new Employee("XZ21",43,141142);

System.out.println();
System.out.println();
System.out.println();
System.out.println(v.id+"  "+v.age+"  "+v.salary);
System.out.println();
System.out.println(w.id+"  "+w.age+"  "+w.salary);
System.out.println();
System.out.println(x.id+"  "+x.age+"  "+x.salary);
System.out.println();
System.out.println(y.id+"  "+y.age+"  "+y.salary);
System.out.println();
System.out.println(z.id+"  "+z.age+"  "+z.salary);
System.out.println();

}

}
