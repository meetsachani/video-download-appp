package o;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AbstractC2977Fo2;
import o.AbstractC4253Sp2;
import o.InterfaceC8148mw2;

/* renamed from: o.fl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6374fl1 extends AbstractC5404bl1 {
    public static final String Q = "KeyTimeCycle";
    public static final String R = "KeyTimeCycle";
    public static final int S = 3;
    public String y;
    public int z = -1;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public int M = 0;
    public String N = null;
    public float O = Float.NaN;
    public float P = 0.0f;

    public C6374fl1() {
        this.k = 3;
        this.l = new HashMap<>();
    }

    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        return InterfaceC8148mw2.c.a(str);
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 100) {
            if (i != 421) {
                return super.b(i, i2);
            }
            this.M = i2;
            return true;
        }
        this.h = i2;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (i != 315) {
            if (i != 401) {
                if (i != 403) {
                    if (i != 416) {
                        if (i != 423) {
                            if (i != 424) {
                                switch (i) {
                                    case 304:
                                        this.I = t(Float.valueOf(f));
                                        return true;
                                    case 305:
                                        this.J = t(Float.valueOf(f));
                                        return true;
                                    case 306:
                                        this.K = t(Float.valueOf(f));
                                        return true;
                                    case 307:
                                        this.B = t(Float.valueOf(f));
                                        return true;
                                    case 308:
                                        this.D = t(Float.valueOf(f));
                                        return true;
                                    case 309:
                                        this.E = t(Float.valueOf(f));
                                        return true;
                                    case 310:
                                        this.C = t(Float.valueOf(f));
                                        return true;
                                    case 311:
                                        this.G = t(Float.valueOf(f));
                                        return true;
                                    case 312:
                                        this.H = t(Float.valueOf(f));
                                        return true;
                                    default:
                                        return super.c(i, f);
                                }
                            }
                            this.P = t(Float.valueOf(f));
                            return true;
                        }
                        this.O = t(Float.valueOf(f));
                        return true;
                    }
                    this.F = t(Float.valueOf(f));
                    return true;
                }
                this.A = f;
                return true;
            }
            this.z = u(Float.valueOf(f));
            return true;
        }
        this.L = t(Float.valueOf(f));
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean d(int i, boolean z) {
        return super.d(i, z);
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i != 420) {
            if (i != 421) {
                return super.e(i, str);
            }
            this.M = 7;
            this.N = str;
            return true;
        }
        this.y = str;
        return true;
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: g */
    public AbstractC5404bl1 clone() {
        return new C6374fl1().h(this);
    }

    @Override // o.AbstractC5404bl1
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (this.l.size() > 0) {
            Iterator<String> it = this.l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleX") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(HashMap<String, AbstractC2977Fo2> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC2977Fo2 abstractC2977Fo2 = hashMap.get(next);
            if (abstractC2977Fo2 != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    NT nt = this.l.get(next.substring(7));
                    if (nt != null) {
                        ((AbstractC2977Fo2.b) abstractC2977Fo2).g(this.h, nt, this.O, this.M, this.P);
                    }
                } else {
                    switch (next.hashCode()) {
                        case -1249320806:
                            if (next.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (next.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320804:
                            if (next.equals("rotationZ")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
                                c = 11;
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
                            if (!Float.isNaN(this.D)) {
                                abstractC2977Fo2.c(this.h, this.D, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.E)) {
                                abstractC2977Fo2.c(this.h, this.E, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.C)) {
                                abstractC2977Fo2.c(this.h, this.C, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.I)) {
                                abstractC2977Fo2.c(this.h, this.I, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.J)) {
                                abstractC2977Fo2.c(this.h, this.J, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.K)) {
                                abstractC2977Fo2.c(this.h, this.K, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.L)) {
                                abstractC2977Fo2.c(this.h, this.L, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.G)) {
                                abstractC2977Fo2.c(this.h, this.G, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.H)) {
                                abstractC2977Fo2.c(this.h, this.H, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.K)) {
                                abstractC2977Fo2.c(this.h, this.K, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.A)) {
                                abstractC2977Fo2.c(this.h, this.A, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.F)) {
                                abstractC2977Fo2.c(this.h, this.F, this.O, this.M, this.P);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            C5521cE2.f("KeyTimeCycles", "UNKNOWN addValues \"" + next + AbstractC4253Sp2.b.x1);
                            continue;
                    }
                }
            }
        }
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: w */
    public C6374fl1 h(AbstractC5404bl1 abstractC5404bl1) {
        super.h(abstractC5404bl1);
        C6374fl1 c6374fl1 = (C6374fl1) abstractC5404bl1;
        this.y = c6374fl1.y;
        this.z = c6374fl1.z;
        this.M = c6374fl1.M;
        this.O = c6374fl1.O;
        this.P = c6374fl1.P;
        this.L = c6374fl1.L;
        this.A = c6374fl1.A;
        this.B = c6374fl1.B;
        this.C = c6374fl1.C;
        this.F = c6374fl1.F;
        this.D = c6374fl1.D;
        this.E = c6374fl1.E;
        this.G = c6374fl1.G;
        this.H = c6374fl1.H;
        this.I = c6374fl1.I;
        this.J = c6374fl1.J;
        this.K = c6374fl1.K;
        return this;
    }

    @Override // o.AbstractC5404bl1
    public void f(HashMap<String, AbstractC4678Xa2> hashMap) {
    }
}
