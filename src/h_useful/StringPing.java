package h_useful;

public class StringPing {
	
	public static void main(String[] args) {
		
		/*
		 * --------------------- String 클래스의 생성자와 메서드 ---------------------
		 * String(String s)			: 주어진 문자열(s)를 갖는 String인스턴스를 생성한다.
		 * ex) 						: String s = new String("Hello");
		 * result)					: s = "Hello"
		 */
		
		/*
		 * String(char[] value)		: 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
		 * ex)						: char[] c = {'H','e','l','l','o'};
		 * 							: String s = new String (c);
		 * result)					: s = "Hello" 
		 */
		
		/*
		 * String(StringBuffer buf)	: StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
		 * ex)						: StringBuffer sb = new StringBuffer ("Hello");
		 * 							: String s = new String (sb);
		 * result)					: s = "Hello"
		 */
		
		/*
		 * char charAt(int index)	: 지정된 위치(index)에 있는 문서를 알려준다. ( index는 0부터 시작 )
		 * ex)						: String s = "Hello";
		 * 							: String n = "0123456";
		 * 							: char c = s.charAt (1);
		 * 							: char c2 = n.charAt (1);
		 * result)					: c = 'e'
		 * 							: c2 = '1'
		 */
		
		/*
		 * int compareTo (String str)	: 문자열(str)과 사전순서로 비교한다. 같으면, 0을 사전순으로 이전이면 음수를 이후면 양수를 반환한다.
		 * ex)							: int i = "aaa".compareTo ("aaa");
		 * 								: int i2 = "aaa".compareTo ("bbb");
		 * 								: int i3 = "bbb".compareTo ("aaa");
		 * result)						: i = 0
		 * 								: i2 = -1
		 * 								: i3 = 1
		 */
		
		/*
		 * String concat (String str)	: 문자열(str)을 뒤에 덧 붙인다.
		 * ex)							: String s = "Hello";
		 * 								: String s2 = s.concat(" World");
		 * result)						: s2 = "Hello World"
		 */
		
		/*
		 * boolean contains (CharSequence s)	: 지정된 문자열(s)이 포함되었는지 검사한다.	
		 * ex)									: String s = "abcedfg";
		 * 										: boolean b = file.endsWith("txt");
		 * result)								: b = true
		 */
		
		/*
		 * boolean endWith(String suffix)		: 지정된 문자열(suffix)로 끝나는지 검사한다.
		 * ex)									: String file = "Hello.txt";
		 * 										: boolean b = file.endsWith("txt");
		 * result)								: b = true
		 */
		
		/*
		 * boolean equals(Object obj)			: 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		 * ex)									: String s = "Hello";
		 * 										: boolean b = s.equals("Hello");
		 * 										: boolean b2 = s.equals("hello");
		 * result)								: b = true
		 * 										: b2 = false
		 */
		
		/*
		 * boolean equalsIgnoreCase (String str)	: 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교한다.
		 * ex)										: String s = "Hello";
		 * 											: boolean b = s.equalsIgnoreCase("HELLO");
		 * 											: boolean b2 = s.equalsIgnoreCase("heLLo");
		 * result)									: b = true
		 * 											: b2 = true
		 */
		
		/*
		 * int indexOf (int ch)					: 주어진 문자(ch)가 문자열에 존재하는지 확인 하여 위치(index)를 알려준다. 못찾으면 -1을 반환한다. (index는 0부터 시작)
		 * ex)									: String s = "Hello";
		 * 										: int idx1 = s.indexOf('p');
		 * 										: int idx2 = s.indexOf('k');
		 * result)								: idx1 = 4
		 * 										: idx2 = -1
		 */
		
		/*
		 * int indexOf(int ch, int pos)			: 주어진 문자(ch)가 문자열에 존재하는지 지정된 위체(pos)부터 확인하여 위치(index)를 알려준다. 못찾으면 -1을 반환한다.(index는 0부터 시작)
		 * ex)									: String s = "Hello";
		 * 										: int idx1 = s.indexOf('e', 0);
		 * 										: int idx2 = s.indexOf('e', 2);
		 * result)								: idx1 = 1
		 * 										: idx2 = -1
		 */
		
		/*
		 * int indexOf(String str)				: 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다.(index는 0부터 시작)
		 * ex)									: String s = "ABCDEFG";
		 * 										: int idx = s.indexOf("CD");
		 * result)								: idx = 2
		 */
		
		/*
		 * String intern()						: 문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
		 * ex)									: String s = new String("abc");
		 * 										: String s2 = new String("abc");
		 * 										: boolean b = (s==s2);
		 * 										: boolean b2 = s.equals(s2);
		 * 										: boolean b3 = (s.intern () == s2.intern ());
		 * result)								: b = false
		 * 										: b2 = true
		 * 										: b3 = true
		 */
		
		/*
		 * int lastIndexOf(int ch)				: 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.
		 * ex)									: String s = "java.lang.Object";
		 * 										: int idx1 = s.lastIndexOf('.');
		 * 										: int idx2 = s.indexOf('.');
		 * result)								: idx1 = 9
		 * 										: idx2 = 4
		 */
		
		/*
		 * int lastIndexOf(String str)			: 지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.
		 * ex)									: String s = "java.lang.java";
		 * 										: int idx1 = s.lastIndexOf("java");
		 * 										: int idx2 = s.indexOf("java");
		 * result)								: idx1 = 10
		 * 										: idx2 = 0
		 */
		
		/*
		 * int length()			: 문자열의 길이를 알려준다.
		 * ex)					: String s = "Hello";
		 * 						: int length = s.length();
		 * result				: length = 5
		 */
		
		/*
		 * String replace(char old, char nw)	: 문자열 중의 문자(old)를 새로운 문자(nw)로 바꾼 문자열을 반환한다.
		 * ex)									: String s = "Hello";
		 * 										: String s1 = s.replace('H','C');
		 * result)								: s1 = "Cello"
		 */
		
		/*
		 * String replace (CharSequence old, CharSequence nw)	: 문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다.
		 * ex)													: String s = "Hellollo";
		 * 														: String s1 = s.replace("ll","LL");
		 * result)												: s1 = "HeLLoLLo"
		 */
		
		/*
		 * String relaceAll (String regex, String replacement)	: 문자열 중에서 지정된 문자열(regex)과 일치 하는 것을 새로운 문자열(replacement)로 모두 변경한다.
		 * ex)													: String ab = "AABBAABB";
		 * 														: String r = ab.replaceAll("BB","bb");
		 * result)												: r = "AAbbAAbb"
		 */
		
		/*
		 * String replaceFirest (String regex, String replacement)	: 문자열 중에서 지정된 문자열(regex)과 일치 하는 것 중, 첫 번째 것만 새로운 문자열(replacement)로 변경한다.
		 * ex)														: String ab = "AABBAABB";
		 * 															: String r = ab.replaceFirst("BB","bb");
		 * result)													: r = "AAbbAABB"
		 */
		
		/*
		 * String[] split(String regex)				: 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		 * ex)										: String animals = "dog,cat,bear";
		 * 											: String[] arr = animals.split(",");
		 * result)									: arr[0] = "dog"
		 * 											: arr[1] = "cat"
		 * 											: arr[2] = "bear"
		 */
		
		/*
		 * String[] split(String regex, int limit)	: 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다. 단, 문자열 전체를 지정된 수(limit)로 자른다.
		 * ex)										: String animals = "dog,cat,bear";
		 * 											: String[] arr = animals.split(",",2);
		 * result)									: arr[0] = "dog"
		 * 											: arr[1] = "cat,bear"
		 */
		
		/*
		 * boolean startsWith (String prefix)		: 주어진 문자열(prefix)로 시작하는지 검사한다.
		 * ex)										: String s = "java.lang.Object";
		 * 											: boolean b = s.startsWith("java");
		 * 											: boolean b2 = s.dstartsWith("lang");
		 * result)									: b = true
		 * 											: b2 = false
		 */
		
		/*
		 * String substring(int begin)				: 주어진 시작위치(bgin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다. 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다. (begin <= x < end)
		 * String substring(int begin, int end)		
		 * ex)										: String s = "java.lang.Object";
		 * 											: String c = s.substring(10);
		 * 											: String p = s.substring(5,9);
		 * result)									: c = "Object"
		 * 											: p = "lang"
		 */
		
		/*
		 * String toLowerCase()				: String 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
		 * ex)								: String s = "Hello";
		 * 									: String s1 = s.toLowerCase();
		 * result)							: s1 = "hello"
		 */
		
		/*
		 * String toString()				: string 인스턴스에 저장되어 있는 문자열을 반환한다.
		 * ex)								: String s = "Hello";
		 * 									: String s1 = s.toString();
		 * result)							: s1 = "Hello"
		 */
		
		/*
		 * String toUpperCase()				: String 인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다.
		 * ex)								: String s = "Hello";
		 * 									: String s1 = s.toUpperCase();
		 * result)							: s1 = "HEELO"
		 */
		
		/*
		 * String trim()					: 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
		 * ex)								: String s = "   Hello World  ";
		 * 									: String s1 = s.trim();
		 * result)							: s1 = "Hello World"
		 */
		
		/*
		 * static String valueOf(boolean b)		: 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우, toString()을 호출한 결과를 변환한다.
		 * static String valueOf(char c)
		 * static String valueOf(int i)
		 * static String valueOf(long l)
		 * static String valueOf(float f)
		 * static String valueOf(double d)
		 * static String valueOf(Object o)
		 * ex)									: String b = String.valueOf(true);
		 * 										: String c = String.valueOf('a');
		 * 										: String i = String.valueOf(100);
		 * 										: String l = String.valueOf(100L);
		 * 										: String f = String.valueOf(10f);
		 * 										: String d = String.valueOf(10.0);
		 * 										: java.util.Date dd = new java.util.Date();
		 * 										: String date = String.valueOf(dd);
		 * result)								: b = "true"
		 * 										: c = "a"
		 * 										: i = "100"
		 * 										: l = "100"
		 * 										: f = "10.0"
		 * 										: d = "10.0"
		 * 										: date = "Web Jan 27 21:26:29 KST 2016"
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
