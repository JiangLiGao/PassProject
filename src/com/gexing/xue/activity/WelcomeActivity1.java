// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WelcomeActivity.java

package com.gexing.xue.activity;

import java.util.ArrayList;
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

import com.gexing.xue.view.MyGridView;

public class WelcomeActivity1 extends Activity {


	private long exitTime;
	private MyGridView gv;
	private ImageButton ibLogin;
	private ImageButton ibQuickQuestion;
	private ImageButton ibReg;
	private Intent intent;
	private boolean isLogin;
	private boolean isShow;
	private List items;
	private Map lastQIDs;
	public LinearLayout progress;
	private RelativeLayout rlBottom;
	private List selectGrades;
	private TextView tvQuickAnswer;

	public WelcomeActivity1() {
		ArrayList arraylist = new ArrayList();
		selectGrades = arraylist;
		isShow = false;
		exitTime = 0L;
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_welcome);
	}

	protected void onStart() {
		super.onStart();
		MyGridView mygridview = (MyGridView) findViewById(0x7f06000f);
		gv = mygridview;
		gv.setHaveScrollbar(false);
		MyGridView mygridview1 = gv;
		ColorDrawable colordrawable = new ColorDrawable(0);
		mygridview1.setSelector(colordrawable);

	}

	/*
	 * static Intent access$002(WelcomeActivity welcomeactivity, Intent intent1)
	 * { welcomeactivity.intent = intent1; return intent1; }
	 */

}
