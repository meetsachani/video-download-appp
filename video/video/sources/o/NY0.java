package o;

import java.util.Map;

/* loaded from: classes4.dex */
public class NY0 extends KY0 implements InterfaceC4240Sm1 {
    public String i1;
    public boolean j1;
    public boolean k1;

    public NY0() {
        this((String) null, (Map<String, Object>) null);
    }

    @Override // o.KY0
    public boolean C(String str) {
        if (str != null) {
            return this.Y.containsKey(str);
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    public void G(C80 c80) {
        n(c80.b(), c80.c());
    }

    public boolean H() {
        return this.k1;
    }

    public void I(Map<String, Object> map) {
        this.Y = map;
    }

    public void J(boolean z) {
        this.k1 = z;
    }

    @Override // o.InterfaceC4240Sm1
    public void Q(String str) {
        n(str, null);
    }

    @Override // o.InterfaceC4240Sm1
    public void a(boolean z) {
        this.j1 = z;
    }

    @Override // o.B80
    public InterfaceC10878y80 b() {
        Map<String, Object> E;
        try {
            E = (Map) z().getClass().newInstance();
        } catch (Exception unused) {
            E = E();
        }
        NY0 ny0 = new NY0(E);
        C80[] e = e();
        if (e != null) {
            for (C80 c80 : e) {
                ny0.G(c80);
            }
        }
        return ny0;
    }

    @Override // o.B80
    public C80[] e() {
        Class<?> cls;
        C80[] c80Arr = new C80[this.Y.size()];
        int i = 0;
        for (Map.Entry<String, Object> entry : this.Y.entrySet()) {
            String key = entry.getKey();
            Object obj = this.Y.get(key);
            int i2 = i + 1;
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            c80Arr[i] = new C80(key, cls);
            i = i2;
        }
        return c80Arr;
    }

    @Override // o.B80
    public String getName() {
        return this.i1;
    }

    @Override // o.InterfaceC4240Sm1
    public void i(String str, Class<?> cls, boolean z, boolean z2) {
        throw new UnsupportedOperationException("readable/writable properties not supported");
    }

    @Override // o.KY0, o.InterfaceC10878y80
    public void k(String str, Object obj) {
        if (l() && !this.Y.containsKey(str)) {
            throw new IllegalArgumentException("Invalid property name '" + str + "' (DynaClass is restricted)");
        }
        this.Y.put(str, obj);
    }

    @Override // o.InterfaceC4240Sm1
    public boolean l() {
        return this.j1;
    }

    @Override // o.InterfaceC4240Sm1
    public void n(String str, Class<?> cls) {
        Object w;
        if (str != null) {
            if (!l()) {
                if (this.Y.get(str) == null) {
                    Map<String, Object> map = this.Y;
                    if (cls == null) {
                        w = null;
                    } else {
                        w = w(str, cls);
                    }
                    map.put(str, w);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DynaClass is currently restricted. No new properties can be added.");
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    @Override // o.B80
    public C80 p(String str) {
        if (str != null) {
            if (!this.Y.containsKey(str) && H()) {
                return null;
            }
            Object obj = this.Y.get(str);
            if (obj == null) {
                return new C80(str);
            }
            return new C80(str, obj.getClass());
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    @Override // o.InterfaceC4240Sm1
    public void remove(String str) {
        if (str != null) {
            if (!l()) {
                if (this.Y.containsKey(str)) {
                    this.Y.remove(str);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DynaClass is currently restricted. No properties can be removed.");
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    @Override // o.KY0
    public Map<String, Object> z() {
        return this.Y;
    }

    public NY0(String str) {
        this(str, (Map<String, Object>) null);
    }

    public NY0(Map<String, Object> map) {
        this((String) null, map);
    }

    public NY0(String str, Map<String, Object> map) {
        this.k1 = false;
        this.i1 = str == null ? "LazyDynaMap" : str;
        this.Y = map == null ? E() : map;
        this.Y0 = this;
    }

    public NY0(C80[] c80Arr) {
        this((String) null, c80Arr);
    }

    public NY0(String str, C80[] c80Arr) {
        this(str, (Map<String, Object>) null);
        if (c80Arr != null) {
            for (C80 c80 : c80Arr) {
                G(c80);
            }
        }
    }

    public NY0(B80 b80) {
        this(b80.getName(), b80.e());
    }
}
