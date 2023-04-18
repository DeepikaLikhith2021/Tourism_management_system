package string_array;

public class SwapTheFirstAndLastWordsInSentence {

	public static void main(String[] args) {
		String s="i m from the town";
		String []sp=s.split(" ");
		String sr="";
		//METHOD-1	//if u want to make your life complicate use this
		for (int i = 0; i < 1; i++) 
		{
			if(sp[i].equals(sp[sp.length-1]))
			{
				continue;		
			}
			else
			{
				sr=sp[i];
				sp[i]=sp[sp.length-1];
				sp[sp.length-1]=sr;
			}	
		}
		for (int j = 0; j < sp.length; j++) {
			System.out.print(sp[j]+" ");
		}


		//METHOD-2
		System.out.println();
		String s1="i m from the town";
		String []sp1=s1.split(" ");
		String sr1="";
		sr1=sp1[0];
		sp1[0]=sp1[sp1.length-1];
		sp1[sp1.length-1]=sr1;
		for (int j = 0; j < sp1.length; j++) {
			System.out.print(sp1[j]+" ");
		}

	}
}