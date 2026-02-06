package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.kD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7469kD1 {
    public static <T> T[] b(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static <T> T[] c(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <K, V> Map<K, V> d(int i) {
        return PG.A(i);
    }

    public static <E> Set<E> e(int i) {
        return QG.r(i);
    }

    public static <K, V> Map<K, V> f(int i) {
        return SG.m0(i);
    }

    public static <E> Set<E> g(int i) {
        return TG.n0(i);
    }

    public static <E> Set<E> h() {
        return QG.j();
    }

    public static <K, V> Map<K, V> i() {
        return PG.v();
    }

    public static Y71 l(Y71 y71) {
        return y71.l();
    }

    public static void a() {
    }

    public static int j(int i) {
        return i;
    }

    public static int k(int i) {
        return i;
    }
}
