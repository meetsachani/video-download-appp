package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzyy {
    public final int a;
    public final zzlz[] b;
    public final zzyq[] c;
    public final zzbt d;
    @InterfaceC11300zs1
    public final Object e;

    public zzyy(zzlz[] zzlzVarArr, zzyq[] zzyqVarArr, zzbt zzbtVar, @InterfaceC11300zs1 Object obj) {
        boolean z;
        int length = zzlzVarArr.length;
        if (length == zzyqVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        this.b = zzlzVarArr;
        this.c = (zzyq[]) zzyqVarArr.clone();
        this.d = zzbtVar;
        this.e = obj;
        this.a = length;
    }

    public final boolean a(@InterfaceC11300zs1 zzyy zzyyVar, int i) {
        if (zzyyVar == null || !Objects.equals(this.b[i], zzyyVar.b[i]) || !Objects.equals(this.c[i], zzyyVar.c[i])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i) {
        if (this.b[i] != null) {
            return true;
        }
        return false;
    }
}
