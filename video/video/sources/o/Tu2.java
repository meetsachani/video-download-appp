package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Tu2 {
    public static final /* synthetic */ Tu2[] Z0;
    public static final /* synthetic */ InterfaceC3127Hd0 a1;
    public static final Tu2 X = new Tu2("SUCCESSFUL", 0);
    public static final Tu2 Y = new Tu2("REREGISTER", 1);
    public static final Tu2 Z = new Tu2("CANCELLED", 2);
    public static final Tu2 Y0 = new Tu2("ALREADY_SELECTED", 3);

    static {
        Tu2[] e = e();
        Z0 = e;
        a1 = C3323Jd0.c(e);
    }

    public Tu2(String str, int i) {
    }

    public static final /* synthetic */ Tu2[] e() {
        return new Tu2[]{X, Y, Z, Y0};
    }

    @NotNull
    public static InterfaceC3127Hd0<Tu2> g() {
        return a1;
    }

    public static Tu2 valueOf(String str) {
        return (Tu2) Enum.valueOf(Tu2.class, str);
    }

    public static Tu2[] values() {
        return (Tu2[]) Z0.clone();
    }
}
