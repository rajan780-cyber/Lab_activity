package test;

public class TestVowels {
	public int countVowels(char[] CharArr) {
		int count = 0;
		for (char ch : CharArr) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			try {
				if(ch=='x') {
					System.out.println("Checkrd exception");
					
				}
			}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			return count;
		}
		public static void main(String[] args) {
			TestVowels obj =new TestVowels();
			char[] CharArray= {'a','b','c','d','e','x','u'};
			int countValueOfVowel=obj.countVowels(CharArray);
			System.out.println(countValueOfVowel);
		}
	}

