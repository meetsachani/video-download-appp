package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.IntroScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.MainActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C11284zo1;
import o.C2723Dd;
import o.C5036aE2;
import o.I7;

/* loaded from: classes3.dex */
public class OneActivity extends ActivityC3020Gb {

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OneActivity.this.G1();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(OneActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements I7.f {
        public c() {
        }

        @Override // o.I7.f
        public void a(boolean z) {
            if (C2723Dd.f0() == 2) {
                OneActivity.this.startActivity(new Intent(OneActivity.this, MainActivity.class));
            } else {
                OneActivity.this.startActivity(new Intent(OneActivity.this, TwoActivity.class));
            }
        }
    }

    public final void G1() {
        I7.o(this, new c(), new boolean[0]);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_one);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        findViewById(R.id.iv_next).setOnClickListener(new a());
        R().e(new b(true));
    }
}
