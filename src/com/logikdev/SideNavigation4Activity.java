package com.logikdev;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.darvds.ribbonmenu.RibbonMenuView;
import com.darvds.ribbonmenu.iRibbonMenuCallback;

/**
 * This activity uses the library <code>RibbonMenu</code> from <b>darvds</b>.
 * User: Stéphane Moreau <smoreau@logikdev.com>
 */
public class SideNavigation4Activity extends AbstractSideNavigationActivity implements iRibbonMenuCallback {
    private RibbonMenuView rbmView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        rbmView = (RibbonMenuView) findViewById(R.id.ribbonMenuView1);
        rbmView.setMenuClickCallback(this);
        rbmView.setMenuItems(R.menu.slide);

        // connect the fallback button in case there is no ActionBar
        Button b = (Button) findViewById(R.id.buttonMenu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbmView.toggleMenu();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            rbmView.toggleMenu();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void RibbonMenuItemClick(int itemId) {
        onMenuItemClick(itemId);
    }
}
