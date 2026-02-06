package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC6480g82(version = "1.2")
/* renamed from: o.yS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10959yS1 {
    public static final /* synthetic */ EnumC10959yS1[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC10959yS1 X = new EnumC10959yS1("LANGUAGE_VERSION", 0);
    public static final EnumC10959yS1 Y = new EnumC10959yS1("COMPILER_VERSION", 1);
    public static final EnumC10959yS1 Z = new EnumC10959yS1("API_VERSION", 2);

    static {
        EnumC10959yS1[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC10959yS1(String str, int i) {
    }

    public static final /* synthetic */ EnumC10959yS1[] e() {
        return new EnumC10959yS1[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC10959yS1> g() {
        return Z0;
    }

    public static EnumC10959yS1 valueOf(String str) {
        return (EnumC10959yS1) Enum.valueOf(EnumC10959yS1.class, str);
    }

    public static EnumC10959yS1[] values() {
        return (EnumC10959yS1[]) Y0.clone();
    }
}
