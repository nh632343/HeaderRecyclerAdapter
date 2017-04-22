package com.example.hahaha.recyclerheader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hahaha.recyclerheader.base.RecyclerHeaderAdapterHelper;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private RecyclerView mRecyclerView;
  private RecyclerHeaderAdapterHelper mHelper;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mRecyclerView = (RecyclerView) findViewById(R.id.recycler);

    List<Integer> dataList = new ArrayList<>();
    for (int i = 0; i < 20; ++i) {
      dataList.add(i);
    }
    SimpleAdapter adapter = new SimpleAdapter(dataList, this);
    mRecyclerView.setAdapter(adapter);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    //为原来的RecyclerView添加header
    RecyclerHeaderAdapterHelper.Config config = new RecyclerHeaderAdapterHelper.Config();
    config.bindHeader(HeaderViewHolder.class);
    mHelper = new RecyclerHeaderAdapterHelper(this, mRecyclerView, config);
  }
}
