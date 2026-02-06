package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzlg<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public final int X;
    public List<zzln> Y;
    public boolean Y0;
    public Map<K, V> Z;
    public volatile zzls Z0;
    public Map<K, V> a1;
    public volatile zzlk b1;

    public static <FieldDescriptorType extends zzis<FieldDescriptorType>> zzlg<FieldDescriptorType, Object> b(int i) {
        return new zzlf(i);
    }

    public final int a(K k) {
        int i;
        int size = this.Y.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo((Comparable) this.Y.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo((Comparable) this.Y.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u();
        if (!this.Y.isEmpty()) {
            this.Y.clear();
        }
        if (!this.Z.isEmpty()) {
            this.Z.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.Z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d */
    public final V put(K k, V v) {
        u();
        int a = a(k);
        if (a >= 0) {
            return (V) this.Y.get(a).setValue(v);
        }
        u();
        if (this.Y.isEmpty() && !(this.Y instanceof ArrayList)) {
            this.Y = new ArrayList(this.X);
        }
        int i = -(a + 1);
        if (i >= this.X) {
            return t().put(k, v);
        }
        int size = this.Y.size();
        int i2 = this.X;
        if (size == i2) {
            zzln remove = this.Y.remove(i2 - 1);
            t().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.Y.add(i, new zzln(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.Z0 == null) {
            this.Z0 = new zzls(this);
        }
        return this.Z0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlg)) {
            return super.equals(obj);
        }
        zzlg zzlgVar = (zzlg) obj;
        int size = size();
        if (size != zzlgVar.size()) {
            return false;
        }
        int g = g();
        if (g != zzlgVar.g()) {
            return entrySet().equals(zzlgVar.entrySet());
        }
        for (int i = 0; i < g; i++) {
            if (!i(i).equals(zzlgVar.i(i))) {
                return false;
            }
        }
        if (g == size) {
            return true;
        }
        return this.Z.equals(zzlgVar.Z);
    }

    public void f() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
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

    public final int g() {
        return this.Y.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return (V) this.Y.get(a).getValue();
        }
        return this.Z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int g = g();
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            i += this.Y.get(i2).hashCode();
        }
        if (this.Z.size() > 0) {
            return i + this.Z.hashCode();
        }
        return i;
    }

    public final Map.Entry<K, V> i(int i) {
        return this.Y.get(i);
    }

    public final Iterable<Map.Entry<K, V>> k() {
        if (this.Z.isEmpty()) {
            return zzlm.a();
        }
        return this.Z.entrySet();
    }

    public final V l(int i) {
        u();
        V v = (V) this.Y.remove(i).getValue();
        if (!this.Z.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = t().entrySet().iterator();
            this.Y.add(new zzln(this, it.next()));
            it.remove();
        }
        return v;
    }

    public final Set<Map.Entry<K, V>> n() {
        if (this.b1 == null) {
            this.b1 = new zzlk(this);
        }
        return this.b1;
    }

    public final boolean r() {
        return this.Y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        u();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return (V) l(a);
        }
        if (this.Z.isEmpty()) {
            return null;
        }
        return this.Z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y.size() + this.Z.size();
    }

    public final SortedMap<K, V> t() {
        u();
        if (this.Z.isEmpty() && !(this.Z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.Z = treeMap;
            this.a1 = treeMap.descendingMap();
        }
        return (SortedMap) this.Z;
    }

    public final void u() {
        if (!this.Y0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public zzlg(int i) {
        this.X = i;
        this.Y = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.Z = map;
        this.a1 = map;
    }
}
