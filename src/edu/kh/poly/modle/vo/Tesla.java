package edu.kh.poly.modle.vo;

public class Tesla extends Car{// 전기차
	//Car를 상속받을 수 있도록 !  => extends Car (부모)
	
	private int betteryCapacity; // 배터리용량
	
	//기본생성자 : ctrl + space + enter 
	public Tesla() {
		super(); // Car
	}

	//매개변수 생성자: alt + shift + s -> o  드롭박스 -> 매개변수
	public Tesla(String engine, String fuel, int wheel, int betteryCapacity) {
		super(engine, fuel, wheel);
		this.betteryCapacity = betteryCapacity;
	}

	
	
	//getter setter
	
	
	public int getBetteryCapacity() {
		return betteryCapacity;
	}

	public void setBetteryCapacity(int betteryCapacity) {
		this.betteryCapacity = betteryCapacity;
	}
	
	
	//Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + betteryCapacity; 
		 //super 참조변수
	}
	
	
	
	
}
