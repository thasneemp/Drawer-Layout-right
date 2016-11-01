package test.launcher.mummu.drawerlayout.widgets;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.Gravity;

/**
 * Created by muhammed on 11/1/2016.
 */

public class CustomDrawer extends DrawerLayout {
    public CustomDrawer(Context context) {
        super(context);
    }

    public CustomDrawer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomDrawer(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void openDrawer(int gravity) {
        super.openDrawer(Gravity.RIGHT);
    }

    @Override
    public void closeDrawer(int gravity) {
        super.closeDrawer(Gravity.RIGHT);
    }
}
