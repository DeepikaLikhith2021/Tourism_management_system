package string_array;

public class SegrregatethenumberandSpecialchar {

	public static void main(String[] args) {
		String st="a34bc@1H8fR*M;";
		char ch[]=st.toCharArray();
		String alpha="";
		String spechar="";
		String number="";

		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9')
			{
				number=number+ch[i];
			}
			else if((ch[i]>='a'&&ch[i]<='z') ||(ch[i]>='A'&&ch[i]<='Z'))
			{
				alpha=alpha+ch[i];
			}
			else
			{
				spechar=spechar+ch[i];
			}
		}
		System.out.println(number);
		System.out.println(spechar);
		System.out.println(alpha);


	}

}
