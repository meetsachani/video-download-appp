package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0753Gc implements InterfaceC1041Rk {
    public static String[] A01 = {"EbGpmssVJ7ns5QL3Rl3UMQ1bkFVQ99jJ", "NZiaRg2dkcqShBYEYgfcfS6cvloj595L", "orBeTHrcfmlzSHmkgrBC5PhD7dWIdW6R", "A0QUoJlw", "r5xapKwo2g0pU1r2itXQ9K5SrPer64wf", "XFka6Ze1I6IepT0r6LvaraMv7MRENHMC", "Xj0im9L41l0kDU7dj2M6tiOB0nkMWcds", "VCdvqSH1BrwZZsOdC7BZghv3f2EYDVkv"};
    public final /* synthetic */ C04794x A00;

    public C0753Gc(C04794x c04794x) {
        this.A00 = c04794x;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1041Rk
    public final boolean AAI() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        if (atomicBoolean.get()) {
            boolean A0l = this.A00.A0l();
            String[] strArr = A01;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A01[0] = "O5SuZCLVdBOcw9avK46kWbT1hYIehzyg";
            if (!A0l) {
                return false;
            }
        }
        return true;
    }
}
