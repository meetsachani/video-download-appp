package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzob;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C2531Be;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzt extends zzmo {
    public String d;
    public Set<Integer> e;
    public Map<Integer, zzv> f;
    public Long g;
    public Long h;

    public zzt(zzmp zzmpVar) {
        super(zzmpVar);
    }

    public final boolean A(int i, int i2) {
        zzv zzvVar = this.f.get(Integer.valueOf(i));
        if (zzvVar == null) {
            return false;
        }
        return zzv.b(zzvVar).get(i2);
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        return false;
    }

    public final zzv y(Integer num) {
        if (this.f.containsKey(num)) {
            return this.f.get(num);
        }
        zzv zzvVar = new zzv(this, this.d);
        this.f.put(num, zzvVar);
        return zzvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x05bd, code lost:
        r8 = j().L();
        r9 = com.google.android.gms.measurement.internal.zzfr.v(r30.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05cf, code lost:
        if (r10.O() == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05d1, code lost:
        r10 = java.lang.Integer.valueOf(r10.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05da, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05db, code lost:
        r8.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r10));
        r10 = false;
     */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzfi.zzc> z(String str, List<zzfi.zze> list, List<zzfi.zzn> list2, Long l, Long l2) {
        boolean z;
        boolean z2;
        Iterator<zzfi.zze> it;
        zzx zzxVar;
        zzbc zzbcVar;
        HashSet<Integer> hashSet;
        C2531Be c2531Be;
        List<zzew.zzb> list3;
        zzfi.zzl zzlVar;
        HashSet hashSet2;
        Preconditions.l(str);
        Preconditions.r(list);
        Preconditions.r(list2);
        this.d = str;
        this.e = new HashSet();
        this.f = new C2531Be();
        this.g = l;
        this.h = l2;
        Iterator<zzfi.zze> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if ("_s".equals(it2.next().b0())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        boolean z3 = zzob.a() && d().D(this.d, zzbi.j0);
        boolean z4 = zzob.a() && d().D(this.d, zzbi.i0);
        if (z) {
            zzao q = q();
            String str2 = this.d;
            q.u();
            q.n();
            Preconditions.l(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                q.B().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                q.j().G().c("Error resetting session-scoped event counts. appId", zzfr.v(str2), e);
            }
        }
        Map<Integer, List<zzew.zzb>> map = Collections.EMPTY_MAP;
        if (z4 && z3) {
            map = q().O0(this.d);
        }
        Map<Integer, List<zzew.zzb>> map2 = map;
        Map<Integer, zzfi.zzl> N0 = q().N0(this.d);
        if (N0.isEmpty()) {
            z2 = true;
        } else {
            HashSet hashSet3 = new HashSet(N0.keySet());
            if (z) {
                String str3 = this.d;
                Map<Integer, List<Integer>> P0 = q().P0(this.d);
                Preconditions.l(str3);
                Preconditions.r(N0);
                C2531Be c2531Be2 = new C2531Be();
                if (!N0.isEmpty()) {
                    for (Integer num : N0.keySet()) {
                        num.intValue();
                        zzfi.zzl zzlVar2 = N0.get(num);
                        List<Integer> list4 = P0.get(num);
                        if (list4 != null && !list4.isEmpty()) {
                            List<Long> N = o().N(zzlVar2.Y(), list4);
                            if (!N.isEmpty()) {
                                zzfi.zzl.zza y = zzlVar2.x().x().y(N);
                                y.B().C(o().N(zzlVar2.b0(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfi.zzd zzdVar : zzlVar2.X()) {
                                    HashSet hashSet4 = hashSet3;
                                    if (!list4.contains(Integer.valueOf(zzdVar.m()))) {
                                        arrayList.add(zzdVar);
                                    }
                                    hashSet3 = hashSet4;
                                }
                                hashSet2 = hashSet3;
                                y.v().w(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfi.zzm zzmVar : zzlVar2.Z()) {
                                    if (!list4.contains(Integer.valueOf(zzmVar.J()))) {
                                        arrayList2.add(zzmVar);
                                    }
                                }
                                y.z().A(arrayList2);
                                c2531Be2.put(num, (zzfi.zzl) ((com.google.android.gms.internal.measurement.zzix) y.e0()));
                            }
                        } else {
                            hashSet2 = hashSet3;
                            c2531Be2.put(num, zzlVar2);
                        }
                        hashSet3 = hashSet2;
                    }
                }
                hashSet = hashSet3;
                z2 = true;
                c2531Be = c2531Be2;
            } else {
                hashSet = hashSet3;
                z2 = true;
                c2531Be = N0;
            }
            for (Integer num2 : hashSet) {
                num2.intValue();
                zzfi.zzl zzlVar3 = c2531Be.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C2531Be c2531Be3 = new C2531Be();
                if (zzlVar3 != null && zzlVar3.m() != 0) {
                    for (zzfi.zzd zzdVar2 : zzlVar3.X()) {
                        if (zzdVar2.N()) {
                            c2531Be3.put(Integer.valueOf(zzdVar2.m()), zzdVar2.M() ? Long.valueOf(zzdVar2.J()) : null);
                        }
                    }
                }
                C2531Be c2531Be4 = new C2531Be();
                if (zzlVar3 != null && zzlVar3.M() != 0) {
                    for (zzfi.zzm zzmVar2 : zzlVar3.Z()) {
                        if (!zzmVar2.O() || zzmVar2.m() <= 0) {
                            zzlVar = zzlVar3;
                        } else {
                            zzlVar = zzlVar3;
                            c2531Be4.put(Integer.valueOf(zzmVar2.J()), Long.valueOf(zzmVar2.F(zzmVar2.m() - 1)));
                        }
                        zzlVar3 = zzlVar;
                    }
                }
                zzfi.zzl zzlVar4 = zzlVar3;
                if (zzlVar4 != null) {
                    for (int i = 0; i < (zzlVar4.Q() << 6); i++) {
                        if (zzmz.d0(zzlVar4.b0(), i)) {
                            j().K().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (zzmz.d0(zzlVar4.Y(), i)) {
                                bitSet.set(i);
                            }
                        }
                        c2531Be3.remove(Integer.valueOf(i));
                    }
                }
                zzfi.zzl zzlVar5 = N0.get(num2);
                if (z4 && z3 && (list3 = map2.get(num2)) != null && this.h != null && this.g != null) {
                    Iterator<zzew.zzb> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        zzew.zzb next = it3.next();
                        int K = next.K();
                        Iterator<zzew.zzb> it4 = it3;
                        long longValue = this.h.longValue() / 1000;
                        if (next.R()) {
                            longValue = this.g.longValue() / 1000;
                        }
                        if (c2531Be3.containsKey(Integer.valueOf(K))) {
                            c2531Be3.put(Integer.valueOf(K), Long.valueOf(longValue));
                        }
                        if (c2531Be4.containsKey(Integer.valueOf(K))) {
                            c2531Be4.put(Integer.valueOf(K), Long.valueOf(longValue));
                        }
                        it3 = it4;
                    }
                }
                this.f.put(num2, new zzv(this, this.d, zzlVar5, bitSet, bitSet2, c2531Be3, c2531Be4));
            }
        }
        if (!list.isEmpty()) {
            zzx zzxVar2 = new zzx(this);
            C2531Be c2531Be5 = new C2531Be();
            Iterator<zzfi.zze> it5 = list.iterator();
            while (it5.hasNext()) {
                zzfi.zze next2 = it5.next();
                zzfi.zze a = zzxVar2.a(this.d, next2);
                if (a != null) {
                    zzao q2 = q();
                    String str4 = this.d;
                    String b0 = a.b0();
                    zzbc C0 = q2.C0(str4, next2.b0());
                    if (C0 == null) {
                        q2.j().L().c("Event aggregate wasn't created during raw event logging. appId, event", zzfr.v(str4), q2.g().c(b0));
                        zzxVar = zzxVar2;
                        it = it5;
                        zzbcVar = new zzbc(str4, next2.b0(), 1L, 1L, 1L, next2.X(), 0L, null, null, null, null);
                    } else {
                        it = it5;
                        zzxVar = zzxVar2;
                        zzbcVar = new zzbc(C0.a, C0.b, C0.c + 1, C0.d + 1, C0.e + 1, C0.f, C0.g, C0.h, C0.i, C0.j, C0.k);
                    }
                    q().U(zzbcVar);
                    long j = zzbcVar.c;
                    String b02 = a.b0();
                    Map<Integer, List<zzew.zzb>> map3 = (Map) c2531Be5.get(b02);
                    if (map3 == null) {
                        map3 = q().H0(this.d, b02);
                        c2531Be5.put(b02, map3);
                    }
                    for (Integer num3 : map3.keySet()) {
                        int intValue = num3.intValue();
                        if (this.e.contains(num3)) {
                            j().K().b("Skipping failed audience ID", num3);
                        } else {
                            Iterator<zzew.zzb> it6 = map3.get(num3).iterator();
                            boolean z5 = z2;
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                zzew.zzb next3 = it6.next();
                                zzz zzzVar = new zzz(this, this.d, intValue, next3);
                                boolean k = zzzVar.k(this.g, this.h, a, j, zzbcVar, A(intValue, next3.K()));
                                if (k) {
                                    y(num3).c(zzzVar);
                                    z5 = k;
                                } else {
                                    this.e.add(num3);
                                    z5 = k;
                                    break;
                                }
                            }
                            if (!z5) {
                                this.e.add(num3);
                            }
                        }
                    }
                    it5 = it;
                    zzxVar2 = zzxVar;
                }
            }
        }
        if (!list2.isEmpty()) {
            C2531Be c2531Be6 = new C2531Be();
            for (zzfi.zzn zznVar : list2) {
                String Y = zznVar.Y();
                Map<Integer, List<zzew.zze>> map4 = (Map) c2531Be6.get(Y);
                if (map4 == null) {
                    map4 = q().J0(this.d, Y);
                    c2531Be6.put(Y, map4);
                }
                Iterator<Integer> it7 = map4.keySet().iterator();
                while (true) {
                    if (it7.hasNext()) {
                        Integer next4 = it7.next();
                        int intValue2 = next4.intValue();
                        if (this.e.contains(next4)) {
                            j().K().b("Skipping failed audience ID", next4);
                            break;
                        }
                        Iterator<zzew.zze> it8 = map4.get(next4).iterator();
                        boolean z6 = z2;
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            zzew.zze next5 = it8.next();
                            if (j().C(2)) {
                                j().K().d("Evaluating filter. audience, filter, property", next4, next5.O() ? Integer.valueOf(next5.m()) : null, g().g(next5.K()));
                                j().K().b("Filter definition", o().J(next5));
                            }
                            if (!next5.O() || next5.m() > 256) {
                                break;
                            }
                            zzab zzabVar = new zzab(this, this.d, intValue2, next5);
                            z6 = zzabVar.k(this.g, this.h, zznVar, A(intValue2, next5.m()));
                            if (z6) {
                                y(next4).c(zzabVar);
                            } else {
                                this.e.add(next4);
                                break;
                            }
                        }
                        if (!z6) {
                            this.e.add(next4);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Set<Integer> keySet = this.f.keySet();
        keySet.removeAll(this.e);
        for (Integer num4 : keySet) {
            int intValue3 = num4.intValue();
            zzv zzvVar = this.f.get(num4);
            Preconditions.r(zzvVar);
            zzfi.zzc a2 = zzvVar.a(intValue3);
            arrayList3.add(a2);
            zzao q3 = q();
            String str5 = this.d;
            zzfi.zzl P = a2.P();
            q3.u();
            q3.n();
            Preconditions.l(str5);
            Preconditions.r(P);
            byte[] k2 = P.k();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str5);
            contentValues2.put("audience_id", num4);
            contentValues2.put("current_results", k2);
            try {
                try {
                    if (q3.B().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        q3.j().G().b("Failed to insert filter results (got -1). appId", zzfr.v(str5));
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    q3.j().G().c("Error storing filter results. appId", zzfr.v(str5), e);
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        }
        return arrayList3;
    }
}
