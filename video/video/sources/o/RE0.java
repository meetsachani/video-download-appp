package o;

import o.C8068mc2;

/* loaded from: classes.dex */
public class RE0 extends C9210rH0 {
    public static final String F0 = "spansrespectwidgetorder";
    public static final String G0 = "subgridbycolrow";
    public String A0;
    public String B0;
    public String C0;
    public String D0;
    public int E0;
    public PE0 q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public float y0;
    public float z0;

    public RE0(C8068mc2 c8068mc2, C8068mc2.d dVar) {
        super(c8068mc2, dVar);
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        if (dVar == C8068mc2.d.ROW) {
            this.w0 = 1;
        } else if (dVar == C8068mc2.d.COLUMN) {
            this.x0 = 1;
        }
    }

    @Override // o.C9210rH0
    public C9696tH0 R0() {
        if (this.q0 == null) {
            this.q0 = new PE0();
        }
        return this.q0;
    }

    @Override // o.C9210rH0
    public void T0(C9696tH0 c9696tH0) {
        if (c9696tH0 instanceof PE0) {
            this.q0 = (PE0) c9696tH0;
        } else {
            this.q0 = null;
        }
    }

    public String U0() {
        return this.B0;
    }

    public int V0() {
        return this.x0;
    }

    public int W0() {
        return this.E0;
    }

    public float X0() {
        return this.y0;
    }

    public int Y0() {
        return this.v0;
    }

    public int Z0() {
        return this.u0;
    }

    public int a1() {
        return this.s0;
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        R0();
        this.q0.s3(this.v0);
        int i = this.w0;
        if (i != 0) {
            this.q0.u3(i);
        }
        int i2 = this.x0;
        if (i2 != 0) {
            this.q0.o3(i2);
        }
        float f = this.y0;
        if (f != 0.0f) {
            this.q0.r3(f);
        }
        float f2 = this.z0;
        if (f2 != 0.0f) {
            this.q0.x3(f2);
        }
        String str = this.A0;
        if (str != null && !str.isEmpty()) {
            this.q0.t3(this.A0);
        }
        String str2 = this.B0;
        if (str2 != null && !str2.isEmpty()) {
            this.q0.n3(this.B0);
        }
        String str3 = this.C0;
        if (str3 != null && !str3.isEmpty()) {
            this.q0.w3(this.C0);
        }
        String str4 = this.D0;
        if (str4 != null && !str4.isEmpty()) {
            this.q0.v3(this.D0);
        }
        this.q0.q3(this.E0);
        this.q0.H2(this.r0);
        this.q0.E2(this.s0);
        this.q0.I2(this.t0);
        this.q0.D2(this.u0);
        Q0();
    }

    public int b1() {
        return this.r0;
    }

    public int c1() {
        return this.t0;
    }

    public String d1() {
        return this.A0;
    }

    public int e1() {
        return this.w0;
    }

    public String f1() {
        return this.D0;
    }

    public String g1() {
        return this.C0;
    }

    public float h1() {
        return this.z0;
    }

    public void i1(String str) {
        this.B0 = str;
    }

    public void j1(int i) {
        if (super.S0() == C8068mc2.d.ROW) {
            return;
        }
        this.x0 = i;
    }

    public void k1(int i) {
        this.E0 = i;
    }

    public void l1(String str) {
        if (!str.isEmpty()) {
            String[] split = str.split("\\|");
            this.E0 = 0;
            for (String str2 : split) {
                String lowerCase = str2.toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals(G0)) {
                    this.E0 |= 1;
                } else if (lowerCase.equals(F0)) {
                    this.E0 |= 2;
                }
            }
        }
    }

    public void m1(float f) {
        this.y0 = f;
    }

    public void n1(int i) {
        this.v0 = i;
    }

    public void o1(int i) {
        this.u0 = i;
    }

    public void p1(int i) {
        this.s0 = i;
    }

    public void q1(int i) {
        this.r0 = i;
    }

    public void r1(int i) {
        this.t0 = i;
    }

    public void s1(String str) {
        this.A0 = str;
    }

    public void t1(int i) {
        if (super.S0() == C8068mc2.d.COLUMN) {
            return;
        }
        this.w0 = i;
    }

    public void u1(String str) {
        this.D0 = str;
    }

    public void v1(String str) {
        this.C0 = str;
    }

    public void w1(float f) {
        this.z0 = f;
    }
}
