package o;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;
import o.C9257rT;
import o.CT;

/* renamed from: o.vT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10229vT {
    public static final String A = "android.support.customtabs.customaction.DESCRIPTION";
    public static final int A0 = 0;
    public static final String B = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final int B0 = 5;
    public static final String C = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final int C0 = 16;
    public static final String D = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String D0 = "Accept-Language";
    public static final String E = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String F = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 2;
    public static final String K = "androidx.browser.customtabs.extra.SHARE_STATE";
    @Deprecated
    public static final String L = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String M = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String N = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String O = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String P = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String Q = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String R = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String S = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String T = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 2;
    public static final String Y = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String Z = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final String a0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final String b0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final String c = "android.support.customtabs.extra.user_opt_out";
    public static final int c0 = 0;
    public static final String d = "android.support.customtabs.extra.SESSION";
    public static final int d0 = 1;
    public static final String e = "android.support.customtabs.extra.SESSION_ID";
    public static final int e0 = 2;
    public static final int f = 0;
    public static final int f0 = 2;
    public static final int g = 1;
    public static final String g0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final int h = 2;
    public static final int h0 = 0;
    public static final int i = 2;
    public static final int i0 = 1;
    public static final String j = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final int j0 = 2;
    public static final String k = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final int k0 = 3;
    public static final String l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final int l0 = 3;
    public static final String m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final int m0 = 0;
    public static final String n = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final int n0 = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final String f898o = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final int o0 = 2;
    public static final String p = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final int p0 = 2;
    public static final String q = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final String q0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final String r = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    public static final String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final String s = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final String s0 = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final String t = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final int t0 = 0;
    public static final int u = 0;
    public static final int u0 = 1;
    public static final int v = 1;
    public static final int v0 = 2;
    public static final String w = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final int w0 = 2;
    public static final String x = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String x0 = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String y = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String y0 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String z = "android.support.customtabs.customaction.ICON";
    public static final String z0 = "android.support.customtabs.customaction.ID";
    public final Intent a;
    public final Bundle b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$d */
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* renamed from: o.vT$e */
    /* loaded from: classes.dex */
    public static class e {
        public static Locale a(Intent intent) {
            String stringExtra = intent.getStringExtra(C10229vT.r);
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        public static void b(Intent intent, Locale locale) {
            intent.putExtra(C10229vT.r, locale.toLanguageTag());
        }
    }

    /* renamed from: o.vT$f */
    /* loaded from: classes.dex */
    public static class f {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* renamed from: o.vT$g */
    /* loaded from: classes.dex */
    public static class g {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: o.vT$h */
    /* loaded from: classes.dex */
    public static class h {
        public static void a(ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$j */
    /* loaded from: classes.dex */
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$k */
    /* loaded from: classes.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vT$l */
    /* loaded from: classes.dex */
    public @interface l {
    }

    public C10229vT(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public static int a(Intent intent) {
        return intent.getIntExtra(Y, 0);
    }

    public static int b(Intent intent) {
        return intent.getIntExtra(b0, 0);
    }

    public static int c(Intent intent) {
        return intent.getIntExtra(q0, 0);
    }

    public static int d(Intent intent) {
        return intent.getIntExtra(g0, 0);
    }

    public static int e(Intent intent) {
        return intent.getIntExtra(r0, 0);
    }

    public static int f(Intent intent) {
        return intent.getIntExtra(x0, 0);
    }

    public static C9257rT g(Intent intent, int i2) {
        Bundle bundle;
        if (i2 >= 0 && i2 <= 2 && i2 != 0) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return C9257rT.a(null);
            }
            C9257rT a2 = C9257rT.a(extras);
            SparseArray sparseParcelableArray = extras.getSparseParcelableArray(R);
            if (sparseParcelableArray != null && (bundle = (Bundle) sparseParcelableArray.get(i2)) != null) {
                return C9257rT.a(bundle).c(a2);
            }
            return a2;
        }
        throw new IllegalArgumentException("Invalid colorScheme: " + i2);
    }

    public static int h(Intent intent) {
        return intent.getIntExtra(T, 0);
    }

    public static int i(Intent intent) {
        return intent.getIntExtra(Z, 0);
    }

    public static Locale j(Intent intent) {
        return e.a(intent);
    }

    public static int k() {
        return 5;
    }

    public static PendingIntent l(Intent intent) {
        return (PendingIntent) intent.getParcelableExtra(t);
    }

    public static int m(Intent intent) {
        return intent.getIntExtra(s0, 16);
    }

    public static Locale n(Intent intent) {
        return j(intent);
    }

    public static boolean o(Intent intent) {
        return intent.getBooleanExtra(a0, false);
    }

    public static boolean p(Intent intent) {
        return !intent.getBooleanExtra(s, false);
    }

    public static boolean q(Intent intent) {
        return !intent.getBooleanExtra(f898o, false);
    }

    public static boolean r(Intent intent) {
        return !intent.getBooleanExtra(p, false);
    }

    public static boolean s(Intent intent) {
        return intent.getBooleanExtra(q, false);
    }

    public static Intent u(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(c, true);
        return intent;
    }

    public static boolean v(Intent intent) {
        if (!intent.getBooleanExtra(c, false) || (intent.getFlags() & 268435456) == 0) {
            return false;
        }
        return true;
    }

    public void t(Context context, Uri uri) {
        this.a.setData(uri);
        C10201vM.A(context, this.a, this.b);
    }

    /* renamed from: o.vT$i */
    /* loaded from: classes.dex */
    public static final class i {
        public ArrayList<Bundle> c;
        public ActivityOptions d;
        public ArrayList<Bundle> e;
        public SparseArray<Bundle> f;
        public Bundle g;
        public boolean j;
        public final Intent a = new Intent("android.intent.action.VIEW");
        public final C9257rT.a b = new C9257rT.a();
        public int h = 0;
        public boolean i = true;

        public i() {
        }

        public i A(boolean z) {
            this.i = z;
            return this;
        }

        public final void B(Locale locale) {
            e.b(this.a, locale);
        }

        @Deprecated
        public i C(int i) {
            this.b.b(i);
            return this;
        }

        @Deprecated
        public i D(int i) {
            this.b.c(i);
            return this;
        }

        public i E(CT.d dVar) {
            K(null, dVar.b());
            return this;
        }

        @Deprecated
        public i F(int i) {
            this.b.d(i);
            return this;
        }

        public i G(PendingIntent pendingIntent) {
            this.a.putExtra(C10229vT.t, pendingIntent);
            return this;
        }

        public i H(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
            this.a.putExtra(C10229vT.M, remoteViews);
            this.a.putExtra(C10229vT.N, iArr);
            this.a.putExtra(C10229vT.O, pendingIntent);
            return this;
        }

        public i I(boolean z) {
            this.a.putExtra(C10229vT.q, z);
            return this;
        }

        public i J(CT ct) {
            this.a.setPackage(ct.h().getPackageName());
            K(ct.g(), ct.i());
            return this;
        }

        public final void K(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder(C10229vT.d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(C10229vT.e, pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public i L(boolean z) {
            this.j = z;
            return this;
        }

        public final void M() {
            if (this.d == null) {
                this.d = f.a();
            }
            h.a(this.d, this.j);
        }

        public i N(int i) {
            if (i >= 0 && i <= 2) {
                this.h = i;
                if (i == 1) {
                    this.a.putExtra(C10229vT.L, true);
                    return this;
                } else if (i == 2) {
                    this.a.putExtra(C10229vT.L, false);
                    return this;
                } else {
                    this.a.removeExtra(C10229vT.L);
                    return this;
                }
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        public i O(boolean z) {
            this.a.putExtra(C10229vT.n, z ? 1 : 0);
            return this;
        }

        public i P(Context context, int i, int i2) {
            this.d = ActivityOptions.makeCustomAnimation(context, i, i2);
            return this;
        }

        @Deprecated
        public i Q(int i) {
            this.b.e(i);
            return this;
        }

        public i R(int i) {
            if (i >= 0 && i <= 16) {
                this.a.putExtra(C10229vT.s0, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
        }

        public i S(Locale locale) {
            B(locale);
            return this;
        }

        public i T(boolean z) {
            this.a.putExtra(C10229vT.l, z);
            return this;
        }

        @Deprecated
        public i a() {
            N(1);
            return this;
        }

        public i b(String str, PendingIntent pendingIntent) {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(C10229vT.E, str);
            bundle.putParcelable(C10229vT.B, pendingIntent);
            this.c.add(bundle);
            return this;
        }

        @Deprecated
        public i c(int i, Bitmap bitmap, String str, PendingIntent pendingIntent) throws IllegalStateException {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            if (this.e.size() < 5) {
                Bundle bundle = new Bundle();
                bundle.putInt(C10229vT.z0, i);
                bundle.putParcelable(C10229vT.z, bitmap);
                bundle.putString(C10229vT.A, str);
                bundle.putParcelable(C10229vT.B, pendingIntent);
                this.e.add(bundle);
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        public C10229vT d() {
            Bundle bundle = null;
            if (!this.a.hasExtra(C10229vT.d)) {
                K(null, null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra(C10229vT.D, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra(C10229vT.x, arrayList2);
            }
            this.a.putExtra(C10229vT.Q, this.i);
            this.a.putExtras(this.b.a().b());
            Bundle bundle2 = this.g;
            if (bundle2 != null) {
                this.a.putExtras(bundle2);
            }
            if (this.f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray(C10229vT.R, this.f);
                this.a.putExtras(bundle3);
            }
            this.a.putExtra(C10229vT.K, this.h);
            int i = Build.VERSION.SDK_INT;
            s();
            if (i >= 34) {
                M();
            }
            ActivityOptions activityOptions = this.d;
            if (activityOptions != null) {
                bundle = activityOptions.toBundle();
            }
            return new C10229vT(this.a, bundle);
        }

        @Deprecated
        public i e() {
            this.a.putExtra(C10229vT.l, true);
            return this;
        }

        public i f(Bitmap bitmap, String str, PendingIntent pendingIntent) {
            return g(bitmap, str, pendingIntent, false);
        }

        public i g(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(C10229vT.z0, 0);
            bundle.putParcelable(C10229vT.z, bitmap);
            bundle.putString(C10229vT.A, str);
            bundle.putParcelable(C10229vT.B, pendingIntent);
            this.a.putExtra(C10229vT.w, bundle);
            this.a.putExtra(C10229vT.C, z);
            return this;
        }

        public i h(int i) {
            if (i > 0) {
                this.a.putExtra(C10229vT.b0, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
        }

        public i i(int i) {
            if (i >= 0 && i <= 3) {
                this.a.putExtra(C10229vT.q0, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the decorationType argument");
        }

        public i j(boolean z) {
            this.a.putExtra(C10229vT.a0, z);
            return this;
        }

        public i k(int i) {
            if (i >= 0 && i <= 2) {
                this.a.putExtra(C10229vT.g0, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
        }

        public i l(int i) {
            if (i >= 0 && i <= 2) {
                this.a.putExtra(C10229vT.r0, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
        }

        public i m(boolean z) {
            this.a.putExtra(C10229vT.s, !z);
            return this;
        }

        public i n(boolean z) {
            this.a.putExtra(C10229vT.f898o, !z);
            return this;
        }

        public i o(Bitmap bitmap) {
            this.a.putExtra(C10229vT.m, bitmap);
            return this;
        }

        public i p(int i) {
            if (i >= 0 && i <= 2) {
                this.a.putExtra(C10229vT.x0, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the position argument");
        }

        public i q(int i) {
            if (i >= 0 && i <= 2) {
                this.a.putExtra(C10229vT.j, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the colorScheme argument");
        }

        public i r(int i, C9257rT c9257rT) {
            if (i >= 0 && i <= 2 && i != 0) {
                if (this.f == null) {
                    this.f = new SparseArray<>();
                }
                this.f.put(i, c9257rT.b());
                return this;
            }
            throw new IllegalArgumentException("Invalid colorScheme: " + i);
        }

        public final void s() {
            Bundle bundle;
            String a = g.a();
            if (!TextUtils.isEmpty(a)) {
                if (this.a.hasExtra("com.android.browser.headers")) {
                    bundle = this.a.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", a);
                    this.a.putExtra("com.android.browser.headers", bundle);
                }
            }
        }

        public i t(C9257rT c9257rT) {
            this.g = c9257rT.b();
            return this;
        }

        @Deprecated
        public i u(boolean z) {
            if (z) {
                N(1);
                return this;
            }
            N(2);
            return this;
        }

        public i v(boolean z) {
            this.a.putExtra(C10229vT.p, !z);
            return this;
        }

        public i w(Context context, int i, int i2) {
            this.a.putExtra(C10229vT.F, A5.e(context, i, i2).p());
            return this;
        }

        public i x(int i) {
            return y(i, 0);
        }

        public i y(int i, int i2) {
            if (i > 0) {
                if (i2 >= 0 && i2 <= 2) {
                    this.a.putExtra(C10229vT.T, i);
                    this.a.putExtra(C10229vT.Y, i2);
                    return this;
                }
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
        }

        public i z(int i) {
            if (i > 0) {
                this.a.putExtra(C10229vT.Z, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
        }

        public i(CT ct) {
            if (ct != null) {
                J(ct);
            }
        }
    }
}
