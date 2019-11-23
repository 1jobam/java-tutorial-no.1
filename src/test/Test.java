package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		System.out.println("나는 금사빠다.\n※금방 사랑에 빠진다 \nyes or no로 입력 해라");
		String a = c.nextLine();

		if (a.equals("yes") || a.equals("YES") || a.equals("Yes")
				|| a.equals("YEs") || a.equals("yeS") || a.equals("yES")
				|| a.equals("yEs")) {
			System.out.println("연애할 때 끌려다니는 타입이다. \nyes or no");
			a = c.nextLine();
			if (a.equals("no")) {
				System.out.println("데이트 코스는 미리 짜는게 편하다. \nyes or no");
				a = c.nextLine();
				if (a.equals("yes")) {
					System.out.println("활동적인 데이트가 좋다 \nyes or no");
					a = c.nextLine();
					if (a.equals("no")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.\nyes or no");
						a = c.nextLine();
						if (a.equals("yes")) {
							System.out.println("당신의 유형은 D유형 입니다.");
						} else if (a.equals("no")) {
							System.out.println("당신의 유형은 C유형 입니다.");
						}
						
					} else if (a.equals("yes")) {
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = c.nextLine();
						if (a.equals("yes")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = c.nextLine();
							if (a.equals("yes")) {
								System.out.println("당신의 유형은 D유형 입니다.");
							} else if (a.equals("no")) {
								System.out.println("당신의 유형은 C유형 입니다.");
							}
						} else if (a.equals("no")) {
							System.out.println("당신의 유형은 B유형 입니다.");
						}
					}

				} else if (a.equals("no")) {
					System.out.println("2감정 표현에 솔직한 편이다. \nyes or no");
					a = c.nextLine();
					if (a.equals("yes")) {
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = c.nextLine();
						if (a.equals("no")) {
							System.out.println("당신의 유형은 B유형 입니다.");
						} else if (a.equals("yes")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = c.nextLine();
							if (a.equals("yes")) {
								System.out.println("당신의 유형은 D유형 입니다.");
							} else if (a.equals("no")) {
								System.out.println("당신의 유형은 C유형 입니다.");
							}
						}
					} else if (a.equals("no")) {
						System.out.println("활동적인 데이트가 좋다. \nyes or no");
						a = c.nextLine();
						if (a.equals("yes")) {
							System.out.println("이성친구는 존재할수 업다. \nyes or no");
							a = c.nextLine();
							if (a.equals("no")) {
								System.out.println("당신의 유형은 B유형 입니다.");
							} else if (a.equals("yes")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = c.nextLine();
								if (a.equals("yes")) {
									System.out.println("당신의 유형은 D유형 입니다.");
								} else if (a.equals("no")) {
									System.out.println("당신의 유형은 C유형 입니다.");
								}
							}
						} else if (a.equals("no")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = c.nextLine();
							if (a.equals("yes")) {
								System.out.println("당신의 유형은 D유형 입니다.");
							} else if (a.equals("no")) {
								System.out.println("당신의 유형은 C유형 입니다.");
							}
						}
					}
					if (a.equals("yes") || a.equals("YES") || a.equals("Yes")
							|| a.equals("YEs") || a.equals("yeS")
							|| a.equals("yES") || a.equals("yEs")) {
						System.out.println("1감정 표현에 솔직한 편이다. \nyes or no");
						a = c.nextLine();

						if (a.equals("no")) {
							System.out.println("활동적인 데이트가 좋다. \nyes or no");
							a = c.nextLine();
							if (a.equals("no")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
								a = c.nextLine();
								if (a.equals("yes")) {
									System.out.println("당신의 유형은 D유형 입니다.");
								} else if (a.equals("no")) {
									System.out.println("당신의 유형은 C유형 입니다.");
								}
							} else if (a.equals("yes")) {
								System.out.println("이성친구는 존재할 수 없다.");
								a = c.nextLine();
								if (a.equals("no")) {
									System.out.println("당신의 유형은 B유형 입니다.");
									a = c.nextLine();
								} else if (a.equals("yes")) {
									System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
									a = c.nextLine();
									if (a.equals("yes")) {
										System.out.println("당신의 유형은 D유형 입니다.");
									} else if (a.equals("no")) {
										System.out.println("당신의 유형은 C유형 입니다.");
									}
								}
							}
						}
						} else if (a.equals("yes")) {
							System.out.println("이성친구는 존재할 수 없다. \nyes or no");
							a = c.nextLine();
							if (a.equals("no")) {
								System.out.println("당신의 유형은 B유형 입니다.");
							} else if (a.equals("yes")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = c.nextLine();
								if (a.equals("yes")) {
									System.out.println("당신의 유형은 D유형 입니다.");
								} else if (a.equals("no")) {
									System.out.println("당신의 유형은 C유형 입니다.");
								}
							}
						}
					}

					if (a.equals("yes") || a.equals("YES") || a.equals("Yes")
							|| a.equals("YEs") || a.equals("yeS")
							|| a.equals("yES") || a.equals("yEs")) {
						System.out.println("이성친구는 존재할 수 없다. \nyes or no");
						a = c.nextLine();
						if (a.equals("yes") || a.equals("YES")
								|| a.equals("Yes") || a.equals("YEs")
								|| a.equals("yeS") || a.equals("yES")
								|| a.equals("yEs")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
							a = c.nextLine();
							if (a.equals("yes") || a.equals("YES")
									|| a.equals("Yes") || a.equals("YEs")
									|| a.equals("yeS") || a.equals("yES")
									|| a.equals("yEs")) {
								System.out.println("당신의 유형은 D유형 입니다.");
							}
						}
					}

				} else if (a.equals("no") || a.equals("NO") || a.equals("No")
						|| a.equals("nO")) {
					System.out.println("감정기복이 크지 않다. \nyes or no");
					a = c.nextLine();
					if (a.equals("no") || a.equals("NO") || a.equals("No")
							|| a.equals("nO")) {
						System.out.println("감정 표현에 솔직한 편이다.\nyes or no");
						a = c.nextLine();
						if (a.equals("no") || a.equals("NO") || a.equals("No")
								|| a.equals("nO")) {
							System.out.println("활동적인 데이트가 좋다 \nyes or no");
							a = c.nextLine();
							if (a.equals("no") || a.equals("NO")
									|| a.equals("No") || a.equals("nO")) {
								System.out
										.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. \nyes or no");
								a = c.nextLine();
								if (a.equals("no") || a.equals("NO")
										|| a.equals("No") || a.equals("nO")) {
									System.out.println("당신의 유형은 C형 입니다.");
								}
							}
						}
					}	

				} else {
				System.out.println("연애 불가능 입니다.");
				}
			}
		}
	}