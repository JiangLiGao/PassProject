// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GradeAdapter.java

package com.gexing.xue.adapter;

import java.util.List;

import com.gexing.xue.activity.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GradeAdapter extends BaseAdapter
{

	public Context context;
	public List data;
	public int enter;
	public LayoutInflater inflater;
	public android.view.View.OnClickListener item_onclick_Listener;
	public String uid;

	public GradeAdapter()
	{
	}

	public int getCount()
	{
		return 5;
	}

	public Object getItem(int i)
	{
		int j = i + -1;
		return data.get(j);
	}

	public long getItemId(int i)
	{
		return 0L;
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		int j = i + -1;
		View view1 = inflater.inflate(R.layout.item_grade, null);
		View view2 = view1;
		int k = R.id.id_grade_item_img;
		LinearLayout linearlayout = (LinearLayout)view2.findViewById(k);
		View view3 = view1;
		int l = R.id.id_grade_item_text;
		TextView textview = (TextView)view3.findViewById(l);
		View view4 = view1;
		int i1 = R.id.id_split_line;
		LinearLayout linearlayout1 = (LinearLayout)view4.findViewById(i1);
		int l4;
		int i5;
		int j5;

		return view1;
	}
}
