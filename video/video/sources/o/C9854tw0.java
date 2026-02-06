package o;

import java.util.HashMap;
import o.C8068mc2;

/* renamed from: o.tw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9854tw0 extends C9210rH0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public C3785Nv0 q0;
    public HashMap<String, Float> r0;
    public HashMap<String, Float> s0;
    public HashMap<String, Float> t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public C9854tw0(C8068mc2 c8068mc2, C8068mc2.d dVar) {
        super(c8068mc2, dVar);
        this.u0 = 0;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.B0 = 2;
        this.C0 = 2;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = -1;
        this.K0 = 0;
        this.L0 = 0.5f;
        this.M0 = 0.5f;
        this.N0 = 0.5f;
        this.O0 = 0.5f;
        if (dVar == C8068mc2.d.VERTICAL_FLOW) {
            this.K0 = 1;
        }
    }

    public void A1(int i) {
        this.E0 = i;
    }

    public void B1(int i) {
        this.y0 = i;
    }

    public void C1(float f) {
        this.O0 = f;
    }

    public void D1(int i) {
        this.A0 = i;
    }

    public void E1(float f) {
        this.M0 = f;
    }

    public void F1(int i) {
        this.x0 = i;
    }

    public void G1(int i) {
        this.J0 = i;
    }

    public void H1(int i) {
        this.K0 = i;
    }

    public void I1(int i) {
        this.I0 = i;
    }

    public void J1(int i) {
        this.F0 = i;
    }

    public void K1(int i) {
        this.G0 = i;
    }

    public void L1(int i) {
        this.H0 = i;
    }

    public void M1(int i) {
        this.B0 = i;
    }

    public void N1(int i) {
        this.D0 = i;
    }

    public void O1(int i) {
        this.v0 = i;
    }

    public void P1(int i) {
        this.u0 = i;
    }

    @Override // o.C9210rH0
    public C9696tH0 R0() {
        if (this.q0 == null) {
            this.q0 = new C3785Nv0();
        }
        return this.q0;
    }

    @Override // o.C9210rH0
    public void T0(C9696tH0 c9696tH0) {
        if (c9696tH0 instanceof C3785Nv0) {
            this.q0 = (C3785Nv0) c9696tH0;
        } else {
            this.q0 = null;
        }
    }

    public void U0(String str, float f, float f2, float f3) {
        super.P0(str);
        if (!Float.isNaN(f)) {
            if (this.r0 == null) {
                this.r0 = new HashMap<>();
            }
            this.r0.put(str, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            if (this.s0 == null) {
                this.s0 = new HashMap<>();
            }
            this.s0.put(str, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            if (this.t0 == null) {
                this.t0 = new HashMap<>();
            }
            this.t0.put(str, Float.valueOf(f3));
        }
    }

    public float V0() {
        return this.N0;
    }

    public int W0() {
        return this.z0;
    }

    public float X0() {
        return this.L0;
    }

    public int Y0() {
        return this.w0;
    }

    public int Z0() {
        return this.C0;
    }

    public float a1() {
        return this.i;
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        R0();
        b(this.q0);
        this.q0.y3(this.K0);
        this.q0.D3(this.u0);
        int i = this.J0;
        if (i != -1) {
            this.q0.x3(i);
        }
        int i2 = this.F0;
        if (i2 != 0) {
            this.q0.F2(i2);
        }
        int i3 = this.H0;
        if (i3 != 0) {
            this.q0.I2(i3);
        }
        int i4 = this.G0;
        if (i4 != 0) {
            this.q0.G2(i4);
        }
        int i5 = this.I0;
        if (i5 != 0) {
            this.q0.D2(i5);
        }
        int i6 = this.E0;
        if (i6 != 0) {
            this.q0.r3(i6);
        }
        int i7 = this.D0;
        if (i7 != 0) {
            this.q0.B3(i7);
        }
        float f = this.i;
        if (f != 0.5f) {
            this.q0.q3(f);
        }
        float f2 = this.N0;
        if (f2 != 0.5f) {
            this.q0.l3(f2);
        }
        float f3 = this.O0;
        if (f3 != 0.5f) {
            this.q0.t3(f3);
        }
        float f4 = this.j;
        if (f4 != 0.5f) {
            this.q0.A3(f4);
        }
        float f5 = this.L0;
        if (f5 != 0.5f) {
            this.q0.n3(f5);
        }
        float f6 = this.M0;
        if (f6 != 0.5f) {
            this.q0.v3(f6);
        }
        int i8 = this.C0;
        if (i8 != 2) {
            this.q0.p3(i8);
        }
        int i9 = this.B0;
        if (i9 != 2) {
            this.q0.z3(i9);
        }
        int i10 = this.v0;
        if (i10 != -1) {
            this.q0.C3(i10);
        }
        int i11 = this.w0;
        if (i11 != -1) {
            this.q0.o3(i11);
        }
        int i12 = this.x0;
        if (i12 != -1) {
            this.q0.w3(i12);
        }
        int i13 = this.y0;
        if (i13 != -1) {
            this.q0.s3(i13);
        }
        int i14 = this.z0;
        if (i14 != -1) {
            this.q0.m3(i14);
        }
        int i15 = this.A0;
        if (i15 != -1) {
            this.q0.u3(i15);
        }
        Q0();
    }

    public int b1() {
        return this.E0;
    }

    public int c1() {
        return this.y0;
    }

    public float d1() {
        return this.O0;
    }

    public int e1() {
        return this.A0;
    }

    public float f1() {
        return this.M0;
    }

    public int g1() {
        return this.x0;
    }

    public int h1() {
        return this.J0;
    }

    public int i1() {
        return this.K0;
    }

    public int j1() {
        return this.I0;
    }

    public int k1() {
        return this.F0;
    }

    public int l1() {
        return this.G0;
    }

    public int m1() {
        return this.H0;
    }

    public float n1(String str) {
        HashMap<String, Float> hashMap = this.s0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.s0.get(str).floatValue();
        }
        return 0.0f;
    }

    public float o1(String str) {
        HashMap<String, Float> hashMap = this.t0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.t0.get(str).floatValue();
        }
        return 0.0f;
    }

    public int p1() {
        return this.B0;
    }

    public float q1() {
        return this.j;
    }

    public int r1() {
        return this.D0;
    }

    public int s1() {
        return this.v0;
    }

    public float t1(String str) {
        HashMap<String, Float> hashMap = this.r0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1.0f;
        }
        return this.r0.get(str).floatValue();
    }

    public int u1() {
        return this.u0;
    }

    public void v1(float f) {
        this.N0 = f;
    }

    public void w1(int i) {
        this.z0 = i;
    }

    public void x1(float f) {
        this.L0 = f;
    }

    public void y1(int i) {
        this.w0 = i;
    }

    public void z1(int i) {
        this.C0 = i;
    }
}
