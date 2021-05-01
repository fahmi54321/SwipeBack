package com.android.a6swipeback;


import android.os.Bundle;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;


public class ActivityOne extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
//        setDragEdge(SwipeBackLayout.DragEdge.BOTTOM); //bottom
//        setDragEdge(SwipeBackLayout.DragEdge.RIGHT); //right
//        setDragEdge(SwipeBackLayout.DragEdge.TOP);  //top
    }
}