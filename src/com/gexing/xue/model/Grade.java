// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Grade.java

package com.gexing.xue.model;

import java.io.Serializable;

public class Grade
	implements Serializable
{

	public static final String ID = "id";
	public static final String LAST_QUESTION_ID = "last_question_id";
	public static final String NAME = "name";
	public static final String NUM = "count";
	public String count;
	public String id;
	public String name;

	public Grade(String s, String s1, String s2)
	{
		id = s;
		name = s1;
		count = s2;
	}
}
