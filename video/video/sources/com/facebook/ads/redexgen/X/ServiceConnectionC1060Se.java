package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Se  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ServiceConnectionC1060Se implements ServiceConnection {
    public static byte[] A02;
    public final BlockingQueue<IBinder> A00;
    public final AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-19, C8077mf.x, C8077mf.C, C8077mf.q, C8077mf.r, C8077mf.G, C2638Cg0.x7, C8077mf.n, C8077mf.A, C8077mf.G, C8077mf.r, C8077mf.n, C8077mf.q, 36, C2638Cg0.x7, C8077mf.p, C8077mf.D, C8077mf.C, C8077mf.H, 32, C8077mf.B, C8077mf.r, C8077mf.q};
    }

    public ServiceConnectionC1060Se() {
        this.A01 = new AtomicBoolean(false);
        this.A00 = new LinkedBlockingDeque();
    }

    public final IBinder A02() throws InterruptedException {
        if (!this.A01.compareAndSet(true, true)) {
            return this.A00.take();
        }
        throw new IllegalStateException(A00(0, 23, 56));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.A00.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
