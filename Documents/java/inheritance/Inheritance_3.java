class Father {

String home1 ="Father's Home";

public void goodBehaviour() {
System.out.println("F.Good_Behaviour");
}
}

class Son extends Father {
@Override
public void goodBehaviour() {
System.out.println("S.Good_Behaviour");
super.goodBehaviour();
}
}

class Test {

public static void main(String[] args){
 
Son x = new Son();
x.goodBehaviour();

}

}
