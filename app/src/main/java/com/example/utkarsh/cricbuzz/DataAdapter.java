package com.example.utkarsh.cricbuzz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by utkarsh on 31/3/18.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<Matches> matches;

    public DataAdapter(ArrayList<Matches> matches) {
        this.matches = matches;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()). inflate(R.layout.match_card, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
                    holder.team1_name.setText(matches.get(matches.size()-position-1).getTeam1());
                    holder.team2_name.setText(matches.get(matches.size()-position-1).getTeam2());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView team1_name, team2_name, team1_score;

        public ViewHolder(View itemView) {
            super(itemView);
            team1_name = (TextView) itemView.findViewById(R.id.team1_name);
            team2_name = (TextView) itemView.findViewById(R.id.team2_name);
            team1_score = (TextView) itemView.findViewById(R.id.team1_score);
        }
    }
}

