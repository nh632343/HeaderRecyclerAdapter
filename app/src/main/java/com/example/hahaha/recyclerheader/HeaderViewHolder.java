package com.example.hahaha.recyclerheader;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class HeaderViewHolder extends RecyclerView.ViewHolder {
  public HeaderViewHolder(Context context, ViewGroup parent) {
    super(
        LayoutInflater.from(context).inflate(R.layout.header_view_holder, parent, false)
    );
  }
}
