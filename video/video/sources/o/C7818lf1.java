package o;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import o.AbstractC5317bO0;
import o.C10833xx0;
import o.IF;

@Deprecated
/* renamed from: o.lf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7818lf1 {
    public static final String a = "exo-pixel-width-height-ratio-float";
    public static final String b = "exo-pcm-encoding-int";
    public static final String c = "max-bitrate";
    public static final int d = 1073741824;

    @SuppressLint({"InlinedApi"})
    public static C10833xx0 a(MediaFormat mediaFormat) {
        int i = 0;
        C10833xx0.b a0 = new C10833xx0.b().g0(mediaFormat.getString("mime")).X(mediaFormat.getString("language")).b0(h(mediaFormat, c, -1)).I(h(mediaFormat, "bitrate", -1)).K(mediaFormat.getString("codecs-string")).R(g(mediaFormat, -1.0f)).n0(h(mediaFormat, "width", -1)).S(h(mediaFormat, "height", -1)).c0(i(mediaFormat, 1.0f)).Y(h(mediaFormat, "max-input-size", -1)).f0(h(mediaFormat, "rotation-degrees", 0)).L(e(mediaFormat, true)).h0(h(mediaFormat, "sample-rate", -1)).J(h(mediaFormat, "channel-count", -1)).a0(h(mediaFormat, "pcm-encoding", -1));
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer == null) {
                a0.V(aVar.e());
                return a0.G();
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            aVar.g(bArr);
            i++;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat b(C10833xx0 c10833xx0) {
        MediaFormat mediaFormat = new MediaFormat();
        s(mediaFormat, "bitrate", c10833xx0.c1);
        s(mediaFormat, c, c10833xx0.b1);
        s(mediaFormat, "channel-count", c10833xx0.t1);
        q(mediaFormat, c10833xx0.s1);
        v(mediaFormat, "mime", c10833xx0.g1);
        v(mediaFormat, "codecs-string", c10833xx0.d1);
        r(mediaFormat, "frame-rate", c10833xx0.n1);
        s(mediaFormat, "width", c10833xx0.l1);
        s(mediaFormat, "height", c10833xx0.m1);
        x(mediaFormat, c10833xx0.i1);
        t(mediaFormat, c10833xx0.v1);
        v(mediaFormat, "language", c10833xx0.Z);
        s(mediaFormat, "max-input-size", c10833xx0.h1);
        s(mediaFormat, "sample-rate", c10833xx0.u1);
        s(mediaFormat, "caption-service-number", c10833xx0.y1);
        mediaFormat.setInteger("rotation-degrees", c10833xx0.o1);
        int i = c10833xx0.Y0;
        w(mediaFormat, "is-autoselect", i & 4);
        w(mediaFormat, "is-default", i & 1);
        w(mediaFormat, "is-forced-subtitle", i & 2);
        mediaFormat.setInteger("encoder-delay", c10833xx0.w1);
        mediaFormat.setInteger("encoder-padding", c10833xx0.x1);
        u(mediaFormat, c10833xx0.p1);
        return mediaFormat;
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @InterfaceC11300zs1
    public static IF d(MediaFormat mediaFormat) {
        return e(mediaFormat, false);
    }

    @InterfaceC11300zs1
    public static IF e(MediaFormat mediaFormat, boolean z) {
        byte[] bArr;
        if (TD2.a < 24) {
            return null;
        }
        int h = h(mediaFormat, "color-standard", -1);
        int h2 = h(mediaFormat, "color-range", -1);
        int h3 = h(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            bArr = c(byteBuffer);
        } else {
            bArr = null;
        }
        if (!z) {
            if (!m(h)) {
                h = -1;
            }
            if (!l(h2)) {
                h2 = -1;
            }
            if (!n(h3)) {
                h3 = -1;
            }
        }
        if (h == -1 && h2 == -1 && h3 == -1 && bArr == null) {
            return null;
        }
        return new IF.b().c(h).b(h2).d(h3).e(bArr).a();
    }

    public static float f(MediaFormat mediaFormat, String str, float f) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getFloat(str);
        }
        return f;
    }

    public static float g(MediaFormat mediaFormat, float f) {
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                return mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                return mediaFormat.getInteger("frame-rate");
            }
        }
        return f;
    }

    public static int h(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return i;
    }

    @SuppressLint({"InlinedApi"})
    public static float i(MediaFormat mediaFormat, float f) {
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            return mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        return f;
    }

    @InterfaceC11300zs1
    public static Integer j(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static boolean k(MediaFormat mediaFormat) {
        return C4128Rj1.p(mediaFormat.getString("mime"));
    }

    public static boolean l(int i) {
        if (i == 2 || i == 1 || i == -1) {
            return true;
        }
        return false;
    }

    public static boolean m(int i) {
        if (i == 2 || i == 1 || i == 6 || i == -1) {
            return true;
        }
        return false;
    }

    public static boolean n(int i) {
        if (i == 1 || i == 3 || i == 6 || i == 7 || i == -1) {
            return true;
        }
        return false;
    }

    public static boolean o(MediaFormat mediaFormat) {
        return C4128Rj1.t(mediaFormat.getString("mime"));
    }

    public static void p(MediaFormat mediaFormat, String str, @InterfaceC11300zs1 byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void q(MediaFormat mediaFormat, @InterfaceC11300zs1 IF r3) {
        if (r3 != null) {
            s(mediaFormat, "color-transfer", r3.Z);
            s(mediaFormat, "color-standard", r3.X);
            s(mediaFormat, "color-range", r3.Y);
            p(mediaFormat, "hdr-static-info", r3.Y0);
        }
    }

    public static void r(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void s(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static void t(MediaFormat mediaFormat, int i) {
        int i2;
        if (i != -1) {
            s(mediaFormat, b, i);
            if (i != 0) {
                if (i != 536870912) {
                    if (i != 805306368) {
                        i2 = 2;
                        if (i != 2) {
                            i2 = 3;
                            if (i != 3) {
                                i2 = 4;
                                if (i != 4) {
                                    return;
                                }
                            }
                        }
                    } else {
                        i2 = 22;
                    }
                } else {
                    i2 = 21;
                }
            } else {
                i2 = 0;
            }
            mediaFormat.setInteger("pcm-encoding", i2);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static void u(MediaFormat mediaFormat, float f) {
        int i;
        mediaFormat.setFloat(a, f);
        int i2 = 1073741824;
        if (f < 1.0f) {
            i2 = (int) (f * 1073741824);
            i = 1073741824;
        } else if (f > 1.0f) {
            i = (int) (1073741824 / f);
        } else {
            i2 = 1;
            i = 1;
        }
        mediaFormat.setInteger("sar-width", i2);
        mediaFormat.setInteger("sar-height", i);
    }

    public static void v(MediaFormat mediaFormat, String str, @InterfaceC11300zs1 String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void w(MediaFormat mediaFormat, String str, int i) {
        int i2;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mediaFormat.setInteger(str, i2);
    }

    public static void x(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
