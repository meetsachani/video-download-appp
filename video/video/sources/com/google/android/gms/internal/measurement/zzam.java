package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzam implements Iterator<zzaq> {
    public final /* synthetic */ Iterator X;

    public zzam(Iterator it) {
        this.X = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        return new zzas((String) this.X.next());
    }
}
