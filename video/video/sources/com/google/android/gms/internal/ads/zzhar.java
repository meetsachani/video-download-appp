package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzhar extends zzgxd {
    public final zzhat X;
    public zzgxf Y = b();
    public final /* synthetic */ zzhav Z;

    public zzhar(zzhav zzhavVar) {
        this.Z = zzhavVar;
        this.X = new zzhat(zzhavVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final byte a() {
        zzgxf zzgxfVar = this.Y;
        if (zzgxfVar != null) {
            byte a = zzgxfVar.a();
            if (!this.Y.hasNext()) {
                this.Y = b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    public final zzgxf b() {
        zzhat zzhatVar = this.X;
        if (zzhatVar.hasNext()) {
            return zzhatVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y != null;
    }
}
