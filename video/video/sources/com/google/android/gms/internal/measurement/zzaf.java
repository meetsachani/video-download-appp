package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import o.HS1;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzaf implements zzak, zzaq, Iterable<zzaq> {
    @InterfaceC5299bJ2
    public final SortedMap<Integer, zzaq> X;
    @InterfaceC5299bJ2
    public final Map<String, zzaq> Y;

    public zzaf() {
        this.X = new TreeMap();
        this.Y = new TreeMap();
    }

    public final int B() {
        if (this.X.isEmpty()) {
            return 0;
        }
        return this.X.lastKey().intValue() + 1;
    }

    public final String D(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.X.isEmpty()) {
            for (int i = 0; i < B(); i++) {
                zzaq l = l(i);
                sb.append(str);
                if (!(l instanceof zzax) && !(l instanceof zzao)) {
                    sb.append(l.e());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void F(int i) {
        int intValue = this.X.lastKey().intValue();
        if (i <= intValue && i >= 0) {
            this.X.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i2 = i - 1;
                if (!this.X.containsKey(Integer.valueOf(i2)) && i2 >= 0) {
                    this.X.put(Integer.valueOf(i2), zzaq.i);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= this.X.lastKey().intValue()) {
                    zzaq zzaqVar = this.X.get(Integer.valueOf(i));
                    if (zzaqVar != null) {
                        this.X.put(Integer.valueOf(i - 1), zzaqVar);
                        this.X.remove(Integer.valueOf(i));
                    }
                } else {
                    return;
                }
            }
        }
    }

    @HS1({"elements"})
    public final void G(int i, zzaq zzaqVar) {
        if (i <= 32468) {
            if (i >= 0) {
                if (zzaqVar == null) {
                    this.X.remove(Integer.valueOf(i));
                    return;
                } else {
                    this.X.put(Integer.valueOf(i), zzaqVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean H(int i) {
        if (i >= 0 && i <= this.X.lastKey().intValue()) {
            return this.X.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public final Iterator<Integer> J() {
        return this.X.keySet().iterator();
    }

    public final List<zzaq> K() {
        ArrayList arrayList = new ArrayList(B());
        for (int i = 0; i < B(); i++) {
            arrayList.add(l(i));
        }
        return arrayList;
    }

    public final void L() {
        this.X.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean Q(String str) {
        if (!"length".equals(str) && !this.Y.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        zzaf zzafVar = new zzaf();
        for (Map.Entry<Integer, zzaq> entry : this.X.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzafVar.X.put(entry.getKey(), entry.getValue());
            } else {
                zzafVar.X.put(entry.getKey(), entry.getValue().c());
            }
        }
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        if (this.X.size() == 1) {
            return l(0).d();
        }
        if (this.X.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        if (B() != zzafVar.B()) {
            return false;
        }
        if (this.X.isEmpty()) {
            return zzafVar.X.isEmpty();
        }
        for (int intValue = this.X.firstKey().intValue(); intValue <= this.X.lastKey().intValue(); intValue++) {
            if (!l(intValue).equals(zzafVar.l(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return new zzae(this, this.X.keySet().iterator(), this.Y.keySet().iterator());
    }

    public final int hashCode() {
        return this.X.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return zzan.a(this, new zzas(str), zzhVar, list);
        }
        return zzbe.d(str, this, zzhVar, list);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzah(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void j(String str, zzaq zzaqVar) {
        if (zzaqVar == null) {
            this.Y.remove(str);
        } else {
            this.Y.put(str, zzaqVar);
        }
    }

    public final int k() {
        return this.X.size();
    }

    public final zzaq l(int i) {
        zzaq zzaqVar;
        if (i < B()) {
            if (H(i) && (zzaqVar = this.X.get(Integer.valueOf(i))) != null) {
                return zzaqVar;
            }
            return zzaq.i;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void p(int i, zzaq zzaqVar) {
        if (i >= 0) {
            if (i >= B()) {
                G(i, zzaqVar);
                return;
            }
            for (int intValue = this.X.lastKey().intValue(); intValue >= i; intValue--) {
                zzaq zzaqVar2 = this.X.get(Integer.valueOf(intValue));
                if (zzaqVar2 != null) {
                    G(intValue + 1, zzaqVar2);
                    this.X.remove(Integer.valueOf(intValue));
                }
            }
            G(i, zzaqVar);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i);
    }

    public final void r(zzaq zzaqVar) {
        G(B(), zzaqVar);
    }

    public final String toString() {
        return D(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq w(String str) {
        zzaq zzaqVar;
        if ("length".equals(str)) {
            return new zzai(Double.valueOf(B()));
        }
        if (Q(str) && (zzaqVar = this.Y.get(str)) != null) {
            return zzaqVar;
        }
        return zzaq.i;
    }

    public zzaf(List<zzaq> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                G(i, list.get(i));
            }
        }
    }

    public zzaf(zzaq... zzaqVarArr) {
        this(Arrays.asList(zzaqVarArr));
    }
}
