package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbe implements Iterator<String> {
    public Iterator<String> X;
    public final /* synthetic */ zzbb Y;

    public zzbe(zzbb zzbbVar) {
        Bundle bundle;
        this.Y = zzbbVar;
        bundle = zzbbVar.X;
        this.X = bundle.keySet().iterator();
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
        throw new UnsupportedOperationException("Remove not supported");
    }
}
