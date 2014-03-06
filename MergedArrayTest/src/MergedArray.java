/**
 * Created by Alastair on 3/6/14.
 */
public class MergedArray extends SortedArray implements MergedADT
{
    public MergedArray()
    {

    }

    public void display()
    {
        for (int index = 0; index < this.objectCount; index++)
        {
            System.out.println(objects[index]);
        }
    }

    public MergedArray(int size)
    {
        super(size);
    }

    public MergedADT merge(MergedADT additionalObjects)
    {
        SortedArray otherArray = (SortedArray) additionalObjects;
        MergedArray newArray = new MergedArray(this.objectCount + otherArray.objectCount);

        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < this.objectCount) && (j < otherArray.objectCount))
        {
            System.out.println("Debug. Looping some more. Details - i:" + i + " j:" + j);
            if (this.objects[i].compareTo(otherArray.objects[j]) < 0)
            {
                System.out.println("Setting a new object into newArray k:" + k + " i" + i + " item:" + this.objects[i]);
                newArray.objects[k] = this.objects[i];
                i++;
            }
            else if (this.objects[i].compareTo(otherArray.objects[j]) > 0)
            {
                System.out.println(
                        "Setting a new object into newArray k:" + k + " j" + j + " item:" + otherArray.objects[j]);
                newArray.objects[k] = otherArray.objects[j];
                j++;
            }
            else if (this.objects[i].compareTo(otherArray.objects[j]) == 0)
            {
                newArray.objects[k] = this.objects[i];
                System.out.println(
                        "Setting a new object into newArray k:" + k + " j" + j + " item:" + otherArray.objects[j]);
                i++;
                j++;
            }
            else
            {
                System.out.println("i:" + i + " j:" + j + " k:" + k + ".");
                throw new IllegalStateException("A critical error was encountered during the merge operation.");
            }
            k++;
        }
        if (i >= this.objectCount)
        {
            while (j < otherArray.objectCount)
            {
                System.out.println("Debug. Looping some more. Details - i:" + i + " j:" + j);
                newArray.objects[k] = otherArray.objects[j];
                j++;
                k++;
            }
        }
        else if (j >= otherArray.objectCount)
        {
            while (i < this.objectCount)
            {
                System.out.println("Debug. Looping some more. Details - i:" + i + " j:" + j);
                newArray.objects[k] = this.objects[i];
                i++;
                k++;
            }
        }

        newArray.objectCount = k + 1;
        return newArray;
    }
}
