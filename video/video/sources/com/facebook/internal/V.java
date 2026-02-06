package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C6562gT0;
import o.C8319ne2;
import o.C9516sY;
import o.C9545sf2;
import o.C9998uW1;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class V {
    @NotNull
    public static final String f = "FacebookSDK.";
    @NotNull
    public final com.facebook.b0 a;
    @NotNull
    public final String b;
    @NotNull
    public StringBuilder c;
    public int d;
    @NotNull
    public static final a e = new a(null);
    @NotNull
    public static final HashMap<String, String> g = new HashMap<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final void b(@NotNull com.facebook.b0 b0Var, int i, @NotNull String str, @NotNull String str2) {
            C6562gT0.p(b0Var, "behavior");
            C6562gT0.p(str, "tag");
            C6562gT0.p(str2, "string");
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.P(b0Var)) {
                String h = h(str2);
                if (!C9545sf2.J2(str, V.f, false, 2, null)) {
                    str = C6562gT0.C(V.f, str);
                }
                Log.println(i, str, h);
                if (b0Var == com.facebook.b0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        @InterfaceC9511sW0
        public final void c(@NotNull com.facebook.b0 b0Var, int i, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            C6562gT0.p(b0Var, "behavior");
            C6562gT0.p(str, "tag");
            C6562gT0.p(str2, com.facebook.S.A);
            C6562gT0.p(objArr, "args");
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.P(b0Var)) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                b(b0Var, i, str, format);
            }
        }

        @InterfaceC9511sW0
        public final void d(@NotNull com.facebook.b0 b0Var, @NotNull String str, @NotNull String str2) {
            C6562gT0.p(b0Var, "behavior");
            C6562gT0.p(str, "tag");
            C6562gT0.p(str2, "string");
            b(b0Var, 3, str, str2);
        }

        @InterfaceC9511sW0
        public final void e(@NotNull com.facebook.b0 b0Var, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            C6562gT0.p(b0Var, "behavior");
            C6562gT0.p(str, "tag");
            C6562gT0.p(str2, com.facebook.S.A);
            C6562gT0.p(objArr, "args");
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.P(b0Var)) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                b(b0Var, 3, str, format);
            }
        }

        @InterfaceC9511sW0
        public final synchronized void f(@NotNull String str) {
            C6562gT0.p(str, C9998uW1.m);
            com.facebook.M m = com.facebook.M.a;
            if (!com.facebook.M.P(com.facebook.b0.INCLUDE_ACCESS_TOKENS)) {
                g(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        @InterfaceC9511sW0
        public final synchronized void g(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "original");
            C6562gT0.p(str2, "replace");
            V.g.put(str, str2);
        }

        public final synchronized String h(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : V.g.entrySet()) {
                str2 = C9545sf2.z2(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        public a() {
        }
    }

    public V(@NotNull com.facebook.b0 b0Var, @NotNull String str) {
        C6562gT0.p(b0Var, "behavior");
        C6562gT0.p(str, "tag");
        this.d = 3;
        this.a = b0Var;
        m0 m0Var = m0.a;
        this.b = C6562gT0.C(f, m0.t(str, "tag"));
        this.c = new StringBuilder();
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull com.facebook.b0 b0Var, int i, @NotNull String str, @NotNull String str2) {
        e.b(b0Var, i, str, str2);
    }

    @InterfaceC9511sW0
    public static final void j(@NotNull com.facebook.b0 b0Var, int i, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        e.c(b0Var, i, str, str2, objArr);
    }

    @InterfaceC9511sW0
    public static final void k(@NotNull com.facebook.b0 b0Var, @NotNull String str, @NotNull String str2) {
        e.d(b0Var, str, str2);
    }

    @InterfaceC9511sW0
    public static final void l(@NotNull com.facebook.b0 b0Var, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        e.e(b0Var, str, str2, objArr);
    }

    @InterfaceC9511sW0
    public static final synchronized void n(@NotNull String str) {
        synchronized (V.class) {
            e.f(str);
        }
    }

    @InterfaceC9511sW0
    public static final synchronized void o(@NotNull String str, @NotNull String str2) {
        synchronized (V.class) {
            e.g(str, str2);
        }
    }

    public final void b(@NotNull String str) {
        C6562gT0.p(str, "string");
        if (q()) {
            this.c.append(str);
        }
    }

    public final void c(@NotNull String str, @NotNull Object... objArr) {
        C6562gT0.p(str, com.facebook.S.A);
        C6562gT0.p(objArr, "args");
        if (q()) {
            StringBuilder sb = this.c;
            C8319ne2 c8319ne2 = C8319ne2.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    public final void d(@NotNull StringBuilder sb) {
        C6562gT0.p(sb, "stringBuilder");
        if (q()) {
            this.c.append((CharSequence) sb);
        }
    }

    public final void e(@NotNull String str, @NotNull Object obj) {
        C6562gT0.p(str, "key");
        C6562gT0.p(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    @NotNull
    public final String f() {
        a aVar = e;
        String sb = this.c.toString();
        C6562gT0.o(sb, "contents.toString()");
        return aVar.h(sb);
    }

    public final int g() {
        return this.d;
    }

    public final void h() {
        String sb = this.c.toString();
        C6562gT0.o(sb, "contents.toString()");
        m(sb);
        this.c = new StringBuilder();
    }

    public final void m(@NotNull String str) {
        C6562gT0.p(str, "string");
        e.b(this.a, this.d, this.b, str);
    }

    public final void p(int i) {
        m0 m0Var = m0.a;
        m0.u(Integer.valueOf(i), "value", 7, 3, 6, 4, 2, 5);
        p(i);
    }

    public final boolean q() {
        com.facebook.M m = com.facebook.M.a;
        return com.facebook.M.P(this.a);
    }
}
