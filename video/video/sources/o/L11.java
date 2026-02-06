package o;

@Deprecated
/* loaded from: classes2.dex */
public interface L11 {
    @Deprecated
    public static final C4604Wg1 a = new C4604Wg1(new Object());

    boolean a();

    long b();

    default void c(AbstractC7373jp2 abstractC7373jp2, C4604Wg1 c4604Wg1, InterfaceC10469wR1[] interfaceC10469wR1Arr, C10079ur2 c10079ur2, InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        j(interfaceC10469wR1Arr, c10079ur2, interfaceC6859hi0Arr);
    }

    @Deprecated
    default boolean d(long j, float f, boolean z, long j2) {
        return g(AbstractC7373jp2.X, a, j, f, z, j2);
    }

    InterfaceC10877y8 e();

    void f();

    default boolean g(AbstractC7373jp2 abstractC7373jp2, C4604Wg1 c4604Wg1, long j, float f, boolean z, long j2) {
        return d(j, f, z, j2);
    }

    void h();

    boolean i(long j, long j2, float f);

    @Deprecated
    default void j(InterfaceC10469wR1[] interfaceC10469wR1Arr, C10079ur2 c10079ur2, InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        c(AbstractC7373jp2.X, a, interfaceC10469wR1Arr, c10079ur2, interfaceC6859hi0Arr);
    }

    void onPrepared();
}
