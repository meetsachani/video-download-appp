package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC4611Wi0
@InterfaceC6480g82(version = "1.8")
/* loaded from: classes3.dex */
public final class LP {
    public static final /* synthetic */ LP[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final LP X = new LP("CONTINUE", 0);
    public static final LP Y = new LP("SKIP_SUBTREE", 1);
    public static final LP Z = new LP("TERMINATE", 2);

    static {
        LP[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public LP(String str, int i) {
    }

    public static final /* synthetic */ LP[] e() {
        return new LP[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<LP> g() {
        return Z0;
    }

    public static LP valueOf(String str) {
        return (LP) Enum.valueOf(LP.class, str);
    }

    public static LP[] values() {
        return (LP[]) Y0.clone();
    }
}
