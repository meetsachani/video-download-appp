package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;
import o.C2638Cg0;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class TT implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1669ge A00;
    public final InterfaceC1082Ta A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, C2638Cg0.y7, -102, -74, C2638Cg0.o7, C2638Cg0.o7, -74, -69, -76, 109, -112, -68, -69, C2638Cg0.p7, -78, C2638Cg0.s7, C2638Cg0.p7, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, C8077mf.u, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, C2638Cg0.n7, -36, -24, -35, -34};
    }

    public TT(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1669ge c1669ge, TS ts) {
        this(uncaughtExceptionHandler, c1669ge, ts, AbstractC1083Tb.A00());
    }

    public TT(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1669ge c1669ge, TS ts, InterfaceC1082Ta interfaceC1082Ta) {
        this.A02 = uncaughtExceptionHandler;
        if (c1669ge != null) {
            this.A00 = c1669ge;
            this.A03 = ts.A97(c1669ge);
            this.A01 = interfaceC1082Ta;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = AbstractC1200Xt.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 7);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new TR(A03, this.A03).A02();
                    String A00 = A00(38, 7, 100);
                    String stackTraceString2 = A00(33, 5, 111);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = WP.A00();
                    String A003 = A00(45, 12, 73);
                    if (A002 == th) {
                        String stackTraceString3 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 81);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AL7(new C1089Th(this.A00.A09().A01(), this.A00.A09().A02(), A02), this.A00);
                    if (C1123Up.A2A(this.A00)) {
                        C1123Up.A0e(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
