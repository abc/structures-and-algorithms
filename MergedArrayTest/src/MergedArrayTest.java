/**
 * Created by Alastair on 3/6/14.
 */
public class MergedArrayTest
{
    public static void main(String[] args)
    {
        /*
        MergedArray testArray1 = new MergedArray(5);
        MergedArray testArray2 = new MergedArray(5);

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

        Debug.print ("Attempting merge...");
        MergedArray test = (MergedArray) testArray1.merge(testArray2);
        testArray1.objects = test.objects;
        testArray1.objectCount = test.objectCount;
        test.display();
        */

        // Test 1 of 13:
        // Blank array test.
        System.out.println("Test 1 of 13:");
        MergedArray test1Array1 = new MergedArray(2);
        MergedArray test1Array2 = new MergedArray(2);
        MergedArray test1Result = (MergedArray) test1Array1.merge(test1Array2);
        test1Result.display();

        // Test 2 of 13:
        System.out.println("Test 2 of 13:");

        MergedArray test2Array1 = new MergedArray(2);
        test2Array1.insert(10);
        test2Array1.insert(20);

        MergedArray test2Array2 = new MergedArray(2);
        test2Array2.insert(5);
        test2Array2.insert(30);

        MergedArray test = (MergedArray) test2Array1.merge(test2Array2);
        test.display();

        // Test 3 of 13:
        System.out.println("Test 3 of 13:");

        MergedArray test3Array1 = new MergedArray(2);
        test3Array1.insert(10);
        test3Array1.insert(20);

        MergedArray test3Array2 = new MergedArray(2);
        test3Array2.insert(30);

        MergedArray test3 = (MergedArray) test3Array1.merge(test3Array2);
        test3.display();

        // Test 4 of 13:
        System.out.println("Test 4 of 13:");

        MergedArray test4Array1 = new MergedArray(2);
        test4Array1.insert(10);

        MergedArray test4Array2 = new MergedArray(2);
        test4Array2.insert(5);
        test4Array2.insert(30);

        MergedArray test4 = (MergedArray) test4Array1.merge(test4Array2);
        test4.display();

        System.out.println("Test 5 of 13:");
        MergedArray test5Array1 = new MergedArray(2);
        test5Array1.insert(10);
        MergedArray test5Array2 = new MergedArray(2);
        test5Array2.insert(30);
        MergedArray test5 = (MergedArray) test5Array1.merge(test5Array2);
        test5.display();

        // Test 6 of 13:
        System.out.println("Test 6 of 13:");
        MergedArray test6Array1 = new MergedArray(2);
        test6Array1.insert(5);
        test6Array1.insert(30);
        MergedArray test6Array2 = new MergedArray(2);
        test6Array2.insert(10);
        test6Array2.insert(20);
        MergedArray test6 = (MergedArray) test6Array1.merge(test6Array2);
        test6.display();

        // Test 7 of 13:
        System.out.println("Test 7 of 13:");
        MergedArray test7Array1 = new MergedArray(2);
        test7Array1.insert(30);
        MergedArray test7Array2 = new MergedArray(2);
        test7Array2.insert(10);
        test7Array2.insert(20);
        MergedArray test7 = (MergedArray) test7Array1.merge(test7Array2);
        test7.display();

        // Test 8 of 13:
        System.out.println("Test 8 of 13:");
        MergedArray test8Array1 = new MergedArray(2);
        test8Array1.insert(5);
        test8Array1.insert(30);
        MergedArray test8Array2 = new MergedArray(2);
        test8Array2.insert(10);
        MergedArray test8 = (MergedArray) test8Array1.merge(test8Array2);
        test8.display();

        // Test 9 of 13:
        System.out.println("Test 9 of 13:");
        MergedArray test9Array1 = new MergedArray(2);
        test9Array1.insert(30);
        MergedArray test9Array2 = new MergedArray(2);
        test9Array2.insert(10);
        MergedArray test9 = (MergedArray) test9Array1.merge(test9Array2);
        test9.display();

        // Test 10 of 13:
        System.out.println("Test 10 of 13:");
        MergedArray test10Array1 = new MergedArray(2);
        test10Array1.insert(10);
        test10Array1.insert(30);
        MergedArray test10Array2 = new MergedArray(2);
        test10Array2.insert(10);
        test10Array2.insert(30);
        MergedArray test10 = (MergedArray) test10Array1.merge(test10Array2);
        test10.display();

        // Test 11 of 13:
        System.out.println("Test 11 of 13:");
        MergedArray test11Array1 = new MergedArray(2);
        test11Array1.insert(10);
        test11Array1.insert(30);
        MergedArray test11Array2 = new MergedArray(2);
        test11Array2.insert(10);
        MergedArray test11 = (MergedArray) test11Array1.merge(test11Array2);
        test11.display();

        // Test 12 of 13:
        System.out.println("Test 12 of 13:");
        MergedArray test12Array1 = new MergedArray(2);
        test12Array1.insert(30);
        MergedArray test12Array2 = new MergedArray(2);
        test12Array2.insert(10);
        test12Array2.insert(30);
        MergedArray test12 = (MergedArray) test12Array1.merge(test12Array2);
        test12.display();

        // Test 13 of 13:
        System.out.println("Test 13 of 13:");
        MergedArray test13Array1 = new MergedArray(2);
        test13Array1.insert(30);
        MergedArray test13Array2 = new MergedArray(2);
        test13Array2.insert(30);
        MergedArray test13 = (MergedArray) test13Array1.merge(test13Array2);
        test13.display();
    }
}
