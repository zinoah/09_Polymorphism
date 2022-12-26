package edu.kh.inter.model.vo;

public class Whale extends TypeMammlia implements WaterLife{

	@Override
	public void breastFeed() {
		System.out.println("고래가 수유를한다");
	}

	@Override
	public void eat() {
		System.out.println("고래가 밥을먹는다");
	}

	@Override
	public void cry() {
		System.out.println("고래가 운다");
	}

	@Override
	public void move() {
		System.out.println("고래가 움직인다");
	}

	@Override
	public void water() {
		System.out.println("고래는 물에서 사는 가장큰 포유류 입니다.");
		
	}


}
