package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;
import o.C3621Me1;
import o.C3931Pi2;
import o.C4128Rj1;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zztc {
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

    @InterfaceC5056aJ2
    public zztc(String str, String str2, String str3, @InterfaceC11300zs1 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z6;
        this.h = z7;
        this.i = zzay.j(str2);
    }

    public static zztc c(String str, String str2, String str3, @InterfaceC11300zs1 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals(C3931Pi2.d)) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z9 = z;
                z10 = z2;
                z11 = z3;
                z12 = true;
                str4 = str;
                return new zztc(str4, str6, str5, codecCapabilities2, z9, z10, z11, z6, z7, z8, z12);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z9 = z;
        z10 = z2;
        z11 = z3;
        z12 = false;
        str6 = str2;
        return new zztc(str4, str6, str5, codecCapabilities2, z9, z10, z11, z6, z7, z8, z12);
    }

    public static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzeu.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point i3 = i(videoCapabilities, i, i2);
        int i4 = i3.x;
        int i5 = i3.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (!videoCapabilities.areSizeAndRateSupported(i4, i5, floor)) {
                return false;
            }
            Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i4, i5);
            if (achievableFrameRatesFor != null && floor > achievableFrameRatesFor.getUpper().doubleValue()) {
                return false;
            }
            return true;
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    @InterfaceC11300zs1
    public final Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            return i(videoCapabilities, i, i2);
        }
        return null;
    }

    public final zzib b(zzz zzzVar, zzz zzzVar2) {
        int i;
        zzz zzzVar3;
        zzz zzzVar4;
        int i2;
        if (true != Objects.equals(zzzVar.f301o, zzzVar2.f301o)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (zzzVar.y != zzzVar2.y) {
                i |= 1024;
            }
            if (!this.e && (zzzVar.v != zzzVar2.v || zzzVar.w != zzzVar2.w)) {
                i |= 512;
            }
            zzk zzkVar = zzzVar.C;
            if ((!zzk.g(zzkVar) || !zzk.g(zzzVar2.C)) && !Objects.equals(zzkVar, zzzVar2.C)) {
                i |= 2048;
            }
            String str = this.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzzVar.d(zzzVar2)) {
                i |= 2;
            }
            if (i == 0) {
                if (true != zzzVar.d(zzzVar2)) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                return new zzib(str, zzzVar, zzzVar2, i2, 0);
            }
            zzzVar3 = zzzVar;
            zzzVar4 = zzzVar2;
        } else {
            zzzVar3 = zzzVar;
            zzzVar4 = zzzVar2;
            if (zzzVar3.E != zzzVar4.E) {
                i |= 4096;
            }
            if (zzzVar3.F != zzzVar4.F) {
                i |= 8192;
            }
            if (zzzVar3.G != zzzVar4.G) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                int i3 = zztw.b;
                Pair a = zzdh.a(zzzVar3);
                Pair a2 = zzdh.a(zzzVar4);
                if (a != null && a2 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzib(this.a, zzzVar3, zzzVar4, 3, 0);
                    }
                }
            }
            if (!zzzVar3.d(zzzVar4)) {
                i |= 32;
            }
            if (C4128Rj1.a0.equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzib(this.a, zzzVar3, zzzVar4, 1, 0);
            }
        }
        return new zzib(this.a, zzzVar3, zzzVar4, 0, i);
    }

    public final boolean d(zzz zzzVar) {
        if (!n(zzzVar) || !l(zzzVar, false) || !m(zzzVar)) {
            return false;
        }
        return true;
    }

    public final boolean e(zzz zzzVar) throws zztq {
        int i;
        int i2;
        if (!n(zzzVar) || !l(zzzVar, true) || !m(zzzVar)) {
            return false;
        }
        if (this.i) {
            int i3 = zzzVar.v;
            if (i3 <= 0 || (i2 = zzzVar.w) <= 0) {
                return true;
            }
            return g(i3, i2, zzzVar.x);
        }
        int i4 = zzzVar.F;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null) {
                j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                j("sampleRate.aCaps");
                return false;
            } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                j("sampleRate.support, " + i4);
                return false;
            }
        }
        int i5 = zzzVar.E;
        if (i5 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 == null) {
                j("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                j("channelCount.aCaps");
                return false;
            }
            String str = this.a;
            String str2 = this.b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !C4128Rj1.I.equals(str2) && !C4128Rj1.c0.equals(str2) && !C4128Rj1.d0.equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !C4128Rj1.a0.equals(str2) && !C4128Rj1.N.equals(str2) && !C4128Rj1.e0.equals(str2) && !C4128Rj1.O.equals(str2) && !C4128Rj1.P.equals(str2) && !C4128Rj1.g0.equals(str2))) {
                if (C4128Rj1.Q.equals(str2)) {
                    i = 6;
                } else if (C4128Rj1.R.equals(str2)) {
                    i = 16;
                } else {
                    i = 30;
                }
                zzdx.f(C3621Me1.l, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + C6566gU0.g);
                maxInputChannelCount = i;
            }
            if (maxInputChannelCount < i5) {
                j("channelCount.support, " + i5);
                return false;
            }
        }
        return true;
    }

    public final boolean f(zzz zzzVar) {
        if (this.i) {
            return this.e;
        }
        int i = zztw.b;
        Pair a = zzdh.a(zzzVar);
        if (a != null && ((Integer) a.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            j("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            j("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a = zzte.a(videoCapabilities, i, i2, d);
            if (a != 2) {
                if (a == 1) {
                    j("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
            }
            return true;
        }
        if (!k(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && k(videoCapabilities, i2, i, d)) {
                    zzdx.b(C3621Me1.l, "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + str + C6566gU0.h + this.b + "] [" + zzeu.a + C6566gU0.g);
                }
            }
            j("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
            return false;
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities != null && (codecProfileLevelArr = codecCapabilities.profileLevels) != null) {
            return codecProfileLevelArr;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    public final void j(String str) {
        String str2 = zzeu.a;
        zzdx.b(C3621Me1.l, "NoSupport [" + str + "] [" + this.a + C6566gU0.h + this.b + "] [" + str2 + C6566gU0.g);
    }

    public final boolean l(zzz zzzVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] h;
        int i = zztw.b;
        Pair a = zzdh.a(zzzVar);
        String str = zzzVar.f301o;
        char c = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            String e = zzay.e(this.c);
            if (!e.equals("video/mv-hevc")) {
                if (e.equals(C4128Rj1.k)) {
                    String h2 = zzfs.h(zzzVar.r);
                    if (h2 == null) {
                        a = null;
                    } else {
                        String trim = h2.trim();
                        String str2 = zzeu.a;
                        a = zzdh.b(h2, trim.split("\\.", -1), zzzVar.C);
                    }
                }
            }
            return true;
        }
        if (a != null) {
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            if (C4128Rj1.w.equals(str)) {
                String str3 = this.b;
                int hashCode = str3.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str3.equals("video/avc")) {
                            c = 0;
                        }
                    } else if (str3.equals(C4128Rj1.k)) {
                        c = 1;
                    }
                } else if (str3.equals(C4128Rj1.n)) {
                    c = 2;
                }
                if (c != 0) {
                    if (c == 1 || c == 2) {
                        intValue = 2;
                    }
                } else {
                    intValue = 8;
                }
                intValue2 = 0;
            }
            if (!this.i) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                    if (C4128Rj1.k.equals(this.b) && intValue == 2) {
                        String str4 = Build.DEVICE;
                        if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                        }
                    }
                }
            }
            j("codec.profileLevel, " + zzzVar.k + C6566gU0.h + this.c);
            return false;
        }
        return true;
    }

    public final boolean m(zzz zzzVar) {
        if (Objects.equals(zzzVar.f301o, C4128Rj1.e0) && zzzVar.G == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean n(zzz zzzVar) {
        String str = this.b;
        if (!str.equals(zzzVar.f301o) && !str.equals(zztw.b(zzzVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.a;
    }
}
