package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzhfl implements Iterator {
    public int X = 0;
    public final /* synthetic */ zzhfm Y;

    public zzhfl(zzhfm zzhfmVar) {
        this.Y = zzhfmVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.X;
        zzhfm zzhfmVar = this.Y;
        if (i >= zzhfmVar.X.size() && !zzhfmVar.Y.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.X;
        zzhfm zzhfmVar = this.Y;
        List list = zzhfmVar.X;
        if (i < list.size()) {
            int i2 = this.X;
            this.X = i2 + 1;
            return list.get(i2);
        }
        list.add(zzhfmVar.Y.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
