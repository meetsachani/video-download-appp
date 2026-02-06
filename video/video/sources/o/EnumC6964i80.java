package o;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC6480g82(version = "1.6")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* renamed from: o.i80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6964i80 {
    public static final /* synthetic */ EnumC6964i80[] d1;
    public static final /* synthetic */ InterfaceC3127Hd0 e1;
    @NotNull
    public final TimeUnit X;
    public static final EnumC6964i80 Y = new EnumC6964i80("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final EnumC6964i80 Z = new EnumC6964i80("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final EnumC6964i80 Y0 = new EnumC6964i80("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final EnumC6964i80 Z0 = new EnumC6964i80("SECONDS", 3, TimeUnit.SECONDS);
    public static final EnumC6964i80 a1 = new EnumC6964i80("MINUTES", 4, TimeUnit.MINUTES);
    public static final EnumC6964i80 b1 = new EnumC6964i80("HOURS", 5, TimeUnit.HOURS);
    public static final EnumC6964i80 c1 = new EnumC6964i80("DAYS", 6, TimeUnit.DAYS);

    static {
        EnumC6964i80[] e = e();
        d1 = e;
        e1 = C3323Jd0.c(e);
    }

    public EnumC6964i80(String str, int i, TimeUnit timeUnit) {
        this.X = timeUnit;
    }

    public static final /* synthetic */ EnumC6964i80[] e() {
        return new EnumC6964i80[]{Y, Z, Y0, Z0, a1, b1, c1};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC6964i80> g() {
        return e1;
    }

    public static EnumC6964i80 valueOf(String str) {
        return (EnumC6964i80) Enum.valueOf(EnumC6964i80.class, str);
    }

    public static EnumC6964i80[] values() {
        return (EnumC6964i80[]) d1.clone();
    }

    @NotNull
    public final TimeUnit h() {
        return this.X;
    }
}
