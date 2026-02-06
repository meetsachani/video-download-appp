package o;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.DownloadActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.util.List;
import o.C7926m60;
import o.DS2;

/* renamed from: o.ep  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6145ep extends com.google.android.material.bottomsheet.b {
    public static String O2 = "url";
    public static IS2 P2;
    public C4971Zy0 J2;
    public C5239b42 K2;
    public String L2 = "";
    public String M2 = "de_bottom";
    public AS2 N2 = null;

    /* renamed from: o.ep$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6145ep.this.J2();
            C6145ep.this.L2 = "";
        }
    }

    /* renamed from: o.ep$b */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ C10228vS2[] X;

        public b(C10228vS2[] c10228vS2Arr) {
            this.X = c10228vS2Arr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6145ep.this.J2();
            C6145ep c6145ep = C6145ep.this;
            AS2 as2 = c6145ep.N2;
            if (as2 == null) {
                Toast.makeText(c6145ep.U1(), "Select Quality...", 0).show();
            } else {
                c6145ep.n3(as2.b(), this.X[0].e(), this.X[0].c());
            }
        }
    }

    /* renamed from: o.ep$c */
    /* loaded from: classes3.dex */
    public class c implements C7926m60.b {
        public c() {
        }

        @Override // o.C7926m60.b
        public void a(AS2 as2) {
            Log.d("DataGet", "onClick: " + as2.a());
            C6145ep.this.N2 = as2;
        }
    }

    /* renamed from: o.ep$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC3208Hy1 {
        public final C10228vS2[] a;

        /* renamed from: o.ep$d$a */
        /* loaded from: classes3.dex */
        public class a implements DS2.c {
            public final /* synthetic */ C10228vS2[] a;

            public a(C10228vS2[] c10228vS2Arr) {
                this.a = c10228vS2Arr;
            }

            @Override // o.DS2.c
            public void a(String str, String str2) {
                String str3 = C6145ep.this.M2;
                Log.d(str3, "getRaw: " + str);
                String str4 = C6145ep.this.M2;
                Log.d(str4, "getRaw: " + str2);
                d.this.c(this.a, str, str2);
            }
        }

        public d(C10228vS2[] c10228vS2Arr) {
            this.a = c10228vS2Arr;
        }

        @Override // o.InterfaceC3208Hy1
        public void a(IS2 is2) {
            C6145ep.this.J2.g.setEnabled(true);
            this.a[0] = new C10228vS2(is2);
            C6145ep.P2 = is2;
            Log.d("JDJDJDJDJ", "onParse: " + is2.b().get(0).b());
            C6145ep.this.J2.f.setVisibility(0);
            C6145ep.this.J2.j.setVisibility(8);
            C6145ep.this.J2.k.setVisibility(8);
            com.bumptech.glide.a.F(C6145ep.this.U1()).r(is2.b().get(0).b()).C1(C6145ep.this.J2.i);
            String i3 = C6145ep.this.i3(is2.e(), is2.d());
            this.a[0].n(i3);
            C6145ep.this.J2.l.setText(i3);
            C6145ep.this.m3(C6145ep.P2.b());
            DS2.b(C6145ep.this.U1()).c(C6145ep.P2.b().get(0).b(), new a(this.a));
        }

        @Override // o.InterfaceC3208Hy1
        public void b(String str) {
            String str2 = C6145ep.this.M2;
            Log.e(str2, "onError: " + str);
            C6145ep.this.J2.j.setVisibility(8);
            C6145ep.this.J2.k.setText(R.string.error_in_parsing_url);
            C6145ep.this.J2();
        }

        public void c(C10228vS2[] c10228vS2Arr, String str, String str2) {
            C6145ep.this.J2.f689o.setText(str);
            C6145ep.this.J2.n.setText(str2);
            c10228vS2Arr[0].t(str);
            c10228vS2Arr[0].u(str2);
        }
    }

    public static boolean j3(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }

    public static C6145ep k3() {
        return new C6145ep();
    }

    public static C6145ep l3(String str) {
        C6145ep c6145ep = new C6145ep();
        Bundle bundle = new Bundle();
        bundle.putString(O2, str);
        c6145ep.f2(bundle);
        return c6145ep;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void N0(Bundle bundle) {
        super.N0(bundle);
        this.L2 = s().getString(O2);
        String str = this.M2;
        Log.e(str, "onCreate: " + this.L2);
        this.K2 = (C5239b42) new androidx.lifecycle.u(S1()).a(C5239b42.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4971Zy0 a2 = C4971Zy0.a(layoutInflater.inflate(R.layout.fragment_bottom_sheet, viewGroup, false));
        this.J2 = a2;
        return a2.getRoot();
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void U0() {
        super.U0();
        DS2.b(U1()).e();
    }

    public String i3(String str, String str2) {
        if (!str.isEmpty() && !j3(str)) {
            return str;
        }
        return str2 + CrashlyticsReportPersistence.m + System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(View view, Bundle bundle) {
        super.m1(view, bundle);
        C10228vS2[] c10228vS2Arr = new C10228vS2[1];
        this.J2.g.setEnabled(false);
        C9741tS1.c(U1()).e(this.L2, new d(c10228vS2Arr));
        this.J2.d.setOnClickListener(new a());
        this.J2.g.setOnClickListener(new b(c10228vS2Arr));
    }

    public void m3(List<AS2> list) {
        this.J2.h.setLayoutManager(new LinearLayoutManager(U1(), 1, false));
        this.J2.h.setHasFixedSize(true);
        this.J2.h.setAdapter(new C7926m60(U1(), list, new c()));
    }

    public void n3(String str, String str2, String str3) {
        DownloadManager downloadManager = (DownloadManager) U1().getSystemService("download");
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + RemoteSettings.i + BS2.a);
        if (!file.exists()) {
            file.mkdirs();
        }
        Log.d("TAGCHECK", "startDownload: " + str);
        if (str.isEmpty()) {
            Toast.makeText(o(), "Please Try Other Video", 0).show();
            return;
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setAllowedNetworkTypes(3);
        request.setTitle("Download");
        request.setDescription("Downloading video...");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        String str4 = Environment.DIRECTORY_DOWNLOADS;
        request.setDestinationInExternalPublicDir(str4, RemoteSettings.i + BS2.a + RemoteSettings.i + DownloadActivity.F1 + CrashlyticsReportPersistence.m + System.currentTimeMillis() + ".mp4");
        Log.d("URLNEWService", "Called");
        Log.d("URLNEWService", str);
        new C11276zm1(request, downloadManager, str, str2, str3, U1()).start();
        Toast.makeText(o(), "Download Successfully", 0).show();
    }
}
