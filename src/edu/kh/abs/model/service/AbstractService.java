package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeBird;
import edu.kh.abs.model.vo.TypeMammlia;
import edu.kh.abs.model.vo.TypePisces;
import edu.kh.abs.model.vo.Whale;

public class AbstractService {
	
	//TypeBird
	//TypeMammlia
	//TypePisces
	
	public void ex1() {
		//포유류
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		
		//조류
		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		
		//어류
		Shark shark = new Shark();
		
			
		
		/*
		dog.eat();
		dog.cry();
		dog.move();
		
		
		cat.eat();
		cat.cry();
		cat.move();
		*/
		
		
		// Animal animal = new Animal();
		// 추상클래스는 객체로 만들 수 없지만, 타입으로서의 역할은 한다.
		
		TypeMammlia[] mammlia = new TypeMammlia[] { cat, dog, whale };
		TypeBird[] bird = new TypeBird[] { chicken, eagle, penguin };
		TypePisces[] pisces = new TypePisces[] { shark };
		
		Animal[] animal = new Animal[] {
				cat, dog, whale, 
				chicken, eagle, penguin, 
				shark
		};
		
		for(int i = 0; i < animal.length; i++) {
			
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			
			// 만약 animal중에 타입이 고양이 일 때
			// 수유를 한다 == breastfeed()출력
			if(animal[i] instanceof Cat) {
				System.out.println("====== 고양이는요 ======");
				((Cat)animal[i]).breastFeed();
				// 고양이가 소속되어있는 포유류만 가지고 있던 수유를 하다 메소드.
				// Cat 클래스에서 오버라이딩을 재정의된 내용이 출력된다.
				System.out.println("====== 이렇습니다. ======");
			}
			
			if(animal[i] instanceof Eagle) {
				System.out.println("====== 독수리는요 ======");
				Eagle eg = (Eagle) animal[i];
				eg.fly(); // TypeBird에서 일반메서드로 정의한 내용
				System.out.println("====== 이렇습니다. ======");
			}
			
			if(animal[i] instanceof Shark) {
				System.out.println("====== 상어는요 ======");
				Shark sh = (Shark) animal[i];
				sh.swimming();
				
				System.out.println("====== 이렇습니다. ======");
			}
		}
		
	}
}
