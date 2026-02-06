package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@HK1
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.wQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10463wQ {
    public static final /* synthetic */ EnumC10463wQ[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC10463wQ X = new EnumC10463wQ("COROUTINE_SUSPENDED", 0);
    public static final EnumC10463wQ Y = new EnumC10463wQ("UNDECIDED", 1);
    public static final EnumC10463wQ Z = new EnumC10463wQ("RESUMED", 2);

    static {
        EnumC10463wQ[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC10463wQ(String str, int i) {
    }

    public static final /* synthetic */ EnumC10463wQ[] e() {
        return new EnumC10463wQ[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC10463wQ> g() {
        return Z0;
    }

    public static EnumC10463wQ valueOf(String str) {
        return (EnumC10463wQ) Enum.valueOf(EnumC10463wQ.class, str);
    }

    public static EnumC10463wQ[] values() {
        return (EnumC10463wQ[]) Y0.clone();
    }
}
