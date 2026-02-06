package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzav implements Iterator<zzaq> {
    public int X = 0;
    public final /* synthetic */ zzas Y;

    public zzav(zzas zzasVar) {
        this.Y = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.X;
        str = this.Y.X;
        if (i < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        String str;
        int i = this.X;
        str = this.Y.X;
        if (i < str.length()) {
            int i2 = this.X;
            this.X = i2 + 1;
            return new zzas(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
