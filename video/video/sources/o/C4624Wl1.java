package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import o.V0;

/* renamed from: o.Wl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4624Wl1<K, V> extends I1<C4430Ul1<? extends K>, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -1788199231038721040L;

    public C4624Wl1() {
        this(new C11153zG0());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    public static <K, V> C4624Wl1<K, V> z(V0<C4430Ul1<? extends K>, V> v0) {
        if (v0 != null) {
            if (v0.size() <= 0) {
                return new C4624Wl1<>(v0);
            }
            throw new IllegalArgumentException("Map must be empty");
        }
        throw new NullPointerException("Map must not be null");
    }

    public V A(K k, K k2, V v) {
        int o2 = o(k, k2);
        int B = b().B(o2, b().Z.length);
        for (V0.c<K, V> cVar = b().Z[B]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == o2 && v(cVar, k, k2)) {
                V value = cVar.getValue();
                b().I(cVar, v);
                return value;
            }
        }
        b().d(B, o2, new C4430Ul1<>(k, k2), v);
        return null;
    }

    public V B(K k, K k2, K k3, V v) {
        int r = r(k, k2, k3);
        int B = b().B(r, b().Z.length);
        for (V0.c<K, V> cVar = b().Z[B]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == r && w(cVar, k, k2, k3)) {
                V value = cVar.getValue();
                b().I(cVar, v);
                return value;
            }
        }
        b().d(B, r, new C4430Ul1<>(k, k2, k3), v);
        return null;
    }

    public V C(K k, K k2, K k3, K k4, V v) {
        K k5;
        K k6;
        K k7;
        K k8;
        int t = t(k, k2, k3, k4);
        int B = b().B(t, b().Z.length);
        V0.c<K, V> cVar = b().Z[B];
        while (cVar != null) {
            if (cVar.Y == t) {
                k5 = k;
                k6 = k2;
                k7 = k3;
                k8 = k4;
                if (x(cVar, k5, k6, k7, k8)) {
                    V value = cVar.getValue();
                    b().I(cVar, v);
                    return value;
                }
            } else {
                k5 = k;
                k6 = k2;
                k7 = k3;
                k8 = k4;
            }
            cVar = cVar.X;
            k = k5;
            k2 = k6;
            k3 = k7;
            k4 = k8;
        }
        b().d(B, t, new C4430Ul1<>(k, k2, k3, k4), v);
        return null;
    }

    public V D(K k, K k2, K k3, K k4, K k5, V v) {
        int u = u(k, k2, k3, k4, k5);
        int B = b().B(u, b().Z.length);
        for (V0.c<K, V> cVar = b().Z[B]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == u && y(cVar, k, k2, k3, k4, k5)) {
                V value = cVar.getValue();
                b().I(cVar, v);
                return value;
            }
        }
        b().d(B, u, new C4430Ul1<>(k, k2, k3, k4, k5), v);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.I1, java.util.Map, o.OK1
    /* renamed from: E */
    public V put(C4430Ul1<? extends K> c4430Ul1, V v) {
        c(c4430Ul1);
        return (V) super.put(c4430Ul1, v);
    }

    public boolean F(Object obj) {
        U71<C4430Ul1<? extends K>, V> p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4430Ul1<? extends K> next = p.next();
            if (next.d() >= 1) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        p.remove();
                        z = true;
                    }
                } else if (obj.equals(next.b(0))) {
                    p.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean G(Object obj, Object obj2) {
        U71<C4430Ul1<? extends K>, V> p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4430Ul1<? extends K> next = p.next();
            if (next.d() >= 2) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        if (obj2 != null) {
                            if (next.b(1) == null) {
                                p.remove();
                                z = true;
                            }
                        } else if (obj2.equals(next.b(1))) {
                            p.remove();
                            z = true;
                        }
                    }
                } else if (obj.equals(next.b(0))) {
                    if (obj2 != null) {
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean H(Object obj, Object obj2, Object obj3) {
        U71<C4430Ul1<? extends K>, V> p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4430Ul1<? extends K> next = p.next();
            if (next.d() >= 3) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        if (obj2 != null) {
                            if (next.b(1) == null) {
                                if (obj3 != null) {
                                    if (next.b(2) == null) {
                                        p.remove();
                                        z = true;
                                    }
                                } else if (obj3.equals(next.b(2))) {
                                    p.remove();
                                    z = true;
                                }
                            }
                        } else if (obj2.equals(next.b(1))) {
                            if (obj3 != null) {
                            }
                        }
                    }
                } else if (obj.equals(next.b(0))) {
                    if (obj2 != null) {
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean I(Object obj, Object obj2, Object obj3, Object obj4) {
        U71<C4430Ul1<? extends K>, V> p = p();
        boolean z = false;
        while (p.hasNext()) {
            C4430Ul1<? extends K> next = p.next();
            if (next.d() >= 4) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        if (obj2 != null) {
                            if (next.b(1) == null) {
                                if (obj3 != null) {
                                    if (next.b(2) == null) {
                                        if (obj4 != null) {
                                            if (next.b(3) == null) {
                                                p.remove();
                                                z = true;
                                            }
                                        } else if (obj4.equals(next.b(3))) {
                                            p.remove();
                                            z = true;
                                        }
                                    }
                                } else if (obj3.equals(next.b(2))) {
                                    if (obj4 != null) {
                                    }
                                }
                            }
                        } else if (obj2.equals(next.b(1))) {
                            if (obj3 != null) {
                            }
                        }
                    }
                } else if (obj.equals(next.b(0))) {
                    if (obj2 != null) {
                    }
                }
            }
        }
        return z;
    }

    public V J(Object obj, Object obj2) {
        int o2 = o(obj, obj2);
        int B = b().B(o2, b().Z.length);
        V0.c<C4430Ul1<? extends K>, V> cVar = null;
        for (V0.c<C4430Ul1<? extends K>, V> cVar2 = b().Z[B]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == o2 && v(cVar2, obj, obj2)) {
                V value = cVar2.getValue();
                b().G(cVar2, B, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    public V K(Object obj, Object obj2, Object obj3) {
        int r = r(obj, obj2, obj3);
        int B = b().B(r, b().Z.length);
        V0.c<C4430Ul1<? extends K>, V> cVar = null;
        for (V0.c<C4430Ul1<? extends K>, V> cVar2 = b().Z[B]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == r && w(cVar2, obj, obj2, obj3)) {
                V value = cVar2.getValue();
                b().G(cVar2, B, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    public V L(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int t = t(obj, obj2, obj3, obj4);
        int B = b().B(t, b().Z.length);
        V0.c<C4430Ul1<? extends K>, V> cVar = b().Z[B];
        V0.c<C4430Ul1<? extends K>, V> cVar2 = null;
        while (cVar != null) {
            if (cVar.Y == t) {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (x(cVar, obj5, obj6, obj7, obj8)) {
                    V value = cVar.getValue();
                    b().G(cVar, B, cVar2);
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

    public V N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int u = u(obj, obj2, obj3, obj4, obj5);
        int B = b().B(u, b().Z.length);
        V0.c<C4430Ul1<? extends K>, V> cVar = b().Z[B];
        V0.c<C4430Ul1<? extends K>, V> cVar2 = null;
        while (cVar != null) {
            if (cVar.Y == u && y(cVar, obj, obj2, obj3, obj4, obj5)) {
                V value = cVar.getValue();
                b().G(cVar, B, cVar2);
                return value;
            }
            V0.c<C4430Ul1<? extends K>, V> cVar3 = cVar;
            cVar = cVar.X;
            cVar2 = cVar3;
        }
        return null;
    }

    public void c(C4430Ul1<?> c4430Ul1) {
        if (c4430Ul1 != null) {
            return;
        }
        throw new NullPointerException("Key must not be null");
    }

    /* renamed from: d */
    public C4624Wl1<K, V> clone() {
        try {
            return (C4624Wl1) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean e(Object obj, Object obj2) {
        int o2 = o(obj, obj2);
        for (V0.c<K, V> cVar = b().Z[b().B(o2, b().Z.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == o2 && v(cVar, obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(Object obj, Object obj2, Object obj3) {
        int r = r(obj, obj2, obj3);
        for (V0.c<K, V> cVar = b().Z[b().B(r, b().Z.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == r && w(cVar, obj, obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int t = t(obj, obj2, obj3, obj4);
        V0.c<K, V> cVar = b().Z[b().B(t, b().Z.length)];
        while (cVar != null) {
            if (cVar.Y == t) {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (x(cVar, obj5, obj6, obj7, obj8)) {
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

    public boolean i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        int u = u(obj, obj2, obj3, obj4, obj5);
        V0.c<K, V> cVar = b().Z[b().B(u, b().Z.length)];
        while (cVar != null) {
            if (cVar.Y == u) {
                obj6 = obj;
                if (y(cVar, obj6, obj2, obj3, obj4, obj5)) {
                    return true;
                }
            } else {
                obj6 = obj;
            }
            cVar = cVar.X;
            obj = obj6;
        }
        return false;
    }

    @Override // o.I1
    /* renamed from: j */
    public V0<C4430Ul1<? extends K>, V> b() {
        return (V0) super.b();
    }

    public V k(Object obj, Object obj2) {
        int o2 = o(obj, obj2);
        for (V0.c<K, V> cVar = b().Z[b().B(o2, b().Z.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == o2 && v(cVar, obj, obj2)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    public V l(Object obj, Object obj2, Object obj3) {
        int r = r(obj, obj2, obj3);
        for (V0.c<K, V> cVar = b().Z[b().B(r, b().Z.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == r && w(cVar, obj, obj2, obj3)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    public V m(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int t = t(obj, obj2, obj3, obj4);
        V0.c<K, V> cVar = b().Z[b().B(t, b().Z.length)];
        while (cVar != null) {
            if (cVar.Y == t) {
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (x(cVar, obj5, obj6, obj7, obj8)) {
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

    public V n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        int u = u(obj, obj2, obj3, obj4, obj5);
        V0.c<K, V> cVar = b().Z[b().B(u, b().Z.length)];
        while (cVar != null) {
            if (cVar.Y == u) {
                obj6 = obj;
                if (y(cVar, obj6, obj2, obj3, obj4, obj5)) {
                    return cVar.getValue();
                }
            } else {
                obj6 = obj;
            }
            cVar = cVar.X;
            obj = obj6;
        }
        return null;
    }

    public int o(Object obj, Object obj2) {
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

    @Override // o.AbstractC5951e1, o.VT0
    public U71<C4430Ul1<? extends K>, V> p() {
        return b().p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends C4430Ul1<? extends K>, ? extends V> map) {
        for (C4430Ul1<?> c4430Ul1 : map.keySet()) {
            c(c4430Ul1);
        }
        super.putAll(map);
    }

    public int r(Object obj, Object obj2, Object obj3) {
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

    public int t(Object obj, Object obj2, Object obj3, Object obj4) {
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

    public int u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
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

    public boolean v(V0.c<C4430Ul1<? extends K>, V> cVar, Object obj, Object obj2) {
        C4430Ul1<? extends K> key = cVar.getKey();
        if (key.d() != 2 || ((obj != key.b(0) && (obj == null || !obj.equals(key.b(0)))) || (obj2 != key.b(1) && (obj2 == null || !obj2.equals(key.b(1)))))) {
            return false;
        }
        return true;
    }

    public boolean w(V0.c<C4430Ul1<? extends K>, V> cVar, Object obj, Object obj2, Object obj3) {
        C4430Ul1<? extends K> key = cVar.getKey();
        if (key.d() != 3 || ((obj != key.b(0) && (obj == null || !obj.equals(key.b(0)))) || ((obj2 != key.b(1) && (obj2 == null || !obj2.equals(key.b(1)))) || (obj3 != key.b(2) && (obj3 == null || !obj3.equals(key.b(2))))))) {
            return false;
        }
        return true;
    }

    public boolean x(V0.c<C4430Ul1<? extends K>, V> cVar, Object obj, Object obj2, Object obj3, Object obj4) {
        C4430Ul1<? extends K> key = cVar.getKey();
        if (key.d() != 4 || ((obj != key.b(0) && (obj == null || !obj.equals(key.b(0)))) || ((obj2 != key.b(1) && (obj2 == null || !obj2.equals(key.b(1)))) || ((obj3 != key.b(2) && (obj3 == null || !obj3.equals(key.b(2)))) || (obj4 != key.b(3) && (obj4 == null || !obj4.equals(key.b(3)))))))) {
            return false;
        }
        return true;
    }

    public boolean y(V0.c<C4430Ul1<? extends K>, V> cVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C4430Ul1<? extends K> key = cVar.getKey();
        if (key.d() != 5 || ((obj != key.b(0) && (obj == null || !obj.equals(key.b(0)))) || ((obj2 != key.b(1) && (obj2 == null || !obj2.equals(key.b(1)))) || ((obj3 != key.b(2) && (obj3 == null || !obj3.equals(key.b(2)))) || ((obj4 != key.b(3) && (obj4 == null || !obj4.equals(key.b(3)))) || (obj5 != key.b(4) && (obj5 == null || !obj5.equals(key.b(4))))))))) {
            return false;
        }
        return true;
    }

    public C4624Wl1(V0<C4430Ul1<? extends K>, V> v0) {
        super(v0);
        this.X = v0;
    }
}
