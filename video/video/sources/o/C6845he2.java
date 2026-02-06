package o;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "StreamsKt")
/* renamed from: o.he2 */
/* loaded from: classes3.dex */
public final class C6845he2 {

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n31#2:23\n*E\n"})
    /* renamed from: o.he2$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements B02<T> {
        public final /* synthetic */ Stream a;

        public a(Stream stream) {
            this.a = stream;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            Iterator<T> it = this.a.iterator();
            C6562gT0.o(it, "iterator(...)");
            return it;
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n39#2:23\n*E\n"})
    /* renamed from: o.he2$b */
    /* loaded from: classes3.dex */
    public static final class b implements B02<Integer> {
        public final /* synthetic */ IntStream a;

        public b(IntStream intStream) {
            this.a = intStream;
        }

        @Override // o.B02
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.a.iterator();
            C6562gT0.o(it, "iterator(...)");
            return it;
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n47#2:23\n*E\n"})
    /* renamed from: o.he2$c */
    /* loaded from: classes3.dex */
    public static final class c implements B02<Long> {
        public final /* synthetic */ LongStream a;

        public c(LongStream longStream) {
            this.a = longStream;
        }

        @Override // o.B02
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.a.iterator();
            C6562gT0.o(it, "iterator(...)");
            return it;
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n55#2:23\n*E\n"})
    /* renamed from: o.he2$d */
    /* loaded from: classes3.dex */
    public static final class d implements B02<Double> {
        public final /* synthetic */ DoubleStream a;

        public d(DoubleStream doubleStream) {
            this.a = doubleStream;
        }

        @Override // o.B02
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.a.iterator();
            C6562gT0.o(it, "iterator(...)");
            return it;
        }
    }

    public static /* synthetic */ Spliterator a(B02 b02) {
        return g(b02);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final B02<Double> b(@NotNull DoubleStream doubleStream) {
        C6562gT0.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final B02<Integer> c(@NotNull IntStream intStream) {
        C6562gT0.p(intStream, "<this>");
        return new b(intStream);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final B02<Long> d(@NotNull LongStream longStream) {
        C6562gT0.p(longStream, "<this>");
        return new c(longStream);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> B02<T> e(@NotNull Stream<T> stream) {
        C6562gT0.p(stream, "<this>");
        return new a(stream);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> Stream<T> f(@NotNull final B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: o.ge2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C6845he2.a(b02);
            }
        }, 16, false);
        C6562gT0.o(stream, "stream(...)");
        return stream;
    }

    public static final Spliterator g(B02 b02) {
        return Spliterators.spliteratorUnknownSize(b02.iterator(), 16);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final List<Double> h(@NotNull DoubleStream doubleStream) {
        C6562gT0.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        C6562gT0.o(array, "toArray(...)");
        return C4788Ye.p(array);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final List<Integer> i(@NotNull IntStream intStream) {
        C6562gT0.p(intStream, "<this>");
        int[] array = intStream.toArray();
        C6562gT0.o(array, "toArray(...)");
        return C4788Ye.r(array);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final List<Long> j(@NotNull LongStream longStream) {
        C6562gT0.p(longStream, "<this>");
        long[] array = longStream.toArray();
        C6562gT0.o(array, "toArray(...)");
        return C4788Ye.s(array);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> List<T> k(@NotNull Stream<T> stream) {
        C6562gT0.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        C6562gT0.o(collect, "collect(...)");
        return (List) collect;
    }
}
