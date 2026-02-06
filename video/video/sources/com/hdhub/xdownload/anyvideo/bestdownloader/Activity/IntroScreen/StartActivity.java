package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.IntroScreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.a;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.IntroScreen.StartActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.MainActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C10201vM;
import o.C11284zo1;
import o.C2723Dd;
import o.C5036aE2;
import o.C5240b5;
import o.C6747hE2;
import o.I7;

/* loaded from: classes3.dex */
public class StartActivity extends ActivityC3020Gb {
    public static final int D1 = 101;
    public boolean C1 = false;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5036aE2.d(StartActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5036aE2.c(StartActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5036aE2.b(StartActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Build.VERSION.SDK_INT < 33) {
                StartActivity.this.I1();
            } else if (C10201vM.a(StartActivity.this, "android.permission.POST_NOTIFICATIONS") == 0) {
                StartActivity.this.I1();
            } else {
                StartActivity.this.J1();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e extends AbstractC2891Eu1 {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                StartActivity.this.C1 = false;
            }
        }

        public e(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            if (C2723Dd.B()) {
                C6747hE2.d(StartActivity.this);
                return;
            }
            StartActivity startActivity = StartActivity.this;
            if (startActivity.C1) {
                startActivity.finishAffinity();
                return;
            }
            startActivity.C1 = true;
            Toast.makeText(startActivity, "Please tap again!", 0).show();
            new Handler().postDelayed(new a(), 3000L);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements I7.f {
        public f() {
        }

        @Override // o.I7.f
        public void a(boolean z) {
            if (C2723Dd.f0() == 1) {
                StartActivity.this.startActivity(new Intent(StartActivity.this, MainActivity.class));
            } else {
                StartActivity.this.startActivity(new Intent(StartActivity.this, OneActivity.class));
            }
        }
    }

    public static /* synthetic */ void F1(StartActivity startActivity, DialogInterface dialogInterface, int i) {
        startActivity.getClass();
        C5240b5.M(startActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1() {
        I7.o(this, new f(), new boolean[0]);
    }

    public final void J1() {
        if (C5240b5.S(this, "android.permission.POST_NOTIFICATIONS")) {
            new a.C0006a(this).setTitle("Notification Permission Needed").l("This app needs notification permission to show alerts.").y("OK", new DialogInterface.OnClickListener() { // from class: o.ac2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StartActivity.F1(StartActivity.this, dialogInterface, i);
                }
            }).p("Cancel", null).create().show();
        } else {
            C5240b5.M(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 101);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_start);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        findViewById(R.id.share_app).setOnClickListener(new a());
        findViewById(R.id.rate_us).setOnClickListener(new b());
        findViewById(R.id.privacy_policy).setOnClickListener(new c());
        findViewById(R.id.ic_start_now).setOnClickListener(new d());
        R().e(new e(true));
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 101) {
            I1();
        }
    }
}
