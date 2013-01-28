package com.logikdev;

import android.os.Bundle;
import android.widget.Button;
import com.slidingmenu.lib.SlidingMenu;

/**
 * This activity uses the library <code>SlidingMenu</code> from <b>jfeinstein10</b>.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class SideNavigation1Activity extends AbstractSideNavigationActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        // set the content view
        setContentView(R.layout.main);
        // configure the SlidingMenu
        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.menu);

        // hide the fallback button
        Button b = (Button) findViewById(R.id.buttonMenu);
        b.setVisibility(Button.INVISIBLE);
    }

}
