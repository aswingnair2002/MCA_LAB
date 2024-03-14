class CPU{
	double price;
	CPU(double p){
		price = p;
	}
	void disp(){
		System.out.println("CPU Price : "+price);
	}
	class Processor{
		int noc;
		String manufact;
		Processor(int n,String m){
			noc = n;
			manufact = m;
		}
		void disp(){
			System.out.println("No of cores : "+noc);
			System.out.println("Processor Manufacurers : "+manufact);
		}
	}
	static class RAM{
		int memory;
		String manufact;
		RAM(int me,String ma){
			memory = me;
			manufact = ma;
		}
		void disp(){
			System.out.println("RAM Memory : "+memory);
			System.out.println("RAM Manufacurers : "+manufact);
		}
	}
}
class Computer{
	public static void main(String args[]){
		CPU cpu1 = new CPU(20000);
		CPU.Processor p1 = cpu1.new Processor(6,"INTEL");
		CPU.RAM r1 = new CPU.RAM(8,"HP");
		System.out.println("Details :");
		cpu1.disp();
		p1.disp();
		r1.disp();
	}
}
