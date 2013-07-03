//// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
//// Jad home page: http://kpdus.tripod.com/jad.html
//// Decompiler options: packimports(3) fieldsfirst ansi space 
//// Source File Name:   MainActivity.java
//
//package com.gexing.xue.activity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.Toast;
//import com.gexing.xue.component.*;
//import com.gexing.xue.config.Preferences;
//import com.umeng.analytics.MobclickAgent;
//import java.util.Timer;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//// Referenced classes of package com.gexing.xue.activity:
////			WelcomeActivity, ChooseGradeActivity
//
//public class MainActivity extends Activity
//	implements UserInfoInterface
//{
//
//	private boolean isLaunched;
//	private boolean isWelcome;
//	private LoginService login_service;
//	private Preferences prfs;
//	private Timer timer;
//	private String uid;
//	private int gexing;
//
//	public MainActivity()
//	{
//		isWelcome = false;
//	}
//
//	private void initTimerForOpenWelcomeActivity()
//	{
//		Timer timer1 = new Timer();
//		timer = timer1;
//		Timer timer2 = timer;
//		2 2_1 = new 2();
//		timer2.schedule(2_1, 3000L);
//	}
//
//	private void showTips()
//	{
//		Timer timer1 = new Timer();
//		timer = timer1;
//		Timer timer2 = timer;
//		1 1_1 = new 1();
//		timer2.schedule(1_1, 3000L);
//	}
//
//	private void toIntent()
//	{
//		if (!isWelcome)
//		{
//			isWelcome = true;
//			Intent intent = new Intent(this, com/gexing/xue/activity/WelcomeActivity);
//			startActivity(intent);
//		}
//	}
//
//	public void didFailureGetUserInfo(String s)
//	{
//		toIntent();
//	}
//
//	public void didFailureUserLogin(String s)
//	{
//		toIntent();
//	}
//
//	public void didStartUserLogin()
//	{
//	}
//
//	public void didSuccessGetUserInfo(String s)
//	{
//		boolean flag = login_service.userInfo.saveUserInfoToFile(this, s);
//		UserInfo userinfo = login_service.userInfo;
//		String s1 = uid;
//		boolean flag1 = userinfo.checkGradeIsExists(this, s1);
//		UserInfo userinfo1 = login_service.userInfo;
//		String s2 = uid;
//		boolean flag2 = userinfo1.checkAreaIsExists(this, s2);
//		UserInfo userinfo2 = login_service.userInfo;
//		String s3 = uid;
//		boolean flag3 = userinfo2.checkSchoolIsExists(this, s3);
//		if (!flag1 || !flag2 || !flag3)
//		{
//			Intent intent = new Intent(this, com/gexing/xue/activity/ChooseGradeActivity);
//			startActivity(intent);
//		} else
//		{
//			toIntent();
//		}
//	}
//
//	public void didSuccessUserLogin(String s)
//	{
//		try
//		{
//			JSONObject jsonobject = new JSONObject(s);
//			if (jsonobject.getString("result").equals("ok"))
//			{
//				int i = Log.i("zuoye", "info: user login success");
//				String s1 = jsonobject.getString("uid");
//				uid = s1;
//				Preferences preferences = prfs;
//				String s2 = uid;
//				boolean flag = preferences.setUID(s2);
//				UserInfo userinfo = login_service.userInfo;
//				String s3 = uid;
//				userinfo.asyncPullUserInfo(this, s3);
//			} else
//			{
//				String s4 = jsonobject.getString("message");
//				Toast.makeText(this, s4, 1).show();
//			}
//		}
//		catch (JSONException jsonexception)
//		{
//			Toast.makeText(this, 0x7f05008f, 1).show();
//			jsonexception.printStackTrace();
//		}
//	}
//
//	protected void onCreate(Bundle bundle)
//	{
//		super.onCreate(bundle);
//		setContentView(0x7f03002c);
//		MobclickAgent.onError(this);
//	}
//
//	protected void onPause()
//	{
//		super.onPause();
//		MobclickAgent.onPause(this);
//	}
//
//	public void onResume()
//	{
//		super.onResume();
//		MobclickAgent.onResume(this);
//	}
//
//	protected void onStart()
//	{
//		super.onStart();
//		LoginService loginservice = new LoginService(this);
//		login_service = loginservice;
//		Preferences preferences = new Preferences(this);
//		prfs = preferences;
//		boolean flag = prfs.isLaunched();
//		isLaunched = flag;
//		if (isLaunched) goto _L2; else goto _L1
//_L1:
//		showTips();
//_L4:
//		return;
//_L2:
//		boolean flag1 = login_service.isLogin();
//		boolean flag2 = prfs.isLogout();
//		if (flag1 || flag2)
//			break MISSING_BLOCK_LABEL_115;
//		int i = Log.i("zuoye", "info : is_login is false and is_logout is false");
//		login_service.autoLogin(this);
//		continue; /* Loop/switch isn't completed */
//		printStackTrace();
//		initTimerForOpenWelcomeActivity();
//		continue; /* Loop/switch isn't completed */
//		initTimerForOpenWelcomeActivity();
//		if (true) goto _L4; else goto _L3
//_L3:
//	}
//
//
//
//	private class 2 extends TimerTask
//	{
//
//		final MainActivity this$0;
//
//		public void run()
//		{
//			toIntent();
//		}
//
//		2()
//		{
//			this$0 = MainActivity.this;
//			super();
//		}
//	}
//
//
//	private class 1 extends TimerTask
//	{
//
//		final MainActivity this$0;
//
//		public void run()
//		{
//			timer.cancel();
//			MainActivity mainactivity = MainActivity.this;
//			Intent intent = new Intent(mainactivity, com/gexing/xue/activity/TipsActivity);
//			startActivity(intent);
//		}
//
//		1()
//		{
//			this$0 = MainActivity.this;
//			super();
//		}
//	}
//
//}
