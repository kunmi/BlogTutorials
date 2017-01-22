package kunmii.blogspot.com.tabbeddialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Olakunmi on 21/01/2017.
 */

public class CustomFragment extends Fragment {
    private String mText = "";
    public static CustomFragment createInstance(String txt)
    {
        CustomFragment fragment = new CustomFragment();
        fragment.mText = txt;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sample,container,false);
        ((TextView) v.findViewById(R.id.textView)).setText(mText);
        return v;
    }
}
