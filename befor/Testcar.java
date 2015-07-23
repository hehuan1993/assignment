package Claa;

class Car {
	String name;
	int price;
	int money = 0;

	Car() {
	}

	Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getname() {
		return name;
	}

	public int getprice() {
		return price;
	}
}

class BWM extends Car {
	BWM(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getname() {
		return name;
	}

	public int getprice() {
		return price;
	}
}

class QQ extends Car {
	QQ(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getname() {
		return name;
	}

	public int getprice() {
		return price;
	}
}

class CarShop {
	int money = 0;

	public void sellCar(Car c) {
		System.out.println("卖出：" + c.name + " 1 辆" + ", 价格：" + "$" + c.price);
		money += c.price;
	}

	public int getMoney() {
		return money;
	}
}

public class Testcar {
	public static void main(String[] args) {
		CarShop shop = new CarShop();
		shop.sellCar(new QQ("QQ_1", 20000));
		shop.sellCar(new QQ("QQ_1", 20000));
		shop.sellCar(new QQ("QQ_1", 20000));
		shop.sellCar(new BWM("宝马_2", 800000));
		shop.sellCar(new QQ("QQ_2", 25000));
		shop.sellCar(new BWM("宝马_1", 900000));
		System.out.println("Sale income: " + "$" + shop.getMoney());
	}
}
