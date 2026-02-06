package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaj implements zzaq {
    public final zzaq X;
    public final String Y;

    public zzaj() {
        this.X = zzaq.i;
        this.Y = "return";
    }

    public final zzaq a() {
        return this.X;
    }

    public final String b() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzaj(this.Y, this.X.c());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        if (this.Y.equals(zzajVar.Y) && this.X.equals(zzajVar.X)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return null;
    }

    public final int hashCode() {
        return (this.Y.hashCode() * 31) + this.X.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public zzaj(String str) {
        this.X = zzaq.i;
        this.Y = str;
    }

    public zzaj(String str, zzaq zzaqVar) {
        this.X = zzaqVar;
        this.Y = str;
    }
}
