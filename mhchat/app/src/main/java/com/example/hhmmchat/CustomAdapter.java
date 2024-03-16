package com.example.hhmmchat;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Objects;

public class CustomAdapter extends ArrayAdapter<Message> {

    private FirebaseUser firebaseUser;

    public CustomAdapter(Context context, ArrayList<Message> chatList,FirebaseUser firebaseUser) {
        super(context, 0, chatList);
        this.firebaseUser = firebaseUser;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message = getItem(position);
        if (Objects.requireNonNull(firebaseUser.getEmail()).equalsIgnoreCase(message.getGonderici())){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.right_item_layout, parent, false);
            TextView txtUser = (TextView) convertView.findViewById(R.id.txtUserRight);
            TextView txtMessage = (TextView) convertView.findViewById(R.id.txtMessageRight);
            TextView txtTime = (TextView) convertView.findViewById(R.id.txtTimeRight);
            RatingBar star = (RatingBar) convertView.findViewById(R.id.ratingBarRight);
            Log.d("heb", "getView: deneme"+Float.parseFloat(message.getStar()));
            star.setRating(Float.parseFloat(message.getStar()));
            txtUser.setText(message.getGonderici());
            txtMessage.setText(message.getMesajText());
            txtTime.setText(message.getZaman());
        }else{
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.left_item_layout, parent, false);
            TextView txtUser = (TextView) convertView.findViewById(R.id.txtUserLeft);
            TextView txtMessage = (TextView) convertView.findViewById(R.id.txtMessageLeft);
            TextView txtTime = (TextView) convertView.findViewById(R.id.txtTimeLeft);
            RatingBar star = (RatingBar) convertView.findViewById(R.id.ratingBarLeft);
            Log.d("TAG", "getView: deneme"+message.getStar());
            star.setRating(Float.parseFloat(message.getStar()));
            txtUser.setText(message.getGonderici());
            txtMessage.setText(message.getMesajText());
            txtTime.setText(message.getZaman());
        }
        return convertView;
    }
}