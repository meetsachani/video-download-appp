package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.TY1;

/* loaded from: classes2.dex */
final class zzafv extends zzafx {
    public long b;
    public long[] c;
    public long[] d;

    public zzafv() {
        super(new zzadj());
        this.b = C10323vs.b;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Double g(zzek zzekVar) {
        return Double.valueOf(Double.longBitsToDouble(zzekVar.N()));
    }

    @InterfaceC11300zs1
    public static Object h(zzek zzekVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) g(zzekVar).doubleValue());
                                zzekVar.m(2);
                                return date;
                            }
                            int J = zzekVar.J();
                            ArrayList arrayList = new ArrayList(J);
                            for (int i2 = 0; i2 < J; i2++) {
                                Object h = h(zzekVar, zzekVar.G());
                                if (h != null) {
                                    arrayList.add(h);
                                }
                            }
                            return arrayList;
                        }
                        return j(zzekVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String i3 = i(zzekVar);
                        int G = zzekVar.G();
                        if (G == 9) {
                            return hashMap;
                        }
                        Object h2 = h(zzekVar, G);
                        if (h2 != null) {
                            hashMap.put(i3, h2);
                        }
                    }
                } else {
                    return i(zzekVar);
                }
            } else {
                if (zzekVar.G() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return g(zzekVar);
        }
    }

    public static String i(zzek zzekVar) {
        int K = zzekVar.K();
        int w = zzekVar.w();
        zzekVar.m(K);
        return new String(zzekVar.n(), w, K);
    }

    public static HashMap j(zzek zzekVar) {
        int J = zzekVar.J();
        HashMap hashMap = new HashMap(J);
        for (int i = 0; i < J; i++) {
            String i2 = i(zzekVar);
            Object h = h(zzekVar, zzekVar.G());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final boolean a(zzek zzekVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final boolean b(zzek zzekVar, long j) {
        if (zzekVar.G() == 2 && TY1.e.equals(i(zzekVar)) && zzekVar.u() != 0 && zzekVar.G() == 8) {
            HashMap j2 = j(zzekVar);
            Object obj = j2.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = j2.get(TY1.g);
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get(TY1.h);
                Object obj4 = map.get(TY1.i);
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.c = new long[size];
                    this.d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.d[i] = ((Double) obj5).longValue();
                        } else {
                            this.c = new long[0];
                            this.d = new long[0];
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.b;
    }

    public final long[] e() {
        return this.d;
    }

    public final long[] f() {
        return this.c;
    }
}
