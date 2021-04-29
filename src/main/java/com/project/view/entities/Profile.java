package com.project.view.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Profile
{	
	private int id;
	private String name;
	private Gender gender;
	
	@JsonIgnore
	private List<Profile> friendlist = new ArrayList<>();
	@JsonIgnore
	private List<Profile> blocklist  = new ArrayList<>();
	@JsonIgnore
	private List<Profile> waitlist  = new ArrayList<>();
/*
	@ManyToMany
	@JsonIgnore
	private List<Message<?>> messages  = new ArrayList<>();
*/
	
	public Profile setId(int id) 					{
		this.id = id;
		return this;
	}
	public Profile setName(String name)				{
		this.name = name;
		return this;
	}
	public Profile setGender(Gender gender) 		{
		this.gender = gender;
		return this;
	}
/*
	public Profile setMessage(Message<?> message)	{
		this.messages.add(message);
		return this;
	}	
*/

	
	public Profile setFriendlist(List<Profile> friendlist)	{
		this.friendlist = friendlist;
		return this;
	}
	public Profile setBlocklist(List<Profile> blocklist)	{
		this.blocklist = blocklist;
		return this;
	}
	public Profile setWaitlist(List<Profile> waitlist)		{
		this.waitlist = waitlist;
		return this;
	}

	public Profile addFriendsToFriendList(Profile obj)		{
		friendlist.add(obj);
			return this;
	}
	public Profile addFriendsToBlockList(Profile obj)		{
		friendlist.add(obj);
		return this;
	}
	public Profile addFriendsToWaitlist(Profile obj)		{
		this.waitlist.add(obj);
		return this;
	}


}
