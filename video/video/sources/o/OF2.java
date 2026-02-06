package o;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* loaded from: classes.dex */
public class OF2 extends AbstractC10749xc0 implements NF2 {
    public final MediaCodecInfo.VideoCapabilities c;

    public OF2(MediaCodecInfo mediaCodecInfo, String str) throws C8279nT0 {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.c = videoCapabilities;
    }

    public static OF2 k(IF2 if2) throws C8279nT0 {
        return new OF2(AbstractC10749xc0.j(if2), if2.b());
    }

    public static IllegalArgumentException l(Throwable th) {
        if (th instanceof IllegalArgumentException) {
            return (IllegalArgumentException) th;
        }
        return new IllegalArgumentException(th);
    }

    @Override // o.NF2
    public Range<Integer> b(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            throw l(th);
        }
    }

    @Override // o.NF2
    public int c() {
        return this.c.getHeightAlignment();
    }

    @Override // o.NF2
    public boolean d(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // o.NF2
    public int e() {
        return this.c.getWidthAlignment();
    }

    @Override // o.NF2
    public Range<Integer> f() {
        return this.c.getBitrateRange();
    }

    @Override // o.NF2
    public Range<Integer> g(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            throw l(th);
        }
    }

    @Override // o.NF2
    public Range<Integer> h() {
        return this.c.getSupportedWidths();
    }

    @Override // o.NF2
    public Range<Integer> i() {
        return this.c.getSupportedHeights();
    }
}
