package o;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
/* renamed from: o.Dv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2796Dv1<T extends Comparable<? super T>> {

    /* renamed from: o.Dv1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull InterfaceC2796Dv1<T> interfaceC2796Dv1, @NotNull T t) {
            C6562gT0.p(t, "value");
            if (t.compareTo(interfaceC2796Dv1.d()) >= 0 && t.compareTo(interfaceC2796Dv1.i()) < 0) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull InterfaceC2796Dv1<T> interfaceC2796Dv1) {
            if (interfaceC2796Dv1.d().compareTo(interfaceC2796Dv1.i()) >= 0) {
                return true;
            }
            return false;
        }
    }

    @NotNull
    T d();

    boolean e(@NotNull T t);

    @NotNull
    T i();

    boolean isEmpty();
}
