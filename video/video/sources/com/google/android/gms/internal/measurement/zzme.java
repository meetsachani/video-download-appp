package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzme implements ListIterator<String> {
    public ListIterator<String> X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ zzmb Z;

    public zzme(zzmb zzmbVar, int i) {
        zzjp zzjpVar;
        this.Z = zzmbVar;
        this.Y = i;
        zzjpVar = zzmbVar.X;
        this.X = zzjpVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.X.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.X.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.X.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.X.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.X.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
