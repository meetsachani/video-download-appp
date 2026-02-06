package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzv {
    public final SparseBooleanArray a;

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        zzdc.a(i, 0, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzv)) {
            return false;
        }
        return this.a.equals(((zzv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
