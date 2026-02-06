package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class zzt {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final zzt a(int i) {
        zzdc.f(!this.b);
        this.a.append(i, true);
        return this;
    }

    public final zzv b() {
        zzdc.f(!this.b);
        this.b = true;
        return new zzv(this.a, null);
    }
}
