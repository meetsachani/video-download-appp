package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvo implements Iterable {
    public final /* synthetic */ CharSequence X;
    public final /* synthetic */ zzfvr Y;

    public zzfvo(zzfvr zzfvrVar, CharSequence charSequence) {
        this.X = charSequence;
        this.Y = zzfvrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator g;
        g = this.Y.g(this.X);
        return g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfuu.b(sb, this, C6566gU0.h);
        sb.append(']');
        return sb.toString();
    }
}
