package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzal implements zzak, zzaq {
    public final String X;
    public final Map<String, zzaq> Y = new HashMap();

    public zzal(String str) {
        this.X = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean Q(String str) {
        return this.Y.containsKey(str);
    }

    public abstract zzaq a(zzh zzhVar, List<zzaq> list);

    public final String b() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public zzaq c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return this.X;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzal)) {
            return false;
        }
        zzal zzalVar = (zzal) obj;
        String str = this.X;
        if (str == null) {
            return false;
        }
        return str.equals(zzalVar.X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return zzan.b(this.Y);
    }

    public int hashCode() {
        String str = this.X;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(this.X);
        }
        return zzan.a(this, new zzas(str), zzhVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void j(String str, zzaq zzaqVar) {
        if (zzaqVar == null) {
            this.Y.remove(str);
        } else {
            this.Y.put(str, zzaqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq w(String str) {
        if (this.Y.containsKey(str)) {
            return this.Y.get(str);
        }
        return zzaq.i;
    }
}
