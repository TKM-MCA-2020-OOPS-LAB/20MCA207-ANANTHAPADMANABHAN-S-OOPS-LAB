public class product{
    int pcode;
    String pname;
    int price;
    int lowest;
    void data(int a, String b, int c){
        pcode=a;
        pname=b;
        price=c;
    }
    void display(){
        System.out.println(pcode+"\t"+pname+"\t\t"+price);
        
    }  
    static void findlowest(int price1,int price2, int price3){
    if(price1<=price2 && price1<=price3){
        System.out.println("\n Product 1 is of the lowest ");
        
    }
        
    else if(price2<=price1 && price2<=price3){
        System.out.println("\n Product 2 is of the lowest ");
        
    }
    else{
        System.out.println("\n Product 3 is of the lowest ");
        
    }
    
   }
  public static void main(String[] args){
        product x = new product();
        product y = new product();
        product z = new product();
        x.data(101,"Product 1",68);
        y.data(102,"Product 2",92);
        z.data(103,"Product 3",34);
        x.display();
        y.display();
        z.display();
        findlowest(x.price,y.price,z.price);    
        
    }
}
