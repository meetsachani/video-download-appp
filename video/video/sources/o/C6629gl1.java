package o;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: o.gl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6629gl1 extends AbstractC5404bl1 {
    public static final String R = "KeyTrigger";
    public static final String S = "viewTransitionOnCross";
    public static final String T = "viewTransitionOnPositiveCross";
    public static final String U = "viewTransitionOnNegativeCross";
    public static final String V = "postLayout";
    public static final String W = "triggerSlack";
    public static final String X = "triggerCollisionView";
    public static final String Y = "triggerCollisionId";
    public static final String Z = "triggerID";
    public static final String a0 = "positiveCross";
    public static final String b0 = "negativeCross";
    public static final String c0 = "triggerReceiver";
    public static final String d0 = "CROSS";
    public static final int e0 = 301;
    public static final int f0 = 302;
    public static final int g0 = 303;
    public static final int h0 = 304;
    public static final int i0 = 305;
    public static final int j0 = 306;
    public static final int k0 = 307;
    public static final int l0 = 308;
    public static final int m0 = 309;
    public static final int n0 = 310;
    public static final int o0 = 311;
    public static final int p0 = 312;
    public static final int q0 = 5;
    public int A;
    public String B;
    public String C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public C2599Bv0 P;
    public C2599Bv0 Q;
    public int y = -1;
    public String z = null;

    public C6629gl1() {
        int i = AbstractC5404bl1.m;
        this.A = i;
        this.B = null;
        this.C = null;
        this.D = i;
        this.E = i;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = i;
        this.N = i;
        this.O = i;
        this.P = new C2599Bv0();
        this.Q = new C2599Bv0();
        this.k = 5;
        this.l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 307) {
            if (i != 308) {
                if (i != 311) {
                    switch (i) {
                        case 301:
                            this.O = i2;
                            return true;
                        case 302:
                            this.N = i2;
                            return true;
                        case 303:
                            this.M = i2;
                            return true;
                        default:
                            return super.b(i, i2);
                    }
                }
                this.A = i2;
                return true;
            }
            this.D = u(Integer.valueOf(i2));
            return true;
        }
        this.E = i2;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (i != 305) {
            return super.c(i, f);
        }
        this.F = f;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean d(int i, boolean z) {
        if (i != 304) {
            return super.d(i, z);
        }
        this.L = z;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i != 309) {
            if (i != 310) {
                if (i != 312) {
                    return super.e(i, str);
                }
                this.z = str;
                return true;
            }
            this.B = str;
            return true;
        }
        this.C = str;
        return true;
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: g */
    public AbstractC5404bl1 clone() {
        return new C6629gl1().h(this);
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: w */
    public C6629gl1 h(AbstractC5404bl1 abstractC5404bl1) {
        super.h(abstractC5404bl1);
        C6629gl1 c6629gl1 = (C6629gl1) abstractC5404bl1;
        this.y = c6629gl1.y;
        this.z = c6629gl1.z;
        this.A = c6629gl1.A;
        this.B = c6629gl1.B;
        this.C = c6629gl1.C;
        this.D = c6629gl1.D;
        this.E = c6629gl1.E;
        this.F = c6629gl1.F;
        this.G = c6629gl1.G;
        this.H = c6629gl1.H;
        this.I = c6629gl1.I;
        this.J = c6629gl1.J;
        this.K = c6629gl1.K;
        this.L = c6629gl1.L;
        this.P = c6629gl1.P;
        this.Q = c6629gl1.Q;
        return this;
    }

    public final void x(String str, C10054ul1 c10054ul1) {
        boolean z;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                NT nt = this.l.get(str2);
                if (nt != null) {
                    nt.a(c10054ul1);
                }
            }
        }
    }

    @Override // o.AbstractC5404bl1
    public void f(HashMap<String, AbstractC4678Xa2> hashMap) {
    }

    @Override // o.AbstractC5404bl1
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f, C10054ul1 c10054ul1) {
    }
}
