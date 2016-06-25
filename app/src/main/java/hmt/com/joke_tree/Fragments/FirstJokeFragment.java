package hmt.com.joke_tree.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hmt.com.joke_tree.R;

/**
 * Created by Htoo MT on 6/25/2016.
 */
public class FirstJokeFragment extends Fragment{

    public FirstJokeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_first_joke, container,false);



        return view;
    }
}
