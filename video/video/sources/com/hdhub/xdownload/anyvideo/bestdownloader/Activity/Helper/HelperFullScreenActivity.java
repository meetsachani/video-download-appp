package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.HashMap;
import o.AI0;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C5036aE2;
import o.C8322nf1;
import o.C8541oZ;
import o.C8970qJ1;
import o.C9546sg;
import o.I7;
import o.InterfaceC3921Pg0;
import o.JZ;
import o.XH0;

/* loaded from: classes3.dex */
public class HelperFullScreenActivity extends ActivityC3020Gb {
    public static final String I1 = "playback_position";
    public static final String J1 = "player_prefs";
    public Runnable C1;
    public InterfaceC3921Pg0 D1;
    public PlayerView E1;
    public final Handler F1 = new Handler();
    public long G1 = 0;
    public boolean H1 = false;

    /* loaded from: classes3.dex */
    public class a extends AbstractC2891Eu1 {
        public a(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(HelperFullScreenActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HelperFullScreenActivity.this.O1();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements I7.f {
        public c() {
        }

        @Override // o.I7.f
        public void a(boolean z) {
            HelperFullScreenActivity.this.H1 = false;
            HelperFullScreenActivity.this.D1.Y0(HelperFullScreenActivity.this.G1);
            HelperFullScreenActivity.this.D1.D0(true);
            HelperFullScreenActivity.this.F1.postDelayed(HelperFullScreenActivity.this.C1, HelperFullScreenActivity.this.getSharedPreferences("mysession", 0).getInt("fulltimer", 20000));
        }
    }

    public final void K1() {
        if (getIntent().getIntExtra("vtype", 1) == 1) {
            InterfaceC3921Pg0 w = new InterfaceC3921Pg0.c(this).A(new C9546sg.e().c(3).f(1).a(), true).w();
            this.D1 = w;
            this.E1.setPlayer(w);
            String stringExtra = getIntent().getStringExtra("videoUrl");
            if (stringExtra != null && !stringExtra.isEmpty()) {
                this.D1.g0(C8322nf1.d(Uri.parse(stringExtra)));
                this.G1 = getSharedPreferences(J1, 0).getLong(I1, 0L);
                this.D1.m0();
                this.D1.Y0(this.G1);
                this.D1.D0(true);
            } else {
                Toast.makeText(this, "Video URL is missing", 0).show();
                return;
            }
        } else {
            C8541oZ.b bVar = new C8541oZ.b();
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", "Mozilla/5.0 (Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Mobile Safari/537.36");
            hashMap.put(AI0.J, getSharedPreferences("mysession", 0).getString(AI0.J, ""));
            hashMap.put("Accept", "*/*");
            hashMap.put("Accept-Encoding", XH0.S);
            bVar.b(hashMap);
            InterfaceC3921Pg0 w2 = new InterfaceC3921Pg0.c(this).J(new JZ(bVar)).w();
            this.D1 = w2;
            this.E1.setPlayer(w2);
            this.D1.C0(new C8970qJ1.b(bVar).e(C8322nf1.d(Uri.parse(getIntent().getStringExtra("videoUrl")))));
            this.D1.m0();
            this.D1.Y0(this.G1);
            this.D1.D0(true);
            this.D1.t0();
        }
        P1();
    }

    public final void L1() {
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.D1;
        if (interfaceC3921Pg0 != null) {
            this.G1 = interfaceC3921Pg0.getCurrentPosition();
            N1();
            this.D1.g();
            this.D1 = null;
        }
    }

    public final void M1() {
        this.D1.Y0(this.G1);
        this.D1.D0(true);
    }

    public final void N1() {
        SharedPreferences.Editor edit = getSharedPreferences(J1, 0).edit();
        edit.putLong(I1, this.G1);
        edit.apply();
    }

    public void O1() {
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.D1;
        if (interfaceC3921Pg0 != null && interfaceC3921Pg0.isPlaying() && !this.H1) {
            this.G1 = this.D1.getCurrentPosition();
            this.D1.pause();
            this.H1 = true;
            I7.o(this, new c(), new boolean[0]);
        }
    }

    public final void P1() {
        if (getSharedPreferences("mysession", 0).getBoolean("isfull", false)) {
            b bVar = new b();
            this.C1 = bVar;
            this.F1.postDelayed(bVar, getSharedPreferences("mysession", 0).getInt("fulltimer", 20000));
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_helper_full_screen);
        this.E1 = (PlayerView) findViewById(R.id.playerView);
        N1();
        R().e(new a(true));
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        Runnable runnable;
        super.onDestroy();
        if (getSharedPreferences("mysession", 0).getBoolean("isfull", false) && (runnable = this.C1) != null) {
            this.F1.removeCallbacks(runnable);
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.D1;
        if (interfaceC3921Pg0 != null) {
            this.G1 = interfaceC3921Pg0.getCurrentPosition();
            this.D1.D0(false);
            N1();
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.D1 == null) {
            K1();
        } else {
            M1();
        }
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.H1) {
            return;
        }
        L1();
    }
}
