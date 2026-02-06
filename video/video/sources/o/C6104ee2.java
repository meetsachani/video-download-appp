package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import o.C6104ee2;
import o.NB0;

@Deprecated
/* renamed from: o.ee2 */
/* loaded from: classes4.dex */
public class C6104ee2 {

    @Deprecated
    /* renamed from: o.ee2$a */
    /* loaded from: classes4.dex */
    public static class a<O> implements Collector<O, List<O>, O[]> {
        public static final Set<Collector.Characteristics> b = Collections.EMPTY_SET;
        public final Class<O> a;

        public a(Class<O> cls) {
            this.a = cls;
        }

        /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
            	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
            	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
            	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
            	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
            	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
            	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
            */
        public static /* synthetic */ java.util.List a(java.util.List r0, java.util.List r1) {
            /*
                r0.addAll(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C6104ee2.a.a(java.util.List, java.util.List):java.util.List");
        }

        public static /* synthetic */ Object[] b(a aVar, List list) {
            return list.toArray((Object[]) Array.newInstance((Class<?>) aVar.a, list.size()));
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<O>, O> accumulator() {
            return new C5619ce2();
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return b;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new BinaryOperator() { // from class: o.be2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return C6104ee2.a.a((List) obj, (List) obj2);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: o.Zd2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C6104ee2.a.b(C6104ee2.a.this, (List) obj);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new C5862de2();
        }
    }

    @Deprecated
    /* renamed from: o.ee2$b */
    /* loaded from: classes4.dex */
    public static class b<O> {
        public Stream<O> a;
        public boolean b;

        public b(Stream<O> stream) {
            this.a = stream;
        }

        public boolean a(NB0.g<O, ?> gVar) {
            c();
            return k().allMatch(NB0.z(gVar));
        }

        public boolean b(NB0.g<O, ?> gVar) {
            c();
            return k().anyMatch(NB0.z(gVar));
        }

        public void c() {
            if (!this.b) {
                return;
            }
            throw new IllegalStateException("This stream is already terminated.");
        }

        public <A, R> R d(Supplier<R> supplier, BiConsumer<R, ? super O> biConsumer, BiConsumer<R, R> biConsumer2) {
            h();
            return (R) k().collect(supplier, biConsumer, biConsumer2);
        }

        public <A, R> R e(Collector<? super O, A, R> collector) {
            h();
            return (R) k().collect(collector);
        }

        public b<O> f(NB0.g<O, ?> gVar) {
            c();
            this.a = this.a.filter(NB0.z(gVar));
            return this;
        }

        public void g(NB0.e<O, ?> eVar) {
            h();
            k().forEach(NB0.x(eVar));
        }

        public void h() {
            c();
            this.b = true;
        }

        public <R> b<R> i(NB0.f<O, R, ?> fVar) {
            c();
            return new b<>(this.a.map(NB0.y(fVar)));
        }

        public O j(O o2, BinaryOperator<O> binaryOperator) {
            h();
            return k().reduce(o2, binaryOperator);
        }

        public Stream<O> k() {
            return this.a;
        }
    }

    public static <O> b<O> a(Collection<O> collection) {
        return b(collection.stream());
    }

    public static <O> b<O> b(Stream<O> stream) {
        return new b<>(stream);
    }

    public static <O> Collector<O, ?, O[]> c(Class<O> cls) {
        return new a(cls);
    }
}
