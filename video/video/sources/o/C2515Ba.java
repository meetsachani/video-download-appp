package o;

import android.media.MediaCodecInfo;
import android.util.Range;

/* renamed from: o.Ba  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2515Ba {
    public static Range<Integer> a(MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}
