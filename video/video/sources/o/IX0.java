package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.j;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class IX0 extends AbstractC6818hX0 {
    public static final String Y = "viewTransitionOnCross";
    public static final String Z = "viewTransitionOnPositiveCross";
    public static final String a0 = "viewTransitionOnNegativeCross";
    public static final String b0 = "postLayout";
    public static final String c0 = "triggerSlack";
    public static final String d0 = "triggerCollisionView";
    public static final String e0 = "triggerCollisionId";
    public static final String f0 = "triggerID";
    public static final String g0 = "positiveCross";
    public static final String h0 = "negativeCross";
    public static final String i0 = "triggerReceiver";
    public static final String j0 = "CROSS";
    public static final int k0 = 5;
    public static final String l0 = "KeyTrigger";
    public static final String m0 = "KeyTrigger";
    public float D = 0.1f;
    public int E;
    public int F;
    public int G;
    public RectF H;
    public RectF I;
    public HashMap<String, Method> J;
    public int K;
    public String L;
    public int M;
    public String N;
    public String O;
    public int P;
    public int Q;
    public View R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public float W;
    public boolean X;

    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 5;
        public static final int e = 6;
        public static final int f = 7;
        public static final int g = 8;
        public static final int h = 9;
        public static final int i = 10;
        public static final int j = 11;
        public static final int k = 12;
        public static final int l = 13;
        public static final int m = 14;
        public static SparseIntArray n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(j.c.Qa, 8);
            n.append(j.c.Ua, 4);
            n.append(j.c.Va, 1);
            n.append(j.c.Wa, 2);
            n.append(j.c.Ra, 7);
            n.append(j.c.Xa, 6);
            n.append(j.c.Za, 5);
            n.append(j.c.Ta, 9);
            n.append(j.c.Sa, 10);
            n.append(j.c.Ya, 11);
            n.append(j.c.ab, 12);
            n.append(j.c.bb, 13);
            n.append(j.c.cb, 14);
        }

        public static void a(IX0 ix0, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (n.get(index)) {
                    case 1:
                        ix0.N = typedArray.getString(index);
                        break;
                    case 2:
                        ix0.O = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + n.get(index));
                        break;
                    case 4:
                        ix0.L = typedArray.getString(index);
                        break;
                    case 5:
                        ix0.D = typedArray.getFloat(index, ix0.D);
                        break;
                    case 6:
                        ix0.P = typedArray.getResourceId(index, ix0.P);
                        break;
                    case 7:
                        if (C7114il1.q3) {
                            int resourceId = typedArray.getResourceId(index, ix0.b);
                            ix0.b = resourceId;
                            if (resourceId == -1) {
                                ix0.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            ix0.c = typedArray.getString(index);
                            break;
                        } else {
                            ix0.b = typedArray.getResourceId(index, ix0.b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, ix0.a);
                        ix0.a = integer;
                        ix0.V = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        ix0.Q = typedArray.getResourceId(index, ix0.Q);
                        break;
                    case 10:
                        ix0.X = typedArray.getBoolean(index, ix0.X);
                        break;
                    case 11:
                        ix0.M = typedArray.getResourceId(index, ix0.M);
                        break;
                    case 12:
                        ix0.G = typedArray.getResourceId(index, ix0.G);
                        break;
                    case 13:
                        ix0.E = typedArray.getResourceId(index, ix0.E);
                        break;
                    case 14:
                        ix0.F = typedArray.getResourceId(index, ix0.F);
                        break;
                }
            }
        }
    }

    public IX0() {
        int i = AbstractC6818hX0.f;
        this.E = i;
        this.F = i;
        this.G = i;
        this.H = new RectF();
        this.I = new RectF();
        this.J = new HashMap<>();
        this.K = -1;
        this.L = null;
        int i2 = AbstractC6818hX0.f;
        this.M = i2;
        this.N = null;
        this.O = null;
        this.P = i2;
        this.Q = i2;
        this.R = null;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = Float.NaN;
        this.X = false;
        this.d = 5;
        this.e = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.Q != AbstractC6818hX0.f) {
            if (this.R == null) {
                this.R = ((ViewGroup) view.getParent()).findViewById(this.Q);
            }
            E(this.H, this.R, this.X);
            E(this.I, view, this.X);
            if (this.H.intersect(this.I)) {
                if (this.S) {
                    this.S = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.U) {
                    this.U = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.T = true;
            } else {
                if (!this.S) {
                    this.S = true;
                    z = true;
                } else {
                    z = false;
                }
                if (this.T) {
                    this.T = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.U = true;
                z6 = z4;
                z3 = false;
            }
        } else {
            if (this.S) {
                float f2 = this.V;
                if ((f - f2) * (this.W - f2) < 0.0f) {
                    this.S = false;
                    z = true;
                    if (!this.T) {
                        float f3 = this.V;
                        float f4 = f - f3;
                        if ((this.W - f3) * f4 < 0.0f && f4 < 0.0f) {
                            this.T = false;
                            z2 = true;
                            if (this.U) {
                                float f5 = this.V;
                                float f6 = f - f5;
                                if ((this.W - f5) * f6 < 0.0f && f6 > 0.0f) {
                                    this.U = false;
                                } else {
                                    z5 = false;
                                }
                                z3 = z5;
                            } else {
                                if (Math.abs(f - this.V) > this.D) {
                                    this.U = true;
                                }
                                z3 = false;
                            }
                            z6 = z2;
                        }
                    } else if (Math.abs(f - this.V) > this.D) {
                        this.T = true;
                    }
                    z2 = false;
                    if (this.U) {
                    }
                    z6 = z2;
                }
            } else if (Math.abs(f - this.V) > this.D) {
                this.S = true;
            }
            z = false;
            if (!this.T) {
            }
            z2 = false;
            if (this.U) {
            }
            z6 = z2;
        }
        this.W = f;
        if (z6 || z || z3) {
            ((C7114il1) view.getParent()).D0(this.P, z3, f);
        }
        if (this.M == AbstractC6818hX0.f) {
            findViewById = view;
        } else {
            findViewById = ((C7114il1) view.getParent()).findViewById(this.M);
        }
        if (z6) {
            String str = this.N;
            if (str != null) {
                B(str, findViewById);
            }
            if (this.E != AbstractC6818hX0.f) {
                ((C7114il1) view.getParent()).s1(this.E, findViewById);
            }
        }
        if (z3) {
            String str2 = this.O;
            if (str2 != null) {
                B(str2, findViewById);
            }
            if (this.F != AbstractC6818hX0.f) {
                ((C7114il1) view.getParent()).s1(this.F, findViewById);
            }
        }
        if (z) {
            String str3 = this.L;
            if (str3 != null) {
                B(str3, findViewById);
            }
            if (this.G != AbstractC6818hX0.f) {
                ((C7114il1) view.getParent()).s1(this.G, findViewById);
            }
        }
    }

    public final void B(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(UE.h)) {
                C(str, view);
                return;
            }
            if (this.J.containsKey(str)) {
                method = this.J.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.J.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.J.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + C4500Ve2.b + AV.k(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.L + "\"on class " + view.getClass().getSimpleName() + C4500Ve2.b + AV.k(view));
            }
        }
    }

    public final void C(String str, View view) {
        boolean z;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    public int D() {
        return this.K;
    }

    public final void E(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // o.AbstractC6818hX0
    /* renamed from: b */
    public AbstractC6818hX0 clone() {
        return new IX0().c(this);
    }

    @Override // o.AbstractC6818hX0
    public AbstractC6818hX0 c(AbstractC6818hX0 abstractC6818hX0) {
        super.c(abstractC6818hX0);
        IX0 ix0 = (IX0) abstractC6818hX0;
        this.K = ix0.K;
        this.L = ix0.L;
        this.M = ix0.M;
        this.N = ix0.N;
        this.O = ix0.O;
        this.P = ix0.P;
        this.Q = ix0.Q;
        this.R = ix0.R;
        this.D = ix0.D;
        this.S = ix0.S;
        this.T = ix0.T;
        this.U = ix0.U;
        this.V = ix0.V;
        this.W = ix0.W;
        this.X = ix0.X;
        this.H = ix0.H;
        this.I = ix0.I;
        this.J = ix0.J;
        return this;
    }

    @Override // o.AbstractC6818hX0
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, j.c.Pa), context);
    }

    @Override // o.AbstractC6818hX0
    public void j(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c = 7;
                    break;
                }
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = '\b';
                    break;
                }
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\t';
                    break;
                }
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\n';
                    break;
                }
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.O = obj.toString();
                return;
            case 1:
                this.F = n(obj);
                return;
            case 2:
                this.Q = n(obj);
                return;
            case 3:
                this.P = n(obj);
                return;
            case 4:
                this.N = obj.toString();
                return;
            case 5:
                this.R = (View) obj;
                return;
            case 6:
                this.E = n(obj);
                return;
            case 7:
                this.L = obj.toString();
                return;
            case '\b':
                this.D = m(obj);
                return;
            case '\t':
                this.G = n(obj);
                return;
            case '\n':
                this.X = l(obj);
                return;
            case 11:
                this.M = n(obj);
                return;
            default:
                return;
        }
    }

    @Override // o.AbstractC6818hX0
    public void a(HashMap<String, AbstractC6265fI2> hashMap) {
    }

    @Override // o.AbstractC6818hX0
    public void d(HashSet<String> hashSet) {
    }
}
