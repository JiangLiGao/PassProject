// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Preferences.java

package com.gexing.xue.config;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences
{

	private String added_index_grade_ids_key;
	public Context context;
	private String is_launched_key;
	private String is_logout_key;
	private String passwd_key;
	private SharedPreferences preferences;
	private String uid_key;
	private String uname_key;

	public Preferences(Context context1)
	{
		is_launched_key = "isLaunched";
		uname_key = "uname";
		passwd_key = "passwd";
		is_logout_key = "isLogout";
		uid_key = "uid";
		added_index_grade_ids_key = "addedIndexGradeIds";
		context = context1;
		SharedPreferences sharedpreferences = context1.getSharedPreferences("preference", 0);
		preferences = sharedpreferences;
	}

	public String addedIndexGradeIds()
	{
		SharedPreferences sharedpreferences = preferences;
		String s = added_index_grade_ids_key;
		return sharedpreferences.getString(s, "");
	}

	public boolean isLaunched()
	{
		SharedPreferences sharedpreferences = preferences;
		String s = is_launched_key;
		return sharedpreferences.getBoolean(s, false);
	}

	public boolean isLogout()
	{
		SharedPreferences sharedpreferences = preferences;
		String s = is_logout_key;
		return sharedpreferences.getBoolean(s, false);
	}

	public String passwd()
	{
		SharedPreferences sharedpreferences = preferences;
		String s = passwd_key;
		return sharedpreferences.getString(s, "");
	}

	public boolean setAddedIndexGradeIds(String s)
	{
		android.content.SharedPreferences.Editor editor = preferences.edit();
		String s1 = added_index_grade_ids_key;
		return editor.putString(s1, s).commit();
	}

	public boolean setIsLaunched()
	{
		android.content.SharedPreferences.Editor editor = preferences.edit();
		String s = is_launched_key;
		return editor.putBoolean(s, true).commit();
	}

	public boolean setIsLogout(Boolean boolean1)
	{
		android.content.SharedPreferences.Editor editor = preferences.edit();
		String s = is_logout_key;
		boolean flag = boolean1.booleanValue();
		return editor.putBoolean(s, flag).commit();
	}

	public boolean setPasswd(String s)
	{
		android.content.SharedPreferences.Editor editor = preferences.edit();
		String s1 = passwd_key;
		return editor.putString(s1, s).commit();
	}

	public boolean setUID(String s)
	{
		android.content.SharedPreferences.Editor editor = preferences.edit();
		String s1 = uid_key;
		return editor.putString(s1, s).commit();
	}

	public boolean setUname(String s)
	{
		android.content.SharedPreferences.Editor editor = preferences.edit();
		String s1 = uname_key;
		return editor.putString(s1, s).commit();
	}

	public String uid()
	{
		SharedPreferences sharedpreferences = preferences;
		String s = uid_key;
		return sharedpreferences.getString(s, "");
	}

	public String uname()
	{
		SharedPreferences sharedpreferences = preferences;
		String s = uname_key;
		return sharedpreferences.getString(s, "");
	}
}
