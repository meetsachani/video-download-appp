package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfzy extends zzgac {
    public final /* synthetic */ Set X;
    public final /* synthetic */ Set Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzy(Set set, Set set2) {
        super(null);
        this.X = set;
        this.Y = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.X.contains(obj) && this.Y.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.X.containsAll(collection) && this.Y.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final int d() {
        return Math.min(zzgac.h(this.X), zzgac.h(this.Y));
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: f */
    public final zzgai iterator() {
        return new zzfzx(this, this.X, this.Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.Y, this.X);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.X) {
            if (this.Y.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
