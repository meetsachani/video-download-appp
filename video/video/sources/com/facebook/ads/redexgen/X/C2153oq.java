package com.facebook.ads.redexgen.X;

import android.media.MediaFormat;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.oq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2153oq implements G2, GR, InterfaceC05367c {
    public static byte[] A04;
    public static String[] A05 = {"s2pX1dUuV9yMGkOQMpNHWy9uhNawnk9Y", "g94kU4b", "NzGTwCFJguijRpsE4vnu2khyHl2vzHxI", "mcwg2", "3H7kdFWigyqN00XNlLPoaD6s2Om", "arwBjFb", "zwCIEju4cqvLZ8D4reT2LOc82uEYQHt6", "4voNbHG588W1rePZ0VIdJriIAfqG9T"};
    public G2 A00;
    public G2 A01;
    public GR A02;
    public GR A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{2, 0, 17, 51, C8077mf.n, 1, 0, 10, 35, C8077mf.A, 4, 8, 0, 40, 0, 17, 4, 1, 4, 17, 4, C3307Iz.a0, C8077mf.n, C8077mf.z, 17, 0, C8077mf.m, 0, C8077mf.A};
    }

    static {
        A01();
    }

    public C2153oq() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05367c
    public final void A9i(int i, Object obj) {
        switch (i) {
            case 7:
                this.A01 = (G2) obj;
                return;
            case 8:
                this.A02 = (GR) obj;
                return;
            case 10000:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new NullPointerException(A00(0, 29, 100));
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.G2
    public final void AGS(long j, long j2, C2242qI c2242qI, MediaFormat mediaFormat) {
        if (this.A00 != null) {
            G2 g2 = this.A00;
            if (A05[0].charAt(20) != 'W') {
                throw new RuntimeException();
            }
            A05[4] = "rCzQpO90p93bI0FQ7tWj9IORt31";
            g2.AGS(j, j2, c2242qI, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AGS(j, j2, c2242qI, mediaFormat);
        }
    }
}
