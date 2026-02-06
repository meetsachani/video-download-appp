package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.HowToUse;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C5036aE2;
import o.H22;
import o.I22;
import o.SH2;

/* loaded from: classes3.dex */
public class HowToUseActivity extends ActivityC3020Gb {
    public ImageView C1;
    public TextView D1;
    public ViewPager E1;
    public View F1;
    public View G1;
    public View H1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HowToUseActivity.this.E1.getCurrentItem() == 0) {
                HowToUseActivity.this.onBackPressed();
            } else if (HowToUseActivity.this.E1.getCurrentItem() == 1) {
                HowToUseActivity.this.E1.setCurrentItem(0);
            } else {
                HowToUseActivity.this.E1.setCurrentItem(1);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HowToUseActivity.this.E1.getCurrentItem() == 0) {
                HowToUseActivity.this.E1.setCurrentItem(1);
            } else if (HowToUseActivity.this.E1.getCurrentItem() == 1) {
                HowToUseActivity.this.E1.setCurrentItem(2);
            } else {
                HowToUseActivity.this.onBackPressed();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ViewPager.j {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            if (i == 0) {
                HowToUseActivity.this.D1.setText("Skip");
                HowToUseActivity howToUseActivity = HowToUseActivity.this;
                howToUseActivity.F1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity.getResources().getColor(R.color.app_color)));
                HowToUseActivity howToUseActivity2 = HowToUseActivity.this;
                howToUseActivity2.G1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity2.getResources().getColor(R.color.gray)));
                HowToUseActivity howToUseActivity3 = HowToUseActivity.this;
                howToUseActivity3.H1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity3.getResources().getColor(R.color.gray)));
            } else if (i == 1) {
                HowToUseActivity.this.D1.setText("Skip");
                HowToUseActivity howToUseActivity4 = HowToUseActivity.this;
                howToUseActivity4.F1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity4.getResources().getColor(R.color.gray)));
                HowToUseActivity howToUseActivity5 = HowToUseActivity.this;
                howToUseActivity5.G1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity5.getResources().getColor(R.color.app_color)));
                HowToUseActivity howToUseActivity6 = HowToUseActivity.this;
                howToUseActivity6.H1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity6.getResources().getColor(R.color.gray)));
            } else {
                HowToUseActivity.this.D1.setText("Get Started");
                HowToUseActivity howToUseActivity7 = HowToUseActivity.this;
                howToUseActivity7.F1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity7.getResources().getColor(R.color.gray)));
                HowToUseActivity howToUseActivity8 = HowToUseActivity.this;
                howToUseActivity8.G1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity8.getResources().getColor(R.color.gray)));
                HowToUseActivity howToUseActivity9 = HowToUseActivity.this;
                howToUseActivity9.H1.setBackgroundTintList(ColorStateList.valueOf(howToUseActivity9.getResources().getColor(R.color.app_color)));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5036aE2.a(this);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_how_to_use);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.C1 = (ImageView) findViewById(R.id.ic_back);
        this.D1 = (TextView) findViewById(R.id.skip);
        this.E1 = (ViewPager) findViewById(R.id.vpHome);
        this.F1 = findViewById(R.id.view_1);
        this.G1 = findViewById(R.id.view_2);
        this.H1 = findViewById(R.id.view_3);
        this.C1.setOnClickListener(new a());
        this.D1.setOnClickListener(new b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new H22("One"));
        arrayList.add(new H22("Two"));
        arrayList.add(new I22());
        this.E1.setAdapter(new SH2(W0(), arrayList));
        this.E1.c(new c());
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
    }
}
