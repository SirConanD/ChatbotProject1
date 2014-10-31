package chatbot.model;

public class ChatUser
{
	private String name;
	private int age;
	private String FavoriteMovie;
	private boolean isGraduated;
	private boolean isGamer;
	
	public ChatUser()
	{
		
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
		return FavoriteMovie;
	}
	
	public void setFavoriteMovie(String favoriteMovie)
	{
		FavoriteMovie = favoriteMovie;
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
