// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WelcomeAdapter.java

package com.gexing.xue.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gexing.xue.config.Preferences;
import com.gexing.xue.model.Grade;

public class WelcomeAdapter extends BaseAdapter
{
	class ViewHolder
	{

		final WelcomeAdapter this$0;
		TextView tvCount;
		TextView tvName;

		private ViewHolder()
		{
			this$0 = WelcomeAdapter.this;
		}

	}


	private Context context;
	private int gradeCount =3;
	private LayoutInflater inflater;
	private boolean isLogin;
	private boolean isShow;
	private List items;
	private Preferences prfs;
	private int com;

	public WelcomeAdapter(Context context1, List list, boolean flag)
	{
		ArrayList arraylist = new ArrayList();
		items = arraylist;
		context = context1;
		items = list;
		LayoutInflater layoutinflater = LayoutInflater.from(context1);
		inflater = layoutinflater;
		isLogin = flag;
		Preferences preferences = new Preferences(context1);
		prfs = preferences;
	}


	public int getCount()
	{
		return 5;
	}

	public Object getItem(int i)
	{
		return items.get(i);
	}

	public long getItemId(int i)
	{
		return (long)i;
	}

	public View getView(final int position, View view, ViewGroup viewgroup)
	{
		View view1 = view;
		ViewHolder viewholder;
//		if (view == null)
// {
			view1 = inflater.inflate(0x7f030002, null);
			viewholder = new ViewHolder();
			TextView textview = (TextView) view1.findViewById(0x7f06009a);
			viewholder.tvCount = textview;
			TextView textview1 = (TextView) view1.findViewById(0x7f060099);
			viewholder.tvName = textview1;
			view1.setTag(viewholder);
//		} else
//		{
//			viewholder = (ViewHolder)view1.getTag();
//			viewholder.tvName.setBackgroundResource(0x7f02005e);
//			viewholder.tvName.setVisibility(0);
//			viewholder.tvName.setOnClickListener(null);
//			viewholder.tvName.setOnLongClickListener(null);
//			viewholder.tvCount.setVisibility(8);
//		}
//
//			TextView textview12 = viewholder.tvName;
//			String s8 = ((Grade)items.get(position)).name;
//			textview12.setText(s8);
//			TextView textview13 = viewholder.tvName;
//			Object obj = items.get(position);
//			textview13.setTag(obj);
//			TextView textview14 = viewholder.tvName;
		return view1;
	}

	public void setIsShow(boolean flag)
	{
		isShow = flag;
	}


}
