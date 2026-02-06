package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.MyDownloadsActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C5036aE2;
import o.C5239b42;
import o.C6641go1;
import o.C6884ho1;
import o.C7458kA2;
import o.C9254rS0;
import o.C9647t5;
import o.DF2;
import o.F50;
import o.G5;
import o.H5;
import o.HA0;
import o.HF2;
import o.P5;
import o.X5;

/* loaded from: classes3.dex */
public class MyDownloadsActivity extends ActivityC3020Gb {
    public static C9647t5 F1;
    public String C1;
    public List<HF2> D1;
    public final X5<C9254rS0> E1 = X(new P5.n(), new H5() { // from class: o.ko1
        @Override // o.H5
        public final void a(Object obj) {
            MyDownloadsActivity.F1(MyDownloadsActivity.this, (G5) obj);
        }
    });

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyDownloadsActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements HA0<List<HF2>, C7458kA2> {
        public b() {
        }

        @Override // o.HA0
        /* renamed from: c */
        public C7458kA2 invoke(List<HF2> list) {
            MyDownloadsActivity.this.M1(list);
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(MyDownloadsActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final /* synthetic */ C5239b42 X;

        public d(C5239b42 c5239b42) {
            this.X = c5239b42;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyDownloadsActivity.J1(this.X, MyDownloadsActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public final /* synthetic */ String X;

        public e(String str) {
            this.X = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(MyDownloadsActivity.this, this.X, 1).show();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements DF2.e {
        public f() {
        }

        public static /* synthetic */ void b(f fVar, int i) {
            MyDownloadsActivity.this.D1.remove(i);
            MyDownloadsActivity.F1.f.getAdapter().v(i);
        }

        @Override // o.DF2.e
        public void a(Uri uri, final int i) {
            MyDownloadsActivity.this.H1(uri);
            MyDownloadsActivity.this.runOnUiThread(new Runnable() { // from class: o.lo1
                @Override // java.lang.Runnable
                public final void run() {
                    MyDownloadsActivity.f.b(MyDownloadsActivity.f.this, i);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyDownloadsActivity.this.L1();
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyDownloadsActivity.this.L1();
        }
    }

    public static /* synthetic */ void F1(MyDownloadsActivity myDownloadsActivity, G5 g5) {
        myDownloadsActivity.getClass();
        if (g5.b() == -1) {
            Toast.makeText(myDownloadsActivity, "succesfully", 0).show();
            myDownloadsActivity.runOnUiThread(new h());
        }
    }

    public static final void J1(C5239b42 c5239b42, MyDownloadsActivity myDownloadsActivity) {
        try {
            c5239b42.i(myDownloadsActivity.getApplicationContext());
        } catch (Exception e2) {
            e2.printStackTrace();
            myDownloadsActivity.K1("Error occurred during fetch.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        F1.f.setLayoutManager(new GridLayoutManager((Context) this, 2, 1, false));
        F1.d.setVisibility(8);
        F1.f.setVisibility(0);
        F1.e.setVisibility(0);
        this.C1 = getIntent().getStringExtra("type");
        C5239b42 c5239b42 = (C5239b42) new u(this).a(C5239b42.class);
        c5239b42.d.k(this, new F50(new b()));
        I1(c5239b42);
        R().e(new c(true));
    }

    public void H1(Uri uri) {
        RemoteAction userAction;
        ContentResolver contentResolver = getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            Log.d("uri:==", "DeleteVideo: " + uri);
            contentResolver.delete(uri, null, null);
            Toast.makeText(this, "Successfully Delete Video", 0).show();
            runOnUiThread(new g());
        } catch (SecurityException e2) {
            Log.d("uri:==", "DeleteVideo121: ");
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Log.d("uri:==", "SDK_INT: ");
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri);
                pendingIntent = MediaStore.createDeleteRequest(contentResolver, arrayList);
            } else if (i >= 29) {
                Log.d("uri:==", "VERSION_CODES: ");
                if (C6641go1.a(e2)) {
                    userAction = C6884ho1.a(e2).getUserAction();
                    pendingIntent = userAction.getActionIntent();
                }
            }
            if (pendingIntent != null) {
                this.E1.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
                Toast.makeText(this, "Successfully Delete Video", 0).show();
            }
        }
    }

    public final void I1(C5239b42 c5239b42) {
        new Thread(new d(c5239b42)).start();
    }

    public final void K1(String str) {
        runOnUiThread(new e(str));
    }

    public void M1(List<HF2> list) {
        Log.d("checkwhich", "adasdasD:-" + this.C1);
        if (!list.isEmpty()) {
            this.D1 = new ArrayList();
            Log.d("checkwhich", "size:-" + this.D1.size());
            for (int i = 0; i < list.size(); i++) {
                if (this.C1.equals("Facebook")) {
                    String i2 = list.get(i).i();
                    if (i2.substring(0, Math.min(8, i2.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("Inst")) {
                    String i3 = list.get(i).i();
                    if (i3.substring(0, Math.min(4, i3.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("Twitter")) {
                    String i4 = list.get(i).i();
                    if (i4.substring(0, Math.min(7, i4.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("Thread")) {
                    String i5 = list.get(i).i();
                    if (i5.substring(0, Math.min(6, i5.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("Linkedin")) {
                    String i6 = list.get(i).i();
                    if (i6.substring(0, Math.min(8, i6.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("Pinterest")) {
                    String i7 = list.get(i).i();
                    if (i7.substring(0, Math.min(9, i7.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("Snack")) {
                    String i8 = list.get(i).i();
                    if (i8.substring(0, Math.min(5, i8.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else if (this.C1.equals("TT")) {
                    String i9 = list.get(i).i();
                    if (i9.substring(0, Math.min(2, i9.length())).equals(this.C1)) {
                        this.D1.add(list.get(i));
                    }
                } else {
                    this.D1.add(list.get(i));
                }
            }
            if (!this.D1.isEmpty()) {
                Collections.reverse(this.D1);
                F1.d.setVisibility(8);
                F1.e.setVisibility(8);
                F1.f.setAdapter(new DF2(this.D1, this, new f()));
                return;
            }
            F1.e.setVisibility(8);
            F1.d.setVisibility(0);
        }
        F1.e.setVisibility(8);
        F1.d.setVisibility(0);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9647t5 c2 = C9647t5.c(getLayoutInflater());
        F1 = c2;
        setContentView(c2.getRoot());
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        F1.c.setOnClickListener(new a());
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        L1();
    }
}
