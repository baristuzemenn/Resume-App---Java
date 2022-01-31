package com.example.termproject_portfolioapp.sidemenu;

import com.example.termproject_portfolioapp.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int EDUCATION_FRAGMENT_CODE = 1;
    public static final int CV_FRAGMENT_CODE = 2;
    public static final int HOBBIES_FRAGMENT_CODE =3;
    public static final int CONTACT_FRAGMENT_CODE =4;



    public static List<MenuItem> getMenuList(){
        List<MenuItem> list= new ArrayList<>();
        list.add(new MenuItem(R.drawable.ic_baseline_home_24,HOME_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_school_24,EDUCATION_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_work_24,CV_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24,HOBBIES_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_phone_24,CONTACT_FRAGMENT_CODE,true));

        return list;

    }
}
