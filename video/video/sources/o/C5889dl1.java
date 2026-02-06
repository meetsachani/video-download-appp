package o;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.InterfaceC8148mw2;

/* renamed from: o.dl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5889dl1 extends AbstractC5404bl1 {
    public static final String R = "KeyCycle";
    public static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 3;
    public static final int b0 = 4;
    public static final int c0 = 5;
    public static final int d0 = 6;
    public static final int e0 = 4;
    public String y = null;
    public int z = 0;
    public int A = -1;
    public String B = null;
    public float C = Float.NaN;
    public float D = 0.0f;
    public float E = 0.0f;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;
    public float P = Float.NaN;
    public float Q = Float.NaN;

    public C5889dl1() {
        this.k = 4;
        this.l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(InterfaceC8148mw2.c.P)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1019779949:
                if (str.equals(InterfaceC8148mw2.c.R)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -991726143:
                if (str.equals(InterfaceC8148mw2.c.Q)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 106629499:
                if (str.equals(InterfaceC8148mw2.c.S)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 20;
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
                return InterfaceC8148mw2.c.t;
            case 1:
                return InterfaceC8148mw2.c.r;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return InterfaceC8148mw2.c.v;
            case '\t':
                return 315;
            case '\n':
                return InterfaceC8148mw2.c.u;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return InterfaceC8148mw2.c.w;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 401) {
            if (i != 421) {
                if (c(i, i2)) {
                    return true;
                }
                return super.b(i, i2);
            }
            this.A = i2;
            return true;
        }
        this.z = i2;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (i != 315) {
            if (i != 403) {
                if (i != 416) {
                    switch (i) {
                        case 304:
                            this.O = f;
                            return true;
                        case 305:
                            this.P = f;
                            return true;
                        case 306:
                            this.Q = f;
                            return true;
                        case 307:
                            this.H = f;
                            return true;
                        case 308:
                            this.K = f;
                            return true;
                        case 309:
                            this.L = f;
                            return true;
                        case 310:
                            this.I = f;
                            return true;
                        case 311:
                            this.M = f;
                            return true;
                        case 312:
                            this.N = f;
                            return true;
                        default:
                            switch (i) {
                                case InterfaceC8148mw2.c.u /* 423 */:
                                    this.C = f;
                                    return true;
                                case InterfaceC8148mw2.c.v /* 424 */:
                                    this.D = f;
                                    return true;
                                case InterfaceC8148mw2.c.w /* 425 */:
                                    this.E = f;
                                    return true;
                                default:
                                    return super.c(i, f);
                            }
                    }
                }
                this.J = f;
                return true;
            }
            this.G = f;
            return true;
        }
        this.F = f;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i != 420) {
            if (i != 422) {
                return super.e(i, str);
            }
            this.B = str;
            return true;
        }
        this.y = str;
        return true;
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: g */
    public AbstractC5404bl1 clone() {
        return null;
    }

    @Override // o.AbstractC5404bl1
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationZ");
        }
        if (this.l.size() > 0) {
            Iterator<String> it = this.l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, AbstractC8779pX0> hashMap) {
        AbstractC8779pX0 abstractC8779pX0;
        AbstractC8779pX0 abstractC8779pX02;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                NT nt = this.l.get(str.substring(7));
                if (nt != null && nt.m() == 901 && (abstractC8779pX0 = hashMap.get(str)) != null) {
                    abstractC8779pX0.g(this.h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, nt.n(), nt);
                }
            } else {
                float x = x(str);
                if (!Float.isNaN(x) && (abstractC8779pX02 = hashMap.get(str)) != null) {
                    abstractC8779pX02.f(this.h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, x);
                }
            }
        }
    }

    public void w() {
        PrintStream printStream = System.out;
        printStream.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + '}');
    }

    public float x(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals(InterfaceC8148mw2.c.R)) {
                    c = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 106629499:
                if (str.equals(InterfaceC8148mw2.c.S)) {
                    c = '\f';
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = C8206nB.d;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.I;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.Q;
            case 6:
                return this.D;
            case 7:
                return this.F;
            case '\b':
                return this.M;
            case '\t':
                return this.N;
            case '\n':
                return this.H;
            case 11:
                return this.G;
            case '\f':
                return this.E;
            case '\r':
                return this.J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        C5521cE2.c(" ------------- " + this.h + " -------------");
        C5521cE2.c("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            C5521cE2.c(strArr[i] + ":" + x(strArr[i]));
        }
    }

    @Override // o.AbstractC5404bl1
    public void f(HashMap<String, AbstractC4678Xa2> hashMap) {
    }
}
