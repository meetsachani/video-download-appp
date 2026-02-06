package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
abstract class zzgah extends zzgag implements ListIterator {
    public zzgah(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.X).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.X).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(((ListIterator) this.X).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.X).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
