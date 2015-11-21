class calculator{

public static void printArray(int[] array){
for(int i=0; i<array.length;i++)
System.out.println(array[i]);
}

public static void printArray(char[] array){
for(int i=0; i<array.length;i++)
System.out.println(array[i]);
}

public static int add2Numbers(int a, int b){
return a+b;
}

public static boolean primeNumber(int a){
for(int i=2;i<a;i++){
if(a%i==0)
return false;
}
return true;
}

public static double calculateSpeed(double dis, double time){
return dis/time;
}

public static boolean checkFibonacci(double a){
double first=0,sum=0;
double tmp=0;
int flag=0;
for(int i=0;i<=a;i++){
if(sum<1)
sum=sum+i;
else{ 
tmp=sum;
sum=sum+first;
first=tmp;
}
if(a/sum == 1)
flag=1;
}
if(flag==1)
return true;
else 
return false;
}

public static double reverseDouble(double a){
double tmp=a;
double tmp2=a*1000;
int front=0;
int div=1;
while(tmp>1){
tmp=tmp/10;
front++; 
}
while(tmp2%10==0){
tmp2=tmp2/10;
}
long x =(long)tmp2;
long i=0;
while(x>0){
i=(i*10) + (x % 10);
x=x/10;
}
while(front>0){
div=div*10;
front--;
}
double z = (double)i/(div);
return z;
}

public static int biggestOfThree(int a,int b,int c){
if(b/a ==0 && c/a ==0)
return a;
else if(a/b ==0 && c/b ==0)
return b;
else 
return c;
}

public static int[] reverseArray(int[] array){
int[] reverse = new int[array.length];
int i=0,j=array.length-1;
while(i<array.length){
reverse[i]=array[j];
i++;
j--;
}
return reverse;
}

public static int sumOfArray(int[] array){
int sum=0;
for(int i=0;i<array.length;i++)
sum=sum+array[i];
return sum;
}

public static int numberOfVowels(char[] array){
int count=0;
for(int i=0; i<=array.length-1; i++){
if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
count++;
}
return count;
}

public static int[] sortIntArray(int[] array){
int tmp=0;
for(int i=0;i<array.length;i++){
for(int j=i+1;j<array.length;j++){
if(array[i]>array[j]){
tmp = array[j];
array[j]=array[i];
array[i]=tmp;
}
}
}
return array;
}

public static char[] sortCharArray(char[] array){
char tmp;
for(int i=0;i<array.length;i++){
for(int j=i+1;j<array.length;j++){
if(array[i]>array[j]){
tmp = array[j];
array[j]=array[i];
array[i]=tmp;
}
}
}
return array;

}

}


