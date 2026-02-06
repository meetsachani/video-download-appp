package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1463#2,14:173\n1923#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
/* loaded from: classes3.dex */
public class W02 extends U02 {
    @NotNull
    public static final <R> B02<R> F(@NotNull B02<?> b02, @NotNull final Class<R> cls) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(cls, "klass");
        B02<R> N0 = C6695h12.N0(b02, new HA0() { // from class: o.V02
            @Override // o.HA0
            public final Object invoke(Object obj) {
                boolean G;
                G = W02.G(cls, obj);
                return Boolean.valueOf(G);
            }
        });
        C6562gT0.n(N0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return N0;
    }

    public static final boolean G(Class cls, Object obj) {
        return cls.isInstance(obj);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C H(@NotNull B02<?> b02, @NotNull C c, @NotNull Class<R> cls) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(cls, "klass");
        for (Object obj : b02) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable I(B02 b02) {
        C6562gT0.p(b02, "<this>");
        return C6695h12.d2(b02);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Double J(B02 b02) {
        C6562gT0.p(b02, "<this>");
        return C6695h12.e2(b02);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Float K(B02 b02) {
        C6562gT0.p(b02, "<this>");
        return C6695h12.f2(b02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T L(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
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

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object M(B02 b02, Comparator comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C6695h12.j2(b02, comparator);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable N(B02 b02) {
        C6562gT0.p(b02, "<this>");
        return C6695h12.v2(b02);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Double O(B02 b02) {
        C6562gT0.p(b02, "<this>");
        return C6695h12.w2(b02);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Float P(B02 b02) {
        C6562gT0.p(b02, "<this>");
        return C6695h12.x2(b02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T Q(B02<? extends T> b02, HA0<? super T, ? extends R> ha0) {
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

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object R(B02 b02, Comparator comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C6695h12.B2(b02, comparator);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> BigDecimal S(B02<? extends T> b02, HA0<? super T, ? extends BigDecimal> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(ha0.invoke((T) it.next()));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> BigInteger T(B02<? extends T> b02, HA0<? super T, ? extends BigInteger> ha0) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = b02.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(ha0.invoke((T) it.next()));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> U(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "<this>");
        return (SortedSet) C6695h12.E3(b02, new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> V(@NotNull B02<? extends T> b02, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (SortedSet) C6695h12.E3(b02, new TreeSet(comparator));
    }
}
