package comp;
public class complex{
int real,img ;
public static void main(String[] args) {
complex x =new complex();
complex y =new complex();
x.real=3;
x.img=5;

y.real=6;
y.img=9;

System.out.println("1st:"+"\n"+"real:"+x.real+"\t"+"imaginory:"+x.img+"i");
System.out.println("2nd:"+"\n"+"real:"+y.real+"\t"+"imaginory:"+y.img+"i");

complex sum =new complex();
sum.real=x.real+y.real;
sum.img=x.img+y.img;

System.out.println("Sum:"+sum.real+"+"+sum.img+'i');


}
}