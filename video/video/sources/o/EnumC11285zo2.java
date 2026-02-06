package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3681Mt1
/* renamed from: o.zo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC11285zo2 {
    public static final EnumC11285zo2 X = new EnumC11285zo2("FIXED_PERIOD", 0);
    public static final EnumC11285zo2 Y = new EnumC11285zo2("FIXED_DELAY", 1);
    public static final /* synthetic */ InterfaceC3127Hd0 Y0;
    public static final /* synthetic */ EnumC11285zo2[] Z;

    static {
        EnumC11285zo2[] e = e();
        Z = e;
        Y0 = C3323Jd0.c(e);
    }

    public EnumC11285zo2(String str, int i) {
    }

    public static final /* synthetic */ EnumC11285zo2[] e() {
        return new EnumC11285zo2[]{X, Y};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC11285zo2> g() {
        return Y0;
    }

    public static EnumC11285zo2 valueOf(String str) {
        return (EnumC11285zo2) Enum.valueOf(EnumC11285zo2.class, str);
    }

    public static EnumC11285zo2[] values() {
        return (EnumC11285zo2[]) Z.clone();
    }
}
