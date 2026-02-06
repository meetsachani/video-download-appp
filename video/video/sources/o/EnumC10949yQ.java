package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.yQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10949yQ {
    public static final /* synthetic */ EnumC10949yQ[] Z0;
    public static final /* synthetic */ InterfaceC3127Hd0 a1;
    public static final EnumC10949yQ X = new EnumC10949yQ("DEFAULT", 0);
    public static final EnumC10949yQ Y = new EnumC10949yQ("LAZY", 1);
    @InterfaceC6442g20
    public static final EnumC10949yQ Z = new EnumC10949yQ("ATOMIC", 2);
    public static final EnumC10949yQ Y0 = new EnumC10949yQ("UNDISPATCHED", 3);

    /* renamed from: o.yQ$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC10949yQ.values().length];
            try {
                iArr[EnumC10949yQ.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10949yQ.Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10949yQ.Y0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10949yQ.Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    static {
        EnumC10949yQ[] e = e();
        Z0 = e;
        a1 = C3323Jd0.c(e);
    }

    public EnumC10949yQ(String str, int i) {
    }

    public static final /* synthetic */ EnumC10949yQ[] e() {
        return new EnumC10949yQ[]{X, Y, Z, Y0};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC10949yQ> g() {
        return a1;
    }

    public static EnumC10949yQ valueOf(String str) {
        return (EnumC10949yQ) Enum.valueOf(EnumC10949yQ.class, str);
    }

    public static EnumC10949yQ[] values() {
        return (EnumC10949yQ[]) Z0.clone();
    }

    @InterfaceC10472wS0
    public final <R, T> void h(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    }
                    throw new C3865Oq1();
                }
                Rz2.a(va0, r, hm);
                return;
            }
            MM.i(va0, r, hm);
            return;
        }
        C10104uy.e(va0, r, hm);
    }

    public final boolean i() {
        if (this == Y) {
            return true;
        }
        return false;
    }

    @InterfaceC10472wS0
    public static /* synthetic */ void j() {
    }
}
