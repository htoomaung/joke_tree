package hmt.com.joke_tree.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import hmt.com.joke_tree.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button btn_go_to_jokes = (Button) view.findViewById(R.id.btn_go_to_jokes);
        btn_go_to_jokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstJokeFragment fragment1 = new FirstJokeFragment();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_main_container, fragment1)
                        .commit();

                    RelativeLayout nav_block = (RelativeLayout) findViewById(R.id.rl_nav_block);
                    nav_block.setVisibility(View.VISIBLE);

            }
        });





        return  view;
    }

}
