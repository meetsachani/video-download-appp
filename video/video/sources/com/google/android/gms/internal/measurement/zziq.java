package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziq<T extends zzis<T>> {
    public static final zziq d = new zziq(true);
    public final zzlg<T, Object> a;
    public boolean b;
    public boolean c;

    private zziq() {
        this.a = zzlg.b(16);
    }

    public static int b(zzis<?> zzisVar, Object obj) {
        zzmn b = zzisVar.b();
        int a = zzisVar.a();
        if (zzisVar.d()) {
            List<Object> list = (List) obj;
            int i = 0;
            if (zzisVar.f()) {
                if (list.isEmpty()) {
                    return 0;
                }
                for (Object obj2 : list) {
                    i += d(b, obj2);
                }
                return zzig.x0(a) + i + zzig.A0(i);
            }
            for (Object obj3 : list) {
                i += c(b, a, obj3);
            }
            return i;
        }
        return c(b, a, obj);
    }

    public static int c(zzmn zzmnVar, int i, Object obj) {
        int x0 = zzig.x0(i);
        if (zzmnVar == zzmn.g1) {
            zziz.g((zzkj) obj);
            x0 <<= 1;
        }
        return x0 + d(zzmnVar, obj);
    }

    public static int d(zzmn zzmnVar, Object obj) {
        switch (zzip.b[zzmnVar.ordinal()]) {
            case 1:
                return zzig.c(((Double) obj).doubleValue());
            case 2:
                return zzig.d(((Float) obj).floatValue());
            case 3:
                return zzig.f0(((Long) obj).longValue());
            case 4:
                return zzig.s0(((Long) obj).longValue());
            case 5:
                return zzig.l0(((Integer) obj).intValue());
            case 6:
                return zzig.X(((Long) obj).longValue());
            case 7:
                return zzig.h0(((Integer) obj).intValue());
            case 8:
                return zzig.j(((Boolean) obj).booleanValue());
            case 9:
                return zzig.F((zzkj) obj);
            case 10:
                if (obj instanceof zzjj) {
                    return zzig.h((zzjj) obj);
                }
                return zzig.Y((zzkj) obj);
            case 11:
                if (obj instanceof zzhm) {
                    return zzig.E((zzhm) obj);
                }
                return zzig.G((String) obj);
            case 12:
                if (obj instanceof zzhm) {
                    return zzig.E((zzhm) obj);
                }
                return zzig.k((byte[]) obj);
            case 13:
                return zzig.A0(((Integer) obj).intValue());
            case 14:
                return zzig.p0(((Integer) obj).intValue());
            case 15:
                return zzig.k0(((Long) obj).longValue());
            case 16:
                return zzig.t0(((Integer) obj).intValue());
            case 17:
                return zzig.o0(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjc) {
                    return zzig.c0(((zzjc) obj).a());
                }
                return zzig.c0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() == zzmx.MESSAGE && !key.d() && !key.f()) {
            if (value instanceof zzjj) {
                return zzig.g(entry.getKey().a(), (zzjj) value);
            }
            return zzig.A(entry.getKey().a(), (zzkj) value);
        }
        return b(key, value);
    }

    public static Object g(Object obj) {
        if (obj instanceof zzks) {
            return ((zzks) obj).a();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static void h(zzig zzigVar, zzmn zzmnVar, int i, Object obj) throws IOException {
        if (zzmnVar == zzmn.g1) {
            zzkj zzkjVar = (zzkj) obj;
            zziz.g(zzkjVar);
            zzigVar.a0(i, 3);
            zzkjVar.b(zzigVar);
            zzigVar.a0(i, 4);
            return;
        }
        zzigVar.a0(i, zzmnVar.a());
        switch (zzip.b[zzmnVar.ordinal()]) {
            case 1:
                zzigVar.J(((Double) obj).doubleValue());
                return;
            case 2:
                zzigVar.K(((Float) obj).floatValue());
                return;
            case 3:
                zzigVar.R(((Long) obj).longValue());
                return;
            case 4:
                zzigVar.R(((Long) obj).longValue());
                return;
            case 5:
                zzigVar.L(((Integer) obj).intValue());
                return;
            case 6:
                zzigVar.u(((Long) obj).longValue());
                return;
            case 7:
                zzigVar.m(((Integer) obj).intValue());
                return;
            case 8:
                zzigVar.S(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzkj) obj).b(zzigVar);
                return;
            case 10:
                zzigVar.w((zzkj) obj);
                return;
            case 11:
                if (obj instanceof zzhm) {
                    zzigVar.v((zzhm) obj);
                    return;
                } else {
                    zzigVar.x((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzhm) {
                    zzigVar.v((zzhm) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzigVar.T(bArr, 0, bArr.length);
                return;
            case 13:
                zzigVar.Z(((Integer) obj).intValue());
                return;
            case 14:
                zzigVar.m(((Integer) obj).intValue());
                return;
            case 15:
                zzigVar.u(((Long) obj).longValue());
                return;
            case 16:
                zzigVar.C0(((Integer) obj).intValue());
                return;
            case 17:
                zzigVar.w0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjc) {
                    zzigVar.L(((zzjc) obj).a());
                    return;
                } else {
                    zzigVar.L(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static <T extends zzis<T>> zziq<T> j() {
        return d;
    }

    public static boolean m(Object obj) {
        if (obj instanceof zzkl) {
            return ((zzkl) obj).f();
        }
        if (obj instanceof zzjj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjc) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if ((r4 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjj) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(T t, Object obj) {
        zzmn b = t.b();
        zziz.e(obj);
        boolean z = true;
        switch (zzip.a[b.e().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzhm)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzkj)) {
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.a()), t.b().e(), obj.getClass().getName()));
    }

    public static <T extends zzis<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == zzmx.MESSAGE) {
            if (key.d()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!m(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return m(entry.getValue());
        }
        return true;
    }

    public final int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.g(); i2++) {
            i += e(this.a.i(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.k()) {
            i += e(entry);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zziq zziqVar = new zziq();
        for (int i = 0; i < this.a.g(); i++) {
            Map.Entry<T, Object> i2 = this.a.i(i);
            zziqVar.k(i2.getKey(), i2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.k()) {
            zziqVar.k(entry.getKey(), entry.getValue());
        }
        zziqVar.c = this.c;
        return zziqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziq)) {
            return false;
        }
        return this.a.equals(((zziq) obj).a);
    }

    public final Object f(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof zzjj) {
            return zzjj.e();
        }
        return obj;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(zziq<T> zziqVar) {
        for (int i = 0; i < zziqVar.a.g(); i++) {
            l(zziqVar.a.i(i));
        }
        for (Map.Entry<T, Object> entry : zziqVar.a.k()) {
            l(entry);
        }
    }

    public final void k(T t, Object obj) {
        if (t.d()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    o(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            o(t, obj);
        }
        if (obj instanceof zzjj) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public final void l(Map.Entry<T, Object> entry) {
        zzkj e0;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzjj) {
            value = zzjj.e();
        }
        if (key.d()) {
            Object f = f(key);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) f).add(g(obj));
            }
            this.a.put(key, f);
        } else if (key.c() == zzmx.MESSAGE) {
            Object f2 = f(key);
            if (f2 == null) {
                this.a.put(key, g(value));
                return;
            }
            if (f2 instanceof zzks) {
                e0 = key.U0((zzks) f2, (zzks) value);
            } else {
                e0 = key.V3(((zzkj) f2).c(), (zzkj) value).e0();
            }
            this.a.put(key, e0);
        } else {
            this.a.put(key, g(value));
        }
    }

    public final Iterator<Map.Entry<T, Object>> n() {
        if (this.c) {
            return new zzjo(this.a.n().iterator());
        }
        return this.a.n().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> q() {
        if (this.c) {
            return new zzjo(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final void r() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.g(); i++) {
            Map.Entry<T, Object> i2 = this.a.i(i);
            if (i2.getValue() instanceof zzix) {
                ((zzix) i2.getValue()).C();
            }
        }
        this.a.f();
        this.b = true;
    }

    public final boolean s() {
        return this.b;
    }

    public final boolean t() {
        for (int i = 0; i < this.a.g(); i++) {
            if (!p(this.a.i(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.k()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public zziq(zzlg<T, Object> zzlgVar) {
        this.a = zzlgVar;
        r();
    }

    public zziq(boolean z) {
        this(zzlg.b(0));
        r();
    }
}
