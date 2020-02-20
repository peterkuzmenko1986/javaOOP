package lessonOOP_03;

class Group
{
	private final int length = 3;
	Student [] gpStudent = new Student[length];
	private int up = -1;
	
	Group ()
	{
		for (int i = 0; i < length; i++ )
		{
			gpStudent[i] = null;			
		}
	}
	
	public void addStudent ( String name, int age, double mass, double id) throws IllegalArgumentException
	{
		if (up > this.length - 2) throw new IllegalArgumentException("Группа студентов переполнена");
		up++;
		gpStudent[up] = new Student(name, age, mass, id);
	}
	
	public int findStudentPosition(String name) throws IllegalArgumentException
	{
		if(up == -1) throw new IllegalArgumentException("Группа студентов пуста");
		for (int i = 0; i <= up; i++)
		{
			if (gpStudent[i].name == name ) return i;
		}
		throw new IllegalArgumentException("Такого студента в группе нет");
	}
	
	public void dellStudent(String name) throws IllegalArgumentException
	{
		int pos = this.findStudentPosition(name);
		gpStudent[pos] = null;
		up--;
		
		for (int i = pos; i < (length - 1) || gpStudent[i] != null; i++)
		{
			gpStudent[i] = gpStudent[i + 1];
			gpStudent[i + 1] = null;
		}
	}
	
	public static Student[] getSort( Student[] gpStudent ) throws IllegalArgumentException
	{
		String tmp;
		for(int i = 0; i < gpStudent.length; i++ )
		{
			for(int j = i + 1; i < gpStudent.length; j++)
			{
				if(gpStudent[i].name.compareTo(gpStudent[j].name) > 0)
				{
					tmp = gpStudent[i].name;
					gpStudent[i].name = gpStudent[j].name;
					gpStudent[j].name = tmp;
				}
				
			}
		}
		return gpStudent;
	}
	
	public String toString()
	{
		String tmp = new String();
		Student[] gp;
		gp = getSort(this.gpStudent);
		for(int i = 0; i < gp.length && i <= up; i++)
		{
			tmp += gp.toString() + "   ";
		}
		return tmp;
		
	}
}
