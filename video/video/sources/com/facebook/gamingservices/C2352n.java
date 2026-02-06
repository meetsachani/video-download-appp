package com.facebook.gamingservices;

import com.facebook.Y;
import o.C10169vE;
import o.C6562gT0;
import o.C9516sY;
import o.EnumC10487wW1;
import o.InterfaceC9511sW0;
import o.XT;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.facebook.gamingservices.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2352n {
    @NotNull
    public static final a b = new a(null);
    public static final int c = 5;
    @Nullable
    public static C2352n d;
    @NotNull
    public final String a;

    /* renamed from: com.facebook.gamingservices.n$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final C2352n a() {
            JSONObject i;
            String string;
            if (!C10169vE.f()) {
                return C2352n.d;
            }
            com.facebook.M m = com.facebook.M.a;
            Y j = XT.j(com.facebook.M.n(), null, EnumC10487wW1.CONTEXT_GET_ID, 5);
            if (j == null || (i = j.i()) == null) {
                string = null;
            } else {
                string = i.getString("id");
            }
            if (string == null) {
                return null;
            }
            return new C2352n(string);
        }

        @InterfaceC9511sW0
        public final void b(@NotNull C2352n c2352n) {
            C6562gT0.p(c2352n, "ctx");
            if (!C10169vE.f()) {
                C2352n.d = c2352n;
            }
        }

        public a() {
        }
    }

    public C2352n(@NotNull String str) {
        C6562gT0.p(str, "contextID");
        this.a = str;
    }

    public static /* synthetic */ C2352n e(C2352n c2352n, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2352n.a;
        }
        return c2352n.d(str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2352n g() {
        return b.a();
    }

    @InterfaceC9511sW0
    public static final void h(@NotNull C2352n c2352n) {
        b.b(c2352n);
    }

    @NotNull
    public final String c() {
        return this.a;
    }

    @NotNull
    public final C2352n d(@NotNull String str) {
        C6562gT0.p(str, "contextID");
        return new C2352n(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2352n) && C6562gT0.g(this.a, ((C2352n) obj).a);
    }

    @NotNull
    public final String f() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "GamingContext(contextID=" + this.a + ')';
    }
}
