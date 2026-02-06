package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Mp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0921Mp extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1891kM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0921Mp(C1891kM c1891kM, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1891kM;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A05();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
