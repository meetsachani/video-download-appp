package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.iq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC7132iq {
    public static final /* synthetic */ EnumC7132iq[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC7132iq X = new EnumC7132iq("SUSPEND", 0);
    public static final EnumC7132iq Y = new EnumC7132iq("DROP_OLDEST", 1);
    public static final EnumC7132iq Z = new EnumC7132iq("DROP_LATEST", 2);

    static {
        EnumC7132iq[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC7132iq(String str, int i) {
    }

    public static final /* synthetic */ EnumC7132iq[] e() {
        return new EnumC7132iq[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC7132iq> g() {
        return Z0;
    }

    public static EnumC7132iq valueOf(String str) {
        return (EnumC7132iq) Enum.valueOf(EnumC7132iq.class, str);
    }

    public static EnumC7132iq[] values() {
        return (EnumC7132iq[]) Y0.clone();
    }
}
