package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C2416z;
import com.facebook.login.EnumC2389f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C6562gT0;
import o.C7330jf;
import o.C8222nF;
import o.C9516sY;
import o.C9545sf2;
import o.C9998uW1;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class Z {
    public static final int A = 20160327;
    @NotNull
    public static final String A0 = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";
    public static final int B = 20161017;
    @NotNull
    public static final String B0 = "com.facebook.platform.extra.ID_TOKEN";
    public static final int C = 20170213;
    @NotNull
    public static final String C0 = "access_token";
    public static final int D = 20170411;
    @NotNull
    public static final String D0 = "graph_domain";
    public static final int E = 20170417;
    @NotNull
    public static final String E0 = "signed request";
    public static final int F = 20171115;
    @NotNull
    public static final String F0 = "expires_seconds_since_epoch";
    public static final int G = 20210906;
    @NotNull
    public static final String G0 = "permissions";
    @NotNull
    public static final String H = "com.facebook.platform.protocol.PROTOCOL_VERSION";
    @NotNull
    public static final String H0 = "fbsdk:create_object";
    @NotNull
    public static final String I = "com.facebook.platform.protocol.PROTOCOL_ACTION";
    @NotNull
    public static final String I0 = "user_generated";
    @NotNull
    public static final String J = "com.facebook.platform.protocol.CALL_ID";
    @NotNull
    public static final String J0 = "url";
    @NotNull
    public static final String K = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
    @NotNull
    public static final String K0 = "com.facebook.platform.status.ERROR_TYPE";
    @NotNull
    public static final String L = "com.facebook.platform.protocol.BRIDGE_ARGS";
    @NotNull
    public static final String L0 = "com.facebook.platform.status.ERROR_DESCRIPTION";
    @NotNull
    public static final String M = "com.facebook.platform.protocol.METHOD_ARGS";
    @NotNull
    public static final String M0 = "com.facebook.platform.status.ERROR_CODE";
    @NotNull
    public static final String N = "com.facebook.platform.protocol.RESULT_ARGS";
    @NotNull
    public static final String N0 = "com.facebook.platform.status.ERROR_SUBCODE";
    @NotNull
    public static final String O = "app_name";
    @NotNull
    public static final String O0 = "com.facebook.platform.status.ERROR_JSON";
    @NotNull
    public static final String P = "action_id";
    @NotNull
    public static final String P0 = "error_type";
    @NotNull
    public static final String Q = "error";
    @NotNull
    public static final String Q0 = "error_description";
    @NotNull
    public static final String R = "com.facebook.platform.extra.DID_COMPLETE";
    @NotNull
    public static final String R0 = "error_code";
    @NotNull
    public static final String S = "com.facebook.platform.extra.COMPLETION_GESTURE";
    @NotNull
    public static final String S0 = "error_subcode";
    @NotNull
    public static final String T = "didComplete";
    @NotNull
    public static final String T0 = "error_json";
    @NotNull
    public static final String U = "completionGesture";
    @NotNull
    public static final String U0 = "UnknownError";
    public static final int V = 65536;
    @NotNull
    public static final String V0 = "ProtocolError";
    public static final int W = 65537;
    @NotNull
    public static final String W0 = "UserCanceled";
    public static final int X = 65538;
    @NotNull
    public static final String X0 = "ApplicationError";
    public static final int Y = 65539;
    @NotNull
    public static final String Y0 = "NetworkError";
    public static final int Z = 65540;
    @NotNull
    public static final String Z0 = "PermissionDenied";
    @NotNull
    public static final Z a;
    public static final int a0 = 65541;
    @NotNull
    public static final String a1 = "ServiceDisabled";
    public static final int b = -1;
    public static final int b0 = 65542;
    @NotNull
    public static final String b1 = "url";
    public static final String c;
    public static final int c0 = 65543;
    @NotNull
    public static final String c1 = "action";
    @NotNull
    public static final String d = "com.facebook.katana.ProxyAuth";
    public static final int d0 = 65544;
    @NotNull
    public static final String d1 = "params";
    @NotNull
    public static final String e = "com.facebook.katana.platform.TokenRefreshService";
    public static final int e0 = 65545;
    @NotNull
    public static final String e1 = "is_fallback";
    @NotNull
    public static final String f = "scope";
    public static final int f0 = 65546;
    @NotNull
    public static final String f1 = "only_me";
    @NotNull
    public static final String g = "client_id";
    public static final int g0 = 65547;
    @NotNull
    public static final String g1 = "friends";
    @NotNull
    public static final String h = "e2e";
    @NotNull
    public static final String h0 = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
    @NotNull
    public static final String h1 = "everyone";
    @NotNull
    public static final String i = "facebook_sdk_version";
    @NotNull
    public static final String i0 = "com.facebook.platform.action.request.FEED_DIALOG";
    @NotNull
    public static final String i1 = "content://";
    @NotNull
    public static final String j = "com.facebook.platform.PLATFORM_ACTIVITY";
    @NotNull
    public static final String j0 = "com.facebook.platform.action.request.MESSAGE_DIALOG";
    @NotNull
    public static final String j1 = ".provider.PlatformProvider";
    @NotNull
    public static final String k = "com.facebook.platform.PLATFORM_SERVICE";
    @NotNull
    public static final String k0 = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    @NotNull
    public static final String k1 = ".provider.PlatformProvider/versions";
    public static final int l = 20121101;
    @NotNull
    public static final String l0 = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    @NotNull
    public static final String l1 = "version";
    public static final int m = 20130502;
    @NotNull
    public static final String m0 = "com.facebook.platform.action.request.LIKE_DIALOG";
    @NotNull
    public static final List<e> m1;
    public static final int n = 20130618;
    @NotNull
    public static final String n0 = "com.facebook.platform.action.request.APPINVITES_DIALOG";
    @NotNull
    public static final List<e> n1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f111o = 20131024;
    @NotNull
    public static final String o0 = "com.facebook.platform.action.request.CAMERA_EFFECT";
    @NotNull
    public static final Map<String, List<e>> o1;
    public static final int p = 20131107;
    @NotNull
    public static final String p0 = "com.facebook.platform.action.request.SHARE_STORY";
    @NotNull
    public static final AtomicBoolean p1;
    public static final int q = 20140204;
    @NotNull
    public static final String q0 = "com.facebook.platform.extra.PERMISSIONS";
    @NotNull
    public static final Integer[] q1;
    public static final int r = 20140313;
    @NotNull
    public static final String r0 = "com.facebook.platform.extra.APPLICATION_ID";
    public static final int s = 20140324;
    @NotNull
    public static final String s0 = "com.facebook.platform.extra.APPLICATION_NAME";
    public static final int t = 20140701;
    @NotNull
    public static final String t0 = "com.facebook.platform.extra.USER_ID";
    public static final int u = 20141001;
    @NotNull
    public static final String u0 = "com.facebook.platform.extra.LOGGER_REF";
    public static final int v = 20141028;
    @NotNull
    public static final String v0 = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";
    public static final int w = 20141107;
    @NotNull
    public static final String w0 = "com.facebook.platform.extra.GRAPH_API_VERSION";
    public static final int x = 20141218;
    @NotNull
    public static final String x0 = "com.facebook.platform.extra.NONCE";
    public static final int y = 20150401;
    @NotNull
    public static final String y0 = "com.facebook.platform.extra.ACCESS_TOKEN";
    public static final int z = 20150702;
    @NotNull
    public static final String z0 = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";

    /* loaded from: classes2.dex */
    public static final class a extends e {
        @Override // com.facebook.internal.Z.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.Z.e
        @NotNull
        public String d() {
            return "com.facebook.arstudio.player";
        }

        @Nullable
        public Void g() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e {
        @Override // com.facebook.internal.Z.e
        @NotNull
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.Z.e
        @NotNull
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.Z.e
        @NotNull
        public String e() {
            return c0.M;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends e {
        @Override // com.facebook.internal.Z.e
        @NotNull
        public String c() {
            return Z.d;
        }

        @Override // com.facebook.internal.Z.e
        @NotNull
        public String d() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.Z.e
        public void f() {
            if (g()) {
                Log.w(Z.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        public final boolean g() {
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.n().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends e {
        @Override // com.facebook.internal.Z.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.Z.e
        @NotNull
        public String d() {
            return com.facebook.messenger.c.c;
        }

        @Nullable
        public Void g() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        @Nullable
        public TreeSet<Integer> a;

        public final synchronized void a(boolean z) {
            Boolean valueOf;
            TreeSet<Integer> treeSet;
            if (!z) {
                try {
                    TreeSet<Integer> treeSet2 = this.a;
                    if (treeSet2 != null) {
                        if (treeSet2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(treeSet2.isEmpty());
                        }
                        if (!C6562gT0.g(valueOf, Boolean.FALSE)) {
                        }
                        treeSet = this.a;
                        if (treeSet != null || treeSet.isEmpty()) {
                            f();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = Z.b(Z.a, this);
            treeSet = this.a;
            if (treeSet != null) {
            }
            f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            if (o.C6562gT0.g(r0, java.lang.Boolean.FALSE) == false) goto L11;
         */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TreeSet<Integer> b() {
            Boolean valueOf;
            TreeSet<Integer> treeSet = this.a;
            if (treeSet != null) {
                if (treeSet == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(treeSet.isEmpty());
                }
            }
            a(false);
            return this.a;
        }

        @Nullable
        public abstract String c();

        @NotNull
        public abstract String d();

        @NotNull
        public String e() {
            return c0.O;
        }

        public void f() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {
        @NotNull
        public static final a c = new a(null);
        @Nullable
        public e a;
        public int b;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            @NotNull
            public final f a(@Nullable e eVar, int i) {
                f fVar = new f(null);
                fVar.a = eVar;
                fVar.b = i;
                return fVar;
            }

            @InterfaceC9511sW0
            @NotNull
            public final f b() {
                f fVar = new f(null);
                fVar.b = -1;
                return fVar;
            }

            public a() {
            }
        }

        public /* synthetic */ f(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public static final f c(@Nullable e eVar, int i) {
            return c.a(eVar, i);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final f d() {
            return c.b();
        }

        @Nullable
        public final e e() {
            return this.a;
        }

        public final int f() {
            return this.b;
        }

        public f() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends e {
        @Override // com.facebook.internal.Z.e
        @NotNull
        public String c() {
            return Z.d;
        }

        @Override // com.facebook.internal.Z.e
        @NotNull
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        Z z2 = new Z();
        a = z2;
        c = Z.class.getName();
        m1 = z2.f();
        n1 = z2.e();
        o1 = z2.d();
        p1 = new AtomicBoolean(false);
        q1 = new Integer[]{Integer.valueOf((int) G), Integer.valueOf((int) F), Integer.valueOf((int) E), Integer.valueOf((int) D), Integer.valueOf((int) C), Integer.valueOf((int) B), Integer.valueOf((int) A), Integer.valueOf((int) z), Integer.valueOf((int) y), Integer.valueOf((int) x), Integer.valueOf((int) w), Integer.valueOf((int) v), Integer.valueOf((int) u), Integer.valueOf((int) t), Integer.valueOf((int) s), Integer.valueOf((int) r), Integer.valueOf((int) q), Integer.valueOf((int) p), Integer.valueOf((int) f111o), Integer.valueOf((int) n), Integer.valueOf((int) m), Integer.valueOf((int) l)};
    }

    @InterfaceC9511sW0
    public static final int A(@NotNull Intent intent) {
        if (SQ.e(Z.class)) {
            return 0;
        }
        try {
            C6562gT0.p(intent, C9998uW1.R);
            return intent.getIntExtra(H, 0);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return 0;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle B(@NotNull Intent intent) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(intent, "resultIntent");
            int A2 = A(intent);
            Bundle extras = intent.getExtras();
            if (D(A2) && extras != null) {
                return extras.getBundle(N);
            }
            return extras;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final boolean C(@NotNull Intent intent) {
        Boolean valueOf;
        if (SQ.e(Z.class)) {
            return false;
        }
        try {
            C6562gT0.p(intent, "resultIntent");
            Bundle r2 = r(intent);
            if (r2 == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(r2.containsKey("error"));
            }
            if (valueOf == null) {
                return intent.hasExtra(K0);
            }
            return valueOf.booleanValue();
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean D(int i2) {
        if (SQ.e(Z.class)) {
            return false;
        }
        try {
            if (!C7330jf.B8(q1, Integer.valueOf(i2)) || i2 < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void E(@NotNull Intent intent, @Nullable String str, @Nullable String str2, int i2, @Nullable Bundle bundle) {
        if (!SQ.e(Z.class)) {
            try {
                C6562gT0.p(intent, C9998uW1.R);
                com.facebook.M m2 = com.facebook.M.a;
                String o2 = com.facebook.M.o();
                String p2 = com.facebook.M.p();
                intent.putExtra(H, i2).putExtra(I, str2).putExtra(r0, o2);
                if (D(i2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_id", str);
                    l0 l0Var = l0.a;
                    l0.u0(bundle2, "app_name", p2);
                    intent.putExtra(L, bundle2);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    intent.putExtra(M, bundle);
                    return;
                }
                intent.putExtra(J, str);
                l0 l0Var2 = l0.a;
                if (!l0.f0(p2)) {
                    intent.putExtra(s0, p2);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
            } catch (Throwable th) {
                SQ.c(th, Z.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void F() {
        if (!SQ.e(Z.class)) {
            try {
                if (!p1.compareAndSet(false, true)) {
                    return;
                }
                com.facebook.M m2 = com.facebook.M.a;
                com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.internal.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z.G();
                    }
                });
            } catch (Throwable th) {
                SQ.c(th, Z.class);
            }
        }
    }

    public static final void G() {
        if (SQ.e(Z.class)) {
            return;
        }
        try {
            for (e eVar : m1) {
                eVar.a(true);
            }
            p1.set(false);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Intent H(@NotNull Context context, @Nullable Intent intent, @Nullable e eVar) {
        ResolveInfo resolveActivity;
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            r rVar = r.a;
            String str = resolveActivity.activityInfo.packageName;
            C6562gT0.o(str, "resolveInfo.activityInfo.packageName");
            if (!r.a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Intent I(@NotNull Context context, @Nullable Intent intent, @Nullable e eVar) {
        ResolveInfo resolveService;
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            r rVar = r.a;
            String str = resolveService.serviceInfo.packageName;
            C6562gT0.o(str, "resolveInfo.serviceInfo.packageName");
            if (!r.a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(Z z2, e eVar) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            return z2.q(eVar);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        if ((r3 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        return java.lang.Math.min(r4, r9);
     */
    @InterfaceC9511sW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int h(@Nullable TreeSet<Integer> treeSet, int i2, @NotNull int[] iArr) {
        if (SQ.e(Z.class)) {
            return 0;
        }
        try {
            C6562gT0.p(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i3 = -1;
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                Integer next = descendingIterator.next();
                C6562gT0.o(next, "fbAppVersion");
                i3 = Math.max(i3, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    break;
                }
            }
            return -1;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return 0;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle i(@Nullable C2416z c2416z) {
        if (SQ.e(Z.class) || c2416z == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(Q0, c2416z.toString());
            if (c2416z instanceof com.facebook.B) {
                bundle.putString("error_type", W0);
                return bundle;
            }
            return bundle;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Intent j(@NotNull Context context, @NotNull String str, @NotNull Collection<String> collection, @NotNull String str2, boolean z2, boolean z3, @NotNull EnumC2389f enumC2389f, @NotNull String str3, @NotNull String str4, @Nullable String str5, boolean z4, boolean z5, boolean z6) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(collection, "permissions");
            C6562gT0.p(str2, "e2e");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str3, "clientState");
            C6562gT0.p(str4, "authType");
            b bVar = new b();
            return H(context, a.k(bVar, str, collection, str2, z3, enumC2389f, str3, str4, false, str5, z4, com.facebook.login.L.INSTAGRAM, z5, z6, "", null, null), bVar);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Intent l(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable f fVar, @Nullable Bundle bundle) {
        e e2;
        Intent H2;
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            if (fVar == null || (e2 = fVar.e()) == null || (H2 = H(context, new Intent().setAction(j).setPackage(e2.d()).addCategory("android.intent.category.DEFAULT"), e2)) == null) {
                return null;
            }
            E(H2, str, str2, fVar.f(), bundle);
            return H2;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Intent m(@NotNull Context context) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            for (e eVar : m1) {
                Intent I2 = I(context, new Intent(k).setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (I2 != null) {
                    return I2;
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Intent n(@NotNull Intent intent, @Nullable Bundle bundle, @Nullable C2416z c2416z) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(intent, "requestIntent");
            UUID s2 = s(intent);
            if (s2 == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra(H, A(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", s2.toString());
            if (c2416z != null) {
                bundle2.putBundle("error", i(c2416z));
            }
            intent2.putExtra(L, bundle2);
            if (bundle != null) {
                intent2.putExtra(N, bundle);
            }
            return intent2;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Intent> o(@Nullable Context context, @NotNull String str, @NotNull Collection<String> collection, @NotNull String str2, boolean z2, boolean z3, @NotNull EnumC2389f enumC2389f, @NotNull String str3, @NotNull String str4, boolean z4, @Nullable String str5, boolean z5, boolean z6, boolean z7, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        List<Intent> list;
        List<Intent> list2 = null;
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            String str9 = str;
            C6562gT0.p(str9, "applicationId");
            Collection<String> collection2 = collection;
            C6562gT0.p(collection2, "permissions");
            String str10 = str2;
            C6562gT0.p(str10, "e2e");
            EnumC2389f enumC2389f2 = enumC2389f;
            C6562gT0.p(enumC2389f2, "defaultAudience");
            String str11 = str3;
            C6562gT0.p(str11, "clientState");
            String str12 = str4;
            C6562gT0.p(str12, "authType");
            ArrayList arrayList = new ArrayList();
            for (e eVar : m1) {
                ArrayList arrayList2 = arrayList;
                list = list2;
                try {
                    Intent k2 = a.k(eVar, str9, collection2, str10, z3, enumC2389f2, str11, str12, z4, str5, z5, com.facebook.login.L.FACEBOOK, z6, z7, str6, str7, str8);
                    if (k2 != null) {
                        arrayList2.add(k2);
                    }
                    str9 = str;
                    collection2 = collection;
                    str10 = str2;
                    enumC2389f2 = enumC2389f;
                    str11 = str3;
                    str12 = str4;
                    arrayList = arrayList2;
                    list2 = list;
                } catch (Throwable th) {
                    th = th;
                    SQ.c(th, Z.class);
                    return list;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            list = list2;
        }
    }

    public static /* synthetic */ List p(Context context, String str, Collection collection, String str2, boolean z2, boolean z3, EnumC2389f enumC2389f, String str3, String str4, boolean z4, String str5, boolean z5, boolean z6, boolean z7, String str6, String str7, String str8, int i2, Object obj) {
        String str9;
        if (SQ.e(Z.class)) {
            return null;
        }
        if ((i2 & 65536) != 0) {
            str9 = "S256";
        } else {
            str9 = str8;
        }
        try {
            return o(context, str, collection, str2, z2, z3, enumC2389f, str3, str4, z4, str5, z5, z6, z7, str6, str7, str9);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle r(@NotNull Intent intent) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(intent, C9998uW1.R);
            if (!D(A(intent))) {
                return null;
            }
            return intent.getBundleExtra(L);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final UUID s(@Nullable Intent intent) {
        String stringExtra;
        if (SQ.e(Z.class) || intent == null) {
            return null;
        }
        try {
            if (D(A(intent))) {
                Bundle bundleExtra = intent.getBundleExtra(L);
                if (bundleExtra != null) {
                    stringExtra = bundleExtra.getString("action_id");
                } else {
                    stringExtra = null;
                }
            } else {
                stringExtra = intent.getStringExtra(J);
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle t(@NotNull Intent intent) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(intent, "resultIntent");
            if (!C(intent)) {
                return null;
            }
            Bundle r2 = r(intent);
            if (r2 != null) {
                return r2.getBundle("error");
            }
            return intent.getExtras();
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2416z u(@Nullable Bundle bundle) {
        if (SQ.e(Z.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString(K0);
            }
            String string2 = bundle.getString(Q0);
            if (string2 == null) {
                string2 = bundle.getString(L0);
            }
            if (string != null && C9545sf2.c2(string, W0, true)) {
                return new com.facebook.B(string2);
            }
            return new C2416z(string2);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final f v(@NotNull String str, @NotNull int[] iArr) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "action");
            C6562gT0.p(iArr, "versionSpec");
            List<e> list = o1.get(str);
            if (list == null) {
                list = C8222nF.H();
            }
            return a.w(list, iArr);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final int x(int i2) {
        if (SQ.e(Z.class)) {
            return 0;
        }
        try {
            return a.w(m1, new int[]{i2}).f();
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return 0;
        }
    }

    @InterfaceC9511sW0
    public static final int y() {
        if (SQ.e(Z.class)) {
            return 0;
        }
        try {
            return q1[0].intValue();
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return 0;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle z(@NotNull Intent intent) {
        if (SQ.e(Z.class)) {
            return null;
        }
        try {
            C6562gT0.p(intent, C9998uW1.R);
            if (!D(A(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra(M);
        } catch (Throwable th) {
            SQ.c(th, Z.class);
            return null;
        }
    }

    public final Map<String, List<e>> d() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = m1;
            hashMap.put(k0, list);
            hashMap.put(i0, list);
            hashMap.put(m0, list);
            hashMap.put(n0, list);
            hashMap.put(j0, arrayList);
            hashMap.put(l0, arrayList);
            hashMap.put(o0, n1);
            hashMap.put(p0, list);
            return hashMap;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final List<e> e() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList s2 = C8222nF.s(new a());
            s2.addAll(f());
            return s2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final List<e> f() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return C8222nF.s(new c(), new g());
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final Uri g(e eVar) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(i1 + eVar.d() + k1);
            C6562gT0.o(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final Intent k(e eVar, String str, Collection<String> collection, String str2, boolean z2, EnumC2389f enumC2389f, String str3, String str4, boolean z3, String str5, boolean z4, com.facebook.login.L l2, boolean z5, boolean z6, String str6, String str7, String str8) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            String c2 = eVar.c();
            if (c2 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.d(), c2).putExtra("client_id", str);
            C6562gT0.o(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            com.facebook.M m2 = com.facebook.M.a;
            putExtra.putExtra(i, com.facebook.M.I());
            l0 l0Var = l0.a;
            if (!l0.g0(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!l0.f0(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra(c0.x, eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra(c0.y, "true");
            if (z2) {
                putExtra.putExtra("default_audience", enumC2389f.g());
            }
            putExtra.putExtra(c0.t, com.facebook.M.B());
            putExtra.putExtra(c0.h, str4);
            if (z3) {
                putExtra.putExtra(c0.E, true);
            }
            putExtra.putExtra(c0.G, str5);
            putExtra.putExtra(c0.H, z4);
            if (z5) {
                putExtra.putExtra(c0.J, l2.toString());
            }
            if (z6) {
                putExtra.putExtra(c0.K, true);
            }
            return putExtra;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #3 {all -> 0x0089, blocks: (B:5:0x000c, B:42:0x0092, B:41:0x008f, B:35:0x0085), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[Catch: all -> 0x0089, TryCatch #3 {all -> 0x0089, blocks: (B:5:0x000c, B:42:0x0092, B:41:0x008f, B:35:0x0085), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066 A[EXC_TOP_SPLITTER, LOOP:0: B:49:0x0066->B:28:0x006c, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet<Integer> q(e eVar) {
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        if (SQ.e(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            com.facebook.M m2 = com.facebook.M.a;
            ContentResolver contentResolver = com.facebook.M.n().getContentResolver();
            String[] strArr = {"version"};
            Uri g2 = g(eVar);
            try {
                try {
                    providerInfo = com.facebook.M.n().getPackageManager().resolveContentProvider(C6562gT0.C(eVar.d(), j1), 0);
                } catch (RuntimeException e2) {
                    Log.e(c, "Failed to query content resolver.", e2);
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        cursor2 = contentResolver.query(g2, strArr, null, null, null);
                    } catch (IllegalArgumentException unused) {
                        Log.e(c, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (NullPointerException unused2) {
                        Log.e(c, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (SecurityException unused3) {
                        Log.e(c, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                cursor = cursor2;
                                th = th2;
                                if (cursor == null) {
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor == null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            SQ.c(th4, this);
            return null;
        }
    }

    public final f w(List<? extends e> list, int[] iArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            F();
            if (list == null) {
                return f.c.b();
            }
            for (e eVar : list) {
                int h2 = h(eVar.b(), y(), iArr);
                if (h2 != -1) {
                    return f.c.a(eVar, h2);
                }
            }
            return f.c.b();
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
