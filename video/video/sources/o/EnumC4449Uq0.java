package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Uq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4449Uq0 {
    public static final EnumC4449Uq0 X = new EnumC4449Uq0("TOP_DOWN", 0);
    public static final EnumC4449Uq0 Y = new EnumC4449Uq0("BOTTOM_UP", 1);
    public static final /* synthetic */ InterfaceC3127Hd0 Y0;
    public static final /* synthetic */ EnumC4449Uq0[] Z;

    static {
        EnumC4449Uq0[] e = e();
        Z = e;
        Y0 = C3323Jd0.c(e);
    }

    public EnumC4449Uq0(String str, int i) {
    }

    public static final /* synthetic */ EnumC4449Uq0[] e() {
        return new EnumC4449Uq0[]{X, Y};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC4449Uq0> g() {
        return Y0;
    }

    public static EnumC4449Uq0 valueOf(String str) {
        return (EnumC4449Uq0) Enum.valueOf(EnumC4449Uq0.class, str);
    }

    public static EnumC4449Uq0[] values() {
        return (EnumC4449Uq0[]) Z.clone();
    }
}
