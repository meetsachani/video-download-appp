package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzcz extends zzdl {
    public final int X;
    public int Y;

    public zzcz(int i, int i2) {
        zzcx.b(i2, i, "index");
        this.X = i;
        this.Y = i2;
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.Y < this.X;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.Y > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.Y;
            this.Y = i + 1;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.Y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.Y - 1;
            this.Y = i;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.Y - 1;
    }
}
