class Product{
	String pcode;
	String pname;
	double price;
	Product(String c,String n,double p){
		pcode = c;
		pname = n;
		price = p;
	}
}
class ProductClass{
	public static void main(String args[]){
		Product p1 = new Product("1232","PC",80000);
		Product p2 = new Product("7654","Laptop",60000);
		Product p3 = new Product("8357","TV",20000);
		if(p1.price < p2.price && p1.price < p3.price){
			System.out.println(p1.pname+" has lowest Price");
		}else if(p2.price < p2.price){
			System.out.println(p2.pname+" has lowest Price");
		}else{
			System.out.println(p3.pname+" has lowest Price");
		}
	}
}
