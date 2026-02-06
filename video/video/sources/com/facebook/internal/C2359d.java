package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import o.C10219vQ1;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2359d extends BroadcastReceiver {
    @Nullable
    public static C2359d c = null;
    @NotNull
    public static final String e = "event_name";
    @NotNull
    public static final String f = "event_args";
    @NotNull
    public static final String g = "bf_";
    @NotNull
    public final Context a;
    @NotNull
    public static final a b = new a(null);
    @NotNull
    public static final String d = "com.parse.bolts.measurement_event";

    /* renamed from: com.facebook.internal.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC5056aJ2
        public static /* synthetic */ void c() {
        }

        @InterfaceC9511sW0
        @Nullable
        public final C2359d a(@NotNull Context context) {
            C6562gT0.p(context, "context");
            if (C2359d.b() != null) {
                return C2359d.b();
            }
            C2359d c2359d = new C2359d(context, null);
            C2359d.c(c2359d);
            C2359d.d(c2359d);
            return C2359d.b();
        }

        @NotNull
        public final String b() {
            return C2359d.a();
        }

        public a() {
        }
    }

    public /* synthetic */ C2359d(Context context, C9516sY c9516sY) {
        this(context);
    }

    public static final /* synthetic */ String a() {
        if (SQ.e(C2359d.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            SQ.c(th, C2359d.class);
            return null;
        }
    }

    public static final /* synthetic */ C2359d b() {
        if (SQ.e(C2359d.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            SQ.c(th, C2359d.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(C2359d c2359d) {
        if (SQ.e(C2359d.class)) {
            return;
        }
        try {
            c2359d.g();
        } catch (Throwable th) {
            SQ.c(th, C2359d.class);
        }
    }

    public static final /* synthetic */ void d(C2359d c2359d) {
        if (SQ.e(C2359d.class)) {
            return;
        }
        try {
            c = c2359d;
        } catch (Throwable th) {
            SQ.c(th, C2359d.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2359d f(@NotNull Context context) {
        if (SQ.e(C2359d.class)) {
            return null;
        }
        try {
            return b.a(context);
        } catch (Throwable th) {
            SQ.c(th, C2359d.class);
            return null;
        }
    }

    public final void e() {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6200f21 b2 = C6200f21.b(this.a);
            C6562gT0.o(b2, "getInstance(applicationContext)");
            b2.f(this);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (SQ.e(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void g() {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6200f21 b2 = C6200f21.b(this.a);
            C6562gT0.o(b2, "getInstance(applicationContext)");
            b2.c(this, new IntentFilter(d));
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.K k = new com.facebook.appevents.K(context);
            Set<String> set = null;
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra(e);
            }
            String C = C6562gT0.C(g, stringExtra);
            if (intent == null) {
                bundleExtra = null;
            } else {
                bundleExtra = intent.getBundleExtra(f);
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String str : set) {
                    C6562gT0.o(str, "key");
                    bundle.putString(new C10219vQ1("[ -]*$").o(new C10219vQ1("^[ -]*").o(new C10219vQ1("[^0-9a-zA-Z _-]").o(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            k.j(C, bundle);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public C2359d(Context context) {
        Context applicationContext = context.getApplicationContext();
        C6562gT0.o(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }
}
