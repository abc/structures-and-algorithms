/**
 * Created by Alastair on 3/6/14.
 */
public class MergedArray extends SortedArray implements MergedADT
{
    public void display()
    {
        Debug.print("Yo!" + this.objectCount);
        if (this.objectCount > 0)
        {
            for (int index = 0; index < this.objectCount; index++)
            {
                System.out.println(objects[index]);
            }
        }
    }

    public MergedArray(int size)
    {
        super(size);
    }

    public MergedADT merge(MergedADT additionalObjects)
    {
        Debug.print("I got to here...");

        SortedArray otherArray = (SortedArray) additionalObjects;
        MergedArray newArray = new MergedArray(this.objectCount + otherArray.objectCount);

        int i = 0;
        int j = 0;
        int k = 0;

        Debug.print("This: " + this.objectCount + " other:" + otherArray.objectCount);
        while ((i < this.objectCount) && (j < otherArray.objectCount))
        {
            Debug.print("Debug. Looping some more. Details - i:" + i + " j:" + j);
            if (this.objects[i].compareTo(otherArray.objects[j]) < 0)
            {
                Debug.print("Setting a new object into newArray k:" + k + " i" + i + " item:" + this.objects[i]);
                newArray.objects[k] = this.objects[i];
                i++;
                k++;
                newArray.objectCount = k;
            }
            else if (this.objects[i].compareTo(otherArray.objects[j]) > 0)
            {
                Debug.print(
                        "Setting a new object into newArray k:" + k + " j" + j + " item:" + otherArray.objects[j]);
                newArray.objects[k] = otherArray.objects[j];
                j++;
                k++;
                newArray.objectCount = k;
            }
            else if (this.objects[i].compareTo(otherArray.objects[j]) == 0)
            {
                newArray.objects[k] = this.objects[i];
                Debug.print(
                        "Setting a new object into newArray k:" + k + " j" + j + " item:" + otherArray.objects[j]);
                i++;
                j++;
                k++;
                newArray.objectCount = k;
            }
            else
            {
                Debug.print("i:" + i + " j:" + j + " k:" + k + ".");
                throw new IllegalStateException("A critical error was encountered during the merge operation.");
            }
        }
        if (i >= this.objectCount)
        {
            while (j < otherArray.objectCount)
            {
                Debug.print("Debug. Looping some more. Details - i:" + i + " j:" + j);
                newArray.objects[k] = otherArray.objects[j];
                j++;
                k++;
                newArray.objectCount = k;
            }
        }
        else if (j >= otherArray.objectCount)
        {
            while (i < this.objectCount)
            {
                Debug.print("Debug. Looping some more. Details - i:" + i + " j:" + j);
                newArray.objects[k] = this.objects[i];
                i++;
                k++;
                newArray.objectCount = k;
            }
        }

        return newArray;
    }
}
