class test{
public static void main(String[] args){

System.out.println("sum of 2 numbers =" +calculator.add2Numbers(10,15));

System.out.println("the no is prime : " +calculator.primeNumber(13));

System.out.println("the speed is :" +calculator.calculateSpeed(20,5));

System.out.println("the number present in fibonacci series :"+ calculator.checkFibonacci(15));

System.out.println("reverse of the double is :" + calculator.reverseDouble(123.45));

System.out.println("Biggest of the there numbers is :" + calculator.biggestOfThree(345,2123,1124));

int[]array = {1,5,6,4,3,9};
System.out.println("the reversed array is ");
calculator.printArray(calculator.reverseArray(array));

System.out.println("the sum of array is :" +calculator.sumOfArray(array));

char[]array2 = {'a','v','i','r','a','l'};
System.out.println("the number of vowvels in array is :" + calculator.numberOfVowels(array2));

System.out.println("the sorted integer array is " );
calculator.printArray(calculator.sortIntArray(array));

System.out.println("the sorted charecter array is " );
calculator.printArray(calculator.sortCharArray(array2));



}
}
