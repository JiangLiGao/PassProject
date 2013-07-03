// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ChooseGradeActivity.java

package com.gexing.xue.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.gexing.xue.adapter.GradeAdapter;

// Referenced classes of package com.gexing.xue.activity:
//			AuthActivity

public class ChooseGradeActivity extends Activity
{

	private ListView grade_list_view;
	private List mData;
	LinearLayout progress;
	private int year;

	public ChooseGradeActivity()
	{
	}




	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
		setContentView(R.layout.activity_choose_grade);
	}

//	public boolean onCreateOptionsMenu(Menu menu)
//	{
//		getMenuInflater().inflate(R.layout.activity_choose_grade, menu);
//		return true;
//	}

	public void onPause()
	{
		super.onPause();
	}

	public void onResume()
	{
		super.onResume();
		GradeAdapter gradeadapter = new GradeAdapter();
		int l = year;
		gradeadapter.enter = l;
		List list1 = new ArrayList<String>();
		list1.add("aaaaa");
		list1.add("bbbbb");
		list1.add("ccccc");
		gradeadapter.data = list1;
		LayoutInflater layoutinflater = LayoutInflater.from(this);
		gradeadapter.inflater = layoutinflater;
		gradeadapter.context = this;
		ListView listview = (ListView)findViewById(R.id.grade_list_view);
		grade_list_view = listview;
		grade_list_view.setAdapter(gradeadapter);
		LinearLayout linearlayout = (LinearLayout)findViewById(R.id.progress);
		progress = linearlayout;
	}

	public void onStart()
	{
		super.onStart();
	}

	public void onStop()
	{
		super.onStop();
	}





}
