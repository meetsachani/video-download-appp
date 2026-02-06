package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zzgxc extends zzgxd {
    public int X = 0;
    public final int Y;
    public final /* synthetic */ zzgxk Z;

    public zzgxc(zzgxk zzgxkVar) {
        this.Z = zzgxkVar;
        this.Y = zzgxkVar.i();
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final byte a() {
        int i = this.X;
        if (i < this.Y) {
            this.X = i + 1;
            return this.Z.f(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X < this.Y;
    }
}
