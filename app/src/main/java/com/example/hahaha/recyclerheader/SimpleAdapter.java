package com.example.hahaha.recyclerheader;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {
  private List<Integer> mDatas;
  private Context mContext;

  public SimpleAdapter(List<Integer> datas, Context context) {
    this.mDatas = datas;
    this.mContext = context;
  }

  @Override public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new SimpleViewHolder(mContext, parent);
  }

  @Override public void onBindViewHolder(SimpleViewHolder holder, int position) {
     holder.bind(mDatas.get(position));
  }

  @Override public int getItemCount() {
    return mDatas.size();
  }
}
