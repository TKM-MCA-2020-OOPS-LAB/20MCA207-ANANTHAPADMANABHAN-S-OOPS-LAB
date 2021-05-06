package CPU;

public class cpu{
	float price;
	public static class ram{
		int mem;
		String manuf;
	}
	public static class processor{
		int cores;
		String manu;
	}
	public static void main(String[] args) {
		
	cpu x = new cpu();
	x.price=60000;
	cpu.ram y= new ram();
	y.mem=8;
	y.manuf="seagate";	
	cpu.processor z=new processor();
	z.cores=7;
	z.manu="Intel";
	System.out.println("CPU"+"\n"+"Price"+x.price+"\n"+"RAM"+"\n"+"Memory:"+y.mem+"\t"+"Manufacture:"+y.manuf+"\n"+"PROCESSOR"+"\n"+"Cores:"+z.cores+"\t"+"Manufacurer Processor:"+z.manu);

	
	}
}