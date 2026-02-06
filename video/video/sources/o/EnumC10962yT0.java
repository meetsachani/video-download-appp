package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC2842Ei0
@RM
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.yT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10962yT0 {
    public static final /* synthetic */ EnumC10962yT0[] Z0;
    public static final /* synthetic */ InterfaceC3127Hd0 a1;
    @RM
    public static final EnumC10962yT0 X = new EnumC10962yT0("AT_MOST_ONCE", 0);
    @RM
    public static final EnumC10962yT0 Y = new EnumC10962yT0("AT_LEAST_ONCE", 1);
    @RM
    public static final EnumC10962yT0 Z = new EnumC10962yT0("EXACTLY_ONCE", 2);
    @RM
    public static final EnumC10962yT0 Y0 = new EnumC10962yT0("UNKNOWN", 3);

    static {
        EnumC10962yT0[] e = e();
        Z0 = e;
        a1 = C3323Jd0.c(e);
    }

    public EnumC10962yT0(String str, int i) {
    }

    public static final /* synthetic */ EnumC10962yT0[] e() {
        return new EnumC10962yT0[]{X, Y, Z, Y0};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC10962yT0> g() {
        return a1;
    }

    public static EnumC10962yT0 valueOf(String str) {
        return (EnumC10962yT0) Enum.valueOf(EnumC10962yT0.class, str);
    }

    public static EnumC10962yT0[] values() {
        return (EnumC10962yT0[]) Z0.clone();
    }
}
