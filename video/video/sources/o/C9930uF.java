package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1999#2,14:169\n2423#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* renamed from: o.uF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9930uF extends C9687tF {
    @NotNull
    public static final <R> List<R> f1(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(cls, "klass");
        return (List) g1(iterable, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C g1(@NotNull Iterable<?> iterable, @NotNull C c, @NotNull Class<R> cls) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable h1(Iterable iterable) {
        C6562gT0.p(iterable, "<this>");
        return C10662xF.S3(iterable);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Double i1(Iterable iterable) {
        C6562gT0.p(iterable, "<this>");
        return C10662xF.T3(iterable);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Float j1(Iterable iterable) {
        C6562gT0.p(iterable, "<this>");
        return C10662xF.U3(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C10662xF.Y3(iterable, comparator);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable m1(Iterable iterable) {
        C6562gT0.p(iterable, "<this>");
        return C10662xF.k4(iterable);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Double n1(Iterable iterable) {
        C6562gT0.p(iterable, "<this>");
        return C10662xF.l4(iterable);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Float o1(Iterable iterable) {
        C6562gT0.p(iterable, "<this>");
        return C10662xF.m4(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T p1(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final /* synthetic */ Object q1(Iterable iterable, Comparator comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C10662xF.q4(iterable, comparator);
    }

    public static <T> void r1(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        Collections.reverse(list);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> BigDecimal s1(Iterable<? extends T> iterable, HA0<? super T, ? extends BigDecimal> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> BigInteger t1(Iterable<? extends T> iterable, HA0<? super T, ? extends BigInteger> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(ha0.invoke((T) it.next()));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> u1(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return (SortedSet) C10662xF.T5(iterable, new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> v1(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (SortedSet) C10662xF.T5(iterable, new TreeSet(comparator));
    }
}
