package com.example.room_thebes;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.nambimobile.widgets.efab.FabOption;

public class wep_1 extends AppCompatActivity {
    static String HHome,sshet,mmhadrat,mmrgat,url;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wep_1);
        Bundle b=getIntent().getExtras();

        String qsmmm =b.getString("qsmmm");
        String safff =b.getString("safff");
        WebView weep = (WebView) findViewById(R.id.wwee);

        weep.getSettings().setLoadWithOverviewMode(true);
        weep.getSettings().setUseWideViewPort(true);
        weep.getSettings().setJavaScriptEnabled(true);
        weep.setWebViewClient(new WebViewClient());

        url = "";

        if (qsmmm.equals("نظم المعلومات") &&safff.equals("الصف الاول")){

            url = "https://1nazam.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);


        }else if (qsmmm.equals("نظم المعلومات") &&safff.equals("الصف الثاني")){

            url = "https://2nazam.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);


        }else if (qsmmm.equals("نظم المعلومات") &&safff.equals("الصف الثالت")){
            url = "https://3nazam.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);



        }else if (qsmmm.equals("نظم المعلومات") &&safff.equals("الصف الرابع")){

            url = "https://4nazam.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);


        }else if (qsmmm.equals("محاسبه") &&safff.equals("الصف الاول")){


            url = "https://1muhasibuh.blogspot.com//";

            HHome = url;
            weep.loadUrl(url);


        }else if (qsmmm.equals("محاسبه") &&safff.equals("الصف الثاني")){

            url = "https://2muhasibuh.blogspot.com//";

            HHome = url;
            weep.loadUrl(url);



        }else if (qsmmm.equals("محاسبه") &&safff.equals("الصف الثالت")){

            url = "https://3muhasibuh.blogspot.com//";

            HHome = url;
            weep.loadUrl(url);



        }else if (qsmmm.equals("محاسبه") &&safff.equals("الصف الرابع")){

            url = "https://4muhasibuh.blogspot.com//";

            HHome = url;
            weep.loadUrl(url);



        }else if (qsmmm.equals("تسويق") &&safff.equals("الصف الاول")){


            url = "https://1-taswiq.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);


        }else if (qsmmm.equals("تسويق") &&safff.equals("الصف الثاني")){

            url = "https://2-taswiq.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);



        }else if (qsmmm.equals("تسويق") &&safff.equals("الصف الثالت")){

            url = "https://3-taswiq.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);



        }else if (qsmmm.equals("تسويق") &&safff.equals("الصف الرابع")){


            url = "https://4-taswiq.blogspot.com/";

            HHome = url;
            weep.loadUrl(url);


        }else{
            Intent wep_11 = new Intent(this,MainActivity.class);
            startActivity(wep_11);


        }
        FabOption Home = (FabOption)  findViewById(R.id.Home);
        FabOption shet = (FabOption)  findViewById(R.id.shet);
        FabOption mhadrat = (FabOption)  findViewById(R.id.mhadrat);
        FabOption mrgat = (FabOption)  findViewById(R.id.mrgat);
        FabOption apot = (FabOption)  findViewById(R.id.apot);

        sshet = url+"search?q=شيت";
        mmhadrat = url+"search?q=محاضره";
        mmrgat = url+"search?q=مراجعات";

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView weep = (WebView) findViewById(R.id.wwee);

                weep.getSettings().setLoadWithOverviewMode(true);
                weep.getSettings().setUseWideViewPort(true);
                weep.getSettings().setJavaScriptEnabled(true);
                weep.setWebViewClient(new WebViewClient());

                weep.loadUrl(HHome);

            }
        });
        shet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView weep = (WebView) findViewById(R.id.wwee);

                weep.getSettings().setLoadWithOverviewMode(true);
                weep.getSettings().setUseWideViewPort(true);
                weep.getSettings().setJavaScriptEnabled(true);
                weep.setWebViewClient(new WebViewClient());

                weep.loadUrl(sshet);
            }
        });
        mhadrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView weep = (WebView) findViewById(R.id.wwee);

                weep.getSettings().setLoadWithOverviewMode(true);
                weep.getSettings().setUseWideViewPort(true);
                weep.getSettings().setJavaScriptEnabled(true);
                weep.setWebViewClient(new WebViewClient());

                weep.loadUrl(mmhadrat);
            }
        });
        mrgat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView weep = (WebView) findViewById(R.id.wwee);

                weep.getSettings().setLoadWithOverviewMode(true);
                weep.getSettings().setUseWideViewPort(true);
                weep.getSettings().setJavaScriptEnabled(true);
                weep.setWebViewClient(new WebViewClient());

                weep.loadUrl(mmrgat);
            }
        });
        apot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WebView weep = (WebView) findViewById(R.id.wwee);

                weep.getSettings().setLoadWithOverviewMode(true);
                weep.getSettings().setUseWideViewPort(true);
                weep.getSettings().setJavaScriptEnabled(true);
                weep.setWebViewClient(new WebViewClient());

                weep.loadUrl("https://payload5.wixsite.com/roomthebes");
            }
        });

    }
}