package o;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import java.util.Objects;

/* renamed from: o.xc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10749xc0 implements InterfaceC10506wc0 {
    public final MediaCodecInfo a;
    public final MediaCodecInfo.CodecCapabilities b;

    public AbstractC10749xc0(MediaCodecInfo mediaCodecInfo, String str) throws C8279nT0 {
        this.a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new C8279nT0("Unable to get CodecCapabilities for mime: " + str, e);
        }
    }

    public static MediaCodecInfo j(InterfaceC2923Fb0 interfaceC2923Fb0) throws C8279nT0 {
        MediaCodec a = new C3217Ib0().a(interfaceC2923Fb0.a());
        MediaCodecInfo codecInfo = a.getCodecInfo();
        a.release();
        return codecInfo;
    }

    @Override // o.InterfaceC10506wc0
    public String getName() {
        return this.a.getName();
    }
}
