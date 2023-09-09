package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private int userid;
	private String username;
	
	@OneToMany
	List<Post> list;
	
	public User()
	{
		super();
	}
	public User(int userid, String username, List<Post> list)
	{
		super();
		this.userid=userid;
		this.username=username;
		this.list=list;
	}
	
	public int getUserId()
	{
		return userid;
	}
	public void setUserId(int userid)
	{
		this.userid=userid;
	}
	
	public String getUserName()
	{
		return username; 
	}
	public void setUserName(String username)
	{
		this.username=username;
	}
	
	public List<Post> list()
	{
		return list;
	}
	public void setPost(List<Post> list)
	{
		this.list=list;
	}
	
	@Override
	public String toString()
	{
		return userid+" "+username+" "+list;
	}
	
	

}
