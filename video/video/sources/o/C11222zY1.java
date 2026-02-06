package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import o.C11040yo0;
import o.C9740tS0;

/* renamed from: o.zY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11222zY1 {
    public static final Class<?> a = D();
    public static final AbstractC10645xA2<?, ?> b = F(false);
    public static final AbstractC10645xA2<?, ?> c = F(true);
    public static final AbstractC10645xA2<?, ?> d = new C11131zA2();
    public static final int e = 40;

    public static int A(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.b1(b41.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.b1(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static void A0(int i, String str, NN2 nn2) throws IOException {
        if (str != null && !str.isEmpty()) {
            nn2.g(i, str);
        }
    }

    public static <UT, UB> UB B(int i, List<Integer> list, C9740tS0.d<?> dVar, UB ub, AbstractC10645xA2<UT, UB> abstractC10645xA2) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int intValue = num.intValue();
                if (dVar.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) Q(i, intValue, ub, abstractC10645xA2);
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
            if (dVar.a(intValue2) == null) {
                ub = (UB) Q(i, intValue2, ub, abstractC10645xA2);
                it.remove();
            }
        }
        return ub;
    }

    public static void B0(int i, List<String> list, NN2 nn2) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.f(i, list);
        }
    }

    public static <UT, UB> UB C(int i, List<Integer> list, C9740tS0.e eVar, UB ub, AbstractC10645xA2<UT, UB> abstractC10645xA2) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int intValue = num.intValue();
                if (eVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) Q(i, intValue, ub, abstractC10645xA2);
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
            if (!eVar.a(intValue2)) {
                ub = (UB) Q(i, intValue2, ub, abstractC10645xA2);
                it.remove();
            }
        }
        return ub;
    }

    public static void C0(int i, int i2, NN2 nn2) throws IOException {
        if (i2 != 0) {
            nn2.s(i, i2);
        }
    }

    public static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D0(int i, List<Integer> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.o(i, list, z);
        }
    }

    public static Object E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return TB2.Q(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static void E0(int i, long j, NN2 nn2) throws IOException {
        if (j != 0) {
            nn2.h(i, j);
        }
    }

    public static AbstractC10645xA2<?, ?> F(boolean z) {
        try {
            Class<?> G = G();
            if (G == null) {
                return null;
            }
            return (AbstractC10645xA2) G.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F0(int i, List<Long> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.w(i, list, z);
        }
    }

    public static Class<?> G() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends C11040yo0.c<FT>> void H(AbstractC3249Ij0<FT> abstractC3249Ij0, T t, T t2) {
        C11040yo0<FT> c2 = abstractC3249Ij0.c(t2);
        if (!c2.C()) {
            abstractC3249Ij0.d(t).J(c2);
        }
    }

    public static <T> void I(R71 r71, T t, T t2, long j) {
        TB2.q0(t, j, r71.a(TB2.O(t, j), TB2.O(t2, j)));
    }

    public static <T, UT, UB> void J(AbstractC10645xA2<UT, UB> abstractC10645xA2, T t, T t2) {
        abstractC10645xA2.p(t, abstractC10645xA2.k(abstractC10645xA2.g(t), abstractC10645xA2.g(t2)));
    }

    public static AbstractC10645xA2<?, ?> K() {
        return b;
    }

    public static AbstractC10645xA2<?, ?> L() {
        return c;
    }

    public static void M(Class<?> cls) {
        Class<?> cls2;
        if (!IC0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean N(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean O(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i2 - i;
        long j2 = i3;
        if (j + 10 <= (2 * j2) + 3 + ((j2 + 3) * 3)) {
            return true;
        }
        return false;
    }

    public static boolean P(C5415bo0[] c5415bo0Arr) {
        if (c5415bo0Arr.length == 0) {
            return false;
        }
        return O(c5415bo0Arr[0].u(), c5415bo0Arr[c5415bo0Arr.length - 1].u(), c5415bo0Arr.length);
    }

    public static <UT, UB> UB Q(int i, int i2, UB ub, AbstractC10645xA2<UT, UB> abstractC10645xA2) {
        if (ub == null) {
            ub = abstractC10645xA2.n();
        }
        abstractC10645xA2.e(ub, i, i2);
        return ub;
    }

    public static String R(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ('a' <= charAt && charAt <= 'z') {
                if (z) {
                    sb.append((char) (charAt - ' '));
                } else {
                    sb.append(charAt);
                }
            } else if ('A' <= charAt && charAt <= 'Z') {
                if (i == 0 && !z) {
                    sb.append((char) (charAt + ' '));
                } else {
                    sb.append(charAt);
                }
            } else {
                if ('0' <= charAt && charAt <= '9') {
                    sb.append(charAt);
                }
                z = true;
            }
            z = false;
        }
        return sb.toString();
    }

    public static AbstractC10645xA2<?, ?> S() {
        return d;
    }

    public static void T(int i, boolean z, NN2 nn2) throws IOException {
        if (z) {
            nn2.C(i, true);
        }
    }

    public static void U(int i, List<Boolean> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.I(i, list, z);
        }
    }

    public static void V(int i, AbstractC8616os abstractC8616os, NN2 nn2) throws IOException {
        if (abstractC8616os != null && !abstractC8616os.isEmpty()) {
            nn2.e(i, abstractC8616os);
        }
    }

    public static void W(int i, List<AbstractC8616os> list, NN2 nn2) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.S(i, list);
        }
    }

    public static void X(int i, double d2, NN2 nn2) throws IOException {
        if (Double.compare(d2, 0.0d) != 0) {
            nn2.u(i, d2);
        }
    }

    public static void Y(int i, List<Double> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.Q(i, list, z);
        }
    }

    public static void Z(int i, int i2, NN2 nn2) throws IOException {
        if (i2 != 0) {
            nn2.O(i, i2);
        }
    }

    public static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return ME.X0(i) + ME.D0(size);
        }
        return size * ME.a0(i, true);
    }

    public static void a0(int i, List<Integer> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.r(i, list, z);
        }
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, int i2, NN2 nn2) throws IOException {
        if (i2 != 0) {
            nn2.c(i, i2);
        }
    }

    public static int c(int i, List<AbstractC8616os> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = size * ME.X0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X0 += ME.h0(list.get(i2));
        }
        return X0;
    }

    public static void c0(int i, List<Integer> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.n(i, list, z);
        }
    }

    public static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = e(list);
        if (z) {
            return ME.X0(i) + ME.D0(e2);
        }
        return e2 + (size * ME.X0(i));
    }

    public static void d0(int i, long j, NN2 nn2) throws IOException {
        if (j != 0) {
            nn2.x(i, j);
        }
    }

    public static int e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.l0(c6299fR0.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.l0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static void e0(int i, List<Long> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.G(i, list, z);
        }
    }

    public static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return ME.X0(i) + ME.D0(size * 4);
        }
        return size * ME.m0(i, 0);
    }

    public static void f0(int i, float f, NN2 nn2) throws IOException {
        if (Float.compare(f, 0.0f) != 0) {
            nn2.L(i, f);
        }
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int i, List<Float> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.a(i, list, z);
        }
    }

    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return ME.X0(i) + ME.D0(size * 8);
        }
        return size * ME.o0(i, 0L);
    }

    public static void h0(int i, List<?> list, NN2 nn2) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.d(i, list);
        }
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int i, List<?> list, NN2 nn2, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.k(i, list, interfaceC9026qY1);
        }
    }

    public static int j(int i, List<InterfaceC3540Li1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ME.s0(i, list.get(i3));
        }
        return i2;
    }

    public static void j0(int i, int i2, NN2 nn2) throws IOException {
        if (i2 != 0) {
            nn2.l(i, i2);
        }
    }

    public static int k(int i, List<InterfaceC3540Li1> list, InterfaceC9026qY1 interfaceC9026qY1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ME.t0(i, list.get(i3), interfaceC9026qY1);
        }
        return i2;
    }

    public static void k0(int i, List<Integer> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.j(i, list, z);
        }
    }

    public static int l(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = m(list);
        if (z) {
            return ME.X0(i) + ME.D0(m);
        }
        return m + (size * ME.X0(i));
    }

    public static void l0(int i, long j, NN2 nn2) throws IOException {
        if (j != 0) {
            nn2.B(i, j);
        }
    }

    public static int m(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.x0(c6299fR0.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.x0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static void m0(int i, List<Long> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.P(i, list, z);
        }
    }

    public static int n(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int o2 = o(list);
        if (z) {
            return ME.X0(i) + ME.D0(o2);
        }
        return o2 + (list.size() * ME.X0(i));
    }

    public static void n0(int i, List<?> list, NN2 nn2) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((PY0) it.next()).o(nn2, i);
            }
        }
    }

    public static int o(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.z0(b41.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.z0(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static void o0(int i, Object obj, NN2 nn2) throws IOException {
        if (obj != null) {
            nn2.A(i, obj);
        }
    }

    public static int p(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) {
        if (obj instanceof PY0) {
            return ME.B0(i, (PY0) obj);
        }
        return ME.G0(i, (InterfaceC3540Li1) obj, interfaceC9026qY1);
    }

    public static void p0(int i, List<?> list, NN2 nn2) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.z(i, list);
        }
    }

    public static int q(int i, List<?> list) {
        int H0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = ME.X0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof PY0) {
                H0 = ME.C0((PY0) obj);
            } else {
                H0 = ME.H0((InterfaceC3540Li1) obj);
            }
            X0 += H0;
        }
        return X0;
    }

    public static void q0(int i, List<?> list, NN2 nn2, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.D(i, list, interfaceC9026qY1);
        }
    }

    public static int r(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) {
        int I0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = ME.X0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof PY0) {
                I0 = ME.C0((PY0) obj);
            } else {
                I0 = ME.I0((InterfaceC3540Li1) obj, interfaceC9026qY1);
            }
            X0 += I0;
        }
        return X0;
    }

    public static void r0(int i, int i2, NN2 nn2) throws IOException {
        if (i2 != 0) {
            nn2.E(i, i2);
        }
    }

    public static int s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        if (z) {
            return ME.X0(i) + ME.D0(t);
        }
        return t + (size * ME.X0(i));
    }

    public static void s0(int i, List<Integer> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.H(i, list, z);
        }
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.S0(c6299fR0.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.S0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static void t0(int i, long j, NN2 nn2) throws IOException {
        if (j != 0) {
            nn2.m(i, j);
        }
    }

    public static int u(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = v(list);
        if (z) {
            return ME.X0(i) + ME.D0(v);
        }
        return v + (size * ME.X0(i));
    }

    public static void u0(int i, List<Long> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.v(i, list, z);
        }
    }

    public static int v(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B41) {
            B41 b41 = (B41) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.U0(b41.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.U0(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static void v0(int i, int i2, NN2 nn2) throws IOException {
        if (i2 != 0) {
            nn2.R(i, i2);
        }
    }

    public static int w(int i, List<?> list) {
        int W0;
        int W02;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = ME.X0(i) * size;
        if (list instanceof InterfaceC6581gZ0) {
            InterfaceC6581gZ0 interfaceC6581gZ0 = (InterfaceC6581gZ0) list;
            while (i2 < size) {
                Object w5 = interfaceC6581gZ0.w5(i2);
                if (w5 instanceof AbstractC8616os) {
                    W02 = ME.h0((AbstractC8616os) w5);
                } else {
                    W02 = ME.W0((String) w5);
                }
                X0 += W02;
                i2++;
            }
            return X0;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof AbstractC8616os) {
                W0 = ME.h0((AbstractC8616os) obj);
            } else {
                W0 = ME.W0((String) obj);
            }
            X0 += W0;
            i2++;
        }
        return X0;
    }

    public static void w0(int i, List<Integer> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.N(i, list, z);
        }
    }

    public static int x(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        if (z) {
            return ME.X0(i) + ME.D0(y);
        }
        return y + (size * ME.X0(i));
    }

    public static void x0(int i, long j, NN2 nn2) throws IOException {
        if (j != 0) {
            nn2.q(i, j);
        }
    }

    public static int y(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6299fR0) {
            C6299fR0 c6299fR0 = (C6299fR0) list;
            int i2 = 0;
            while (i < size) {
                i2 += ME.Z0(c6299fR0.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ME.Z0(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static void y0(int i, List<Long> list, NN2 nn2, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            nn2.p(i, list, z);
        }
    }

    public static int z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = A(list);
        if (z) {
            return ME.X0(i) + ME.D0(A);
        }
        return A + (size * ME.X0(i));
    }

    public static void z0(int i, Object obj, NN2 nn2) throws IOException {
        if (obj instanceof String) {
            A0(i, (String) obj, nn2);
        } else {
            V(i, (AbstractC8616os) obj, nn2);
        }
    }
}
