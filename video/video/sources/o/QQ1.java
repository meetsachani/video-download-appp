package o;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import o.AbstractC6044eO0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class QQ1<K, V> extends AbstractC6044eO0<K, V> {
    public static final byte d1 = -1;
    public static final int e1 = 128;
    public static final int f1 = 32768;
    public static final int g1 = 255;
    public static final int h1 = 65535;
    public static final AbstractC6044eO0<Object, Object> i1 = new QQ1(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    @MB
    public final transient Object a1;
    @InterfaceC5299bJ2
    public final transient Object[] b1;
    public final transient int c1;

    /* loaded from: classes3.dex */
    public static class a<K, V> extends AbstractC9481sO0<Map.Entry<K, V>> {
        public final transient AbstractC6044eO0<K, V> a1;
        public final transient Object[] b1;
        public final transient int c1;
        public final transient int d1;

        /* renamed from: o.QQ1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0224a extends AbstractC5317bO0<Map.Entry<K, V>> {
            public C0224a() {
            }

            @Override // o.TN0
            public boolean j() {
                return true;
            }

            @Override // java.util.List
            /* renamed from: p0 */
            public Map.Entry<K, V> get(int i) {
                C10664xF1.C(i, a.this.d1);
                int i2 = i * 2;
                Object obj = a.this.b1[a.this.c1 + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.b1[i2 + (a.this.c1 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.d1;
            }
        }

        public a(AbstractC6044eO0<K, V> abstractC6044eO0, Object[] objArr, int i, int i2) {
            this.a1 = abstractC6044eO0;
            this.b1 = objArr;
            this.c1 = i;
            this.d1 = i2;
        }

        @Override // o.AbstractC9481sO0
        public AbstractC5317bO0<Map.Entry<K, V>> K() {
            return new C0224a();
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.a1.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.TN0
        public int e(Object[] objArr, int i) {
            return d().e(objArr, i);
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<Map.Entry<K, V>> iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.d1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<K> extends AbstractC9481sO0<K> {
        public final transient AbstractC6044eO0<K, ?> a1;
        public final transient AbstractC5317bO0<K> b1;

        public b(AbstractC6044eO0<K, ?> abstractC6044eO0, AbstractC5317bO0<K> abstractC5317bO0) {
            this.a1 = abstractC6044eO0;
            this.b1 = abstractC5317bO0;
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (this.a1.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC9481sO0, o.TN0
        public AbstractC5317bO0<K> d() {
            return this.b1;
        }

        @Override // o.TN0
        public int e(Object[] objArr, int i) {
            return d().e(objArr, i);
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<K> iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a1.size();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5317bO0<Object> {
        public final transient int Y0;
        public final transient Object[] Z;
        public final transient int Z0;

        public c(Object[] objArr, int i, int i2) {
            this.Z = objArr;
            this.Y0 = i;
            this.Z0 = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            C10664xF1.C(i, this.Z0);
            Object obj = this.Z[(i * 2) + this.Y0];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z0;
        }
    }

    public QQ1(@MB Object obj, Object[] objArr, int i) {
        this.a1 = obj;
        this.b1 = objArr;
        this.c1 = i;
    }

    public static <K, V> QQ1<K, V> H(int i, Object[] objArr) {
        return I(i, objArr, null);
    }

    public static <K, V> QQ1<K, V> I(int i, Object[] objArr, AbstractC6044eO0.b<K, V> bVar) {
        if (i == 0) {
            return (QQ1) i1;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C5037aF.a(obj, obj2);
            return new QQ1<>(null, objArr, 1);
        }
        C10664xF1.d0(i, objArr.length >> 1);
        Object J = J(objArr, i, AbstractC9481sO0.B(i), 0);
        if (J instanceof Object[]) {
            Object[] objArr2 = (Object[]) J;
            AbstractC6044eO0.b.a aVar = (AbstractC6044eO0.b.a) objArr2[2];
            if (bVar != null) {
                bVar.e = aVar;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                J = obj3;
                i = intValue;
            } else {
                throw aVar.a();
            }
        }
        return new QQ1<>(J, objArr, i);
    }

    @MB
    public static Object J(Object[] objArr, int i, int i2, int i3) {
        int i4;
        AbstractC6044eO0.b.a aVar = null;
        int i5 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            C5037aF.a(obj, obj2);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 * 2) + i3;
                int i10 = (i7 * 2) + i3;
                Object obj3 = objArr[i9];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i9 ^ 1];
                Objects.requireNonNull(obj4);
                C5037aF.a(obj3, obj4);
                int c2 = EG0.c(obj3.hashCode());
                while (true) {
                    int i11 = c2 & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj3;
                            objArr[i10 ^ 1] = obj4;
                        }
                        i7++;
                    } else if (obj3.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        Object obj5 = objArr[i13];
                        Objects.requireNonNull(obj5);
                        aVar = new AbstractC6044eO0.b.a(obj3, obj4, obj5);
                        objArr[i13] = obj4;
                        break;
                    } else {
                        c2 = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), aVar};
        } else if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 * 2) + i3;
                int i17 = (i14 * 2) + i3;
                Object obj6 = objArr[i16];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj7);
                C5037aF.a(obj6, obj7);
                int c3 = EG0.c(obj6.hashCode());
                while (true) {
                    int i18 = c3 & i6;
                    int i19 = sArr[i18] & Xx2.Y0;
                    if (i19 == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj6;
                            objArr[i17 ^ 1] = obj7;
                        }
                        i14++;
                    } else if (obj6.equals(objArr[i19])) {
                        int i20 = i19 ^ 1;
                        Object obj8 = objArr[i20];
                        Objects.requireNonNull(obj8);
                        aVar = new AbstractC6044eO0.b.a(obj6, obj7, obj8);
                        objArr[i20] = obj7;
                        break;
                    } else {
                        c3 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), aVar};
        } else {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i21 = 0;
            int i22 = 0;
            while (i21 < i) {
                int i23 = (i21 * 2) + i3;
                int i24 = (i22 * 2) + i3;
                Object obj9 = objArr[i23];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i23 ^ i5];
                Objects.requireNonNull(obj10);
                C5037aF.a(obj9, obj10);
                int c4 = EG0.c(obj9.hashCode());
                while (true) {
                    int i25 = c4 & i6;
                    int i26 = iArr[i25];
                    if (i26 == -1) {
                        iArr[i25] = i24;
                        if (i22 < i21) {
                            objArr[i24] = obj9;
                            objArr[i24 ^ 1] = obj10;
                        }
                        i22++;
                        i4 = i5;
                    } else {
                        i4 = i5;
                        if (obj9.equals(objArr[i26])) {
                            int i27 = i26 ^ 1;
                            Object obj11 = objArr[i27];
                            Objects.requireNonNull(obj11);
                            aVar = new AbstractC6044eO0.b.a(obj9, obj10, obj11);
                            objArr[i27] = obj10;
                            break;
                        }
                        c4 = i25 + 1;
                        i5 = i4;
                    }
                }
                i21++;
                i5 = i4;
            }
            int i28 = i5;
            if (i22 == i) {
                return iArr;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = iArr;
            objArr2[i28] = Integer.valueOf(i22);
            objArr2[2] = aVar;
            return objArr2;
        }
    }

    @MB
    public static Object K(Object[] objArr, int i, int i2, int i3) {
        Object J = J(objArr, i, i2, i3);
        if (!(J instanceof Object[])) {
            return J;
        }
        throw ((AbstractC6044eO0.b.a) ((Object[]) J)[2]).a();
    }

    @MB
    public static Object L(@MB Object obj, Object[] objArr, int i, int i2, @MB Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int c2 = EG0.c(obj2.hashCode());
                while (true) {
                    int i3 = c2 & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i4])) {
                        return objArr[i4 ^ 1];
                    }
                    c2 = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int c3 = EG0.c(obj2.hashCode());
                while (true) {
                    int i5 = c3 & length2;
                    int i6 = sArr[i5] & Xx2.Y0;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    c3 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int c4 = EG0.c(obj2.hashCode());
                while (true) {
                    int i7 = c4 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i8])) {
                        return objArr[i8 ^ 1];
                    }
                    c4 = i7 + 1;
                }
            }
        }
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    @MB
    public V get(@MB Object obj) {
        V v = (V) L(this.a1, this.b1, this.c1, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // o.AbstractC6044eO0
    public AbstractC9481sO0<Map.Entry<K, V>> i() {
        return new a(this, this.b1, 0, this.c1);
    }

    @Override // o.AbstractC6044eO0
    public AbstractC9481sO0<K> j() {
        return new b(this, new c(this.b1, 0, this.c1));
    }

    @Override // o.AbstractC6044eO0
    public TN0<V> k() {
        return new c(this.b1, 1, this.c1);
    }

    @Override // o.AbstractC6044eO0
    public boolean o() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.c1;
    }
}
