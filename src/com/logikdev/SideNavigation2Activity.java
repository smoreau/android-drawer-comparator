package com.logikdev;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.deaux.fan.FanView;

/**
 * This activity uses the library <code>android-fly-in-app-navigation</code> from <b>Gregadeaux</b>.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class SideNavigation2Activity extends AbstractSideNavigationActivity {
    private FanView fan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        // set the content view
        setContentView(R.layout.fanview);
        // configure the Side Navigation
        fan = (FanView) findViewById(R.id.fan_view);
        fan.setViews(R.layout.main, R.layout.menu);

        // connect the fallback button in case there is no ActionBar
        Button b = (Button) findViewById(R.id.buttonMenu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fan.showMenu();
            }
        });
    }

}
