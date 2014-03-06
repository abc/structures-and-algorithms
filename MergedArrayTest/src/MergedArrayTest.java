/**
 * Created by Alastair on 3/6/14.
 */
public class MergedArrayTest
{
    public static void main(String[] args)
    {
        MergedArray testArray1 = new MergedArray();
        MergedArray testArray2 = new MergedArray();

        testArray1.insert(5);
        testArray1.insert(8);
        testArray1.insert(10);
        testArray1.insert(15);
        testArray1.insert(20);

        testArray2.insert(3);
        testArray2.insert(7);
        testArray2.insert(15);
        testArray2.insert(17);
        testArray2.insert(20);

        testArray1.display();
        testArray2.display();

        System.out.println("Attempting merge...");
        MergedArray test = (MergedArray) testArray1.merge(testArray2);
        testArray1.objects = test.objects;
        testArray1.objectCount = test.objectCount;
        testArray1.display();
    }
}
