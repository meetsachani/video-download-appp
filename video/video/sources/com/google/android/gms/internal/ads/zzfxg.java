package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzfxg implements Iterator {
    public int X;
    public int Y;
    public final /* synthetic */ zzfxl Y0;
    public int Z;

    public /* synthetic */ zzfxg(zzfxl zzfxlVar, zzfxk zzfxkVar) {
        int i;
        this.Y0 = zzfxlVar;
        i = zzfxlVar.Z0;
        this.X = i;
        this.Y = zzfxlVar.i();
        this.Z = -1;
    }

    public abstract Object b(int i);

    public final void c() {
        int i;
        i = this.Y0.Z0;
        if (i == this.X) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (hasNext()) {
            int i = this.Y;
            this.Z = i;
            Object b = b(i);
            this.Y = this.Y0.j(this.Y);
            return b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        c();
        if (this.Z >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.m(z, "no calls to next() since the last call to remove()");
        this.X += 32;
        int i = this.Z;
        zzfxl zzfxlVar = this.Y0;
        zzfxlVar.remove(zzfxl.k(zzfxlVar, i));
        this.Y--;
        this.Z = -1;
    }
}
