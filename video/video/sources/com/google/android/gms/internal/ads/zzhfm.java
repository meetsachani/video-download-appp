package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zzhfm extends AbstractList {
    public static final zzhfn Z = zzhfn.b(zzhfm.class);
    public final List X;
    public final Iterator Y;

    public zzhfm(List list, Iterator it) {
        this.X = list;
        this.Y = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.X;
        if (list.size() > i) {
            return list.get(i);
        }
        Iterator it = this.Y;
        if (it.hasNext()) {
            list.add(it.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhfl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzhfn zzhfnVar = Z;
        zzhfnVar.a("potentially expensive size() call");
        zzhfnVar.a("blowup running");
        while (true) {
            Iterator it = this.Y;
            if (it.hasNext()) {
                this.X.add(it.next());
            } else {
                return this.X.size();
            }
        }
    }
}
