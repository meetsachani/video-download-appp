package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public class zzap implements zzak, zzaq {
    @InterfaceC5299bJ2
    public final Map<String, zzaq> X = new HashMap();

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean Q(String str) {
        return this.X.containsKey(str);
    }

    public final List<String> a() {
        return new ArrayList(this.X.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        zzap zzapVar = new zzap();
        for (Map.Entry<String, zzaq> entry : this.X.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzapVar.X.put(entry.getKey(), entry.getValue());
            } else {
                zzapVar.X.put(entry.getKey(), entry.getValue().c());
            }
        }
        return zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return "[object Object]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        return this.X.equals(((zzap) obj).X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return zzan.b(this.X);
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(toString());
        }
        return zzan.a(this, new zzas(str), zzhVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void j(String str, zzaq zzaqVar) {
        if (zzaqVar == null) {
            this.X.remove(str);
        } else {
            this.X.put(str, zzaqVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.X.isEmpty()) {
            for (String str : this.X.keySet()) {
                sb.append(String.format("%s: %s,", str, this.X.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq w(String str) {
        if (this.X.containsKey(str)) {
            return this.X.get(str);
        }
        return zzaq.i;
    }
}
