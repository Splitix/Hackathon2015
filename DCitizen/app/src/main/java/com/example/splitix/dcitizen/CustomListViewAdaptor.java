package com.example.splitix.dcitizen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Splitix on 11/14/15.
 */
public class CustomListViewAdaptor extends BaseAdapter {

    private Context mContext;
    private ArrayList<HashMap<String, String>> feed;
    private static LayoutInflater inflater = null;

    public CustomListViewAdaptor(Context context, ArrayList<HashMap<String, String>> data){
        mContext = context;
        feed = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return feed.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(convertView == null){
            view = inflater.inflate(R.layout.list_row, null);
            TextView title = (TextView) view.findViewById(R.id.feed_title);
            TextView post = (TextView) view.findViewById(R.id.feed_post);
            ImageView icon = (ImageView) view.findViewById(R.id.feed_image);

            HashMap<String, String> mData;

            mData = feed.get(position);

            title.setText(mData.get("title"));
            post.setText(mData.get("post"));
            icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.senior_citizen));
        }
        return view;
    }
}