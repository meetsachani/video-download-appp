package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ZN1 {
    public static final void a(boolean z, @NotNull Number number) {
        C6562gT0.p(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lo/iE<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final boolean b(InterfaceC6987iE interfaceC6987iE, Object obj) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        if (obj != null && interfaceC6987iE.e((Comparable) obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lo/Dv1<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @XP0
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean c(InterfaceC2796Dv1 interfaceC2796Dv1, Object obj) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        if (obj != null && interfaceC2796Dv1.e((Comparable) obj)) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final InterfaceC6246fE<Double> d(double d, double d2) {
        return new C5761dE(d, d2);
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final InterfaceC6246fE<Float> e(float f, float f2) {
        return new C6003eE(f, f2);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> InterfaceC6987iE<T> f(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(t2, "that");
        return new YG(t, t2);
    }

    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final InterfaceC2796Dv1<Double> g(double d, double d2) {
        return new C2600Bv1(d, d2);
    }

    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final InterfaceC2796Dv1<Float> h(float f, float f2) {
        return new C2698Cv1(f, f2);
    }

    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final <T extends Comparable<? super T>> InterfaceC2796Dv1<T> i(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(t2, "that");
        return new XG(t, t2);
    }
}
