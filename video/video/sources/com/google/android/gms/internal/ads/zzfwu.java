package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfwu extends zzfws implements List {
    public final /* synthetic */ zzfwv a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwu(zzfwv zzfwvVar, Object obj, List list, zzfws zzfwsVar) {
        super(zzfwvVar, obj, list, zzfwsVar);
        this.a1 = zzfwvVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        boolean isEmpty = this.Y.isEmpty();
        ((List) this.Y).add(i, obj);
        zzfwv zzfwvVar = this.a1;
        i2 = zzfwvVar.Z0;
        zzfwvVar.Z0 = i2 + 1;
        if (isEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.Y).addAll(i, collection);
        if (addAll) {
            int size2 = this.Y.size();
            zzfwv zzfwvVar = this.a1;
            i2 = zzfwvVar.Z0;
            zzfwvVar.Z0 = i2 + (size2 - size);
            if (size == 0) {
                d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.Y).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.Y).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.Y).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new zzfwt(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        b();
        Object remove = ((List) this.Y).remove(i);
        zzfwv zzfwvVar = this.a1;
        i2 = zzfwvVar.Z0;
        zzfwvVar.Z0 = i2 - 1;
        e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.Y).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List subList = ((List) this.Y).subList(i, i2);
        zzfws zzfwsVar = this.Z;
        if (zzfwsVar == null) {
            zzfwsVar = this;
        }
        return this.a1.l(this.X, subList, zzfwsVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new zzfwt(this, i);
    }
}
