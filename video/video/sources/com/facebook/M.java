package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.facebook.M;
import com.facebook.S;
import com.facebook.appevents.C2327q;
import com.facebook.d0;
import com.facebook.internal.C2358c;
import com.facebook.internal.C2359d;
import com.facebook.internal.C2375u;
import com.facebook.internal.C2378x;
import com.facebook.internal.V;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import o.B22;
import o.C4465Uu1;
import o.C6562gT0;
import o.C7081id;
import o.C7330jf;
import o.C7458kA2;
import o.C8319ne2;
import o.C8912q5;
import o.C9545sf2;
import o.HT1;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.SQ;
import o.WQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M {
    @NotNull
    public static final String A = "com.facebook.sdk.ClientToken";
    @NotNull
    public static final String B = "com.facebook.sdk.WebDialogTheme";
    @NotNull
    public static final String C = "com.facebook.sdk.AutoInitEnabled";
    @NotNull
    public static final String D = "com.facebook.sdk.AutoLogAppEventsEnabled";
    @NotNull
    public static final String E = "com.facebook.sdk.CodelessDebugLogEnabled";
    @NotNull
    public static final String F = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
    @NotNull
    public static final String G = "com.facebook.sdk.CallbackOffset";
    @NotNull
    public static final String H = "com.facebook.sdk.MonitorEnabled";
    @NotNull
    public static final String I = "data_processing_options";
    @NotNull
    public static final String J = "data_processing_options_country";
    @NotNull
    public static final String K = "data_processing_options_state";
    @InterfaceC7058iW0
    public static boolean L = false;
    @InterfaceC7058iW0
    public static boolean M = false;
    @InterfaceC7058iW0
    public static boolean N = false;
    @NotNull
    public static final String O = "instagram";
    @NotNull
    public static final String P = "gaming";
    @NotNull
    public static final String Q = "facebook.com";
    @NotNull
    public static final String R = "fb.gg";
    @NotNull
    public static final String S = "instagram.com";
    @NotNull
    public static final AtomicBoolean T;
    @NotNull
    public static volatile String U = null;
    @NotNull
    public static volatile String V = null;
    @NotNull
    public static a W = null;
    @NotNull
    public static final String X = "com.facebook.sdk.CloudBridgeSavedCredentials";
    public static boolean Y = false;
    @Nullable
    public static Executor e = null;
    @Nullable
    public static volatile String f = null;
    @Nullable
    public static volatile String g = null;
    @Nullable
    public static volatile String h = null;
    @Nullable
    public static volatile Boolean i = null;
    public static volatile boolean k = false;
    public static boolean l = false;
    public static com.facebook.internal.U<File> m = null;
    public static Context n = null;
    @NotNull
    public static String q = null;
    public static final int r = 100;
    @NotNull
    public static final String s = "com.facebook.sdk.attributionTracking";
    @NotNull
    public static final String t = "%s/activities";
    @NotNull
    public static final String u = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
    @NotNull
    public static final String v = "The callback request code offset can't be negative.";
    @NotNull
    public static final String w = "com.facebook.sdk.appEventPreferences";
    @NotNull
    public static final String x = "com.facebook.sdk.DataProcessingOptions";
    @NotNull
    public static final String y = "com.facebook.sdk.ApplicationId";
    @NotNull
    public static final String z = "com.facebook.sdk.ApplicationName";
    @NotNull
    public static final M a = new M();
    public static final String b = M.class.getCanonicalName();
    @NotNull
    public static final HashSet<b0> c = B22.m(b0.DEVELOPER_ERRORS);
    @NotNull
    public static AtomicLong j = new AtomicLong(65536);
    public static final int d = 64206;

    /* renamed from: o  reason: collision with root package name */
    public static int f70o = d;
    @NotNull
    public static final ReentrantLock p = new ReentrantLock();

    @InterfaceC5056aJ2
    /* loaded from: classes2.dex */
    public interface a {
        @NotNull
        S a(@Nullable C0376a c0376a, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable S.b bVar);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    static {
        com.facebook.internal.c0 c0Var = com.facebook.internal.c0.a;
        q = com.facebook.internal.c0.a();
        T = new AtomicBoolean(false);
        U = S;
        V = Q;
        W = new a() { // from class: com.facebook.D
            @Override // com.facebook.M.a
            public final S a(C0376a c0376a, String str, JSONObject jSONObject, S.b bVar) {
                S J2;
                J2 = M.J(c0376a, str, jSONObject, bVar);
                return J2;
            }
        };
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String A() {
        return "fb.gg";
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String B() {
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        String str = b;
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{q}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        com.facebook.internal.l0.m0(str, format);
        return q;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String C() {
        String str;
        C0376a i2 = C0376a.g1.i();
        if (i2 != null) {
            str = i2.s();
        } else {
            str = null;
        }
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        return com.facebook.internal.l0.F(str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String D() {
        return U;
    }

    @InterfaceC9511sW0
    public static final boolean E(@NotNull Context context) {
        C6562gT0.p(context, "context");
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Set<b0> F() {
        Set<b0> unmodifiableSet;
        HashSet<b0> hashSet = c;
        synchronized (hashSet) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            C6562gT0.o(unmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return unmodifiableSet;
    }

    @InterfaceC9511sW0
    public static final boolean G() {
        p0 p0Var = p0.a;
        return p0.h();
    }

    @InterfaceC9511sW0
    public static final long H() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        return j.get();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String I() {
        return O.b;
    }

    public static final S J(C0376a c0376a, String str, JSONObject jSONObject, S.b bVar) {
        return S.n.N(c0376a, str, jSONObject, bVar);
    }

    @InterfaceC9511sW0
    public static final boolean K() {
        return k;
    }

    @InterfaceC9511sW0
    public static final boolean L(int i2) {
        int i3 = f70o;
        if (i2 >= i3 && i2 < i3 + 100) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    public static final synchronized boolean M() {
        boolean z2;
        synchronized (M.class) {
            z2 = Y;
        }
        return z2;
    }

    @InterfaceC9511sW0
    public static final boolean N() {
        return T.get();
    }

    @InterfaceC9511sW0
    public static final boolean O() {
        return l;
    }

    @InterfaceC9511sW0
    public static final boolean P(@NotNull b0 b0Var) {
        boolean z2;
        C6562gT0.p(b0Var, "behavior");
        HashSet<b0> hashSet = c;
        synchronized (hashSet) {
            if (K()) {
                if (hashSet.contains(b0Var)) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        return z2;
    }

    @InterfaceC9511sW0
    public static final void Q(@Nullable Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                C6562gT0.o(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
                if (applicationInfo.metaData != null) {
                    if (f == null) {
                        Object obj = applicationInfo.metaData.get(y);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            C6562gT0.o(locale, "ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (C9545sf2.J2(lowerCase, "fb", false, 2, null)) {
                                String substring = str.substring(2);
                                C6562gT0.o(substring, "(this as java.lang.String).substring(startIndex)");
                                f = substring;
                            } else {
                                f = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new C2416z("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (g == null) {
                        g = applicationInfo.metaData.getString(z);
                    }
                    if (h == null) {
                        h = applicationInfo.metaData.getString(A);
                    }
                    if (f70o == 64206) {
                        f70o = applicationInfo.metaData.getInt(G, d);
                    }
                    if (i == null) {
                        i = Boolean.valueOf(applicationInfo.metaData.getBoolean(E, false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2(otherwise = 3)
    public static final void S(@NotNull Context context, @NotNull final String str) {
        if (!SQ.e(M.class)) {
            try {
                C6562gT0.p(context, "context");
                C6562gT0.p(str, "applicationId");
                final Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    C2378x c2378x = C2378x.a;
                    if (!C2378x.d(com.facebook.appevents.t.s, o(), false)) {
                        y().execute(new Runnable() { // from class: com.facebook.L
                            @Override // java.lang.Runnable
                            public final void run() {
                                M.T(applicationContext, str);
                            }
                        });
                    }
                    C2375u c2375u = C2375u.a;
                    if (C2375u.g(C2375u.b.OnDeviceEventProcessing)) {
                        C4465Uu1 c4465Uu1 = C4465Uu1.a;
                        if (C4465Uu1.d()) {
                            C4465Uu1.g(str, s);
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, M.class);
            }
        }
    }

    public static final void T(Context context, String str) {
        C6562gT0.p(context, "$applicationContext");
        C6562gT0.p(str, "$applicationId");
        a.R(context, str);
    }

    @InterfaceC9511sW0
    public static final void U(@NotNull b0 b0Var) {
        C6562gT0.p(b0Var, "behavior");
        HashSet<b0> hashSet = c;
        synchronized (hashSet) {
            hashSet.remove(b0Var);
        }
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "")
    public static final synchronized void V(@NotNull Context context) {
        synchronized (M.class) {
            C6562gT0.p(context, "applicationContext");
            Y(context, null);
        }
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "")
    public static final synchronized void W(@NotNull Context context, int i2) {
        synchronized (M.class) {
            C6562gT0.p(context, "applicationContext");
            X(context, i2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        com.facebook.M.f70o = r3;
        Y(r2, r4);
     */
    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void X(@NotNull Context context, int i2, @Nullable b bVar) {
        synchronized (M.class) {
            try {
                C6562gT0.p(context, "applicationContext");
                if (T.get() && i2 != f70o) {
                    throw new C2416z(u);
                }
                throw new C2416z(v);
            } finally {
            }
        }
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "")
    public static final synchronized void Y(@NotNull Context context, @Nullable final b bVar) {
        synchronized (M.class) {
            C6562gT0.p(context, "applicationContext");
            AtomicBoolean atomicBoolean = T;
            if (atomicBoolean.get()) {
                if (bVar != null) {
                    bVar.a();
                }
                return;
            }
            com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
            com.facebook.internal.m0.j(context, false);
            com.facebook.internal.m0.l(context, false);
            Context applicationContext = context.getApplicationContext();
            C6562gT0.o(applicationContext, "applicationContext.applicationContext");
            n = applicationContext;
            C2327q.b.f(context);
            Context context2 = n;
            if (context2 != null) {
                Q(context2);
                String str = f;
                if (str != null && str.length() != 0) {
                    String str2 = h;
                    if (str2 != null && str2.length() != 0) {
                        atomicBoolean.set(true);
                        if (r()) {
                            l();
                        }
                        Context context3 = n;
                        if (context3 != null) {
                            if (context3 instanceof Application) {
                                p0 p0Var = p0.a;
                                if (p0.f()) {
                                    C8912q5 c8912q5 = C8912q5.a;
                                    Context context4 = n;
                                    if (context4 != null) {
                                        C8912q5.y((Application) context4, f);
                                    } else {
                                        C6562gT0.S("applicationContext");
                                        throw null;
                                    }
                                }
                            }
                            com.facebook.internal.C c2 = com.facebook.internal.C.a;
                            com.facebook.internal.C.h();
                            com.facebook.internal.Z z2 = com.facebook.internal.Z.a;
                            com.facebook.internal.Z.F();
                            C2359d.a aVar = C2359d.b;
                            Context context5 = n;
                            if (context5 != null) {
                                aVar.a(context5);
                                m = new com.facebook.internal.U<>(new Callable() { // from class: com.facebook.E
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        File Z;
                                        Z = M.Z();
                                        return Z;
                                    }
                                });
                                C2375u c2375u = C2375u.a;
                                C2375u.a(C2375u.b.Instrument, new C2375u.a() { // from class: com.facebook.F
                                    @Override // com.facebook.internal.C2375u.a
                                    public final void a(boolean z3) {
                                        M.a0(z3);
                                    }
                                });
                                C2375u.a(C2375u.b.AppEvents, new C2375u.a() { // from class: com.facebook.G
                                    @Override // com.facebook.internal.C2375u.a
                                    public final void a(boolean z3) {
                                        M.b0(z3);
                                    }
                                });
                                C2375u.a(C2375u.b.ChromeCustomTabsPrefetching, new C2375u.a() { // from class: com.facebook.H
                                    @Override // com.facebook.internal.C2375u.a
                                    public final void a(boolean z3) {
                                        M.c0(z3);
                                    }
                                });
                                C2375u.a(C2375u.b.IgnoreAppSwitchToLoggedOut, new C2375u.a() { // from class: com.facebook.I
                                    @Override // com.facebook.internal.C2375u.a
                                    public final void a(boolean z3) {
                                        M.d0(z3);
                                    }
                                });
                                C2375u.a(C2375u.b.BypassAppSwitch, new C2375u.a() { // from class: com.facebook.J
                                    @Override // com.facebook.internal.C2375u.a
                                    public final void a(boolean z3) {
                                        M.e0(z3);
                                    }
                                });
                                y().execute(new FutureTask(new Callable() { // from class: com.facebook.K
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        Void f0;
                                        f0 = M.f0(M.b.this);
                                        return f0;
                                    }
                                }));
                                return;
                            }
                            C6562gT0.S("applicationContext");
                            throw null;
                        }
                        C6562gT0.S("applicationContext");
                        throw null;
                    }
                    throw new C2416z("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                }
                throw new C2416z("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            C6562gT0.S("applicationContext");
            throw null;
        }
    }

    public static final File Z() {
        Context context = n;
        if (context != null) {
            return context.getCacheDir();
        }
        C6562gT0.S("applicationContext");
        throw null;
    }

    public static final void a0(boolean z2) {
        if (z2) {
            WQ0 wq0 = WQ0.a;
            WQ0.d();
        }
    }

    public static final void b0(boolean z2) {
        if (z2) {
            com.facebook.appevents.F f2 = com.facebook.appevents.F.a;
            com.facebook.appevents.F.a();
        }
    }

    public static final void c0(boolean z2) {
        if (z2) {
            L = true;
        }
    }

    public static final void d0(boolean z2) {
        if (z2) {
            M = true;
        }
    }

    public static final void e0(boolean z2) {
        if (z2) {
            N = true;
        }
    }

    public static final Void f0(b bVar) {
        C2338g.f.e().k();
        f0.d.a().e();
        if (C0376a.g1.k()) {
            d0.b bVar2 = d0.c1;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        C2327q.a aVar = C2327q.b;
        aVar.j(n(), f);
        p0 p0Var = p0.a;
        p0.o();
        Context applicationContext = n().getApplicationContext();
        C6562gT0.o(applicationContext, "getApplicationContext().applicationContext");
        aVar.k(applicationContext).f();
        return null;
    }

    @InterfaceC9511sW0
    public static final void g0(boolean z2) {
        p0 p0Var = p0.a;
        p0.t(z2);
    }

    @InterfaceC9511sW0
    public static final void h0(@NotNull String str) {
        C6562gT0.p(str, "applicationId");
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.p(str, "applicationId");
        f = str;
    }

    @InterfaceC9511sW0
    public static final void i0(@Nullable String str) {
        g = str;
    }

    @InterfaceC9511sW0
    public static final void j(@NotNull b0 b0Var) {
        C6562gT0.p(b0Var, "behavior");
        HashSet<b0> hashSet = c;
        synchronized (hashSet) {
            hashSet.add(b0Var);
            a.z0();
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    @InterfaceC9511sW0
    public static final void j0(boolean z2) {
        p0 p0Var = p0.a;
        p0.u(z2);
        if (z2) {
            l();
        }
    }

    @InterfaceC9511sW0
    public static final void k() {
        HashSet<b0> hashSet = c;
        synchronized (hashSet) {
            hashSet.clear();
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    @InterfaceC9511sW0
    public static final void k0(boolean z2) {
        p0 p0Var = p0.a;
        p0.v(z2);
        if (z2) {
            C8912q5 c8912q5 = C8912q5.a;
            C8912q5.y((Application) n(), o());
        }
    }

    @InterfaceC9511sW0
    public static final void l() {
        Y = true;
    }

    @InterfaceC9511sW0
    public static final void l0(@NotNull File file) {
        C6562gT0.p(file, "cacheDir");
        m = new com.facebook.internal.U<>(file);
    }

    @InterfaceC9511sW0
    public static final boolean m() {
        p0 p0Var = p0.a;
        return p0.d();
    }

    @InterfaceC9511sW0
    public static final void m0(@Nullable String str) {
        h = str;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Context n() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        Context context = n;
        if (context != null) {
            return context;
        }
        C6562gT0.S("applicationContext");
        throw null;
    }

    @InterfaceC9511sW0
    public static final void n0(boolean z2) {
        i = Boolean.valueOf(z2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String o() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        String str = f;
        if (str != null) {
            return str;
        }
        throw new C2416z("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @InterfaceC9511sW0
    public static final void o0(@Nullable String[] strArr) {
        if (SQ.e(M.class)) {
            return;
        }
        try {
            p0(strArr, 0, 0);
        } catch (Throwable th) {
            SQ.c(th, M.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String p() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        return g;
    }

    @InterfaceC9511sW0
    public static final void p0(@Nullable String[] strArr, int i2, int i3) {
        if (!SQ.e(M.class)) {
            if (strArr == null) {
                try {
                    strArr = new String[0];
                } catch (Throwable th) {
                    SQ.c(th, M.class);
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(I, new JSONArray((Collection) C7330jf.Uy(strArr)));
                jSONObject.put(J, i2);
                jSONObject.put(K, i3);
                Context context = n;
                if (context != null) {
                    context.getSharedPreferences(x, 0).edit().putString(I, jSONObject.toString()).apply();
                } else {
                    C6562gT0.S("applicationContext");
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String q(@Nullable Context context) {
        PackageManager packageManager;
        if (SQ.e(M.class)) {
            return null;
        }
        try {
            com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
            com.facebook.internal.m0.w();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, M.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void q0(@NotNull Executor executor) {
        C6562gT0.p(executor, "executor");
        ReentrantLock reentrantLock = p;
        reentrantLock.lock();
        try {
            e = executor;
            C7458kA2 c7458kA2 = C7458kA2.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @InterfaceC9511sW0
    public static final boolean r() {
        p0 p0Var = p0.a;
        return p0.e();
    }

    @InterfaceC9511sW0
    public static final void r0(@NotNull String str) {
        C6562gT0.p(str, "facebookDomain");
        Log.w(b, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        V = str;
    }

    @InterfaceC9511sW0
    public static final boolean s() {
        p0 p0Var = p0.a;
        return p0.f();
    }

    @InterfaceC9511sW0
    public static final void s0(@NotNull String str) {
        C6562gT0.p(str, "graphApiVersion");
        Log.w(b, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.f0(str) && !C6562gT0.g(q, str)) {
            q = str;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File t() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        com.facebook.internal.U<File> u2 = m;
        if (u2 != null) {
            return u2.c();
        }
        C6562gT0.S("cacheDir");
        throw null;
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final void t0(@NotNull a aVar) {
        C6562gT0.p(aVar, "graphRequestCreator");
        W = aVar;
    }

    @InterfaceC9511sW0
    public static final int u() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        return f70o;
    }

    @InterfaceC9511sW0
    public static final void u0(boolean z2) {
        k = z2;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String v() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        String str = h;
        if (str != null) {
            return str;
        }
        throw new C2416z("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @InterfaceC9511sW0
    public static final void v0(boolean z2) {
        l = z2;
    }

    @InterfaceC9511sW0
    public static final boolean w() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        Boolean bool = i;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @InterfaceC9511sW0
    public static final void w0(@NotNull Context context, boolean z2) {
        C6562gT0.p(context, "context");
        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", z2).apply();
    }

    @InterfaceC9511sW0
    public static final boolean x() {
        p0 p0Var = p0.a;
        return p0.g();
    }

    @InterfaceC9511sW0
    public static final void x0(boolean z2) {
        p0 p0Var = p0.a;
        p0.w(z2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Executor y() {
        ReentrantLock reentrantLock = p;
        reentrantLock.lock();
        try {
            if (e == null) {
                e = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            Executor executor = e;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @InterfaceC9511sW0
    public static final void y0(long j2) {
        j.set(j2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String z() {
        return V;
    }

    public final void R(Context context, String str) {
        try {
            if (!SQ.e(this)) {
                try {
                    C2358c f2 = C2358c.f.f(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences(s, 0);
                    String C2 = C6562gT0.C(str, "ping");
                    long j2 = sharedPreferences.getLong(C2, 0L);
                    try {
                        C7081id c7081id = C7081id.a;
                        JSONObject a2 = C7081id.a(C7081id.a.MOBILE_INSTALL_EVENT, f2, C2327q.b.f(context), E(context), context);
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                        C6562gT0.o(format, "java.lang.String.format(format, *args)");
                        S a3 = W.a(null, format, a2, null);
                        if (j2 == 0 && a3.l().g() == null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(C2, System.currentTimeMillis());
                            edit.apply();
                            V.a aVar = com.facebook.internal.V.e;
                            b0 b0Var = b0.APP_EVENTS;
                            String str2 = b;
                            C6562gT0.o(str2, "TAG");
                            aVar.d(b0Var, str2, "MOBILE_APP_INSTALL has been logged");
                        }
                    } catch (JSONException e2) {
                        throw new C2416z("An error occurred while publishing install.", e2);
                    }
                } catch (Exception e3) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0("Facebook-publish", e3);
                }
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void z0() {
        HashSet<b0> hashSet = c;
        if (hashSet.contains(b0.GRAPH_API_DEBUG_INFO)) {
            b0 b0Var = b0.GRAPH_API_DEBUG_WARNING;
            if (!hashSet.contains(b0Var)) {
                hashSet.add(b0Var);
            }
        }
    }
}
