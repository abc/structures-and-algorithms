public class BubbleSort
{
	public static void sort (Comparable[] array)
	{
		{
			boolean sorting = true;
			while (sorting)
			{
				boolean sorted = false;
				for (int i = 0; i < array.length; i++)
				{
					int j = i + 1;
					
					if (j != array.length)
					{
						if (array[i] != null && array[j] != null)
						{
							if (array[i].compareTo(array[j]) > 0)
							{
								Comparable iVal = array[i];
								Comparable jVal = array[j];
								
								array[i] = jVal;
								array[j] = iVal;
								sorted = true;
							}
						}
					}
				}
				
				if (sorted)
				{
					sorting = true;
				}
				else
				{
					sorting = false;
				}
			}
		}
	}
}