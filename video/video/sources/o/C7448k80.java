package o;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.k80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7448k80 {

    /* renamed from: o.k80$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    @InterfaceC6480g82(version = "1.3")
    public static final double a(double d, @NotNull EnumC6964i80 enumC6964i80, @NotNull EnumC6964i80 enumC6964i802) {
        C6562gT0.p(enumC6964i80, "sourceUnit");
        C6562gT0.p(enumC6964i802, "targetUnit");
        long convert = enumC6964i802.h().convert(1L, enumC6964i80.h());
        if (convert > 0) {
            return d * convert;
        }
        return d / enumC6964i80.h().convert(1L, enumC6964i802.h());
    }

    @InterfaceC6480g82(version = "1.5")
    public static final long b(long j, @NotNull EnumC6964i80 enumC6964i80, @NotNull EnumC6964i80 enumC6964i802) {
        C6562gT0.p(enumC6964i80, "sourceUnit");
        C6562gT0.p(enumC6964i802, "targetUnit");
        return enumC6964i802.h().convert(j, enumC6964i80.h());
    }

    @InterfaceC6480g82(version = "1.5")
    public static final long c(long j, @NotNull EnumC6964i80 enumC6964i80, @NotNull EnumC6964i80 enumC6964i802) {
        C6562gT0.p(enumC6964i80, "sourceUnit");
        C6562gT0.p(enumC6964i802, "targetUnit");
        return enumC6964i802.h().convert(j, enumC6964i80.h());
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    @NotNull
    public static final EnumC6964i80 d(@NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "<this>");
        switch (a.a[timeUnit.ordinal()]) {
            case 1:
                return EnumC6964i80.Y;
            case 2:
                return EnumC6964i80.Z;
            case 3:
                return EnumC6964i80.Y0;
            case 4:
                return EnumC6964i80.Z0;
            case 5:
                return EnumC6964i80.a1;
            case 6:
                return EnumC6964i80.b1;
            case 7:
                return EnumC6964i80.c1;
            default:
                throw new C3865Oq1();
        }
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    @NotNull
    public static final TimeUnit e(@NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "<this>");
        return enumC6964i80.h();
    }
}
