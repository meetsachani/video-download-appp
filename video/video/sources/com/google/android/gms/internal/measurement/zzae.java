package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzae implements Iterator<zzaq> {
    public final /* synthetic */ Iterator X;
    public final /* synthetic */ Iterator Y;

    public zzae(zzaf zzafVar, Iterator it, Iterator it2) {
        this.X = it;
        this.Y = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.X.hasNext()) {
            return true;
        }
        return this.Y.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.X.hasNext()) {
            return new zzas(((Integer) this.X.next()).toString());
        }
        if (this.Y.hasNext()) {
            return new zzas((String) this.Y.next());
        }
        throw new NoSuchElementException();
    }
}
