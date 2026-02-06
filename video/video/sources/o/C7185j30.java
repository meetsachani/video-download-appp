package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.j30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7185j30<T> implements InterfaceC4943Zq<C7428k30<T>> {
    public final List<AbstractC6944i30<?>> X;
    public final boolean Y;
    public final T Y0;
    public final T Z;
    public final AbstractC4253Sp2 Z0;

    /* renamed from: o.j30$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC6944i30<Float[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ float[] Y0;
        public final /* synthetic */ float[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, float[] fArr, float[] fArr2) {
            super(str);
            this.Y0 = fArr;
            this.Z0 = fArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Float[] h() {
            return C4206Se.x5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Float[] i() {
            return C4206Se.x5(this.Z0);
        }
    }

    /* renamed from: o.j30$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC6944i30<Integer> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ int Y0;
        public final /* synthetic */ int Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i, int i2) {
            super(str);
            this.Y0 = i;
            this.Z0 = i2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Integer h() {
            return Integer.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Integer i() {
            return Integer.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC6944i30<Integer[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ int[] Y0;
        public final /* synthetic */ int[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int[] iArr, int[] iArr2) {
            super(str);
            this.Y0 = iArr;
            this.Z0 = iArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Integer[] h() {
            return C4206Se.y5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Integer[] i() {
            return C4206Se.y5(this.Z0);
        }
    }

    /* renamed from: o.j30$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC6944i30<Long> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ long Y0;
        public final /* synthetic */ long Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j, long j2) {
            super(str);
            this.Y0 = j;
            this.Z0 = j2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Long h() {
            return Long.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Long i() {
            return Long.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractC6944i30<Long[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ long[] Y0;
        public final /* synthetic */ long[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, long[] jArr, long[] jArr2) {
            super(str);
            this.Y0 = jArr;
            this.Z0 = jArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Long[] h() {
            return C4206Se.z5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Long[] i() {
            return C4206Se.z5(this.Z0);
        }
    }

    /* renamed from: o.j30$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC6944i30<Short> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ short Y0;
        public final /* synthetic */ short Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, short s, short s2) {
            super(str);
            this.Y0 = s;
            this.Z0 = s2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Short h() {
            return Short.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Short i() {
            return Short.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$g */
    /* loaded from: classes4.dex */
    public class g extends AbstractC6944i30<Short[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ short[] Y0;
        public final /* synthetic */ short[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, short[] sArr, short[] sArr2) {
            super(str);
            this.Y0 = sArr;
            this.Z0 = sArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Short[] h() {
            return C4206Se.A5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Short[] i() {
            return C4206Se.A5(this.Z0);
        }
    }

    /* renamed from: o.j30$h */
    /* loaded from: classes4.dex */
    public class h extends AbstractC6944i30<Object> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ Object Y0;
        public final /* synthetic */ Object Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Object obj, Object obj2) {
            super(str);
            this.Y0 = obj;
            this.Z0 = obj2;
        }

        @Override // o.AbstractC4280Sx1
        public Object h() {
            return this.Y0;
        }

        @Override // o.AbstractC4280Sx1
        public Object i() {
            return this.Z0;
        }
    }

    /* renamed from: o.j30$i */
    /* loaded from: classes4.dex */
    public class i extends AbstractC6944i30<Object[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ Object[] Y0;
        public final /* synthetic */ Object[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Object[] objArr, Object[] objArr2) {
            super(str);
            this.Y0 = objArr;
            this.Z0 = objArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Object[] h() {
            return this.Y0;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Object[] i() {
            return this.Z0;
        }
    }

    /* renamed from: o.j30$j */
    /* loaded from: classes4.dex */
    public class j extends AbstractC6944i30<Boolean> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ boolean Y0;
        public final /* synthetic */ boolean Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z, boolean z2) {
            super(str);
            this.Y0 = z;
            this.Z0 = z2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Boolean h() {
            return Boolean.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Boolean i() {
            return Boolean.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$k */
    /* loaded from: classes4.dex */
    public class k extends AbstractC6944i30<Boolean[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ boolean[] Y0;
        public final /* synthetic */ boolean[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean[] zArr, boolean[] zArr2) {
            super(str);
            this.Y0 = zArr;
            this.Z0 = zArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Boolean[] h() {
            return C4206Se.t5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Boolean[] i() {
            return C4206Se.t5(this.Z0);
        }
    }

    /* renamed from: o.j30$l */
    /* loaded from: classes4.dex */
    public class l extends AbstractC6944i30<Byte> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ byte Y0;
        public final /* synthetic */ byte Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, byte b, byte b2) {
            super(str);
            this.Y0 = b;
            this.Z0 = b2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Byte h() {
            return Byte.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Byte i() {
            return Byte.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$m */
    /* loaded from: classes4.dex */
    public class m extends AbstractC6944i30<Byte[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ byte[] Y0;
        public final /* synthetic */ byte[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, byte[] bArr, byte[] bArr2) {
            super(str);
            this.Y0 = bArr;
            this.Z0 = bArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Byte[] h() {
            return C4206Se.u5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Byte[] i() {
            return C4206Se.u5(this.Z0);
        }
    }

    /* renamed from: o.j30$n */
    /* loaded from: classes4.dex */
    public class n extends AbstractC6944i30<Character> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ char Y0;
        public final /* synthetic */ char Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, char c, char c2) {
            super(str);
            this.Y0 = c;
            this.Z0 = c2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Character h() {
            return Character.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Character i() {
            return Character.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$o */
    /* loaded from: classes4.dex */
    public class o extends AbstractC6944i30<Character[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ char[] Y0;
        public final /* synthetic */ char[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.Y0 = cArr;
            this.Z0 = cArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Character[] h() {
            return C4206Se.v5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Character[] i() {
            return C4206Se.v5(this.Z0);
        }
    }

    /* renamed from: o.j30$p */
    /* loaded from: classes4.dex */
    public class p extends AbstractC6944i30<Double> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ double Y0;
        public final /* synthetic */ double Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, double d, double d2) {
            super(str);
            this.Y0 = d;
            this.Z0 = d2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Double h() {
            return Double.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Double i() {
            return Double.valueOf(this.Z0);
        }
    }

    /* renamed from: o.j30$q */
    /* loaded from: classes4.dex */
    public class q extends AbstractC6944i30<Double[]> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ double[] Y0;
        public final /* synthetic */ double[] Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, double[] dArr, double[] dArr2) {
            super(str);
            this.Y0 = dArr;
            this.Z0 = dArr2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Double[] h() {
            return C4206Se.w5(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Double[] i() {
            return C4206Se.w5(this.Z0);
        }
    }

    /* renamed from: o.j30$r */
    /* loaded from: classes4.dex */
    public class r extends AbstractC6944i30<Float> {
        private static final long serialVersionUID = 1;
        public final /* synthetic */ float Y0;
        public final /* synthetic */ float Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, float f, float f2) {
            super(str);
            this.Y0 = f;
            this.Z0 = f2;
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: p */
        public Float h() {
            return Float.valueOf(this.Y0);
        }

        @Override // o.AbstractC4280Sx1
        /* renamed from: q */
        public Float i() {
            return Float.valueOf(this.Z0);
        }
    }

    public C7185j30(T t, T t2, AbstractC4253Sp2 abstractC4253Sp2, boolean z) {
        boolean z2 = false;
        C11147zE2.V(t, "lhs", new Object[0]);
        C11147zE2.V(t2, "rhs", new Object[0]);
        this.X = new ArrayList();
        this.Z = t;
        this.Y0 = t2;
        this.Z0 = abstractC4253Sp2;
        if (z && (t == t2 || t.equals(t2))) {
            z2 = true;
        }
        this.Y = z2;
    }

    public C7185j30<T> a(String str, byte b2, byte b3) {
        u(str);
        if (!this.Y && b2 != b3) {
            this.X.add(new l(str, b2, b3));
        }
        return this;
    }

    public C7185j30<T> b(String str, char c2, char c3) {
        u(str);
        if (!this.Y && c2 != c3) {
            this.X.add(new n(str, c2, c3));
        }
        return this;
    }

    public C7185j30<T> c(String str, double d2, double d3) {
        u(str);
        if (this.Y || Double.doubleToLongBits(d2) == Double.doubleToLongBits(d3)) {
            return this;
        }
        this.X.add(new p(str, d2, d3));
        return this;
    }

    public C7185j30<T> d(String str, float f2, float f3) {
        u(str);
        if (!this.Y && Float.floatToIntBits(f2) != Float.floatToIntBits(f3)) {
            this.X.add(new r(str, f2, f3));
        }
        return this;
    }

    public C7185j30<T> e(String str, int i2, int i3) {
        u(str);
        if (!this.Y && i2 != i3) {
            this.X.add(new b(str, i2, i3));
        }
        return this;
    }

    public C7185j30<T> f(String str, long j2, long j3) {
        u(str);
        if (this.Y || j2 == j3) {
            return this;
        }
        this.X.add(new d(str, j2, j3));
        return this;
    }

    public C7185j30<T> g(String str, Object obj, Object obj2) {
        Object obj3;
        u(str);
        if (!this.Y && obj != obj2) {
            if (obj != null) {
                obj3 = obj;
            } else {
                obj3 = obj2;
            }
            if (obj3.getClass().isArray()) {
                if (obj3 instanceof boolean[]) {
                    return s(str, (boolean[]) obj, (boolean[]) obj2);
                }
                if (obj3 instanceof byte[]) {
                    return k(str, (byte[]) obj, (byte[]) obj2);
                }
                if (obj3 instanceof char[]) {
                    return l(str, (char[]) obj, (char[]) obj2);
                }
                if (obj3 instanceof double[]) {
                    return m(str, (double[]) obj, (double[]) obj2);
                }
                if (obj3 instanceof float[]) {
                    return n(str, (float[]) obj, (float[]) obj2);
                }
                if (obj3 instanceof int[]) {
                    return o(str, (int[]) obj, (int[]) obj2);
                }
                if (obj3 instanceof long[]) {
                    return p(str, (long[]) obj, (long[]) obj2);
                }
                if (obj3 instanceof short[]) {
                    return r(str, (short[]) obj, (short[]) obj2);
                }
                return q(str, (Object[]) obj, (Object[]) obj2);
            } else if (obj == null || !obj.equals(obj2)) {
                this.X.add(new h(str, obj, obj2));
                return this;
            }
        }
        return this;
    }

    public C7185j30<T> h(String str, C7428k30<T> c7428k30) {
        u(str);
        C11147zE2.V(c7428k30, "diffResult", new Object[0]);
        if (!this.Y) {
            for (AbstractC6944i30<?> abstractC6944i30 : c7428k30.d()) {
                g(str + UE.h + abstractC6944i30.n(), abstractC6944i30.h(), abstractC6944i30.i());
            }
        }
        return this;
    }

    public C7185j30<T> i(String str, short s, short s2) {
        u(str);
        if (!this.Y && s != s2) {
            this.X.add(new f(str, s, s2));
        }
        return this;
    }

    public C7185j30<T> j(String str, boolean z, boolean z2) {
        u(str);
        if (!this.Y && z != z2) {
            this.X.add(new j(str, z, z2));
        }
        return this;
    }

    public C7185j30<T> k(String str, byte[] bArr, byte[] bArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(bArr, bArr2)) {
            this.X.add(new m(str, bArr, bArr2));
        }
        return this;
    }

    public C7185j30<T> l(String str, char[] cArr, char[] cArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(cArr, cArr2)) {
            this.X.add(new o(str, cArr, cArr2));
        }
        return this;
    }

    public C7185j30<T> m(String str, double[] dArr, double[] dArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(dArr, dArr2)) {
            this.X.add(new q(str, dArr, dArr2));
        }
        return this;
    }

    public C7185j30<T> n(String str, float[] fArr, float[] fArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(fArr, fArr2)) {
            this.X.add(new a(str, fArr, fArr2));
        }
        return this;
    }

    public C7185j30<T> o(String str, int[] iArr, int[] iArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(iArr, iArr2)) {
            this.X.add(new c(str, iArr, iArr2));
        }
        return this;
    }

    public C7185j30<T> p(String str, long[] jArr, long[] jArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(jArr, jArr2)) {
            this.X.add(new e(str, jArr, jArr2));
        }
        return this;
    }

    public C7185j30<T> q(String str, Object[] objArr, Object[] objArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(objArr, objArr2)) {
            this.X.add(new i(str, objArr, objArr2));
        }
        return this;
    }

    public C7185j30<T> r(String str, short[] sArr, short[] sArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(sArr, sArr2)) {
            this.X.add(new g(str, sArr, sArr2));
        }
        return this;
    }

    public C7185j30<T> s(String str, boolean[] zArr, boolean[] zArr2) {
        u(str);
        if (!this.Y && !Arrays.equals(zArr, zArr2)) {
            this.X.add(new k(str, zArr, zArr2));
        }
        return this;
    }

    @Override // o.InterfaceC4943Zq
    /* renamed from: t */
    public C7428k30<T> build() {
        return new C7428k30<>(this.Z, this.Y0, this.X, this.Z0);
    }

    public final void u(String str) {
        C11147zE2.V(str, "fieldName", new Object[0]);
    }

    public C7185j30(T t, T t2, AbstractC4253Sp2 abstractC4253Sp2) {
        this(t, t2, abstractC4253Sp2, true);
    }
}
