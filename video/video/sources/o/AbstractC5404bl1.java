package o;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o.bl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5404bl1 implements InterfaceC8148mw2 {
    public static int m = -1;
    public static final String n = "alpha";

    /* renamed from: o  reason: collision with root package name */
    public static final String f698o = "elevation";
    public static final String p = "rotationZ";
    public static final String q = "rotationX";
    public static final String r = "transitionPathRotate";
    public static final String s = "scaleX";
    public static final String t = "scaleY";
    public static final String u = "translationX";
    public static final String v = "translationY";
    public static final String w = "CUSTOM";
    public static final String x = "visibility";
    public int h;
    public int i;
    public String j;
    public int k;
    public HashMap<String, NT> l;

    public AbstractC5404bl1() {
        int i = m;
        this.h = i;
        this.i = i;
        this.j = null;
    }

    @Override // o.InterfaceC8148mw2
    public boolean b(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.h = i2;
        return true;
    }

    @Override // o.InterfaceC8148mw2
    public boolean c(int i, float f) {
        return false;
    }

    @Override // o.InterfaceC8148mw2
    public boolean d(int i, boolean z) {
        return false;
    }

    @Override // o.InterfaceC8148mw2
    public boolean e(int i, String str) {
        if (i != 101) {
            return false;
        }
        this.j = str;
        return true;
    }

    public abstract void f(HashMap<String, AbstractC4678Xa2> hashMap);

    @Override // 
    /* renamed from: g */
    public abstract AbstractC5404bl1 clone();

    public AbstractC5404bl1 h(AbstractC5404bl1 abstractC5404bl1) {
        this.h = abstractC5404bl1.h;
        this.i = abstractC5404bl1.i;
        this.j = abstractC5404bl1.j;
        this.k = abstractC5404bl1.k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.h;
    }

    public boolean k(String str) {
        String str2 = this.j;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public void l(String str, int i, float f) {
        this.l.put(str, new NT(str, i, f));
    }

    public void m(String str, int i, int i2) {
        this.l.put(str, new NT(str, i, i2));
    }

    public void n(String str, int i, String str2) {
        this.l.put(str, new NT(str, i, str2));
    }

    public void o(String str, int i, boolean z) {
        this.l.put(str, new NT(str, i, z));
    }

    public void p(int i) {
        this.h = i;
    }

    public AbstractC5404bl1 r(int i) {
        this.i = i;
        return this;
    }

    public boolean s(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    public float t(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    public int u(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }

    public void q(HashMap<String, Integer> hashMap) {
    }
}
