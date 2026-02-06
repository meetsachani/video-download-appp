package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.u20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9879u20 {
    public static final /* synthetic */ EnumC9879u20[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC9879u20 X = new EnumC9879u20("WARNING", 0);
    public static final EnumC9879u20 Y = new EnumC9879u20("ERROR", 1);
    public static final EnumC9879u20 Z = new EnumC9879u20("HIDDEN", 2);

    static {
        EnumC9879u20[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC9879u20(String str, int i) {
    }

    public static final /* synthetic */ EnumC9879u20[] e() {
        return new EnumC9879u20[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC9879u20> g() {
        return Z0;
    }

    public static EnumC9879u20 valueOf(String str) {
        return (EnumC9879u20) Enum.valueOf(EnumC9879u20.class, str);
    }

    public static EnumC9879u20[] values() {
        return (EnumC9879u20[]) Y0.clone();
    }
}
