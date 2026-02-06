package o;

import com.facebook.internal.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class U02 extends O02 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class a<T> implements B02<T> {
        public final /* synthetic */ FA0<Iterator<T>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(FA0<? extends Iterator<? extends T>> fa0) {
            this.a = fa0;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            return this.a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,22:1\n30#2:23\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b<T> implements B02<T> {
        public final /* synthetic */ Iterator a;

        public b(Iterator it) {
            this.a = it;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @FV(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {350}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class c<R> extends MT1 implements VA0<F02<? super R>, HM<? super C7458kA2>, Object> {
        public int Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ B02<T> b1;
        public final /* synthetic */ VA0<Integer, T, C> c1;
        public final /* synthetic */ HA0<C, Iterator<R>> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(B02<? extends T> b02, VA0<? super Integer, ? super T, ? extends C> va0, HA0<? super C, ? extends Iterator<? extends R>> ha0, HM<? super c> hm) {
            super(2, hm);
            this.b1 = b02;
            this.c1 = va0;
            this.d1 = ha0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            F02 f02;
            int i;
            Iterator it;
            Object l = C7289jT0.l();
            int i2 = this.Z0;
            if (i2 != 0) {
                if (i2 == 1) {
                    int i3 = this.Y0;
                    it = (Iterator) this.Z;
                    f02 = (F02) this.a1;
                    RT1.n(obj);
                    i = i3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                f02 = (F02) this.a1;
                i = 0;
                it = this.b1.iterator();
            }
            while (it.hasNext()) {
                Object next = it.next();
                VA0<Integer, T, C> va0 = this.c1;
                int i4 = i + 1;
                if (i < 0) {
                    C8222nF.Z();
                }
                Object i5 = va0.i(C10557wp.f(i), next);
                this.a1 = f02;
                this.Z = it;
                this.Y0 = i4;
                this.Z0 = 1;
                if (f02.e(this.d1.invoke(i5), this) == l) {
                    return l;
                }
                i = i4;
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super R> f02, HM<? super C7458kA2> hm) {
            return ((c) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            c cVar = new c(this.b1, this.c1, this.d1, hm);
            cVar.a1 = obj;
            return cVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class d<T> extends MT1 implements VA0<F02<? super T>, HM<? super C7458kA2>, Object> {
        public /* synthetic */ Object Y0;
        public int Z;
        public final /* synthetic */ B02<T> Z0;
        public final /* synthetic */ FA0<B02<T>> a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(B02<? extends T> b02, FA0<? extends B02<? extends T>> fa0, HM<? super d> hm) {
            super(2, hm);
            this.Z0 = b02;
            this.a1 = fa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
            if (r6.e(r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
            if (r6.f(r5.a1.invoke(), r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
            return r0;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
            } else {
                RT1.n(obj);
                F02 f02 = (F02) this.Y0;
                Iterator<? extends T> it = this.Z0.iterator();
                if (it.hasNext()) {
                    this.Z = 1;
                } else {
                    this.Z = 2;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super T> f02, HM<? super C7458kA2> hm) {
            return ((d) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            d dVar = new d(this.Z0, this.a1, hm);
            dVar.Y0 = obj;
            return dVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {C3503Kz.i0}, m = "invokeSuspend", n = {"$this$sequence", H.a.b}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class e<T> extends MT1 implements VA0<F02<? super T>, HM<? super C7458kA2>, Object> {
        public int Y0;
        public Object Z;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ B02<T> a1;
        public final /* synthetic */ AbstractC10696xN1 b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(B02<? extends T> b02, AbstractC10696xN1 abstractC10696xN1, HM<? super e> hm) {
            super(2, hm);
            this.a1 = b02;
            this.b1 = abstractC10696xN1;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            List H3;
            F02 f02;
            Object l = C7289jT0.l();
            int i = this.Y0;
            if (i != 0) {
                if (i == 1) {
                    H3 = (List) this.Z;
                    f02 = (F02) this.Z0;
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                H3 = C6695h12.H3(this.a1);
                f02 = (F02) this.Z0;
            }
            while (!H3.isEmpty()) {
                int m = this.b1.m(H3.size());
                Object O0 = C9444sF.O0(H3);
                if (m < H3.size()) {
                    O0 = H3.set(m, O0);
                }
                this.Z0 = f02;
                this.Z = H3;
                this.Y0 = 1;
                if (f02.b(O0, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super T> f02, HM<? super C7458kA2> hm) {
            return ((e) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            e eVar = new e(this.a1, this.b1, hm);
            eVar.Z0 = obj;
            return eVar;
        }
    }

    @NotNull
    public static <T> B02<T> A(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return C7330jf.T5(tArr);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T> B02<T> B(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return C(b02, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T> B02<T> C(@NotNull B02<? extends T> b02, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        return N02.b(new e(b02, abstractC10696xN1, null));
    }

    @NotNull
    public static final <T, R> C4180Rx1<List<T>, List<R>> D(@NotNull B02<? extends C4180Rx1<? extends T, ? extends R>> b02) {
        C6562gT0.p(b02, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4180Rx1<? extends T, ? extends R> c4180Rx1 : b02) {
            arrayList.add(c4180Rx1.e());
            arrayList2.add(c4180Rx1.f());
        }
        return C6670gv2.a(arrayList, arrayList2);
    }

    @XP0
    public static final <T> B02<T> i(FA0<? extends Iterator<? extends T>> fa0) {
        C6562gT0.p(fa0, "iterator");
        return new a(fa0);
    }

    @NotNull
    public static <T> B02<T> j(@NotNull Iterator<? extends T> it) {
        C6562gT0.p(it, "<this>");
        return k(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> B02<T> k(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        if (b02 instanceof KK) {
            return b02;
        }
        return new KK(b02);
    }

    @NotNull
    public static <T> B02<T> l() {
        return C8062mb0.a;
    }

    @NotNull
    public static final <T, C, R> B02<R> m(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, ? extends C> va0, @NotNull HA0<? super C, ? extends Iterator<? extends R>> ha0) {
        C6562gT0.p(b02, "source");
        C6562gT0.p(va0, "transform");
        C6562gT0.p(ha0, "iterator");
        return N02.b(new c(b02, va0, ha0, null));
    }

    @NotNull
    public static final <T> B02<T> n(@NotNull B02<? extends B02<? extends T>> b02) {
        C6562gT0.p(b02, "<this>");
        return o(b02, new HA0() { // from class: o.R02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Iterator p;
                p = U02.p((B02) obj);
                return p;
            }
        });
    }

    public static final <T, R> B02<R> o(B02<? extends T> b02, HA0<? super T, ? extends Iterator<? extends R>> ha0) {
        if (b02 instanceof C4362Ts2) {
            return ((C4362Ts2) b02).e(ha0);
        }
        return new C4959Zu0(b02, new HA0() { // from class: o.T02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object r;
                r = U02.r(obj);
                return r;
            }
        }, ha0);
    }

    public static final Iterator p(B02 b02) {
        C6562gT0.p(b02, "it");
        return b02.iterator();
    }

    public static final Iterator q(Iterable iterable) {
        C6562gT0.p(iterable, "it");
        return iterable.iterator();
    }

    @InterfaceC8046mW0(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> B02<T> s(@NotNull B02<? extends Iterable<? extends T>> b02) {
        C6562gT0.p(b02, "<this>");
        return o(b02, new HA0() { // from class: o.S02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Iterator q;
                q = U02.q((Iterable) obj);
                return q;
            }
        });
    }

    @R61
    @NotNull
    public static <T> B02<T> t(@Nullable final T t, @NotNull HA0<? super T, ? extends T> ha0) {
        C6562gT0.p(ha0, "nextFunction");
        if (t == null) {
            return C8062mb0.a;
        }
        return new JC0(new FA0() { // from class: o.P02
            @Override // o.FA0
            public final Object invoke() {
                Object x;
                x = U02.x(t);
                return x;
            }
        }, ha0);
    }

    @NotNull
    public static <T> B02<T> u(@NotNull final FA0<? extends T> fa0) {
        C6562gT0.p(fa0, "nextFunction");
        return k(new JC0(fa0, new HA0() { // from class: o.Q02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object w;
                w = U02.w(FA0.this, obj);
                return w;
            }
        }));
    }

    @NotNull
    public static <T> B02<T> v(@NotNull FA0<? extends T> fa0, @NotNull HA0<? super T, ? extends T> ha0) {
        C6562gT0.p(fa0, "seedFunction");
        C6562gT0.p(ha0, "nextFunction");
        return new JC0(fa0, ha0);
    }

    public static final Object w(FA0 fa0, Object obj) {
        C6562gT0.p(obj, "it");
        return fa0.invoke();
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <T> B02<T> y(@NotNull B02<? extends T> b02, @NotNull FA0<? extends B02<? extends T>> fa0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        return N02.b(new d(b02, fa0, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> B02<T> z(B02<? extends T> b02) {
        if (b02 == 0) {
            return l();
        }
        return b02;
    }

    public static final Object r(Object obj) {
        return obj;
    }

    public static final Object x(Object obj) {
        return obj;
    }
}
