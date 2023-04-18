package String_Programs;

public class SwapFirstAndLastwordsInAGivenString {

	public static void main(String[] args) {
		String s="I am a software engineer";//Engineer  am a siftware I
		String[] st=s.split(" ");
		//st[0]=I, st[1]=am, st[2]=a ....
		//int a=10;
		//int b=20;
		//int temp=a;
		//a=b;
		//b=temp;
		String temp=st[0];
		st[0] =st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]+" ");
			
		}
		

	}

}
