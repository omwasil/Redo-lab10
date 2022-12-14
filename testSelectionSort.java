import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	private SelectionSort temp;

	@Test
	void test() {
		//fail("Not yet implemented");
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		}
		    public testSelectionSort() {
		    }
		    
		    public void testPositive(){
		        int[] arr = new int[5];
		        arr[0] = 8;
		        arr[1] = 9;
		        arr[2] = 7;
		        arr[3] = 10;
		        arr[4] = 2;
		        
		        int[] Sortedarr = new int[5];
		        Sortedarr[0] = 2;
		        Sortedarr[1] = 7;
		        Sortedarr[2] = 8;
		        Sortedarr[3] = 9;
		        Sortedarr[4] = 10;
		        
		        SelectionSort temp = new SelectionSort();
		        arr = temp.basicSelectionSort(arr);
		      
		        /** add tests to check for this unit test **/
		        assertArrayEquals(Sortedarr, arr);
	}
		    
		    public void testNegative(){
		        
		        /** Test data contains negative values only **/
		    	int[] arr = new int[5];
		        arr[0] = -8;
		        arr[1] = -9;
		        arr[2] = -7;
		        arr[3] = -10;
		        arr[4] = -2;
		        
		        int[] Sortedarr = new int[5];
		        Sortedarr[0] = -10;
		        Sortedarr[1] = -9;
		        Sortedarr[2] = -8;
		        Sortedarr[3] = -7;
		        Sortedarr[4] = -2;
		        
		        temp = new SelectionSort();
		        arr = temp.basicSelectionSort(arr);
		         
		         assertArrayEquals(Sortedarr, arr);
		    }
		    
		    public void testMixed(){
		        
		        /** Test data contains with both positive, negative and zeros **/
		    	int[] arr = new int[5];
		        arr[0] = 8;
		        arr[1] = -9;
		        arr[2] = 0;
		        arr[3] = -10;
		        arr[4] = 2;
		        
		        int[] Sortedarr = new int[5];
		        Sortedarr[0] = -10;
		        Sortedarr[1] = -9;
		        Sortedarr[2] = 0;
		        Sortedarr[3] = 2;
		        Sortedarr[4] = 8;
		        
		        temp = new SelectionSort();
		        arr = temp.basicSelectionSort(arr);
		         
		         assertArrayEquals(Sortedarr, arr);
		    }
		    
		    public void testDuplicates(){
		        
		        /** Test data contains duplicates **/
		            int[] arr = new int[5];
		            arr[0] = 8;
		            arr[1] = 8;
		            arr[2] = 2;
		            arr[3] = 10;
		            arr[4] = 10;
		            
		            int[] Sortedarr = new int[5];
		            Sortedarr[0] = 2;
		            Sortedarr[1] = 8;
		            Sortedarr[2] = 8;
		            Sortedarr[3] = 10;
		            Sortedarr[4] = 10;
		            
		            temp = new SelectionSort();
		            arr = temp.basicSelectionSort(arr);
		             
		             assertArrayEquals(Sortedarr, arr);
		    }

}
