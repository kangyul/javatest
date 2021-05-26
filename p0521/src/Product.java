
public class Product {
	static int count;
	int serialNo;
	String product_name;
	int price; // 가격 
	double bonusPoint;
	
	{ // 인스턴스 초기화블럭
		serialNo = ++count;	// 생성자마다 써주지 않아도 됨. 
	}
	
	Product() {
	}
	
	Product(String product_name, int price) {
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = price * 0.01;
	}

	Product(String product_name, int price, int bonusPoint) {
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
}

