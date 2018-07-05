package com.example.msi.ps4nepal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.msi.ps4nepal.models.Post;
import com.example.msi.ps4nepal.util.PostListAdapter;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    private static final String TAG="SearchFragment";

    //widgets
    private ImageView mFilters;

    private RecyclerView mRecyclerView;
    private static final int NUM_GRID_COLUMNS=1;
    private PostListAdapter mAdapter;
    private ArrayList<Post>mPosts;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_search,container,false);
        mFilters=(ImageView)view.findViewById(R.id.ic_search);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.recyclerView);
       // setupPostsList();
        init();

        return view;
    }

   // private void setupPostsList(){
    //    GridLayoutManager gridLayoutManager=new GridLayoutManager(getActivity(), NUM_GRID_COLUMNS);
      //  mRecyclerView.setLayoutManager(gridLayoutManager);
     //   mAdapter=new PostListAdapter(getActivity(),mPosts);
      //  mRecyclerView.setAdapter(mAdapter);
  //  }

    private void init() {
        mFilters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick: navigating to filters activity.");
                //Intent intent=new Intent(getActivity(),FiltersActivity.class);
                //startActivity(intent);
               // setupPostsList();
            }
        });
    }
}
