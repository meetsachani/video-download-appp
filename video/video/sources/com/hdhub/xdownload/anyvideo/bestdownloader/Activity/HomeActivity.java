package com.hdhub.xdownload.anyvideo.bestdownloader.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.CategoryHelperActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.ReelMainActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.RemainsFeaturesActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.VideoHomeActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.ActivityC3020Gb;
import o.C11284zo1;
import o.C4343To;
import o.C8322nf1;
import o.C9546sg;
import o.I7;
import o.InterfaceC3921Pg0;

/* loaded from: classes3.dex */
public class HomeActivity extends ActivityC3020Gb {
    public TextView C1;
    public TextView D1;
    public TextView E1;
    public TextView F1;
    public TextView G1;
    public PlayerView H1;
    public InterfaceC3921Pg0 I1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.HomeActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0141a implements I7.f {
            public C0141a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                Intent intent = new Intent(HomeActivity.this, CategoryHelperActivity.class);
                intent.putExtra("title", "Premium 4K XXX Videos");
                intent.putExtra("vtype", 2);
                HomeActivity.this.startActivity(intent);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(HomeActivity.this, new C0141a(), new boolean[0]);
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
                Intent intent = new Intent(HomeActivity.this, CategoryHelperActivity.class);
                intent.putExtra("title", "HD XNXX Videos");
                intent.putExtra("vtype", 1);
                HomeActivity.this.startActivity(intent);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(HomeActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this, ReelMainActivity.class));
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(HomeActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this, VideoHomeActivity.class));
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(HomeActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(HomeActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements I7.f {
        public f() {
        }

        @Override // o.I7.f
        public void a(boolean z) {
            HomeActivity.this.startActivity(new Intent(HomeActivity.this, RemainsFeaturesActivity.class));
        }
    }

    public final void F1() {
        InterfaceC3921Pg0 w = new InterfaceC3921Pg0.c(this).A(new C9546sg.e().c(3).f(1).a(), true).w();
        this.I1 = w;
        w.setVolume(0.0f);
        this.H1.setPlayer(this.I1);
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.I1;
        interfaceC3921Pg0.g0(C8322nf1.d(Uri.parse("android.resource://" + getPackageName() + RemoteSettings.i + R.raw.videoplay)));
        this.I1.u0(2);
        this.I1.m0();
        this.I1.D0(true);
    }

    public final void G1() {
        this.C1.setOnClickListener(new a());
        this.D1.setOnClickListener(new b());
        this.E1.setOnClickListener(new c());
        this.F1.setOnClickListener(new d());
        this.G1.setOnClickListener(new e());
    }

    public final void H1() {
        this.H1 = (PlayerView) findViewById(R.id.playerView);
        this.C1 = (TextView) findViewById(R.id.btn1);
        this.D1 = (TextView) findViewById(R.id.btn2);
        this.E1 = (TextView) findViewById(R.id.btn3);
        this.F1 = (TextView) findViewById(R.id.btn4);
        this.G1 = (TextView) findViewById(R.id.btn5);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        F1();
        if (!getSharedPreferences("mysession", 0).getBoolean("bb1", true)) {
            this.F1.setVisibility(8);
        }
        if (!getSharedPreferences("mysession", 0).getBoolean("bb2", true)) {
            this.C1.setVisibility(8);
        }
        if (!getSharedPreferences("mysession", 0).getBoolean("bb3", true)) {
            this.D1.setVisibility(8);
        }
        if (!getSharedPreferences("mysession", 0).getBoolean("bb4", true)) {
            this.E1.setVisibility(8);
        }
        if (!getSharedPreferences("mysession", 0).getBoolean("bb5", true)) {
            this.G1.setVisibility(8);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        I7.i(this, new f());
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);
        H1();
        G1();
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.I1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.g();
            this.I1 = null;
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.I1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.D0(true);
        }
    }
}
