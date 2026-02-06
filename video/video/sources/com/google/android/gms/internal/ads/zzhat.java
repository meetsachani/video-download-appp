package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzhat implements Iterator {
    public final ArrayDeque X;
    public zzgxg Y;

    public /* synthetic */ zzhat(zzgxk zzgxkVar, zzhau zzhauVar) {
        if (zzgxkVar instanceof zzhav) {
            zzhav zzhavVar = (zzhav) zzgxkVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzhavVar.k());
            this.X = arrayDeque;
            arrayDeque.push(zzhavVar);
            this.Y = c(zzhav.h0(zzhavVar));
            return;
        }
        this.X = null;
        this.Y = (zzgxg) zzgxkVar;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final zzgxg next() {
        zzgxg zzgxgVar;
        zzgxg zzgxgVar2 = this.Y;
        if (zzgxgVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.X;
                zzgxgVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgxgVar = c(zzhav.b0((zzhav) arrayDeque.pop()));
            } while (zzgxgVar.i() == 0);
            this.Y = zzgxgVar;
            return zzgxgVar2;
        }
        throw new NoSuchElementException();
    }

    public final zzgxg c(zzgxk zzgxkVar) {
        while (zzgxkVar instanceof zzhav) {
            zzhav zzhavVar = (zzhav) zzgxkVar;
            this.X.push(zzhavVar);
            zzgxkVar = zzhav.h0(zzhavVar);
        }
        return (zzgxg) zzgxkVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
