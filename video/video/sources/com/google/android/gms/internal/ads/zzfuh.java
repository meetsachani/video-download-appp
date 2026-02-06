package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzfuh implements Iterator {
    public Object X;
    public int Y = 2;

    public abstract Object b();

    public final Object c() {
        this.Y = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.Y != 4) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.l(z);
        int i = this.Y;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return true;
            }
            if (i2 != 2) {
                this.Y = 4;
                this.X = b();
                if (this.Y != 3) {
                    this.Y = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.Y = 2;
            Object obj = this.X;
            this.X = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
