package o;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* renamed from: o.e80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5980e80 {
    public static final boolean a = false;
    @NotNull
    public static final ThreadLocal<DecimalFormat>[] b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        b = threadLocalArr;
    }

    public static final DecimalFormat a(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @NotNull
    public static final String b(double d, int i) {
        DecimalFormat a2;
        ThreadLocal<DecimalFormat>[] threadLocalArr = b;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = a(i);
                threadLocal.set(decimalFormat);
            }
            a2 = decimalFormat;
        } else {
            a2 = a(i);
        }
        String format = a2.format(d);
        C6562gT0.o(format, "format(...)");
        return format;
    }

    public static final boolean c() {
        return a;
    }
}
