


import java.io.Serializable;
public class System {

		 
    // Main Method
   public static void main(String[] args)
   {
 
	  

		// TODO Auto-generated method stub
	   String[] names = { "Mrhoon", "Mnsoor", "Mrhoon", "Mahir", "Mrhoon", "Majid", "Mahir", "MAjed", "Mohad", "Mahmood" };
		
		findDuplicates(names);
		
	}
	 static void findDuplicates(String[] names) {
	int repated=0;	
		
	for (int i=0;i<names.length;i++) {
		int count =0;
		if(repated<names.length) {
		for (int j=i;j<names.length;j++) {
			if(names[i].toLowerCase().equals(names[j].toLowerCase())) {
				count++;
			}
		}
		repated+=count;
		System.out.println(names[i] +" > is repated "+ (count-1) + " times");}
		
	}
	}}













