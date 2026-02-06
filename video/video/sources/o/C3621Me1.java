package o;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.List;
import o.C5137af1;

@Deprecated
/* renamed from: o.Me1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3621Me1 {
    public static final String l = "MediaCodecInfo";
    public static final int m = -1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f545o = 1;
    public static final int p = 0;
    public final String a;
    public final String b;
    public final String c;
    @InterfaceC11300zs1
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    @ES1(29)
    /* renamed from: o.Me1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints;
            boolean covers;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || C3621Me1.a()) {
                return 0;
            }
            C3524Le1.a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint a = C3426Ke1.a(i, i2, (int) d);
            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                covers = C3230Ie1.a(supportedPerformancePoints.get(i3)).covers(a);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @InterfaceC5056aJ2
    public C3621Me1(String str, String str2, String str3, @InterfaceC11300zs1 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = (String) C9542sf.g(str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = C4128Rj1.t(str2);
    }

    public static boolean C(String str) {
        return C4128Rj1.a0.equals(str);
    }

    public static boolean D(String str) {
        if (TD2.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean E(String str) {
        if (TD2.a <= 22) {
            String str2 = TD2.d;
            if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
                if ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean F() {
        String str = TD2.b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = TD2.d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean G(String str, int i) {
        if (C4128Rj1.k.equals(str) && 2 == i) {
            String str2 = TD2.b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean H(String str) {
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(TD2.b)) {
            return false;
        }
        return true;
    }

    public static C3621Me1 I(String str, String str2, String str3, @InterfaceC11300zs1 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z9;
        boolean z10;
        boolean z11;
        String str6;
        if (!z4 && codecCapabilities != null && k(codecCapabilities) && !E(str)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (codecCapabilities != null && x(codecCapabilities)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z5 && (codecCapabilities == null || !v(codecCapabilities))) {
            z8 = false;
            str6 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z9 = z;
            z10 = z2;
            z11 = z3;
            str4 = str;
        } else {
            z8 = true;
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z9 = z;
            z10 = z2;
            z11 = z3;
            str6 = str2;
        }
        return new C3621Me1(str4, str6, str5, codecCapabilities2, z9, z10, z11, z6, z7, z8);
    }

    public static /* synthetic */ boolean a() {
        return F();
    }

    public static int b(String str, String str2, int i) {
        int i2;
        if (i <= 1 && ((TD2.a < 26 || i <= 0) && !C4128Rj1.I.equals(str2) && !C4128Rj1.c0.equals(str2) && !C4128Rj1.d0.equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !C4128Rj1.a0.equals(str2) && !C4128Rj1.N.equals(str2) && !C4128Rj1.e0.equals(str2) && !C4128Rj1.O.equals(str2) && !C4128Rj1.P.equals(str2) && !C4128Rj1.g0.equals(str2))) {
            if (C4128Rj1.Q.equals(str2)) {
                i2 = 6;
            } else if (C4128Rj1.R.equals(str2)) {
                i2 = 16;
            } else {
                i2 = 30;
            }
            I31.n(l, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + C6566gU0.g);
            return i2;
        }
        return i;
    }

    @ES1(21)
    public static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(TD2.q(i, widthAlignment) * widthAlignment, TD2.q(i2, heightAlignment) * heightAlignment);
    }

    @ES1(21)
    public static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point d2 = d(videoCapabilities, i, i2);
        int i3 = d2.x;
        int i4 = d2.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public static MediaCodecInfo.CodecProfileLevel[] g(@InterfaceC11300zs1 MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            i = videoCapabilities.getBitrateRange().getUpper().intValue();
        } else {
            i = 0;
        }
        if (i >= 180000000) {
            i2 = 1024;
        } else if (i >= 120000000) {
            i2 = 512;
        } else if (i >= 60000000) {
            i2 = 256;
        } else if (i >= 30000000) {
            i2 = 128;
        } else if (i >= 18000000) {
            i2 = 64;
        } else if (i >= 12000000) {
            i2 = 32;
        } else if (i >= 7200000) {
            i2 = 16;
        } else if (i >= 3600000) {
            i2 = 8;
        } else if (i >= 1800000) {
            i2 = 4;
        } else if (i >= 800000) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @ES1(23)
    public static int i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    public static boolean k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (TD2.a >= 19 && l(codecCapabilities)) {
            return true;
        }
        return false;
    }

    @ES1(19)
    public static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (TD2.a >= 21 && w(codecCapabilities)) {
            return true;
        }
        return false;
    }

    @ES1(21)
    public static boolean w(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean x(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (TD2.a >= 21 && y(codecCapabilities)) {
            return true;
        }
        return false;
    }

    @ES1(21)
    public static boolean y(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final void A(String str) {
        I31.b(l, "AssumedSupport [" + str + "] [" + this.a + C6566gU0.h + this.b + "] [" + TD2.e + C6566gU0.g);
    }

    public final void B(String str) {
        I31.b(l, "NoSupport [" + str + "] [" + this.a + C6566gU0.h + this.b + "] [" + TD2.e + C6566gU0.g);
    }

    @InterfaceC11300zs1
    @ES1(21)
    public Point c(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i, i2);
    }

    public C9996uW f(C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        int i;
        C10833xx0 c10833xx03;
        C10833xx0 c10833xx04;
        int i2;
        if (!TD2.g(c10833xx0.g1, c10833xx02.g1)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.k) {
            if (c10833xx0.o1 != c10833xx02.o1) {
                i |= 1024;
            }
            if (!this.e && (c10833xx0.l1 != c10833xx02.l1 || c10833xx0.m1 != c10833xx02.m1)) {
                i |= 512;
            }
            if (!TD2.g(c10833xx0.s1, c10833xx02.s1)) {
                i |= 2048;
            }
            if (D(this.a) && !c10833xx0.h(c10833xx02)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.a;
                if (c10833xx0.h(c10833xx02)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new C9996uW(str, c10833xx0, c10833xx02, i2, 0);
            }
            c10833xx03 = c10833xx0;
            c10833xx04 = c10833xx02;
        } else {
            c10833xx03 = c10833xx0;
            c10833xx04 = c10833xx02;
            if (c10833xx03.t1 != c10833xx04.t1) {
                i |= 4096;
            }
            if (c10833xx03.u1 != c10833xx04.u1) {
                i |= 8192;
            }
            if (c10833xx03.v1 != c10833xx04.v1) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> s = C5137af1.s(c10833xx03);
                Pair<Integer, Integer> s2 = C5137af1.s(c10833xx04);
                if (s != null && s2 != null) {
                    int intValue = ((Integer) s.first).intValue();
                    int intValue2 = ((Integer) s2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C9996uW(this.a, c10833xx03, c10833xx04, 3, 0);
                    }
                }
            }
            if (!c10833xx03.h(c10833xx04)) {
                i |= 32;
            }
            if (C(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C9996uW(this.a, c10833xx03, c10833xx04, 1, 0);
            }
        }
        return new C9996uW(this.a, c10833xx03, c10833xx04, 0, i);
    }

    public int h() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (TD2.a >= 23 && (codecCapabilities = this.d) != null) {
            return i(codecCapabilities);
        }
        return -1;
    }

    public MediaCodecInfo.CodecProfileLevel[] j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities != null && (codecProfileLevelArr = codecCapabilities.profileLevels) != null) {
            return codecProfileLevelArr;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    @ES1(21)
    public boolean m(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            B("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            B("channelCount.aCaps");
            return false;
        } else if (b(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) < i) {
            B("channelCount.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    @ES1(21)
    public boolean n(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            B("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            B("sampleRate.aCaps");
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i)) {
            B("sampleRate.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    public final boolean o(C10833xx0 c10833xx0, boolean z) {
        Pair<Integer, Integer> s = C5137af1.s(c10833xx0);
        if (s == null) {
            return true;
        }
        int intValue = ((Integer) s.first).intValue();
        int intValue2 = ((Integer) s.second).intValue();
        if (C4128Rj1.w.equals(c10833xx0.g1)) {
            if ("video/avc".equals(this.b)) {
                intValue = 8;
            } else {
                intValue = C4128Rj1.k.equals(this.b) ? 2 : 2;
            }
            intValue2 = 0;
        }
        if (!this.k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] j = j();
        if (TD2.a <= 23 && C4128Rj1.m.equals(this.b) && j.length == 0) {
            j = g(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : j) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z) && !G(this.b, intValue))) {
                return true;
            }
        }
        B("codec.profileLevel, " + c10833xx0.d1 + C6566gU0.h + this.c);
        return false;
    }

    public boolean p(C10833xx0 c10833xx0) {
        if (!s(c10833xx0) || !o(c10833xx0, false)) {
            return false;
        }
        return true;
    }

    public boolean q(C10833xx0 c10833xx0) throws C5137af1.c {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!s(c10833xx0) || !o(c10833xx0, true)) {
            return false;
        }
        if (this.k) {
            int i4 = c10833xx0.l1;
            if (i4 <= 0 || (i3 = c10833xx0.m1) <= 0) {
                return true;
            }
            if (TD2.a >= 21) {
                return z(i4, i3, c10833xx0.n1);
            }
            if (i4 * i3 <= C5137af1.M()) {
                z = true;
            }
            if (!z) {
                B("legacyFrameSize, " + c10833xx0.l1 + "x" + c10833xx0.m1);
            }
            return z;
        } else if (TD2.a >= 21 && (((i = c10833xx0.u1) != -1 && !n(i)) || ((i2 = c10833xx0.t1) != -1 && !m(i2)))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean r() {
        if (TD2.a >= 29 && C4128Rj1.m.equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : j()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s(C10833xx0 c10833xx0) {
        if (!this.b.equals(c10833xx0.g1) && !this.b.equals(C5137af1.n(c10833xx0))) {
            return false;
        }
        return true;
    }

    public boolean t(C10833xx0 c10833xx0) {
        if (this.k) {
            return this.e;
        }
        Pair<Integer, Integer> s = C5137af1.s(c10833xx0);
        if (s != null && ((Integer) s.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.a;
    }

    @Deprecated
    public boolean u(C10833xx0 c10833xx0, C10833xx0 c10833xx02, boolean z) {
        if (!z && c10833xx0.s1 != null && c10833xx02.s1 == null) {
            c10833xx02 = c10833xx02.b().L(c10833xx0.s1).G();
        }
        int i = f(c10833xx0, c10833xx02).d;
        if (i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    @ES1(21)
    public boolean z(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            B("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            B("sizeAndRate.vCaps");
            return false;
        }
        if (TD2.a >= 29) {
            int a2 = a.a(videoCapabilities, i, i2, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                B("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!e(videoCapabilities, i, i2, d)) {
            if (i < i2 && H(this.a) && e(videoCapabilities, i2, i, d)) {
                A("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
            } else {
                B("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        return true;
    }
}
