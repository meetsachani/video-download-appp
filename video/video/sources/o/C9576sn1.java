package o;

import java.util.Map;
import o.MW0;

/* renamed from: o.sn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9576sn1<K, V> implements Map.Entry<K, V>, MW0.a {
    public final Object[] X;
    public final Object[] Y;
    public final int Z;

    public C9576sn1(Object[] objArr, Object[] objArr2, int i) {
        C6562gT0.p(objArr, "keys");
        C6562gT0.p(objArr2, androidx.lifecycle.p.g);
        this.X = objArr;
        this.Y = objArr2;
        this.Z = i;
    }

    public final int a() {
        return this.Z;
    }

    public final Object[] c() {
        return this.X;
    }

    public final Object[] e() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.X[this.Z];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.Y[this.Z];
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        Object[] objArr = this.Y;
        int i = this.Z;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }
}
