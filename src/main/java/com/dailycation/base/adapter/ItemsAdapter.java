package com.dailycation.base.adapter;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dailycation.base.model.InfoItem;

import java.util.List;

/**
 * 普通显示栏适配器
 * Created by hoffer on 17/1/21.
 */

public abstract class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.MyViewHolder>{
    List<InfoItem> items;

    public void setItems(List<InfoItem> items) {
        this.items = items;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        InfoItem item = items.get(position);
        holder.icon.setImageResource(item.getIconRes());
        holder.nextIcon.setImageResource(item.getNextIconRes());
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return items == null?0:items.size();
    }

    public abstract class MyViewHolder extends RecyclerView.ViewHolder{
        protected ImageView icon,nextIcon;
        protected TextView title;
        public  MyViewHolder(View itemView) {
            super(itemView);
            initView();
        }

        public abstract void initView();
    }
}