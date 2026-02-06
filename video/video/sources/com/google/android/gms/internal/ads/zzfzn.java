package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class zzfzn implements Comparator {
    public static zzfzn b(Comparator comparator) {
        return new zzfxn(comparator);
    }

    public static zzfzn c() {
        return zzfzl.X;
    }

    public zzfzn a() {
        return new zzfzw(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
