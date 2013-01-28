package com.logikdev;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.coboltforge.slidemenu.SlideMenu;
import com.coboltforge.slidemenu.SlideMenuInterface.OnSlideMenuItemClickListener;

/**
 * This activity uses the library <code>LibSlideMenu</code> from <b>bk138</b>.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class SideNavigation3Activity extends AbstractSideNavigationActivity implements OnSlideMenuItemClickListener {
    private SlideMenu slidemenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        // set the content view
        setContentView(R.layout.main);

        // configure the Side Navigation
        /*
           * There are two ways to add the slide menu:
           * From code or to inflate it from XML (then you have to declare it in the activities layout XML)
           */
        // this is from code. no XML declaration necessary, but you won't get state restored after rotation.
		slidemenu = new SlideMenu(this, R.menu.slide, this, 333);
        // this inflates the menu from XML. open/closed state will be restored after rotation, but you'll have to call init.
//        slidemenu = (SlideMenu) findViewById(R.id.slideMenu);
//        slidemenu.init(this, R.menu.slide, this, 333);

        // this can set the menu to initially shown instead of hidden
//		slidemenu.setAsShown();

        // set optional header image
        slidemenu.setHeaderImage(getResources().getDrawable(R.drawable.ic_launcher));

        // connect the fallback button in case there is no ActionBar
        Button b = (Button) findViewById(R.id.buttonMenu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidemenu.show();
            }
        });
    }

    @Override
    public void onSlideMenuItemClick(int itemId) {
        onMenuItemClick(itemId);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home: // this is the app icon of the actionbar
                slidemenu.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
