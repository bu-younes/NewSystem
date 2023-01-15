public class Duplicate {
	public static void main(String[] args) {
		
		
 String[] names = { "Mrhoon", "Mnsoor", "Mrhoon", "Mahir", "Mrhoon", "Majid", "Mahir", "Mnal", "Mohad", "Mahmood" };
	
		findDuplicates(names);
		
	}
	public static void findDuplicates(String[] names) {
	int count;	
		
	for (int i=0;i<names.length;i++) {
		
		count =1;
		for (int j=i+1;j<names.length;j++) {
			
			if(names[i].equals(names[j])) {
				
				count = count  + 1 ;
				names[j] = "0";
			}
		}
		if (names[i]!="0")
		{
		System.out.println(names[i] +" : Is Repated "+ (count) + " Times");}
		
	}
	
}
}





















