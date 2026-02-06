package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class WY0 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6824hZ0.values().length];
            try {
                iArr[EnumC6824hZ0.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6824hZ0.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6824hZ0.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final <T> EY0<T> a(@Nullable Object obj, @NotNull FA0<? extends T> fa0) {
        C6562gT0.p(fa0, "initializer");
        return new C3740Nj2(fa0, obj);
    }

    @NotNull
    public static <T> EY0<T> b(@NotNull FA0<? extends T> fa0) {
        C6562gT0.p(fa0, "initializer");
        return new C3740Nj2(fa0, null, 2, null);
    }

    @NotNull
    public static final <T> EY0<T> c(@NotNull EnumC6824hZ0 enumC6824hZ0, @NotNull FA0<? extends T> fa0) {
        C6562gT0.p(enumC6824hZ0, "mode");
        C6562gT0.p(fa0, "initializer");
        int i = a.a[enumC6824hZ0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new SB2(fa0);
                }
                throw new C3865Oq1();
            }
            return new C11219zX1(fa0);
        }
        return new C3740Nj2(fa0, null, 2, null);
    }
}
