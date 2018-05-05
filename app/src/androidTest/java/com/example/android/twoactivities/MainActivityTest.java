package com.example.android.twoactivities;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by girishkumarshakya on 28/08/16.
 */
public class MainActivityTest  extends ActivityInstrumentationTestCase2<MainActivity>{


    public MainActivityTest(Class<MainActivity> activityClass) {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }
}
