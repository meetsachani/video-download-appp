package o;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* renamed from: o.Ig  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3236Ig extends AbstractC10749xc0 implements InterfaceC3138Hg {
    public final MediaCodecInfo.AudioCapabilities c;

    public C3236Ig(MediaCodecInfo mediaCodecInfo, String str) throws C8279nT0 {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.c = audioCapabilities;
    }

    public static C3236Ig k(AbstractC2735Dg abstractC2735Dg) throws C8279nT0 {
        return new C3236Ig(AbstractC10749xc0.j(abstractC2735Dg), abstractC2735Dg.b());
    }

    @Override // o.InterfaceC3138Hg
    public Range<Integer> a() {
        return this.c.getBitrateRange();
    }
}
