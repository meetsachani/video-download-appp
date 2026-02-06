package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.core.k;
import androidx.camera.view.PreviewView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.VideoDatalActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C10201vM;
import o.C2898Ex;
import o.C4343To;
import o.C5036aE2;
import o.C5240b5;
import o.C8322nf1;
import o.HD1;
import o.InterfaceC3921Pg0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes3.dex */
public class VideoDatalActivity extends ActivityC3020Gb {
    public static final int M1 = 100;
    public SharedPreferences.Editor C1;
    public SharedPreferences D1;
    public ImageView E1;
    public PreviewView F1;
    public androidx.camera.lifecycle.b G1;
    public InterfaceC3921Pg0 H1;
    public PlayerView I1;
    public TextView J1;
    public boolean K1 = true;
    public int L1 = 0;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoDatalActivity.this.O1();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoDatalActivity.this.M1();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(VideoDatalActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements HD1.g {
        public d() {
        }

        @Override // o.HD1.g
        public void O(int i) {
            if (i == 3 && VideoDatalActivity.this.H1.u1()) {
                VideoDatalActivity.this.J1.setVisibility(8);
                VideoDatalActivity videoDatalActivity = VideoDatalActivity.this;
                videoDatalActivity.C1.putInt("uservcount", videoDatalActivity.D1.getInt("uservcount", 0) + 1);
                VideoDatalActivity.this.C1.apply();
            }
            if (i == 4) {
                VideoDatalActivity.this.R().l();
            }
        }
    }

    public static /* synthetic */ void F1(VideoDatalActivity videoDatalActivity, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        videoDatalActivity.getClass();
        try {
            videoDatalActivity.G1 = (androidx.camera.lifecycle.b) interfaceFutureC8411o11.get();
            k build = new k.a().build();
            build.p0(videoDatalActivity.F1.getSurfaceProvider());
            C2898Ex b2 = new C2898Ex.a().d(0).b();
            videoDatalActivity.G1.a();
            videoDatalActivity.G1.m(videoDatalActivity, b2, build);
            Log.d("CameraX", "Camera started");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void Backpress(View view) {
        R().l();
    }

    public final void K1() {
        int i = this.D1.getInt("vcallindex", 0);
        ArrayList<String> arrayList = VideoHomeActivity.C1;
        if (arrayList != null && arrayList.size() > 0) {
            String str = VideoHomeActivity.C1.get(i);
            if (i < VideoHomeActivity.C1.size() - 1) {
                this.C1.putInt("vcallindex", i + 1);
            } else {
                this.C1.putInt("vcallindex", 0);
            }
            this.C1.apply();
            InterfaceC3921Pg0 w = new InterfaceC3921Pg0.c(this).w();
            this.H1 = w;
            this.I1.setPlayer(w);
            this.H1.g0(C8322nf1.d(Uri.parse(str)));
            this.H1.u0(0);
            this.H1.l1(new d());
            this.H1.m0();
            this.H1.t0();
        }
    }

    public final void L1() {
        if (C10201vM.a(this, "android.permission.CAMERA") == 0) {
            N1();
        } else {
            C5240b5.M(this, new String[]{"android.permission.CAMERA"}, 100);
        }
    }

    public final void M1() {
        if (this.G1 == null) {
            return;
        }
        if (this.L1 == 0) {
            this.L1 = 1;
        } else {
            this.L1 = 0;
        }
        C2898Ex b2 = new C2898Ex.a().d(this.L1).b();
        k build = new k.a().build();
        build.p0(this.F1.getSurfaceProvider());
        this.G1.a();
        this.G1.m(this, b2, build);
        Toast.makeText(this, "Camera Flipped", 0).show();
    }

    public final void N1() {
        final InterfaceFutureC8411o11<androidx.camera.lifecycle.b> u = androidx.camera.lifecycle.b.u(this);
        u.h4(new Runnable() { // from class: o.xF2
            @Override // java.lang.Runnable
            public final void run() {
                VideoDatalActivity.F1(VideoDatalActivity.this, u);
            }
        }, C10201vM.o(this));
    }

    public final void O1() {
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.H1;
        if (interfaceC3921Pg0 == null) {
            return;
        }
        if (this.K1) {
            interfaceC3921Pg0.setVolume(0.0f);
            this.E1.setImageResource(R.drawable.ic_mute);
        } else {
            interfaceC3921Pg0.setVolume(1.0f);
            this.E1.setImageResource(R.drawable.ic_unmute);
        }
        this.K1 = !this.K1;
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_datal);
        getWindow().addFlags(1024);
        getWindow().setFlags(1024, 1024);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.I1 = (PlayerView) findViewById(R.id.playerView);
        this.J1 = (TextView) findViewById(R.id.tv_connecting);
        this.F1 = (PreviewView) findViewById(R.id.previewView);
        this.E1 = (ImageView) findViewById(R.id.micBtn);
        SharedPreferences sharedPreferences = getSharedPreferences("mysession", 0);
        this.D1 = sharedPreferences;
        this.C1 = sharedPreferences.edit();
        findViewById(R.id.micBtn).setOnClickListener(new a());
        findViewById(R.id.flip_camera).setOnClickListener(new b());
        K1();
        L1();
        R().e(new c(true));
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.H1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.g();
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPause() {
        super.onPause();
        androidx.camera.lifecycle.b bVar = this.G1;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100) {
            if (iArr.length > 0 && iArr[0] == 0) {
                N1();
            } else {
                Toast.makeText(this, "Camera permission denied!", 0).show();
            }
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        L1();
    }
}
