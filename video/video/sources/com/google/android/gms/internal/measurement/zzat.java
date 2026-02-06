package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzat implements zzaq {
    public final String X;
    public final ArrayList<zzaq> Y;

    public zzat(String str, List<zzaq> list) {
        this.X = str;
        ArrayList<zzaq> arrayList = new ArrayList<>();
        this.Y = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.X;
    }

    public final ArrayList<zzaq> b() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzatVar = (zzat) obj;
        String str = this.X;
        if (str == null ? zzatVar.X != null : !str.equals(zzatVar.X)) {
            return false;
        }
        ArrayList<zzaq> arrayList = this.Y;
        ArrayList<zzaq> arrayList2 = zzatVar.Y;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return null;
    }

    public final int hashCode() {
        int i;
        String str = this.X;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ArrayList<zzaq> arrayList = this.Y;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
