package com.aixinwu.axw.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aixinwu.axw.R;
//import com.jcodecraeer.xrecyclerview.ItemTouchHelperAdapter;


import java.util.ArrayList;
import java.util.Collections;
import com.aixinwu.axw.model.Product;
import com.nostra13.universalimageloader.core.ImageLoader;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder> {
    public ArrayList<Product> datas = null;
    public ProductListAdapter(ArrayList<Product> datas) {
        this.datas = datas;
    }
    //创建新View，被LayoutManager所调用
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_list_product, viewGroup, false);
        return new ViewHolder(view);
    }
    //将数据与界面进行绑定的操作
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.mNameView.setText(datas.get(position).getProduct_name());
        viewHolder.mPriceView.setText(datas.get(position).getPrice() + "");
        ImageLoader.getInstance().displayImage(datas.get(position).getImage_url(), viewHolder.mImageView);
    }
    //获取数据的数量
    @Override
    public int getItemCount() {
        return datas.size();
    }
    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mNameView;
        public TextView mPriceView;
        public ViewHolder(View view){
            super(view);
            mImageView = (ImageView) view.findViewById(R.id.product_image);
            mNameView = (TextView) view.findViewById(R.id.product_name);
            mPriceView = (TextView) view.findViewById(R.id.product_price);


        }
    }
}
