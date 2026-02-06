package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: o.oX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8536oX0 extends AbstractC6818hX0 {
    public static final String X = "KeyCycle";
    public static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";
    public static final String a0 = "waveOffset";
    public static final String b0 = "wavePhase";
    public static final String c0 = "waveShape";
    public static final int d0 = 0;
    public static final int e0 = 1;
    public static final int f0 = 2;
    public static final int g0 = 3;
    public static final int h0 = 4;
    public static final int i0 = 5;
    public static final int j0 = 6;
    public static final int k0 = 4;
    public String D = null;
    public int E = 0;
    public int F = -1;
    public String G = null;
    public float H = Float.NaN;
    public float I = 0.0f;
    public float J = 0.0f;
    public float K = Float.NaN;
    public int L = -1;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;
    public float P = Float.NaN;
    public float Q = Float.NaN;
    public float R = Float.NaN;
    public float S = Float.NaN;
    public float T = Float.NaN;
    public float U = Float.NaN;
    public float V = Float.NaN;
    public float W = Float.NaN;

    /* renamed from: o.oX0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        public static final int i = 9;
        public static final int j = 10;
        public static final int k = 11;
        public static final int l = 12;
        public static final int m = 13;
        public static final int n = 14;

        /* renamed from: o  reason: collision with root package name */
        public static final int f827o = 15;
        public static final int p = 16;
        public static final int q = 17;
        public static final int r = 18;
        public static final int s = 19;
        public static final int t = 20;
        public static final int u = 21;
        public static SparseIntArray v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            v = sparseIntArray;
            sparseIntArray.append(j.c.V9, 1);
            v.append(j.c.T9, 2);
            v.append(j.c.W9, 3);
            v.append(j.c.S9, 4);
            v.append(j.c.ba, 5);
            v.append(j.c.Z9, 6);
            v.append(j.c.Y9, 7);
            v.append(j.c.ca, 8);
            v.append(j.c.I9, 9);
            v.append(j.c.R9, 10);
            v.append(j.c.N9, 11);
            v.append(j.c.O9, 12);
            v.append(j.c.P9, 13);
            v.append(j.c.X9, 14);
            v.append(j.c.L9, 15);
            v.append(j.c.M9, 16);
            v.append(j.c.J9, 17);
            v.append(j.c.K9, 18);
            v.append(j.c.Q9, 19);
            v.append(j.c.U9, 20);
            v.append(j.c.aa, 21);
        }

        public static void b(C8536oX0 c8536oX0, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (v.get(index)) {
                    case 1:
                        if (C7114il1.q3) {
                            int resourceId = typedArray.getResourceId(index, c8536oX0.b);
                            c8536oX0.b = resourceId;
                            if (resourceId == -1) {
                                c8536oX0.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c8536oX0.c = typedArray.getString(index);
                            break;
                        } else {
                            c8536oX0.b = typedArray.getResourceId(index, c8536oX0.b);
                            break;
                        }
                    case 2:
                        c8536oX0.a = typedArray.getInt(index, c8536oX0.a);
                        break;
                    case 3:
                        c8536oX0.D = typedArray.getString(index);
                        break;
                    case 4:
                        c8536oX0.E = typedArray.getInteger(index, c8536oX0.E);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            c8536oX0.G = typedArray.getString(index);
                            c8536oX0.F = 7;
                            break;
                        } else {
                            c8536oX0.F = typedArray.getInt(index, c8536oX0.F);
                            break;
                        }
                    case 6:
                        c8536oX0.H = typedArray.getFloat(index, c8536oX0.H);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            c8536oX0.I = typedArray.getDimension(index, c8536oX0.I);
                            break;
                        } else {
                            c8536oX0.I = typedArray.getFloat(index, c8536oX0.I);
                            break;
                        }
                    case 8:
                        c8536oX0.L = typedArray.getInt(index, c8536oX0.L);
                        break;
                    case 9:
                        c8536oX0.M = typedArray.getFloat(index, c8536oX0.M);
                        break;
                    case 10:
                        c8536oX0.N = typedArray.getDimension(index, c8536oX0.N);
                        break;
                    case 11:
                        c8536oX0.O = typedArray.getFloat(index, c8536oX0.O);
                        break;
                    case 12:
                        c8536oX0.Q = typedArray.getFloat(index, c8536oX0.Q);
                        break;
                    case 13:
                        c8536oX0.R = typedArray.getFloat(index, c8536oX0.R);
                        break;
                    case 14:
                        c8536oX0.P = typedArray.getFloat(index, c8536oX0.P);
                        break;
                    case 15:
                        c8536oX0.S = typedArray.getFloat(index, c8536oX0.S);
                        break;
                    case 16:
                        c8536oX0.T = typedArray.getFloat(index, c8536oX0.T);
                        break;
                    case 17:
                        c8536oX0.U = typedArray.getDimension(index, c8536oX0.U);
                        break;
                    case 18:
                        c8536oX0.V = typedArray.getDimension(index, c8536oX0.V);
                        break;
                    case 19:
                        c8536oX0.W = typedArray.getDimension(index, c8536oX0.W);
                        break;
                    case 20:
                        c8536oX0.K = typedArray.getFloat(index, c8536oX0.K);
                        break;
                    case 21:
                        c8536oX0.J = typedArray.getFloat(index, c8536oX0.J) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + v.get(index));
                        break;
                }
            }
        }
    }

    public C8536oX0() {
        this.d = 4;
        this.e = new HashMap<>();
    }

    @Override // o.AbstractC6818hX0
    public void a(HashMap<String, AbstractC6265fI2> hashMap) {
        AV.n("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            AbstractC6265fI2 abstractC6265fI2 = hashMap.get(str);
            if (abstractC6265fI2 != null) {
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
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals(AbstractC6818hX0.i)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
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
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = C8206nB.d;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        abstractC6265fI2.g(this.a, this.Q);
                        continue;
                    case 1:
                        abstractC6265fI2.g(this.a, this.R);
                        continue;
                    case 2:
                        abstractC6265fI2.g(this.a, this.U);
                        continue;
                    case 3:
                        abstractC6265fI2.g(this.a, this.V);
                        continue;
                    case 4:
                        abstractC6265fI2.g(this.a, this.W);
                        continue;
                    case 5:
                        abstractC6265fI2.g(this.a, this.K);
                        continue;
                    case 6:
                        abstractC6265fI2.g(this.a, this.S);
                        continue;
                    case 7:
                        abstractC6265fI2.g(this.a, this.T);
                        continue;
                    case '\b':
                        abstractC6265fI2.g(this.a, this.O);
                        continue;
                    case '\t':
                        abstractC6265fI2.g(this.a, this.N);
                        continue;
                    case '\n':
                        abstractC6265fI2.g(this.a, this.P);
                        continue;
                    case 11:
                        abstractC6265fI2.g(this.a, this.M);
                        continue;
                    case '\f':
                        abstractC6265fI2.g(this.a, this.I);
                        continue;
                    case '\r':
                        abstractC6265fI2.g(this.a, this.J);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    public void a0(HashMap<String, PH2> hashMap) {
        PH2 ph2;
        PH2 ph22;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.e.get(str.substring(7));
                if (aVar != null && aVar.j() == a.EnumC0018a.FLOAT_TYPE && (ph2 = hashMap.get(str)) != null) {
                    ph2.g(this.a, this.F, this.G, this.L, this.H, this.I, this.J, aVar.k(), aVar);
                }
            } else {
                float b02 = b0(str);
                if (!Float.isNaN(b02) && (ph22 = hashMap.get(str)) != null) {
                    ph22.f(this.a, this.F, this.G, this.L, this.H, this.I, this.J, b02);
                }
            }
        }
    }

    @Override // o.AbstractC6818hX0
    /* renamed from: b */
    public AbstractC6818hX0 clone() {
        return new C8536oX0().c(this);
    }

    public float b0(String str) {
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
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(AbstractC6818hX0.i)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = C8206nB.d;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.Q;
            case 1:
                return this.R;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.K;
            case 6:
                return this.S;
            case 7:
                return this.T;
            case '\b':
                return this.O;
            case '\t':
                return this.N;
            case '\n':
                return this.P;
            case 11:
                return this.M;
            case '\f':
                return this.I;
            case '\r':
                return this.J;
            default:
                if (!str.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                    return Float.NaN;
                }
                return Float.NaN;
        }
    }

    @Override // o.AbstractC6818hX0
    public AbstractC6818hX0 c(AbstractC6818hX0 abstractC6818hX0) {
        super.c(abstractC6818hX0);
        C8536oX0 c8536oX0 = (C8536oX0) abstractC6818hX0;
        this.D = c8536oX0.D;
        this.E = c8536oX0.E;
        this.F = c8536oX0.F;
        this.G = c8536oX0.G;
        this.H = c8536oX0.H;
        this.I = c8536oX0.I;
        this.J = c8536oX0.J;
        this.K = c8536oX0.K;
        this.L = c8536oX0.L;
        this.M = c8536oX0.M;
        this.N = c8536oX0.N;
        this.O = c8536oX0.O;
        this.P = c8536oX0.P;
        this.Q = c8536oX0.Q;
        this.R = c8536oX0.R;
        this.S = c8536oX0.S;
        this.T = c8536oX0.T;
        this.U = c8536oX0.U;
        this.V = c8536oX0.V;
        this.W = c8536oX0.W;
        return this;
    }

    @Override // o.AbstractC6818hX0
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.M)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add(AbstractC6818hX0.i);
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, j.c.H9));
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
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 16;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.K = m(obj);
                return;
            case 1:
                this.D = obj.toString();
                return;
            case 2:
                this.Q = m(obj);
                return;
            case 3:
                this.R = m(obj);
                return;
            case 4:
                this.U = m(obj);
                return;
            case 5:
                this.V = m(obj);
                return;
            case 6:
                this.W = m(obj);
                return;
            case 7:
                this.S = m(obj);
                return;
            case '\b':
                this.T = m(obj);
                return;
            case '\t':
                this.O = m(obj);
                return;
            case '\n':
                this.N = m(obj);
                return;
            case 11:
                this.P = m(obj);
                return;
            case '\f':
                this.M = m(obj);
                return;
            case '\r':
                this.I = m(obj);
                return;
            case 14:
                this.H = m(obj);
                return;
            case 15:
                this.E = n(obj);
                return;
            case 16:
                this.J = m(obj);
                return;
            case 17:
                if (obj instanceof Integer) {
                    this.F = n(obj);
                    return;
                }
                this.F = 7;
                this.G = obj.toString();
                return;
            default:
                return;
        }
    }
}
