package o;

import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public class GS2 {
    public static String b = "de_prutils";
    public static int c;
    public static GS2 d;
    public Context a;

    /* loaded from: classes3.dex */
    public class a implements InterfaceC4562Vu1 {
        public final /* synthetic */ H50 a;

        public a(H50 h50) {
            this.a = h50;
        }

        @Override // o.InterfaceC4562Vu1
        public void a() {
            C11077yx1.k();
            Log.d(GS2.b, "onDownloadComplete: ");
            this.a.a();
        }

        @Override // o.InterfaceC4562Vu1
        public void c(C7327je0 c7327je0) {
            c7327je0.a().printStackTrace();
            String str = GS2.b;
            Log.e(str, "onError: " + c7327je0.a().getMessage());
            this.a.c(c7327je0);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements InterfaceC6171ev1 {
        public final /* synthetic */ H50 a;

        public b(H50 h50) {
            this.a = h50;
        }

        @Override // o.InterfaceC6171ev1
        public void b(C5783dJ1 c5783dJ1) {
            String str = GS2.b;
            Log.d(str, "onProgress: " + c5783dJ1.X);
            this.a.b(c5783dJ1);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements InterfaceC3392Ju1 {
        public final /* synthetic */ H50 a;

        public c(H50 h50) {
            this.a = h50;
        }

        @Override // o.InterfaceC3392Ju1
        public void onCancel() {
            this.a.onCancel();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements InterfaceC5686cv1 {
        public final /* synthetic */ H50 a;

        public d(H50 h50) {
            this.a = h50;
        }

        @Override // o.InterfaceC5686cv1
        public void onPause() {
            this.a.onPause();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements InterfaceC7153iv1 {
        public final /* synthetic */ H50 a;

        public e(H50 h50) {
            this.a = h50;
        }

        @Override // o.InterfaceC7153iv1
        public void a() {
            this.a.d();
        }
    }

    public GS2(Context context) {
        this.a = context;
    }

    public static String a(long j) {
        double d2;
        if (j < 1024) {
            return j + " B";
        }
        return String.format("%.1f %s", Double.valueOf(j / Math.pow(1024.0d, (int) (Math.log(d2) / Math.log(1024.0d)))), "KMGTPE".charAt(-1) + "B");
    }

    public static GS2 d(Context context) {
        if (d == null) {
            d = new GS2(context);
        }
        return d;
    }

    public void b() {
        C11077yx1.a(c);
    }

    public void c(String str, String str2, H50 h50) {
        String str3 = b;
        Log.e(str3, "downloadFileUrl: " + str2);
        c = C11077yx1.e(str, BS2.f().getAbsolutePath(), str2).f().P(new e(h50)).N(new d(h50)).M(new c(h50)).O(new b(h50)).Y(new a(h50));
    }

    public void e() {
        C11077yx1.i(c);
    }

    public void f() {
        C11077yx1.j(c);
    }
}
