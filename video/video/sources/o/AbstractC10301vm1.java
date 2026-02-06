package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.vm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10301vm1<K0, V0> {
    public static final int a = 8;

    /* renamed from: o.vm1$a */
    /* loaded from: classes3.dex */
    public class a extends k<Object> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // o.AbstractC10301vm1.k
        public <K, V> Map<K, Collection<V>> c() {
            return C7469kD1.d(this.b);
        }
    }

    /* renamed from: o.vm1$b */
    /* loaded from: classes3.dex */
    public class b extends k<Object> {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // o.AbstractC10301vm1.k
        public <K, V> Map<K, Collection<V>> c() {
            return C7469kD1.f(this.b);
        }
    }

    /* renamed from: o.vm1$c */
    /* loaded from: classes3.dex */
    public class c extends k<K0> {
        public final /* synthetic */ Comparator b;

        public c(Comparator comparator) {
            this.b = comparator;
        }

        @Override // o.AbstractC10301vm1.k
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.b);
        }
    }

    /* renamed from: o.vm1$d */
    /* loaded from: classes3.dex */
    public class d extends k<K0> {
        public final /* synthetic */ Class b;

        public d(Class cls) {
            this.b = cls;
        }

        @Override // o.AbstractC10301vm1.k
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new EnumMap(this.b);
        }
    }

    /* renamed from: o.vm1$e */
    /* loaded from: classes3.dex */
    public static final class e<V> implements InterfaceC8331nh2<List<V>>, Serializable {
        public final int X;

        public e(int i) {
            this.X = C5037aF.b(i, "expectedValuesPerKey");
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.X);
        }
    }

    /* renamed from: o.vm1$f */
    /* loaded from: classes3.dex */
    public static final class f<V extends Enum<V>> implements InterfaceC8331nh2<Set<V>>, Serializable {
        public final Class<V> X;

        public f(Class<V> cls) {
            this.X = (Class) C10664xF1.E(cls);
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public Set<V> get() {
            return EnumSet.noneOf(this.X);
        }
    }

    /* renamed from: o.vm1$g */
    /* loaded from: classes3.dex */
    public static final class g<V> implements InterfaceC8331nh2<Set<V>>, Serializable {
        public final int X;

        public g(int i) {
            this.X = C5037aF.b(i, "expectedValuesPerKey");
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public Set<V> get() {
            return C7469kD1.e(this.X);
        }
    }

    /* renamed from: o.vm1$h */
    /* loaded from: classes3.dex */
    public static final class h<V> implements InterfaceC8331nh2<Set<V>>, Serializable {
        public final int X;

        public h(int i) {
            this.X = C5037aF.b(i, "expectedValuesPerKey");
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public Set<V> get() {
            return C7469kD1.g(this.X);
        }
    }

    /* renamed from: o.vm1$i */
    /* loaded from: classes3.dex */
    public enum i implements InterfaceC8331nh2<List<?>> {
        INSTANCE;

        public static <V> InterfaceC8331nh2<List<V>> h() {
            return INSTANCE;
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: g */
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* renamed from: o.vm1$j */
    /* loaded from: classes3.dex */
    public static abstract class j<K0, V0> extends AbstractC10301vm1<K0, V0> {
        public j() {
            super(null);
        }

        @Override // o.AbstractC10301vm1
        /* renamed from: j */
        public abstract <K extends K0, V extends V0> V01<K, V> a();

        @Override // o.AbstractC10301vm1
        /* renamed from: k */
        public <K extends K0, V extends V0> V01<K, V> b(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            return (V01) super.b(interfaceC10058um1);
        }
    }

    /* renamed from: o.vm1$k */
    /* loaded from: classes3.dex */
    public static abstract class k<K0> {
        public static final int a = 2;

        /* renamed from: o.vm1$k$a */
        /* loaded from: classes3.dex */
        public class a extends j<K0, Object> {
            public final /* synthetic */ int b;

            public a(int i) {
                this.b = i;
            }

            @Override // o.AbstractC10301vm1.j, o.AbstractC10301vm1
            /* renamed from: j */
            public <K extends K0, V> V01<K, V> a() {
                return C10547wm1.u(k.this.c(), new e(this.b));
            }
        }

        /* renamed from: o.vm1$k$b */
        /* loaded from: classes3.dex */
        public class b extends j<K0, Object> {
            public b() {
            }

            @Override // o.AbstractC10301vm1.j, o.AbstractC10301vm1
            /* renamed from: j */
            public <K extends K0, V> V01<K, V> a() {
                return C10547wm1.u(k.this.c(), i.h());
            }
        }

        /* renamed from: o.vm1$k$c */
        /* loaded from: classes3.dex */
        public class c extends l<K0, Object> {
            public final /* synthetic */ int b;

            public c(int i) {
                this.b = i;
            }

            @Override // o.AbstractC10301vm1.l, o.AbstractC10301vm1
            /* renamed from: j */
            public <K extends K0, V> InterfaceC8660p22<K, V> a() {
                return C10547wm1.w(k.this.c(), new g(this.b));
            }
        }

        /* renamed from: o.vm1$k$d */
        /* loaded from: classes3.dex */
        public class d extends l<K0, Object> {
            public final /* synthetic */ int b;

            public d(int i) {
                this.b = i;
            }

            @Override // o.AbstractC10301vm1.l, o.AbstractC10301vm1
            /* renamed from: j */
            public <K extends K0, V> InterfaceC8660p22<K, V> a() {
                return C10547wm1.w(k.this.c(), new h(this.b));
            }
        }

        /* renamed from: o.vm1$k$e */
        /* loaded from: classes3.dex */
        public class e extends m<K0, V0> {
            public final /* synthetic */ Comparator b;

            public e(Comparator comparator) {
                this.b = comparator;
            }

            @Override // o.AbstractC10301vm1.m, o.AbstractC10301vm1.l
            /* renamed from: l */
            public <K extends K0, V extends V0> InterfaceC6829ha2<K, V> j() {
                return C10547wm1.x(k.this.c(), new n(this.b));
            }
        }

        /* renamed from: o.vm1$k$f */
        /* loaded from: classes3.dex */
        public class f extends l<K0, V0> {
            public final /* synthetic */ Class b;

            public f(Class cls) {
                this.b = cls;
            }

            @Override // o.AbstractC10301vm1.l, o.AbstractC10301vm1
            /* renamed from: j */
            public <K extends K0, V extends V0> InterfaceC8660p22<K, V> a() {
                return C10547wm1.w(k.this.c(), new f(this.b));
            }
        }

        public j<K0, Object> a() {
            return b(2);
        }

        public j<K0, Object> b(int i) {
            C5037aF.b(i, "expectedValuesPerKey");
            return new a(i);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();

        public <V0 extends Enum<V0>> l<K0, V0> d(Class<V0> cls) {
            C10664xF1.F(cls, "valueClass");
            return new f(cls);
        }

        public l<K0, Object> e() {
            return f(2);
        }

        public l<K0, Object> f(int i) {
            C5037aF.b(i, "expectedValuesPerKey");
            return new c(i);
        }

        public l<K0, Object> g() {
            return h(2);
        }

        public l<K0, Object> h(int i) {
            C5037aF.b(i, "expectedValuesPerKey");
            return new d(i);
        }

        public j<K0, Object> i() {
            return new b();
        }

        public m<K0, Comparable> j() {
            return (m<K0, V0>) k(AbstractC10587ww1.z());
        }

        public <V0> m<K0, V0> k(Comparator<V0> comparator) {
            C10664xF1.F(comparator, "comparator");
            return new e(comparator);
        }
    }

    /* renamed from: o.vm1$l */
    /* loaded from: classes3.dex */
    public static abstract class l<K0, V0> extends AbstractC10301vm1<K0, V0> {
        public l() {
            super(null);
        }

        @Override // o.AbstractC10301vm1
        /* renamed from: j */
        public abstract <K extends K0, V extends V0> InterfaceC8660p22<K, V> a();

        @Override // o.AbstractC10301vm1
        /* renamed from: k */
        public <K extends K0, V extends V0> InterfaceC8660p22<K, V> b(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            return (InterfaceC8660p22) super.b(interfaceC10058um1);
        }
    }

    /* renamed from: o.vm1$m */
    /* loaded from: classes3.dex */
    public static abstract class m<K0, V0> extends l<K0, V0> {
        @Override // o.AbstractC10301vm1.l
        /* renamed from: l */
        public abstract <K extends K0, V extends V0> InterfaceC6829ha2<K, V> j();

        @Override // o.AbstractC10301vm1.l
        /* renamed from: m */
        public <K extends K0, V extends V0> InterfaceC6829ha2<K, V> k(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            return (InterfaceC6829ha2) super.b(interfaceC10058um1);
        }
    }

    /* renamed from: o.vm1$n */
    /* loaded from: classes3.dex */
    public static final class n<V> implements InterfaceC8331nh2<SortedSet<V>>, Serializable {
        public final Comparator<? super V> X;

        public n(Comparator<? super V> comparator) {
            this.X = (Comparator) C10664xF1.E(comparator);
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public SortedSet<V> get() {
            return new TreeSet(this.X);
        }
    }

    public /* synthetic */ AbstractC10301vm1(a aVar) {
        this();
    }

    public static <K0 extends Enum<K0>> k<K0> c(Class<K0> cls) {
        C10664xF1.E(cls);
        return new d(cls);
    }

    public static k<Object> d() {
        return e(8);
    }

    public static k<Object> e(int i2) {
        C5037aF.b(i2, "expectedKeys");
        return new a(i2);
    }

    public static k<Object> f() {
        return g(8);
    }

    public static k<Object> g(int i2) {
        C5037aF.b(i2, "expectedKeys");
        return new b(i2);
    }

    public static k<Comparable> h() {
        return i(AbstractC10587ww1.z());
    }

    public static <K0> k<K0> i(Comparator<K0> comparator) {
        C10664xF1.E(comparator);
        return new c(comparator);
    }

    public abstract <K extends K0, V extends V0> InterfaceC10058um1<K, V> a();

    public <K extends K0, V extends V0> InterfaceC10058um1<K, V> b(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        InterfaceC10058um1<K, V> a2 = a();
        a2.B0(interfaceC10058um1);
        return a2;
    }

    public AbstractC10301vm1() {
    }
}
