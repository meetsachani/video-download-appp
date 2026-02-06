package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.HomeActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.MainActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.SplashActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C11284zo1;
import o.C4343To;
import o.I7;

/* loaded from: classes3.dex */
public class RemainsFeaturesActivity extends ActivityC3020Gb {
    public TextView C1;
    public TextView D1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RemainsFeaturesActivity.this.finishAffinity();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                if (SplashActivity.V1) {
                    RemainsFeaturesActivity.this.startActivity(new Intent(RemainsFeaturesActivity.this, HomeActivity.class));
                    RemainsFeaturesActivity.this.finish();
                    return;
                }
                RemainsFeaturesActivity.this.startActivity(new Intent(RemainsFeaturesActivity.this, MainActivity.class));
                RemainsFeaturesActivity.this.finish();
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(RemainsFeaturesActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                if (SplashActivity.V1) {
                    RemainsFeaturesActivity.this.startActivity(new Intent(RemainsFeaturesActivity.this, HomeActivity.class));
                    RemainsFeaturesActivity.this.finish();
                    return;
                }
                RemainsFeaturesActivity.this.startActivity(new Intent(RemainsFeaturesActivity.this, MainActivity.class));
                RemainsFeaturesActivity.this.finish();
            }
        }

        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            I7.i(RemainsFeaturesActivity.this, new a());
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_remains_features);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.D1 = (TextView) findViewById(R.id.tvExitApp);
        this.C1 = (TextView) findViewById(R.id.continueBtn);
        this.D1.setOnClickListener(new a());
        this.C1.setOnClickListener(new b());
        R().e(new c(true));
    }
}
