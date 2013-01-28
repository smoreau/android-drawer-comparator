package com.logikdev;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import net.simonvt.menudrawer.MenuDrawer;

/**
 * This activity uses the library <code>android-menudrawer</code> from <b>SimonVT</b>.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class SideNavigation6Activity extends AbstractSideNavigationActivity {
    private MenuDrawer mDrawer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mDrawer = MenuDrawer.attach(this);
        mDrawer.setContentView(R.layout.main);
        mDrawer.setMenuView(R.layout.menu);

        // connect the fallback button in case there is no ActionBar
        Button b = (Button) findViewById(R.id.buttonMenu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.toggleMenu();
            }
        });
    }

}
