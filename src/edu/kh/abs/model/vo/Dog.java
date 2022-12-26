package edu.kh.abs.model.vo;

public class Dog extends TypeMammlia{

	@Override
	public void breastFeed() {
		System.out.println("강아지가 수유를한다");
	}
	
	@Override
	public void eat() {
		System.out.println("강아지가 밥을먹는다");
	}

	@Override
	public void cry() {
		System.out.println("강아지가 운다");
	}

	@Override
	public void move() {
		System.out.println("강아지가 움직인다");
	}

	
	
	
}
