package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AbstractC4253Sp2;
import o.AbstractC7490kI2;

/* loaded from: classes.dex */
public class HX0 extends AbstractC6818hX0 {
    public static final String V = "wavePeriod";
    public static final String W = "waveOffset";
    public static final String X = "waveShape";
    public static final int Y = 0;
    public static final int Z = 1;
    public static final int a0 = 2;
    public static final int b0 = 3;
    public static final int c0 = 4;
    public static final int d0 = 5;
    public static final int e0 = 6;
    public static final int f0 = 3;
    public static final String g0 = "KeyTimeCycle";
    public static final String h0 = "KeyTimeCycle";
    public String D;
    public int E = -1;
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
    public int R = 0;
    public String S = null;
    public float T = Float.NaN;
    public float U = 0.0f;

    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 5;
        public static final int e = 6;
        public static final int f = 8;
        public static final int g = 7;
        public static final int h = 9;
        public static final int i = 10;
        public static final int j = 12;
        public static final int k = 13;
        public static final int l = 14;
        public static final int m = 15;
        public static final int n = 16;

        /* renamed from: o  reason: collision with root package name */
        public static final int f488o = 17;
        public static final int p = 18;
        public static final int q = 19;
        public static final int r = 20;
        public static final int s = 21;
        public static SparseIntArray t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            t = sparseIntArray;
            sparseIntArray.append(j.c.ua, 1);
            t.append(j.c.Da, 2);
            t.append(j.c.za, 4);
            t.append(j.c.Aa, 5);
            t.append(j.c.Ba, 6);
            t.append(j.c.xa, 7);
            t.append(j.c.Ja, 8);
            t.append(j.c.Ia, 9);
            t.append(j.c.Ha, 10);
            t.append(j.c.Fa, 12);
            t.append(j.c.Ea, 13);
            t.append(j.c.ya, 14);
            t.append(j.c.va, 15);
            t.append(j.c.wa, 16);
            t.append(j.c.Ca, 17);
            t.append(j.c.Ga, 18);
            t.append(j.c.Ma, 20);
            t.append(j.c.La, 21);
            t.append(j.c.Oa, 19);
        }

        public static void a(HX0 hx0, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (t.get(index)) {
                    case 1:
                        hx0.F = typedArray.getFloat(index, hx0.F);
                        break;
                    case 2:
                        hx0.G = typedArray.getDimension(index, hx0.G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + t.get(index));
                        break;
                    case 4:
                        hx0.H = typedArray.getFloat(index, hx0.H);
                        break;
                    case 5:
                        hx0.I = typedArray.getFloat(index, hx0.I);
                        break;
                    case 6:
                        hx0.J = typedArray.getFloat(index, hx0.J);
                        break;
                    case 7:
                        hx0.L = typedArray.getFloat(index, hx0.L);
                        break;
                    case 8:
                        hx0.K = typedArray.getFloat(index, hx0.K);
                        break;
                    case 9:
                        hx0.D = typedArray.getString(index);
                        break;
                    case 10:
                        if (C7114il1.q3) {
                            int resourceId = typedArray.getResourceId(index, hx0.b);
                            hx0.b = resourceId;
                            if (resourceId == -1) {
                                hx0.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hx0.c = typedArray.getString(index);
                            break;
                        } else {
                            hx0.b = typedArray.getResourceId(index, hx0.b);
                            break;
                        }
                    case 12:
                        hx0.a = typedArray.getInt(index, hx0.a);
                        break;
                    case 13:
                        hx0.E = typedArray.getInteger(index, hx0.E);
                        break;
                    case 14:
                        hx0.M = typedArray.getFloat(index, hx0.M);
                        break;
                    case 15:
                        hx0.N = typedArray.getDimension(index, hx0.N);
                        break;
                    case 16:
                        hx0.O = typedArray.getDimension(index, hx0.O);
                        break;
                    case 17:
                        hx0.P = typedArray.getDimension(index, hx0.P);
                        break;
                    case 18:
                        hx0.Q = typedArray.getFloat(index, hx0.Q);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            hx0.S = typedArray.getString(index);
                            hx0.R = 7;
                            break;
                        } else {
                            hx0.R = typedArray.getInt(index, hx0.R);
                            break;
                        }
                    case 20:
                        hx0.T = typedArray.getFloat(index, hx0.T);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            hx0.U = typedArray.getDimension(index, hx0.U);
                            break;
                        } else {
                            hx0.U = typedArray.getFloat(index, hx0.U);
                            break;
                        }
                }
            }
        }
    }

    public HX0() {
        this.d = 3;
        this.e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W(HashMap<String, AbstractC7490kI2> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC7490kI2 abstractC7490kI2 = hashMap.get(next);
            if (abstractC7490kI2 != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.a aVar = this.e.get(next.substring(7));
                    if (aVar != null) {
                        ((AbstractC7490kI2.b) abstractC7490kI2).k(this.a, aVar, this.T, this.R, this.U);
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
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -40300674:
                            if (next.equals(AbstractC6818hX0.i)) {
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
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
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
                            if (!Float.isNaN(this.I)) {
                                abstractC7490kI2.c(this.a, this.I, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.J)) {
                                abstractC7490kI2.c(this.a, this.J, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.N)) {
                                abstractC7490kI2.c(this.a, this.N, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.O)) {
                                abstractC7490kI2.c(this.a, this.O, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.P)) {
                                abstractC7490kI2.c(this.a, this.P, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.Q)) {
                                abstractC7490kI2.c(this.a, this.Q, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.L)) {
                                abstractC7490kI2.c(this.a, this.L, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.M)) {
                                abstractC7490kI2.c(this.a, this.M, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.H)) {
                                abstractC7490kI2.c(this.a, this.H, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.G)) {
                                abstractC7490kI2.c(this.a, this.G, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.K)) {
                                abstractC7490kI2.c(this.a, this.K, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.F)) {
                                abstractC7490kI2.c(this.a, this.F, this.T, this.R, this.U);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next + AbstractC4253Sp2.b.x1);
                            continue;
                    }
                }
            }
        }
    }

    @Override // o.AbstractC6818hX0
    public void a(HashMap<String, AbstractC6265fI2> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // o.AbstractC6818hX0
    /* renamed from: b */
    public AbstractC6818hX0 clone() {
        return new HX0().c(this);
    }

    @Override // o.AbstractC6818hX0
    public AbstractC6818hX0 c(AbstractC6818hX0 abstractC6818hX0) {
        super.c(abstractC6818hX0);
        HX0 hx0 = (HX0) abstractC6818hX0;
        this.D = hx0.D;
        this.E = hx0.E;
        this.R = hx0.R;
        this.T = hx0.T;
        this.U = hx0.U;
        this.Q = hx0.Q;
        this.F = hx0.F;
        this.G = hx0.G;
        this.H = hx0.H;
        this.K = hx0.K;
        this.I = hx0.I;
        this.J = hx0.J;
        this.L = hx0.L;
        this.M = hx0.M;
        this.N = hx0.N;
        this.O = hx0.O;
        this.P = hx0.P;
        this.S = hx0.S;
        return this;
    }

    @Override // o.AbstractC6818hX0
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(AbstractC6818hX0.i);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("progress");
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o.AbstractC6818hX0
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, j.c.ta));
    }

    @Override // o.AbstractC6818hX0
    public void i(HashMap<String, Integer> hashMap) {
        if (this.E != -1) {
            if (!Float.isNaN(this.F)) {
                hashMap.put("alpha", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.G)) {
                hashMap.put("elevation", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.H)) {
                hashMap.put(AbstractC6818hX0.i, Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.I)) {
                hashMap.put("rotationX", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.J)) {
                hashMap.put("rotationY", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.N)) {
                hashMap.put("translationX", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.O)) {
                hashMap.put("translationY", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.P)) {
                hashMap.put("translationZ", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.K)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.L)) {
                hashMap.put("scaleX", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.L)) {
                hashMap.put("scaleY", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.Q)) {
                hashMap.put("progress", Integer.valueOf(this.E));
            }
            if (this.e.size() > 0) {
                Iterator<String> it = this.e.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.E));
                }
            }
        }
    }

    @Override // o.AbstractC6818hX0
    public void j(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(AbstractC6818hX0.A)) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(AbstractC6818hX0.i)) {
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
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Q = m(obj);
                return;
            case 1:
                this.D = obj.toString();
                return;
            case 2:
                this.I = m(obj);
                return;
            case 3:
                this.J = m(obj);
                return;
            case 4:
                this.N = m(obj);
                return;
            case 5:
                this.O = m(obj);
                return;
            case 6:
                this.P = m(obj);
                return;
            case 7:
                this.L = m(obj);
                return;
            case '\b':
                this.M = m(obj);
                return;
            case '\t':
                this.H = m(obj);
                return;
            case '\n':
                this.G = m(obj);
                return;
            case 11:
                this.K = m(obj);
                return;
            case '\f':
                this.F = m(obj);
                return;
            case '\r':
                this.U = m(obj);
                return;
            case 14:
                this.T = m(obj);
                return;
            case 15:
                this.E = n(obj);
                return;
            case 16:
                if (obj instanceof Integer) {
                    this.R = n(obj);
                    return;
                }
                this.R = 7;
                this.S = obj.toString();
                return;
            default:
                return;
        }
    }
}
