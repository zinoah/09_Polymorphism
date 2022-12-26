package edu.kh.iner.model.service;

import edu.kh.inter.model.vo.Cat;
import edu.kh.inter.model.vo.Chicken;
import edu.kh.inter.model.vo.Dog;
import edu.kh.inter.model.vo.Eagle;
import edu.kh.inter.model.vo.Penguin;
import edu.kh.inter.model.vo.Shark;
import edu.kh.inter.model.vo.Whale;
import edu.kh.inter.model.vo.TypeBird;
import edu.kh.inter.model.vo.TypeMammlia;
import edu.kh.inter.model.vo.TypePisces;
import edu.kh.inter.model.vo.WaterLife;

public class InterpaceService {
	
	
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
		
		WaterLife[] waterlife = new WaterLife[] {
			whale,  penguin,  shark
		};
		
		for(int i = 0; i < waterlife.length; i++) {
			waterlife[i].water();
			// 관계가 전혀 없는 것들의 관계를 만들어주는게 인터페이스!
			// 고래 상어 팽귄을 묶어줄 수 있는 이유가
			// WaterLife라는 인터페이스가 있기 때문이다.
		}
		
	}
}
