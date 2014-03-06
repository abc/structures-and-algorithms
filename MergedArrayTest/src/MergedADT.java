/**
 * Created by Alastair on 3/6/14.
 */
public interface MergedADT extends SortedADT
{
    public abstract MergedADT merge(MergedADT additionalObjects);
}
