package e_oop;

import java.util.*;

public class AirConditioner {
	
	public static void main(String[] args) {
		
		AirConditioner air = new AirConditioner();
		
		air.power();
		System.out.println(air.power);
		air.airVolume();
		air.airVolume();
		System.out.println(air.airVolume);
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		air.temperatureUp();
		System.out.println(air.temperature);
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		air.temperatureDown();
		System.out.println(air.temperature);
	}

	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
	}
	
	//온도 + 버튼
	void temperatureUp(){
		if(power && temperature < 30){
			temperature++;
		}
	}
	
	//온도 - 버튼
	void temperatureDown(){
		if(power && 18 < temperature){
			temperature--;
		}
	}
	
	//풍량  버튼
	void airVolume(){
		if(power){
			if(3 < ++airVolume){
				airVolume = 1;
			}
		}
	}
	
	//온도가 18 ~ 30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	
	
	
	
	
	
	
	
	
	
	
}
