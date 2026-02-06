package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzgxy implements zzhbx {
    public final zzgxx a;

    public zzgxy(zzgxx zzgxxVar) {
        zzgzf.c(zzgxxVar, "output");
        this.a = zzgxxVar;
        zzgxxVar.a = this;
    }

    public static zzgxy a(zzgxx zzgxxVar) {
        zzgxy zzgxyVar = zzgxxVar.a;
        if (zzgxyVar != null) {
            return zzgxyVar;
        }
        return new zzgxy(zzgxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void A(int i, Object obj, zzhaw zzhawVar) throws IOException {
        this.a.u(i, (zzhad) obj, zzhawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void B(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgytVar.size(); i4++) {
                    i3 += zzgxx.e(zzgytVar.A0(i4));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgytVar.size()) {
                    zzgxxVar.A(zzgytVar.A0(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgytVar.size()) {
                this.a.z(i, zzgytVar.A0(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgxx.e(((Integer) list.get(i6)).intValue());
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.A(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void C(int i, long j) throws IOException {
        this.a.q(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void D(int i, int i2) throws IOException {
        this.a.s(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void E(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgytVar.size(); i4++) {
                    int A0 = zzgytVar.A0(i4);
                    i3 += zzgxx.e((A0 >> 31) ^ (A0 + A0));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgytVar.size()) {
                    int A02 = zzgytVar.A0(i2);
                    zzgxxVar.A((A02 >> 31) ^ (A02 + A02));
                    i2++;
                }
                return;
            }
            while (i2 < zzgytVar.size()) {
                zzgxx zzgxxVar2 = this.a;
                int A03 = zzgytVar.A0(i2);
                zzgxxVar2.z(i, (A03 >> 31) ^ (A03 + A03));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar3 = this.a;
            zzgxxVar3.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                i5 += zzgxx.e((intValue >> 31) ^ (intValue + intValue));
            }
            zzgxxVar3.A(i5);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzgxxVar3.A((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zzgxx zzgxxVar4 = this.a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzgxxVar4.z(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void F(int i, zzgxk zzgxkVar) throws IOException {
        this.a.m(i, zzgxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void G(int i, float f) throws IOException {
        this.a.o(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void H(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzsVar.size(); i4++) {
                    i3 += zzgxx.f(zzgzsVar.u(i4));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgzsVar.size()) {
                    zzgxxVar.C(zzgzsVar.u(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzsVar.size()) {
                this.a.B(i, zzgzsVar.u(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgxx.f(((Long) list.get(i6)).longValue());
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.C(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void I(int i, Object obj) throws IOException {
        if (obj instanceof zzgxk) {
            this.a.w(i, (zzgxk) obj);
        } else {
            this.a.v(i, (zzhad) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void J(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzsVar.size(); i4++) {
                    long u = zzgzsVar.u(i4);
                    i3 += zzgxx.f((u >> 63) ^ (u + u));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgzsVar.size()) {
                    long u2 = zzgzsVar.u(i2);
                    zzgxxVar.C((u2 >> 63) ^ (u2 + u2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzsVar.size()) {
                zzgxx zzgxxVar2 = this.a;
                long u3 = zzgzsVar.u(i2);
                zzgxxVar2.B(i, (u3 >> 63) ^ (u3 + u3));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar3 = this.a;
            zzgxxVar3.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long longValue = ((Long) list.get(i6)).longValue();
                i5 += zzgxx.f((longValue >> 63) ^ (longValue + longValue));
            }
            zzgxxVar3.A(i5);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzgxxVar3.C((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zzgxx zzgxxVar4 = this.a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzgxxVar4.B(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void K(int i, long j) throws IOException {
        this.a.q(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void L(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzp) {
            zzgzp zzgzpVar = (zzgzp) list;
            while (i2 < list.size()) {
                Object c = zzgzpVar.c();
                if (c instanceof String) {
                    this.a.x(i, (String) c);
                } else {
                    this.a.m(i, (zzgxk) c);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.x(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void M(int i, long j) throws IOException {
        this.a.B(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    @Deprecated
    public final void W(int i) throws IOException {
        this.a.y(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxa) {
            zzgxa zzgxaVar = (zzgxa) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxaVar.size(); i4++) {
                    zzgxaVar.h(i4);
                    i3++;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgxaVar.size()) {
                    zzgxxVar.k(zzgxaVar.h(i2) ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < zzgxaVar.size()) {
                this.a.l(i, zzgxaVar.h(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Boolean) list.get(i6)).getClass();
                i5++;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.k(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void d(int i, int i2) throws IOException {
        this.a.s(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzsVar.size(); i4++) {
                    zzgzsVar.u(i4);
                    i3 += 8;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgzsVar.size()) {
                    zzgxxVar.r(zzgzsVar.u(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzsVar.size()) {
                this.a.q(i, zzgzsVar.u(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).getClass();
                i5 += 8;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.r(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void f(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgytVar.size(); i4++) {
                    zzgytVar.A0(i4);
                    i3 += 4;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgytVar.size()) {
                    zzgxxVar.p(zzgytVar.A0(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgytVar.size()) {
                this.a.o(i, zzgytVar.A0(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void h(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgytVar.size(); i4++) {
                    i3 += zzgxx.f(zzgytVar.A0(i4));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgytVar.size()) {
                    zzgxxVar.t(zzgytVar.A0(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgytVar.size()) {
                this.a.s(i, zzgytVar.A0(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgxx.f(((Integer) list.get(i6)).intValue());
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxzVar.size(); i4++) {
                    zzgxzVar.e(i4);
                    i3 += 8;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgxzVar.size()) {
                    zzgxxVar.r(Double.doubleToRawLongBits(zzgxzVar.e(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxzVar.size()) {
                this.a.q(i, Double.doubleToRawLongBits(zzgxzVar.e(i2)));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Double) list.get(i6)).getClass();
                i5 += 8;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.r(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.q(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void j(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.m(i, (zzgxk) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void k(int i, String str) throws IOException {
        this.a.x(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void l(int i, boolean z) throws IOException {
        this.a.l(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void m(int i, long j) throws IOException {
        this.a.B(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzsVar.size(); i4++) {
                    zzgzsVar.u(i4);
                    i3 += 8;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgzsVar.size()) {
                    zzgxxVar.r(zzgzsVar.u(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzsVar.size()) {
                this.a.q(i, zzgzsVar.u(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).getClass();
                i5 += 8;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.r(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void o(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgytVar.size(); i4++) {
                    i3 += zzgxx.f(zzgytVar.A0(i4));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgytVar.size()) {
                    zzgxxVar.t(zzgytVar.A0(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgytVar.size()) {
                this.a.s(i, zzgytVar.A0(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgxx.f(((Integer) list.get(i6)).intValue());
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void p(int i, double d) throws IOException {
        this.a.q(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void q(int i, long j) throws IOException {
        this.a.B(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzsVar.size(); i4++) {
                    i3 += zzgxx.f(zzgzsVar.u(i4));
                }
                zzgxxVar.A(i3);
                while (i2 < zzgzsVar.size()) {
                    zzgxxVar.C(zzgzsVar.u(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzsVar.size()) {
                this.a.B(i, zzgzsVar.u(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgxx.f(((Long) list.get(i6)).longValue());
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.C(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void s(int i, int i2) throws IOException {
        this.a.o(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyj) {
            zzgyj zzgyjVar = (zzgyj) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyjVar.size(); i4++) {
                    zzgyjVar.e(i4);
                    i3 += 4;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgyjVar.size()) {
                    zzgxxVar.p(Float.floatToRawIntBits(zzgyjVar.e(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyjVar.size()) {
                this.a.o(i, Float.floatToRawIntBits(zzgyjVar.e(i2)));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Float) list.get(i6)).getClass();
                i5 += 4;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.p(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.o(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void u(int i, int i2) throws IOException {
        this.a.z(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void v(int i, Object obj, zzhaw zzhawVar) throws IOException {
        zzgxx zzgxxVar = this.a;
        zzgxxVar.y(i, 3);
        zzhawVar.g((zzhad) obj, zzgxxVar.a);
        zzgxxVar.y(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    @Deprecated
    public final void w(int i) throws IOException {
        this.a.y(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void x(int i, int i2) throws IOException {
        this.a.z(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            if (z) {
                zzgxx zzgxxVar = this.a;
                zzgxxVar.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgytVar.size(); i4++) {
                    zzgytVar.A0(i4);
                    i3 += 4;
                }
                zzgxxVar.A(i3);
                while (i2 < zzgytVar.size()) {
                    zzgxxVar.p(zzgytVar.A0(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgytVar.size()) {
                this.a.o(i, zzgytVar.A0(i2));
                i2++;
            }
        } else if (z) {
            zzgxx zzgxxVar2 = this.a;
            zzgxxVar2.y(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            zzgxxVar2.A(i5);
            while (i2 < list.size()) {
                zzgxxVar2.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void z(int i, int i2) throws IOException {
        this.a.o(i, i2);
    }
}
