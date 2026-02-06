package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzfyl extends zzgai {
    public final Object X;
    public boolean Y;

    public zzfyl(Object obj) {
        this.X = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.Y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.Y) {
            this.Y = true;
            return this.X;
        }
        throw new NoSuchElementException();
    }
}
