package o;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.fE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6246fE<T extends Comparable<? super T>> extends InterfaceC6987iE<T> {

    /* renamed from: o.fE$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull InterfaceC6246fE<T> interfaceC6246fE, @NotNull T t) {
            C6562gT0.p(t, "value");
            if (interfaceC6246fE.f(interfaceC6246fE.d(), t) && interfaceC6246fE.f(t, interfaceC6246fE.h())) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull InterfaceC6246fE<T> interfaceC6246fE) {
            return !interfaceC6246fE.f(interfaceC6246fE.d(), interfaceC6246fE.h());
        }
    }

    @Override // o.InterfaceC6987iE
    boolean e(@NotNull T t);

    boolean f(@NotNull T t, @NotNull T t2);

    @Override // o.InterfaceC6987iE
    boolean isEmpty();
}
