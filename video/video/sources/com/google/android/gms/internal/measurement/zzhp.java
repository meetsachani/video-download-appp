package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhp extends zzhr {
    public int X = 0;
    public final int Y;
    public final /* synthetic */ zzhm Z;

    public zzhp(zzhm zzhmVar) {
        this.Z = zzhmVar;
        this.Y = zzhmVar.B();
    }

    @Override // com.google.android.gms.internal.measurement.zzhs
    public final byte a() {
        int i = this.X;
        if (i < this.Y) {
            this.X = i + 1;
            return this.Z.w(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.X < this.Y) {
            return true;
        }
        return false;
    }
}
