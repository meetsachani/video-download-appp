package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzhay {
    public static final zzhbi a;
    public static final /* synthetic */ int b = 0;

    static {
        int i = zzhan.d;
        a = new zzhbk();
    }

    public static void A(zzhbi zzhbiVar, Object obj, Object obj2) {
        zzgys zzgysVar = (zzgys) obj;
        zzhbj zzhbjVar = zzgysVar.zzt;
        zzhbj zzhbjVar2 = ((zzgys) obj2).zzt;
        if (!zzhbj.c().equals(zzhbjVar2)) {
            if (zzhbj.c().equals(zzhbjVar)) {
                zzhbjVar = zzhbj.e(zzhbjVar, zzhbjVar2);
            } else {
                zzhbjVar.d(zzhbjVar2);
            }
        }
        zzgysVar.zzt = zzhbjVar;
    }

    public static void B(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.c(i, list, z);
        }
    }

    public static void C(int i, List list, zzhbx zzhbxVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.j(i, list);
        }
    }

    public static void D(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.i(i, list, z);
        }
    }

    public static void E(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.h(i, list, z);
        }
    }

    public static void F(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.f(i, list, z);
        }
    }

    public static void G(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.e(i, list, z);
        }
    }

    public static void H(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.t(i, list, z);
        }
    }

    public static void I(int i, List list, zzhbx zzhbxVar, zzhaw zzhawVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzgxy) zzhbxVar).v(i, list.get(i2), zzhawVar);
            }
        }
    }

    public static void J(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.o(i, list, z);
        }
    }

    public static void a(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.H(i, list, z);
        }
    }

    public static void b(int i, List list, zzhbx zzhbxVar, zzhaw zzhawVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzgxy) zzhbxVar).A(i, list.get(i2), zzhawVar);
            }
        }
    }

    public static void c(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.y(i, list, z);
        }
    }

    public static void d(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.n(i, list, z);
        }
    }

    public static void e(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.E(i, list, z);
        }
    }

    public static void f(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.J(i, list, z);
        }
    }

    public static void g(int i, List list, zzhbx zzhbxVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.L(i, list);
        }
    }

    public static void h(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.B(i, list, z);
        }
    }

    public static void i(int i, List list, zzhbx zzhbxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhbxVar.r(i, list, z);
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzgxx.f(zzgytVar.A0(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzgxx.f(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int l(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxx.e(i << 3) + 4);
    }

    public static int m(List list) {
        return list.size() * 4;
    }

    public static int n(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxx.e(i << 3) + 8);
    }

    public static int o(List list) {
        return list.size() * 8;
    }

    public static int p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzgxx.f(zzgytVar.A0(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzgxx.f(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzgxx.f(zzgzsVar.u(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzgxx.f(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int r(int i, Object obj, zzhaw zzhawVar) {
        int i2 = i << 3;
        if (obj instanceof zzgzo) {
            int e = zzgxx.e(i2);
            int a2 = ((zzgzo) obj).a();
            return e + zzgxx.e(a2) + a2;
        }
        return zzgxx.e(i2) + zzgxx.b((zzhad) obj, zzhawVar);
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = 0;
            while (i < size) {
                int A0 = zzgytVar.A0(i);
                i2 += zzgxx.e((A0 >> 31) ^ (A0 + A0));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += zzgxx.e((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = 0;
            while (i < size) {
                long u = zzgzsVar.u(i);
                i2 += zzgxx.f((u >> 63) ^ (u + u));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += zzgxx.f((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzgxx.e(zzgytVar.A0(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzgxx.e(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = 0;
            while (i < size) {
                i2 += zzgxx.f(zzgzsVar.u(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzgxx.f(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static zzhbi w() {
        return a;
    }

    public static Object x(Object obj, int i, List list, zzgyy zzgyyVar, Object obj2, zzhbi zzhbiVar) {
        if (zzgyyVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzgyyVar.u(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = y(obj, i, intValue, obj2, zzhbiVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!zzgyyVar.u(intValue2)) {
                obj2 = y(obj, i, intValue2, obj2, zzhbiVar);
                it.remove();
            }
        }
        return obj2;
    }

    public static Object y(Object obj, int i, int i2, Object obj2, zzhbi zzhbiVar) {
        if (obj2 == null) {
            obj2 = zzhbiVar.a(obj);
        }
        zzhbiVar.h(obj2, i, i2);
        return obj2;
    }

    public static void z(zzgyd zzgydVar, Object obj, Object obj2) {
        if (((zzgyo) obj2).zza.a.isEmpty()) {
            return;
        }
        zzgyo zzgyoVar = (zzgyo) obj;
        throw null;
    }
}
