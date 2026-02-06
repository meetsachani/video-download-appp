package o;

@InterfaceC6615gi
/* renamed from: o.Ae0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2434Ae0<T> {
    public static <T> AbstractC2434Ae0<T> e(int i, T t) {
        return new C3244Ii(Integer.valueOf(i), t, EnumC10429wH1.DEFAULT, null);
    }

    public static <T> AbstractC2434Ae0<T> f(int i, T t, @InterfaceC11300zs1 BI1 bi1) {
        return new C3244Ii(Integer.valueOf(i), t, EnumC10429wH1.DEFAULT, bi1);
    }

    public static <T> AbstractC2434Ae0<T> g(T t) {
        return new C3244Ii(null, t, EnumC10429wH1.DEFAULT, null);
    }

    public static <T> AbstractC2434Ae0<T> h(T t, @InterfaceC11300zs1 BI1 bi1) {
        return new C3244Ii(null, t, EnumC10429wH1.DEFAULT, bi1);
    }

    public static <T> AbstractC2434Ae0<T> i(int i, T t) {
        return new C3244Ii(Integer.valueOf(i), t, EnumC10429wH1.VERY_LOW, null);
    }

    public static <T> AbstractC2434Ae0<T> j(int i, T t, @InterfaceC11300zs1 BI1 bi1) {
        return new C3244Ii(Integer.valueOf(i), t, EnumC10429wH1.VERY_LOW, bi1);
    }

    public static <T> AbstractC2434Ae0<T> k(T t) {
        return new C3244Ii(null, t, EnumC10429wH1.VERY_LOW, null);
    }

    public static <T> AbstractC2434Ae0<T> l(T t, @InterfaceC11300zs1 BI1 bi1) {
        return new C3244Ii(null, t, EnumC10429wH1.VERY_LOW, bi1);
    }

    public static <T> AbstractC2434Ae0<T> m(int i, T t) {
        return new C3244Ii(Integer.valueOf(i), t, EnumC10429wH1.HIGHEST, null);
    }

    public static <T> AbstractC2434Ae0<T> n(int i, T t, @InterfaceC11300zs1 BI1 bi1) {
        return new C3244Ii(Integer.valueOf(i), t, EnumC10429wH1.HIGHEST, bi1);
    }

    public static <T> AbstractC2434Ae0<T> o(T t) {
        return new C3244Ii(null, t, EnumC10429wH1.HIGHEST, null);
    }

    public static <T> AbstractC2434Ae0<T> p(T t, @InterfaceC11300zs1 BI1 bi1) {
        return new C3244Ii(null, t, EnumC10429wH1.HIGHEST, bi1);
    }

    @InterfaceC11300zs1
    public abstract Integer a();

    public abstract T b();

    public abstract EnumC10429wH1 c();

    @InterfaceC11300zs1
    public abstract BI1 d();
}
