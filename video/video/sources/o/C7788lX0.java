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
import o.AbstractC6265fI2;

/* renamed from: o.lX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7788lX0 extends AbstractC6818hX0 {
    public static final String U = "KeyAttribute";
    public static final String V = "KeyAttributes";
    public static final boolean W = false;
    public static final int X = 1;
    public String D;
    public int E = -1;
    public boolean F = false;
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
    public float R = Float.NaN;
    public float S = Float.NaN;
    public float T = Float.NaN;

    /* renamed from: o.lX0$a */
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
        public static final int f797o = 17;
        public static final int p = 18;
        public static final int q = 19;
        public static final int r = 20;
        public static SparseIntArray s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            s = sparseIntArray;
            sparseIntArray.append(j.c.o9, 1);
            s.append(j.c.z9, 2);
            s.append(j.c.v9, 4);
            s.append(j.c.w9, 5);
            s.append(j.c.x9, 6);
            s.append(j.c.p9, 19);
            s.append(j.c.q9, 20);
            s.append(j.c.t9, 7);
            s.append(j.c.G9, 8);
            s.append(j.c.F9, 9);
            s.append(j.c.D9, 10);
            s.append(j.c.B9, 12);
            s.append(j.c.A9, 13);
            s.append(j.c.u9, 14);
            s.append(j.c.r9, 15);
            s.append(j.c.s9, 16);
            s.append(j.c.y9, 17);
            s.append(j.c.C9, 18);
        }

        public static void a(C7788lX0 c7788lX0, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (s.get(index)) {
                    case 1:
                        c7788lX0.G = typedArray.getFloat(index, c7788lX0.G);
                        break;
                    case 2:
                        c7788lX0.H = typedArray.getDimension(index, c7788lX0.H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + s.get(index));
                        break;
                    case 4:
                        c7788lX0.I = typedArray.getFloat(index, c7788lX0.I);
                        break;
                    case 5:
                        c7788lX0.J = typedArray.getFloat(index, c7788lX0.J);
                        break;
                    case 6:
                        c7788lX0.K = typedArray.getFloat(index, c7788lX0.K);
                        break;
                    case 7:
                        c7788lX0.O = typedArray.getFloat(index, c7788lX0.O);
                        break;
                    case 8:
                        c7788lX0.N = typedArray.getFloat(index, c7788lX0.N);
                        break;
                    case 9:
                        c7788lX0.D = typedArray.getString(index);
                        break;
                    case 10:
                        if (C7114il1.q3) {
                            int resourceId = typedArray.getResourceId(index, c7788lX0.b);
                            c7788lX0.b = resourceId;
                            if (resourceId == -1) {
                                c7788lX0.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c7788lX0.c = typedArray.getString(index);
                            break;
                        } else {
                            c7788lX0.b = typedArray.getResourceId(index, c7788lX0.b);
                            break;
                        }
                    case 12:
                        c7788lX0.a = typedArray.getInt(index, c7788lX0.a);
                        break;
                    case 13:
                        c7788lX0.E = typedArray.getInteger(index, c7788lX0.E);
                        break;
                    case 14:
                        c7788lX0.P = typedArray.getFloat(index, c7788lX0.P);
                        break;
                    case 15:
                        c7788lX0.Q = typedArray.getDimension(index, c7788lX0.Q);
                        break;
                    case 16:
                        c7788lX0.R = typedArray.getDimension(index, c7788lX0.R);
                        break;
                    case 17:
                        c7788lX0.S = typedArray.getDimension(index, c7788lX0.S);
                        break;
                    case 18:
                        c7788lX0.T = typedArray.getFloat(index, c7788lX0.T);
                        break;
                    case 19:
                        c7788lX0.L = typedArray.getDimension(index, c7788lX0.L);
                        break;
                    case 20:
                        c7788lX0.M = typedArray.getDimension(index, c7788lX0.M);
                        break;
                }
            }
        }
    }

    public C7788lX0() {
        this.d = 1;
        this.e = new HashMap<>();
    }

    public int T() {
        return this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // o.AbstractC6818hX0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(HashMap<String, AbstractC6265fI2> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC6265fI2 abstractC6265fI2 = hashMap.get(next);
            if (abstractC6265fI2 != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.a aVar = this.e.get(next.substring(7));
                    if (aVar != null) {
                        ((AbstractC6265fI2.b) abstractC6265fI2).n(this.a, aVar);
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
                        case -760884510:
                            if (next.equals(AbstractC6818hX0.l)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (next.equals(AbstractC6818hX0.m)) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (next.equals(AbstractC6818hX0.i)) {
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
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
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
                            if (!Float.isNaN(this.J)) {
                                abstractC6265fI2.g(this.a, this.J);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.K)) {
                                abstractC6265fI2.g(this.a, this.K);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.Q)) {
                                abstractC6265fI2.g(this.a, this.Q);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.R)) {
                                abstractC6265fI2.g(this.a, this.R);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.S)) {
                                abstractC6265fI2.g(this.a, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.T)) {
                                abstractC6265fI2.g(this.a, this.T);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.O)) {
                                abstractC6265fI2.g(this.a, this.O);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.P)) {
                                abstractC6265fI2.g(this.a, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.J)) {
                                abstractC6265fI2.g(this.a, this.L);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.K)) {
                                abstractC6265fI2.g(this.a, this.M);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.I)) {
                                abstractC6265fI2.g(this.a, this.I);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.H)) {
                                abstractC6265fI2.g(this.a, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.N)) {
                                abstractC6265fI2.g(this.a, this.N);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.G)) {
                                abstractC6265fI2.g(this.a, this.G);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    @Override // o.AbstractC6818hX0
    /* renamed from: b */
    public AbstractC6818hX0 clone() {
        return new C7788lX0().c(this);
    }

    @Override // o.AbstractC6818hX0
    public AbstractC6818hX0 c(AbstractC6818hX0 abstractC6818hX0) {
        super.c(abstractC6818hX0);
        C7788lX0 c7788lX0 = (C7788lX0) abstractC6818hX0;
        this.E = c7788lX0.E;
        this.F = c7788lX0.F;
        this.G = c7788lX0.G;
        this.H = c7788lX0.H;
        this.I = c7788lX0.I;
        this.J = c7788lX0.J;
        this.K = c7788lX0.K;
        this.L = c7788lX0.L;
        this.M = c7788lX0.M;
        this.N = c7788lX0.N;
        this.O = c7788lX0.O;
        this.P = c7788lX0.P;
        this.Q = c7788lX0.Q;
        this.R = c7788lX0.R;
        this.S = c7788lX0.S;
        this.T = c7788lX0.T;
        this.D = c7788lX0.D;
        return this;
    }

    @Override // o.AbstractC6818hX0
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(AbstractC6818hX0.i);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(AbstractC6818hX0.l);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(AbstractC6818hX0.m);
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.T)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, j.c.n9));
    }

    @Override // o.AbstractC6818hX0
    public void i(HashMap<String, Integer> hashMap) {
        if (this.E != -1) {
            if (!Float.isNaN(this.G)) {
                hashMap.put("alpha", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.H)) {
                hashMap.put("elevation", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.I)) {
                hashMap.put(AbstractC6818hX0.i, Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.J)) {
                hashMap.put("rotationX", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.K)) {
                hashMap.put("rotationY", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.L)) {
                hashMap.put(AbstractC6818hX0.l, Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.M)) {
                hashMap.put(AbstractC6818hX0.m, Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.Q)) {
                hashMap.put("translationX", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.R)) {
                hashMap.put("translationY", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.S)) {
                hashMap.put("translationZ", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.N)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.O)) {
                hashMap.put("scaleX", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.P)) {
                hashMap.put("scaleY", Integer.valueOf(this.E));
            }
            if (!Float.isNaN(this.T)) {
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
            case -760884510:
                if (str.equals(AbstractC6818hX0.l)) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(AbstractC6818hX0.m)) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(AbstractC6818hX0.i)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
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
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.T = m(obj);
                return;
            case 1:
                this.D = obj.toString();
                return;
            case 2:
                this.J = m(obj);
                return;
            case 3:
                this.K = m(obj);
                return;
            case 4:
                this.Q = m(obj);
                return;
            case 5:
                this.R = m(obj);
                return;
            case 6:
                this.S = m(obj);
                return;
            case 7:
                this.O = m(obj);
                return;
            case '\b':
                this.P = m(obj);
                return;
            case '\t':
                this.L = m(obj);
                return;
            case '\n':
                this.M = m(obj);
                return;
            case 11:
                this.I = m(obj);
                return;
            case '\f':
                this.H = m(obj);
                return;
            case '\r':
                this.N = m(obj);
                return;
            case 14:
                this.G = m(obj);
                return;
            case 15:
                this.E = n(obj);
                return;
            case 16:
                this.F = l(obj);
                return;
            default:
                return;
        }
    }
}
