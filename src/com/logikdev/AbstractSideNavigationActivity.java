package com.logikdev;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * This abstract class contains the methods used by all its subclasses.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class AbstractSideNavigationActivity extends Activity {

    private void changeActivity(int descResourceId, Class activity) {
        Toast.makeText(this, descResourceId, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, activity);
        startActivity(intent);
        finish();
    }

    public void clickButton1(View view) {
        changeActivity(R.string.sn1_description, SideNavigation1Activity.class);
    }

    public void clickButton2(View view) {
        changeActivity(R.string.sn2_description, SideNavigation2Activity.class);
    }

    public void clickButton3(View view) {
        changeActivity(R.string.sn3_description, SideNavigation3Activity.class);
    }

    public void clickButton4(View view) {
        changeActivity(R.string.sn4_description, SideNavigation4Activity.class);
    }

    public void clickButton5(View view) {
        changeActivity(R.string.sn5_description, SideNavigation5Activity.class);
    }

    public void clickButton6(View view) {
        changeActivity(R.string.sn6_description, SideNavigation6Activity.class);
    }

    public void onMenuItemClick(int itemId) {

        switch(itemId) {
            case R.id.item_one:
                clickButton1(null);
                break;
            case R.id.item_two:
                clickButton2(null);
                break;
            case R.id.item_three:
                clickButton3(null);
                break;
            case R.id.item_four:
                clickButton4(null);
                break;
            case R.id.item_five:
                clickButton5(null);
                break;
            case R.id.item_six:
                clickButton6(null);
                break;
        }

    }

}
