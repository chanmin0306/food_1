package com.example.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHoler> {

    private ArrayList<FoodData> arrayList;
    private Context context;


    public FoodAdapter(ArrayList<FoodData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_recycler_layout, parent, false);
        FoodViewHoler holer = new FoodViewHoler(view);

        return holer;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHoler holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getFirst_food())
                .into(holder.iv_first_food);
        holder.tv_first_food_name.setText(arrayList.get(position).getFirst_food_name());
        holder.tv_first_food_heal.setText(String.valueOf(arrayList.get(position).getFirst_food_heal()));

        Glide.with(holder.itemView)
                .load(arrayList.get(position).getSecond_food())
                .into(holder.iv_second_food);
        holder.tv_second_food_name.setText(arrayList.get(position).getSecond_food_name());
        holder.tv_second_food_heal.setText(String.valueOf(arrayList.get(position).getSecond_food_heal()));

        Glide.with(holder.itemView)
                .load(arrayList.get(position).getFinal_food())
                .into(holder.iv_final_food);
        holder.tv_final_food_name.setText(arrayList.get(position).getFinal_food_name());
        holder.iv_final_food_heal.setText(String.valueOf(arrayList.get(position).getFinal_food_heal()));

    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class FoodViewHoler extends RecyclerView.ViewHolder {

        ImageView iv_first_food;
        TextView tv_first_food_name;
        TextView tv_first_food_heal;
        ImageView iv_second_food;
        TextView tv_second_food_name;
        TextView tv_second_food_heal;
        ImageView iv_final_food;
        TextView tv_final_food_name;
        TextView iv_final_food_heal;

        public FoodViewHoler(@NonNull View itemView) {
            super(itemView);
            this.iv_first_food = itemView.findViewById(R.id.iv_first_food);
            this.tv_first_food_name = itemView.findViewById(R.id.tv_first_food_name);
            this.tv_first_food_heal = itemView.findViewById(R.id.tv_first_food_heal);
            this.iv_second_food = itemView.findViewById(R.id.iv_second_food);
            this.tv_second_food_name = itemView.findViewById(R.id.tv_second_food_name);
            this.tv_second_food_heal = itemView.findViewById(R.id.tv_second_food_heal);
            this.iv_final_food = itemView.findViewById(R.id.iv_final_food);
            this.tv_final_food_name = itemView.findViewById(R.id.tv_final_food_name);
            this.iv_final_food_heal = itemView.findViewById(R.id.tv_final_food_heal);

        }
    }
}
