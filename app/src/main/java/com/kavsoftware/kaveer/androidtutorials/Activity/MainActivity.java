package com.kavsoftware.kaveer.androidtutorials.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.Fragment.Functionality.CheckInternetFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.ButtonFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.CheckBoxFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.ImageButtonFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.ProgressBarFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.RadioButtonFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.RatingBarFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.SpinnerFragment;
import com.kavsoftware.kaveer.androidtutorials.Fragment.Widget.ToggleButtonFragment;
import com.kavsoftware.kaveer.androidtutorials.R;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        AppCenter.start(getApplication(), "e3566d18-d32b-4b73-a30b-e0e2cc6d216a",
                Analytics.class, Crashes.class);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

            Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.NavImageButton) {
            ImageButtonFragment fragment = new ImageButtonFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        } else if (id == R.id.NavButton){
            ButtonFragment fragment = new  ButtonFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.CheckInternet){
            CheckInternetFragment fragment = new  CheckInternetFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.NavToggleButton){
            ToggleButtonFragment fragment = new ToggleButtonFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.NavRadioButton){
            RadioButtonFragment fragment = new RadioButtonFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.NavCheckBox){
            CheckBoxFragment fragment = new CheckBoxFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.NavSpinner){
            SpinnerFragment fragment = new SpinnerFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.NavRatingStar){
            RatingBarFragment fragment = new RatingBarFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }
        else if (id == R.id.NavProgressBar){
            ProgressBarFragment fragment = new ProgressBarFragment();
            android.support.v4.app.FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
            fmTransaction.replace(R.id.MainFrameLayout, fragment);
            fmTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
