package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.ReelMainActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C2723Dd;
import o.C5036aE2;
import o.I7;
import o.InterfaceC5670cr1;
import o.QP1;

/* loaded from: classes3.dex */
public class ReelMainActivity extends ActivityC3020Gb {
    public RecyclerView C1;
    public QP1 D1;
    public u E1;
    public LinearLayout F1;
    public Button G1;
    public Runnable J1;
    public ArrayList<String> H1 = new ArrayList<>();
    public int I1 = -1;
    public final Handler K1 = new Handler();

    /* loaded from: classes3.dex */
    public class a extends RecyclerView.u {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(@InterfaceC5670cr1 RecyclerView recyclerView, int i) {
            View h;
            if (i == 0 && (h = ReelMainActivity.this.E1.h(recyclerView.getLayoutManager())) != null) {
                int w0 = recyclerView.getLayoutManager().w0(h);
                ReelMainActivity reelMainActivity = ReelMainActivity.this;
                if (w0 != reelMainActivity.I1) {
                    reelMainActivity.I1 = w0;
                    reelMainActivity.D1.L(w0);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ReelMainActivity.this.getSharedPreferences("mysession", 0).edit().putBoolean("isreelfirsttime", true).apply();
            ReelMainActivity.this.F1.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                int i;
                ReelMainActivity reelMainActivity = ReelMainActivity.this;
                QP1 qp1 = reelMainActivity.D1;
                if (qp1 != null && (i = reelMainActivity.I1) >= 0) {
                    qp1.L(i);
                }
                ReelMainActivity.this.K1.postDelayed(ReelMainActivity.this.J1, ReelMainActivity.this.getSharedPreferences("mysession", 0).getInt("reeltimer", 20000));
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I7.o(ReelMainActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractC2891Eu1 {
        public d(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(ReelMainActivity.this);
        }
    }

    public static /* synthetic */ void F1(final ReelMainActivity reelMainActivity) {
        QP1 qp1 = new QP1(reelMainActivity, reelMainActivity.H1, reelMainActivity.C1);
        reelMainActivity.D1 = qp1;
        reelMainActivity.C1.setAdapter(qp1);
        reelMainActivity.C1.postDelayed(new Runnable() { // from class: o.PP1
            @Override // java.lang.Runnable
            public final void run() {
                ReelMainActivity.this.D1.L(0);
            }
        }, 400L);
    }

    public static /* synthetic */ void G1(final ReelMainActivity reelMainActivity) {
        reelMainActivity.getClass();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C2723Dd.e0()).openConnection();
            httpURLConnection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    reelMainActivity.H1.add(readLine);
                } else {
                    Collections.shuffle(reelMainActivity.H1);
                    reelMainActivity.runOnUiThread(new Runnable() { // from class: o.NP1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ReelMainActivity.F1(ReelMainActivity.this);
                        }
                    });
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void K1() {
        new Thread(new Runnable() { // from class: o.OP1
            @Override // java.lang.Runnable
            public final void run() {
                ReelMainActivity.G1(ReelMainActivity.this);
            }
        }).start();
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reel_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.C1 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.F1 = (LinearLayout) findViewById(R.id.suggestion);
        this.G1 = (Button) findViewById(R.id.btnContinue);
        u uVar = new u();
        this.E1 = uVar;
        uVar.b(this.C1);
        if (getSharedPreferences("mysession", 0).getBoolean("isreelfirsttime", false)) {
            this.F1.setVisibility(8);
        }
        K1();
        this.C1.r(new a());
        if (getSharedPreferences("mysession", 0).getBoolean("isreelfirsttime", false)) {
            this.F1.setVisibility(8);
        }
        this.G1.setOnClickListener(new b());
        if (getSharedPreferences("mysession", 0).getBoolean("isreel", false)) {
            c cVar = new c();
            this.J1 = cVar;
            this.K1.postDelayed(cVar, getSharedPreferences("mysession", 0).getInt("reeltimer", 20000));
        }
        R().e(new d(true));
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        QP1 qp1 = this.D1;
        if (qp1 != null) {
            qp1.M();
        }
        Runnable runnable = this.J1;
        if (runnable != null) {
            this.K1.removeCallbacks(runnable);
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPause() {
        super.onPause();
        QP1 qp1 = this.D1;
        if (qp1 != null) {
            qp1.M();
        }
    }
}
