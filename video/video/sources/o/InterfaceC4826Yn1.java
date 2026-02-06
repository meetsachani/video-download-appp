package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Yn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4826Yn1 {
    boolean d(@Nullable Object obj);

    @Nullable
    Object e(@Nullable Object obj, @NotNull HM<? super C7458kA2> hm);

    boolean f();

    void h(@Nullable Object obj);

    boolean i(@NotNull Object obj);

    @NotNull
    InterfaceC5708d02<Object, InterfaceC4826Yn1> j();

    /* renamed from: o.Yn1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ Object b(InterfaceC4826Yn1 interfaceC4826Yn1, Object obj, HM hm, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return interfaceC4826Yn1.e(obj, hm);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean c(InterfaceC4826Yn1 interfaceC4826Yn1, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return interfaceC4826Yn1.d(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void d(InterfaceC4826Yn1 interfaceC4826Yn1, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                interfaceC4826Yn1.h(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }

        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }
    }
}
