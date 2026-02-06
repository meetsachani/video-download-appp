package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC4611Wi0
@InterfaceC6480g82(version = "1.8")
/* renamed from: o.Xu1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4756Xu1 {
    public static final EnumC4756Xu1 X = new EnumC4756Xu1("SKIP_SUBTREE", 0);
    public static final EnumC4756Xu1 Y = new EnumC4756Xu1("TERMINATE", 1);
    public static final /* synthetic */ InterfaceC3127Hd0 Y0;
    public static final /* synthetic */ EnumC4756Xu1[] Z;

    static {
        EnumC4756Xu1[] e = e();
        Z = e;
        Y0 = C3323Jd0.c(e);
    }

    public EnumC4756Xu1(String str, int i) {
    }

    public static final /* synthetic */ EnumC4756Xu1[] e() {
        return new EnumC4756Xu1[]{X, Y};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC4756Xu1> g() {
        return Y0;
    }

    public static EnumC4756Xu1 valueOf(String str) {
        return (EnumC4756Xu1) Enum.valueOf(EnumC4756Xu1.class, str);
    }

    public static EnumC4756Xu1[] values() {
        return (EnumC4756Xu1[]) Z.clone();
    }
}
