package kunmii.blogspot.com.tabbeddialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Olakunmi on 21/01/2017.
 */

public class TabbedDialog extends DialogFragment {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.dialog_sample,container,false);

        tabLayout = (TabLayout) rootview.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) rootview.findViewById(R.id.masterViewPager);

        CustomAdapter adapter = new CustomAdapter(getChildFragmentManager());
        adapter.addFragment("Boy",CustomFragment.createInstance("John"));
        adapter.addFragment("Girl",CustomFragment.createInstance("Stacy"));
        adapter.addFragment("Robot",CustomFragment.createInstance("Aeon"));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return rootview;
    }
}
