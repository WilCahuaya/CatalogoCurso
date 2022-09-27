package com.example.catalogo_wcq;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater minInflader;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.minInflader=LayoutInflater.from(context);
        this.context=context;
        this.mData=itemList;
    }

    @Override
    public int getItemCount(){return mData.size();}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view=minInflader.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(view);
    }
//    public android.widget.ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
//        View view=minInflader.inflate(R.layout.list_element,null);
//        return new ListAdapter.ViewHolder(view);
//    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }

//    @Override
//    public void onBindViewHolder(final android.widget.ListAdapter.ViewHolder holder, final int position){
//       holder.bindData(mData.get(position));
//    }

    public void setItems(List<ListElement> items){
        mData=items;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, descripcion, status;

        ViewHolder(View itemView){
            super(itemView);
            iconImage=itemView.findViewById(R.id.imgIcon);
            name=itemView.findViewById(R.id.txtNameViewCurso);
            descripcion=itemView.findViewById(R.id.txtDescripcionViewCurso);
            status=itemView.findViewById(R.id.txtEstatusCurso);
        }

        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            descripcion.setText(item.getDescripcion());
            status.setText(item.getStatus());
        }
    }
}
