class StringDemo
{
	public static void main(String[] args) {
		String s=new String("Hello I am Nitin Tyagi");
		char[] ch =s.toCharArray();
		int l=ch.length;
		for (int i=0;i<l ;i++ ) {
			if(ch[i]==' ')
			{
				System.out.print("#");
			}
			else{
			System.out.println(ch[i]);
		}
		}
		
	}
}
