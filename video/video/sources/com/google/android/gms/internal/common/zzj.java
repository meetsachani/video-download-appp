package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.InterfaceC6181ey;
import o.MB;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
abstract class zzj implements Iterator {
    @MB
    public Object X;
    public int Y = 2;

    @MB
    public abstract Object b();

    @InterfaceC6181ey
    @MB
    public final Object c() {
        this.Y = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.Y;
        if (i != 4) {
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
        throw new IllegalStateException();
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
