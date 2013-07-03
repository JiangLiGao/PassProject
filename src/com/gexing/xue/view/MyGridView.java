// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MyGridView.java

package com.gexing.xue.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class MyGridView extends GridView
{

	private boolean haveScrollbar;

	public MyGridView(Context context)
	{
		super(context);
		haveScrollbar = true;
	}

	public MyGridView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
		haveScrollbar = true;
	}

	public MyGridView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
		haveScrollbar = true;
	}

	protected void onMeasure(int i, int j)
	{
		if (!haveScrollbar)
		{
			int k = android.view.View.MeasureSpec.makeMeasureSpec(0x1fffffff, 0x80000000);
			super.onMeasure(i, k);
		} else
		{
			super.onMeasure(i, j);
		}
	}

	public void setHaveScrollbar(boolean flag)
	{
		haveScrollbar = flag;
	}
}
