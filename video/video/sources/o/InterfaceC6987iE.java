package o;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.iE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6987iE<T extends Comparable<? super T>> {

    /* renamed from: o.iE$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull InterfaceC6987iE<T> interfaceC6987iE, @NotNull T t) {
            C6562gT0.p(t, "value");
            if (t.compareTo(interfaceC6987iE.d()) >= 0 && t.compareTo(interfaceC6987iE.h()) <= 0) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull InterfaceC6987iE<T> interfaceC6987iE) {
            if (interfaceC6987iE.d().compareTo(interfaceC6987iE.h()) > 0) {
                return true;
            }
            return false;
        }
    }

    @NotNull
    T d();

    boolean e(@NotNull T t);

    @NotNull
    T h();

    boolean isEmpty();
}
