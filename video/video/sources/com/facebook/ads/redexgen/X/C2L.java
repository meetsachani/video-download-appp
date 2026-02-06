package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
import o.C8077mf;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.2L  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C2L<K, V> extends AbstractC0640Bq<K, V> implements Serializable {
    public static byte[] A02 = null;
    public static String[] A03 = {"8r4g5TVHuPTTEnOtjBSYLe2NoPZev3PL", "ZANRIcgacCs2MrGdQFs4BnSQ4f0OwMHM", "INAFHP4NB26l7mhFzzAYwDEUO08LdW1T", "w9HTcMerj5Ucor1CBa36675WVQ4LimP", "S0p05mXNQ0J7ss", "bhB1flpiQfpMN0", "TPylgZWOdIZWygeLq1OgLn1DVzZt4taa", "Gp6xvn2xjKoLwUaOKBIxtDMJneYJVeH8"};
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map<K, Collection<V>> A01;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A02 = new byte[]{56, 19, 1, 86, 53, C8077mf.C, C8077mf.D, C8077mf.D, 19, C8077mf.y, 2, 31, C8077mf.C, C8077mf.B, 86, 0, 31, C8077mf.C, C8077mf.D, C8077mf.A, 2, 19, C8077mf.u, 86, 2, C8077mf.H, 19, 86, 53, C8077mf.C, C8077mf.D, C8077mf.D, 19, C8077mf.y, 2, 31, C8077mf.C, C8077mf.B, 86, 5, 6, 19, C8077mf.y};
    }

    public abstract Collection<V> A0D();

    public abstract Collection<V> A0F(@ParametricNullness K key, Collection<V> collection);

    public abstract <E> Collection<E> A0G(Collection<E> collection);

    static {
        A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public C2L(Map<K, Collection<V>> map) {
        AbstractC1912ki.A0C(map.isEmpty());
        this.A01 = map;
    }

    public static /* synthetic */ int A00(C2L c2l) {
        int i = c2l.A00;
        c2l.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(C2L c2l) {
        int i = c2l.A00;
        c2l.A00 = i - 1;
        return i;
    }

    public static /* synthetic */ int A02(C2L c2l, int i) {
        int i2 = c2l.A00 + i;
        c2l.A00 = i2;
        return i2;
    }

    public static /* synthetic */ int A03(C2L c2l, int i) {
        int i2 = c2l.A00 - i;
        c2l.A00 = i2;
        return i2;
    }

    public static <E> Iterator<E> A05(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public void A0A(@CheckForNull Object key) {
        Collection<V> collection = (Collection) AbstractC2212po.A06(this.A01, key);
        if (collection != null) {
            int count = collection.size();
            collection.clear();
            this.A00 -= count;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC0640Bq
    public final Collection<V> A0B() {
        return new C1983ls(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC0640Bq
    public Iterator<V> A0C() {
        return new C0644Bu(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public Collection<V> A0E(@ParametricNullness K key) {
        return A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lp != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/2L<TK;TV;>.WrappedCollection;)Ljava/util/List<TV;>; */
    public final List A0H(@ParametricNullness Object key, @CheckForNull List list, C1980lp ancestor) {
        if (list instanceof RandomAccess) {
            return new C2N(this, key, list, ancestor);
        }
        return new C0641Br(this, key, list, ancestor);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public Map<K, Collection<V>> A0I() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final Map<K, Collection<V>> A0J() {
        if (this.A01 instanceof NavigableMap) {
            return new AnonymousClass19(this, (NavigableMap) this.A01);
        }
        boolean z = this.A01 instanceof SortedMap;
        if (A03[2].charAt(31) != 'o') {
            A03[3] = "NCYt1eTwLWbpcysHbDqNMrCxO6pYN55";
            if (z) {
                return new C2M(this, (SortedMap) this.A01);
            }
            return new C0643Bt(this, this.A01);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final Set<K> A0K() {
        if (this.A01 instanceof NavigableMap) {
            return new C0u(this, (NavigableMap) this.A01);
        }
        if (this.A01 instanceof SortedMap) {
            return new AnonymousClass18(this, (SortedMap) this.A01);
        }
        return new C2O(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final void A0L(Map<K, Collection<V>> map) {
        this.A01 = map;
        this.A00 = 0;
        for (Collection<V> collection : map.values()) {
            AbstractC1912ki.A0C(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2227q3
    public boolean AHE(@ParametricNullness K key, @ParametricNullness V value) {
        Collection<V> collection = this.A01.get(key);
        if (collection == null) {
            Collection<V> A0E = A0E(key);
            if (A0E.add(value)) {
                this.A00++;
                this.A01.put(key, A0E);
                return true;
            }
            throw new AssertionError(A04(0, 43, 58));
        } else if (collection.add(value)) {
            int i = this.A00 + 1;
            if (A03[2].charAt(31) != 'o') {
                String[] strArr = A03;
                strArr[4] = "qdqPg3EJJL9zSp";
                strArr[5] = "JvkYzNNxKsGyOY";
                this.A00 = i;
                return true;
            }
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2227q3
    public void clear() {
        for (Collection<V> collection : this.A01.values()) {
            collection.clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2227q3
    public int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC0640Bq, com.facebook.ads.redexgen.X.InterfaceC2227q3
    public Collection<V> values() {
        return super.values();
    }
}
