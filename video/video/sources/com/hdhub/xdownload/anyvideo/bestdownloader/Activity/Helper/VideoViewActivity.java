package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.VideoViewActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import o.AD1;
import o.AI0;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C2723Dd;
import o.C2806Dz;
import o.C4343To;
import o.C5036aE2;
import o.C6998iG2;
import o.C8322nf1;
import o.C8541oZ;
import o.C8970qJ1;
import o.C9546sg;
import o.HD1;
import o.I7;
import o.InterfaceC3921Pg0;
import o.JZ;
import o.XH0;

/* loaded from: classes3.dex */
public class VideoViewActivity extends ActivityC3020Gb {
    public RecyclerView C1;
    public InterfaceC3921Pg0 D1;
    public PlayerView E1;
    public C6998iG2 F1;
    public ArrayList<C2806Dz> G1 = new ArrayList<>();
    public ArrayList<String> H1 = new ArrayList<>();
    public String I1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoViewActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements HD1.g {
        public b() {
        }

        @Override // o.HD1.g
        public void S(AD1 ad1) {
            VideoViewActivity.this.I1();
            Log.e("ExoPlayerError", "Video Error: " + ad1.getMessage());
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
                Intent intent = new Intent(VideoViewActivity.this, HelperFullScreenActivity.class);
                intent.putExtra("videoUrl", VideoViewActivity.this.I1);
                intent.putExtra("vtype", VideoViewActivity.this.getIntent().getIntExtra("vtype", 1));
                VideoViewActivity.this.startActivity(intent);
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(VideoViewActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractC2891Eu1 {
        public d(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(VideoViewActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements HD1.g {
        public e() {
        }

        @Override // o.HD1.g
        public void S(AD1 ad1) {
            VideoViewActivity.this.I1();
            Log.e("ExoPlayerError", "Video Error: " + ad1.getMessage());
        }
    }

    public static /* synthetic */ void F1(VideoViewActivity videoViewActivity) {
        InterfaceC3921Pg0 interfaceC3921Pg0 = videoViewActivity.D1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.g();
            videoViewActivity.D1 = null;
        }
        C8541oZ.b bVar = new C8541oZ.b();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", "Mozilla/5.0 (Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Mobile Safari/537.36");
        hashMap.put(AI0.J, videoViewActivity.getSharedPreferences("mysession", 0).getString(AI0.J, ""));
        hashMap.put("Accept", "*/*");
        hashMap.put("Accept-Encoding", XH0.S);
        bVar.b(hashMap);
        InterfaceC3921Pg0 w = new InterfaceC3921Pg0.c(videoViewActivity).J(new JZ(bVar)).w();
        videoViewActivity.D1 = w;
        videoViewActivity.E1.setPlayer(w);
        videoViewActivity.D1.C0(new C8970qJ1.b(bVar).e(C8322nf1.d(Uri.parse(videoViewActivity.I1))));
        videoViewActivity.D1.m0();
        videoViewActivity.D1.t0();
        videoViewActivity.D1.l1(new e());
    }

    public static /* synthetic */ void G1(final VideoViewActivity videoViewActivity) {
        videoViewActivity.getClass();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C2723Dd.j0()).openConnection();
            httpURLConnection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    videoViewActivity.H1.add(readLine);
                } else {
                    Collections.shuffle(videoViewActivity.H1);
                    videoViewActivity.I1 = videoViewActivity.H1.get(new Random().nextInt(videoViewActivity.H1.size())).toString();
                    Log.d("ExoPlayerError", "loadCsvData: " + videoViewActivity.I1);
                    videoViewActivity.runOnUiThread(new Runnable() { // from class: o.XG2
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoViewActivity.F1(VideoViewActivity.this);
                        }
                    });
                    return;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1() {
        new Thread(new Runnable() { // from class: o.WG2
            @Override // java.lang.Runnable
            public final void run() {
                VideoViewActivity.G1(VideoViewActivity.this);
            }
        }).start();
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_view);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.E1 = (PlayerView) findViewById(R.id.playerView);
        this.C1 = (RecyclerView) findViewById(R.id.recyHdVideoList);
        findViewById(R.id.back).setOnClickListener(new a());
        ArrayList<C2806Dz> arrayList = (ArrayList) getIntent().getSerializableExtra("link");
        this.G1 = arrayList;
        if (!arrayList.isEmpty()) {
            Collections.shuffle(this.G1);
            this.F1 = new C6998iG2(this, this.G1, getIntent().getIntExtra("vtype", 1));
            this.C1.setLayoutManager(new GridLayoutManager(this, 1));
            this.C1.setAdapter(this.F1);
        }
        String stringExtra = getIntent().getStringExtra("videoUrl");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            if (getIntent().getIntExtra("vtype", 1) == 1) {
                Uri parse = Uri.parse(stringExtra);
                InterfaceC3921Pg0 w = new InterfaceC3921Pg0.c(this).A(new C9546sg.e().c(3).f(1).a(), true).w();
                this.D1 = w;
                this.E1.setPlayer(w);
                this.E1.setUseController(true);
                this.D1.g0(C8322nf1.d(parse));
                this.D1.u0(2);
                this.D1.m0();
                this.D1.D0(true);
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
                this.D1.C0(new C8970qJ1.b(bVar).e(C8322nf1.d(Uri.parse(stringExtra))));
                this.D1.m0();
                this.D1.t0();
            }
            this.D1.l1(new b());
        }
        findViewById(R.id.fullscreenBtn).setOnClickListener(new c());
        R().e(new d(true));
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.D1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.g();
            this.D1 = null;
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.D1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.pause();
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC3921Pg0 interfaceC3921Pg0 = this.D1;
        if (interfaceC3921Pg0 != null) {
            interfaceC3921Pg0.D0(true);
        }
    }
}
