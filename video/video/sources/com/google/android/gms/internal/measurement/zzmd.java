package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzmd implements Iterator<String> {
    public Iterator<String> X;
    public final /* synthetic */ zzmb Y;

    public zzmd(zzmb zzmbVar) {
        zzjp zzjpVar;
        this.Y = zzmbVar;
        zzjpVar = zzmbVar.X;
        this.X = zzjpVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.X.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
