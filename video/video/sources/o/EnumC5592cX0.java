package o;

import org.jetbrains.annotations.NotNull;
import org.jsoup.nodes.DocumentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC6480g82(version = "1.1")
/* renamed from: o.cX0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5592cX0 {
    public static final /* synthetic */ EnumC5592cX0[] Z0;
    public static final /* synthetic */ InterfaceC3127Hd0 a1;
    public static final EnumC5592cX0 X = new EnumC5592cX0(DocumentType.b1, 0);
    public static final EnumC5592cX0 Y = new EnumC5592cX0("PROTECTED", 1);
    public static final EnumC5592cX0 Z = new EnumC5592cX0("INTERNAL", 2);
    public static final EnumC5592cX0 Y0 = new EnumC5592cX0("PRIVATE", 3);

    static {
        EnumC5592cX0[] e = e();
        Z0 = e;
        a1 = C3323Jd0.c(e);
    }

    public EnumC5592cX0(String str, int i) {
    }

    public static final /* synthetic */ EnumC5592cX0[] e() {
        return new EnumC5592cX0[]{X, Y, Z, Y0};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC5592cX0> g() {
        return a1;
    }

    public static EnumC5592cX0 valueOf(String str) {
        return (EnumC5592cX0) Enum.valueOf(EnumC5592cX0.class, str);
    }

    public static EnumC5592cX0[] values() {
        return (EnumC5592cX0[]) Z0.clone();
    }
}
