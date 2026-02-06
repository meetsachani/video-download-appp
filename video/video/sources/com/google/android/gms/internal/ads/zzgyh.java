package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgyh {
    public static final zzgyh d = new zzgyh(true);
    public final zzhbe a = new zzhaz();
    public boolean b;
    public boolean c;

    private zzgyh() {
    }

    public static int a(zzhbv zzhbvVar, int i, Object obj) {
        int e = zzgxx.e(i << 3);
        if (zzhbvVar == zzhbv.f1) {
            byte[] bArr = zzgzf.b;
            if (!(((zzhad) obj) instanceof zzgwu)) {
                e += e;
            } else {
                throw null;
            }
        }
        return e + b(zzhbvVar, obj);
    }

    public static int b(zzhbv zzhbvVar, Object obj) {
        int i;
        int e;
        zzhbv zzhbvVar2 = zzhbv.Y;
        zzhbw zzhbwVar = zzhbw.INT;
        switch (zzhbvVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i2 = zzgxx.d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i3 = zzgxx.d;
                return 4;
            case 2:
                return zzgxx.f(((Long) obj).longValue());
            case 3:
                return zzgxx.f(((Long) obj).longValue());
            case 4:
                return zzgxx.f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i4 = zzgxx.d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i5 = zzgxx.d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i6 = zzgxx.d;
                return 1;
            case 8:
                if (obj instanceof zzgxk) {
                    int i7 = zzgxx.d;
                    i = ((zzgxk) obj).i();
                    e = zzgxx.e(i);
                    break;
                } else {
                    return zzgxx.d((String) obj);
                }
            case 9:
                int i8 = zzgxx.d;
                return ((zzhad) obj).O0();
            case 10:
                if (obj instanceof zzgzn) {
                    int i9 = zzgxx.d;
                    i = ((zzgzn) obj).a();
                    e = zzgxx.e(i);
                    break;
                } else {
                    return zzgxx.E((zzhad) obj);
                }
            case 11:
                if (obj instanceof zzgxk) {
                    int i10 = zzgxx.d;
                    i = ((zzgxk) obj).i();
                    e = zzgxx.e(i);
                    break;
                } else {
                    int i11 = zzgxx.d;
                    i = ((byte[]) obj).length;
                    e = zzgxx.e(i);
                    break;
                }
            case 12:
                return zzgxx.e(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgyw) {
                    return zzgxx.f(((zzgyw) obj).a());
                }
                return zzgxx.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i12 = zzgxx.d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i13 = zzgxx.d;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgxx.e((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgxx.f((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return e + i;
    }

    public static int c(zzgyg zzgygVar, Object obj) {
        zzhbv b = zzgygVar.b();
        int a = zzgygVar.a();
        if (zzgygVar.d()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (zzgygVar.f()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i2 = 0;
                while (i < size) {
                    i2 += b(b, list.get(i));
                    i++;
                }
                return zzgxx.e(a << 3) + i2 + zzgxx.e(i2);
            }
            int i3 = 0;
            while (i < size) {
                i3 += a(b, a, list.get(i));
                i++;
            }
            return i3;
        }
        return a(b, a, obj);
    }

    public static zzgyh e() {
        return d;
    }

    public static boolean j(Map.Entry entry) {
        zzgyg zzgygVar = (zzgyg) entry.getKey();
        if (zzgygVar.c() == zzhbw.MESSAGE) {
            if (zzgygVar.d()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!k(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return k(entry.getValue());
        }
        return true;
    }

    public static boolean k(Object obj) {
        if (obj instanceof zzhae) {
            return ((zzhae) obj).D0();
        }
        if (obj instanceof zzgzn) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int l(Map.Entry entry) {
        int i;
        int e;
        int e2;
        zzgyg zzgygVar = (zzgyg) entry.getKey();
        Object value = entry.getValue();
        if (zzgygVar.c() == zzhbw.MESSAGE && !zzgygVar.d() && !zzgygVar.f()) {
            if (value instanceof zzgzn) {
                int a = ((zzgyg) entry.getKey()).a();
                int e3 = zzgxx.e(8);
                i = e3 + e3;
                e = zzgxx.e(16) + zzgxx.e(a);
                int e4 = zzgxx.e(24);
                int a2 = ((zzgzn) value).a();
                e2 = e4 + zzgxx.e(a2) + a2;
            } else {
                int a3 = ((zzgyg) entry.getKey()).a();
                int e5 = zzgxx.e(8);
                i = e5 + e5;
                e = zzgxx.e(16) + zzgxx.e(a3);
                e2 = zzgxx.e(24) + zzgxx.E((zzhad) value);
            }
            return i + e + e2;
        }
        return c(zzgygVar, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(zzgyg zzgygVar, Object obj) {
        boolean z;
        zzhbv b = zzgygVar.b();
        byte[] bArr = zzgzf.b;
        obj.getClass();
        zzhbv zzhbvVar = zzhbv.Y;
        zzhbw zzhbwVar = zzhbw.INT;
        switch (b.e().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof zzgxk) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgyw)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof zzhad) || (obj instanceof zzgzn)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgygVar.a()), zzgygVar.b().e(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgyh zzgyhVar = new zzgyh();
        zzhbe zzhbeVar = this.a;
        int c = zzhbeVar.c();
        for (int i = 0; i < c; i++) {
            Map.Entry g = zzhbeVar.g(i);
            zzgyhVar.h((zzgyg) ((zzhba) g).e(), g.getValue());
        }
        for (Map.Entry entry : zzhbeVar.d()) {
            zzgyhVar.h((zzgyg) entry.getKey(), entry.getValue());
        }
        zzgyhVar.c = this.c;
        return zzgyhVar;
    }

    public final int d() {
        zzhbe zzhbeVar = this.a;
        int c = zzhbeVar.c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += l(zzhbeVar.g(i2));
        }
        for (Map.Entry entry : zzhbeVar.d()) {
            i += l(entry);
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyh)) {
            return false;
        }
        return this.a.equals(((zzgyh) obj).a);
    }

    public final Iterator f() {
        zzhbe zzhbeVar = this.a;
        if (zzhbeVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.c) {
            return new zzgzl(zzhbeVar.entrySet().iterator());
        }
        return zzhbeVar.entrySet().iterator();
    }

    public final void g() {
        if (this.b) {
            return;
        }
        zzhbe zzhbeVar = this.a;
        int c = zzhbeVar.c();
        for (int i = 0; i < c; i++) {
            Object value = zzhbeVar.g(i).getValue();
            if (value instanceof zzgys) {
                ((zzgys) value).A1();
            }
        }
        for (Map.Entry entry : zzhbeVar.d()) {
            Object value2 = entry.getValue();
            if (value2 instanceof zzgys) {
                ((zzgys) value2).A1();
            }
        }
        zzhbeVar.a();
        this.b = true;
    }

    public final void h(zzgyg zzgygVar, Object obj) {
        if (zzgygVar.d()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    m(zzgygVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m(zzgygVar, obj);
        }
        if (obj instanceof zzgzn) {
            this.c = true;
        }
        this.a.put(zzgygVar, obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        zzhbe zzhbeVar = this.a;
        int c = zzhbeVar.c();
        for (int i = 0; i < c; i++) {
            if (!j(zzhbeVar.g(i))) {
                return false;
            }
        }
        for (Map.Entry entry : zzhbeVar.d()) {
            if (!j(entry)) {
                return false;
            }
        }
        return true;
    }

    public zzgyh(boolean z) {
        g();
        g();
    }
}
