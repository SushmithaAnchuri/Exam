
class JavaString{
	public static void main(String[] args) {
		
		
		String str="I am Sushmitha";
		System.out.println("Before replacing"+str);
		
		String str1=str.replaceAll(" ","%20");
		System.out.println("After replacing:"+str1);
	}
}