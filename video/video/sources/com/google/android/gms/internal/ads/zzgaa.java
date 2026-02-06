package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgaa extends zzfzz implements SortedSet {
    public zzgaa(SortedSet sortedSet, zzfvd zzfvdVar) {
        super(sortedSet, zzfvdVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.X).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.X.iterator();
        it.getClass();
        zzfvd zzfvdVar = this.Y;
        zzfvdVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfvdVar.b(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zzgaa(((SortedSet) this.X).headSet(obj), this.Y);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.X;
        while (true) {
            zzfvd zzfvdVar = this.Y;
            Object last = sortedSet.last();
            if (zzfvdVar.b(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzgaa(((SortedSet) this.X).subSet(obj, obj2), this.Y);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zzgaa(((SortedSet) this.X).tailSet(obj), this.Y);
    }
}
