package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.VideoHomeActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C10201vM;
import o.C11284zo1;
import o.C2723Dd;
import o.C4343To;
import o.C5036aE2;
import o.C5240b5;
import o.I7;

/* loaded from: classes3.dex */
public class VideoHomeActivity extends ActivityC3020Gb {
    public static ArrayList<String> C1 = new ArrayList<>();

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoHomeActivity.this.J1();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(VideoHomeActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements I7.f {
        public c() {
        }

        @Override // o.I7.f
        public void a(boolean z) {
            VideoHomeActivity.this.startActivity(new Intent(VideoHomeActivity.this, VideoDatalActivity.class));
        }
    }

    public static /* synthetic */ void F1() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C2723Dd.e0()).openConnection();
            httpURLConnection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    C1.add(readLine);
                } else {
                    Collections.shuffle(C1);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void K1() {
        new Thread(new Runnable() { // from class: o.jG2
            @Override // java.lang.Runnable
            public final void run() {
                VideoHomeActivity.F1();
            }
        }).start();
    }

    public final void H1() {
        I7.o(this, new c(), new boolean[0]);
    }

    public boolean I1() {
        int a2 = C10201vM.a(this, "android.permission.CAMERA");
        int a3 = C10201vM.a(this, "android.permission.RECORD_AUDIO");
        ArrayList arrayList = new ArrayList();
        if (a2 != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (a3 != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        C5240b5.M(this, (String[]) arrayList.toArray(new String[0]), 1);
        return false;
    }

    public final void J1() {
        if (I1()) {
            H1();
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_home);
        getWindow().addFlags(1024);
        getWindow().setFlags(1024, 1024);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        K1();
        findViewById(R.id.btnCall).setOnClickListener(new a());
        R().e(new b(true));
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("android.permission.CAMERA", 0);
            hashMap.put("android.permission.RECORD_AUDIO", 0);
            if (iArr.length > 0) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    hashMap.put(strArr[i2], Integer.valueOf(iArr[i2]));
                }
                if (((Integer) hashMap.get("android.permission.CAMERA")).intValue() != 0 && ((Integer) hashMap.get("android.permission.RECORD_AUDIO")).intValue() != 0) {
                    if (C5240b5.S(this, "android.permission.CAMERA") || C5240b5.S(this, "android.permission.RECORD_AUDIO")) {
                        I1();
                        return;
                    }
                    return;
                }
                H1();
            }
        }
    }
}
