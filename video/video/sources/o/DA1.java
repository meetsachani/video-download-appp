package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC6480g82(version = "2.1")
@InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
/* loaded from: classes3.dex */
public final class DA1 {
    public static final /* synthetic */ DA1[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final DA1 X = new DA1("INCLUDE_DIRECTORIES", 0);
    public static final DA1 Y = new DA1("BREADTH_FIRST", 1);
    public static final DA1 Z = new DA1("FOLLOW_LINKS", 2);

    static {
        DA1[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public DA1(String str, int i) {
    }

    public static final /* synthetic */ DA1[] e() {
        return new DA1[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<DA1> g() {
        return Z0;
    }

    public static DA1 valueOf(String str) {
        return (DA1) Enum.valueOf(DA1.class, str);
    }

    public static DA1[] values() {
        return (DA1[]) Y0.clone();
    }
}
