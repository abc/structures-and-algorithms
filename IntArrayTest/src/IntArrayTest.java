
public class IntArrayTest {
	
	public static void main (String[] args)
	{
		int[] array1 = {10, 20, 30, 40 ,50};
		int[] array2 = array1;
		int[] array3 = new int[array1.length];
		
		copyArray(array1, array3);
		reverseArray(array2);
		displayArray(array1);
		displayArray(array2);
		displayArray(array3);
	}
	
	public static void displayArray (int[] array)
	{
		String output = "";
		for (int number:array)
		{
			output = output + " " + number;
		}
		
		System.out.println(output);
	}
	
	public static void copyArray (int[] arraySource, int[] arrayDestination)
	{
		for (int i = 0; i < arraySource.length; i++)
		{
			arrayDestination[i] = arraySource[i];
		}
	}
	
	public static void reverseArray (int[] array)
	{
		int[] newArray = new int[5];
				
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++)
		{
			newArray[i] = array[j];
			j--;
		}
		
		for (int i = 0; i < newArray.length; i++)
		{
			array[i] = newArray[i];
		}
		
	}

}
