package o;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C5137af1;

@SuppressLint({"InlinedApi"})
@Deprecated
/* renamed from: o.af1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5137af1 {
    public static final String a = "MediaCodecUtil";
    public static final String d = "avc1";
    public static final String e = "avc2";
    public static final String f = "vp09";
    public static final String g = "hev1";
    public static final String h = "hvc1";
    public static final String i = "av01";
    public static final String j = "mp4a";
    public static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    @InterfaceC8710pF0("MediaCodecUtil.class")
    public static final HashMap<b, List<C3621Me1>> c = new HashMap<>();
    public static int k = -1;

    /* renamed from: o.af1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = (this.a.hashCode() + 31) * 31;
            int i2 = 1237;
            if (this.b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (hashCode + i) * 31;
            if (this.c) {
                i2 = 1231;
            }
            return i3 + i2;
        }
    }

    /* renamed from: o.af1$c */
    /* loaded from: classes2.dex */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: o.af1$d */
    /* loaded from: classes2.dex */
    public interface d {
        MediaCodecInfo a(int i);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* renamed from: o.af1$e */
    /* loaded from: classes2.dex */
    public static final class e implements d {
        public e() {
        }

        @Override // o.C5137af1.d
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // o.C5137af1.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
                return true;
            }
            return false;
        }

        @Override // o.C5137af1.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // o.C5137af1.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // o.C5137af1.d
        public boolean e() {
            return false;
        }
    }

    @ES1(21)
    /* renamed from: o.af1$f */
    /* loaded from: classes2.dex */
    public static final class f implements d {
        public final int a;
        @InterfaceC11300zs1
        public MediaCodecInfo[] b;

        public f(boolean z, boolean z2) {
            int i;
            if (!z && !z2) {
                i = 0;
            } else {
                i = 1;
            }
            this.a = i;
        }

        @Override // o.C5137af1.d
        public MediaCodecInfo a(int i) {
            f();
            return this.b[i];
        }

        @Override // o.C5137af1.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // o.C5137af1.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // o.C5137af1.d
        public int d() {
            f();
            return this.b.length;
        }

        @Override // o.C5137af1.d
        public boolean e() {
            return true;
        }

        @InterfaceC8557od0({"mediaCodecInfos"})
        public final void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    /* renamed from: o.af1$g */
    /* loaded from: classes2.dex */
    public interface g<T> {
        int a(T t);
    }

    @InterfaceC11300zs1
    public static Pair<Integer, Integer> A(String str, String[] strArr, @InterfaceC11300zs1 IF r8) {
        if (strArr.length < 4) {
            I31.n(a, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i2 = 1;
        Matcher matcher = b.matcher(strArr[1]);
        if (!matcher.matches()) {
            I31.n(a, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (C2638Cg0.Y4.equals(group)) {
                if (r8 != null && r8.Z == 6) {
                    i2 = 4096;
                } else {
                    i2 = 2;
                }
            } else {
                I31.n(a, "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer C = C(str2);
        if (C == null) {
            I31.n(a, "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair<>(Integer.valueOf(i2), C);
    }

    @InterfaceC11300zs1
    public static Pair<Integer, Integer> B(String str, String[] strArr) {
        if (strArr.length < 3) {
            I31.n(a, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int Q = Q(parseInt);
            if (Q == -1) {
                I31.n(a, "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int P = P(parseInt2);
            if (P == -1) {
                I31.n(a, "Unknown VP9 level: " + parseInt2);
                return null;
            }
            return new Pair<>(Integer.valueOf(Q), Integer.valueOf(P));
        } catch (NumberFormatException unused) {
            I31.n(a, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static Integer C(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c2 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c2 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c2 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c2 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c2 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c2 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c2 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c2 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c2 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c2 = C8206nB.d;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c2 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c2 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c2 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c2 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c2 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c2 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c2 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c2 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c2 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c2 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c2 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c2 = 25;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return 2048;
            case 11:
                return 8192;
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        if (TD2.a >= 29 && E(mediaCodecInfo)) {
            return true;
        }
        return false;
    }

    @ES1(29)
    public static boolean E(MediaCodecInfo mediaCodecInfo) {
        return C4499Ve1.a(mediaCodecInfo);
    }

    public static boolean F(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = TD2.a;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = TD2.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(TD2.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = TD2.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = TD2.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && D71.b.equals(TD2.c))) {
            String str6 = TD2.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && D71.b.equals(TD2.c)) {
            String str7 = TD2.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && TD2.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i2 <= 23 && C4128Rj1.S.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo, String str) {
        if (TD2.a >= 29) {
            return H(mediaCodecInfo);
        }
        return !I(mediaCodecInfo, str);
    }

    @ES1(29)
    public static boolean H(MediaCodecInfo mediaCodecInfo) {
        return C4402Ue1.a(mediaCodecInfo);
    }

    public static boolean I(MediaCodecInfo mediaCodecInfo, String str) {
        if (TD2.a >= 29) {
            return J(mediaCodecInfo);
        }
        if (C4128Rj1.p(str)) {
            return true;
        }
        String g2 = C8077mf.g(mediaCodecInfo.getName());
        if (g2.startsWith("arc.")) {
            return false;
        }
        if (g2.startsWith("omx.google.") || g2.startsWith("omx.ffmpeg.") || ((g2.startsWith("omx.sec.") && g2.contains(".sw.")) || g2.equals("omx.qcom.video.decoder.hevcswvdec") || g2.startsWith("c2.android.") || g2.startsWith("c2.google.") || (!g2.startsWith("omx.") && !g2.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    @ES1(29)
    public static boolean J(MediaCodecInfo mediaCodecInfo) {
        return C4305Te1.a(mediaCodecInfo);
    }

    public static boolean K(MediaCodecInfo mediaCodecInfo) {
        if (TD2.a >= 29) {
            return L(mediaCodecInfo);
        }
        String g2 = C8077mf.g(mediaCodecInfo.getName());
        if (!g2.startsWith("omx.google.") && !g2.startsWith("c2.android.") && !g2.startsWith("c2.google.")) {
            return true;
        }
        return false;
    }

    @ES1(29)
    public static boolean L(MediaCodecInfo mediaCodecInfo) {
        return C4208Se1.a(mediaCodecInfo);
    }

    public static int M() throws c {
        int i2;
        if (k == -1) {
            int i3 = 0;
            C3621Me1 t = t("video/avc", false, false);
            if (t != null) {
                MediaCodecInfo.CodecProfileLevel[] j2 = t.j();
                int length = j2.length;
                int i4 = 0;
                while (i3 < length) {
                    i4 = Math.max(h(j2[i3].level), i4);
                    i3++;
                }
                if (TD2.a >= 21) {
                    i2 = 345600;
                } else {
                    i2 = 172800;
                }
                i3 = Math.max(i4, i2);
            }
            k = i3;
        }
        return k;
    }

    public static int N(int i2) {
        int i3 = 17;
        if (i2 != 17) {
            i3 = 20;
            if (i2 != 20) {
                i3 = 23;
                if (i2 != 23) {
                    i3 = 29;
                    if (i2 != 29) {
                        i3 = 39;
                        if (i2 != 39) {
                            i3 = 42;
                            if (i2 != 42) {
                                switch (i2) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i3;
    }

    public static <T> void O(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: o.We1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C5137af1.a(C5137af1.g.this, obj, obj2);
            }
        });
    }

    public static int P(int i2) {
        if (i2 != 10) {
            if (i2 != 11) {
                if (i2 != 20) {
                    if (i2 != 21) {
                        if (i2 != 30) {
                            if (i2 != 31) {
                                if (i2 != 40) {
                                    if (i2 != 41) {
                                        if (i2 != 50) {
                                            if (i2 != 51) {
                                                switch (i2) {
                                                    case 60:
                                                        return 2048;
                                                    case 61:
                                                        return 4096;
                                                    case 62:
                                                        return 8192;
                                                    default:
                                                        return -1;
                                                }
                                            }
                                            return 512;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int Q(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return -1;
            }
            return 8;
        }
        return 4;
    }

    public static void R(String str, boolean z, boolean z2) {
        try {
            u(str, z, z2);
        } catch (c e2) {
            I31.e(a, "Codec warming failed", e2);
        }
    }

    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static /* synthetic */ int b(C3621Me1 c3621Me1) {
        String str = c3621Me1.a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (TD2.a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    public static /* synthetic */ int c(C3621Me1 c3621Me1) {
        return c3621Me1.a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int d(C10833xx0 c10833xx0, C3621Me1 c3621Me1) {
        return c3621Me1.p(c10833xx0) ? 1 : 0;
    }

    public static void e(String str, List<C3621Me1> list) {
        if (C4128Rj1.N.equals(str)) {
            if (TD2.a < 26 && TD2.b.equals("R9") && list.size() == 1 && list.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C3621Me1.I("OMX.google.raw.decoder", C4128Rj1.N, C4128Rj1.N, null, false, true, false, false, false));
            }
            O(list, new g() { // from class: o.Xe1
                @Override // o.C5137af1.g
                public final int a(Object obj) {
                    return C5137af1.b((C3621Me1) obj);
                }
            });
        }
        int i2 = TD2.a;
        if (i2 < 21 && list.size() > 1) {
            String str2 = list.get(0).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                O(list, new g() { // from class: o.Ye1
                    @Override // o.C5137af1.g
                    public final int a(Object obj) {
                        return C5137af1.c((C3621Me1) obj);
                    }
                });
            }
        }
        if (i2 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).a)) {
            list.add(list.remove(0));
        }
    }

    public static int f(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int g(int i2) {
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i2) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i2) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i2) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i2) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int h(int i2) {
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 8:
                case 16:
                case 32:
                    return 101376;
                case 64:
                    return 202752;
                case 128:
                case 256:
                    return 414720;
                case 512:
                    return 921600;
                case 1024:
                    return 1310720;
                case 2048:
                case 4096:
                    return 2097152;
                case 8192:
                    return 2228224;
                case 16384:
                    return 5652480;
                case 32768:
                case 65536:
                    return 9437184;
                case 131072:
                case 262144:
                case 524288:
                    return 35651584;
                default:
                    return -1;
            }
        }
        return 25344;
    }

    public static int i(int i2) {
        if (i2 != 66) {
            if (i2 != 77) {
                if (i2 != 88) {
                    if (i2 != 100) {
                        if (i2 != 110) {
                            if (i2 != 122) {
                                if (i2 != 244) {
                                    return -1;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    @InterfaceC5056aJ2
    public static synchronized void j() {
        synchronized (C5137af1.class) {
            c.clear();
        }
    }

    @InterfaceC11300zs1
    public static Integer k(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c2 = '\f';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    @InterfaceC11300zs1
    public static Integer l(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case I3.g /* 1536 */:
                if (str.equals(ChipTextInputComboView.b.Y)) {
                    c2 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c2 = '\t';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    @InterfaceC11300zs1
    public static Pair<Integer, Integer> m(String str, String[] strArr) {
        int N;
        if (strArr.length != 3) {
            I31.n(a, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C4128Rj1.h(Integer.parseInt(strArr[1], 16))) && (N = N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(N), 0);
            }
        } catch (NumberFormatException unused) {
            I31.n(a, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String n(C10833xx0 c10833xx0) {
        Pair<Integer, Integer> s;
        if (C4128Rj1.S.equals(c10833xx0.g1)) {
            return C4128Rj1.R;
        }
        if (C4128Rj1.w.equals(c10833xx0.g1) && (s = s(c10833xx0)) != null) {
            int intValue = ((Integer) s.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return C4128Rj1.k;
        }
        return null;
    }

    public static List<C3621Me1> o(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z, boolean z2) throws c {
        String n = n(c10833xx0);
        if (n == null) {
            return AbstractC5317bO0.L();
        }
        return interfaceC4108Re1.a(n, z, z2);
    }

    @InterfaceC11300zs1
    public static Pair<Integer, Integer> p(String str, String[] strArr, @InterfaceC11300zs1 IF r10) {
        int i2;
        if (strArr.length < 4) {
            I31.n(a, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i3 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                I31.n(a, "Unknown AV1 profile: " + parseInt);
                return null;
            } else if (parseInt3 != 8 && parseInt3 != 10) {
                I31.n(a, "Unknown AV1 bit depth: " + parseInt3);
                return null;
            } else {
                if (parseInt3 != 8) {
                    if (r10 != null && (r10.Y0 != null || (i2 = r10.Z) == 7 || i2 == 6)) {
                        i3 = 4096;
                    } else {
                        i3 = 2;
                    }
                }
                int f2 = f(parseInt2);
                if (f2 == -1) {
                    I31.n(a, "Unknown AV1 level: " + parseInt2);
                    return null;
                }
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(f2));
            }
        } catch (NumberFormatException unused) {
            I31.n(a, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static Pair<Integer, Integer> q(String str, String[] strArr) {
        int parseInt;
        int i2;
        if (strArr.length < 2) {
            I31.n(a, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i2 = parseInt2;
            } else {
                I31.n(a, "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i3 = i(i2);
            if (i3 == -1) {
                I31.n(a, "Unknown AVC profile: " + i2);
                return null;
            }
            int g2 = g(parseInt);
            if (g2 == -1) {
                I31.n(a, "Unknown AVC level: " + parseInt);
                return null;
            }
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf(g2));
        } catch (NumberFormatException unused) {
            I31.n(a, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static String r(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(C4128Rj1.w)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals(C4128Rj1.f0) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals(C4128Rj1.e0) && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals(C4128Rj1.Q) && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r3.equals(o.C5137af1.i) == false) goto L11;
     */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> s(C10833xx0 c10833xx0) {
        String str = c10833xx0.d1;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (C4128Rj1.w.equals(c10833xx0.g1)) {
            return z(c10833xx0.d1, split);
        }
        char c2 = 0;
        String str2 = split[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                break;
            case 3006243:
                if (str2.equals(d)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str2.equals(e)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str2.equals(g)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str2.equals(h)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3356560:
                if (str2.equals(j)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3624515:
                if (str2.equals(f)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return p(c10833xx0.d1, split, c10833xx0.s1);
            case 1:
            case 2:
                return q(c10833xx0.d1, split);
            case 3:
            case 4:
                return A(c10833xx0.d1, split, c10833xx0.s1);
            case 5:
                return m(c10833xx0.d1, split);
            case 6:
                return B(c10833xx0.d1, split);
            default:
                return null;
        }
    }

    @InterfaceC11300zs1
    public static C3621Me1 t(String str, boolean z, boolean z2) throws c {
        List<C3621Me1> u = u(str, z, z2);
        if (u.isEmpty()) {
            return null;
        }
        return u.get(0);
    }

    public static synchronized List<C3621Me1> u(String str, boolean z, boolean z2) throws c {
        d eVar;
        synchronized (C5137af1.class) {
            try {
                b bVar = new b(str, z, z2);
                HashMap<b, List<C3621Me1>> hashMap = c;
                List<C3621Me1> list = hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i2 = TD2.a;
                if (i2 >= 21) {
                    eVar = new f(z, z2);
                } else {
                    eVar = new e();
                }
                ArrayList<C3621Me1> v = v(bVar, eVar);
                if (z && v.isEmpty() && 21 <= i2 && i2 <= 23) {
                    v = v(bVar, new e());
                    if (!v.isEmpty()) {
                        I31.n(a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + v.get(0).a);
                    }
                }
                e(str, v);
                AbstractC5317bO0 F = AbstractC5317bO0.F(v);
                hashMap.put(bVar, F);
                return F;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r1.b != r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r1.b == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        r17 = r11;
        r18 = r16;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
        r5.add(o.C3621Me1.I(r9, r7, r8, r9, r10, r11, r18, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<C3621Me1> v(b bVar, d dVar) throws c {
        String str;
        int i2;
        boolean z;
        boolean z2;
        b bVar2 = bVar;
        try {
            ArrayList<C3621Me1> arrayList = new ArrayList<>();
            String str2 = bVar2.a;
            int d2 = dVar.d();
            boolean e2 = dVar.e();
            int i3 = 0;
            while (i3 < d2) {
                MediaCodecInfo a2 = dVar.a(i3);
                if (!D(a2)) {
                    String name = a2.getName();
                    if (F(a2, name, e2, str2)) {
                        int i4 = i3;
                        String r = r(a2, name, str2);
                        if (r == null) {
                            z = e2;
                            i2 = i4;
                        } else {
                            boolean z3 = e2;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(r);
                                boolean b2 = dVar.b("tunneled-playback", r, capabilitiesForType);
                                boolean c2 = dVar.c("tunneled-playback", r, capabilitiesForType);
                                boolean z4 = bVar2.c;
                                if ((z4 || !c2) && (!z4 || b2)) {
                                    boolean b3 = dVar.b("secure-playback", r, capabilitiesForType);
                                    boolean c3 = dVar.c("secure-playback", r, capabilitiesForType);
                                    boolean z5 = bVar2.b;
                                    if ((z5 || !c3) && (!z5 || b3)) {
                                        try {
                                            boolean G = G(a2, str2);
                                            try {
                                                boolean I = I(a2, str2);
                                                boolean K = K(a2);
                                                if (z3) {
                                                    z2 = K;
                                                } else {
                                                    z2 = K;
                                                }
                                                if (!z3) {
                                                    try {
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i2 = i4;
                                                        z = z3;
                                                        str = name;
                                                        if (TD2.a <= 23 && !arrayList.isEmpty()) {
                                                            I31.d(a, "Skipping codec " + str + " (failed to query capabilities)");
                                                            i3 = i2 + 1;
                                                            bVar2 = bVar;
                                                            e2 = z;
                                                        } else {
                                                            I31.d(a, "Failed to query codec " + str + " (" + r + C9811tl1.d);
                                                            throw e;
                                                        }
                                                    }
                                                }
                                                z = z3;
                                                boolean z6 = z2;
                                                i2 = i4;
                                                if (!z && b3) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(C3621Me1.I(name + ".secure", str2, r, capabilitiesForType, G, I, z6, false, true));
                                                        break;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        if (TD2.a <= 23) {
                                                        }
                                                        I31.d(a, "Failed to query codec " + str + " (" + r + C9811tl1.d);
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                str = name;
                                                i2 = i4;
                                                z = z3;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            str = name;
                                            z = z3;
                                            i2 = i4;
                                        }
                                    }
                                }
                                i2 = i4;
                                z = z3;
                            } catch (Exception e7) {
                                e = e7;
                                str = name;
                                i2 = i4;
                                z = z3;
                            }
                        }
                        i3 = i2 + 1;
                        bVar2 = bVar;
                        e2 = z;
                    }
                }
                z = e2;
                i2 = i3;
                i3 = i2 + 1;
                bVar2 = bVar;
                e2 = z;
            }
            return arrayList;
        } catch (Exception e8) {
            throw new c(e8);
        }
    }

    @HS1({"#2.sampleMimeType"})
    public static List<C3621Me1> w(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z, boolean z2) throws c {
        List<C3621Me1> a2 = interfaceC4108Re1.a(c10833xx0.g1, z, z2);
        return AbstractC5317bO0.r().c(a2).c(o(interfaceC4108Re1, c10833xx0, z, z2)).e();
    }

    @OB
    public static List<C3621Me1> x(List<C3621Me1> list, final C10833xx0 c10833xx0) {
        ArrayList arrayList = new ArrayList(list);
        O(arrayList, new g() { // from class: o.Ze1
            @Override // o.C5137af1.g
            public final int a(Object obj) {
                return C5137af1.d(C10833xx0.this, (C3621Me1) obj);
            }
        });
        return arrayList;
    }

    @InterfaceC11300zs1
    public static C3621Me1 y() throws c {
        return t(C4128Rj1.N, false, false);
    }

    @InterfaceC11300zs1
    public static Pair<Integer, Integer> z(String str, String[] strArr) {
        if (strArr.length < 3) {
            I31.n(a, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = b.matcher(strArr[1]);
        if (!matcher.matches()) {
            I31.n(a, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer l = l(group);
        if (l == null) {
            I31.n(a, "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer k2 = k(str2);
        if (k2 == null) {
            I31.n(a, "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair<>(l, k2);
    }
}
