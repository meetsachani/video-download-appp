package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.la  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC7796la {
    public static final /* synthetic */ EnumC7796la[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC7796la X = new EnumC7796la("SOURCE", 0);
    public static final EnumC7796la Y = new EnumC7796la("BINARY", 1);
    public static final EnumC7796la Z = new EnumC7796la("RUNTIME", 2);

    static {
        EnumC7796la[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC7796la(String str, int i) {
    }

    public static final /* synthetic */ EnumC7796la[] e() {
        return new EnumC7796la[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC7796la> g() {
        return Z0;
    }

    public static EnumC7796la valueOf(String str) {
        return (EnumC7796la) Enum.valueOf(EnumC7796la.class, str);
    }

    public static EnumC7796la[] values() {
        return (EnumC7796la[]) Y0.clone();
    }
}
