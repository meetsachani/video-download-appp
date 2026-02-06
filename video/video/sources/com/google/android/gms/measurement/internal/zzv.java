package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzob;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C2531Be;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzv {
    public String a;
    public boolean b;
    public zzfi.zzl c;
    public BitSet d;
    public BitSet e;
    public Map<Integer, Long> f;
    public Map<Integer, List<Long>> g;
    public final /* synthetic */ zzt h;

    public static /* bridge */ /* synthetic */ BitSet b(zzv zzvVar) {
        return zzvVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    @InterfaceC5670cr1
    public final zzfi.zzc a(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        zzfi.zzc.zza L = zzfi.zzc.L();
        L.v(i);
        L.y(this.b);
        zzfi.zzl zzlVar = this.c;
        if (zzlVar != null) {
            L.x(zzlVar);
        }
        zzfi.zzl.zza C = zzfi.zzl.U().y(zzmz.M(this.d)).C(zzmz.M(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = this.f.get(num);
                if (l != null) {
                    arrayList.add((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzix) zzfi.zzd.K().v(intValue).w(l.longValue()).e0()));
                }
            }
        }
        if (arrayList != null) {
            C.w(arrayList);
        }
        if (this.g == null) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(this.g.size());
            for (Integer num2 : this.g.keySet()) {
                zzfi.zzm.zza v = zzfi.zzm.L().v(num2.intValue());
                List<Long> list = this.g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    v.w(list);
                }
                arrayList2.add((zzfi.zzm) ((com.google.android.gms.internal.measurement.zzix) v.e0()));
            }
        }
        C.A(arrayList2);
        L.w(C);
        return (zzfi.zzc) ((com.google.android.gms.internal.measurement.zzix) L.e0());
    }

    public final void c(@InterfaceC5670cr1 zzac zzacVar) {
        int a = zzacVar.a();
        Boolean bool = zzacVar.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = zzacVar.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (zzacVar.e != null) {
            Long l = this.f.get(Integer.valueOf(a));
            long longValue = zzacVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (zzacVar.f != null) {
            List<Long> list = this.g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList<>();
                this.g.put(Integer.valueOf(a), list);
            }
            if (zzacVar.j()) {
                list.clear();
            }
            if (zzob.a() && this.h.d().D(this.a, zzbi.j0) && zzacVar.i()) {
                list.clear();
            }
            if (zzob.a() && this.h.d().D(this.a, zzbi.j0)) {
                long longValue2 = zzacVar.f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(zzacVar.f.longValue() / 1000));
        }
    }

    public zzv(zzt zztVar, String str) {
        this.h = zztVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new C2531Be();
        this.g = new C2531Be();
    }

    public zzv(zzt zztVar, String str, zzfi.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = zztVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new C2531Be();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.b = false;
        this.c = zzlVar;
    }
}
