package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.hZ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6824hZ0 {
    public static final /* synthetic */ EnumC6824hZ0[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC6824hZ0 X = new EnumC6824hZ0("SYNCHRONIZED", 0);
    public static final EnumC6824hZ0 Y = new EnumC6824hZ0("PUBLICATION", 1);
    public static final EnumC6824hZ0 Z = new EnumC6824hZ0(XH0.M, 2);

    static {
        EnumC6824hZ0[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC6824hZ0(String str, int i) {
    }

    public static final /* synthetic */ EnumC6824hZ0[] e() {
        return new EnumC6824hZ0[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC6824hZ0> g() {
        return Z0;
    }

    public static EnumC6824hZ0 valueOf(String str) {
        return (EnumC6824hZ0) Enum.valueOf(EnumC6824hZ0.class, str);
    }

    public static EnumC6824hZ0[] values() {
        return (EnumC6824hZ0[]) Y0.clone();
    }
}
