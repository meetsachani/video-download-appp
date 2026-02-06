package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzhbe extends AbstractMap {
    public Object[] X;
    public int Y;
    public boolean Y0;
    public Map Z;
    public volatile zzhbc Z0;
    public Map a1;

    private zzhbe() {
        Map map = Collections.EMPTY_MAP;
        this.Z = map;
        this.a1 = map;
    }

    public void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.Y0) {
            if (this.Z.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.Z);
            }
            this.Z = unmodifiableMap;
            if (this.a1.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.a1);
            }
            this.a1 = unmodifiableMap2;
            this.Y0 = true;
        }
    }

    public final int c() {
        return this.Y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r();
        if (this.Y != 0) {
            this.X = null;
            this.Y = 0;
        }
        if (!this.Z.isEmpty()) {
            this.Z.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m(comparable) < 0 && !this.Z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.Z.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.Z.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.Z0 == null) {
            this.Z0 = new zzhbc(this, null);
        }
        return this.Z0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhbe)) {
            return super.equals(obj);
        }
        zzhbe zzhbeVar = (zzhbe) obj;
        int size = size();
        if (size != zzhbeVar.size()) {
            return false;
        }
        int i = this.Y;
        if (i == zzhbeVar.Y) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!g(i2).equals(zzhbeVar.g(i2))) {
                    return false;
                }
            }
            if (i == size) {
                return true;
            }
            return this.Z.equals(zzhbeVar.Z);
        }
        return entrySet().equals(zzhbeVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int m = m(comparable);
        if (m >= 0) {
            return ((zzhba) this.X[m]).setValue(obj);
        }
        r();
        if (this.X == null) {
            this.X = new Object[16];
        }
        int i = -(m + 1);
        if (i >= 16) {
            return o().put(comparable, obj);
        }
        if (this.Y == 16) {
            zzhba zzhbaVar = (zzhba) this.X[15];
            this.Y = 15;
            o().put(zzhbaVar.e(), zzhbaVar.getValue());
        }
        Object[] objArr = this.X;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.X[i] = new zzhba(this, comparable, obj);
        this.Y++;
        return null;
    }

    public final Map.Entry g(int i) {
        if (i < this.Y) {
            return (zzhba) this.X[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = m(comparable);
        if (m >= 0) {
            return ((zzhba) this.X[m]).getValue();
        }
        return this.Z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.Y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.X[i3].hashCode();
        }
        if (this.Z.size() > 0) {
            return i2 + this.Z.hashCode();
        }
        return i2;
    }

    public final boolean k() {
        return this.Y0;
    }

    public final int m(Comparable comparable) {
        int i = this.Y;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((zzhba) this.X[i2]).e());
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((zzhba) this.X[i4]).e());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public final Object n(int i) {
        r();
        Object value = ((zzhba) this.X[i]).getValue();
        Object[] objArr = this.X;
        System.arraycopy(objArr, i + 1, objArr, i, (this.Y - i) - 1);
        this.Y--;
        if (!this.Z.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.X;
            int i2 = this.Y;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zzhba(this, (Comparable) entry.getKey(), entry.getValue());
            this.Y++;
            it.remove();
        }
        return value;
    }

    public final SortedMap o() {
        r();
        if (this.Z.isEmpty() && !(this.Z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.Z = treeMap;
            this.a1 = treeMap.descendingMap();
        }
        return (SortedMap) this.Z;
    }

    public final void r() {
        if (!this.Y0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int m = m(comparable);
        if (m >= 0) {
            return n(m);
        }
        if (this.Z.isEmpty()) {
            return null;
        }
        return this.Z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Y + this.Z.size();
    }

    public /* synthetic */ zzhbe(zzhbd zzhbdVar) {
        Map map = Collections.EMPTY_MAP;
        this.Z = map;
        this.a1 = map;
    }
}
