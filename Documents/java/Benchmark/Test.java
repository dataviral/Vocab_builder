import java.util.*;


class Test {
 
public static void main(String[] args) {
boolean check=false;
int ch,size;
calculator Calculator = new calculator();

System.out.println("Enter the size of the array");
Scanner i = new Scanner(System.in);
size = i.nextInt();


int[] arr = new int[size];


do {
System.out.println("Choose Complexity : \n 1.Best Case \n 2.Worst Case\n 3.Avrage Case ") ;

Scanner in = new Scanner(System.in);
ch = in.nextInt();
if(ch==1||ch==2||ch==3) {
int[] array = new int[size];
switch(ch) {

case 1: System.out.println("Array of size"+size+"created for best case");
        array = Calculator.naturalArray(size);
        check=true;
        arr=array;
        break;

case 2: System.out.println("Array of size"+size+"created for worst case");
        array = Calculator.naturalArray(size);
        array = Calculator.reverseArray(array);
        check=true;
        arr=array;
        break;

case 3: System.out.println("Array of size"+size+"created for avarage case");
        array = Calculator.randomIntArray(size);
        check=true;
        arr=array;
        break;

}
}
else
System.out.println("Invalid Option");

}while(check==false);


check=false;

do {
System.out.println("Choose Algorithm to benchmark :\n 1.Bubble Sort\n 2.Insertion Sort\n 3.Selection Sort\n4.Quick Sort \n 5.Benchmark All\n 5.Exit");
Scanner in = new Scanner(System.in);
ch = in.nextInt();
if(ch==1||ch==2||ch==3||ch==4||ch==5) {
int[] tmpArray = new int[size];
double start,finish;
switch(ch) {
case 1: System.out.println("Cloning Array initiated...\nCloning complete\nSorting in progress..."); 
        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doBubbleSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Bubble Sort completed in "+(finish-start)+"milli seconds");  
        break;

case 2: System.out.println("Cloning Array initiated...\nCloning complete\nSorting in progress..."); 
        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doInsertionSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Insertion Sort completed in "+(finish-start)+"milli seconds");  
        break;

case 3: System.out.println("Cloning Array initiated...\nCloning complete\nSorting in progress..."); 
        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doSelectionSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Selection Sort completed in "+(finish-start)+"milli seconds");  
        break;


case 4: System.out.println("Cloning Array initiated...\nCloning complete\nSorting in progress..."); 
        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doQuickSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Quick Sort completed in "+(finish-start)+"milli seconds");  
        break;

case 5: System.out.println("Cloning Array initiated...\nCloning complete\nSorting in progress..."); 
        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doBubbleSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Bubble Sort completed in "+(finish-start)+"milli seconds");
        System.out.println();
 
        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doInsertionSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Insertion Sort completed in "+(finish-start)+"milli seconds");  
        System.out.println();

        start=(double)System.currentTimeMillis();
        tmpArray=Calculator.copyArray(tmpArray,arr);
        tmpArray=Calculator.doSelectionSort(tmpArray);
        finish=(double)System.currentTimeMillis();
        System.out.println("Selection Sort completed in "+(finish-start)+"milli seconds");   
        break;

case 5: check=true;
        break;
}

}
else 
System.out.println("Invalid Option");
 
}while(check==false);
}
}
