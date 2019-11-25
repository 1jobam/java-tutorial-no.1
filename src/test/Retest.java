package test;

import java.util.Scanner;

public class Retest {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
	/*
	 * 인공지능기반 연애 심리 테스트 조건문 활용 작성 연습 및 과제 - 박종민
	 */
		
		System.out.println("당신의 연애 유형에 대해 알아 보시겠습니까?" + "\n연애 심리 테스트를 시작하시려면 yes를 입력해주세요.");
		String a = s.nextLine();
		
		
// 질문의 시작 Line 구분
		if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
			System.out.println("나는 금사빠다. \n※금방 사랑에 빠진다. \nyes or no");
			a = s.nextLine();
		}
			//Yes 질문 구분 Line (1)
			if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
				System.out.println("연애할때 끌려다니는 타입이다. \nyes or no");
				a = s.nextLine();
				//Yes 질문 구분 Line (1 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("감정 표현에 솔직한 편이다. \nyes or no");
					a = s.nextLine();
					//Yes 질문 구분 Line (1 - 1 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = s.nextLine();
						//Yes 질문 구분 Line ( 1 - 1 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line(1 - 1 - 1 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							//Yes 질문구분 Line(1 - 1 - 1 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						//Yes 질문 구분 Line ( 1 - 1 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							a = b.nextLine();
						}
					//Yes 질문 구분 Line ( 1 - 1 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("활동 적인 데이트가 좋다. \nyes or no");
						a = s.nextLine();
						//Yes 질문 구분 Line ( 1 - 1 - 2 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("이성친구는 존재할 수 없다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line ( 1 - 1 - 2 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = s.nextLine();
								//Yes 질문 구분 Line ( 1 - 1 - 2 -1 - 1 - 1)
								if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
									System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
									a = b.nextLine();
								}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
									System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
									a = b.nextLine();
								}
							//Yes 질문 구분 Line ( 1 - 1 - 2 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
								a = b.nextLine();
							}
						//Yes 질문 구분 Line ( 1 - 1 - 2 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line ( 1 - 1 - 2 - 2 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							//Yes 질무 구분 Line ( 1 - 1 - 2 - 2 - 1)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						}
					}
				//Yes 질문 구분 Line (1 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("데이트 코스는 미리 짜는게 편하다. \nyes or no");
					a = s.nextLine();
					//Yes 질문 구분 Line ( 1 - 2 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("활동적인 데이트가 좋다. \nyes or no");
						a = s.nextLine();
						//Yes 질문구분 Line( 1 - 2 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("이성친구는 존재할 수 없다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line ( 1 - 2 - 1 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = s.nextLine();
								//Yes 질문구분 Line ( 1 - 2 - 1 - 1 - 2 - 1)
								if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
									System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
									a = b.nextLine();
								//Yes 질문구분 Line ( 1 - 2 - 1 - 1 - 2 - 2)
								}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
									System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
									a = b.nextLine();
								}
							//Yes 질문구분 Line ( 1 - 2 - 1 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
								a = b.nextLine();
							}
						//Yes 질문구분 Line ( 1 - 2 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//Yes 질문구분 Line ( 1 - 2 - 1 - 2 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						}
					//Yes 질문구분 Line ( 1 - 2 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("감정 표현에 솔직한 편이다. \nyes or no");
						a = s.nextLine();
						//Yes 질문 구분 Line ( 1 - 2 - 2 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("이성친구는 존재할 수 없다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line ( 1 - 2 - 2 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = s.nextLine();
								//Yes 질문 구분 Line ( 1 - 2 - 2 - 1 - 2 - 1)
								if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
									System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
									a = b.nextLine();
								}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
									System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
									a = b.nextLine();
								}
							//Yes 질문 구분 Line ( 1 - 2 - 2 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
								a = b.nextLine();
							}
						//Yes 질문 구분 Line ( 1 - 2 - 2 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("활동적인 데이트가 좋다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line ( 1 - 2 - 2 - 2 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("이성친구는 존재할 수 업다. \nyes or no");
								a = s.nextLine();
								//Yes 질문 구분 Line ( 1 - 2 - 2 - 2 - 1 - 1)
								if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
									System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
									a = s.nextLine();
									//Yes 질문 구분 Line ( 1 - 2 - 2 - 2 - 1 - 1 -1)
									if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
										System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
										a = b.nextLine();
									}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
										System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
										a = b.nextLine();
									}
								//Yes 질문 구분 Line ( 1 - 2 - 2 - 2 - 1 - 2)
								}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
									System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
									a = b.nextLine();
								}
							//Yes 질문구분 Line ( 1 - 2 - 2 - 2 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = s.nextLine();
								//Yes 질문구분 Line ( 1 - 2 - 2 - 2 - 2 - 1)
								if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
									System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
									a = b.nextLine();
								//Yes 질문구분 Line ( 1 - 2 - 2 - 2 - 2 - 2)
								}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
									System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
									a = b.nextLine();
								}
							}
						}
					}
				}
			
			//Yes 질문 구분 Line (2)
			if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
				System.out.println("감정 표현에 솔직한 편이다. \nyes or no");
				a = s.nextLine();
				//Yes 질문 구분 Line (2 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("이성친구는 존재할 수 없다. \nyes or no");
					a = s.nextLine();
					//Yes 질문 구분 Line ( 2 - 1 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
						a = s.nextLine();
						//Yes 질문구분 Line ( 2 - 1 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");
							a = b.nextLine();
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							a = b.nextLine();
						}
					//Yes 질문구분 Line ( 2 - 1 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						a = b.nextLine();
					}
				//Yes 질문 구분 Line (2 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("활동적인 데이트가 좋다. \nyes or no");
					a = s.nextLine();
					//Yes 질문구분 Line ( 2 - 2 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = s.nextLine();
						//Yes 질문 구분 Line ( 2 - 2 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//Yes 질문 구분 Line ( 2 - 2 - 1 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						//Yes 질문 구분 Line ( 2 - 2 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							a = b.nextLine();
						}
					//Yes 질문구분 Line ( 2 - 2 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
						a = s.nextLine();
						//Yes 질문구분 Line( 2 - 2 - 2 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							a = b.nextLine();
						//Yes 질문구분 Line( 2 - 2 - 2 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							a = b.nextLine();
						}
					}
				}
			}
			//Yes 질문 구분 Line (3)
			if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
				System.out.println("이성친구는 존재할 수 없다. \nyes or no");
				a = s.nextLine();
				//Yes 질문 구분 Line (3 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
					a = s.nextLine();
					//Yes 질문 구분 Line ( 3 - 1 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						a = b.nextLine();
					//Yes 질문 구분 Line ( 3 - 1 - 2)
					}else if(a. equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						a = b.nextLine();
					}
				//Yes 질문 구분 Line (3 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					a = b.nextLine();
				}
			}
			//Yes 질문 구분 Line (4)
			if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
				a = s.nextLine();
				//Yes 질문 구분 Line (4 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
					a = b.nextLine();
				//Yes 질문 구분 Line (4 - 2)
				}else if(a.equals("no")){
					System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
					a = b.nextLine();
				}
			}
				
			//Yes 질문 구분 Line (5)
			if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
				System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
				a = b.nextLine();
			}
			
				
//No 질문 구분 Line(1)
			}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
				System.out.println("감정기복이 크지 않다. \nyes or no");
				a = s.nextLine();
				//No 질문 구분 Line(1 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("연락이 없어도 믿고 기다리는 편이다. \nyes or no");
					a = s.nextLine();
					//No 질문 구분 Line(1 - 1 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("당신의 유형은 A형 입니다. \nA유형은 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
						a = b.nextLine();
					//No 질문 구분 Line(1 - 1 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = s.nextLine();
						//No 질문 구분 Line(1 - 1 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//No 질문 구분 Line(1 - 1 - 1 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							//No 질문 구분 Line(1 - 1 - 1 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						//No 질문 구분 Line(1 - 1 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							a = b.nextLine();
						}
					}
				//No 질문구분 Line (1 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("감정 표현에 솔직한 편이다. \nyes or no");
					a = s.nextLine();
					//No 질문구분 Line (1 - 2 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = s.nextLine();
						//No 질문구분 Line (1 - 2 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//No 질문구분 Line ( 1 - 2 - 1 - 1 - 1 )
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다.");
								a = b.nextLine();
							//No 질문구분 Line ( 1 - 2 - 1 - 1 - 1 )
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						//No 질문구분 Line(1 - 2 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					//No 질문구분 Line (1 - 2 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("활동적인 데이트가 좋다. \nyes or no");
						a = s.nextLine();
						//No 질문구분 Line ( 1 - 2 - 2 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("이성친구는 존재할 수 없다. \nyes or no");
							a = s.nextLine();
							//No 질문구분 Line( 1 - 2 - 2 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = s.nextLine();
								//No 질문구분 Line( 1 - 2 - 2 - 1 - 1 - 1)
								if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
									System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
									a = b.nextLine();
								//No 질문구분 Line( 1 - 2 - 2 - 1 - 1 - 2)
								}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
									System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
									a = b.nextLine();
								}
								
							//No 질문구분 Line (1 - 2 - 2 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
								a = b.nextLine();
							}
						//No 질문구분 Line ( 1 - 2 - 2 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//No 질문구분 Line ( 1 - 2 - 2 - 2 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						}
					}
				}
				
		//No 질문 구분 Line (2)
			if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
				System.out.println("감정 표현에 솔직한 편이다. \nyes or no");
				a = s.nextLine();
				//No 질문 구분 Line (2 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("이성친구는 존재할 수 없다. \nyes or no");
					a = s.nextLine();
						//No 질문 구분 Line (2 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//No 질문 구분 Line (2 - 1 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								a = b.nextLine();
							//No 질문 구분 Line (2 - 1 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						//No 질문 구분 Line (2 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							a = b.nextLine();
						}
				//No 질문 구분 Line (2 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("활동적인 데이트가 좋다. \nyes or no");
					a = s.nextLine();
					//No 질문 구분 Line (2 - 2 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = s.nextLine();
						//No 질문 구분 Line ( 2 - 2 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("아무것도 아닌 일에 섭섭함이 쌓인다. \nyes or no");
							a = s.nextLine();
							//No 질문 구분 Line( 2 - 2 - 1 - 1 - 1)
							if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
								System.out.println("당신의 유형은 D유형 입니다.");
								a = b.nextLine();
							//No 질문 구분 Line( 2 - 2 - 1 - 1 - 2)
							}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
								System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								a = b.nextLine();
							}
						//No 질문 구분 Line ( 2 - 2 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							a = b.nextLine();
						}
					//No 질문 구분 Line (2 - 2 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
						a = s.nextLine();
						//No 질문구분 Line (2 - 2 - 2 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							a = b.nextLine();
						//No 질문구분 Line (2 - 2 - 2 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							a = b.nextLine();
						}
					}
				}
			}
		//No 질문 구분 Line (3)
			if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
				System.out.println("활동적인 데이트가 좋다. \nyes or no");
				a = s.nextLine();
				//No 질문 구분 Line (3 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("이성친구는 존재할 수 없다. \nyes or no");
					a = s.nextLine();
					//No 질문 구분 Line (3 - 1 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
						a = s.nextLine();
						//No 질문 구분 Line (3 - 1 - 1 - 1)
						if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
							System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							a = b.nextLine();
						//No 질문 구분 Line (3 - 1 - 1 - 2)
						}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
							System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							a = b.nextLine();
						}
					//No 질문 구분 Line (3 - 1 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("당신의 유형은 B유형 입니다. \nB유형은 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						a = b.nextLine();
					}
				//No 질문 구분 Line (3 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("아무것도 아닌 일에 숩게 섭섭함이 쌓인다. \nyes or no");
					a = s.nextLine();
					//No 질문 구분 Line (3 - 2 - 1)
					if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
						System.out.println("당신의 유형은 D유형 입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						a = b.nextLine();
					//No 질문 구분 Line (3 - 2 - 2)
					}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
						System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						a = b.nextLine();
					}
				}
			}
		//No 질문 구분 Line (4)
			if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
				a = s.nextLine();
				//No 질문 구분 Line (4 - 1)
				if(a.equals("yes") || a.equals("YES") || a.equals("Yes") || a.equals("YEs") || a.equals("yeS") || a.equals("yES")|| a.equals("yEs")){
					System.out.println("당신의 유형은 D입니다. \nD유형은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
					a = b.nextLine();
				//No 질문 구분 Line (4 - 2)
				}else if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
					System.out.println("당신의 유형은 C입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
					a = b.nextLine();
				}
			}
		//No 질문 구분 Line (5)
			if(a.equals("no") || a.equals("NO") || a.equals("No") || a.equals("nO")){
				System.out.println("당신의 유형은 C유형 입니다. \nC유형은 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
				a = b.nextLine();
			}
// 질문의 종료 Line 구분
		}else{
			System.out.println("연애 심리 테스트를 종료 하겠습니다.");
		}
	}
}
