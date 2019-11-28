package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		/*
		 * << 배열 >>
		 * - int[] number = new int[5]; // 기본값으로 초기화 된다.
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 */
		
		// 배열은 참조형 타입 입니다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] int를 저장할 수 있는 5개의 공간 --> 0부터 시작하는 공간이다.
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);
		
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 저장해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등) - > int타입들만
		
		String arrayStr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3};
		//값의 개수로 배열의 길이가 정해진다. --> 배열의 크기는 변경 할수없다.
		
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
		int[] iArray3;
//		iArray3 = {1, 2, 3} //컴파일 에러 발생
		
		array[0] = 10; // 배열 array 0 번에 원하는 값을 저장
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; // 마지막 인덱스는 "배열의 길이 - 1" 이다.
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] iiiarray = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요.
		iiiarray[0] = 1;
		iiiarray[1] = 2;
		iiiarray[2] = 3;
		iiiarray[3] = 4;
		iiiarray[4] = 5;
		iiiarray[5] = 6;
		iiiarray[6] = 7;
		iiiarray[7] = 8;
		iiiarray[8] = 9;
		iiiarray[9] = 10;
		
		//모든 인덱스에 있는 값의 합계를 출력해주세요.
		int sum = 0;
		sum += iiiarray[0];
		sum += iiiarray[1];
		sum += iiiarray[2];
		sum += iiiarray[3];
		sum += iiiarray[4];
		sum += iiiarray[5];
		sum += iiiarray[6];
		sum += iiiarray[7];
		sum += iiiarray[8];
		sum += iiiarray[9];
		System.out.println(sum);
		
		//index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
			                  
		}
		//배열의 길이를 알고 있다고 숫자를 사용하는 것을 하드코딩 이라고 한다.
		// 길이를 알더라도 length를 사용하는것이 더 좋은 코드이다.
		
		for(int i = 0; i < array.length; i++){
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));
		
		//배열에 숫자를 담고 합계와 평균을 구해보자.
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0;
		double avg = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		avg = (double)sum / numbers.length;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		//향상된 for문
		for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}
		
		//배열에 저장된 숫자들 중 최솟값과 최대값을 찾아주세요.
		int min, max;
		max = numbers[0];
		min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++){
			if(max < numbers[i]){
				max = numbers[i];
			}
			if(numbers[i] < min){
				min = numbers[i];
			}
		}
		System.out.println("최대 : " + max + " 최소 : " + min);

		//배열의 값을 섞어주세요.
		//0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환한다.
		
		
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		for(int i = 0; i < shuffle.length * 10; i++){
			int temp = shuffle[0];
			int random = (int)(Math.random() * shuffle.length);
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int[] too = new int[10];
		for(int i = 0; i < 500; i++){
			int dom = (int)(Math.random() * 10) + 1;
			too[dom-1]++;
			System.out.println(i); 
		}
		System.out.println(Arrays.toString(too));
		
		int az = 0;
		for(int z = 0; z < too.length; z++){
			az += too[z];
		}System.out.println(az);

		
		
	}

}