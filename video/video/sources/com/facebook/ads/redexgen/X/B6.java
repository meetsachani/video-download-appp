package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public class B6 {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<B4> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ B7 A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, C2638Cg0.B7, C2638Cg0.s7, C2638Cg0.u7, -46, -42, C2638Cg0.x7, -47, -48, -126, C2638Cg0.E7, C2638Cg0.w7, C2638Cg0.u7, -48, -126, -42, -44, -37, C2638Cg0.x7, -48, C2638Cg0.v7, -126, -42, -47, -126, C2638Cg0.x7, -48, -43, -42, C2638Cg0.r7, -48, -42, C2638Cg0.x7, C2638Cg0.r7, -42, C2638Cg0.u7, -126, -121, -43, -100, -126, -121, -43, -72, -48, C2638Cg0.A7, -44, -52, -82, C2638Cg0.B7, C2638Cg0.A7, -48, C2638Cg0.z7, -69, C2638Cg0.B7, C2638Cg0.B7, -41, -70, -37, -33, -44, C2638Cg0.n7, -44, -27, -48, C2638Cg0.A7, C2638Cg0.s7, -46, -46, C2638Cg0.A7, -46, -115, -41, -56, C2638Cg0.v7, -52, C2638Cg0.s7, -115, -46, C2638Cg0.s7, -52, C2638Cg0.s7, C2638Cg0.p7, -45, C2638Cg0.s7, -115, C2638Cg0.r7, C2638Cg0.A7, -60, C2638Cg0.s7, C2638Cg0.r7, -115, C2638Cg0.t7, -46, C2638Cg0.A7, C2638Cg0.y7, -115, -45, C2638Cg0.s7, -44, -115, C2638Cg0.t7, C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.p7, -52, -52, C2638Cg0.E7, -102, Byte.MIN_VALUE, -123, -45, C2638Cg0.n7, -27, -27, -30, -27, -96, -22, -37, -36, -33, C2638Cg0.n7, -96, -27, C2638Cg0.n7, -33, C2638Cg0.n7, -44, -26, C2638Cg0.n7, -96, -42, -30, -41, C2638Cg0.n7, -42, -96, C2638Cg0.E7, -27, -30, -32, -96, -26, C2638Cg0.n7, -25, -83, -109, -104, -26, -34, -15, -24, -23, -27, C2638Cg0.B7, -14, -34, -21, -85, -89, C2638Cg0.B7, -17, -86, -89, -20, -21, -36, -89, -67, C2638Cg0.B7, -17, -86, -35, C2638Cg0.t7, -34, -35, -30, C2638Cg0.B7, -68, -24, -35, -34, -36, -70, -35, C2638Cg0.B7, -23, -19, -34, -21};
    }

    public B6(B7 b7) {
        this.A02 = b7;
    }

    public B0 A02(boolean z, C1836jQ c1836jQ, EnumC1831jL enumC1831jL, String str) throws C1828jI {
        boolean A0I;
        AbstractC1832jM A032;
        AbstractC1832jM A033;
        boolean A0G;
        Set<B0> set;
        AbstractC1832jM A034;
        A0I = this.A02.A0I(z, c1836jQ);
        if (A0I) {
            A0G = B7.A0G(str, c1836jQ);
            if (A0G) {
                synchronized (this.A02.A04) {
                    set = this.A02.A04.get(str);
                }
                if (set != null) {
                    synchronized (set) {
                        if (!set.isEmpty()) {
                            B7 b7 = this.A02;
                            b7.A00--;
                            Iterator<B0> it = set.iterator();
                            B0 ret = it.next();
                            it.remove();
                            A034 = this.A02.A03();
                            A034.A0A(z, str, enumC1831jL, ret.hashCode());
                            return ret;
                        }
                    }
                }
            }
        }
        try {
            A032 = this.A02.A03();
            C1829jJ A05 = A032.A05(z, str, enumC1831jL);
            B0 A035 = A03(z, str);
            A033 = this.A02.A03();
            A033.A06(A05, A035.hashCode());
            return A035;
        } catch (Exception e) {
            throw new C1828jI(str, e);
        }
    }

    public B0 A03(boolean z, String str) throws Exception {
        boolean A0E;
        String A04 = A04(150, 41, 69);
        if (z) {
            A0E = B7.A0E(str);
            if (A0E) {
                try {
                    return (B0) Class.forName(A04).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    Log.w(A04(43, 23, 55), String.format(A04(0, 43, 46), A04, e.getMessage()));
                }
            }
        }
        return new C2107o6(MediaCodec.createByCodecName(str));
    }

    /* renamed from: A07 */
    public void A0B(EnumC1831jL enumC1831jL) {
        String A04;
        String format;
        B7 b7;
        Set<B0> set;
        Iterator<B4> it = this.A01.iterator();
        while (it.hasNext()) {
            B4 next = it.next();
            try {
                try {
                    if (!next.A05) {
                        A08(next.A01, enumC1831jL, Boolean.valueOf(next.A04), next.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                next.A00.reset();
                                b7 = this.A02;
                            } catch (IllegalStateException unused) {
                                A09(next.A02, next.A00);
                                b7 = this.A02;
                            }
                            b7.A05 = -1L;
                            if (next.A03) {
                                synchronized (this.A02.A04) {
                                    set = this.A02.A04.get(next.A02);
                                }
                                if (set != null) {
                                    synchronized (set) {
                                        set.add(next.A00);
                                        this.A02.A00++;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            this.A02.A05 = -1L;
                            throw th;
                        }
                    }
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(next);
                        }
                    } catch (Exception e) {
                        A04 = A04(43, 23, 55);
                        format = String.format(A04(66, 46, 44), e.getMessage());
                        Log.w(A04, format);
                    }
                } catch (Throwable th2) {
                    try {
                    } catch (Exception e2) {
                        Log.w(A04(43, 23, 55), String.format(A04(66, 46, 44), e2.getMessage()));
                    }
                    synchronized (this.A01) {
                        this.A01.remove(next);
                        throw th2;
                    }
                }
            } catch (Exception e3) {
                Log.w(A04(43, 23, 55), String.format(A04(112, 38, 63), e3.getMessage()));
                try {
                    synchronized (this.A01) {
                        this.A01.remove(next);
                    }
                } catch (Exception e4) {
                    A04 = A04(43, 23, 55);
                    format = String.format(A04(66, 46, 44), e4.getMessage());
                    Log.w(A04, format);
                }
            }
        }
    }

    private void A08(C1836jQ c1836jQ, EnumC1831jL enumC1831jL, Boolean bool, B0 b0) {
        AbstractC1832jM A032;
        AbstractC1832jM A033;
        try {
            if (!c1836jQ.A0R || (!bool.booleanValue() && !c1836jQ.A0Q)) {
                b0.stop();
            }
        } finally {
            A032 = this.A02.A03();
            A032.A08(enumC1831jL, b0.hashCode());
            b0.AHb();
            A033 = this.A02.A03();
            A033.A07(enumC1831jL, b0.hashCode());
        }
    }

    private void A09(String str, B0 b0) {
        Set<B0> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(b0)) {
                    B7 b7 = this.A02;
                    b7.A00--;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0A(boolean z, C1836jQ c1836jQ, final EnumC1831jL enumC1831jL, String str, B0 b0) {
        boolean A0I;
        boolean A0G;
        boolean z2 = false;
        A0I = this.A02.A0I(z, c1836jQ);
        if (A0I) {
            A0G = B7.A0G(str, c1836jQ);
            if (A0G) {
                if (c1836jQ.A0L && !this.A00) {
                    this.A00 = true;
                    Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() { // from class: com.facebook.ads.redexgen.X.B5
                        @Override // java.lang.Runnable
                        public final void run() {
                            B6.this.A0B(enumC1831jL);
                        }
                    }, 5L, Math.max(1000, c1836jQ.A08), TimeUnit.MILLISECONDS);
                }
                boolean z3 = true;
                Set<B0> set = null;
                if (this.A02.A00 < c1836jQ.A07) {
                    synchronized (this.A02.A04) {
                        set = this.A02.A04.get(str);
                        if (set == null) {
                            set = this.A02.A06();
                            this.A02.A04.put(str, set);
                        }
                    }
                    synchronized (set) {
                        if (set.contains(b0)) {
                            z3 = false;
                        } else if (((z && c1836jQ.A0N) || (!z && c1836jQ.A0M)) && set.size() < c1836jQ.A06) {
                            z2 = true;
                            z3 = false;
                        }
                    }
                }
                if (!z3) {
                    long j = -1;
                    try {
                        try {
                            try {
                                if (!c1836jQ.A0L) {
                                    try {
                                        this.A02.A05 = SystemClock.elapsedRealtime();
                                        b0.reset();
                                        if (z2 && set != null) {
                                            synchronized (set) {
                                                set.add(b0);
                                                this.A02.A00++;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (!c1836jQ.A0L) {
                                            this.A02.A05 = j;
                                        }
                                        throw th;
                                    }
                                } else {
                                    try {
                                        B4 b4 = new B4(b0, c1836jQ, str, z, z2, true);
                                        synchronized (this.A01) {
                                            try {
                                                this.A01.add(b4);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                while (true) {
                                                    try {
                                                        break;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (IllegalStateException unused) {
                                        j = -1;
                                        A09(str, b0);
                                        if (!c1836jQ.A0L) {
                                            this.A02.A05 = j;
                                        }
                                        if (c1836jQ.A0L) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        j = -1;
                                        if (!c1836jQ.A0L) {
                                        }
                                        throw th;
                                    }
                                }
                                if (c1836jQ.A0L) {
                                    return;
                                }
                                this.A02.A05 = -1L;
                                return;
                            } catch (IllegalStateException unused2) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            }
        }
        if (c1836jQ.A0L) {
            A08(c1836jQ, enumC1831jL, Boolean.valueOf(z), b0);
            return;
        }
        B4 b42 = new B4(b0, c1836jQ, str, z, false, false);
        synchronized (this.A01) {
            this.A01.add(b42);
        }
    }
}
