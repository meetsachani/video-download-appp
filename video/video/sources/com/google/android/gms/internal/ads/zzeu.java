package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.internal.C2372q;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import o.AD1;
import o.C10323vs;
import o.C10997yd1;
import o.C3503Kz;
import o.C3855Oo;
import o.C4128Rj1;
import o.C6566gU0;
import o.C7193j50;
import o.C7834lj1;
import o.C8077mf;
import o.C8463oE0;
import o.C9276rZ;
import o.C9680tD0;
import o.CK1;
import o.DE;
import o.EF0;
import o.FF0;
import o.InterfaceC11300zs1;
import o.JT;
import o.TD2;
import o.Xu2;

/* loaded from: classes2.dex */
public final class zzeu {
    public static final String a;
    public static final byte[] b;
    public static final Pattern c;
    @InterfaceC11300zs1
    public static HashMap d;
    public static final String[] e;
    public static final String[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i2 = Build.VERSION.SDK_INT;
        a = str + C6566gU0.h + str2 + C6566gU0.h + str3 + C6566gU0.h + i2;
        b = new byte[0];
        c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        e = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, C10997yd1.n1, C10997yd1.u1, 233, 252, C10997yd1.w1, 242, 245, 216, 223, 214, C3503Kz.b.y, 196, 195, 202, 205, C3503Kz.h0, C3503Kz.k0, C3503Kz.r0, C3503Kz.m0, C3503Kz.d0, C3503Kz.c0, 130, C3503Kz.W, 168, 175, C10997yd1.t1, C10997yd1.q1, 180, 179, C10997yd1.Q1, CK1.w, 199, CK1.x, 201, 206, 219, 220, 213, 210, 255, 248, C10997yd1.o2, 246, 227, 228, 237, 234, C10997yd1.n2, 176, 185, C2372q.m, 171, Xu2.K, C10997yd1.v1, 162, C3503Kz.g0, 136, 129, 134, 147, DE.g, C3503Kz.q0, C3503Kz.n0, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, C3503Kz.a0, C3503Kz.f0, 135, 128, 149, C3503Kz.j0, 155, C3503Kz.p0, 177, FF0.q, 191, EF0.t, 173, C7193j50.f, C10997yd1.o1, 164, C9680tD0.j, C9680tD0.l, 247, 240, 229, C9276rZ.p, 235, 236, C8463oE0.u, 198, 207, 200, 221, C9276rZ.l, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, C10997yd1.y1, C7834lj1.G, 160, 167, 178, 181, Xu2.A, C10997yd1.l2, 150, C3503Kz.i0, C3503Kz.l0, 159, 138, C3503Kz.e0, C3503Kz.V, 131, 222, 217, 208, C10997yd1.z1, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = g[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int B(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i2 < i3) {
            i5 = i[i5 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i5;
    }

    public static int C(int i2) {
        if (i2 != 20) {
            if (i2 != 22) {
                if (i2 != 30) {
                    switch (i2) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i2) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    return Integer.MAX_VALUE;
                            }
                    }
                }
                return 34;
            }
            return 31;
        }
        return 30;
    }

    @SuppressLint({"InlinedApi"})
    public static int D(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 == 10) {
            i3 = 737532;
        } else if (i2 == 12) {
            return 743676;
        } else {
            if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i3 = 67108860;
            i4 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int E(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i3;
        }
        return Integer.reverseBytes(i3);
    }

    public static int F(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 21) {
                        if (i2 != 22) {
                            if (i2 != 268435456) {
                                if (i2 != 1342177280) {
                                    if (i2 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int G(int i2) {
        if (i2 == 2 || i2 == 4) {
            return AD1.B1;
        }
        if (i2 != 10) {
            if (i2 != 7) {
                if (i2 != 8) {
                    switch (i2) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return AD1.B1;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return AD1.A1;
                        default:
                            switch (i2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return AD1.C1;
                            }
                    }
                }
                return 6003;
            }
            return AD1.B1;
        }
        return AD1.A1;
    }

    public static int H(@InterfaceC11300zs1 String str) {
        String[] split;
        int length;
        boolean z;
        if (str == null || (length = (split = str.split(CrashlyticsReportPersistence.m, -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (str2 != null) {
                int parseInt = Integer.parseInt(str2);
                if (z) {
                    return -parseInt;
                }
                return parseInt;
            }
            throw null;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int I(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    return i2 != 32 ? 0 : 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int J(Uri uri) {
        char c2;
        int i2;
        String scheme = uri.getScheme();
        if (scheme != null && (zzfui.c("rtsp", scheme) || zzfui.c("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String a2 = zzfui.a(lastPathSegment.substring(lastIndexOf + 1));
            switch (a2.hashCode()) {
                case 104579:
                    if (a2.equals("ism")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108321:
                    if (a2.equals("mpd")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3242057:
                    if (a2.equals("isml")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3299913:
                    if (a2.equals("m3u8")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2 && c2 != 3) {
                        i2 = 4;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 0;
            }
            if (i2 != 4) {
                return i2;
            }
        }
        Pattern pattern = c;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains(TD2.m)) {
                return 0;
            }
            if (group.contains(TD2.l)) {
                return 2;
            }
        }
        return 1;
    }

    public static long K(long j, int i2) {
        return P(j, i2, 1000000L, RoundingMode.UP);
    }

    public static long L(long j, float f2) {
        if (f2 == 1.0f) {
            return j;
        }
        return Math.round(j * f2);
    }

    public static long M(long j, float f2) {
        if (f2 == 1.0f) {
            return j;
        }
        return Math.round(j / f2);
    }

    public static long N(long j) {
        return (j == C10323vs.b || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long O(long j, int i2) {
        return P(j, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long P(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        int i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i2 >= 0 && j3 % j2 == 0) {
            return zzgba.b(j, zzgba.b(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i2 < 0 && j2 % j3 == 0) {
            return zzgba.d(j, zzgba.b(j2, j3, RoundingMode.UNNECESSARY));
        }
        int i3 = (j3 > j ? 1 : (j3 == j ? 0 : -1));
        if (i3 >= 0 && j3 % j == 0) {
            return zzgba.b(j2, zzgba.b(j3, j, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i3 < 0 && j % j3 == 0) {
            return zzgba.d(j2, zzgba.b(j, j3, RoundingMode.UNNECESSARY));
        }
        return s(j, j2, j3, roundingMode);
    }

    public static long Q(long j) {
        return (j == C10323vs.b || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static Point R(Context context) {
        Display display;
        String t;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && n(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                t = t("sys.display-size");
            } else {
                t = t("vendor.display-size");
            }
            if (!TextUtils.isEmpty(t)) {
                try {
                    String[] split = t.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzdx.c(TD2.g, "Invalid display size: ".concat(String.valueOf(t)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat S(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static Handler T(@InterfaceC11300zs1 Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzdc.b(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper U() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static zzz a(int i2, int i3, int i4) {
        zzx zzxVar = new zzx();
        zzxVar.E(C4128Rj1.N);
        zzxVar.b(i3);
        zzxVar.F(i4);
        zzxVar.x(i2);
        return zzxVar.K();
    }

    public static String b(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String c(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static String d(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return JT.d;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C10323vs.g1)) {
            str = replace;
        }
        String a2 = zzfui.a(str);
        int i2 = 0;
        String str2 = a2.split("-", 2)[0];
        if (d == null) {
            d = u();
        }
        String str3 = (String) d.get(str2);
        if (str3 != null) {
            a2 = str3.concat(String.valueOf(a2.substring(str2.length())));
            str2 = str3;
        }
        if (C3855Oo.b.equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = f;
                int length = strArr.length;
                if (i2 >= 18) {
                    break;
                } else if (a2.startsWith(strArr[i2])) {
                    return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(a2.substring(strArr[i2].length())));
                } else {
                    i2 += 2;
                }
            }
        }
        return a2;
    }

    public static ExecutorService f(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzes
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2 = zzeu.a;
                return new Thread(runnable, str);
            }
        });
    }

    public static void g(long[] jArr, long j, long j2) {
        long j3;
        int i2 = (j2 > 1000000L ? 1 : (j2 == 1000000L ? 0 : -1));
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i3 = 0;
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long b2 = zzgba.b(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = zzgba.b(jArr[i3], b2, roundingMode);
                i3++;
            }
        } else if (i2 < 0 && 1000000 % j2 == 0) {
            long b3 = zzgba.b(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = zzgba.d(jArr[i3], b3);
                i3++;
            }
        } else {
            int i4 = 0;
            while (i4 < jArr.length) {
                long j4 = jArr[i4];
                if (j4 != 0) {
                    int i5 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
                    if (i5 >= 0 && j2 % j4 == 0) {
                        jArr[i4] = zzgba.b(1000000L, zzgba.b(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i5 < 0 && j4 % j2 == 0) {
                        jArr[i4] = zzgba.d(1000000L, zzgba.b(j4, j2, RoundingMode.UNNECESSARY));
                    } else {
                        j3 = j2;
                        jArr[i4] = s(j4, 1000000L, j3, roundingMode);
                        i4++;
                        j2 = j3;
                    }
                }
                j3 = j2;
                i4++;
                j2 = j3;
            }
        }
    }

    public static boolean h(SparseArray sparseArray, int i2) {
        if (sparseArray.indexOfKey(i2) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r4.k(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(zzek zzekVar, zzek zzekVar2, @InterfaceC11300zs1 Inflater inflater) {
        boolean z = false;
        if (zzekVar.u() == 0) {
            return false;
        }
        if (zzekVar2.v() < zzekVar.u()) {
            int u = zzekVar.u();
            zzekVar2.f(u + u);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzekVar.n(), zzekVar.w(), zzekVar.u());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(zzekVar2.n(), i2, zzekVar2.v() - i2);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else if (i2 == zzekVar2.v()) {
                        int v = zzekVar2.v();
                        zzekVar2.f(v + v);
                    }
                } else {
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z;
    }

    public static boolean j(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    public static boolean k(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean l(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (zzfui.c(str, "moto g(20)") || zzfui.c(str, "rmx3231")) {
                return true;
            }
        }
        if (i2 == 34 && zzfui.c(Build.MODEL, "sm-x200")) {
            return true;
        }
        return false;
    }

    public static boolean m(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean n(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean o(zzek zzekVar, zzek zzekVar2, @InterfaceC11300zs1 Inflater inflater) {
        if (zzekVar.u() > 0 && zzekVar.z() == 120 && i(zzekVar, zzekVar2, inflater)) {
            return true;
        }
        return false;
    }

    public static boolean p(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static Object[] q(Object[] objArr, int i2) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static int r(int i2, int i3) {
        return (char) (h[i2 ^ (i3 >> 12)] ^ ((char) (i3 << 4)));
    }

    public static long s(long j, long j2, long j3, RoundingMode roundingMode) {
        long d2 = zzgba.d(j, j2);
        if (d2 != Long.MAX_VALUE && d2 != Long.MIN_VALUE) {
            return zzgba.b(d2, j3, roundingMode);
        }
        long c2 = zzgba.c(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b2 = zzgba.b(j2, c2, roundingMode2);
        long b3 = zzgba.b(j3, c2, roundingMode2);
        long c3 = zzgba.c(Math.abs(j), Math.abs(b3));
        long b4 = zzgba.b(j, c3, roundingMode2);
        long b5 = zzgba.b(b3, c3, roundingMode2);
        long d3 = zzgba.d(b4, b2);
        if (d3 != Long.MAX_VALUE && d3 != Long.MIN_VALUE) {
            return zzgba.b(d3, b5, roundingMode);
        }
        double d4 = b4 * (b2 / b5);
        if (d4 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d4 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgav.b(d4, roundingMode);
    }

    @InterfaceC11300zs1
    public static String t(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            zzdx.d(TD2.g, "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static HashMap u() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = e.length;
        HashMap hashMap = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = e;
            int length3 = strArr.length;
            if (i2 < 88) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            } else {
                return hashMap;
            }
        }
    }

    public static int v(long[] jArr, long j, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j) {
                break;
            }
            binarySearch = i2;
        }
        if (!z) {
            return i2;
        }
        return binarySearch;
    }

    public static int w(zzdy zzdyVar, long j, boolean z, boolean z2) {
        int a2 = zzdyVar.a() - 1;
        int i2 = 0;
        while (i2 <= a2) {
            int i3 = (i2 + a2) >>> 1;
            if (zzdyVar.b(i3) < j) {
                i2 = i3 + 1;
            } else {
                a2 = i3 - 1;
            }
        }
        int i4 = a2 + 1;
        if (i4 < zzdyVar.a() && zzdyVar.b(i4) == j) {
            return i4;
        }
        if (a2 == -1) {
            return 0;
        }
        return a2;
    }

    public static int x(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            if (z) {
                i4 = binarySearch;
            } else {
                i4 = i3;
            }
        }
        if (z2) {
            return Math.max(0, i4);
        }
        return i4;
    }

    public static int y(long[] jArr, long j, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z2) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static int z(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 65535;
        for (int i6 = 0; i6 < i3; i6++) {
            byte b2 = bArr[i6];
            i5 = r(b2 & C8077mf.q, r((b2 & 255) >> 4, i5));
        }
        return i5;
    }
}
