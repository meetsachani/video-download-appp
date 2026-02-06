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
import o.C6347fe2;

/* renamed from: o.fe2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6347fe2 {

    /* renamed from: o.fe2$a */
    /* loaded from: classes4.dex */
    public static class a<O> implements Collector<O, List<O>, O[]> {
        public static final Set<Collector.Characteristics> b = Collections.EMPTY_SET;
        public final Class<O> a;

        public a(Class<O> cls) {
            this.a = cls;
        }

        /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
            java.lang.NullPointerException
            */
        public static /* synthetic */ java.util.List a(java.util.List r0, java.util.List r1) {
            /*
                r0.addAll(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C6347fe2.a.a(java.util.List, java.util.List):java.util.List");
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
            return new BinaryOperator() { // from class: o.ae2
                /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                    jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: o.fe2.a.a(java.util.List, java.util.List):java.util.List
                    	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                    	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                    Caused by: java.lang.NullPointerException
                    */
                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) {
                    /*
                        r0 = this;
                        java.util.List r1 = (java.util.List) r1
                        java.util.List r2 = (java.util.List) r2
                        java.util.List r1 = o.C6347fe2.a.a(r1, r2)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.C5134ae2.apply(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            };
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: o.Yd2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object[] array;
                    array = r2.toArray((Object[]) Array.newInstance((Class<?>) C6347fe2.a.this.a, ((List) obj).size()));
                    return array;
                }
            };
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new C5862de2();
        }
    }

    /* renamed from: o.fe2$b */
    /* loaded from: classes4.dex */
    public static class b<O> {
        public Stream<O> a;
        public boolean b;

        public b(Stream<O> stream) {
            this.a = stream;
        }

        public boolean a(InterfaceC3945Pm0<O, ?> interfaceC3945Pm0) {
            c();
            return k().allMatch(C4328Tk0.H(interfaceC3945Pm0));
        }

        public boolean b(InterfaceC3945Pm0<O, ?> interfaceC3945Pm0) {
            c();
            return k().anyMatch(C4328Tk0.H(interfaceC3945Pm0));
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

        public b<O> f(InterfaceC3945Pm0<O, ?> interfaceC3945Pm0) {
            c();
            this.a = this.a.filter(C4328Tk0.H(interfaceC3945Pm0));
            return this;
        }

        public void g(InterfaceC7598kl0<O, ?> interfaceC7598kl0) {
            h();
            k().forEach(C4328Tk0.F(interfaceC7598kl0));
        }

        public void h() {
            c();
            this.b = true;
        }

        public <R> b<R> i(InterfaceC3551Ll0<O, R, ?> interfaceC3551Ll0) {
            c();
            return new b<>(this.a.map(C4328Tk0.G(interfaceC3551Ll0)));
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
