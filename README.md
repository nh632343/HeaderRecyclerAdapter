# HeaderRecyclerAdapter
通过包装原来的adapter, 实现添加header的功能
<br>核心部分在java文件夹的base包下, 其他的只是用作演示

##使用
<br>构造Config对象
```
RecyclerHeaderAdapterHelper.Config config = new RecyclerHeaderAdapterHelper.Config();
```
然后添加header
```
config.bindheader(HeaderViewHolder.class);
```
绑定的顺序决定了显示的顺序, 最先绑定的会显示在最上面.
<br>HeaderViewHolder必须继承RecyclerView.ViewHolder, 并且构造方法参数为(Context, ViewGroup)
<br>因为在create header的时候, 是由RecyclerHeaderFactory完成的, 而RecyclerHeaderFactory通过反射来构造; 
<br>当然, 你可以改变反射的构造方式
<br>最后, 通过Helper完成:
```
//recyclerView为想要添加header的RecyclerView
RecyclerHeaderHelper helper = new RecyclerHeaderHelper(context, recyclerView, config);
```
<br>注意: header的数据加载由header自己完成, 如果想给header传递参数, 可以使用RecyclerHeaderListener
```

```
