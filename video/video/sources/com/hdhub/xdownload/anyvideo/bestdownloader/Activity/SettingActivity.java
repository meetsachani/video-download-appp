package com.hdhub.xdownload.anyvideo.bestdownloader.Activity;

import android.os.Bundle;
import android.view.View;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C5036aE2;

/* loaded from: classes3.dex */
public class SettingActivity extends ActivityC3020Gb {

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5036aE2.d(SettingActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5036aE2.c(SettingActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5036aE2.b(SettingActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractC2891Eu1 {
        public d(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(SettingActivity.this);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(512, 512);
        setContentView(R.layout.activity_setting);
        findViewById(R.id.ic_share_app).setOnClickListener(new a());
        findViewById(R.id.ic_rate_us).setOnClickListener(new b());
        findViewById(R.id.ic_privacy_policy).setOnClickListener(new c());
        R().e(new d(true));
    }
}
