package com.android.pastr.pastr;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Julia.hermann93 on 2017.06.17..
 */

public class MapsActivityTest {
    @Test
    public void testOnLocationAccessNotGrantedByUser(){
        MapsActivity mapsActivity = new MapsActivity();
        String[] permissions = new String[]{};
        int[] grantResult = new int[]{-1};
        mapsActivity.onRequestPermissionsResult(1,permissions,grantResult);
        Assert.assertFalse(mapsActivity.mLocationPermissionGranted);
    }

    @Test
    public void testOnLocationAccessGrantedByUser(){
        MapsActivity mapsActivity = new MapsActivity();
        String[] permissions = new String[]{};
        int[] grantResult = new int[]{0};
        mapsActivity.onRequestPermissionsResult(1,permissions,grantResult);
        Assert.assertTrue(mapsActivity.mLocationPermissionGranted);
    }
}
