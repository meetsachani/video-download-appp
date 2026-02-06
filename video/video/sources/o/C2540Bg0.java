package o;

import android.os.Build;
import android.util.Pair;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C3686Mv;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: o.Bg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2540Bg0 {
    public static final String c = "ExifData";
    public static final boolean d = false;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final String f = "ExifIFDPointer";
    public static final String g = "GPSInfoIFDPointer";
    public static final String h = "InteroperabilityIFDPointer";
    public static final String i = "SubIFDPointer";
    public static final C3237Ig0[] j;
    public static final C3237Ig0[] k;
    public static final C3237Ig0[] l;
    public static final C3237Ig0[] m;
    public static final C3237Ig0[] n;

    /* renamed from: o  reason: collision with root package name */
    public static final C3237Ig0[][] f418o;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final HashSet<String> t;
    public static final int u = 1000;
    public final List<Map<String, C2442Ag0>> a;
    public final ByteOrder b;

    /* renamed from: o.Bg0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C3686Mv.e.values().length];
            a = iArr2;
            try {
                iArr2[C3686Mv.e.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C3686Mv.e.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C3686Mv.e.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.Bg0$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int f = 19;
        public final List<Map<String, C2442Ag0>> a = Collections.list(new C0163b());
        public final ByteOrder b;
        public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final List<HashMap<String, C3237Ig0>> g = Collections.list(new a());

        /* renamed from: o.Bg0$b$a */
        /* loaded from: classes.dex */
        public class a implements Enumeration<HashMap<String, C3237Ig0>> {
            public int a = 0;

            @Override // java.util.Enumeration
            /* renamed from: a */
            public HashMap<String, C3237Ig0> nextElement() {
                C3237Ig0[] c3237Ig0Arr;
                HashMap<String, C3237Ig0> hashMap = new HashMap<>();
                for (C3237Ig0 c3237Ig0 : C2540Bg0.f418o[this.a]) {
                    hashMap.put(c3237Ig0.b, c3237Ig0);
                }
                this.a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.a < C2540Bg0.f418o.length) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: o.Bg0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0163b implements Enumeration<Map<String, C2442Ag0>> {
            public int a = 0;

            public C0163b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, C2442Ag0> nextElement() {
                this.a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.a < C2540Bg0.f418o.length) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: o.Bg0$b$c */
        /* loaded from: classes.dex */
        public class c implements Enumeration<Map<String, C2442Ag0>> {
            public final Enumeration<Map<String, C2442Ag0>> a;

            public c() {
                this.a = Collections.enumeration(b.this.a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, C2442Ag0> nextElement() {
                return new HashMap(this.a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public static Pair<Integer, Integer> b(String str) {
            int intValue;
            int i;
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b = b(split[0]);
                if (((Integer) b.first).intValue() == 2) {
                    return b;
                }
                for (int i2 = 1; i2 < split.length; i2++) {
                    Pair<Integer, Integer> b2 = b(split[i2]);
                    if (!((Integer) b2.first).equals(b.first) && !((Integer) b2.second).equals(b.first)) {
                        intValue = -1;
                    } else {
                        intValue = ((Integer) b.first).intValue();
                    }
                    if (((Integer) b.second).intValue() != -1 && (((Integer) b2.first).equals(b.second) || ((Integer) b2.second).equals(b.second))) {
                        i = ((Integer) b.second).intValue();
                    } else {
                        i = -1;
                    }
                    if (intValue == -1 && i == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        b = new Pair<>(Integer.valueOf(i), -1);
                    } else if (i == -1) {
                        b = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return b;
            } else if (str.contains(RemoteSettings.i)) {
                String[] split2 = str.split(RemoteSettings.i, -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i3 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i3 >= 0 && parseLong <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return new Pair<>(3, 4);
                        }
                        if (i3 < 0) {
                            return new Pair<>(9, -1);
                        }
                        return new Pair<>(4, -1);
                    } catch (NumberFormatException unused2) {
                        Double.parseDouble(str);
                        return new Pair<>(12, -1);
                    }
                } catch (NumberFormatException unused3) {
                    return new Pair<>(2, -1);
                }
            }
        }

        public C2540Bg0 a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                e(C2638Cg0.w0, String.valueOf(0), list);
                e(C2638Cg0.b0, "0230", list);
                e(C2638Cg0.h0, "1,2,3,0", list);
                e(C2638Cg0.N0, String.valueOf(0), list);
                e(C2638Cg0.O0, String.valueOf(0), list);
                e(C2638Cg0.c0, "0100", list);
                e(C2638Cg0.W0, String.valueOf(2), list);
                e(C2638Cg0.a1, String.valueOf(3), list);
                e(C2638Cg0.b1, String.valueOf(1), list);
                e(C2638Cg0.d1, String.valueOf(0), list);
                e(C2638Cg0.i1, String.valueOf(0), list);
                e(C2638Cg0.k1, String.valueOf(0), list);
                e(C2638Cg0.l1, String.valueOf(0), list);
                e(C2638Cg0.m1, String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                e(C2638Cg0.x1, "2300", list);
                e(C2638Cg0.J1, "K", list);
                e(C2638Cg0.L1, "T", list);
                e(C2638Cg0.N1, "T", list);
                e(C2638Cg0.U1, "T", list);
                e(C2638Cg0.W1, "K", list);
            }
            return new C2540Bg0(this.b, list);
        }

        public b c(String str) {
            f(str, null, this.a);
            return this;
        }

        public b d(String str, String str2) {
            f(str, str2, this.a);
            return this;
        }

        public final void e(String str, String str2, List<Map<String, C2442Ag0>> list) {
            for (Map<String, C2442Ag0> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            f(str, str2, list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x018c, code lost:
            if (r7 != r0) goto L100;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void f(String str, String str2, List<Map<String, C2442Ag0>> list) {
            int i;
            int i2;
            Matcher matcher;
            b bVar = this;
            String str3 = str;
            String str4 = str2;
            if ((C2638Cg0.U.equals(str3) || C2638Cg0.m0.equals(str3) || C2638Cg0.n0.equals(str3)) && str4 != null) {
                boolean find = d.matcher(str4).find();
                boolean find2 = e.matcher(str4).find();
                if (str4.length() != 19 || (!find && !find2)) {
                    C7433k41.p(C2540Bg0.c, "Invalid value for " + str3 + " : " + str4);
                    return;
                } else if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            }
            if (C2638Cg0.y0.equals(str3)) {
                str3 = C2638Cg0.z0;
            }
            String str5 = str3;
            int i3 = 2;
            int i4 = 1;
            if (str4 != null && C2540Bg0.t.contains(str5)) {
                if (str5.equals(C2638Cg0.E1)) {
                    if (!c.matcher(str4).find()) {
                        C7433k41.p(C2540Bg0.c, "Invalid value for " + str5 + " : " + str4);
                        return;
                    }
                    str4 = Integer.parseInt((String) C10907yF1.l(matcher.group(1))) + "/1," + Integer.parseInt((String) C10907yF1.l(matcher.group(2))) + "/1," + Integer.parseInt((String) C10907yF1.l(matcher.group(3))) + "/1";
                } else {
                    try {
                        str4 = new X41(Double.parseDouble(str4)).toString();
                    } catch (NumberFormatException e2) {
                        C7433k41.q(C2540Bg0.c, "Invalid value for " + str5 + " : " + str4, e2);
                        return;
                    }
                }
            }
            int i5 = 0;
            while (i5 < C2540Bg0.f418o.length) {
                C3237Ig0 c3237Ig0 = g.get(i5).get(str5);
                if (c3237Ig0 != null) {
                    if (str4 == null) {
                        list.get(i5).remove(str5);
                    } else {
                        Pair<Integer, Integer> b = b(str4);
                        int i6 = -1;
                        if (c3237Ig0.c != ((Integer) b.first).intValue() && c3237Ig0.c != ((Integer) b.second).intValue()) {
                            int i7 = c3237Ig0.d;
                            if (i7 != -1 && (i7 == ((Integer) b.first).intValue() || c3237Ig0.d == ((Integer) b.second).intValue())) {
                                i2 = c3237Ig0.d;
                            } else {
                                i2 = c3237Ig0.c;
                                if (i2 != i4) {
                                    if (i2 != 7) {
                                    }
                                }
                            }
                        } else {
                            i2 = c3237Ig0.c;
                        }
                        String str6 = RemoteSettings.i;
                        switch (i2) {
                            case 1:
                                i = i4;
                                list.get(i5).put(str5, C2442Ag0.a(str4));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 2:
                            case 7:
                                i = i4;
                                list.get(i5).put(str5, C2442Ag0.h(str4));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 3:
                                i = i4;
                                String[] split = str4.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i8 = 0; i8 < split.length; i8++) {
                                    iArr[i8] = Integer.parseInt(split[i8]);
                                }
                                list.get(i5).put(str5, C2442Ag0.n(iArr, bVar.b));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 4:
                                i = i4;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i9 = 0; i9 < split2.length; i9++) {
                                    jArr[i9] = Long.parseLong(split2[i9]);
                                }
                                list.get(i5).put(str5, C2442Ag0.j(jArr, bVar.b));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 5:
                                i = i4;
                                int i10 = -1;
                                String[] split3 = str4.split(",", -1);
                                X41[] x41Arr = new X41[split3.length];
                                int i11 = 0;
                                while (i11 < split3.length) {
                                    String[] split4 = split3[i11].split(RemoteSettings.i, i10);
                                    x41Arr[i11] = new X41((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[i]));
                                    i11++;
                                    i10 = -1;
                                }
                                bVar = this;
                                list.get(i5).put(str5, C2442Ag0.l(x41Arr, bVar.b));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 9:
                                i = i4;
                                String[] split5 = str4.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i12 = 0; i12 < split5.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(split5[i12]);
                                }
                                list.get(i5).put(str5, C2442Ag0.e(iArr2, bVar.b));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 10:
                                String[] split6 = str4.split(",", -1);
                                X41[] x41Arr2 = new X41[split6.length];
                                int i13 = 0;
                                while (i13 < split6.length) {
                                    String[] split7 = split6[i13].split(str6, i6);
                                    int i14 = i4;
                                    x41Arr2[i13] = new X41((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i14]));
                                    i13++;
                                    i4 = i14;
                                    str6 = str6;
                                    i6 = -1;
                                }
                                i = i4;
                                list.get(i5).put(str5, C2442Ag0.g(x41Arr2, bVar.b));
                                continue;
                                i5++;
                                i4 = i;
                                i3 = 2;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i15 = 0; i15 < split8.length; i15++) {
                                    dArr[i15] = Double.parseDouble(split8[i15]);
                                }
                                list.get(i5).put(str5, C2442Ag0.c(dArr, bVar.b));
                                break;
                        }
                    }
                }
                i = i4;
                i5++;
                i4 = i;
                i3 = 2;
            }
        }

        public b g(long j) {
            return d(C2638Cg0.u0, String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b h(C3686Mv.e eVar) {
            int i;
            if (eVar == C3686Mv.e.UNKNOWN) {
                return this;
            }
            int i2 = a.a[eVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C7433k41.p(C2540Bg0.c, "Unknown flash state: " + eVar);
                        return this;
                    }
                    i = 1;
                } else {
                    i = 32;
                }
            } else {
                i = 0;
            }
            if ((i & 1) == 1) {
                d(C2638Cg0.O0, String.valueOf(4));
            }
            return d(C2638Cg0.P0, String.valueOf(i));
        }

        public b i(float f2) {
            return d(C2638Cg0.R0, new X41(f2 * 1000.0f, 1000L).toString());
        }

        public b j(int i) {
            return d(C2638Cg0.y, String.valueOf(i));
        }

        public b k(int i) {
            return d(C2638Cg0.x, String.valueOf(i));
        }

        public b l(int i) {
            return d(C2638Cg0.B0, String.valueOf(3)).d(C2638Cg0.z0, String.valueOf(Math.min(65535, i)));
        }

        public b m(float f2) {
            return d(C2638Cg0.v0, String.valueOf(f2));
        }

        public b n(int i) {
            int i2;
            if (i != 0) {
                if (i != 90) {
                    if (i != 180) {
                        if (i != 270) {
                            C7433k41.p(C2540Bg0.c, "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 1;
            }
            return d(C2638Cg0.C, String.valueOf(i2));
        }

        public b o(c cVar) {
            String valueOf;
            int i = a.b[cVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(1);
                }
            } else {
                valueOf = String.valueOf(0);
            }
            return d(C2638Cg0.f1, valueOf);
        }
    }

    /* renamed from: o.Bg0$c */
    /* loaded from: classes.dex */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        C3237Ig0[] c3237Ig0Arr = {new C3237Ig0(C2638Cg0.x, 256, 3, 4), new C3237Ig0(C2638Cg0.y, 257, 3, 4), new C3237Ig0(C2638Cg0.W, 271, 2), new C3237Ig0(C2638Cg0.X, 272, 2), new C3237Ig0(C2638Cg0.C, C9276rZ.q, 3), new C3237Ig0(C2638Cg0.H, 282, 5), new C3237Ig0(C2638Cg0.I, 283, 5), new C3237Ig0(C2638Cg0.J, 296, 3), new C3237Ig0(C2638Cg0.Y, 305, 2), new C3237Ig0(C2638Cg0.U, 306, 2), new C3237Ig0(C2638Cg0.G, 531, 3), new C3237Ig0("SubIFDPointer", 330, 4), new C3237Ig0("ExifIFDPointer", 34665, 4), new C3237Ig0("GPSInfoIFDPointer", 34853, 4)};
        j = c3237Ig0Arr;
        C3237Ig0[] c3237Ig0Arr2 = {new C3237Ig0(C2638Cg0.u0, 33434, 5), new C3237Ig0(C2638Cg0.v0, 33437, 5), new C3237Ig0(C2638Cg0.w0, 34850, 3), new C3237Ig0(C2638Cg0.z0, 34855, 3), new C3237Ig0(C2638Cg0.B0, 34864, 3), new C3237Ig0(C2638Cg0.b0, 36864, 2), new C3237Ig0(C2638Cg0.m0, 36867, 2), new C3237Ig0(C2638Cg0.n0, 36868, 2), new C3237Ig0(C2638Cg0.h0, 37121, 7), new C3237Ig0(C2638Cg0.H0, 37377, 10), new C3237Ig0(C2638Cg0.I0, 37378, 5), new C3237Ig0(C2638Cg0.J0, 37379, 10), new C3237Ig0(C2638Cg0.K0, 37380, 10), new C3237Ig0(C2638Cg0.L0, 37381, 5), new C3237Ig0(C2638Cg0.N0, 37383, 3), new C3237Ig0(C2638Cg0.O0, 37384, 3), new C3237Ig0(C2638Cg0.P0, 37385, 3), new C3237Ig0(C2638Cg0.R0, 37386, 5), new C3237Ig0(C2638Cg0.r0, 37520, 2), new C3237Ig0(C2638Cg0.s0, 37521, 2), new C3237Ig0(C2638Cg0.t0, 37522, 2), new C3237Ig0(C2638Cg0.c0, 40960, 7), new C3237Ig0(C2638Cg0.d0, 40961, 3), new C3237Ig0(C2638Cg0.f0, 40962, 3, 4), new C3237Ig0(C2638Cg0.g0, 40963, 3, 4), new C3237Ig0("InteroperabilityIFDPointer", 40965, 4), new C3237Ig0(C2638Cg0.W0, 41488, 3), new C3237Ig0(C2638Cg0.Z0, 41495, 3), new C3237Ig0(C2638Cg0.a1, 41728, 7), new C3237Ig0(C2638Cg0.b1, 41729, 7), new C3237Ig0(C2638Cg0.d1, 41985, 3), new C3237Ig0(C2638Cg0.e1, 41986, 3), new C3237Ig0(C2638Cg0.f1, 41987, 3), new C3237Ig0(C2638Cg0.i1, 41990, 3), new C3237Ig0(C2638Cg0.k1, 41992, 3), new C3237Ig0(C2638Cg0.l1, 41993, 3), new C3237Ig0(C2638Cg0.m1, 41994, 3)};
        k = c3237Ig0Arr2;
        C3237Ig0[] c3237Ig0Arr3 = {new C3237Ig0(C2638Cg0.x1, 0, 1), new C3237Ig0(C2638Cg0.y1, 1, 2), new C3237Ig0(C2638Cg0.z1, 2, 5, 10), new C3237Ig0(C2638Cg0.A1, 3, 2), new C3237Ig0(C2638Cg0.B1, 4, 5, 10), new C3237Ig0(C2638Cg0.C1, 5, 1), new C3237Ig0(C2638Cg0.D1, 6, 5), new C3237Ig0(C2638Cg0.E1, 7, 5), new C3237Ig0(C2638Cg0.J1, 12, 2), new C3237Ig0(C2638Cg0.L1, 14, 2), new C3237Ig0(C2638Cg0.N1, 16, 2), new C3237Ig0(C2638Cg0.U1, 23, 2), new C3237Ig0(C2638Cg0.W1, 25, 2)};
        l = c3237Ig0Arr3;
        m = new C3237Ig0[]{new C3237Ig0("SubIFDPointer", 330, 4), new C3237Ig0("ExifIFDPointer", 34665, 4), new C3237Ig0("GPSInfoIFDPointer", 34853, 4), new C3237Ig0("InteroperabilityIFDPointer", 40965, 4)};
        C3237Ig0[] c3237Ig0Arr4 = {new C3237Ig0(C2638Cg0.d2, 1, 2)};
        n = c3237Ig0Arr4;
        f418o = new C3237Ig0[][]{c3237Ig0Arr, c3237Ig0Arr2, c3237Ig0Arr3, c3237Ig0Arr4};
        t = new HashSet<>(Arrays.asList(C2638Cg0.v0, C2638Cg0.u0, C2638Cg0.E1));
    }

    public C2540Bg0(ByteOrder byteOrder, List<Map<String, C2442Ag0>> list) {
        boolean z;
        if (list.size() == f418o.length) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Malformed attributes list. Number of IFDs mismatch.");
        this.b = byteOrder;
        this.a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).d(C2638Cg0.C, String.valueOf(1)).d(C2638Cg0.H, "72/1").d(C2638Cg0.I, "72/1").d(C2638Cg0.J, String.valueOf(2)).d(C2638Cg0.G, String.valueOf(1)).d(C2638Cg0.W, Build.MANUFACTURER).d(C2638Cg0.X, Build.MODEL);
    }

    public static C2540Bg0 b(androidx.camera.core.g gVar, int i2) {
        b a2 = a();
        if (gVar.I4() != null) {
            gVar.I4().b(a2);
        }
        a2.n(i2);
        return a2.k(gVar.getWidth()).j(gVar.getHeight()).a();
    }

    public String c(String str) {
        C2442Ag0 f2 = f(str);
        if (f2 != null) {
            if (!t.contains(str)) {
                return f2.q(this.b);
            }
            if (str.equals(C2638Cg0.E1)) {
                int i2 = f2.a;
                if (i2 != 5 && i2 != 10) {
                    C7433k41.p(c, "GPS Timestamp format is not rational. format=" + f2.a);
                    return null;
                }
                X41[] x41Arr = (X41[]) f2.r(this.b);
                if (x41Arr != null && x41Arr.length == 3) {
                    return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (((float) x41Arr[0].b()) / ((float) x41Arr[0].a()))), Integer.valueOf((int) (((float) x41Arr[1].b()) / ((float) x41Arr[1].a()))), Integer.valueOf((int) (((float) x41Arr[2].b()) / ((float) x41Arr[2].a()))));
                }
                C7433k41.p(c, "Invalid GPS Timestamp array. array=" + Arrays.toString(x41Arr));
                return null;
            }
            try {
                return Double.toString(f2.o(this.b));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public Map<String, C2442Ag0> d(int i2) {
        int length = f418o.length;
        C10907yF1.g(i2, 0, length, "Invalid IFD index: " + i2 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.a.get(i2);
    }

    public ByteOrder e() {
        return this.b;
    }

    public final C2442Ag0 f(String str) {
        if (C2638Cg0.y0.equals(str)) {
            str = C2638Cg0.z0;
        }
        for (int i2 = 0; i2 < f418o.length; i2++) {
            C2442Ag0 c2442Ag0 = this.a.get(i2).get(str);
            if (c2442Ag0 != null) {
                return c2442Ag0;
            }
        }
        return null;
    }
}
