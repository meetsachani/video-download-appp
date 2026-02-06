package o;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AbstractC4678Xa2;
import o.InterfaceC8148mw2;

/* renamed from: o.cl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5646cl1 extends AbstractC5404bl1 {
    public static final String P = "KeyAttribute";
    public static final String Q = "KeyAttributes";
    public static final boolean R = false;
    public static final int S = 1;
    public String y;
    public int z = -1;
    public int A = 0;
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
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;

    public C5646cl1() {
        this.k = 1;
        this.l = new HashMap<>();
    }

    @Override // o.InterfaceC8148mw2
    public int a(String str) {
        return InterfaceC8148mw2.a.a(str);
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 100) {
            if (i != 301) {
                if (i != 302) {
                    if (!b(i, i2)) {
                        return super.b(i, i2);
                    }
                    return true;
                }
                this.A = i2;
                return true;
            }
            this.z = i2;
            return true;
        }
        this.h = i2;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.B = f;
                    return true;
                case 304:
                    this.L = f;
                    return true;
                case 305:
                    this.M = f;
                    return true;
                case 306:
                    this.N = f;
                    return true;
                case 307:
                    this.C = f;
                    return true;
                case 308:
                    this.E = f;
                    return true;
                case 309:
                    this.F = f;
                    return true;
                case 310:
                    this.D = f;
                    return true;
                case 311:
                    this.J = f;
                    return true;
                case 312:
                    this.K = f;
                    return true;
                case 313:
                    this.G = f;
                    return true;
                case 314:
                    this.H = f;
                    return true;
                case 315:
                    this.O = f;
                    return true;
                case InterfaceC8148mw2.a.q /* 316 */:
                    this.I = f;
                    return true;
                default:
                    return super.c(i, f);
            }
        }
        this.I = f;
        return true;
    }

    @Override // o.AbstractC5404bl1, o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i != 101) {
            if (i != 317) {
                return super.e(i, str);
            }
            this.y = str;
            return true;
        }
        this.j = str;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("pivotX") == false) goto L12;
     */
    @Override // o.AbstractC5404bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(HashMap<String, AbstractC4678Xa2> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC4678Xa2 abstractC4678Xa2 = hashMap.get(next);
            if (abstractC4678Xa2 != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    NT nt = this.l.get(next.substring(7));
                    if (nt != null) {
                        ((AbstractC4678Xa2.c) abstractC4678Xa2).k(this.h, nt);
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
                        case -987906986:
                            break;
                        case -987906985:
                            if (next.equals("pivotY")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
                                c = C8206nB.d;
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
                            if (!Float.isNaN(this.E)) {
                                abstractC4678Xa2.g(this.h, this.E);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.F)) {
                                abstractC4678Xa2.g(this.h, this.F);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.D)) {
                                abstractC4678Xa2.g(this.h, this.D);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.L)) {
                                abstractC4678Xa2.g(this.h, this.L);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.M)) {
                                abstractC4678Xa2.g(this.h, this.M);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.N)) {
                                abstractC4678Xa2.g(this.h, this.N);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.O)) {
                                abstractC4678Xa2.g(this.h, this.O);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.E)) {
                                abstractC4678Xa2.g(this.h, this.G);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.F)) {
                                abstractC4678Xa2.g(this.h, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.J)) {
                                abstractC4678Xa2.g(this.h, this.J);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.K)) {
                                abstractC4678Xa2.g(this.h, this.K);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.C)) {
                                abstractC4678Xa2.g(this.h, this.C);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.B)) {
                                abstractC4678Xa2.g(this.h, this.B);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.I)) {
                                abstractC4678Xa2.g(this.h, this.I);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            System.err.println("not supported by KeyAttributes " + next);
                            continue;
                    }
                }
            }
        }
    }

    @Override // o.AbstractC5404bl1
    /* renamed from: g */
    public AbstractC5404bl1 clone() {
        return null;
    }

    @Override // o.AbstractC5404bl1
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.l.size() > 0) {
            Iterator<String> it = this.l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o.AbstractC5404bl1
    public void q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.B)) {
            hashMap.put("alpha", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.C)) {
            hashMap.put("elevation", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.D)) {
            hashMap.put("rotationZ", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.E)) {
            hashMap.put("rotationX", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("rotationY", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("pivotX", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("pivotY", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("translationX", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("translationY", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("translationZ", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("pathRotate", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("scaleX", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("scaleY", Integer.valueOf(this.z));
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("progress", Integer.valueOf(this.z));
        }
        if (this.l.size() > 0) {
            Iterator<String> it = this.l.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.z));
            }
        }
    }

    public int v() {
        return this.z;
    }

    public final float w(int i) {
        if (i != 100) {
            switch (i) {
                case 303:
                    return this.B;
                case 304:
                    return this.L;
                case 305:
                    return this.M;
                case 306:
                    return this.N;
                case 307:
                    return this.C;
                case 308:
                    return this.E;
                case 309:
                    return this.F;
                case 310:
                    return this.D;
                case 311:
                    return this.J;
                case 312:
                    return this.K;
                case 313:
                    return this.G;
                case 314:
                    return this.H;
                case 315:
                    return this.O;
                case InterfaceC8148mw2.a.q /* 316 */:
                    return this.I;
                default:
                    return Float.NaN;
            }
        }
        return this.h;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        PrintStream printStream = System.out;
        printStream.println(" ------------- " + this.h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int a = InterfaceC8148mw2.a.a(strArr[i]);
            PrintStream printStream2 = System.out;
            printStream2.println(strArr[i] + ":" + w(a));
        }
    }
}
