package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzap {
    public final String a;
    @InterfaceC11300zs1
    public final zzak b;
    public final zzaj c;
    public final zzat d;
    public final zzaf e;
    public final zzam f;

    static {
        new zzad().c();
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzap(String str, zzag zzagVar, zzak zzakVar, zzaj zzajVar, zzat zzatVar, zzam zzamVar, zzao zzaoVar) {
        this.a = str;
        this.b = zzakVar;
        this.c = zzajVar;
        this.d = zzatVar;
        this.e = zzagVar;
        this.f = zzamVar;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        if (Objects.equals(this.a, zzapVar.a) && this.e.equals(zzapVar.e) && Objects.equals(this.b, zzapVar.b) && Objects.equals(this.c, zzapVar.c) && Objects.equals(this.d, zzapVar.d) && Objects.equals(this.f, zzapVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        zzak zzakVar = this.b;
        if (zzakVar != null) {
            i = zzakVar.hashCode();
        } else {
            i = 0;
        }
        return (((((((hashCode + i) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31;
    }
}
