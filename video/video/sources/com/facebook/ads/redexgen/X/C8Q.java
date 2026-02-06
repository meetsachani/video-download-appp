package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.8Q  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8Q {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            AudioFormat.Builder sampleRate = new AudioFormat.Builder().setEncoding(i).setSampleRate(i2);
            int channelCount = C5C.A01(i3);
            AudioFormat audioFormat = sampleRate.setChannelMask(channelCount).build();
            if (AudioTrack.isDirectPlaybackSupported(audioFormat, A00)) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.Integer> */
    public static int[] A01() {
        AbstractC2134oX abstractC2134oX;
        C2K A01 = BP.A01();
        abstractC2134oX = C8R.A06;
        C4C A0N = abstractC2134oX.keySet().A0N();
        while (A0N.hasNext()) {
            int encoding = ((Integer) A0N.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), A00)) {
                A01.A04(Integer.valueOf(encoding));
            }
        }
        A01.A04(2);
        return AbstractC0616As.A0B(A01.A05());
    }
}
