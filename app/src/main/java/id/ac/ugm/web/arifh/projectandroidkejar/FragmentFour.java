package id.ac.ugm.web.arifh.projectandroidkejar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by docotel on 3/2/16.
 */
public class FragmentFour extends Fragment {

    public static FragmentFour newInstance() {
        return new FragmentFour();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_four, container, false);

        return rootView;
    }
}
