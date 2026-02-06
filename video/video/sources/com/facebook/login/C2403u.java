package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C2364i;
import com.facebook.internal.Z;
import com.facebook.login.w;
import java.util.List;
import java.util.Set;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;

@InterfaceC5056aJ2(otherwise = 3)
/* renamed from: com.facebook.login.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2403u extends N {
    @NotNull
    public final String c1;
    @NotNull
    public static final b d1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2403u> CREATOR = new a();

    /* renamed from: com.facebook.login.u$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2403u> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2403u createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2403u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2403u[] newArray(int i) {
            return new C2403u[i];
        }
    }

    /* renamed from: com.facebook.login.u$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2403u(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.c1 = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.I
    @NotNull
    public String m() {
        return this.c1;
    }

    @Override // com.facebook.login.I
    public boolean y() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    @Override // com.facebook.login.N, com.facebook.login.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z(@NotNull w.e eVar) {
        boolean z;
        EnumC2389f g;
        EnumC2385b e;
        String name;
        C6562gT0.p(eVar, "request");
        v m = eVar.m();
        if (com.facebook.M.M) {
            C2364i c2364i = C2364i.a;
            if (C2364i.a() != null && m.g()) {
                z = true;
                String a2 = w.h1.a();
                Z z2 = Z.a;
                ActivityC4864Yy0 m2 = h().m();
                String a3 = eVar.a();
                Set<String> s = eVar.s();
                boolean x = eVar.x();
                boolean u = eVar.u();
                g = eVar.g();
                if (g == null) {
                    g = EnumC2389f.NONE;
                }
                EnumC2389f enumC2389f = g;
                String g2 = g(eVar.b());
                String c = eVar.c();
                String o2 = eVar.o();
                boolean t = eVar.t();
                boolean v = eVar.v();
                boolean L = eVar.L();
                String q = eVar.q();
                String d = eVar.d();
                e = eVar.e();
                if (e != null) {
                    name = null;
                } else {
                    name = e.name();
                }
                List<Intent> o3 = Z.o(m2, a3, s, a2, x, u, enumC2389f, g2, c, z, o2, t, v, L, q, d, name);
                a("e2e", a2);
                int i = 0;
                for (Intent intent : o3) {
                    i++;
                    if (P(intent, w.h1.b())) {
                        return i;
                    }
                }
                return 0;
            }
        }
        z = false;
        String a22 = w.h1.a();
        Z z22 = Z.a;
        ActivityC4864Yy0 m22 = h().m();
        String a32 = eVar.a();
        Set<String> s2 = eVar.s();
        boolean x2 = eVar.x();
        boolean u2 = eVar.u();
        g = eVar.g();
        if (g == null) {
        }
        EnumC2389f enumC2389f2 = g;
        String g22 = g(eVar.b());
        String c2 = eVar.c();
        String o22 = eVar.o();
        boolean t2 = eVar.t();
        boolean v2 = eVar.v();
        boolean L2 = eVar.L();
        String q2 = eVar.q();
        String d2 = eVar.d();
        e = eVar.e();
        if (e != null) {
        }
        List<Intent> o32 = Z.o(m22, a32, s2, a22, x2, u2, enumC2389f2, g22, c2, z, o22, t2, v2, L2, q2, d2, name);
        a("e2e", a22);
        int i2 = 0;
        while (r1.hasNext()) {
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2403u(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.c1 = "katana_proxy_auth";
    }
}
