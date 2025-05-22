package com.example.pas_genap_3_23;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Player> playerList;

    public PlayerAdapter(List<Player> teamList){
        this.playerList = playerList;
    }

    @NonNull
    @Override
    public PlayerAdapter.PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerAdapter.PlayerViewHolder holder, int position) {
        Player player = playerList.get(position);
        holder.tvNamaTim.setText(player.strPlayer);
        holder.tvStadium.setText(player.strSport);

        Glide.with(holder.itemView.getContext())
                .load(player.strThumb)
                .into(holder.imgBadge);
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    static class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaTim, tvStadium;
        ImageView imgBadge;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaTim = itemView.findViewById(R.id.tvNamaTim);
            tvStadium = itemView.findViewById(R.id.tvStadium);
            imgBadge = itemView.findViewById(R.id.imgBadge);

        }
    }
}
