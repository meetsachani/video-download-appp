package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzv implements Iterable {
    public final /* synthetic */ CharSequence X;
    public final /* synthetic */ zzx Y;

    public zzv(zzx zzxVar, CharSequence charSequence) {
        this.Y = zzxVar;
        this.X = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator h;
        h = this.Y.h(this.X);
        return h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzq.a(it.next(), C6566gU0.h));
                while (it.hasNext()) {
                    sb.append((CharSequence) C6566gU0.h);
                    sb.append(zzq.a(it.next(), C6566gU0.h));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
