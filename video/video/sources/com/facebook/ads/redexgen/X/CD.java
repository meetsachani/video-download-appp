package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import kotlin.Metadata;
import o.C3307Iz;
import o.C8077mf;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/NoOpMediaCodecPoolTracker;", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker;", "<init>", "()V", "reportCodecCreated", "", "creatingEvent", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$CreatingEvent;", "codecInstanceId", "", "reportCodecReleasing", "source", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "reportCodecReleased", "reportCodecAcquiredFromPool", "isVideo", "", "codecName", "", "reportCodecReturnedToPool", "Companion", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: assets/audience_network/classes2.dex */
public final class CD extends AbstractC1832jM {
    public static byte[] A00;
    public static final C1846jc A01;
    public static final CD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{36, 40, 35, 34, 36, 9, C3307Iz.Y, 42, 34, 9, C8077mf.B, C8077mf.q, C8077mf.m, C8077mf.H, 3, 4, 13, 47, 28, C8077mf.q, 4, C8077mf.H, 84, 72, 82, 85, 68, 66};
    }

    static {
        A01();
        A01 = new C1846jc(null);
        A02 = new CD();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1832jM
    public final void A06(C1829jJ c1829jJ, int i) {
        C2256qY.A09(c1829jJ, A00(9, 13, 123));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1832jM
    public final void A07(EnumC1831jL enumC1831jL, int i) {
        C2256qY.A09(enumC1831jL, A00(22, 6, 54));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1832jM
    public final void A08(EnumC1831jL enumC1831jL, int i) {
        C2256qY.A09(enumC1831jL, A00(22, 6, 54));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1832jM
    public final void A09(EnumC1831jL enumC1831jL, int i) {
        C2256qY.A09(enumC1831jL, A00(22, 6, 54));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1832jM
    public final void A0A(boolean z, String str, EnumC1831jL enumC1831jL, int i) {
        C2256qY.A09(str, A00(0, 9, 86));
        C2256qY.A09(enumC1831jL, A00(22, 6, 54));
    }
}
