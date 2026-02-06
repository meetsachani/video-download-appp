package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC6480g82(version = "1.1")
/* renamed from: o.bX0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5350bX0 {
    public static final /* synthetic */ EnumC5350bX0[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC5350bX0 X = new EnumC5350bX0("INVARIANT", 0);
    public static final EnumC5350bX0 Y = new EnumC5350bX0("IN", 1);
    public static final EnumC5350bX0 Z = new EnumC5350bX0("OUT", 2);

    static {
        EnumC5350bX0[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC5350bX0(String str, int i) {
    }

    public static final /* synthetic */ EnumC5350bX0[] e() {
        return new EnumC5350bX0[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC5350bX0> g() {
        return Z0;
    }

    public static EnumC5350bX0 valueOf(String str) {
        return (EnumC5350bX0) Enum.valueOf(EnumC5350bX0.class, str);
    }

    public static EnumC5350bX0[] values() {
        return (EnumC5350bX0[]) Y0.clone();
    }
}
