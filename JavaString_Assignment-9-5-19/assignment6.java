class Maystring9
{
	public static void main(String[] args) {
		String s=new String("Nitin Tyagi");
		char[] ch =s.toCharArray();
		int l=ch.length;
		for (int i=0;i<l ;i++ ) {
			if(ch[i]==' ')
			{
				char n = ch[i+1];
				System.out.println(ch[0]+ " " +n);
			}
		}
		
	}
}