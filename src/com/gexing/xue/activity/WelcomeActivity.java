// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WelcomeActivity.java

package com.gexing.xue.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gexing.xue.adapter.WelcomeAdapter;
import com.gexing.xue.config.Preferences;
import com.gexing.xue.model.Grade;
import com.gexing.xue.view.MyGridView;

public class WelcomeActivity extends Activity {


	private WelcomeAdapter adapter;
	private long exitTime;
	private Grade grade1;
	private Grade grade2;
	private Grade grade3;
	private MyGridView gv;
	private ImageButton ibLogin;
	private ImageButton ibQuickQuestion;
	private ImageButton ibReg;
	private Intent intent;
	private boolean isLogin;
	private boolean isShow;
	private List items;
	private Map lastQIDs;
	private Preferences prfs;
	public LinearLayout progress;
	private RelativeLayout rlBottom;
	private List selectGrades;
	private TextView tvQuickAnswer;

	public WelcomeActivity() {
		ArrayList arraylist = new ArrayList();
		selectGrades = arraylist;
		isShow = false;
		exitTime = 0L;
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(0x7f030001);
	}

	protected void onPause() {
		super.onPause();
	}

	protected void onResume() {
		super.onResume();
		boolean flag = false;
		List list1 = new ArrayList<String>();
		list1.add("AAA");
		boolean flag1 = false;
		WelcomeAdapter welcomeadapter = new WelcomeAdapter(this, list1, flag1);
		adapter = welcomeadapter;
		MyGridView mygridview = gv;
		WelcomeAdapter welcomeadapter1 = adapter;
		mygridview.setAdapter(welcomeadapter1);
	}

	protected void onStart() {
		super.onStart();
		MyGridView mygridview = (MyGridView) findViewById(0x7f06000f);
		gv = mygridview;
		gv.setHaveScrollbar(false);
		MyGridView mygridview1 = gv;
		ColorDrawable colordrawable = new ColorDrawable(0);
		mygridview1.setSelector(colordrawable);
//		List list1 = new ArrayList<String>();
//		list1.add("AAA");
//		boolean flag1 = false;
//		WelcomeAdapter welcomeadapter = new WelcomeAdapter(this, list1, flag1);
//		mygridview1.setAdapter(welcomeadapter);
	}

	/*
	 * static Intent access$002(WelcomeActivity welcomeactivity, Intent intent1)
	 * { welcomeactivity.intent = intent1; return intent1; }
	 */

}
