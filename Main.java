package lessonOOP_03;

public class Main
{
	public static void main(String [] args)
	{
		Group gp = new Group();
		try
		{
			gp.addStudent("Bbb", 20, 20, 20);
			gp.addStudent("Aaa", 10, 10, 10);
			gp.addStudent("Ccc", 30, 30, 30);
			
			//System.out.println(gp.findStudentPosition("Aaa"));
			
			System.out.println(gp.toString());
			
			//Group.getSort(gp.gpStudent);

		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
}