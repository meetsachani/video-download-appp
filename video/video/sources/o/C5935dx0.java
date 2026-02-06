package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C10231vT1;
import o.C9128qw2;

/* renamed from: o.dx0 */
/* loaded from: classes.dex */
public class C5935dx0 {
    @Deprecated
    public static final String a = "font_results";
    @Deprecated
    public static final int b = -1;
    @Deprecated
    public static final int c = -2;

    /* renamed from: o.dx0$a */
    /* loaded from: classes.dex */
    public static final class a implements BaseColumns {
        public static final String a = "file_id";
        public static final String b = "font_ttc_index";
        public static final String c = "font_variation_settings";
        public static final String d = "font_weight";
        public static final String e = "font_italic";
        public static final String f = "result_code";
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
    }

    /* renamed from: o.dx0$c */
    /* loaded from: classes.dex */
    public static class c {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        @Deprecated
        public c(Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) C10907yF1.l(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static c a(Uri uri, int i, int i2, boolean z, int i3) {
            return new c(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.dx0$e */
    /* loaded from: classes.dex */
    public @interface e {
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, c[] cVarArr) {
        return C9128qw2.d(context, cancellationSignal, cVarArr, 0);
    }

    public static b b(Context context, CancellationSignal cancellationSignal, C4761Xw0 c4761Xw0) throws PackageManager.NameNotFoundException {
        List a2;
        a2 = C8878pw2.a(new Object[]{c4761Xw0});
        return C4664Ww0.f(context, a2, cancellationSignal);
    }

    @Deprecated
    public static Typeface c(Context context, C4761Xw0 c4761Xw0, C10231vT1.f fVar, Handler handler, boolean z, int i, int i2) {
        List a2;
        C9128qw2.a aVar = new C9128qw2.a(fVar);
        Handler e2 = C10231vT1.f.e(handler);
        a2 = C8878pw2.a(new Object[]{c4761Xw0});
        return f(context, a2, i2, z, i, e2, aVar);
    }

    @Deprecated
    public static ProviderInfo d(PackageManager packageManager, C4761Xw0 c4761Xw0, Resources resources) throws PackageManager.NameNotFoundException {
        return C4664Ww0.g(packageManager, c4761Xw0, resources);
    }

    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return C10831xw2.h(context, cVarArr, cancellationSignal);
    }

    public static Typeface f(Context context, List<C4761Xw0> list, int i, boolean z, int i2, Handler handler, d dVar) {
        C3778Nt c3778Nt = new C3778Nt(dVar, C6559gS1.b(handler));
        if (z) {
            if (list.size() <= 1) {
                return C5208ax0.e(context, list.get(0), c3778Nt, i, i2);
            }
            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
        }
        return C5208ax0.d(context, list, i, null, c3778Nt);
    }

    public static Typeface g(Context context, C4761Xw0 c4761Xw0, int i, boolean z, int i2, Handler handler, d dVar) {
        List a2;
        a2 = C8878pw2.a(new Object[]{c4761Xw0});
        return f(context, a2, i, z, i2, handler, dVar);
    }

    public static void h(Context context, C4761Xw0 c4761Xw0, int i, Executor executor, Executor executor2, d dVar) {
        List a2;
        C3778Nt c3778Nt = new C3778Nt(dVar, executor2);
        Context applicationContext = context.getApplicationContext();
        a2 = C8878pw2.a(new Object[]{c4761Xw0});
        C5208ax0.d(applicationContext, a2, i, executor, c3778Nt);
    }

    @Deprecated
    public static void i(Context context, C4761Xw0 c4761Xw0, d dVar, Handler handler) {
        List a2;
        C3778Nt c3778Nt = new C3778Nt(dVar);
        Executor b2 = C6559gS1.b(handler);
        Context applicationContext = context.getApplicationContext();
        a2 = C8878pw2.a(new Object[]{c4761Xw0});
        C5208ax0.d(applicationContext, a2, 0, b2, c3778Nt);
    }

    public static void j(Context context, List<C4761Xw0> list, int i, Executor executor, Executor executor2, d dVar) {
        C5208ax0.d(context.getApplicationContext(), list, i, executor, new C3778Nt(dVar, executor2));
    }

    @Deprecated
    public static void k() {
        C5208ax0.f();
    }

    public static void l() {
        C5208ax0.f();
    }

    /* renamed from: o.dx0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        public final int a;
        public final List<c[]> b;

        @Deprecated
        public b(int i, c[] cVarArr) {
            this.a = i;
            this.b = Collections.singletonList(cVarArr);
        }

        public static b a(int i, List<c[]> list) {
            return new b(i, list);
        }

        public static b b(int i, c[] cVarArr) {
            return new b(i, cVarArr);
        }

        public c[] c() {
            return this.b.get(0);
        }

        public List<c[]> d() {
            return this.b;
        }

        public int e() {
            return this.a;
        }

        public boolean f() {
            if (this.b.size() > 1) {
                return true;
            }
            return false;
        }

        public b(int i, List<c[]> list) {
            this.a = i;
            this.b = list;
        }
    }

    /* renamed from: o.dx0$d */
    /* loaded from: classes.dex */
    public static class d {
        @Deprecated
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = -1;
        public static final int d = -2;
        public static final int e = -3;
        public static final int f = -4;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.dx0$d$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        public void a(int i2) {
        }

        public void b(Typeface typeface) {
        }
    }
}
