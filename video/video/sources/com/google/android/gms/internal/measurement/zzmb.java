package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes3.dex */
public final class zzmb extends AbstractList<String> implements zzjp, RandomAccess {
    public final zzjp X;

    public zzmb(zzjp zzjpVar) {
        this.X = zzjpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final zzjp W0() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final List<?> b() {
        return this.X.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.X.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzmd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzme(this, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final void n4(zzhm zzhmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final Object z(int i) {
        return this.X.z(i);
    }
}
