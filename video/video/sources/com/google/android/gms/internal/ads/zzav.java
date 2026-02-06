package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzav {
    public final zzau[] a;

    public zzav(long j, zzau... zzauVarArr) {
        this.a = zzauVarArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final zzau b(int i) {
        return this.a[i];
    }

    public final zzav c(zzau... zzauVarArr) {
        int length = zzauVarArr.length;
        if (length == 0) {
            return this;
        }
        zzau[] zzauVarArr2 = this.a;
        String str = zzeu.a;
        int length2 = zzauVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzauVarArr2, length2 + length);
        System.arraycopy(zzauVarArr, 0, copyOf, length2, length);
        return new zzav(C10323vs.b, (zzau[]) copyOf);
    }

    public final zzav d(@InterfaceC11300zs1 zzav zzavVar) {
        if (zzavVar == null) {
            return this;
        }
        return c(zzavVar.a);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzav.class == obj.getClass() && Arrays.equals(this.a, ((zzav) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + ((int) (-9223372034707292159L));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "entries=" + arrays + "";
    }

    public zzav(List list) {
        this.a = (zzau[]) list.toArray(new zzau[0]);
    }
}
