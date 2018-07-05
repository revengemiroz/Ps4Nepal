package com.example.msi.ps4nepal.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.msi.ps4nepal.R;
import com.example.msi.ps4nepal.models.Post;

import java.util.ArrayList;

public class PostListAdapter{


        //public class PostListAdapter  extends RecyclerView.Adapter<PostListAdapter.ViewHolder>{

    private static final String TAG="PostListAdapter";
    private static final int NUM_GRID_COLUMNS=2;

    private ArrayList<Post> mPosts;
    private Context mContext;

  /* public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView mPostImage;

        public ViewHolder(View itemView) {
            super(itemView);
            mPostImage = (ImageView)itemView.findViewById(R.id.post_image);

            int gridWidth=mContext.getResources().getDisplayMetrics().widthPixels;
            int imageWidth=gridWidth/NUM_GRID_COLUMNS;
            mPostImage.setMaxHeight(imageWidth);
            mPostImage.setMaxWidth(imageWidth);
        }
    }

   // public PostListAdapter(Context mContext,ArrayList<Post> mPosts) {
        this.mPosts = mPosts;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(mContext).inflate(R.layout.layout_view_post,parent,true);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        UniversalImageLoader.setImage(mPosts.get(position).getImage(),holder.mPostImage);
        holder.mPostImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onCick: selected a post");
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


*/
}
