package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zzfzl extends zzfzn implements Serializable {
    public static final zzfzl X = new zzfzl();

    private zzfzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzfzn
    public final zzfzn a() {
        return zzfzv.X;
    }

    @Override // com.google.android.gms.internal.ads.zzfzn, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
