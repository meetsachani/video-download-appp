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
import o.C5036aE2;
import o.I7;

/* loaded from: classes3.dex */
public class ThreeActivity extends ActivityC3020Gb {

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.IntroScreen.ThreeActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0142a implements I7.f {
            public C0142a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                ThreeActivity.this.startActivity(new Intent(ThreeActivity.this, MainActivity.class));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(ThreeActivity.this, new C0142a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(ThreeActivity.this);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_three);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        findViewById(R.id.iv_next).setOnClickListener(new a());
        R().e(new b(true));
    }
}
