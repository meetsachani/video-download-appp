package o;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o.hX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6818hX0 {
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";
    public static int f = -1;
    public static final String g = "alpha";
    public static final String h = "elevation";
    public static final String i = "rotation";
    public static final String j = "rotationX";
    public static final String k = "rotationY";
    public static final String l = "transformPivotX";
    public static final String m = "transformPivotY";
    public static final String n = "transitionPathRotate";

    /* renamed from: o  reason: collision with root package name */
    public static final String f762o = "scaleX";
    public static final String p = "scaleY";
    public static final String q = "wavePeriod";
    public static final String r = "waveOffset";
    public static final String s = "wavePhase";
    public static final String t = "waveVariesBy";
    public static final String u = "translationX";
    public static final String v = "translationY";
    public static final String w = "translationZ";
    public static final String x = "progress";
    public static final String y = "CUSTOM";
    public static final String z = "curveFit";
    public int a;
    public int b;
    public String c;
    public int d;
    public HashMap<String, androidx.constraintlayout.widget.a> e;

    public AbstractC6818hX0() {
        int i2 = f;
        this.a = i2;
        this.b = i2;
        this.c = null;
    }

    public abstract void a(HashMap<String, AbstractC6265fI2> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract AbstractC6818hX0 clone();

    public AbstractC6818hX0 c(AbstractC6818hX0 abstractC6818hX0) {
        this.a = abstractC6818hX0.a;
        this.b = abstractC6818hX0.b;
        this.c = abstractC6818hX0.c;
        this.d = abstractC6818hX0.d;
        this.e = abstractC6818hX0.e;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public int e() {
        return this.a;
    }

    public abstract void f(Context context, AttributeSet attributeSet);

    public boolean g(String str) {
        String str2 = this.c;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public void h(int i2) {
        this.a = i2;
    }

    public abstract void j(String str, Object obj);

    public AbstractC6818hX0 k(int i2) {
        this.b = i2;
        return this;
    }

    public boolean l(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    public float m(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    public int n(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }

    public void i(HashMap<String, Integer> hashMap) {
    }
}
