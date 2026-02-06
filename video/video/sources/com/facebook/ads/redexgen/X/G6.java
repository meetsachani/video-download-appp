package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Arrays;
import o.C10323vs;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class G6 implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static final G6 A06;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = C10323vs.b;
    public final HandlerThread A03 = new HandlerThread(A01(0, 35, 125));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-47, 4, -5, -36, -8, -19, 5, -15, -2, C2638Cg0.t7, -46, -2, -19, -7, -15, -34, -15, -8, -15, -19, -1, -15, C2638Cg0.A7, -12, -5, -2, -15, -5, -13, -2, -19, -4, -12, -15, -2, -36, -17, -22, -21, -11, -52, -8, -25, -13, -21, C2638Cg0.n7, -21, -14, -21, -25, -7, -21, C2638Cg0.z7, -21, -14, -10, -21, -8, -68, C2638Cg0.E7, -33, -44, C2638Cg0.v7, -122, C2638Cg0.E7, C2638Cg0.u7, -45, -42, -46, C2638Cg0.A7, -44, C2638Cg0.y7, -122, C2638Cg0.w7, C2638Cg0.A7, C2638Cg0.E7, C2638Cg0.u7, -56, -46, C2638Cg0.x7, C2638Cg0.w7, -122, C2638Cg0.w7, -37, C2638Cg0.x7, -122, C2638Cg0.B7, -43, -122, -42, -46, C2638Cg0.u7, C2638Cg0.B7, -52, -43, C2638Cg0.n7, -45, -122, C2638Cg0.x7, C2638Cg0.n7, C2638Cg0.n7, -43, C2638Cg0.n7};
    }

    static {
        A05();
        A06 = new G6();
    }

    public G6() {
        this.A03.start();
        this.A02 = C5C.A0c(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static G6 A00() {
        return A06;
    }

    private void A02() {
        if (this.A01 != null) {
            this.A00++;
            if (this.A00 == 1) {
                this.A01.postFrameCallback(this);
            }
        }
    }

    private void A03() {
        try {
            this.A01 = Choreographer.getInstance();
        } catch (RuntimeException e) {
            AbstractC04624g.A0A(A01(35, 23, 119), A01(58, 45, 87), e);
        }
    }

    private void A04() {
        if (this.A01 != null) {
            this.A00--;
            if (this.A00 == 0) {
                this.A01.removeFrameCallback(this);
                this.A04 = C10323vs.b;
            }
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        ((Choreographer) AbstractC04543y.A01(this.A01)).postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A03();
                return true;
            case 1:
                A02();
                return true;
            case 2:
                A04();
                return true;
            default:
                return false;
        }
    }
}
