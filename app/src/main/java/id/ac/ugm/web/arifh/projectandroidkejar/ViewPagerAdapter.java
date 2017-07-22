package id.ac.ugm.web.arifh.projectandroidkejar;

import android.content.Context;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by docotel on 3/2/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    final Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = FragmentOne.newInstance();
                break;
            case 1:
                fragment = FragmentTwo.newInstance();
                break;
            case 2:
                fragment = FragmentThree.newInstance();
                break;
            case 3:
                fragment = FragmentFour.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getResources().getString(R.string.tab_1);
            case 1:
                return context.getResources().getString(R.string.tab_2);
            case 2:
                return context.getResources().getString(R.string.tab_3);
            case 3:
                return context.getResources().getString(R.string.tab_4);

        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
