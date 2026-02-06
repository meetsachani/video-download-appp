package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.j42  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC7191j42 {
    public static final /* synthetic */ EnumC7191j42[] Y0;
    public static final /* synthetic */ InterfaceC3127Hd0 Z0;
    public static final EnumC7191j42 X = new EnumC7191j42("START", 0);
    public static final EnumC7191j42 Y = new EnumC7191j42("STOP", 1);
    public static final EnumC7191j42 Z = new EnumC7191j42("STOP_AND_RESET_REPLAY_CACHE", 2);

    static {
        EnumC7191j42[] e = e();
        Y0 = e;
        Z0 = C3323Jd0.c(e);
    }

    public EnumC7191j42(String str, int i) {
    }

    public static final /* synthetic */ EnumC7191j42[] e() {
        return new EnumC7191j42[]{X, Y, Z};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC7191j42> g() {
        return Z0;
    }

    public static EnumC7191j42 valueOf(String str) {
        return (EnumC7191j42) Enum.valueOf(EnumC7191j42.class, str);
    }

    public static EnumC7191j42[] values() {
        return (EnumC7191j42[]) Y0.clone();
    }
}
