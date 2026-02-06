package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.redexgen.X.FL;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import o.C10323vs;
import o.C2638Cg0;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class FK<T extends FL> extends Handler implements Runnable {
    public static byte[] A0B;
    public static String[] A0C = {"YmYVw2S8DUZhSIJBKV9mYTBB1tKcIZso", "NDdcnO0NsMMFHF2bezmvYcIUkVZ5OtU8", "8rmJYKaybwW0Gr1XfrD6wU0k3D4t0vPA", "YmCBBtrMVj6S7IBVYd0tuHNRqLOHp", "BNlgZVMbySVAlN8KpxiSIEQEMbKarpeH", "QLj0CyLyWcLoHh5we5tUZrDrecYjAsKC", "eBbXtTNPiPKoehNQThYFNgHDUWIcJfTE", "1Eh"};
    public boolean A00;
    public int A01;
    public FI<T> A02;
    public IOException A03;
    public Thread A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final T A08;
    public volatile boolean A09;
    public final /* synthetic */ C2047n7 A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Customized to support load retries")
    private void A02() {
        InterfaceExecutorC0727Fb interfaceExecutorC0727Fb;
        FK fk;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A02.AEi(this.A08, elapsedRealtime, elapsedRealtime - this.A07, this.A01);
        this.A03 = null;
        interfaceExecutorC0727Fb = this.A0A.A02;
        fk = this.A0A.A00;
        interfaceExecutorC0727Fb.execute((Runnable) AbstractC04543y.A01(fk));
    }

    public static void A04() {
        A0B = new byte[]{-122, -87, -101, -98, -114, -101, -83, -91, -99, C2638Cg0.r7, C2638Cg0.q7, -99, -76, -101, -77, -69, -67, C2638Cg0.o7, C2638Cg0.u7, 110, -77, C2638Cg0.o7, C2638Cg0.o7, -67, C2638Cg0.o7, 110, -70, -67, -81, -78, -73, -68, -75, 110, C2638Cg0.p7, C2638Cg0.q7, C2638Cg0.o7, -77, -81, -69, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, -12, 1, 1, -2, 1, -81, -5, -2, -16, -13, -8, -3, -10, -81, 2, 3, 1, -12, -16, -4, 5, C8077mf.H, C8077mf.y, 40, 32, C8077mf.y, 19, 36, C8077mf.y, C8077mf.x, -48, C8077mf.y, 40, 19, C8077mf.y, 32, 36, C8077mf.C, 31, C8077mf.H, -48, C8077mf.B, 17, C8077mf.H, C8077mf.x, 28, C8077mf.C, C8077mf.H, C8077mf.A, -48, 28, 31, 17, C8077mf.x, -48, 19, 31, C8077mf.G, 32, 28, C8077mf.y, 36, C8077mf.y, C8077mf.x, C2638Cg0.p7, C2638Cg0.B7, -47, -28, -36, -47, C2638Cg0.A7, -32, -47, -48, -116, -47, -28, C2638Cg0.A7, -47, -36, -32, -43, -37, C2638Cg0.B7, -116, C2638Cg0.n7, -37, C2638Cg0.y7, -48, -43, C2638Cg0.B7, -45, -116, -33, -32, -34, -47, C2638Cg0.y7, C2638Cg0.E7, C8077mf.C, 28, C8077mf.p, 17, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    @MetaExoPlayerCustomization("enableContinueLoadingLogging is custom")
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (WU.A02(this)) {
            return;
        }
        String[] strArr = A0C;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0C[6] = "QgUPNZuYIqR5G6UUc33KVEWLFVIzbhR6";
        try {
            if (this.A09) {
                return;
            }
            if (message.what == 0) {
                A02();
                this.A00 = false;
            } else if (message.what == 3) {
                throw ((Error) message.obj);
            } else {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.A07;
                FI fi = (FI) AbstractC04543y.A01(this.A02);
                if (this.A05) {
                    fi.AEc(this.A08, elapsedRealtime, j2, false);
                    return;
                }
                switch (message.what) {
                    case 1:
                        try {
                            fi.AEe(this.A08, elapsedRealtime, j2);
                            return;
                        } catch (RuntimeException e) {
                            AbstractC04624g.A08(A01(0, 8, 0), A01(71, 44, 118), e);
                            this.A0A.A01 = new FP(e);
                            return;
                        }
                    case 2:
                        this.A03 = (IOException) message.obj;
                        this.A01++;
                        FJ AEf = fi.AEf(this.A08, elapsedRealtime, j2, this.A03, this.A01);
                        i = AEf.A00;
                        if (i == 3) {
                            this.A0A.A01 = this.A03;
                            return;
                        }
                        i2 = AEf.A00;
                        if (i2 != 2) {
                            i3 = AEf.A00;
                            if (i3 == 1) {
                                this.A01 = 1;
                            }
                            this.A00 = true;
                            j = AEf.A01;
                            A06(j != C10323vs.b ? AEf.A01 : A00());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public FK(C2047n7 c2047n7, Looper looper, T loadable, FI<T> fi, int i, long j) {
        super(looper);
        this.A0A = c2047n7;
        this.A08 = loadable;
        this.A02 = fi;
        this.A06 = i;
        this.A07 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    @MetaExoPlayerCustomization("D36993743 Customized Hero Retry Delay Values")
    private long A00() {
        return AbstractC1802is.A00(this.A01, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    private void A03() {
        this.A0A.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A05(int i) throws IOException {
        if (this.A03 == null || this.A01 <= i) {
            return;
        }
        throw this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A06(long j) {
        FK fk;
        fk = this.A0A.A00;
        AbstractC04543y.A08(fk == null);
        this.A0A.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A07(boolean z) {
        this.A09 = z;
        this.A03 = null;
        if (hasMessages(0)) {
            this.A05 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.A05 = true;
                this.A08.A4r();
                Thread thread = this.A04;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((FI) AbstractC04543y.A01(this.A02)).AEc(this.A08, elapsedRealtime, elapsedRealtime - this.A07, true);
            this.A02 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this) {
                            z = !this.A05;
                            this.A04 = Thread.currentThread();
                        }
                        if (z) {
                            AnonymousClass54.A02(A01(150, 5, 115) + this.A08.getClass().getSimpleName());
                            try {
                                this.A08.AAr();
                            } finally {
                                AnonymousClass54.A00();
                            }
                        }
                        synchronized (this) {
                            this.A04 = null;
                            Thread.interrupted();
                        }
                        if (!this.A09) {
                            sendEmptyMessage(1);
                        }
                    } catch (IOException e) {
                        if (!this.A09) {
                            obtainMessage(2, e).sendToTarget();
                        }
                    } catch (OutOfMemoryError e2) {
                        if (!this.A09) {
                            AbstractC04624g.A08(A01(0, 8, 0), A01(8, 32, 20), e2);
                            obtainMessage(2, new FP(e2)).sendToTarget();
                        }
                    }
                } catch (Exception e3) {
                    if (!this.A09) {
                        AbstractC04624g.A08(A01(0, 8, 0), A01(115, 35, 50), e3);
                        obtainMessage(2, new FP(e3)).sendToTarget();
                    }
                }
            } catch (Error e4) {
                if (!this.A09) {
                    AbstractC04624g.A08(A01(0, 8, 0), A01(40, 31, 85), e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
