package com.example.namamigangeghat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class final_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_activity);


    }
    public void x (View view)
    {
        openUrl("https://docs.google.com/forms/d/e/1FAIpQLSev4OSjjtHkLX8PIWrNHFPAh0N0jbrZ0MTSOez42m9ucycVwg/viewform?usp=sf_link");
    }
    public void openUrl(String url)
    {
       Uri uri = Uri.parse(url);
       Intent intent = new Intent(Intent.ACTION_VIEW,uri);
       startActivity(intent);
    }
    public void y (View view)
    {
        openUrl("https://docs.google.com/forms/d/e/1FAIpQLSfBucNg1eK-tNB_rBiCVZfamgOOF5Lbgl9gGhKcx8PzQ8rYDA/viewform?usp=sf_link");
    }

    public void z(View view)
    {
        openUrl("https://nmcg.nic.in/NamamiGanga.aspx#:~:text='Namami%20Gange%20Programme'%2C%20is,rejuvenation%20of%20National%20River%20Ganga.");
    }
    public void m (View view) {openUrl("http://justfunfacts.com/interesting-facts-about-river-ganges/");
    }
    public void n (View view )
    {
        openUrl("https://www.dw.com/en/ganges-under-threat-from-climate-change/a-41084925");
    }
    public void k (View view)
    {
        openUrl("https://drive.google.com/file/d/1XgskeeQwcIsloQA8j0l-nBLcflJ6KJZ_/view?usp=sharing");
    }
}