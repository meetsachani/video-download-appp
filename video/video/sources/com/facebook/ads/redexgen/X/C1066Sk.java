package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1066Sk extends Thread {
    public final long A00;

    public C1066Sk(long j) {
        this.A00 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    Thread.sleep(this.A00);
                } catch (InterruptedException unused) {
                }
                C1064Si.A01();
            } catch (Throwable th) {
                WU.A00(th, this);
                return;
            }
        }
    }
}
