package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.EnumC2354h;
import com.facebook.internal.Z;
import com.facebook.login.w;
import java.util.Set;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.facebook.login.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2402t extends N {
    @NotNull
    public final String c1;
    @NotNull
    public final EnumC2354h d1;
    @NotNull
    public static final b e1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2402t> CREATOR = new a();

    /* renamed from: com.facebook.login.t$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2402t> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2402t createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2402t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2402t[] newArray(int i) {
            return new C2402t[i];
        }
    }

    /* renamed from: com.facebook.login.t$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402t(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.c1 = "instagram_login";
        this.d1 = EnumC2354h.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.N
    @NotNull
    public EnumC2354h E() {
        return this.d1;
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

    @Override // com.facebook.login.I, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        super.writeToParcel(parcel, i);
    }

    @Override // com.facebook.login.N, com.facebook.login.I
    public int z(@NotNull w.e eVar) {
        C6562gT0.p(eVar, "request");
        w.c cVar = w.h1;
        String a2 = cVar.a();
        Z z = Z.a;
        Context m = h().m();
        if (m == null) {
            com.facebook.M m2 = com.facebook.M.a;
            m = com.facebook.M.n();
        }
        String a3 = eVar.a();
        Set<String> s = eVar.s();
        boolean x = eVar.x();
        boolean u = eVar.u();
        EnumC2389f g = eVar.g();
        if (g == null) {
            g = EnumC2389f.NONE;
        }
        Intent j = Z.j(m, a3, s, a2, x, u, g, g(eVar.b()), eVar.c(), eVar.o(), eVar.t(), eVar.v(), eVar.L());
        a("e2e", a2);
        return P(j, cVar.b()) ? 1 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402t(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.c1 = "instagram_login";
        this.d1 = EnumC2354h.INSTAGRAM_APPLICATION_WEB;
    }
}
