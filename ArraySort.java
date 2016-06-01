import java.io.*;

public class ArraySort {

	public static void main(String[] args) throws Exception {
		
		System.out.print("Enter the number of elements you want in the array : ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		
		System.out.print("Enter " + n + " numbers : ");
		
		for(int i=0; i<5; i++){
			
			a[i] = Integer.parseInt(br.readLine());
			
		}
		
		for(int i=1; i<a.length; i++){
			
			for(int j=0; j<i; j++){
				
				if(a[j]>a[i]){
					
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					
				}
				
			}
			
		}
			
		
		System.out.println("Sorted Array is : ");
		for(int i=0; i<a.length; i++){
			
			System.out.println(a[i]);
			
		}
		
		System.out.print("Enter the number of elements you want to add : ");
		int m = Integer.parseInt(br.readLine());
		int[] b = new int[n+m];
		
		for(int i=0; i<a.length; i++){
			
			b[i] = a[i];
			
		}
		
		System.out.print("Enter " + m + " numbers : ");
		
		for( int i = n ; i<n+m ; i++){
			
			b[i] = Integer.parseInt(br.readLine());
			
			
		}
		
		
		for(int i=1; i<b.length; i++){
			
			for(int j=0; j<i; j++){
				
				if(b[j]>b[i]){
					
					int temp = b[j];
					b[j] = b[i];
					b[i] = temp;
					
				}
				
			}
			
		}
			
		
		System.out.println("Sorted Array is : ");
		for(int i=0; i<b.length; i++){
			
			System.out.println(b[i]);
			
		}

	}

}
