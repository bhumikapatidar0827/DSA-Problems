class A{
int x,y;
void get(int a ,int b){
x=a;
y=b;
}
void sum(){
System.out.println("sum="+(x+y));
}
}
class B{
 	int x,y;
void get(int a ,int b){
x=a;
y=b;
}
void sub(){
System.out.println("sub="+(x-y));
}
}
class Demo125{
public static void main(String ar[]){
A a = new A();
a.get(10,20);
a.sum();
B b = new B();
b.get(2,5);
b.sub();
}
}	