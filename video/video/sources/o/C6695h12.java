package o;

import com.facebook.internal.H;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import o.C11156zH;
import o.C6695h12;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@InterfaceC8303na2({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3224:1\n183#1,2:3225\n320#1,7:3227\n1332#1,3:3235\n747#1,4:3238\n712#1,4:3242\n730#1,4:3246\n783#1,4:3250\n1025#1,3:3254\n1028#1,3:3264\n1045#1,3:3267\n1048#1,3:3277\n1332#1,3:3294\n1321#1,2:3297\n1#2:3234\n384#3,7:3257\n384#3,7:3270\n384#3,7:3280\n384#3,7:3287\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3225,2\n103#1:3227,7\n462#1:3235,3\n666#1:3238,4\n682#1:3242,4\n697#1:3246,4\n768#1:3250,4\n996#1:3254,3\n996#1:3264,3\n1011#1:3267,3\n1011#1:3277,3\n1114#1:3294,3\n1152#1:3297,2\n996#1:3257,7\n1011#1:3270,7\n1027#1:3280,7\n1047#1:3287,7\n*E\n"})
/* renamed from: o.h12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6695h12 extends W02 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,17:1\n3033#2:18\n*E\n"})
    /* renamed from: o.h12$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, GW0 {
        public final /* synthetic */ B02 X;

        public a(B02 b02) {
            this.X = b02;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.X.iterator();
        }
    }

    /* renamed from: o.h12$b */
    /* loaded from: classes3.dex */
    public static final class b implements HA0<Object, Boolean> {
        public static final b X = new b();

        @Override // o.HA0
        /* renamed from: c */
        public final Boolean invoke(Object obj) {
            C6562gT0.y(3, "R");
            return Boolean.valueOf(Objects.nonNull(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.h12$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c<R> extends C7964mB0 implements HA0<Iterable<? extends R>, Iterator<? extends R>> {
        public static final c e1 = new c();

        public c() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final Iterator<R> invoke(Iterable<? extends R> iterable) {
            C6562gT0.p(iterable, "p0");
            return (Iterator<? extends R>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.h12$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d<R> extends C7964mB0 implements HA0<B02<? extends R>, Iterator<? extends R>> {
        public static final d e1 = new d();

        public d() {
            super(1, B02.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final Iterator<R> invoke(B02<? extends R> b02) {
            C6562gT0.p(b02, "p0");
            return (Iterator<? extends R>) b02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.h12$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class e<R> extends C7964mB0 implements HA0<Iterable<? extends R>, Iterator<? extends R>> {
        public static final e e1 = new e();

        public e() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final Iterator<R> invoke(Iterable<? extends R> iterable) {
            C6562gT0.p(iterable, "p0");
            return (Iterator<? extends R>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.h12$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class f<R> extends C7964mB0 implements HA0<B02<? extends R>, Iterator<? extends R>> {
        public static final f e1 = new f();

        public f() {
            super(1, B02.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final Iterator<R> invoke(B02<? extends R> b02) {
            C6562gT0.p(b02, "p0");
            return (Iterator<? extends R>) b02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* renamed from: o.h12$g */
    /* loaded from: classes3.dex */
    public static final class g<K, T> implements UE0<T, K> {
        public final /* synthetic */ B02<T> a;
        public final /* synthetic */ HA0<T, K> b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(B02<? extends T> b02, HA0<? super T, ? extends K> ha0) {
            this.a = b02;
            this.b = ha0;
        }

        @Override // o.UE0
        public K a(T t) {
            return this.b.invoke(t);
        }

        @Override // o.UE0
        public Iterator<T> b() {
            return this.a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.h12$h */
    /* loaded from: classes3.dex */
    public static final class h<T> implements B02<T> {
        public final /* synthetic */ B02<T> a;
        public final /* synthetic */ T b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(B02<? extends T> b02, T t) {
            this.a = b02;
            this.b = t;
        }

        public static final boolean d(RP1.a aVar, Object obj, Object obj2) {
            if (aVar.X || !C6562gT0.g(obj2, obj)) {
                return true;
            }
            aVar.X = true;
            return false;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            final RP1.a aVar = new RP1.a();
            B02<T> b02 = this.a;
            final T t = this.b;
            return C6695h12.N0(b02, new HA0() { // from class: o.i12
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    boolean d;
                    d = C6695h12.h.d(RP1.a.this, t, obj);
                    return Boolean.valueOf(d);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.h12$i */
    /* loaded from: classes3.dex */
    public static final class i<T> implements B02<T> {
        public final /* synthetic */ B02<T> a;
        public final /* synthetic */ T[] b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(B02<? extends T> b02, T[] tArr) {
            this.a = b02;
            this.b = tArr;
        }

        public static final boolean d(Object[] objArr, Object obj) {
            return C7330jf.B8(objArr, obj);
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            B02<T> b02 = this.a;
            final T[] tArr = this.b;
            return C6695h12.U0(b02, new HA0() { // from class: o.j12
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    boolean d;
                    d = C6695h12.i.d(tArr, obj);
                    return Boolean.valueOf(d);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.h12$j */
    /* loaded from: classes3.dex */
    public static final class j<T> implements B02<T> {
        public final /* synthetic */ Iterable<T> a;
        public final /* synthetic */ B02<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Iterable<? extends T> iterable, B02<? extends T> b02) {
            this.a = iterable;
            this.b = b02;
        }

        public static final boolean d(Collection collection, Object obj) {
            return collection.contains(obj);
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            final Collection t0 = C9444sF.t0(this.a);
            if (t0.isEmpty()) {
                return this.b.iterator();
            }
            return C6695h12.U0(this.b, new HA0() { // from class: o.k12
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    boolean d;
                    d = C6695h12.j.d(t0, obj);
                    return Boolean.valueOf(d);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.h12$k */
    /* loaded from: classes3.dex */
    public static final class k<T> implements B02<T> {
        public final /* synthetic */ B02<T> a;
        public final /* synthetic */ B02<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(B02<? extends T> b02, B02<? extends T> b022) {
            this.a = b02;
            this.b = b022;
        }

        public static final boolean d(List list, Object obj) {
            return list.contains(obj);
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            final List G3 = C6695h12.G3(this.a);
            if (G3.isEmpty()) {
                return this.b.iterator();
            }
            return C6695h12.U0(this.b, new HA0() { // from class: o.l12
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    boolean d;
                    d = C6695h12.k.d(G3, obj);
                    return Boolean.valueOf(d);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @FV(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2423, 2427}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: o.h12$l */
    /* loaded from: classes3.dex */
    public static final class l<R> extends MT1 implements VA0<F02<? super R>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ R b1;
        public final /* synthetic */ B02<T> c1;
        public final /* synthetic */ VA0<R, T, R> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(R r, B02<? extends T> b02, VA0<? super R, ? super T, ? extends R> va0, HM<? super l> hm) {
            super(2, hm);
            this.b1 = r;
            this.c1 = b02;
            this.d1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            if (r1.b(r7, r6) == r0) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
            if (r7 == r0) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:7:0x001b). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            F02 f02;
            R r;
            F02 f022;
            Iterator it;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        it = (Iterator) this.Y0;
                        Object obj2 = this.Z;
                        f022 = (F02) this.a1;
                        RT1.n(obj);
                        R r2 = obj2;
                        r = r2;
                        if (!it.hasNext()) {
                            R i2 = this.d1.i(r, it.next());
                            this.a1 = f022;
                            this.Z = i2;
                            this.Y0 = it;
                            this.Z0 = 2;
                            Object b = f022.b(i2, this);
                            r2 = i2;
                        } else {
                            return C7458kA2.a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    f02 = (F02) this.a1;
                    RT1.n(obj);
                }
            } else {
                RT1.n(obj);
                f02 = (F02) this.a1;
                R r3 = this.b1;
                this.a1 = f02;
                this.Z0 = 1;
            }
            r = this.b1;
            f022 = f02;
            it = this.c1.iterator();
            if (!it.hasNext()) {
            }
        }

        public final Object O(F02<? super R> f02, HM<? super C7458kA2> hm) {
            return ((l) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Object obj, HM<? super C7458kA2> hm) {
            return O((F02) obj, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            l lVar = new l(this.b1, this.c1, this.d1, hm);
            lVar.a1 = obj;
            return lVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @FV(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2451, 2456}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
    /* renamed from: o.h12$m */
    /* loaded from: classes3.dex */
    public static final class m<R> extends MT1 implements VA0<F02<? super R>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ R c1;
        public final /* synthetic */ B02<T> d1;
        public final /* synthetic */ XA0<Integer, R, T, R> e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(R r, B02<? extends T> b02, XA0<? super Integer, ? super R, ? super T, ? extends R> xa0, HM<? super m> hm) {
            super(2, hm);
            this.c1 = r;
            this.d1 = b02;
            this.e1 = xa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
            if (r1.b(r9, r8) == r0) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            F02 f02;
            R r;
            Iterator it;
            int i;
            F02 f022;
            Object l = C7289jT0.l();
            int i2 = this.a1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int i3 = this.Z0;
                        it = (Iterator) this.Y0;
                        Object obj2 = this.Z;
                        f022 = (F02) this.b1;
                        RT1.n(obj);
                        r = obj2;
                        i = i3;
                        while (it.hasNext()) {
                            Object next = it.next();
                            XA0<Integer, R, T, R> xa0 = this.e1;
                            int i4 = i + 1;
                            if (i < 0) {
                                C8222nF.Z();
                            }
                            R P = xa0.P(C10557wp.f(i), r, next);
                            this.b1 = f022;
                            this.Z = P;
                            this.Y0 = it;
                            this.Z0 = i4;
                            this.a1 = 2;
                            if (f022.b(P, this) == l) {
                                return l;
                            }
                            r = P;
                            i = i4;
                        }
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f02 = (F02) this.b1;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                f02 = (F02) this.b1;
                R r2 = this.c1;
                this.b1 = f02;
                this.a1 = 1;
            }
            r = this.c1;
            it = this.d1.iterator();
            i = 0;
            f022 = f02;
            while (it.hasNext()) {
            }
            return C7458kA2.a;
        }

        public final Object O(F02<? super R> f02, HM<? super C7458kA2> hm) {
            return ((m) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Object obj, HM<? super C7458kA2> hm) {
            return O((F02) obj, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            m mVar = new m(this.c1, this.d1, this.e1, hm);
            mVar.b1 = obj;
            return mVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @FV(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2480, 2483}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: o.h12$n */
    /* loaded from: classes3.dex */
    public static final class n<S> extends MT1 implements VA0<F02<? super S>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ B02<T> b1;
        public final /* synthetic */ VA0<S, T, S> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(B02<? extends T> b02, VA0<? super S, ? super T, ? extends S> va0, HM<? super n> hm) {
            super(2, hm);
            this.b1 = b02;
            this.c1 = va0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            F02 f02;
            Object next;
            Iterator it;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                next = this.Y0;
                it = (Iterator) this.Z;
                f02 = (F02) this.a1;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                f02 = (F02) this.a1;
                Iterator it2 = this.b1.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.a1 = f02;
                    this.Z = it2;
                    this.Y0 = next;
                    this.Z0 = 1;
                    if (f02.b(next, this) != l) {
                        it = it2;
                    } else {
                        return l;
                    }
                }
                return C7458kA2.a;
            }
            while (it.hasNext()) {
                next = this.c1.i(next, it.next());
                this.a1 = f02;
                this.Z = it;
                this.Y0 = next;
                this.Z0 = 2;
                if (f02.b(next, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        public final Object O(F02<? super S> f02, HM<? super C7458kA2> hm) {
            return ((n) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Object obj, HM<? super C7458kA2> hm) {
            return O((F02) obj, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            n nVar = new n(this.b1, this.c1, hm);
            nVar.a1 = obj;
            return nVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @FV(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2509, 2513}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    /* renamed from: o.h12$o */
    /* loaded from: classes3.dex */
    public static final class o<S> extends MT1 implements VA0<F02<? super S>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ B02<T> c1;
        public final /* synthetic */ XA0<Integer, S, T, S> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(B02<? extends T> b02, XA0<? super Integer, ? super S, ? super T, ? extends S> xa0, HM<? super o> hm) {
            super(2, hm);
            this.c1 = b02;
            this.d1 = xa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
            if (r5.b(r1, r9) == r0) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            F02 f02;
            Iterator it;
            Object next;
            Object l = C7289jT0.l();
            int i = this.a1;
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int i3 = this.Z0;
                        Object obj2 = this.Y0;
                        it = (Iterator) this.Z;
                        f02 = (F02) this.b1;
                        RT1.n(obj);
                        i2 = i3;
                        next = obj2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    next = this.Y0;
                    it = (Iterator) this.Z;
                    f02 = (F02) this.b1;
                    RT1.n(obj);
                }
            } else {
                RT1.n(obj);
                f02 = (F02) this.b1;
                it = this.c1.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.b1 = f02;
                    this.Z = it;
                    this.Y0 = next;
                    this.a1 = 1;
                }
                return C7458kA2.a;
            }
            while (it.hasNext()) {
                XA0<Integer, S, T, S> xa0 = this.d1;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    C8222nF.Z();
                }
                Object P = xa0.P(C10557wp.f(i2), next, it.next());
                this.b1 = f02;
                this.Z = it;
                this.Y0 = P;
                this.Z0 = i4;
                this.a1 = 2;
                if (f02.b(P, this) == l) {
                    return l;
                }
                next = P;
                i2 = i4;
            }
            return C7458kA2.a;
        }

        public final Object O(F02<? super S> f02, HM<? super C7458kA2> hm) {
            return ((o) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Object obj, HM<? super C7458kA2> hm) {
            return O((F02) obj, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            o oVar = new o(this.c1, this.d1, hm);
            oVar.b1 = obj;
            return oVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.h12$p */
    /* loaded from: classes3.dex */
    public static final class p<T> implements B02<T> {
        public final /* synthetic */ B02<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public p(B02<? extends T> b02) {
            this.a = b02;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            List H3 = C6695h12.H3(this.a);
            C9201rF.m0(H3);
            return H3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.h12$q */
    /* loaded from: classes3.dex */
    public static final class q<T> implements B02<T> {
        public final /* synthetic */ B02<T> a;
        public final /* synthetic */ Comparator<? super T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public q(B02<? extends T> b02, Comparator<? super T> comparator) {
            this.a = b02;
            this.b = comparator;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            List H3 = C6695h12.H3(this.a);
            C9201rF.p0(H3, this.b);
            return H3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @FV(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2985}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: o.h12$r */
    /* loaded from: classes3.dex */
    public static final class r<R> extends MT1 implements VA0<F02<? super R>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ B02<T> b1;
        public final /* synthetic */ VA0<T, T, R> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(B02<? extends T> b02, VA0<? super T, ? super T, ? extends R> va0, HM<? super r> hm) {
            super(2, hm);
            this.b1 = b02;
            this.c1 = va0;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:6:0x0018). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            F02 f02;
            Object next;
            Iterator it;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    Object next2 = this.Y0;
                    it = (Iterator) this.Z;
                    f02 = (F02) this.a1;
                    RT1.n(obj);
                    next = next2;
                    if (it.hasNext()) {
                        next2 = it.next();
                        R i2 = this.c1.i(next, next2);
                        this.a1 = f02;
                        this.Z = it;
                        this.Y0 = next2;
                        this.Z0 = 1;
                        if (f02.b(i2, this) == l) {
                            return l;
                        }
                        next = next2;
                        if (it.hasNext()) {
                            return C7458kA2.a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                F02 f022 = (F02) this.a1;
                Iterator it2 = this.b1.iterator();
                if (!it2.hasNext()) {
                    return C7458kA2.a;
                }
                f02 = f022;
                next = it2.next();
                it = it2;
                if (it.hasNext()) {
                }
            }
        }

        public final Object O(F02<? super R> f02, HM<? super C7458kA2> hm) {
            return ((r) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Object obj, HM<? super C7458kA2> hm) {
            return O((F02) obj, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            r rVar = new r(this.b1, this.c1, hm);
            rVar.a1 = obj;
            return rVar;
        }
    }

    public C6695h12() {
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T, R> B02<R> A0(@NotNull B02<? extends T> b02, int i2, @NotNull HA0<? super List<? extends T>, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        return L3(b02, i2, i2, true, ha0);
    }

    public static final <T> int A1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i2 < 0) {
                C8222nF.Z();
            }
            if (ha0.invoke(obj).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T A2(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final <T> int A3(B02<? extends T> b02, HA0<? super T, C7162ix2> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            n2 = C7162ix2.n(n2 + ha0.invoke((T) it.next()).p0());
        }
        return n2;
    }

    public static <T> boolean B0(@NotNull B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        if (z1(b02, t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> int B1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        int i2 = -1;
        int i3 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i3 < 0) {
                C8222nF.Z();
            }
            if (ha0.invoke(obj).booleanValue()) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T B2(@NotNull B02<? extends T> b02, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            T next = it.next();
            if (comparator.compare(obj, next) > 0) {
                obj = next;
            }
        }
        return (T) obj;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final <T> long B3(B02<? extends T> b02, HA0<? super T, C9860tx2> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            n2 = C9860tx2.n(n2 + ha0.invoke((T) it.next()).p0());
        }
        return n2;
    }

    public static <T> int C0(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        return i2;
    }

    @NotNull
    public static final <T, A extends Appendable> A C1(@NotNull B02<? extends T> b02, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : b02) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            C6849hf2.b(a2, t, ha0);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T> T C2(@NotNull B02<? extends T> b02, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T> B02<T> C3(@NotNull B02<? extends T> b02, int i2) {
        C6562gT0.p(b02, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return U02.l();
            }
            if (b02 instanceof C70) {
                return ((C70) b02).b(i2);
            }
            return new C2562Bl2(b02, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T> int D0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                C8222nF.Y();
            }
        }
        return i2;
    }

    public static /* synthetic */ Appendable D1(B02 b02, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return C1(b02, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @NotNull
    public static final <T> B02<T> D2(@NotNull B02<? extends T> b02, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(iterable, "elements");
        return new j(iterable, b02);
    }

    @NotNull
    public static final <T> B02<T> D3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        return new C2660Cl2(b02, ha0);
    }

    @NotNull
    public static final <T> B02<T> E0(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return G0(b02, new HA0() { // from class: o.g12
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object F0;
                F0 = C6695h12.F0(obj);
                return F0;
            }
        });
    }

    @NotNull
    public static final <T> String E1(@NotNull B02<? extends T> b02, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) C1(b02, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @NotNull
    public static final <T> B02<T> E2(@NotNull B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        return new h(b02, t);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C E3(@NotNull B02<? extends T> b02, @NotNull C c2) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        for (T t : b02) {
            c2.add(t);
        }
        return c2;
    }

    public static /* synthetic */ String F1(B02 b02, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return E1(b02, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <T> B02<T> F2(@NotNull B02<? extends T> b02, @NotNull B02<? extends T> b022) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(b022, "elements");
        return new k(b022, b02);
    }

    @NotNull
    public static final <T> HashSet<T> F3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return (HashSet) E3(b02, new HashSet());
    }

    @NotNull
    public static final <T, K> B02<T> G0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        return new G40(b02, ha0);
    }

    public static <T> T G1(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> B02<T> G2(@NotNull B02<? extends T> b02, @NotNull T[] tArr) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(tArr, "elements");
        if (tArr.length == 0) {
            return b02;
        }
        return new i(b02, tArr);
    }

    @NotNull
    public static <T> List<T> G3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return C8222nF.H();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return C7979mF.k(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> B02<T> H0(@NotNull B02<? extends T> b02, int i2) {
        C6562gT0.p(b02, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return b02;
            }
            if (b02 instanceof C70) {
                return ((C70) b02).a(i2);
            }
            return new C10631x70(b02, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T H1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : b02) {
            if (ha0.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @XP0
    public static final <T> B02<T> H2(B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        return E2(b02, t);
    }

    @NotNull
    public static final <T> List<T> H3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return (List) E3(b02, new ArrayList());
    }

    @NotNull
    public static final <T> B02<T> I0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        return new D70(b02, ha0);
    }

    public static final <T> int I1(@NotNull B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        int i2 = -1;
        int i3 = 0;
        for (T t2 : b02) {
            if (i3 < 0) {
                C8222nF.Z();
            }
            if (C6562gT0.g(t, t2)) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    public static final <T> boolean I2(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return !b02.iterator().hasNext();
    }

    @NotNull
    public static final <T> Set<T> I3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : b02) {
            linkedHashSet.add(t);
        }
        return linkedHashSet;
    }

    public static final <T> T J0(@NotNull B02<? extends T> b02, final int i2) {
        C6562gT0.p(b02, "<this>");
        return (T) L0(b02, i2, new HA0() { // from class: o.c12
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object K0;
                K0 = C6695h12.K0(i2, ((Integer) obj).intValue());
                return K0;
            }
        });
    }

    @Nullable
    public static final <T> T J1(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> boolean J2(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> Set<T> J3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return B22.k();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return A22.f(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final Object K0(int i2, int i3) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i2 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T K1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        for (T t2 : b02) {
            if (ha0.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T> B02<T> K2(@NotNull B02<? extends T> b02, @NotNull final HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "action");
        return L1(b02, new HA0() { // from class: o.e12
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object L2;
                L2 = C6695h12.L2(HA0.this, obj);
                return L2;
            }
        });
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> B02<List<T>> K3(@NotNull B02<? extends T> b02, int i2, int i3, boolean z) {
        C6562gT0.p(b02, "<this>");
        return C8688p92.c(b02, i2, i3, z, false);
    }

    public static final <T> T L0(@NotNull B02<? extends T> b02, int i2, @NotNull HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 < 0) {
            return ha0.invoke(Integer.valueOf(i2));
        }
        int i3 = 0;
        for (T t : b02) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t;
            }
            i3 = i4;
        }
        return ha0.invoke(Integer.valueOf(i2));
    }

    @NotNull
    public static <T, R> B02<R> L1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        return new C4362Ts2(b02, ha0);
    }

    public static final Object L2(HA0 ha0, Object obj) {
        ha0.invoke(obj);
        return obj;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T, R> B02<R> L3(@NotNull B02<? extends T> b02, int i2, int i3, boolean z, @NotNull HA0<? super List<? extends T>, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        return L1(C8688p92.c(b02, i2, i3, z, true), ha0);
    }

    @Nullable
    public static final <T> T M0(@NotNull B02<? extends T> b02, int i2) {
        C6562gT0.p(b02, "<this>");
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (T t : b02) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t;
            }
            i3 = i4;
        }
        return null;
    }

    @NotNull
    public static final <T, R> B02<R> M1(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "transform");
        return new C4265Ss2(b02, va0);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T> B02<T> M2(@NotNull B02<? extends T> b02, @NotNull final VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "action");
        return M1(b02, new VA0() { // from class: o.f12
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                Object N2;
                N2 = C6695h12.N2(VA0.this, ((Integer) obj).intValue(), obj2);
                return N2;
            }
        });
    }

    public static /* synthetic */ B02 M3(B02 b02, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return K3(b02, i2, i3, z);
    }

    @NotNull
    public static <T> B02<T> N0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        return new C7387jt0(b02, true, ha0);
    }

    @NotNull
    public static final <T, R> B02<R> N1(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "transform");
        return V0(new C4265Ss2(b02, va0));
    }

    public static final Object N2(VA0 va0, int i2, Object obj) {
        va0.i(Integer.valueOf(i2), obj);
        return obj;
    }

    public static /* synthetic */ B02 N3(B02 b02, int i2, int i3, boolean z, HA0 ha0, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return L3(b02, i2, i3, z, ha0);
    }

    @NotNull
    public static final <T> B02<T> O0(@NotNull B02<? extends T> b02, @NotNull final VA0<? super Integer, ? super T, Boolean> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "predicate");
        return new C4362Ts2(new C7387jt0(new C10214vP0(b02), true, new HA0() { // from class: o.Z02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                boolean P0;
                P0 = C6695h12.P0(VA0.this, (C9485sP0) obj);
                return Boolean.valueOf(P0);
            }
        }), new HA0() { // from class: o.a12
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object Q0;
                Q0 = C6695h12.Q0((C9485sP0) obj);
                return Q0;
            }
        });
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C O1(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            R i4 = va0.i(Integer.valueOf(i2), obj);
            if (i4 != null) {
                c2.add(i4);
            }
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static final <T> C4180Rx1<List<T>, List<T>> O2(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (ha0.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    @NotNull
    public static final <T> B02<C9485sP0<T>> O3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return new C10214vP0(b02);
    }

    public static final boolean P0(VA0 va0, C9485sP0 c9485sP0) {
        C6562gT0.p(c9485sP0, "it");
        return ((Boolean) va0.i(Integer.valueOf(c9485sP0.e()), c9485sP0.f())).booleanValue();
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C P1(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            c2.add(va0.i(Integer.valueOf(i2), obj));
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static final <T> B02<T> P2(@NotNull B02<? extends T> b02, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(iterable, "elements");
        return U02.n(U02.A(b02, C10662xF.C1(iterable)));
    }

    @NotNull
    public static final <T, R> B02<C4180Rx1<T, R>> P3(@NotNull B02<? extends T> b02, @NotNull B02<? extends R> b022) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(b022, "other");
        return new C2647Ci1(b02, b022, new VA0() { // from class: o.X02
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                C4180Rx1 R3;
                R3 = C6695h12.R3(obj, obj2);
                return R3;
            }
        });
    }

    public static final Object Q0(C9485sP0 c9485sP0) {
        C6562gT0.p(c9485sP0, "it");
        return c9485sP0.f();
    }

    @NotNull
    public static <T, R> B02<R> Q1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        return V0(new C4362Ts2(b02, ha0));
    }

    @NotNull
    public static final <T> B02<T> Q2(@NotNull B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        return U02.n(U02.A(b02, U02.A(t)));
    }

    @NotNull
    public static final <T, R, V> B02<V> Q3(@NotNull B02<? extends T> b02, @NotNull B02<? extends R> b022, @NotNull VA0<? super T, ? super R, ? extends V> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(b022, "other");
        C6562gT0.p(va0, "transform");
        return new C2647Ci1(b02, b022, va0);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C R0(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull VA0<? super Integer, ? super T, Boolean> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            if (va0.i(Integer.valueOf(i2), obj).booleanValue()) {
                c2.add(obj);
            }
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C R1(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (invoke != null) {
                c2.add(invoke);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T> B02<T> R2(@NotNull B02<? extends T> b02, @NotNull B02<? extends T> b022) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(b022, "elements");
        return U02.n(U02.A(b02, b022));
    }

    public static final C4180Rx1 R3(Object obj, Object obj2) {
        return C6670gv2.a(obj, obj2);
    }

    public static final /* synthetic */ <R> B02<R> S0(B02<?> b02) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.w();
        B02<R> N0 = N0(b02, b.X);
        C6562gT0.n(N0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return N0;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C S1(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            c2.add(ha0.invoke((T) it.next()));
        }
        return c2;
    }

    @NotNull
    public static final <T> B02<T> S2(@NotNull B02<? extends T> b02, @NotNull T[] tArr) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(tArr, "elements");
        return P2(b02, C4788Ye.t(tArr));
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> B02<C4180Rx1<T, T>> S3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return T3(b02, new VA0() { // from class: o.b12
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                C4180Rx1 U3;
                U3 = C6695h12.U3(obj, obj2);
                return U3;
            }
        });
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C T0(B02<?> b02, C c2) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        for (Object obj : b02) {
            C6562gT0.y(3, "R");
            if (obj != null) {
                c2.add(obj);
            }
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T T1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = ha0.invoke(next);
        T t2 = next;
        do {
            T next2 = it.next();
            R invoke2 = ha0.invoke(next2);
            t = t2;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                t = next2;
            }
            t2 = t;
        } while (it.hasNext());
        return t;
    }

    @XP0
    public static final <T> B02<T> T2(B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        return Q2(b02, t);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T, R> B02<R> T3(@NotNull B02<? extends T> b02, @NotNull VA0<? super T, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "transform");
        return N02.b(new r(b02, va0, null));
    }

    @NotNull
    public static final <T> B02<T> U0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        return new C7387jt0(b02, false, ha0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T U1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            R invoke = ha0.invoke(next);
            T t2 = next;
            do {
                T next2 = it.next();
                R invoke2 = ha0.invoke(next2);
                t = t2;
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    t = next2;
                }
                t2 = t;
            } while (it.hasNext());
            return t;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S U2(@NotNull B02<? extends T> b02, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = va0.i(next, (T) it.next());
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final C4180Rx1 U3(Object obj, Object obj2) {
        return C6670gv2.a(obj, obj2);
    }

    @NotNull
    public static final <T> B02<T> V0(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        B02<T> U0 = U0(b02, new HA0() { // from class: o.d12
            @Override // o.HA0
            public final Object invoke(Object obj) {
                boolean W0;
                W0 = C6695h12.W0(obj);
                return Boolean.valueOf(W0);
            }
        });
        C6562gT0.n(U0, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return U0;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double V1(B02<? extends T> b02, HA0<? super T, Double> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            double doubleValue = ha0.invoke((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ha0.invoke((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S V2(@NotNull B02<? extends T> b02, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i2 = 1;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C8222nF.Z();
                }
                next = xa0.P(Integer.valueOf(i2), next, (T) it.next());
                i2 = i3;
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final boolean W0(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> float W1(B02<? extends T> b02, HA0<? super T, Float> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            float floatValue = ha0.invoke((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ha0.invoke((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S W2(@NotNull B02<? extends T> b02, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            next = xa0.P(Integer.valueOf(i2), next, (T) it.next());
            i2 = i3;
        }
        return (S) next;
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C X0(@NotNull B02<? extends T> b02, @NotNull C c2) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        for (T t : b02) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R X1(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke2 = ha0.invoke((T) it.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S X2(@NotNull B02<? extends T> b02, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = va0.i(next, (T) it.next());
        }
        return (S) next;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C Y0(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!ha0.invoke(obj).booleanValue()) {
                c2.add(obj);
            }
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R Y1(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke2 = ha0.invoke((T) it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @NotNull
    public static final <T> B02<T> Y2(@NotNull final B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return L1(b02, new HA0() { // from class: o.Y02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object Z2;
                Z2 = C6695h12.Z2(B02.this, obj);
                return Z2;
            }
        });
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C Z0(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (ha0.invoke(obj).booleanValue()) {
                c2.add(obj);
            }
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Double Z1(B02<? extends T> b02, HA0<? super T, Double> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ha0.invoke((T) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ha0.invoke((T) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final Object Z2(B02 b02, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("null element found in " + b02 + '.');
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @XP0
    public static final <T> T a1(B02<? extends T> b02, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : b02) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Float a2(B02<? extends T> b02, HA0<? super T, Float> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ha0.invoke((T) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ha0.invoke((T) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> B02<R> a3(@NotNull B02<? extends T> b02, R r2, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "operation");
        return N02.b(new l(r2, b02, va0, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> T b1(B02<? extends T> b02, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        for (T t2 : b02) {
            if (ha0.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R b2(B02<? extends T> b02, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            Object obj = (R) ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = ha0.invoke((T) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> B02<R> b3(@NotNull B02<? extends T> b02, R r2, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(xa0, "operation");
        return N02.b(new m(r2, b02, xa0, null));
    }

    public static final <T> T c1(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R c2(B02<? extends T> b02, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S, T extends S> B02<S> c3(@NotNull B02<? extends T> b02, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "operation");
        return N02.b(new n(b02, va0, null));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T d1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : b02) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T d2(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S, T extends S> B02<S> d3(@NotNull B02<? extends T> b02, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(xa0, "operation");
        return N02.b(new o(b02, xa0, null));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <T, R> R e1(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
        R r2;
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (true) {
            if (it.hasNext()) {
                r2 = ha0.invoke((T) it.next());
                if (r2 != null) {
                    break;
                }
            } else {
                r2 = null;
                break;
            }
        }
        if (r2 != null) {
            return r2;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double e2(@NotNull B02<Double> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Double> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> B02<R> e3(@NotNull B02<? extends T> b02, R r2, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "operation");
        return a3(b02, r2, va0);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <T, R> R f1(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float f2(@NotNull B02<Float> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Float> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> B02<R> f3(@NotNull B02<? extends T> b02, R r2, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(xa0, "operation");
        return b3(b02, r2, xa0);
    }

    public static final <T> boolean g0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            if (!ha0.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static <T> T g1(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double g2(@NotNull B02<Double> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Double> it = b02.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T> T g3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final <T> boolean h0(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return b02.iterator().hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T h1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : b02) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float h2(@NotNull B02<Float> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Float> it = b02.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T h3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : b02) {
            if (ha0.invoke(t2).booleanValue()) {
                if (!z) {
                    z = true;
                    t = t2;
                } else {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> boolean i0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T, R> B02<R> i1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        return new C4959Zu0(b02, ha0, d.e1);
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T i2(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public static final <T> T i3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @NotNull
    public static <T> Iterable<T> j0(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return new a(b02);
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> B02<R> j1(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "transform");
        return U02.m(b02, va0, e.e1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T j2(@NotNull B02<? extends T> b02, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            T next = it.next();
            if (comparator.compare(obj, next) < 0) {
                obj = next;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T j3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : b02) {
            if (ha0.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (!z) {
            return null;
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> B02<T> k0(B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return b02;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C k1(B02<? extends T> b02, C c2, VA0<? super Integer, ? super T, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            C9444sF.q0(c2, va0.i(Integer.valueOf(i2), obj));
            i2 = i3;
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T> T k2(@NotNull B02<? extends T> b02, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T extends Comparable<? super T>> B02<T> k3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return new p(b02);
    }

    @NotNull
    public static final <T, K, V> Map<K, V> l0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke((T) it.next());
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapIndexedSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> B02<R> l1(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, ? extends B02<? extends R>> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "transform");
        return U02.m(b02, va0, f.e1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T l2(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = ha0.invoke(next);
        T t2 = next;
        do {
            T next2 = it.next();
            R invoke2 = ha0.invoke(next2);
            t = t2;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                t = next2;
            }
            t2 = t;
        } while (it.hasNext());
        return t;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> B02<T> l3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        return o3(b02, new C11156zH.a(ha0));
    }

    @NotNull
    public static final <T, K> Map<K, T> m0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(ha0.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedSequenceTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C m1(B02<? extends T> b02, C c2, VA0<? super Integer, ? super T, ? extends B02<? extends R>> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            C9444sF.r0(c2, va0.i(Integer.valueOf(i2), obj));
            i2 = i3;
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T m2(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            R invoke = ha0.invoke(next);
            T t2 = next;
            do {
                T next2 = it.next();
                R invoke2 = ha0.invoke(next2);
                t = t2;
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    t = next2;
                }
                t2 = t;
            } while (it.hasNext());
            return t;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> B02<T> m3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        return o3(b02, new C11156zH.c(ha0));
    }

    @NotNull
    public static final <T, K, V> Map<K, V> n0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(ha0.invoke(obj), ha02.invoke(obj));
        }
        return linkedHashMap;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> B02<R> n1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "transform");
        return new C4959Zu0(b02, ha0, c.e1);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double n2(B02<? extends T> b02, HA0<? super T, Double> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            double doubleValue = ha0.invoke((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ha0.invoke((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T extends Comparable<? super T>> B02<T> n3(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return o3(b02, C11156zH.x());
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M o0(@NotNull B02<? extends T> b02, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m2.put(ha0.invoke(obj), obj);
        }
        return m2;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C o1(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull HA0<? super T, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            C9444sF.q0(c2, ha0.invoke((T) it.next()));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> float o2(B02<? extends T> b02, HA0<? super T, Float> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            float floatValue = ha0.invoke((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ha0.invoke((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static <T> B02<T> o3(@NotNull B02<? extends T> b02, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        return new q(b02, comparator);
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M p0(@NotNull B02<? extends T> b02, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m2.put(ha0.invoke(obj), ha02.invoke(obj));
        }
        return m2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C p1(@NotNull B02<? extends T> b02, @NotNull C c2, @NotNull HA0<? super T, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            C9444sF.r0(c2, ha0.invoke((T) it.next()));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R p2(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke2 = ha0.invoke((T) it.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final <T> int p3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Integer> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ha0.invoke((T) it.next()).intValue();
        }
        return i2;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M q0(@NotNull B02<? extends T> b02, @NotNull M m2, @NotNull HA0<? super T, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke((T) it.next());
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    public static final <T, R> R q1(@NotNull B02<? extends T> b02, R r2, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            r2 = va0.i(r2, (T) it.next());
        }
        return r2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R q2(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke2 = ha0.invoke((T) it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final <T> double q3(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Double> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            d2 += ha0.invoke((T) it.next()).doubleValue();
        }
        return d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> r0(@NotNull B02<? extends K> b02, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            linkedHashMap.put(obj, ha0.invoke(obj));
        }
        return linkedHashMap;
    }

    public static final <T, R> R r1(@NotNull B02<? extends T> b02, R r2, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            r2 = xa0.P(Integer.valueOf(i2), r2, obj);
            i2 = i3;
        }
        return r2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Double r2(B02<? extends T> b02, HA0<? super T, Double> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ha0.invoke((T) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ha0.invoke((T) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "sumOfByte")
    public static final int r3(@NotNull B02<Byte> b02) {
        C6562gT0.p(b02, "<this>");
        int i2 = 0;
        for (Byte b2 : b02) {
            i2 += b2.byteValue();
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M s0(@NotNull B02<? extends K> b02, @NotNull M m2, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        Iterator<? extends K> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            m2.put(obj, ha0.invoke(obj));
        }
        return m2;
    }

    public static final <T> void s1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "action");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            ha0.invoke((T) it.next());
        }
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Float s2(B02<? extends T> b02, HA0<? super T, Float> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ha0.invoke((T) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ha0.invoke((T) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "sumOfDouble")
    public static final double s3(@NotNull B02<Double> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        for (Double d3 : b02) {
            d2 += d3.doubleValue();
        }
        return d2;
    }

    @InterfaceC8046mW0(name = "averageOfByte")
    public static final double t0(@NotNull B02<Byte> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Byte b2 : b02) {
            d2 += b2.byteValue();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    public static final <T> void t1(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(va0, "action");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            va0.i(Integer.valueOf(i2), obj);
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R t2(B02<? extends T> b02, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (it.hasNext()) {
            Object obj = (R) ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = ha0.invoke((T) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double t3(B02<? extends T> b02, HA0<? super T, Double> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            d2 += ha0.invoke((T) it.next()).doubleValue();
        }
        return d2;
    }

    @InterfaceC8046mW0(name = "averageOfDouble")
    public static final double u0(@NotNull B02<Double> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Double d3 : b02) {
            d2 += d3.doubleValue();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> u1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R u2(B02<? extends T> b02, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @InterfaceC8046mW0(name = "sumOfFloat")
    public static final float u3(@NotNull B02<Float> b02) {
        C6562gT0.p(b02, "<this>");
        float f2 = 0.0f;
        for (Float f3 : b02) {
            f2 += f3.floatValue();
        }
        return f2;
    }

    @InterfaceC8046mW0(name = "averageOfFloat")
    public static final double v0(@NotNull B02<Float> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Float f2 : b02) {
            d2 += f2.floatValue();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> v1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(obj));
        }
        return linkedHashMap;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T v2(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<? extends T> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC8046mW0(name = "sumOfInt")
    public static final int v3(@NotNull B02<Integer> b02) {
        C6562gT0.p(b02, "<this>");
        int i2 = 0;
        for (Integer num : b02) {
            i2 += num.intValue();
        }
        return i2;
    }

    @InterfaceC8046mW0(name = "averageOfInt")
    public static final double w0(@NotNull B02<Integer> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Integer num : b02) {
            d2 += num.intValue();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M w1(@NotNull B02<? extends T> b02, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            Object obj2 = m2.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m2.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return m2;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double w2(@NotNull B02<Double> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Double> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> int w3(B02<? extends T> b02, HA0<? super T, Integer> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ha0.invoke((T) it.next()).intValue();
        }
        return i2;
    }

    @InterfaceC8046mW0(name = "averageOfLong")
    public static final double x0(@NotNull B02<Long> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Long l2 : b02) {
            d2 += l2.longValue();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M x1(@NotNull B02<? extends T> b02, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            Object obj2 = m2.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m2.put(invoke, obj2);
            }
            ((List) obj2).add(ha02.invoke(obj));
        }
        return m2;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float x2(@NotNull B02<Float> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Float> it = b02.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "sumOfLong")
    public static final long x3(@NotNull B02<Long> b02) {
        C6562gT0.p(b02, "<this>");
        long j2 = 0;
        for (Long l2 : b02) {
            j2 += l2.longValue();
        }
        return j2;
    }

    @InterfaceC8046mW0(name = "averageOfShort")
    public static final double y0(@NotNull B02<Short> b02) {
        C6562gT0.p(b02, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Short sh : b02) {
            d2 += sh.shortValue();
            i2++;
            if (i2 < 0) {
                C8222nF.Y();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K> UE0<T, K> y1(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "keySelector");
        return new g(b02, ha0);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double y2(@NotNull B02<Double> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Double> it = b02.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> long y3(B02<? extends T> b02, HA0<? super T, Long> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = b02.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ha0.invoke((T) it.next()).longValue();
        }
        return j2;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> B02<List<T>> z0(@NotNull B02<? extends T> b02, int i2) {
        C6562gT0.p(b02, "<this>");
        return K3(b02, i2, i2, true);
    }

    public static final <T> int z1(@NotNull B02<? extends T> b02, T t) {
        C6562gT0.p(b02, "<this>");
        int i2 = 0;
        for (T t2 : b02) {
            if (i2 < 0) {
                C8222nF.Z();
            }
            if (C6562gT0.g(t, t2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float z2(@NotNull B02<Float> b02) {
        C6562gT0.p(b02, "<this>");
        Iterator<Float> it = b02.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "sumOfShort")
    public static final int z3(@NotNull B02<Short> b02) {
        C6562gT0.p(b02, "<this>");
        int i2 = 0;
        for (Short sh : b02) {
            i2 += sh.shortValue();
        }
        return i2;
    }

    public static final Object F0(Object obj) {
        return obj;
    }
}
