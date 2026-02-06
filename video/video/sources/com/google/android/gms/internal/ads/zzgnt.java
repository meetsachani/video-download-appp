package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzgnt implements Iterable {
    public final /* synthetic */ List X;
    public final /* synthetic */ List Y;

    public zzgnt(zzgnx zzgnxVar, List list, List list2) {
        this.X = list;
        this.Y = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgnv(this.X.iterator(), this.Y.iterator(), null);
    }
}
