package String_Programs;

public class ReverseTheSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am a software Engineer";
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+"   ");
		}

	}

}
