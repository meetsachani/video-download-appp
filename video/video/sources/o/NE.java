package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.IM2;
import o.NN2;
import o.O71;

/* loaded from: classes.dex */
public final class NE implements NN2 {
    public final ME a;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.e1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.d1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.b1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IM2.b.l1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IM2.b.n1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IM2.b.j1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IM2.b.c1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IM2.b.Z0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IM2.b.m1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IM2.b.o1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IM2.b.a1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IM2.b.f1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public NE(ME me) {
        ME me2 = (ME) C9740tS0.e(me, "output");
        this.a = me2;
        me2.a = this;
    }

    public static NE T(ME me) {
        NE ne = me.a;
        if (ne != null) {
            return ne;
        }
        return new NE(me);
    }

    private void a0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.a.g(i, (String) obj);
        } else {
            this.a.e(i, (AbstractC8616os) obj);
        }
    }

    @Override // o.NN2
    public void A(int i, Object obj) throws IOException {
        this.a.L1(i, (InterfaceC3540Li1) obj);
    }

    @Override // o.NN2
    public void B(int i, long j) throws IOException {
        this.a.B(i, j);
    }

    @Override // o.NN2
    public void C(int i, boolean z) throws IOException {
        this.a.C(i, z);
    }

    @Override // o.NN2
    public void D(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            i(i, list.get(i2), interfaceC9026qY1);
        }
    }

    @Override // o.NN2
    public void E(int i, int i2) throws IOException {
        this.a.E(i, i2);
    }

    @Override // o.NN2
    public void F(int i) throws IOException {
        this.a.g2(i, 3);
    }

    @Override // o.NN2
    public void G(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.p0(list.get(i4).longValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.D1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.x(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.O0(list.get(i4).intValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.b2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.E(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void I(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.b0(list.get(i4).booleanValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.t1(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.C(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void J(int i, Object obj) throws IOException {
        this.a.F1(i, (InterfaceC3540Li1) obj);
    }

    @Override // o.NN2
    public <K, V> void K(int i, O71.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.a.h1()) {
            Y(i, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.g2(i, 2);
            this.a.h2(O71.b(bVar, entry.getKey(), entry.getValue()));
            O71.l(this.a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // o.NN2
    public void L(int i, float f) throws IOException {
        this.a.L(i, f);
    }

    @Override // o.NN2
    public void M(int i) throws IOException {
        this.a.g2(i, 4);
    }

    @Override // o.NN2
    public void N(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.S0(list.get(i4).intValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.d2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.R(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void O(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // o.NN2
    public void P(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.z0(list.get(i4).longValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.K1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.B(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void Q(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.j0(list.get(i4).doubleValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.A1(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.u(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void R(int i, int i2) throws IOException {
        this.a.R(i, i2);
    }

    @Override // o.NN2
    public void S(int i, List<AbstractC8616os> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.e(i, list.get(i2));
        }
    }

    public int U() {
        return this.a.f1();
    }

    public final <V> void V(int i, boolean z, V v, O71.b<Boolean, V> bVar) throws IOException {
        this.a.g2(i, 2);
        this.a.h2(O71.b(bVar, Boolean.valueOf(z), v));
        O71.l(this.a, bVar, Boolean.valueOf(z), v);
    }

    public final <V> void W(int i, O71.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.a.g2(i, 2);
            this.a.h2(O71.b(bVar, Integer.valueOf(i4), v));
            O71.l(this.a, bVar, Integer.valueOf(i4), v);
        }
    }

    public final <V> void X(int i, O71.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long l : map.keySet()) {
            jArr[i2] = l.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.a.g2(i, 2);
            this.a.h2(O71.b(bVar, Long.valueOf(j), v));
            O71.l(this.a, bVar, Long.valueOf(j), v);
        }
    }

    public final <K, V> void Y(int i, O71.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.a[bVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    V(i, false, v, bVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    V(i, true, v2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                W(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                X(i, bVar, map);
                return;
            case 12:
                Z(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.a);
        }
    }

    public final <V> void Z(int i, O71.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.a.g2(i, 2);
            this.a.h2(O71.b(bVar, str2, v));
            O71.l(this.a, bVar, str2, v);
        }
    }

    @Override // o.NN2
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.r0(list.get(i4).floatValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.E1(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.L(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // o.NN2
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC8616os) {
            this.a.Y1(i, (AbstractC8616os) obj);
        } else {
            this.a.P1(i, (InterfaceC3540Li1) obj);
        }
    }

    @Override // o.NN2
    public void c(int i, int i2) throws IOException {
        this.a.c(i, i2);
    }

    @Override // o.NN2
    public void d(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            J(i, list.get(i2));
        }
    }

    @Override // o.NN2
    public void e(int i, AbstractC8616os abstractC8616os) throws IOException {
        this.a.e(i, abstractC8616os);
    }

    @Override // o.NN2
    public void f(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC6581gZ0) {
            InterfaceC6581gZ0 interfaceC6581gZ0 = (InterfaceC6581gZ0) list;
            while (i2 < list.size()) {
                a0(i, interfaceC6581gZ0.w5(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.g(i, list.get(i2));
            i2++;
        }
    }

    @Override // o.NN2
    public void g(int i, String str) throws IOException {
        this.a.g(i, str);
    }

    @Override // o.NN2
    public void h(int i, long j) throws IOException {
        this.a.h(i, j);
    }

    @Override // o.NN2
    public void i(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        this.a.M1(i, (InterfaceC3540Li1) obj, interfaceC9026qY1);
    }

    @Override // o.NN2
    public void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.x0(list.get(i4).intValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.J1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.l(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void k(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            t(i, list.get(i2), interfaceC9026qY1);
        }
    }

    @Override // o.NN2
    public void l(int i, int i2) throws IOException {
        this.a.l(i, i2);
    }

    @Override // o.NN2
    public void m(int i, long j) throws IOException {
        this.a.m(i, j);
    }

    @Override // o.NN2
    public void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.n0(list.get(i4).intValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.C1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.Z0(list.get(i4).intValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.h2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.s(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void p(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.U0(list.get(i4).longValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.e2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.q(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void q(int i, long j) throws IOException {
        this.a.q(i, j);
    }

    @Override // o.NN2
    public void r(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.l0(list.get(i4).intValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.B1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void s(int i, int i2) throws IOException {
        this.a.s(i, i2);
    }

    @Override // o.NN2
    public void t(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        this.a.G1(i, (InterfaceC3540Li1) obj, interfaceC9026qY1);
    }

    @Override // o.NN2
    public void u(int i, double d) throws IOException {
        this.a.u(i, d);
    }

    @Override // o.NN2
    public void v(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.Q0(list.get(i4).longValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.c2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.m(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void w(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ME.b1(list.get(i4).longValue());
            }
            this.a.h2(i3);
            while (i2 < list.size()) {
                this.a.i2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.NN2
    public void x(int i, long j) throws IOException {
        this.a.x(i, j);
    }

    @Override // o.NN2
    public NN2.a y() {
        return NN2.a.ASCENDING;
    }

    @Override // o.NN2
    public void z(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            A(i, list.get(i2));
        }
    }
}
