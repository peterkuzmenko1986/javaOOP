package lessonOOP_03;

class Student extends Human
{
	private double id;
	
	Student( String name, int age, double massa, double id )
	{
		super(name, age, massa);
		this.id = id;
	}

	
	@Override
	public String toString()
	{
		return super.toString() + " " + id;
	}
}
