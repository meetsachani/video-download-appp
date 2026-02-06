package o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import o.AbstractC6044eO0;
import o.BO0;
import o.InterfaceC3744Nk2;

@NN0(containerOf = {"R", "C", C2638Cg0.X4})
@InterfaceC6329fa0
@InterfaceC10420wF0
/* renamed from: o.k20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7424k20<R, C, V> extends WQ1<R, C, V> {
    public final AbstractC6044eO0<C, Integer> Y0;
    public final AbstractC6044eO0<R, Integer> Z;
    public final AbstractC6044eO0<R, AbstractC6044eO0<C, V>> Z0;
    public final AbstractC6044eO0<C, AbstractC6044eO0<R, V>> a1;
    public final int[] b1;
    public final int[] c1;
    public final V[][] d1;
    public final int[] e1;
    public final int[] f1;

    /* renamed from: o.k20$b */
    /* loaded from: classes3.dex */
    public final class b extends d<R, V> {
        public final int b1;

        public b(int i) {
            super(C7424k20.this.c1[i]);
            this.b1 = i;
        }

        @Override // o.C7424k20.d
        @MB
        public V J(int i) {
            return (V) C7424k20.this.d1[i][this.b1];
        }

        @Override // o.C7424k20.d
        public AbstractC6044eO0<R, Integer> K() {
            return C7424k20.this.Z;
        }

        @Override // o.AbstractC6044eO0
        public boolean o() {
            return true;
        }
    }

    /* renamed from: o.k20$c */
    /* loaded from: classes3.dex */
    public final class c extends d<C, AbstractC6044eO0<R, V>> {
        @Override // o.C7424k20.d
        public AbstractC6044eO0<C, Integer> K() {
            return C7424k20.this.Y0;
        }

        @Override // o.C7424k20.d
        /* renamed from: L */
        public AbstractC6044eO0<R, V> J(int i) {
            return new b(i);
        }

        @Override // o.AbstractC6044eO0
        public boolean o() {
            return false;
        }

        public c() {
            super(C7424k20.this.c1.length);
        }
    }

    /* renamed from: o.k20$d */
    /* loaded from: classes3.dex */
    public static abstract class d<K, V> extends AbstractC6044eO0.c<K, V> {
        public final int a1;

        /* renamed from: o.k20$d$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<Map.Entry<K, V>> {
            public final int Y0;
            public int Z = -1;

            public a() {
                this.Y0 = d.this.K().size();
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<K, V> b() {
                int i = this.Z;
                while (true) {
                    this.Z = i + 1;
                    int i2 = this.Z;
                    if (i2 < this.Y0) {
                        Object J = d.this.J(i2);
                        if (J != null) {
                            return C7935m81.O(d.this.I(this.Z), J);
                        }
                        i = this.Z;
                    } else {
                        return c();
                    }
                }
            }
        }

        public d(int i) {
            this.a1 = i;
        }

        @Override // o.AbstractC6044eO0.c
        public AbstractC6237fB2<Map.Entry<K, V>> H() {
            return new a();
        }

        public K I(int i) {
            return K().keySet().d().get(i);
        }

        @MB
        public abstract V J(int i);

        public abstract AbstractC6044eO0<K, Integer> K();

        @Override // o.AbstractC6044eO0, java.util.Map
        @MB
        public V get(@MB Object obj) {
            Integer num = K().get(obj);
            if (num == null) {
                return null;
            }
            return J(num.intValue());
        }

        @Override // o.AbstractC6044eO0.c, o.AbstractC6044eO0
        public AbstractC9481sO0<K> j() {
            if (s()) {
                return K().keySet();
            }
            return super.j();
        }

        public final boolean s() {
            if (this.a1 == K().size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map
        public int size() {
            return this.a1;
        }
    }

    /* renamed from: o.k20$e */
    /* loaded from: classes3.dex */
    public final class e extends d<C, V> {
        public final int b1;

        public e(int i) {
            super(C7424k20.this.b1[i]);
            this.b1 = i;
        }

        @Override // o.C7424k20.d
        @MB
        public V J(int i) {
            return (V) C7424k20.this.d1[this.b1][i];
        }

        @Override // o.C7424k20.d
        public AbstractC6044eO0<C, Integer> K() {
            return C7424k20.this.Y0;
        }

        @Override // o.AbstractC6044eO0
        public boolean o() {
            return true;
        }
    }

    /* renamed from: o.k20$f */
    /* loaded from: classes3.dex */
    public final class f extends d<R, AbstractC6044eO0<C, V>> {
        @Override // o.C7424k20.d
        public AbstractC6044eO0<R, Integer> K() {
            return C7424k20.this.Z;
        }

        @Override // o.C7424k20.d
        /* renamed from: L */
        public AbstractC6044eO0<C, V> J(int i) {
            return new e(i);
        }

        @Override // o.AbstractC6044eO0
        public boolean o() {
            return false;
        }

        public f() {
            super(C7424k20.this.b1.length);
        }
    }

    public C7424k20(AbstractC5317bO0<InterfaceC3744Nk2.a<R, C, V>> abstractC5317bO0, AbstractC9481sO0<R> abstractC9481sO0, AbstractC9481sO0<C> abstractC9481sO02) {
        this.d1 = (V[][]) ((Object[][]) Array.newInstance(Object.class, abstractC9481sO0.size(), abstractC9481sO02.size()));
        AbstractC6044eO0<R, Integer> Q = C7935m81.Q(abstractC9481sO0);
        this.Z = Q;
        AbstractC6044eO0<C, Integer> Q2 = C7935m81.Q(abstractC9481sO02);
        this.Y0 = Q2;
        this.b1 = new int[Q.size()];
        this.c1 = new int[Q2.size()];
        int[] iArr = new int[abstractC5317bO0.size()];
        int[] iArr2 = new int[abstractC5317bO0.size()];
        for (int i = 0; i < abstractC5317bO0.size(); i++) {
            InterfaceC3744Nk2.a<R, C, V> aVar = abstractC5317bO0.get(i);
            R a2 = aVar.a();
            C b2 = aVar.b();
            Integer num = this.Z.get(a2);
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Integer num2 = this.Y0.get(b2);
            Objects.requireNonNull(num2);
            int intValue2 = num2.intValue();
            x(a2, b2, this.d1[intValue][intValue2], aVar.getValue());
            this.d1[intValue][intValue2] = aVar.getValue();
            int[] iArr3 = this.b1;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.c1;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i] = intValue;
            iArr2[i] = intValue2;
        }
        this.e1 = iArr;
        this.f1 = iArr2;
        this.Z0 = new f();
        this.a1 = new c();
    }

    @Override // o.WQ1
    public InterfaceC3744Nk2.a<R, C, V> C(int i) {
        int i2 = this.e1[i];
        int i3 = this.f1[i];
        R r = F().d().get(i2);
        C c2 = L4().d().get(i3);
        V v = this.d1[i2][i3];
        Objects.requireNonNull(v);
        return BO0.g(r, c2, v);
    }

    @Override // o.WQ1
    public V D(int i) {
        V v = this.d1[this.e1[i]][this.f1[i]];
        Objects.requireNonNull(v);
        return v;
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: k */
    public AbstractC6044eO0<C, Map<R, V>> i2() {
        return AbstractC6044eO0.g(this.a1);
    }

    @Override // o.BO0
    public BO0.b o() {
        return BO0.b.a(this, this.e1, this.f1);
    }

    @Override // o.BO0, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @MB
    public V r0(@MB Object obj, @MB Object obj2) {
        Integer num = this.Z.get(obj);
        Integer num2 = this.Y0.get(obj2);
        if (num != null && num2 != null) {
            return this.d1[num.intValue()][num2.intValue()];
        }
        return null;
    }

    @Override // o.InterfaceC3744Nk2
    public int size() {
        return this.e1.length;
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: u */
    public AbstractC6044eO0<R, Map<C, V>> H() {
        return AbstractC6044eO0.g(this.Z0);
    }
}
