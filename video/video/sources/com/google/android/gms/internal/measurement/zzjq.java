package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzjq extends zzhg<String> implements zzjp, RandomAccess {
    @Deprecated
    public static final zzjp Y0;
    public static final zzjq Z;
    public final List<Object> Y;

    static {
        zzjq zzjqVar = new zzjq(false);
        Z = zzjqVar;
        Y0 = zzjqVar;
    }

    public zzjq() {
        this(10);
    }

    public static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhm) {
            return ((zzhm) obj).G();
        }
        return zziz.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final zzjp W0() {
        if (c()) {
            return new zzmb(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        d();
        this.Y.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final List<?> b() {
        return Collections.unmodifiableList(this.Y);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzjf
    public final /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.Y.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.Y.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhm) {
            zzhm zzhmVar = (zzhm) obj;
            String G = zzhmVar.G();
            if (zzhmVar.H()) {
                this.Y.set(i, G);
            }
            return G;
        }
        byte[] bArr = (byte[]) obj;
        String h = zziz.h(bArr);
        if (zziz.i(bArr)) {
            this.Y.set(i, h);
        }
        return h;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final void n4(zzhm zzhmVar) {
        d();
        this.Y.add(zzhmVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        d();
        Object remove = this.Y.remove(i);
        ((AbstractList) this).modCount++;
        return e(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        d();
        return e(this.Y.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Y.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf u(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.Y);
            return new zzjq(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final Object z(int i) {
        return this.Y.get(i);
    }

    public zzjq(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        d();
        if (collection instanceof zzjp) {
            collection = ((zzjp) collection).b();
        }
        boolean addAll = this.Y.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public zzjq(ArrayList<Object> arrayList) {
        this.Y = arrayList;
    }

    public zzjq(boolean z) {
        super(false);
        this.Y = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }
}
