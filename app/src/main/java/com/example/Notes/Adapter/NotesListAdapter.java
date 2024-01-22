package com.example.Notes.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Notes.Models.Notes;
import com.example.project_1.R;

import java.util.List;

public class NotesListAdapter extends RecyclerView.Adapter<NotesViewHolder>{
    Context ct;
    List<Notes> list;

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class NotesViewHolder extends RecyclerView.ViewHolder {
    CardView notesContainer;
    TextView tvTitle, tvNotes, tvDate;
    ImageView ivPin;
    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
        notesContainer = itemView.findViewById(R.id.notesContainer);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvNotes = itemView.findViewById(R.id.tvNotes);
        tvDate = itemView.findViewById(R.id.tvDate);
        ivPin = itemView.findViewById(R.id.ivPin);

    }
}
