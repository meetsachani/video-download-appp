package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.internal.C2372q;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import o.C10833xx0;
import o.C3503Kz;
import o.C8322nf1;
import o.HD1;

@Deprecated
/* loaded from: classes2.dex */
public final class TD2 {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final String g = "Util";
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static final Pattern k;
    public static final String l = "format=m3u8-aapl";
    public static final String m = "format=mpd-time-csf";
    @InterfaceC11300zs1
    public static HashMap<String, String> n;

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f617o;
    public static final String[] p;
    public static final int[] q;
    public static final int[] r;

    @ES1(21)
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static Drawable a(Context context, Resources resources, @K60 int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + C6566gU0.h + str3 + C6566gU0.h + str2 + C6566gU0.h + i2;
        f = new byte[0];
        h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f617o = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        p = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        q = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        r = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, C10997yd1.n1, C10997yd1.u1, 233, 252, C10997yd1.w1, 242, 245, 216, 223, 214, C3503Kz.b.y, 196, 195, 202, 205, C3503Kz.h0, C3503Kz.k0, C3503Kz.r0, C3503Kz.m0, C3503Kz.d0, C3503Kz.c0, 130, C3503Kz.W, 168, 175, C10997yd1.t1, C10997yd1.q1, 180, 179, C10997yd1.Q1, CK1.w, 199, CK1.x, 201, 206, 219, 220, 213, 210, 255, 248, C10997yd1.o2, 246, 227, 228, 237, 234, C10997yd1.n2, 176, 185, C2372q.m, 171, Xu2.K, C10997yd1.v1, 162, C3503Kz.g0, 136, 129, 134, 147, DE.g, C3503Kz.q0, C3503Kz.n0, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, C3503Kz.a0, C3503Kz.f0, 135, 128, 149, C3503Kz.j0, 155, C3503Kz.p0, 177, FF0.q, 191, EF0.t, 173, C7193j50.f, C10997yd1.o1, 164, C9680tD0.j, C9680tD0.l, 247, 240, 229, C9276rZ.p, 235, 236, C8463oE0.u, 198, 207, 200, 221, C9276rZ.l, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, C10997yd1.y1, C7834lj1.G, 160, 167, 178, 181, Xu2.A, C10997yd1.l2, 150, C3503Kz.i0, C3503Kz.l0, 159, 138, C3503Kz.e0, C3503Kz.V, 131, 222, 217, 208, C10997yd1.z1, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = r[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static String[] A0() {
        String[] B0 = B0();
        for (int i2 = 0; i2 < B0.length; i2++) {
            B0[i2] = m1(B0[i2]);
        }
        return B0;
    }

    @ES1(api = 23)
    public static boolean A1(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static Handler B(Looper looper, @InterfaceC11300zs1 Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String[] B0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return a >= 24 ? C0(configuration) : new String[]{p0(configuration.locale)};
    }

    public static long B1(long j2, int i2) {
        return (j2 * 1000000) / i2;
    }

    public static Handler C() {
        return D(null);
    }

    @ES1(24)
    public static String[] C0(Configuration configuration) {
        return J1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static long C1(long j2, long j3, long j4) {
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (i2 < 0 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (j2 * (j3 / j4));
    }

    public static Handler D(@InterfaceC11300zs1 Handler.Callback callback) {
        return B((Looper) C9542sf.k(Looper.myLooper()), callback);
    }

    @InterfaceC11300zs1
    public static String D0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            I31.e(g, "Failed to read system property " + str, e2);
            return null;
        }
    }

    public static long[] D1(List<Long> list, long j2, long j3) {
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        int i3 = 0;
        if (i2 >= 0 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i3 < size) {
                jArr[i3] = list.get(i3).longValue() / j4;
                i3++;
            }
        } else if (i2 < 0 && j2 % j3 == 0) {
            long j5 = j2 / j3;
            while (i3 < size) {
                jArr[i3] = list.get(i3).longValue() * j5;
                i3++;
            }
        } else {
            double d2 = j2 / j3;
            while (i3 < size) {
                jArr[i3] = (long) (list.get(i3).longValue() * d2);
                i3++;
            }
        }
        return jArr;
    }

    public static Handler E() {
        return F(null);
    }

    public static String E0(int i2) {
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
            case 6:
                return "camera motion";
            default:
                if (i2 >= 10000) {
                    return "custom (" + i2 + C9811tl1.d;
                }
                return "?";
        }
    }

    public static void E1(long[] jArr, long j2, long j3) {
        int i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        int i3 = 0;
        if (i2 >= 0 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i3 < jArr.length) {
                jArr[i3] = jArr[i3] / j4;
                i3++;
            }
        } else if (i2 < 0 && j2 % j3 == 0) {
            long j5 = j2 / j3;
            while (i3 < jArr.length) {
                jArr[i3] = jArr[i3] * j5;
                i3++;
            }
        } else {
            double d2 = j2 / j3;
            while (i3 < jArr.length) {
                jArr[i3] = (long) (jArr[i3] * d2);
                i3++;
            }
        }
    }

    public static Handler F(@InterfaceC11300zs1 Handler.Callback callback) {
        return B(d0(), callback);
    }

    public static String F0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + RemoteSettings.i + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + C6361fi0.c;
    }

    public static boolean F1(char c2) {
        if (c2 != '\"' && c2 != '%' && c2 != '*' && c2 != '/' && c2 != ':' && c2 != '<' && c2 != '\\' && c2 != '|' && c2 != '>' && c2 != '?') {
            return false;
        }
        return true;
    }

    public static HashMap<String, String> G() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f617o.length);
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
            String[] strArr = f617o;
            if (i2 < strArr.length) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            } else {
                return hashMap;
            }
        }
    }

    public static byte[] G0(String str) {
        return str.getBytes(KB.c);
    }

    @InterfaceC8800pd0(expression = {"#1"}, result = false)
    public static boolean G1(@InterfaceC11300zs1 HD1 hd1) {
        if (hd1 == null || !hd1.u1() || hd1.X() == 1 || hd1.X() == 4) {
            return true;
        }
        return false;
    }

    public static File H(Context context, String str) throws IOException {
        File I = I(context, str);
        I.delete();
        I.mkdir();
        return I;
    }

    public static byte[] H0(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void H1(Throwable th) {
        I1(th);
    }

    public static File I(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) C9542sf.g(context.getCacheDir()));
    }

    public static boolean I0(@InterfaceC11300zs1 HD1 hd1) {
        if (hd1 != null && hd1.T0(1)) {
            hd1.pause();
            return true;
        }
        return false;
    }

    public static long J(long j2, int i2) {
        return r(j2 * i2, 1000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J0(@InterfaceC11300zs1 HD1 hd1) {
        boolean z = false;
        if (hd1 == null) {
            return false;
        }
        int X = hd1.X();
        if (X == 1 && hd1.T0(2)) {
            hd1.m0();
        } else {
            if (X == 4 && hd1.T0(4)) {
                hd1.d0();
            }
            if (!hd1.T0(1)) {
                hd1.t0();
                return true;
            }
            return z;
        }
        z = true;
        if (!hd1.T0(1)) {
        }
    }

    public static String[] J1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String K(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (F1(str.charAt(i4))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i3 * 2) + length);
        while (i3 > 0) {
            int i5 = i2 + 1;
            char charAt = str.charAt(i2);
            if (F1(charAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(charAt));
                i3--;
            } else {
                sb.append(charAt);
            }
            i2 = i5;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        return sb.toString();
    }

    public static boolean K0(@InterfaceC11300zs1 HD1 hd1) {
        if (G1(hd1)) {
            return J0(hd1);
        }
        return I0(hd1);
    }

    public static String[] K1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Uri L(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            Matcher matcher = k.matcher(path);
            if (matcher.matches() && matcher.group(1) == null) {
                return Uri.withAppendedPath(uri, "Manifest");
            }
            return uri;
        }
        return uri;
    }

    public static int L0(Uri uri) {
        int O0;
        String scheme = uri.getScheme();
        if (scheme != null && C8077mf.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (O0 = O0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return O0;
        }
        Matcher matcher = k.matcher((CharSequence) C9542sf.g(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains(m)) {
                return 0;
            }
            if (group.contains(l)) {
                return 2;
            }
        }
        return 1;
    }

    public static String[] L1(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return J1(str.trim(), "(\\s*,\\s*)");
    }

    public static String M(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @Deprecated
    public static int M0(Uri uri, @InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return L0(uri);
        }
        return O0(str);
    }

    @InterfaceC11300zs1
    public static ComponentName M1(Context context, Intent intent) {
        if (a >= 26) {
            return JD2.a(context, intent);
        }
        return context.startService(intent);
    }

    public static String N(byte[] bArr) {
        return new String(bArr, KB.c);
    }

    @Deprecated
    public static int N0(String str) {
        return L0(Uri.parse("file:///" + str));
    }

    public static long N1(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        if (((j2 ^ j5) & (j3 ^ j2)) < 0) {
            return j4;
        }
        return j5;
    }

    public static String O(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, KB.c);
    }

    public static int O0(String str) {
        String g2 = C8077mf.g(str);
        g2.getClass();
        char c2 = 65535;
        switch (g2.hashCode()) {
            case 104579:
                if (g2.equals("ism")) {
                    c2 = 0;
                    break;
                }
                break;
            case 108321:
                if (g2.equals("mpd")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3242057:
                if (g2.equals("isml")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3299913:
                if (g2.equals("m3u8")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static long O1(long... jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        return j2;
    }

    @ES1(21)
    public static int P(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int P0(Uri uri, @InterfaceC11300zs1 String str) {
        if (str == null) {
            return L0(uri);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals(C4128Rj1.u0)) {
                    c2 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals(C4128Rj1.v0)) {
                    c2 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals(C4128Rj1.t0)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals(C4128Rj1.O0)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static boolean P1(SQLiteDatabase sQLiteDatabase, String str) {
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public static String Q(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return C4128Rj1.u0;
            }
            return C4128Rj1.v0;
        }
        return C4128Rj1.t0;
    }

    public static boolean Q0(C3012Fy1 c3012Fy1, C3012Fy1 c3012Fy12, @InterfaceC11300zs1 Inflater inflater) {
        if (c3012Fy1.a() <= 0) {
            return false;
        }
        if (c3012Fy12.b() < c3012Fy1.a()) {
            c3012Fy12.c(c3012Fy1.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c3012Fy1.e(), c3012Fy1.f(), c3012Fy1.a());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(c3012Fy12.e(), i2, c3012Fy12.b() - i2);
                if (inflater.finished()) {
                    c3012Fy12.X(i2);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i2 == c3012Fy12.b()) {
                    c3012Fy12.c(c3012Fy12.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static byte[] Q1(float f2) {
        return R1(Float.floatToIntBits(f2));
    }

    public static int R(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 8) {
            return 4;
        }
        return 2;
    }

    public static String R0(int i2) {
        return Integer.toString(i2, 36);
    }

    public static byte[] R1(int i2) {
        return new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @SuppressLint({"InlinedApi"})
    public static int S(int i2) {
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
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
        return 6396;
    }

    public static boolean S0(Context context) {
        if (a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    public static byte[] S1(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static int T(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int i3 = 4;
                if (i2 != 4) {
                    i3 = 5;
                    if (i2 != 5) {
                        if (i2 != 8) {
                            return 1;
                        }
                        return 3;
                    }
                }
                return i3;
            }
            return 6;
        }
        return 13;
    }

    public static boolean T0(int i2) {
        if (i2 != 536870912 && i2 != 805306368 && i2 != 4) {
            return false;
        }
        return true;
    }

    public static byte[] T1(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i2 = 0;
        for (int i3 : iArr) {
            byte[] R1 = R1(i3);
            bArr[i2] = R1[0];
            bArr[i2 + 1] = R1[1];
            int i4 = i2 + 3;
            bArr[i2 + 2] = R1[2];
            i2 += 4;
            bArr[i4] = R1[3];
        }
        return bArr;
    }

    public static HD1.c U(HD1 hd1, HD1.c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean O = hd1.O();
        boolean V1 = hd1.V1();
        boolean E1 = hd1.E1();
        boolean P0 = hd1.P0();
        boolean v2 = hd1.v2();
        boolean X0 = hd1.X0();
        boolean x = hd1.e1().x();
        HD1.c.a e2 = new HD1.c.a().b(cVar).e(4, !O);
        boolean z7 = false;
        if (V1 && !O) {
            z = true;
        } else {
            z = false;
        }
        HD1.c.a e3 = e2.e(5, z);
        if (E1 && !O) {
            z2 = true;
        } else {
            z2 = false;
        }
        HD1.c.a e4 = e3.e(6, z2);
        if (!x && ((E1 || !v2 || V1) && !O)) {
            z3 = true;
        } else {
            z3 = false;
        }
        HD1.c.a e5 = e4.e(7, z3);
        if (P0 && !O) {
            z4 = true;
        } else {
            z4 = false;
        }
        HD1.c.a e6 = e5.e(8, z4);
        if (!x && ((P0 || (v2 && X0)) && !O)) {
            z5 = true;
        } else {
            z5 = false;
        }
        HD1.c.a e7 = e6.e(9, z5).e(10, !O);
        if (V1 && !O) {
            z6 = true;
        } else {
            z6 = false;
        }
        HD1.c.a e8 = e7.e(11, z6);
        if (V1 && !O) {
            z7 = true;
        }
        return e8.e(12, z7).f();
    }

    public static boolean U0(int i2) {
        if (i2 != 3 && i2 != 2 && i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
            return false;
        }
        return true;
    }

    public static float U1(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        return Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << C8077mf.B) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    public static int V(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i3;
        }
        return Integer.reverseBytes(i3);
    }

    public static boolean V0(int i2) {
        if (i2 != 10 && i2 != 13) {
            return false;
        }
        return true;
    }

    public static String V1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i2] & C8077mf.q, 16));
        }
        return sb.toString();
    }

    public static byte[] W(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static boolean W0(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            return false;
        }
        return true;
    }

    public static int W1(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        return bArr[3] | (bArr[0] << C8077mf.B) | (bArr[1] << C8077mf.r) | (bArr[2] << 8);
    }

    public static int X(@InterfaceC11300zs1 String str, int i2) {
        int i3 = 0;
        for (String str2 : L1(str)) {
            if (i2 == C4128Rj1.n(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static boolean X0(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        if (!"external".equals(str) && !"external_primary".equals(str)) {
            return false;
        }
        return true;
    }

    public static long X1(int i2, int i3) {
        return Y1(i3) | (Y1(i2) << 32);
    }

    @InterfaceC11300zs1
    public static String Y(@InterfaceC11300zs1 String str, int i2) {
        String[] L1 = L1(str);
        if (L1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : L1) {
            if (i2 == C4128Rj1.n(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    @ES1(api = 24)
    public static boolean Y0(Uri uri) {
        if ("http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) C9542sf.g(uri.getHost()))) {
            return true;
        }
        return false;
    }

    public static long Y1(int i2) {
        return i2 & 4294967295L;
    }

    public static String Z(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(C6566gU0.h);
            }
        }
        return sb.toString();
    }

    public static boolean Z0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static <T, U> InterfaceFutureC8411o11<T> Z1(final InterfaceFutureC8411o11<U> interfaceFutureC8411o11, final InterfaceC2731Df<U, T> interfaceC2731Df) {
        final D22 F = D22.F();
        F.h4(new Runnable() { // from class: o.OD2
            @Override // java.lang.Runnable
            public final void run() {
                TD2.a(D22.this, interfaceFutureC8411o11);
            }
        }, C3645Mk1.c());
        interfaceFutureC8411o11.h4(new Runnable() { // from class: o.PD2
            @Override // java.lang.Runnable
            public final void run() {
                TD2.e(InterfaceFutureC8411o11.this, F, interfaceC2731Df);
            }
        }, C3645Mk1.c());
        return F;
    }

    public static /* synthetic */ void a(D22 d22, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        if (d22.isCancelled()) {
            interfaceFutureC8411o11.cancel(false);
        }
    }

    public static String a0(@InterfaceC11300zs1 Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C8077mf.j(networkCountryIso);
            }
        }
        return C8077mf.j(Locale.getDefault().getCountry());
    }

    public static int a1(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @InterfaceC11300zs1
    public static String a2(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i5 = length - (i3 * 2);
        StringBuilder sb = new StringBuilder(i5);
        Matcher matcher = j.matcher(str);
        while (i3 > 0 && matcher.find()) {
            sb.append((CharSequence) str, i2, matcher.start());
            sb.append((char) Integer.parseInt((String) C9542sf.g(matcher.group(1)), 16));
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        if (sb.length() != i5) {
            return null;
        }
        return sb.toString();
    }

    public static /* synthetic */ Thread b(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Point b0(Context context) {
        Display display;
        DisplayManager displayManager;
        if (a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            display = ((WindowManager) C9542sf.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return c0(context, display);
    }

    public static int b1(long[] jArr, long j2) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (jArr[i2] == j2) {
                return i2;
            }
        }
        return -1;
    }

    public static long b2(long j2) {
        if (j2 != C10323vs.b && j2 != Long.MIN_VALUE) {
            return j2 / 1000;
        }
        return j2;
    }

    public static /* synthetic */ void c(D22 d22, Runnable runnable, Object obj) {
        try {
            if (d22.isCancelled()) {
                return;
            }
            runnable.run();
            d22.B(obj);
        } catch (Throwable th) {
            d22.C(th);
        }
    }

    public static Point c0(Context context, Display display) {
        String D0;
        if (display.getDisplayId() == 0 && Z0(context)) {
            if (a < 28) {
                D0 = D0("sys.display-size");
            } else {
                D0 = D0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(D0)) {
                try {
                    String[] J1 = J1(D0.trim(), "x");
                    if (J1.length == 2) {
                        int parseInt = Integer.parseInt(J1[0]);
                        int parseInt2 = Integer.parseInt(J1[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                I31.d(g, "Invalid display size: " + D0);
            }
            if ("Sony".equals(c) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i2 = a;
        if (i2 >= 23) {
            i0(display, point);
        } else if (i2 >= 17) {
            h0(display, point);
        } else {
            g0(display, point);
        }
        return point;
    }

    @ES1(18)
    public static long c1(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            long j2 = Long.MIN_VALUE;
            for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                j2 = Math.max(j2, sparseLongArray.valueAt(i2));
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    public static void c2(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Looper d0() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static String d1(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = p;
            if (i2 < strArr.length) {
                if (str.startsWith(strArr[i2])) {
                    return strArr[i2 + 1] + str.substring(strArr[i2].length());
                }
                i2 += 2;
            } else {
                return str;
            }
        }
    }

    public static /* synthetic */ void e(InterfaceFutureC8411o11 interfaceFutureC8411o11, D22 d22, InterfaceC2731Df interfaceC2731Df) {
        try {
            try {
                d22.D(interfaceC2731Df.apply(C6980iC0.h(interfaceFutureC8411o11)));
            } catch (Throwable th) {
                d22.C(th);
            }
        } catch (Error e2) {
            e = e2;
            d22.C(e);
        } catch (CancellationException unused) {
            d22.cancel(false);
        } catch (RuntimeException e3) {
            e = e3;
            d22.C(e);
        } catch (ExecutionException e4) {
            e = e4;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            d22.C(e);
        }
    }

    public static Uri e0(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    public static boolean e1(Activity activity, Uri uri) {
        if (a >= 23) {
            if ((W0(uri) || X0(uri)) && A1(activity)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static long f(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        if (((j2 ^ j5) & (j3 ^ j5)) < 0) {
            return j4;
        }
        return j5;
    }

    public static Locale f0() {
        if (a >= 24) {
            return Locale.getDefault(Locale.Category.DISPLAY);
        }
        return Locale.getDefault();
    }

    public static boolean f1(Activity activity, Uri... uriArr) {
        if (a < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (e1(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void g0(Display display, Point point) {
        display.getSize(point);
    }

    public static boolean g1(Activity activity, C8322nf1... c8322nf1Arr) {
        if (a < 23) {
            return false;
        }
        for (C8322nf1 c8322nf1 : c8322nf1Arr) {
            C8322nf1.h hVar = c8322nf1.Y;
            if (hVar != null) {
                if (e1(activity, hVar.X)) {
                    return true;
                }
                AbstractC5317bO0<C8322nf1.k> abstractC5317bO0 = c8322nf1.Y.b1;
                for (int i2 = 0; i2 < abstractC5317bO0.size(); i2++) {
                    if (e1(activity, abstractC5317bO0.get(i2).X)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static <T extends Comparable<? super T>> int h(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i3 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i2 = binarySearch + 1;
                if (i2 >= size || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                binarySearch = i2;
            }
            if (z) {
                i3 = binarySearch;
            } else {
                i3 = i2;
            }
        }
        if (z2) {
            return Math.min(list.size() - 1, i3);
        }
        return i3;
    }

    @ES1(17)
    public static void h0(Display display, Point point) {
        display.getRealSize(point);
    }

    @ES1(18)
    public static long h1(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                j2 = Math.min(j2, sparseLongArray.valueAt(i2));
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    public static int i(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = ~binarySearch;
        } else {
            while (true) {
                i3 = binarySearch + 1;
                if (i3 >= iArr.length || iArr[i3] != i2) {
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
            return Math.min(iArr.length - 1, i4);
        }
        return i4;
    }

    @ES1(23)
    public static void i0(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static <T> void i1(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static int j(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i3 = ~binarySearch;
        } else {
            while (true) {
                i2 = binarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                binarySearch = i2;
            }
            if (z) {
                i3 = binarySearch;
            } else {
                i3 = i2;
            }
        }
        if (z2) {
            return Math.min(jArr.length - 1, i3);
        }
        return i3;
    }

    public static Drawable j0(Context context, Resources resources, @K60 int i2) {
        if (a >= 21) {
            return a.a(context, resources, i2);
        }
        return resources.getDrawable(i2);
    }

    public static long j1(long j2) {
        if (j2 != C10323vs.b && j2 != Long.MIN_VALUE) {
            return j2 * 1000;
        }
        return j2;
    }

    public static <T extends Comparable<? super T>> int k(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                binarySearch = i2;
            }
            if (z) {
                i3 = binarySearch;
            } else {
                i3 = i2;
            }
        }
        if (z2) {
            return Math.max(0, i3);
        }
        return i3;
    }

    @InterfaceC11300zs1
    public static UUID k0(String str) {
        String g2 = C8077mf.g(str);
        g2.getClass();
        char c2 = 65535;
        switch (g2.hashCode()) {
            case -1860423953:
                if (g2.equals("playready")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1400551171:
                if (g2.equals("widevine")) {
                    c2 = 1;
                    break;
                }
                break;
            case 790309106:
                if (g2.equals("clearkey")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return C10323vs.h2;
            case 1:
                return C10323vs.g2;
            case 2:
                return C10323vs.f2;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static ExecutorService k1(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.QD2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return TD2.d(str, runnable);
            }
        });
    }

    public static int l(C11106z41 c11106z41, long j2, boolean z, boolean z2) {
        int i2;
        int c2 = c11106z41.c() - 1;
        int i3 = 0;
        while (i3 <= c2) {
            int i4 = (i3 + c2) >>> 1;
            if (c11106z41.b(i4) < j2) {
                i3 = i4 + 1;
            } else {
                c2 = i4 - 1;
            }
        }
        if (z && (i2 = c2 + 1) < c11106z41.c() && c11106z41.b(i2) == j2) {
            return i2;
        }
        if (z2 && c2 == -1) {
            return 0;
        }
        return c2;
    }

    public static int l0(int i2) {
        if (i2 != 2 && i2 != 4) {
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
        return AD1.B1;
    }

    public static ScheduledExecutorService l1(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: o.ND2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return TD2.b(str, runnable);
            }
        });
    }

    public static int m(int[] iArr, int i2, boolean z, boolean z2) {
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

    public static int m0(@InterfaceC11300zs1 String str) {
        String[] J1;
        int length;
        boolean z;
        int i2 = 0;
        if (str == null || (length = (J1 = J1(str, CrashlyticsReportPersistence.m)).length) < 2) {
            return 0;
        }
        String str2 = J1[length - 1];
        if (length >= 3 && "neg".equals(J1[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            i2 = Integer.parseInt((String) C9542sf.g(str2));
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static String m1(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C10323vs.g1)) {
            str = replace;
        }
        String g2 = C8077mf.g(str);
        String str2 = K1(g2, "-")[0];
        if (n == null) {
            n = G();
        }
        String str3 = n.get(str2);
        if (str3 != null) {
            g2 = str3 + g2.substring(str2.length());
            str2 = str3;
        }
        if (!C3855Oo.b.equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return g2;
        }
        return d1(g2);
    }

    public static int n(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j2) {
                    break;
                }
                binarySearch = i2;
            }
            if (z) {
                i3 = binarySearch;
            } else {
                i3 = i2;
            }
        }
        if (z2) {
            return Math.max(0, i3);
        }
        return i3;
    }

    public static String n0(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return XH0.V;
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return XH0.W;
    }

    public static <T> T[] n1(T[] tArr, T t) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return (T[]) p(copyOf);
    }

    public static int o0(String str) {
        boolean z;
        int length = str.length();
        if (length <= 4) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 << 8) | str.charAt(i3);
        }
        return i2;
    }

    public static <T> T[] o1(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static String p0(Locale locale) {
        if (a >= 21) {
            return q0(locale);
        }
        return locale.toString();
    }

    public static <T> T[] p1(T[] tArr, int i2) {
        boolean z;
        if (i2 <= tArr.length) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static int q(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    @ES1(21)
    public static String q0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static <T> T[] q1(T[] tArr, int i2, int i3) {
        boolean z;
        boolean z2 = false;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (i3 <= tArr.length) {
            z2 = true;
        }
        C9542sf.a(z2);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static long r(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static int r0(Context context, String str, boolean z) {
        if (a >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return 5;
        }
        return 1;
    }

    public static <T> void r1(List<T> list, T[] tArr) {
        boolean z;
        if (list.size() == tArr.length) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        list.toArray(tArr);
    }

    public static boolean s(C8322nf1... c8322nf1Arr) {
        if (a < 24) {
            return true;
        }
        for (C8322nf1 c8322nf1 : c8322nf1Arr) {
            C8322nf1.h hVar = c8322nf1.Y;
            if (hVar != null) {
                if (Y0(hVar.X)) {
                    return false;
                }
                for (int i2 = 0; i2 < c8322nf1.Y.b1.size(); i2++) {
                    if (Y0(c8322nf1.Y.b1.get(i2).X)) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    public static long s0(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static long s1(String str) throws C3989Py1 {
        Matcher matcher = h.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(C5663cp2.a));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i2 != 0) {
                return timeInMillis - (i2 * 60000);
            }
            return timeInMillis;
        }
        throw C3989Py1.a("Invalid date/time format: " + str, null);
    }

    public static void t(@InterfaceC11300zs1 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long t0(long j2) {
        if (j2 == C10323vs.b) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j2;
    }

    public static long t1(String str) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        Matcher matcher = i.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d7 = 0.0d;
            if (group != null) {
                d2 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d2 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d3 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d3 = 0.0d;
            }
            double d8 = d2 + d3;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d4 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d4 = 0.0d;
            }
            double d9 = d8 + d4;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d5 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d5 = 0.0d;
            }
            double d10 = d9 + d5;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d6 = Double.parseDouble(group5) * 60.0d;
            } else {
                d6 = 0.0d;
            }
            double d11 = d10 + d6;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d7 = Double.parseDouble(group6);
            }
            long j2 = (long) ((d11 + d7) * 1000.0d);
            if (!isEmpty) {
                return -j2;
            }
            return j2;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static int u(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return 1;
    }

    public static int u0(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    if (i2 != 32) {
                        return 0;
                    }
                    return C10323vs.D;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static boolean u1(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static float v(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static C10833xx0 v0(int i2, int i3, int i4) {
        return new C10833xx0.b().g0(C4128Rj1.N).J(i3).h0(i4).a0(i2).G();
    }

    public static <T> InterfaceFutureC8411o11<T> v1(Handler handler, final Runnable runnable, final T t) {
        final D22 F = D22.F();
        u1(handler, new Runnable() { // from class: o.RD2
            @Override // java.lang.Runnable
            public final void run() {
                TD2.c(D22.this, runnable, t);
            }
        });
        return F;
    }

    public static int w(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int w0(int i2, int i3) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 268435456) {
                        if (i2 != 536870912) {
                            if (i2 != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i3 * 3;
                        }
                    }
                }
                return i3 * 4;
            }
            return i3;
        }
        return i3 * 2;
    }

    public static boolean w1(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static long x(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long x0(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 / f2);
    }

    public static void x1(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                x1(file2);
            }
        }
        file.delete();
    }

    public static boolean y(Object[] objArr, @InterfaceC11300zs1 Object obj) {
        for (Object obj2 : objArr) {
            if (g(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int y0(int i2) {
        if (i2 != 13) {
            switch (i2) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    @InterfaceC11300zs1
    public static Intent y1(Context context, @InterfaceC11300zs1 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (a < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return KD2.a(context, broadcastReceiver, intentFilter, 4);
    }

    public static int z(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = q[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static String z0(StringBuilder sb, Formatter formatter, long j2) {
        String str;
        if (j2 == C10323vs.b) {
            j2 = 0;
        }
        if (j2 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static <T> void z1(List<T> list, int i2, int i3) {
        if (i2 >= 0 && i3 <= list.size() && i2 <= i3) {
            if (i2 != i3) {
                list.subList(i2, i3).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T extends Throwable> void I1(Throwable th) throws Throwable {
        throw th;
    }

    @InterfaceC8557od0({"#1"})
    public static <T> T o(@InterfaceC11300zs1 T t) {
        return t;
    }

    @InterfaceC8557od0({"#1"})
    public static <T> T[] p(T[] tArr) {
        return tArr;
    }
}
