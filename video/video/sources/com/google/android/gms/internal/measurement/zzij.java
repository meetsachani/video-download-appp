package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzij implements zzmw {
    public final zzig a;

    public zzij(zzig zzigVar) {
        zzig zzigVar2 = (zzig) zziz.f(zzigVar, "output");
        this.a = zzigVar2;
        zzigVar2.a = this;
    }

    public static zzij N(zzig zzigVar) {
        zzij zzijVar = zzigVar.a;
        if (zzijVar != null) {
            return zzijVar;
        }
        return new zzij(zzigVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzjp) {
            zzjp zzjpVar = (zzjp) list;
            while (i2 < list.size()) {
                Object z = zzjpVar.z(i2);
                if (z instanceof String) {
                    this.a.s(i, (String) z);
                } else {
                    this.a.p(i, (zzhm) z);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.s(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void B(int i, int i2) throws IOException {
        this.a.n(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void C(int i, List<?> list, zzlb zzlbVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            v(i, list.get(i2), zzlbVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void D(int i, Object obj, zzlb zzlbVar) throws IOException {
        zzig zzigVar = this.a;
        zzigVar.a0(i, 3);
        zzlbVar.h((zzkj) obj, zzigVar.a);
        zzigVar.a0(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void E(int i, List<zzhm> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.p(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void F(int i, List<?> list, zzlb zzlbVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            D(i, list.get(i2), zzlbVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void G(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.p0(list.get(i4).intValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.f0(list.get(i4).longValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.t0(list.get(i4).intValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.C0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.D0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void J(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.X(list.get(i4).longValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.o(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void K(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.h0(list.get(i4).intValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final <K, V> void L(int i, zzke<K, V> zzkeVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.a0(i, 2);
            this.a.Z(zzkb.a(zzkeVar, entry.getKey(), entry.getValue()));
            zzkb.b(this.a, zzkeVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void M(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.d(list.get(i4).floatValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.K(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.N(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final int a() {
        return zzmz.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void b(int i, long j) throws IOException {
        this.a.o(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.c0(list.get(i4).intValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void c0(int i, long j) throws IOException {
        this.a.v0(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void d(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.s0(list.get(i4).longValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.o0(list.get(i4).longValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.w0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.v0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void g(int i, String str) throws IOException {
        this.a.s(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void g0(int i, int i2) throws IOException {
        this.a.D0(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void h(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.k0(list.get(i4).longValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.o(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.l0(list.get(i4).intValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void j(int i, boolean z) throws IOException {
        this.a.t(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void k(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void l(int i, int i2) throws IOException {
        this.a.n(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void m(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.j(list.get(i4).booleanValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.S(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.t(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void n(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void o(int i, long j) throws IOException {
        this.a.o(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void p(int i, Object obj) throws IOException {
        if (obj instanceof zzhm) {
            this.a.Q(i, (zzhm) obj);
        } else {
            this.a.q(i, (zzkj) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void q(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.c(list.get(i4).doubleValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.J(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.M(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void r(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void s(int i, double d) throws IOException {
        this.a.M(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void t(int i, float f) throws IOException {
        this.a.N(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    @Deprecated
    public final void u(int i) throws IOException {
        this.a.a0(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void v(int i, Object obj, zzlb zzlbVar) throws IOException {
        this.a.r(i, (zzkj) obj, zzlbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void w(int i, zzhm zzhmVar) throws IOException {
        this.a.p(i, zzhmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void x(int i, int i2) throws IOException {
        this.a.g0(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzig.A0(list.get(i4).intValue());
            }
            this.a.Z(i3);
            while (i2 < list.size()) {
                this.a.Z(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    @Deprecated
    public final void z(int i) throws IOException {
        this.a.a0(i, 3);
    }
}
