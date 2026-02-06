package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Arrays;
import o.C10323vs;
import o.C2638Cg0;
import o.C6755hG2;

/* loaded from: assets/audience_network/classes2.dex */
public final class G7 {
    public static byte[] A0H;
    public static String[] A0I = {"El1apek5TdjhfhN6viIbzGI1k6A8fvYa", "7lO0T01iPA0M2Tn6ez9XJF6fi3WcV0bl", "BUJOgokLGuaRN3Jb1lPoBsNrm7KBSu3J", "mjIihJQoirK71A6rZ4qRVtTe6TTtSgwc", "PHElykquIwSutGmUMi14ryiOqojKYZje", "FFUtkd6qKeeUYHXUT7DV9hX7r9PAWeGY", "aVKnabS1yBALevTpM7jFXLX0kSbTApQh", "pYdHEl16nY3gI4cpQf6RN4y0bom4H0uh"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Surface A0C;
    public boolean A0D;
    public final C0736Fl A0E = new C0736Fl();
    public final G5 A0F;
    public final G6 A0G;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 30);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{C2638Cg0.q7, -37, C2638Cg0.z7, C2638Cg0.A7, C2638Cg0.E7, -46, -115, C2638Cg0.C7, -36, -115, -34, -30, -46, -33, -26, -115, -47, -42, -32, -35, C2638Cg0.E7, C2638Cg0.z7, -26, -115, -33, -46, -45, -33, -46, -32, -43, -115, -33, C2638Cg0.z7, C2638Cg0.C7, -46, -121, -102, -107, -106, -96, 119, -93, -110, -98, -106, -125, -106, -99, -106, -110, -92, -106, 121, -106, -99, -95, -106, -93};
    }

    static {
        A06();
    }

    public G7(Context context) {
        this.A0F = A01(context);
        this.A0G = this.A0F != null ? G6.A00() : null;
        this.A0A = C10323vs.b;
        this.A0B = C10323vs.b;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
    }

    public static long A00(long j, long j2, long j3) {
        long j4;
        long vsyncCount = j3 * ((j - j2) / j3);
        long j5 = j2 + vsyncCount;
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j4 = j5;
            j5 += j3;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public static G5 A01(Context context) {
        C2041n1 c2041n1 = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C5C.A02 >= 17) {
            c2041n1 = C2041n1.A01(applicationContext);
        }
        if (c2041n1 == null) {
            return C2042n2.A00(applicationContext);
        }
        return c2041n1;
    }

    private void A03() {
        if (C5C.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE || this.A03 == 0.0f) {
            return;
        }
        this.A03 = 0.0f;
        Surface surface = this.A0C;
        if (A0I[2].charAt(9) != 'u') {
            throw new RuntimeException();
        }
        A0I[2] = "PQOfzOqD2ukvp3odpMH5qIU7xJUCien7";
        G3.A02(surface, 0.0f);
    }

    private void A04() {
        this.A05 = 0L;
        this.A06 = -1L;
        this.A08 = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A05() {
        float f;
        if (C5C.A02 < 30 || this.A0C == null) {
            return;
        }
        float A00 = this.A0E.A06() ? this.A0E.A00() : this.A00;
        float candidateFrameRate = this.A02;
        if (A00 == candidateFrameRate) {
            return;
        }
        boolean z = true;
        if (A00 != -1.0f) {
            float candidateFrameRate2 = this.A02;
            if (candidateFrameRate2 != -1.0f) {
                if (this.A0E.A06() && this.A0E.A03() >= C6755hG2.s) {
                    f = 0.02f;
                } else {
                    f = 1.0f;
                }
                float candidateFrameRate3 = this.A02;
                if (Math.abs(A00 - candidateFrameRate3) < f) {
                    z = false;
                }
                if (!z) {
                    this.A02 = A00;
                    A09(false);
                    return;
                }
                return;
            }
        }
        if (A00 != -1.0f) {
            z = true;
        } else if (this.A0E.A01() < 30) {
            z = false;
        }
        if (!z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            double defaultDisplayRefreshRate = display.getRefreshRate();
            this.A0A = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A0B = (this.A0A * 80) / 100;
            return;
        }
        AbstractC04624g.A07(A02(36, 23, 19), A02(0, 36, 79));
        this.A0A = C10323vs.b;
        this.A0B = C10323vs.b;
    }

    private void A09(boolean z) {
        if (C5C.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.A0D && this.A02 != -1.0f) {
            float f2 = this.A02;
            float surfacePlaybackFrameRate = this.A01;
            f = f2 * surfacePlaybackFrameRate;
        }
        if (!z) {
            float surfacePlaybackFrameRate2 = this.A03;
            if (surfacePlaybackFrameRate2 == f) {
                return;
            }
        }
        this.A03 = f;
        G3.A02(this.A0C, f);
    }

    public static boolean A0A(long j, long j2) {
        return Math.abs(j - j2) <= C6755hG2.x;
    }

    public final long A0B(long j) {
        long j2 = j;
        if (this.A06 != -1 && this.A0E.A06()) {
            long A02 = this.A0E.A02();
            long frameDurationNs = this.A07;
            long j3 = this.A05;
            long adjustedReleaseTimeNs = this.A06;
            long frameDurationNs2 = frameDurationNs + (((float) ((j3 - adjustedReleaseTimeNs) * A02)) / this.A01);
            if (A0A(j2, frameDurationNs2)) {
                j2 = frameDurationNs2;
            } else {
                A04();
            }
        }
        long adjustedReleaseTimeNs2 = this.A05;
        this.A08 = adjustedReleaseTimeNs2;
        this.A09 = j2;
        if (this.A0G == null || this.A0A == C10323vs.b) {
            return j2;
        }
        long j4 = this.A0G.A04;
        if (j4 == C10323vs.b) {
            return j2;
        }
        long sampledVsyncTimeNs = A00(j2, j4, this.A0A);
        long adjustedReleaseTimeNs3 = this.A0B;
        return sampledVsyncTimeNs - adjustedReleaseTimeNs3;
    }

    public final void A0C() {
        A04();
    }

    public final void A0D() {
        this.A0D = true;
        A04();
        if (this.A0F != null) {
            ((G6) AbstractC04543y.A01(this.A0G)).A06();
            this.A0F.AHX(new G4() { // from class: com.facebook.ads.redexgen.X.n3
                @Override // com.facebook.ads.redexgen.X.G4
                public final void ADd(Display display) {
                    G7.this.A07(display);
                }
            });
        }
        A09(false);
    }

    public final void A0E() {
        this.A0D = false;
        if (this.A0F != null) {
            this.A0F.AKW();
            ((G6) AbstractC04543y.A01(this.A0G)).A07();
        }
        A03();
    }

    public final void A0F(float f) {
        this.A00 = f;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            this.A07 = this.A09;
        }
        this.A05++;
        this.A0E.A05(1000 * j);
        A05();
    }
}
