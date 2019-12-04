package com.example.text1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHorder> {
    private ArrayList<PicBean.DataBean.ListBean> list;
    private Context context;
    private Boolean onBind;
    private HashMap<Integer,Boolean> map=new HashMap<>();

    public Myadapter(ArrayList<PicBean.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.activity_price, null);
        ViewHorder viewHorder = new ViewHorder(inflate);
        return viewHorder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHorder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHorder extends RecyclerView.ViewHolder {

        private final CheckBox chBox;
        private final ImageView ivPic;
        private final TextView price;

        public ViewHorder(@NonNull View itemView) {
            super(itemView);

            chBox = itemView.findViewById(R.id.recy_checkBox);
            ivPic = itemView.findViewById(R.id.recy_iv_pic);
            price = itemView.findViewById(R.id.recy_tv_price);
        }
    }
}
