package com.example.hahaha.recyclerheader;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {
  private TextView mTxt;

  public SimpleViewHolder(Context context, ViewGroup parent) {
    super(
        LayoutInflater.from(context).inflate(R.layout.simple_view_holder, parent, false)
    );
    mTxt = (TextView) itemView.findViewById(R.id.txt);
  }

  public void bind(int data) {
    mTxt.setText(String.valueOf(data));
  }
}
