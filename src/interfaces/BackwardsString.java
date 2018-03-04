package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	
	}

	


	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String r = "";
		for (int i = 0; i < s.length(); i++) {
//			String temp = s.substring(s.length()-i,s.length()-i+1);
//			String temp2 =s.substring(1,s.length());
//			s=temp2;
//			s+=temp;
			r+=s.substring(s.length()-(i+1), s.length()-i);
		
			System.out.println(r);
		}
		s=r;
		return s;
	}

}
