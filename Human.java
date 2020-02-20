package lessonOOP_03;

class Human
{
	protected String name;
	private int age;
	private double massa;
	
	Human (String name, int age, double massa)
	{
		super();
		this.age = age;
		this.massa = massa;
		this.name = name;
	}
	
	public String toString()
	{
		return name + " " + age + " " + massa;
	}
}