package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzah implements Iterator<zzaq> {
    public int X = 0;
    public final /* synthetic */ zzaf Y;

    public zzah(zzaf zzafVar) {
        this.Y = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.X < this.Y.B()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.X < this.Y.B()) {
            zzaf zzafVar = this.Y;
            int i = this.X;
            this.X = i + 1;
            return zzafVar.l(i);
        }
        int i2 = this.X;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
