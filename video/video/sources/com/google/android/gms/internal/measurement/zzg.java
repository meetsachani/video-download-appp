package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzg {
    public static double a(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && d != -0.0d) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return i2 * Math.floor(Math.abs(d));
        }
        return d;
    }

    public static int b(zzh zzhVar) {
        int i = i(zzhVar.c("runtime.counter").d().doubleValue() + 1.0d);
        if (i <= 1000000) {
            zzhVar.h("runtime.counter", new zzai(Double.valueOf(i)));
            return i;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static zzbv c(String str) {
        zzbv zzbvVar;
        if (str != null && !str.isEmpty()) {
            zzbvVar = zzbv.e(Integer.parseInt(str));
        } else {
            zzbvVar = null;
        }
        if (zzbvVar != null) {
            return zzbvVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(zzaq zzaqVar) {
        if (zzaq.j.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.i.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return e((zzap) zzaqVar);
        }
        if (zzaqVar instanceof zzaf) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzaq> it = ((zzaf) zzaqVar).iterator();
            while (it.hasNext()) {
                Object d = d(it.next());
                if (d != null) {
                    arrayList.add(d);
                }
            }
            return arrayList;
        } else if (!zzaqVar.d().isNaN()) {
            return zzaqVar.d();
        } else {
            return zzaqVar.e();
        }
    }

    public static Map<String, Object> e(zzap zzapVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzapVar.a()) {
            Object d = d(zzapVar.w(str));
            if (d != null) {
                hashMap.put(str, d);
            }
        }
        return hashMap;
    }

    public static void f(zzbv zzbvVar, int i, List<zzaq> list) {
        g(zzbvVar.name(), i, list);
    }

    public static void g(String str, int i, List<zzaq> list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static boolean h(zzaq zzaqVar, zzaq zzaqVar2) {
        if (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            return false;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            if (Double.isNaN(zzaqVar.d().doubleValue()) || Double.isNaN(zzaqVar2.d().doubleValue())) {
                return false;
            }
            return zzaqVar.d().equals(zzaqVar2.d());
        } else if (zzaqVar instanceof zzas) {
            return zzaqVar.e().equals(zzaqVar2.e());
        } else {
            if (zzaqVar instanceof zzag) {
                return zzaqVar.f().equals(zzaqVar2.f());
            }
            if (zzaqVar != zzaqVar2) {
                return false;
            }
            return true;
        }
    }

    public static int i(double d) {
        int i;
        int i2;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return (int) ((i2 * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static void j(zzbv zzbvVar, int i, List<zzaq> list) {
        k(zzbvVar.name(), i, list);
    }

    public static void k(String str, int i, List<zzaq> list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static boolean l(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double d = zzaqVar.d();
        if (d.isNaN() || d.doubleValue() < 0.0d || !d.equals(Double.valueOf(Math.floor(d.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static long m(double d) {
        return i(d) & 4294967295L;
    }

    public static void n(String str, int i, List<zzaq> list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }
}
