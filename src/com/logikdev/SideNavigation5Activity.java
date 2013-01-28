package com.logikdev;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.github.eddieringle.android.libs.undergarment.widgets.DrawerGarment;

/**
 * This activity uses the library <code>android-undergarment</code> from <b>eddieringle</b>.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class SideNavigation5Activity extends AbstractSideNavigationActivity {
    private DrawerGarment mDrawerGarment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mDrawerGarment = new DrawerGarment(this, R.layout.menu);

        // connect the fallback button in case there is no ActionBar
        Button b = (Button) findViewById(R.id.buttonMenu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerGarment.toggleDrawer();
            }
        });
    }

}
