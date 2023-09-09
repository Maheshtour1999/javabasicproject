package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Post {
	
	@Id
	private int id;
	private String name;
	
	@ManyToOne
	private User user;

	public Post()
	{
		super();
	}
	public Post(int id, String name, User user)
	{
		super();
		this.id=id;
		this.name=name;
		this.user=user;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user=user;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+user;
	}

}
