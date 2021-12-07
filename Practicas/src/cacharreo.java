import java.lang.reflect.Array;

public class cacharreo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {1,2,3,4};
		int [] array2 = array1;
		array2[0]=22;
		array1[0]=33;
		array2[2]=55;
		
		for(int i =0;i<array1.length;i++) {
			
			System.out.println(array1[i]);	
		}
for(int i =0;i<array2.length;i++) {
			
			System.out.println(array2[i]);	
		}
	}

}
		
		 
		 
	 
	 

