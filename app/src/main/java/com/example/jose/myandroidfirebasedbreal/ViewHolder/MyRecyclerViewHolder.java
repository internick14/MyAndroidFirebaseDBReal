package com.example.jose.myandroidfirebasedbreal.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.jose.myandroidfirebasedbreal.Interface.ItemClickListener;
import com.example.jose.myandroidfirebasedbreal.R;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txt_title, txt_comment;
    ItemClickListener itemClickListener;

    public MyRecyclerViewHolder(View itemView) {
        super(itemView);

        txt_title = itemView.findViewById(R.id.txtTitle);
        txt_comment = itemView.findViewById(R.id.txtContent);
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
