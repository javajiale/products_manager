package com.brucele.products_manager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.brucele.products_manager.fragment.WelcomeFragment;
import com.brucele.products_manager.library.TabFragment;
import com.brucele.products_manager.library.TabItem;
import com.brucele.products_manager.library.XFragmentTabHost;

public class MainActivity extends AppCompatActivity {

    private XFragmentTabHost mTabHost;
    String[] mTabTitle = new String[] {"首页", "添加物品", "物品查询", "事件提醒", "事件更新"};
    int[] mImageResId = new int[] {R.drawable.sel_menu_home, R.drawable.sel_menu_game, R.drawable.sel_menu_software,
            R.drawable.sel_menu_app, R.drawable.sel_menu_mag};
    Class[] mFragClass = new Class[] {WelcomeFragment.class, WelcomeFragment.class,
            WelcomeFragment.class, WelcomeFragment.class, WelcomeFragment.class};

    private void initTabHost() {
        mTabHost = (XFragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.relate_tab_content);
        mTabHost.setTabMode(XFragmentTabHost.TabMode.Ripple);
        mTabHost.setTextActiveColor(Color.WHITE);
        mTabHost.setTextInactiveColor(Color.GRAY);

        for (int i = 0; i < mFragClass.length; i++) {
            Bundle bundle = new Bundle();
            bundle.putString(TabFragment.FRAG_KEY, mTabTitle[i]);
            mTabHost.addTabItem(new TabItem(mTabTitle[i], mImageResId[i]),
                    mFragClass[i], bundle);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initTabHost();
    }
}
