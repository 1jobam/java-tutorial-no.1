package i_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
	
	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환
		 */
		ArrayList<Object> list = new ArrayList<Object>(); //<> 제네릭 안에 어떤 타입을 저장해주겠다고 지정
		//제네릭을 사용할때는 아래와 같이 광범위 하지 않도록 사용한다.
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
			
		}
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//ArrayList 2차원 배열 (다차원 배열)
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		
		//
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list3.add(list4);
		//
		//
		list4 = new ArrayList<>();
		list4.add(10);
		list3.add(list4);
		//
		System.out.println(list3);
		System.out.println(list4);
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		ArrayList<Integer> dlsxm = new ArrayList<>();
		dlsxm.add(10);
		dlsxm.add(20);
		dlsxm.add(30);
		dlsxm.add(40);
		dlsxm.add(50);
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < dlsxm.size(); i++){
			sum += dlsxm.get(i);
		}
		avg = sum / dlsxm.size();
		System.out.println(sum);
		System.out.println(avg);
		
		//위에서 만든 ArrayList에 담긴 값들 중 최솟값과 최댓값을 출력해주세요.
		int max = dlsxm.get(0);
		int min = dlsxm.get(0);
		for(int i = 0; i < dlsxm.size(); i++){
			if(dlsxm.get(i) < min){
				min = dlsxm.get(i);
			}else if(dlsxm.get(i) > max){
				max = dlsxm.get(i);	
			}
		}
		System.out.println(max + "," + min);
		
		
		// 10 < 10 false 20 < 10 false 30 < 10 false 40 < 10 false 50 < 10 false
		// 10 > 10 false 20 > 10 true 30 > 10 true 40 > 10 true 50 > 10
		
		//위에서 만든 ArrayList의 값을 내림차순으로 정렬해주세요.

		for(int i = 0; i < dlsxm.size(); i++){
			for(int j = i + 1; j < dlsxm.size(); j++){
				if(dlsxm.get(i) < dlsxm.get(j)){
					int temp = dlsxm.get(i);
					dlsxm.set(i, dlsxm.get(j));
					dlsxm.set(j, temp);
				}
			}
		}
		System.out.println(dlsxm);
		
		
		
		
		
		
	}
	
}

















