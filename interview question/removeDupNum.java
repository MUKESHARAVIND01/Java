package interview;

public class removeDupNum {

	public static void main(String[] args) {
		int arr[]= {12,3,45,3,2,2,5,6};
		
     for(int i=0;i<arr.length;i++)
		  {
			 boolean isUnique=true;
			 for(int j=0;j<i;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 isUnique=false;
					 break;
				 }
			 }
			 if(isUnique)
			 {
				System.out.println(arr[i]);
			 }
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
