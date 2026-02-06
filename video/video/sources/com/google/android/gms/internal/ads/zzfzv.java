package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zzfzv extends zzfzn implements Serializable {
    public static final zzfzv X = new zzfzv();

    private zzfzv() {
    }

    @Override // com.google.android.gms.internal.ads.zzfzn, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
