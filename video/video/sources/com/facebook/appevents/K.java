package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.appevents.C2327q;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C6562gT0;
import o.C9516sY;
import o.HT1;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class K {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    public final t a;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ K d(a aVar, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.b(context, str);
        }

        @HT1({HT1.a.Z})
        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8289nW0
        public final K a(@Nullable Context context) {
            return d(this, context, null, 2, null);
        }

        @HT1({HT1.a.Z})
        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8289nW0
        public final K b(@Nullable Context context, @Nullable String str) {
            return new K(context, str);
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Z})
        @NotNull
        public final K c(@NotNull String str, @Nullable String str2, @Nullable C0376a c0376a) {
            C6562gT0.p(str, "activityName");
            return new K(str, str2, c0376a);
        }

        @InterfaceC9511sW0
        @NotNull
        public final Executor e() {
            return t.c.j();
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2327q.b f() {
            return t.c.l();
        }

        @InterfaceC9511sW0
        @Nullable
        public final String g() {
            return t.c.n();
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Y0})
        public final void h(@NotNull Map<String, String> map) {
            C6562gT0.p(map, "ud");
            Q q = Q.a;
            Q.m(map);
        }

        @InterfaceC9511sW0
        public final void i(@Nullable Bundle bundle) {
            Q q = Q.a;
            Q.n(bundle);
        }

        public a() {
        }
    }

    public K(@NotNull t tVar) {
        C6562gT0.p(tVar, "loggerImpl");
        this.a = tVar;
    }

    @HT1({HT1.a.Z})
    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8289nW0
    public static final K a(@Nullable Context context) {
        return b.a(context);
    }

    @HT1({HT1.a.Z})
    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8289nW0
    public static final K b(@Nullable Context context, @Nullable String str) {
        return b.b(context, str);
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Z})
    @NotNull
    public static final K c(@NotNull String str, @Nullable String str2, @Nullable C0376a c0376a) {
        return b.c(str, str2, c0376a);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Executor e() {
        return b.e();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2327q.b f() {
        return b.f();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String g() {
        return b.g();
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y0})
    public static final void q(@NotNull Map<String, String> map) {
        b.h(map);
    }

    @InterfaceC9511sW0
    public static final void r(@Nullable Bundle bundle) {
        b.i(bundle);
    }

    public final void d() {
        this.a.o();
    }

    public final void h(@NotNull Bundle bundle) {
        boolean z;
        C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
        if ((bundle.getInt("previous") & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            com.facebook.M m = com.facebook.M.a;
            if (!com.facebook.M.s()) {
                return;
            }
        }
        this.a.F("fb_sdk_settings_changed", null, bundle);
    }

    public final void i(@Nullable String str, double d, @Nullable Bundle bundle) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.A(str, d, bundle);
        }
    }

    public final void j(@Nullable String str, @Nullable Bundle bundle) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.B(str, bundle);
        }
    }

    public final void k(@Nullable String str, @Nullable String str2) {
        this.a.E(str, str2);
    }

    public final void l(@Nullable String str) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.F(str, null, null);
        }
    }

    public final void m(@Nullable String str, @Nullable Bundle bundle) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.F(str, null, bundle);
        }
    }

    public final void n(@Nullable String str, @Nullable Double d, @Nullable Bundle bundle) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.F(str, d, bundle);
        }
    }

    public final void o(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.G(str, bigDecimal, currency, bundle);
        }
    }

    public final void p(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            this.a.M(bigDecimal, currency, bundle);
        }
    }

    public K(@Nullable Context context) {
        this(new t(context, (String) null, (C0376a) null));
    }

    public K(@Nullable Context context, @Nullable String str) {
        this(new t(context, str, (C0376a) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(@NotNull String str, @Nullable String str2, @Nullable C0376a c0376a) {
        this(new t(str, str2, c0376a));
        C6562gT0.p(str, "activityName");
    }
}
