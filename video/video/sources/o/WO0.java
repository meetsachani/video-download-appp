package o;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class WO0 {
    @Nullable
    public static WO0 h = null;
    @NotNull
    public static final String j = "com.android.billingclient.api.SkuDetailsParams";
    @NotNull
    public static final String k = "com.android.billingclient.api.SkuDetailsParams$Builder";
    @NotNull
    public static final String l = "newBuilder";
    @NotNull
    public static final String m = "setType";
    @NotNull
    public static final String n = "setSkusList";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f654o = "build";
    @NotNull
    public final Class<?> a;
    @NotNull
    public final Class<?> b;
    @NotNull
    public final Method c;
    @NotNull
    public final Method d;
    @NotNull
    public final Method e;
    @NotNull
    public final Method f;
    @NotNull
    public static final a g = new a(null);
    @NotNull
    public static final AtomicBoolean i = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final void a() {
            XO0 xo0 = XO0.a;
            Class<?> a = XO0.a(WO0.j);
            Class<?> a2 = XO0.a(WO0.k);
            if (a != null && a2 != null) {
                Method d = XO0.d(a, "newBuilder", new Class[0]);
                Method d2 = XO0.d(a2, WO0.m, String.class);
                Method d3 = XO0.d(a2, WO0.n, List.class);
                Method d4 = XO0.d(a2, "build", new Class[0]);
                if (d != null && d2 != null && d3 != null && d4 != null) {
                    WO0.c(new WO0(a, a2, d, d2, d3, d4));
                }
            }
        }

        @InterfaceC9511sW0
        @Nullable
        public final WO0 b() {
            if (WO0.a().get()) {
                return WO0.b();
            }
            a();
            WO0.a().set(true);
            return WO0.b();
        }

        public a() {
        }
    }

    public WO0(@NotNull Class<?> cls, @NotNull Class<?> cls2, @NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Method method4) {
        C6562gT0.p(cls, "skuDetailsParamsClazz");
        C6562gT0.p(cls2, "builderClazz");
        C6562gT0.p(method, "newBuilderMethod");
        C6562gT0.p(method2, "setTypeMethod");
        C6562gT0.p(method3, "setSkusListMethod");
        C6562gT0.p(method4, "buildMethod");
        this.a = cls;
        this.b = cls2;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (SQ.e(WO0.class)) {
            return null;
        }
        try {
            return i;
        } catch (Throwable th) {
            SQ.c(th, WO0.class);
            return null;
        }
    }

    public static final /* synthetic */ WO0 b() {
        if (SQ.e(WO0.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            SQ.c(th, WO0.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(WO0 wo0) {
        if (SQ.e(WO0.class)) {
            return;
        }
        try {
            h = wo0;
        } catch (Throwable th) {
            SQ.c(th, WO0.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final WO0 d() {
        if (SQ.e(WO0.class)) {
            return null;
        }
        try {
            return g.b();
        } catch (Throwable th) {
            SQ.c(th, WO0.class);
            return null;
        }
    }

    @Nullable
    public final Object e(@Nullable String str, @Nullable List<String> list) {
        Object e;
        Object e2;
        if (SQ.e(this)) {
            return null;
        }
        try {
            XO0 xo0 = XO0.a;
            Object e3 = XO0.e(this.a, this.c, null, new Object[0]);
            if (e3 == null || (e = XO0.e(this.b, this.d, e3, str)) == null || (e2 = XO0.e(this.b, this.e, e, list)) == null) {
                return null;
            }
            return XO0.e(this.b, this.f, e2, new Object[0]);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final Class<?> f() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
