
public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.product_name = "OLED TV";
		p1.price = 700;
		p1.bonusPoint = p1.price / 100;
		Product p2 = new Product("냉장고", 500); // 냉장고 500 5;
		Product p3 = new Product("세탁기", 200); // 세탁기 200 2;
		
		System.out.println("p1: " + p1.serialNo); // 1
		System.out.println("p2: " + p2.serialNo); // 2
		System.out.println("p3: " + p3.serialNo); // 3
		System.out.println("p1's price: " + p1.price);
		System.out.println("p2's price: " + p2.price);
		System.out.println("p3's price: " + p3.price);
		System.out.println("p1's bonus point: " + p1.bonusPoint);
		System.out.println("p2's bonus point: " + p2.bonusPoint);
		System.out.println("p3's bonus point: " + p3.bonusPoint);
		System.out.println("p2's product name: " + p2.product_name);
		
		System.out.println("전체count: " + Product.count + " 개");
			
	} // main

} // class
