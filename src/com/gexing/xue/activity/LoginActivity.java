package com.gexing.xue.activity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
	// 定义两个文本框
	EditText etName, etPass;
	// 定义两个三个按钮
	Button bnLoginButton, bnregistButton, bnlookButton;

	// 数据库相关
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

//		db = SQLiteDatabase.openOrCreateDatabase(this.getFilesDir().toString()
//				+ "/mylogin1.db3", null);
//		String sql = "create table userinfo(id integer primary key autoincrement,username varchar(50),pwd varchar(18),type varchar(4),phonenum integer(11))";
//		db.execSQL(sql);
//		 ContentValues cv = new ContentValues();
//		 cv.put("username", "aaa");
//		 cv.put("pwd", "123");
//		 cv.put("type", "bb");
//		 cv.put("phonenum", "12345678911");
//		 db.insert("userinfo", null, cv);

		etName = (EditText) findViewById(R.id.editText1);
		etPass = (EditText) findViewById(R.id.editText2);

		bnLoginButton = (Button) findViewById(R.id.button1);
		bnregistButton = (Button) findViewById(R.id.button2);
		bnlookButton = (Button) findViewById(R.id.button3);

		bnLoginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (validate()) {
//						if (loginOn()) {
							Intent intent = new Intent(LoginActivity.this,
									ChooseGradeActivity.class);
							startActivity(intent);
							finish();
//						} else {
//							DialogUtil.showDialog(LoginActivity.this, "登录失败！！",
//									false);
//						}
				}

			}
		});

//		bnregistButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				Intent intent = new Intent(LoginActivity.this,
//						RegistActivity.class);
//				startActivity(intent);
//				finish();
//			}
//		});
//
//		bnlookButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				Intent intent = new Intent(LoginActivity.this,
//						LookViewActivity.class);
//				startActivity(intent);
//				finish();
//			}
//		});

	}

	private boolean validate() {
		String usernameString = etName.getText().toString().trim();
		if (usernameString.equals("")) {
			DialogUtil.showDialog(this, "用户名是必填项！", false);
			return false;
		}
		String pwd = etPass.getText().toString().trim();
		if (pwd.equals("")) {
			DialogUtil.showDialog(this, "密码是必填项！", false);
			return false;
		}
		return true;
	}

	private boolean loginOn() {
		String sql = "select * from userinfo where username ='"+etName.getText().toString()+"' and pwd='"+etPass.getText().toString()+"'";
		Cursor cursor = db.rawQuery(sql, null);
		if (cursor.moveToNext()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		if (db != null && db.isOpen()) {
			db.close();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
