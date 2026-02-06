package o;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import o.UK;

/* loaded from: classes.dex */
public class PE0 extends UI2 {
    public static final int l2 = 0;
    public static final int m2 = 1;
    public static final int n2 = 1;
    public static final int o2 = 2;
    public static final int p2 = 3;
    public static final int q2 = 50;
    public static final int r2 = 50;
    public VK Q1;
    public UK[] R1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public float X1;
    public float Y1;
    public String Z1;
    public String a2;
    public String b2;
    public String c2;
    public int d2;
    public boolean[][] f2;
    public int[][] h2;
    public int i2;
    public int[][] j2;
    public boolean S1 = false;
    public int e2 = 0;
    public Set<String> g2 = new HashSet();
    public int k2 = 0;

    public PE0() {
        z3();
        d3();
    }

    public static /* synthetic */ int J2(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    public final void K2() {
        m3();
        l3();
        L2();
    }

    public final void L2() {
        int[][] iArr;
        int i;
        for (int i2 = 0; i2 < this.C1; i2++) {
            if (!this.g2.contains(this.B1[i2].f625o)) {
                int W2 = W2();
                int Y2 = Y2(W2);
                int R2 = R2(W2);
                if (W2 != -1) {
                    if (g3() && (iArr = this.j2) != null && (i = this.k2) < iArr.length) {
                        int[] iArr2 = iArr[i];
                        if (iArr2[0] == W2) {
                            this.f2[Y2][R2] = true;
                            if (f3(Y2, R2, iArr2[1], iArr2[2])) {
                                UK uk = this.B1[i2];
                                int[] iArr3 = this.j2[this.k2];
                                O2(uk, Y2, R2, iArr3[1], iArr3[2]);
                                this.k2++;
                            }
                        }
                    }
                    O2(this.B1[i2], Y2, R2, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    public final void M2(UK uk) {
        uk.G1(-1.0f);
        uk.Q.x();
        uk.S.x();
    }

    public final void N2(UK uk) {
        uk.b2(-1.0f);
        uk.R.x();
        uk.T.x();
        uk.U.x();
    }

    public final void O2(UK uk, int i, int i2, int i3, int i4) {
        uk.Q.a(this.R1[i2].Q, 0);
        uk.R.a(this.R1[i].R, 0);
        uk.S.a(this.R1[(i2 + i4) - 1].S, 0);
        uk.T.a(this.R1[(i + i3) - 1].T, 0);
    }

    public final void P2() {
        int max = Math.max(this.T1, this.V1);
        UK[] ukArr = this.R1;
        int i = 0;
        if (ukArr == null) {
            this.R1 = new UK[max];
            while (true) {
                UK[] ukArr2 = this.R1;
                if (i < ukArr2.length) {
                    ukArr2[i] = i3();
                    i++;
                } else {
                    return;
                }
            }
        } else if (max != ukArr.length) {
            UK[] ukArr3 = new UK[max];
            while (i < max) {
                UK[] ukArr4 = this.R1;
                if (i < ukArr4.length) {
                    ukArr3[i] = ukArr4[i];
                } else {
                    ukArr3[i] = i3();
                }
                i++;
            }
            while (true) {
                UK[] ukArr5 = this.R1;
                if (max < ukArr5.length) {
                    this.Q1.p2(ukArr5[max]);
                    max++;
                } else {
                    this.R1 = ukArr3;
                    return;
                }
            }
        }
    }

    public final void Q2(boolean z) {
        int[][] j3;
        int[][] j32;
        if (z) {
            for (int i = 0; i < this.f2.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.f2;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.h2.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.h2;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.e2 = 0;
        String str = this.c2;
        if (str != null && !str.trim().isEmpty() && (j32 = j3(this.c2, false)) != null) {
            b3(j32);
        }
        String str2 = this.b2;
        if (str2 != null && !str2.trim().isEmpty() && (j3 = j3(this.b2, true)) != null) {
            c3(j3);
        }
    }

    public final int R2(int i) {
        if (this.d2 == 1) {
            return i / this.T1;
        }
        return i % this.V1;
    }

    public String S2() {
        return this.a2;
    }

    public VK T2() {
        return this.Q1;
    }

    public int U2() {
        return this.i2;
    }

    public float V2() {
        return this.X1;
    }

    public final int W2() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.e2;
            if (i >= this.T1 * this.V1) {
                return -1;
            }
            int Y2 = Y2(i);
            int R2 = R2(this.e2);
            boolean[] zArr = this.f2[Y2];
            if (zArr[R2]) {
                zArr[R2] = false;
                z = true;
            }
            this.e2++;
        }
        return i;
    }

    public int X2() {
        return this.d2;
    }

    public final int Y2(int i) {
        if (this.d2 == 1) {
            return i % this.T1;
        }
        return i / this.V1;
    }

    public String Z2() {
        return this.Z1;
    }

    public float a3() {
        return this.Y1;
    }

    public final void b3(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!f3(Y2(iArr2[0]), R2(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void c3(int[][] iArr) {
        if (!g3()) {
            for (int i = 0; i < iArr.length; i++) {
                int Y2 = Y2(iArr[i][0]);
                int R2 = R2(iArr[i][0]);
                int[] iArr2 = iArr[i];
                if (!f3(Y2, R2, iArr2[1], iArr2[2])) {
                    break;
                }
                UK uk = this.B1[i];
                int[] iArr3 = iArr[i];
                O2(uk, Y2, R2, iArr3[1], iArr3[2]);
                this.g2.add(this.B1[i].f625o);
            }
        }
    }

    public final void d3() {
        boolean[][] zArr;
        int[][] iArr = this.h2;
        boolean z = false;
        if (iArr != null && iArr.length == this.C1 && (zArr = this.f2) != null && zArr.length == this.T1 && zArr[0].length == this.V1) {
            z = true;
        }
        if (!z) {
            e3();
        }
        Q2(z);
    }

    public final void e3() {
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, this.T1, this.V1);
        this.f2 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.C1;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i, 4);
            this.h2 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean f3(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.f2;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // o.UK
    public void g(C9872u01 c9872u01, boolean z) {
        super.g(c9872u01, z);
        K2();
    }

    public final boolean g3() {
        if ((this.i2 & 2) > 0) {
            return true;
        }
        return false;
    }

    public final boolean h3() {
        if ((this.i2 & 1) > 0) {
            return true;
        }
        return false;
    }

    public final UK i3() {
        UK uk = new UK();
        UK.b[] bVarArr = uk.b0;
        UK.b bVar = UK.b.MATCH_CONSTRAINT;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        uk.f625o = String.valueOf(uk.hashCode());
        return uk;
    }

    public final int[][] j3(String str, boolean z) {
        try {
            String[] split = str.split(",");
            Arrays.sort(split, new Comparator() { // from class: o.OE0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return PE0.J2((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, split.length, 3);
            if (this.T1 != 1 && this.V1 != 1) {
                for (int i = 0; i < split.length; i++) {
                    String[] split2 = split[i].trim().split(":");
                    String[] split3 = split2[1].split("x");
                    iArr[i][0] = Integer.parseInt(split2[0]);
                    if (h3()) {
                        iArr[i][1] = Integer.parseInt(split3[1]);
                        iArr[i][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i][1] = Integer.parseInt(split3[0]);
                        iArr[i][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < split.length; i4++) {
                String[] split4 = split[i4].trim().split(":");
                iArr[i4][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i4];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.V1 == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i2 += iArr[i4][1];
                    if (z) {
                        i2--;
                    }
                }
                if (this.T1 == 1) {
                    iArr[i4][2] = Integer.parseInt(split4[1]);
                    i3 += iArr[i4][2];
                    if (z) {
                        i3--;
                    }
                }
            }
            if (i2 != 0 && !this.S1) {
                u3(this.T1 + i2);
            }
            if (i3 != 0 && !this.S1) {
                o3(this.V1 + i3);
            }
            this.S1 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final float[] k3(int i, String str) {
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",");
            float[] fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < split.length) {
                    try {
                        fArr[i2] = Float.parseFloat(split[i2]);
                    } catch (Exception e) {
                        PrintStream printStream = System.err;
                        printStream.println("Error parsing `" + split[i2] + "`: " + e.getMessage());
                        fArr[i2] = 1.0f;
                    }
                } else {
                    fArr[i2] = 1.0f;
                }
            }
            return fArr;
        }
        return null;
    }

    public final void l3() {
        int i;
        int max = Math.max(this.T1, this.V1);
        UK uk = this.R1[0];
        float[] k3 = k3(this.V1, this.a2);
        if (this.V1 == 1) {
            M2(uk);
            uk.Q.a(this.Q, 0);
            uk.S.a(this.S, 0);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.V1;
            if (i2 >= i) {
                break;
            }
            UK uk2 = this.R1[i2];
            M2(uk2);
            if (k3 != null) {
                uk2.G1(k3[i2]);
            }
            if (i2 > 0) {
                uk2.Q.a(this.R1[i2 - 1].S, 0);
            } else {
                uk2.Q.a(this.Q, 0);
            }
            if (i2 < this.V1 - 1) {
                uk2.S.a(this.R1[i2 + 1].Q, 0);
            } else {
                uk2.S.a(this.S, 0);
            }
            if (i2 > 0) {
                uk2.Q.g = (int) this.X1;
            }
            i2++;
        }
        while (i < max) {
            UK uk3 = this.R1[i];
            M2(uk3);
            uk3.Q.a(this.Q, 0);
            uk3.S.a(this.S, 0);
            i++;
        }
    }

    public final void m3() {
        int i;
        int max = Math.max(this.T1, this.V1);
        UK uk = this.R1[0];
        float[] k3 = k3(this.T1, this.Z1);
        if (this.T1 == 1) {
            N2(uk);
            uk.R.a(this.R, 0);
            uk.T.a(this.T, 0);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.T1;
            if (i2 >= i) {
                break;
            }
            UK uk2 = this.R1[i2];
            N2(uk2);
            if (k3 != null) {
                uk2.b2(k3[i2]);
            }
            if (i2 > 0) {
                uk2.R.a(this.R1[i2 - 1].T, 0);
            } else {
                uk2.R.a(this.R, 0);
            }
            if (i2 < this.T1 - 1) {
                uk2.T.a(this.R1[i2 + 1].R, 0);
            } else {
                uk2.T.a(this.T, 0);
            }
            if (i2 > 0) {
                uk2.R.g = (int) this.Y1;
            }
            i2++;
        }
        while (i < max) {
            UK uk3 = this.R1[i];
            N2(uk3);
            uk3.R.a(this.R, 0);
            uk3.T.a(this.T, 0);
            i++;
        }
    }

    public void n3(String str) {
        String str2 = this.a2;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.a2 = str;
    }

    public void o3(int i) {
        if (i > 50 || this.W1 == i) {
            return;
        }
        this.W1 = i;
        z3();
        e3();
    }

    public void p3(VK vk) {
        this.Q1 = vk;
    }

    public void q3(int i) {
        this.i2 = i;
    }

    public void r3(float f) {
        if (f < 0.0f || this.X1 == f) {
            return;
        }
        this.X1 = f;
    }

    public void s3(int i) {
        if ((i != 0 && i != 1) || this.d2 == i) {
            return;
        }
        this.d2 = i;
    }

    public void t3(String str) {
        String str2 = this.Z1;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.Z1 = str;
    }

    public void u3(int i) {
        if (i > 50 || this.U1 == i) {
            return;
        }
        this.U1 = i;
        z3();
        e3();
    }

    public void v3(String str) {
        String str2 = this.c2;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.S1 = false;
        this.c2 = str;
    }

    @Override // o.UI2
    public void w2(int i, int i2, int i3, int i4) {
        super.w2(i, i2, i3, i4);
        this.Q1 = (VK) U();
        y3(false);
        this.Q1.l2(this.R1);
    }

    public void w3(CharSequence charSequence) {
        String str = this.b2;
        if (str != null && str.equals(charSequence.toString())) {
            return;
        }
        this.S1 = false;
        this.b2 = charSequence.toString();
    }

    public void x3(float f) {
        if (f < 0.0f || this.Y1 == f) {
            return;
        }
        this.Y1 = f;
    }

    public final void y3(boolean z) {
        int[][] j3;
        if (this.T1 >= 1 && this.V1 >= 1) {
            if (z) {
                for (int i = 0; i < this.f2.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr = this.f2;
                        if (i2 < zArr[0].length) {
                            zArr[i][i2] = true;
                            i2++;
                        }
                    }
                }
                this.g2.clear();
            }
            this.e2 = 0;
            String str = this.c2;
            if (str != null && !str.trim().isEmpty() && (j3 = j3(this.c2, false)) != null) {
                b3(j3);
            }
            String str2 = this.b2;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.j2 = j3(this.b2, true);
            }
            P2();
            int[][] iArr = this.j2;
            if (iArr != null) {
                c3(iArr);
            }
        }
    }

    public final void z3() {
        int i;
        int i2 = this.U1;
        if (i2 != 0 && (i = this.W1) != 0) {
            this.T1 = i2;
            this.V1 = i;
            return;
        }
        int i3 = this.W1;
        if (i3 > 0) {
            this.V1 = i3;
            this.T1 = ((this.C1 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.T1 = i2;
            this.V1 = ((this.C1 + i2) - 1) / i2;
        } else {
            int sqrt = (int) (Math.sqrt(this.C1) + 1.5d);
            this.T1 = sqrt;
            this.V1 = ((this.C1 + sqrt) - 1) / sqrt;
        }
    }

    public PE0(int i, int i2) {
        this.U1 = i;
        this.W1 = i2;
        if (i > 50) {
            this.U1 = 3;
        }
        if (i2 > 50) {
            this.W1 = 3;
        }
        z3();
        d3();
    }
}
