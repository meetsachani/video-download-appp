package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.U0;

/* renamed from: o.Xl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4721Xl1 implements XT0, Serializable {
    private static final long serialVersionUID = -1788199231038721040L;
    public final U0 X;

    public C4721Xl1() {
        this.X = new AG0();
    }

    public static C4721Xl1 f(U0 u0) {
        if (u0 != null) {
            if (u0.size() <= 0) {
                return new C4721Xl1(u0);
            }
            throw new IllegalArgumentException("Map must be empty");
        }
        throw new IllegalArgumentException("Map must not be null");
    }

    public Object A(Object obj, Object obj2, Object obj3) {
        int m = m(obj, obj2, obj3);
        U0 u0 = this.X;
        int z = u0.z(m, u0.Z.length);
        U0.c cVar = null;
        for (U0.c cVar2 = this.X.Z[z]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == m && t(cVar2, obj, obj2, obj3)) {
                Object value = cVar2.getValue();
                this.X.E(cVar2, z, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    public Object B(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int n = n(obj, obj2, obj3, obj4);
        U0 u0 = this.X;
        int z = u0.z(n, u0.Z.length);
        U0.c cVar = this.X.Z[z];
        U0.c cVar2 = null;
        while (cVar != null) {
            if (cVar.Y == n) {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (u(cVar, obj5, obj6, obj7, obj8)) {
                    Object value = cVar.getValue();
                    this.X.E(cVar, z, cVar2);
                    return value;
                }
            } else {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
            }
            cVar2 = cVar;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            cVar = cVar.X;
            obj = obj5;
        }
        return null;
    }

    public Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int o2 = o(obj, obj2, obj3, obj4, obj5);
        U0 u0 = this.X;
        int z = u0.z(o2, u0.Z.length);
        U0.c cVar = null;
        for (U0.c cVar2 = this.X.Z[z]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == o2 && v(cVar2, obj, obj2, obj3, obj4, obj5)) {
                Object value = cVar2.getValue();
                this.X.E(cVar2, z, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    public boolean D(Object obj) {
        V71 p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4527Vl1 c4527Vl1 = (C4527Vl1) p.next();
            if (c4527Vl1.d() >= 1) {
                Object b = c4527Vl1.b(0);
                if (obj == null) {
                    if (b == null) {
                        p.remove();
                        z = true;
                    }
                } else if (obj.equals(b)) {
                    p.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E(Object obj, Object obj2) {
        V71 p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4527Vl1 c4527Vl1 = (C4527Vl1) p.next();
            if (c4527Vl1.d() >= 2) {
                Object b = c4527Vl1.b(0);
                if (obj == null) {
                    if (b == null) {
                        Object b2 = c4527Vl1.b(1);
                        if (obj2 != null) {
                            if (b2 == null) {
                                p.remove();
                                z = true;
                            }
                        } else if (obj2.equals(b2)) {
                            p.remove();
                            z = true;
                        }
                    }
                } else if (obj.equals(b)) {
                    Object b22 = c4527Vl1.b(1);
                    if (obj2 != null) {
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean F(Object obj, Object obj2, Object obj3) {
        V71 p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4527Vl1 c4527Vl1 = (C4527Vl1) p.next();
            if (c4527Vl1.d() >= 3) {
                Object b = c4527Vl1.b(0);
                if (obj == null) {
                    if (b == null) {
                        Object b2 = c4527Vl1.b(1);
                        if (obj2 != null) {
                            if (b2 == null) {
                                Object b3 = c4527Vl1.b(2);
                                if (obj3 != null) {
                                    if (b3 == null) {
                                        p.remove();
                                        z = true;
                                    }
                                } else if (obj3.equals(b3)) {
                                    p.remove();
                                    z = true;
                                }
                            }
                        } else if (obj2.equals(b2)) {
                            Object b32 = c4527Vl1.b(2);
                            if (obj3 != null) {
                            }
                        }
                    }
                } else if (obj.equals(b)) {
                    Object b22 = c4527Vl1.b(1);
                    if (obj2 != null) {
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean G(Object obj, Object obj2, Object obj3, Object obj4) {
        V71 p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4527Vl1 c4527Vl1 = (C4527Vl1) p.next();
            if (c4527Vl1.d() >= 4) {
                Object b = c4527Vl1.b(0);
                if (obj == null) {
                    if (b == null) {
                        Object b2 = c4527Vl1.b(1);
                        if (obj2 != null) {
                            if (b2 == null) {
                                Object b3 = c4527Vl1.b(2);
                                if (obj3 != null) {
                                    if (b3 == null) {
                                        Object b4 = c4527Vl1.b(3);
                                        if (obj4 != null) {
                                            if (b4 == null) {
                                                p.remove();
                                                z = true;
                                            }
                                        } else if (obj4.equals(b4)) {
                                            p.remove();
                                            z = true;
                                        }
                                    }
                                } else if (obj3.equals(b3)) {
                                    Object b42 = c4527Vl1.b(3);
                                    if (obj4 != null) {
                                    }
                                }
                            }
                        } else if (obj2.equals(b2)) {
                            Object b32 = c4527Vl1.b(2);
                            if (obj3 != null) {
                            }
                        }
                    }
                } else if (obj.equals(b)) {
                    Object b22 = c4527Vl1.b(1);
                    if (obj2 != null) {
                    }
                }
            }
        }
        return z;
    }

    public void a(Object obj) {
        if (obj != null) {
            if (obj instanceof C4527Vl1) {
                return;
            }
            throw new ClassCastException("Key must be a MultiKey");
        }
        throw new NullPointerException("Key must not be null");
    }

    public boolean b(Object obj, Object obj2) {
        int l = l(obj, obj2);
        U0 u0 = this.X;
        U0.c[] cVarArr = u0.Z;
        for (U0.c cVar = cVarArr[u0.z(l, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == l && r(cVar, obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Object obj, Object obj2, Object obj3) {
        int m = m(obj, obj2, obj3);
        U0 u0 = this.X;
        U0.c[] cVarArr = u0.Z;
        for (U0.c cVar = cVarArr[u0.z(m, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == m && t(cVar, obj, obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        this.X.clear();
    }

    public Object clone() {
        return new C4721Xl1((U0) this.X.clone());
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.X.containsValue(obj);
    }

    public boolean d(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int n = n(obj, obj2, obj3, obj4);
        U0 u0 = this.X;
        U0.c[] cVarArr = u0.Z;
        U0.c cVar = cVarArr[u0.z(n, cVarArr.length)];
        while (cVar != null) {
            if (cVar.Y == n) {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (u(cVar, obj5, obj6, obj7, obj8)) {
                    return true;
                }
            } else {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
            }
            cVar = cVar.X;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        return false;
    }

    public boolean e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        int o2 = o(obj, obj2, obj3, obj4, obj5);
        C4721Xl1 c4721Xl1 = this;
        U0 u0 = c4721Xl1.X;
        U0.c[] cVarArr = u0.Z;
        U0.c cVar = cVarArr[u0.z(o2, cVarArr.length)];
        while (cVar != null) {
            if (cVar.Y == o2) {
                obj6 = obj;
                if (c4721Xl1.v(cVar, obj6, obj2, obj3, obj4, obj5)) {
                    return true;
                }
            } else {
                obj6 = obj;
            }
            cVar = cVar.X;
            c4721Xl1 = this;
            obj = obj6;
        }
        return false;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.X.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.X.equals(obj);
    }

    public Object g(Object obj, Object obj2) {
        int l = l(obj, obj2);
        U0 u0 = this.X;
        U0.c[] cVarArr = u0.Z;
        for (U0.c cVar = cVarArr[u0.z(l, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == l && r(cVar, obj, obj2)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.X.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.X.hashCode();
    }

    public Object i(Object obj, Object obj2, Object obj3) {
        int m = m(obj, obj2, obj3);
        U0 u0 = this.X;
        U0.c[] cVarArr = u0.Z;
        for (U0.c cVar = cVarArr[u0.z(m, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == m && t(cVar, obj, obj2, obj3)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    public Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int n = n(obj, obj2, obj3, obj4);
        U0 u0 = this.X;
        U0.c[] cVarArr = u0.Z;
        U0.c cVar = cVarArr[u0.z(n, cVarArr.length)];
        while (cVar != null) {
            if (cVar.Y == n) {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (u(cVar, obj5, obj6, obj7, obj8)) {
                    return cVar.getValue();
                }
            } else {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
            }
            cVar = cVar.X;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        return null;
    }

    public Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        int o2 = o(obj, obj2, obj3, obj4, obj5);
        C4721Xl1 c4721Xl1 = this;
        U0 u0 = c4721Xl1.X;
        U0.c[] cVarArr = u0.Z;
        U0.c cVar = cVarArr[u0.z(o2, cVarArr.length)];
        while (cVar != null) {
            if (cVar.Y == o2) {
                obj6 = obj;
                if (c4721Xl1.v(cVar, obj6, obj2, obj3, obj4, obj5)) {
                    return cVar.getValue();
                }
            } else {
                obj6 = obj;
            }
            cVar = cVar.X;
            c4721Xl1 = this;
            obj = obj6;
        }
        return null;
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.X.keySet();
    }

    public int l(Object obj, Object obj2) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj2 != null) {
            i ^= obj2.hashCode();
        }
        int i2 = i + (~(i << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    public int m(Object obj, Object obj2, Object obj3) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj2 != null) {
            i ^= obj2.hashCode();
        }
        if (obj3 != null) {
            i ^= obj3.hashCode();
        }
        int i2 = i + (~(i << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    public int n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj2 != null) {
            i ^= obj2.hashCode();
        }
        if (obj3 != null) {
            i ^= obj3.hashCode();
        }
        if (obj4 != null) {
            i ^= obj4.hashCode();
        }
        int i2 = i + (~(i << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    public int o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj2 != null) {
            i ^= obj2.hashCode();
        }
        if (obj3 != null) {
            i ^= obj3.hashCode();
        }
        if (obj4 != null) {
            i ^= obj4.hashCode();
        }
        if (obj5 != null) {
            i ^= obj5.hashCode();
        }
        int i2 = i + (~(i << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    @Override // o.XT0
    public V71 p() {
        return this.X.p();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        a(obj);
        return this.X.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Object obj : map.keySet()) {
            a(obj);
        }
        this.X.putAll(map);
    }

    public boolean r(U0.c cVar, Object obj, Object obj2) {
        C4527Vl1 c4527Vl1 = (C4527Vl1) cVar.getKey();
        if (c4527Vl1.d() == 2 && (obj != null ? obj.equals(c4527Vl1.b(0)) : c4527Vl1.b(0) == null)) {
            Object b = c4527Vl1.b(1);
            if (obj2 != null ? obj2.equals(b) : b == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Object remove(Object obj, Object obj2) {
        int l = l(obj, obj2);
        U0 u0 = this.X;
        int z = u0.z(l, u0.Z.length);
        U0.c cVar = null;
        for (U0.c cVar2 = this.X.Z[z]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == l && r(cVar2, obj, obj2)) {
                Object value = cVar2.getValue();
                this.X.E(cVar2, z, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.X.size();
    }

    public boolean t(U0.c cVar, Object obj, Object obj2, Object obj3) {
        C4527Vl1 c4527Vl1 = (C4527Vl1) cVar.getKey();
        if (c4527Vl1.d() == 3 && (obj != null ? obj.equals(c4527Vl1.b(0)) : c4527Vl1.b(0) == null) && (obj2 != null ? obj2.equals(c4527Vl1.b(1)) : c4527Vl1.b(1) == null)) {
            Object b = c4527Vl1.b(2);
            if (obj3 != null ? obj3.equals(b) : b == null) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.X.toString();
    }

    public boolean u(U0.c cVar, Object obj, Object obj2, Object obj3, Object obj4) {
        C4527Vl1 c4527Vl1 = (C4527Vl1) cVar.getKey();
        if (c4527Vl1.d() == 4 && (obj != null ? obj.equals(c4527Vl1.b(0)) : c4527Vl1.b(0) == null) && (obj2 != null ? obj2.equals(c4527Vl1.b(1)) : c4527Vl1.b(1) == null)) {
            Object b = c4527Vl1.b(2);
            if (obj3 != null ? obj3.equals(b) : b == null) {
                Object b2 = c4527Vl1.b(3);
                if (obj4 != null ? obj4.equals(b2) : b2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean v(U0.c cVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C4527Vl1 c4527Vl1 = (C4527Vl1) cVar.getKey();
        if (c4527Vl1.d() == 5 && (obj != null ? obj.equals(c4527Vl1.b(0)) : c4527Vl1.b(0) == null) && (obj2 != null ? obj2.equals(c4527Vl1.b(1)) : c4527Vl1.b(1) == null)) {
            Object b = c4527Vl1.b(2);
            if (obj3 != null ? obj3.equals(b) : b == null) {
                Object b2 = c4527Vl1.b(3);
                if (obj4 != null ? obj4.equals(b2) : b2 == null) {
                    Object b3 = c4527Vl1.b(4);
                    if (obj5 != null ? obj5.equals(b3) : b3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Collection values() {
        return this.X.values();
    }

    public Object w(Object obj, Object obj2, Object obj3) {
        int l = l(obj, obj2);
        U0 u0 = this.X;
        int z = u0.z(l, u0.Z.length);
        for (U0.c cVar = this.X.Z[z]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == l && r(cVar, obj, obj2)) {
                Object value = cVar.getValue();
                this.X.G(cVar, obj3);
                return value;
            }
        }
        this.X.c(z, l, new C4527Vl1(obj, obj2), obj3);
        return null;
    }

    public Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        int m = m(obj, obj2, obj3);
        U0 u0 = this.X;
        int z = u0.z(m, u0.Z.length);
        for (U0.c cVar = this.X.Z[z]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == m && t(cVar, obj, obj2, obj3)) {
                Object value = cVar.getValue();
                this.X.G(cVar, obj4);
                return value;
            }
        }
        this.X.c(z, m, new C4527Vl1(obj, obj2, obj3), obj4);
        return null;
    }

    public Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int n = n(obj, obj2, obj3, obj4);
        U0 u0 = this.X;
        int z = u0.z(n, u0.Z.length);
        U0.c cVar = this.X.Z[z];
        while (cVar != null) {
            Object obj6 = obj;
            Object obj7 = obj2;
            Object obj8 = obj3;
            Object obj9 = obj4;
            if (cVar.Y == n && u(cVar, obj6, obj7, obj8, obj9)) {
                Object value = cVar.getValue();
                this.X.G(cVar, obj5);
                return value;
            }
            cVar = cVar.X;
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
        }
        this.X.c(z, n, new C4527Vl1(obj, obj2, obj3, obj4), obj5);
        return null;
    }

    public Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7;
        C4721Xl1 c4721Xl1;
        U0.c cVar;
        Object obj8;
        int o2 = o(obj, obj2, obj3, obj4, obj5);
        C4721Xl1 c4721Xl12 = this;
        U0 u0 = c4721Xl12.X;
        int z = u0.z(o2, u0.Z.length);
        U0.c cVar2 = c4721Xl12.X.Z[z];
        while (cVar2 != null) {
            if (cVar2.Y == o2) {
                Object obj9 = obj;
                Object obj10 = obj2;
                boolean v = c4721Xl12.v(cVar2, obj9, obj10, obj3, obj4, obj5);
                c4721Xl1 = c4721Xl12;
                cVar = cVar2;
                obj8 = obj9;
                obj7 = obj10;
                if (v) {
                    Object value = cVar.getValue();
                    c4721Xl1.X.G(cVar, obj6);
                    return value;
                }
            } else {
                obj7 = obj2;
                c4721Xl1 = c4721Xl12;
                cVar = cVar2;
                obj8 = obj;
            }
            U0.c cVar3 = cVar.X;
            Object obj11 = obj8;
            cVar2 = cVar3;
            obj = obj11;
            c4721Xl12 = c4721Xl1;
            obj2 = obj7;
        }
        c4721Xl12.X.c(z, o2, new C4527Vl1(obj, obj2, obj3, obj4, obj5), obj6);
        return null;
    }

    public C4721Xl1(U0 u0) {
        this.X = u0;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.X.remove(obj);
    }
}
