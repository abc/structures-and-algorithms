
public class Marks {
	private int[] marksArray = {};
	private int failedModules;
	private double averageMark;
	private String progression = "";
	
	public Marks (int[] marks)
	{
		this.marksArray = this.getMarks(marks);
		this.averageMark = this.getAverage();
		this.progression = this.getProgression();
	}
	
	public void outputResults ()
	{
		for (int i:marksArray)
		{
			System.out.print(i + "\t");
		}
		System.out.print("\t");
		System.out.printf("%.2f\t", this.averageMark);
		System.out.print(failedModules + "\t");
		System.out.println(progression);
	}
	
	
	private String getProgression ()
	{
		if (this.failedModules == 0)
		{
			if (this.averageMark >= 60)
			{
				return "merit";
			}
			else
			{
				return "pass";
			}
		}
		else if (this.failedModules == 1)
		{
			if (this.averageMark >= 40)
			{
				return "pass";
			}
			else
			{
				return "fail";
			}
		}
		else
		{
			return "fail";
		}
	}
	
	private double getAverage ()
	{
		int totalMark = 0;
		for (int mark:marksArray)
		{
			if (mark < 40)
				failedModules++;
			
			totalMark += mark;
		}
		
		return ((double)totalMark / marksArray.length);
	}
	
	private int[] getMarks (int[] marks)
	{		
		int[] newMarksArray = new int[marks.length];
		
		for (int i = 0; i < marks.length; i++)
		{
			newMarksArray[i] = marks[i]; 
		}
		
		return newMarksArray;
	}
}
