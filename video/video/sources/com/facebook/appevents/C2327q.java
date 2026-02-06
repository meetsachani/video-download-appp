package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.C0376a;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.HT1;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.appevents.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2327q {
    @NotNull
    public static final a b = new a(null);
    public static final String c = C2327q.class.getCanonicalName();
    @NotNull
    public static final String d = "com.facebook.sdk.APP_EVENTS_FLUSHED";
    @NotNull
    public static final String e = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
    @NotNull
    public static final String f = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
    @NotNull
    public final t a;

    /* renamed from: com.facebook.appevents.q$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final void a(@NotNull Application application) {
            C6562gT0.p(application, "application");
            t.c.f(application, null);
        }

        @InterfaceC9511sW0
        public final void b(@NotNull Application application, @Nullable String str) {
            C6562gT0.p(application, "application");
            t.c.f(application, str);
        }

        @InterfaceC9511sW0
        public final void c(@NotNull WebView webView, @Nullable Context context) {
            C6562gT0.p(webView, "webView");
            t.c.g(webView, context);
        }

        @InterfaceC9511sW0
        public final void d() {
            Q q = Q.a;
            Q.d();
        }

        @InterfaceC9511sW0
        public final void e() {
            C2314d c2314d = C2314d.a;
            C2314d.g(null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final String f(@NotNull Context context) {
            C6562gT0.p(context, "context");
            return t.c.k(context);
        }

        @InterfaceC9511sW0
        @Nullable
        public final b g() {
            return t.c.l();
        }

        @InterfaceC9511sW0
        @NotNull
        public final String h() {
            Q q = Q.a;
            return Q.h();
        }

        @InterfaceC9511sW0
        @Nullable
        public final String i() {
            C2314d c2314d = C2314d.a;
            return C2314d.c();
        }

        @InterfaceC9511sW0
        public final void j(@NotNull Context context, @Nullable String str) {
            C6562gT0.p(context, "context");
            t.c.o(context, str);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2327q k(@NotNull Context context) {
            C6562gT0.p(context, "context");
            return new C2327q(context, null, null, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2327q l(@NotNull Context context, @Nullable C0376a c0376a) {
            C6562gT0.p(context, "context");
            return new C2327q(context, null, c0376a, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2327q m(@NotNull Context context, @Nullable String str) {
            C6562gT0.p(context, "context");
            return new C2327q(context, str, null, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2327q n(@NotNull Context context, @Nullable String str, @Nullable C0376a c0376a) {
            C6562gT0.p(context, "context");
            return new C2327q(context, str, c0376a, null);
        }

        @InterfaceC9511sW0
        public final void o() {
            t.c.u();
        }

        @InterfaceC9511sW0
        public final void p(@NotNull b bVar) {
            C6562gT0.p(bVar, "flushBehavior");
            t.c.v(bVar);
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Y})
        public final void q(@Nullable String str) {
            t.c.w(str);
        }

        @InterfaceC9511sW0
        public final void r(@Nullable String str) {
            t.c.x(str);
        }

        @InterfaceC9511sW0
        public final void s(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
            Q q = Q.a;
            Q.o(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        @InterfaceC9511sW0
        public final void t(@Nullable String str) {
            C2314d c2314d = C2314d.a;
            C2314d.g(str);
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.appevents.q$b */
    /* loaded from: classes2.dex */
    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: com.facebook.appevents.q$c */
    /* loaded from: classes2.dex */
    public enum c {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: com.facebook.appevents.q$d */
    /* loaded from: classes2.dex */
    public enum d {
        NEW,
        REFURBISHED,
        USED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ C2327q(Context context, String str, C0376a c0376a, C9516sY c9516sY) {
        this(context, str, c0376a);
    }

    @InterfaceC9511sW0
    public static final void A() {
        b.o();
    }

    @InterfaceC9511sW0
    public static final void B(@NotNull b bVar) {
        b.p(bVar);
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    public static final void C(@Nullable String str) {
        b.q(str);
    }

    @InterfaceC9511sW0
    public static final void D(@Nullable String str) {
        b.r(str);
    }

    @InterfaceC9511sW0
    public static final void E(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        b.s(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @InterfaceC9511sW0
    public static final void F(@Nullable String str) {
        b.t(str);
    }

    @InterfaceC9511sW0
    public static final void a(@NotNull Application application) {
        b.a(application);
    }

    @InterfaceC9511sW0
    public static final void b(@NotNull Application application, @Nullable String str) {
        b.b(application, str);
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull WebView webView, @Nullable Context context) {
        b.c(webView, context);
    }

    @InterfaceC9511sW0
    public static final void d() {
        b.d();
    }

    @InterfaceC9511sW0
    public static final void e() {
        b.e();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String g(@NotNull Context context) {
        return b.f(context);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final b i() {
        return b.g();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String j() {
        return b.h();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String k() {
        return b.i();
    }

    @InterfaceC9511sW0
    public static final void l(@NotNull Context context, @Nullable String str) {
        b.j(context, str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2327q w(@NotNull Context context) {
        return b.k(context);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2327q x(@NotNull Context context, @Nullable C0376a c0376a) {
        return b.l(context, c0376a);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2327q y(@NotNull Context context, @Nullable String str) {
        return b.m(context, str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2327q z(@NotNull Context context, @Nullable String str, @Nullable C0376a c0376a) {
        return b.n(context, str, c0376a);
    }

    public final void f() {
        this.a.o();
    }

    @NotNull
    public final String h() {
        return this.a.s();
    }

    public final boolean m(@NotNull C0376a c0376a) {
        C6562gT0.p(c0376a, C9998uW1.m);
        return this.a.x(c0376a);
    }

    public final void n(@Nullable String str) {
        this.a.y(str);
    }

    public final void o(@Nullable String str, double d2) {
        this.a.z(str, d2);
    }

    public final void p(@Nullable String str, double d2, @Nullable Bundle bundle) {
        this.a.A(str, d2, bundle);
    }

    public final void q(@Nullable String str, @Nullable Bundle bundle) {
        this.a.B(str, bundle);
    }

    public final void r(@Nullable String str, @Nullable c cVar, @Nullable d dVar, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Bundle bundle) {
        this.a.H(str, cVar, dVar, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void s(@Nullable BigDecimal bigDecimal, @Nullable Currency currency) {
        this.a.I(bigDecimal, currency);
    }

    public final void t(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        this.a.J(bigDecimal, currency, bundle);
    }

    public final void u(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "payload");
        this.a.N(bundle, null);
    }

    public final void v(@NotNull Bundle bundle, @Nullable String str) {
        C6562gT0.p(bundle, "payload");
        this.a.N(bundle, str);
    }

    public C2327q(Context context, String str, C0376a c0376a) {
        this.a = new t(context, str, c0376a);
    }
}
