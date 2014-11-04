package chatbot.model;

public class ChatUser
{
	private String name;
	private int age;
	private String favoriteMovie;
	private boolean isGraduated;
	private boolean isGamer;
	
	public ChatUser()
	{
		this.name = "";
		this.age = -999;
		this.favoriteMovie = "";
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}
	
	public void setFavoriteMovie(String favoriteMovie)
	{
		this.favoriteMovie = favoriteMovie;
	}
	
	public boolean isGraduated()
	{
		return isGraduated;
	}
	
	public void setGraduated(boolean isGraduated)
	{
		this.isGraduated = isGraduated;
	}
	
	public boolean isGamer()
	{
		return isGamer;
	}
	
	public void setGamer(boolean isGamer)
	{
		this.isGamer = isGamer;
	}

}
