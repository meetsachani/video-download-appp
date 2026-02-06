package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class zzfzc extends zzfzg {
    public final /* synthetic */ Comparator a;

    public zzfzc(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final Map a() {
        return new TreeMap(this.a);
    }
}
