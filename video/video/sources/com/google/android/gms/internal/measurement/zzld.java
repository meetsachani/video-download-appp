package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzld {
    public static final Class<?> a = E();
    public static final zzma<?, ?> b = A();
    public static final zzma<?, ?> c = new zzmc();

    public static zzma<?, ?> A() {
        try {
            Class<?> I = I();
            if (I == null) {
                return null;
            }
            return (zzma) I.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i, List<Integer> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.c(i, list, z);
        }
    }

    public static int C(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.U(i, 0L);
    }

    public static int D(List<?> list) {
        return list.size() << 3;
    }

    public static Class<?> E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(int i, List<Integer> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.K(i, list, z);
        }
    }

    public static int G(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * zzig.x0(i));
    }

    public static int H(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.l0(zzjaVar.e(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.l0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static Class<?> I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(int i, List<Long> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.J(i, list, z);
        }
    }

    public static int K(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * zzig.x0(i));
    }

    public static int L(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.f0(zzjyVar.z(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.f0(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static void M(int i, List<Float> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.M(i, list, z);
        }
    }

    public static int N(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * zzig.x0(i));
    }

    public static int O(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.t0(zzjaVar.e(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.t0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static void P(int i, List<Integer> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.i(i, list, z);
        }
    }

    public static int Q(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * zzig.x0(i));
    }

    public static int R(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.o0(zzjyVar.z(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.o0(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static void S(int i, List<Long> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.H(i, list, z);
        }
    }

    public static int T(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * zzig.x0(i));
    }

    public static int U(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.A0(zzjaVar.e(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.A0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static void V(int i, List<Integer> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.G(i, list, z);
        }
    }

    public static int W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + (size * zzig.x0(i));
    }

    public static int X(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.s0(zzjyVar.z(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.s0(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static void Y(int i, List<Long> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.h(i, list, z);
        }
    }

    public static void Z(int i, List<Integer> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.I(i, list, z);
        }
    }

    public static int a(int i, Object obj, zzlb zzlbVar) {
        if (obj instanceof zzjn) {
            return zzig.z(i, (zzjn) obj);
        }
        return zzig.W(i, (zzkj) obj, zzlbVar);
    }

    public static void a0(int i, List<Long> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.f(i, list, z);
        }
    }

    public static int b(int i, List<zzhm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x0 = size * zzig.x0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            x0 += zzig.E(list.get(i2));
        }
        return x0;
    }

    public static void b0(int i, List<Integer> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.y(i, list, z);
        }
    }

    public static int c(int i, List<zzkj> list, zzlb zzlbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzig.B(i, list.get(i3), zzlbVar);
        }
        return i2;
    }

    public static void c0(int i, List<Long> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.e(i, list, z);
        }
    }

    public static int d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.D(i, true);
    }

    public static int e(List<?> list) {
        return list.size();
    }

    public static zzma<?, ?> f() {
        return b;
    }

    public static <UT, UB> UB g(Object obj, int i, int i2, UB ub, zzma<UT, UB> zzmaVar) {
        if (ub == null) {
            ub = zzmaVar.o(obj);
        }
        zzmaVar.l(ub, i, i2);
        return ub;
    }

    public static <UT, UB> UB h(Object obj, int i, List<Integer> list, zzje zzjeVar, UB ub, zzma<UT, UB> zzmaVar) {
        if (zzjeVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int intValue = num.intValue();
                if (zzjeVar.u(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) g(obj, i, intValue, ub, zzmaVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!zzjeVar.u(intValue2)) {
                ub = (UB) g(obj, i, intValue2, ub, zzmaVar);
                it.remove();
            }
        }
        return ub;
    }

    public static void i(int i, List<zzhm> list, zzmw zzmwVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.E(i, list);
        }
    }

    public static void j(int i, List<?> list, zzmw zzmwVar, zzlb zzlbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.F(i, list, zzlbVar);
        }
    }

    public static void k(int i, List<Boolean> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.m(i, list, z);
        }
    }

    public static <T, FT extends zzis<FT>> void l(zzim<FT> zzimVar, T t, T t2) {
        zziq<FT> b2 = zzimVar.b(t2);
        if (!b2.a.isEmpty()) {
            zzimVar.i(t).i(b2);
        }
    }

    public static <T> void m(zzkg zzkgVar, T t, T t2, long j) {
        zzmg.j(t, j, zzkgVar.g(zzmg.B(t, j), zzmg.B(t2, j)));
    }

    public static <T, UT, UB> void n(zzma<UT, UB> zzmaVar, T t, T t2) {
        zzmaVar.p(t, zzmaVar.c(zzmaVar.q(t), zzmaVar.q(t2)));
    }

    public static void o(Class<?> cls) {
        Class<?> cls2;
        if (!zzix.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int q(int i, List<?> list) {
        int G;
        int G2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int x0 = zzig.x0(i) * size;
        if (list instanceof zzjp) {
            zzjp zzjpVar = (zzjp) list;
            while (i2 < size) {
                Object z = zzjpVar.z(i2);
                if (z instanceof zzhm) {
                    G2 = zzig.E((zzhm) z);
                } else {
                    G2 = zzig.G((String) z);
                }
                x0 += G2;
                i2++;
            }
            return x0;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof zzhm) {
                G = zzig.E((zzhm) obj);
            } else {
                G = zzig.G((String) obj);
            }
            x0 += G;
            i2++;
        }
        return x0;
    }

    public static int r(int i, List<?> list, zzlb zzlbVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x0 = zzig.x0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzjn) {
                i2 = zzig.h((zzjn) obj);
            } else {
                i2 = zzig.i((zzkj) obj, zzlbVar);
            }
            x0 += i2;
        }
        return x0;
    }

    public static int s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * zzig.x0(i));
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzig.c0(zzjaVar.e(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzig.c0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static zzma<?, ?> u() {
        return c;
    }

    public static void v(int i, List<String> list, zzmw zzmwVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.A(i, list);
        }
    }

    public static void w(int i, List<?> list, zzmw zzmwVar, zzlb zzlbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.C(i, list, zzlbVar);
        }
    }

    public static void x(int i, List<Double> list, zzmw zzmwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmwVar.q(i, list, z);
        }
    }

    public static int y(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.m0(i, 0);
    }

    public static int z(List<?> list) {
        return list.size() << 2;
    }
}
