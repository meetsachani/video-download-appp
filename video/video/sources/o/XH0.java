package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10833xx0;
import o.C4086Qy1;
import o.C4224Si1;
import o.C6263fI0;
import o.C6960i70;
import o.UH0;
import o.VH0;

@Deprecated
/* loaded from: classes2.dex */
public final class XH0 implements C4086Qy1.a<WH0> {
    public static final String A = "#EXT-X-SESSION-KEY";
    public static final String B = "#EXT-X-BYTERANGE";
    public static final String C = "#EXT-X-GAP";
    public static final String D = "#EXT-X-SKIP";
    public static final String E = "#EXT-X-PRELOAD-HINT";
    public static final String F = "#EXT-X-RENDITION-REPORT";
    public static final String G = "AUDIO";
    public static final String H = "VIDEO";
    public static final String I = "SUBTITLES";
    public static final String J = "CLOSED-CAPTIONS";
    public static final String K = "PART";
    public static final String L = "MAP";
    public static final String M = "NONE";
    public static final String N = "AES-128";
    public static final String O = "SAMPLE-AES";
    public static final String P = "SAMPLE-AES-CENC";
    public static final String Q = "SAMPLE-AES-CTR";
    public static final String R = "com.microsoft.playready";
    public static final String S = "identity";
    public static final String T = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    public static final String U = "com.widevine";
    public static final String V = "YES";
    public static final String W = "NO";
    public static final String X = "CLOSED-CAPTIONS=NONE";
    public static final String c = "HlsPlaylistParser";
    public static final String d = "#EXTM3U";
    public static final String e = "#EXT";
    public static final String f = "#EXT-X-VERSION";
    public static final String g = "#EXT-X-PLAYLIST-TYPE";
    public static final String h = "#EXT-X-DEFINE";
    public static final String i = "#EXT-X-SERVER-CONTROL";
    public static final String j = "#EXT-X-STREAM-INF";
    public static final String k = "#EXT-X-PART-INF";
    public static final String l = "#EXT-X-PART";
    public static final String m = "#EXT-X-I-FRAME-STREAM-INF";
    public static final String n = "#EXT-X-I-FRAMES-ONLY";

    /* renamed from: o  reason: collision with root package name */
    public static final String f659o = "#EXT-X-MEDIA";
    public static final String p = "#EXT-X-TARGETDURATION";
    public static final String q = "#EXT-X-DISCONTINUITY";
    public static final String r = "#EXT-X-DISCONTINUITY-SEQUENCE";
    public static final String s = "#EXT-X-PROGRAM-DATE-TIME";
    public static final String t = "#EXT-X-MAP";
    public static final String u = "#EXT-X-INDEPENDENT-SEGMENTS";
    public static final String v = "#EXTINF";
    public static final String w = "#EXT-X-MEDIA-SEQUENCE";
    public static final String x = "#EXT-X-START";
    public static final String y = "#EXT-X-ENDLIST";
    public static final String z = "#EXT-X-KEY";
    public final VH0 a;
    @InterfaceC11300zs1
    public final UH0 b;
    public static final Pattern Y = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern c0 = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern d0 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern f0 = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern g0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern h0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern i0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern j0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern k0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern l0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern m0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern n0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern o0 = c("CAN-SKIP-DATERANGES");
    public static final Pattern p0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern q0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern r0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern s0 = c("CAN-BLOCK-RELOAD");
    public static final Pattern t0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern u0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern v0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern w0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern x0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern y0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern z0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern A0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern B0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern C0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern D0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern E0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern F0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern G0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern H0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern I0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern J0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern K0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern L0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern M0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern N0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern O0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern P0 = c("AUTOSELECT");
    public static final Pattern Q0 = c("DEFAULT");
    public static final Pattern R0 = c("FORCED");
    public static final Pattern S0 = c("INDEPENDENT");
    public static final Pattern T0 = c("GAP");
    public static final Pattern U0 = c("PRECISE");
    public static final Pattern V0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern W0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern X0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* loaded from: classes2.dex */
    public static final class a extends IOException {
    }

    /* loaded from: classes2.dex */
    public static class b {
        public final BufferedReader a;
        public final Queue<String> b;
        @InterfaceC11300zs1
        public String c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        @InterfaceC8800pd0(expression = {"next"}, result = true)
        public boolean a() throws IOException {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) C9542sf.g(this.b.poll());
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.c = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.c;
                this.c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public XH0() {
        this(VH0.n, null);
    }

    public static long A(String str, Pattern pattern) throws C3989Py1 {
        return new BigDecimal(z(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String B(String str, Map<String, String> map) {
        Matcher matcher = X0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int C(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !TD2.V0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (C2 != d.charAt(i2)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return TD2.V0(C(bufferedReader, false, C2));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(" + W + "|" + V + C9811tl1.d);
    }

    public static C6960i70 d(@InterfaceC11300zs1 String str, C6960i70.b[] bVarArr) {
        C6960i70.b[] bVarArr2 = new C6960i70.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = bVarArr[i2].b(null);
        }
        return new C6960i70(str, bVarArr2);
    }

    @InterfaceC11300zs1
    public static String e(long j2, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str == null) {
            return null;
        }
        if (str2 != null) {
            return str2;
        }
        return Long.toHexString(j2);
    }

    @InterfaceC11300zs1
    public static VH0.b f(ArrayList<VH0.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            VH0.b bVar = arrayList.get(i2);
            if (str.equals(bVar.d)) {
                return bVar;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static VH0.b g(ArrayList<VH0.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            VH0.b bVar = arrayList.get(i2);
            if (str.equals(bVar.e)) {
                return bVar;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static VH0.b h(ArrayList<VH0.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            VH0.b bVar = arrayList.get(i2);
            if (str.equals(bVar.c)) {
                return bVar;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) throws C3989Py1 {
        return Double.parseDouble(z(str, pattern, Collections.EMPTY_MAP));
    }

    @InterfaceC11300zs1
    public static C6960i70.b k(String str, String str2, Map<String, String> map) throws C3989Py1 {
        String u2 = u(str, F0, "1", map);
        if (T.equals(str2)) {
            String z2 = z(str, G0, map);
            return new C6960i70.b(C10323vs.g2, C4128Rj1.f, Base64.decode(z2.substring(z2.indexOf(44)), 0));
        } else if (U.equals(str2)) {
            return new C6960i70.b(C10323vs.g2, "hls", TD2.G0(str));
        } else {
            if (R.equals(str2) && "1".equals(u2)) {
                String z3 = z(str, G0, map);
                byte[] decode = Base64.decode(z3.substring(z3.indexOf(44)), 0);
                UUID uuid = C10323vs.h2;
                return new C6960i70.b(uuid, C4128Rj1.f, DK1.a(uuid, decode));
            }
            return null;
        }
    }

    public static String l(String str) {
        if (!P.equals(str) && !Q.equals(str)) {
            return C10323vs.c2;
        }
        return "cenc";
    }

    public static int m(String str, Pattern pattern) throws C3989Py1 {
        return Integer.parseInt(z(str, pattern, Collections.EMPTY_MAP));
    }

    public static long n(String str, Pattern pattern) throws C3989Py1 {
        return Long.parseLong(z(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0647  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UH0 o(VH0 vh0, @InterfaceC11300zs1 UH0 uh0, b bVar, String str) throws IOException {
        boolean z2;
        List<UH0.b> list;
        UH0.g gVar;
        long j2;
        TreeMap treeMap;
        long j3;
        String str2;
        UH0.e eVar;
        int i2;
        long j4;
        long j5;
        long j6;
        boolean z3;
        long j7;
        boolean z4;
        long j8;
        long j9;
        long j10;
        UH0.e eVar2;
        long j11;
        boolean z5;
        C6960i70 c6960i70;
        C6960i70 c6960i702;
        UH0.e eVar3;
        VH0 vh02 = vh0;
        UH0 uh02 = uh0;
        boolean z6 = vh02.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        UH0.g gVar2 = new UH0.g(C10323vs.b, false, C10323vs.b, C10323vs.b, false);
        TreeMap treeMap2 = new TreeMap();
        boolean z7 = z6;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        String str3 = "";
        String str4 = str3;
        boolean z8 = false;
        String str5 = null;
        C6960i70 c6960i703 = null;
        UH0.b bVar2 = null;
        int i3 = 0;
        boolean z9 = false;
        C6960i70 c6960i704 = null;
        String str6 = null;
        long j21 = -1;
        boolean z10 = false;
        boolean z11 = false;
        int i4 = 0;
        UH0.e eVar4 = null;
        int i5 = 0;
        String str7 = null;
        long j22 = -1;
        boolean z12 = false;
        long j23 = -9223372036854775807L;
        long j24 = 0;
        int i6 = 1;
        while (bVar.a()) {
            String b2 = bVar.b();
            if (b2.startsWith(e)) {
                arrayList4.add(b2);
            }
            if (b2.startsWith(g)) {
                String z13 = z(b2, m0, hashMap);
                if ("VOD".equals(z13)) {
                    i3 = 1;
                } else if ("EVENT".equals(z13)) {
                    i3 = 2;
                }
            } else if (b2.equals(n)) {
                z12 = true;
            } else {
                if (b2.startsWith(x)) {
                    ArrayList arrayList5 = arrayList4;
                    gVar = gVar2;
                    long j25 = (long) (j(b2, y0) * 1000000.0d);
                    z8 = q(b2, U0, false);
                    arrayList4 = arrayList5;
                    j12 = j25;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    gVar = gVar2;
                    if (b2.startsWith(i)) {
                        gVar2 = y(b2);
                        arrayList4 = arrayList6;
                    } else if (b2.startsWith(k)) {
                        j13 = (long) (j(b2, k0) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (b2.startsWith(t)) {
                        String z14 = z(b2, G0, hashMap);
                        boolean z15 = z8;
                        String v2 = v(b2, A0, hashMap);
                        if (v2 != null) {
                            String[] J1 = TD2.J1(v2, "@");
                            j21 = Long.parseLong(J1[0]);
                            if (J1.length > 1) {
                                j14 = Long.parseLong(J1[1]);
                            }
                        }
                        long j26 = j21;
                        int i7 = (j26 > j22 ? 1 : (j26 == j22 ? 0 : -1));
                        if (i7 == 0) {
                            j2 = 0;
                        } else {
                            j2 = j14;
                        }
                        if (str7 != null && str6 == null) {
                            throw C3989Py1.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        UH0.e eVar5 = new UH0.e(z14, j2, j26, str7, str6);
                        String str8 = str6;
                        if (i7 != 0) {
                            j2 += j26;
                        }
                        str6 = str8;
                        arrayList4 = arrayList6;
                        eVar4 = eVar5;
                        j14 = j2;
                        j21 = j22;
                        gVar2 = gVar;
                        z8 = z15;
                    } else {
                        boolean z16 = z8;
                        String str9 = str6;
                        String str10 = str7;
                        if (b2.startsWith(p)) {
                            j23 = 1000000 * m(b2, i0);
                        } else if (b2.startsWith(w)) {
                            j18 = n(b2, t0);
                            str7 = str10;
                            str6 = str9;
                            j24 = j18;
                            gVar2 = gVar;
                            z8 = z16;
                            arrayList4 = arrayList6;
                        } else if (b2.startsWith(f)) {
                            i6 = m(b2, l0);
                        } else {
                            if (b2.startsWith(h)) {
                                String v3 = v(b2, W0, hashMap);
                                if (v3 != null) {
                                    String str11 = vh02.l.get(v3);
                                    if (str11 != null) {
                                        hashMap.put(v3, str11);
                                    }
                                } else {
                                    hashMap.put(z(b2, L0, hashMap), z(b2, V0, hashMap));
                                }
                                treeMap = treeMap2;
                                j3 = j15;
                                str2 = str4;
                            } else if (b2.startsWith(v)) {
                                j19 = A(b2, u0);
                                str3 = u(b2, v0, str4, hashMap);
                            } else {
                                String str12 = str4;
                                if (b2.startsWith(D)) {
                                    int m2 = m(b2, p0);
                                    if (uh02 != null && arrayList.isEmpty()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    C9542sf.i(z3);
                                    str2 = str12;
                                    int i8 = (int) (j24 - ((UH0) TD2.o(uh02)).k);
                                    int i9 = m2 + i8;
                                    if (i8 >= 0 && i9 <= uh02.r.size()) {
                                        str7 = str10;
                                        str6 = str9;
                                        long j27 = j15;
                                        while (i8 < i9) {
                                            UH0.e eVar6 = uh02.r.get(i8);
                                            int i10 = i8;
                                            if (j24 != uh02.k) {
                                                eVar6 = eVar6.g(j27, (uh02.j - i4) + eVar6.Y0);
                                            }
                                            arrayList.add(eVar6);
                                            j17 = j27 + eVar6.Z;
                                            long j28 = eVar6.e1;
                                            if (j28 != j22) {
                                                j14 = eVar6.d1 + j28;
                                            }
                                            int i11 = eVar6.Y0;
                                            UH0.e eVar7 = eVar6.Y;
                                            c6960i703 = eVar6.a1;
                                            String str13 = eVar6.b1;
                                            String str14 = eVar6.c1;
                                            int i12 = i9;
                                            if (str14 == null || !str14.equals(Long.toHexString(j18))) {
                                                str6 = eVar6.c1;
                                            }
                                            j18++;
                                            i5 = i11;
                                            eVar4 = eVar7;
                                            str7 = str13;
                                            j27 = j17;
                                            i8 = i10 + 1;
                                            i9 = i12;
                                        }
                                        vh02 = vh0;
                                        j15 = j27;
                                    } else {
                                        throw new a();
                                    }
                                } else {
                                    str2 = str12;
                                    if (b2.startsWith(z)) {
                                        String z17 = z(b2, D0, hashMap);
                                        String u2 = u(b2, E0, S, hashMap);
                                        if (M.equals(z17)) {
                                            treeMap2.clear();
                                            c6960i703 = null;
                                            str6 = null;
                                            str7 = null;
                                        } else {
                                            String v4 = v(b2, H0, hashMap);
                                            if (S.equals(u2)) {
                                                if (N.equals(z17)) {
                                                    str7 = z(b2, G0, hashMap);
                                                    str6 = v4;
                                                }
                                                str6 = v4;
                                                str7 = null;
                                            } else {
                                                if (str5 == null) {
                                                    str5 = l(z17);
                                                }
                                                C6960i70.b k2 = k(b2, u2, hashMap);
                                                if (k2 != null) {
                                                    treeMap2.put(u2, k2);
                                                    str6 = v4;
                                                    c6960i703 = null;
                                                    str7 = null;
                                                }
                                                str6 = v4;
                                                str7 = null;
                                            }
                                        }
                                        vh02 = vh0;
                                    } else {
                                        if (b2.startsWith(B)) {
                                            String[] J12 = TD2.J1(z(b2, z0, hashMap), "@");
                                            j21 = Long.parseLong(J12[0]);
                                            if (J12.length > 1) {
                                                j14 = Long.parseLong(J12[1]);
                                            }
                                        } else if (b2.startsWith(r)) {
                                            i4 = Integer.parseInt(b2.substring(b2.indexOf(58) + 1));
                                            vh02 = vh0;
                                            str7 = str10;
                                            str6 = str9;
                                            gVar2 = gVar;
                                            z8 = z16;
                                            arrayList4 = arrayList6;
                                            str4 = str2;
                                            z11 = true;
                                        } else if (b2.equals(q)) {
                                            i5++;
                                        } else {
                                            if (b2.startsWith(s)) {
                                                if (j16 == 0) {
                                                    j16 = TD2.j1(TD2.s1(b2.substring(b2.indexOf(58) + 1))) - j15;
                                                } else {
                                                    treeMap = treeMap2;
                                                }
                                            } else if (b2.equals(C)) {
                                                vh02 = vh0;
                                                str7 = str10;
                                                str6 = str9;
                                                gVar2 = gVar;
                                                z8 = z16;
                                                arrayList4 = arrayList6;
                                                str4 = str2;
                                                z10 = true;
                                            } else if (b2.equals(u)) {
                                                vh02 = vh0;
                                                str7 = str10;
                                                str6 = str9;
                                                gVar2 = gVar;
                                                z8 = z16;
                                                arrayList4 = arrayList6;
                                                str4 = str2;
                                                z7 = true;
                                            } else if (b2.equals(y)) {
                                                vh02 = vh0;
                                                str7 = str10;
                                                str6 = str9;
                                                gVar2 = gVar;
                                                z8 = z16;
                                                arrayList4 = arrayList6;
                                                str4 = str2;
                                                z9 = true;
                                            } else if (b2.startsWith(F)) {
                                                treeMap = treeMap2;
                                                arrayList3.add(new UH0.d(Uri.parse(RC2.e(str, z(b2, G0, hashMap))), t(b2, w0, j22), s(b2, x0, -1)));
                                            } else {
                                                treeMap = treeMap2;
                                                if (b2.startsWith(E)) {
                                                    if (bVar2 == null && K.equals(z(b2, J0, hashMap))) {
                                                        String z18 = z(b2, G0, hashMap);
                                                        long t2 = t(b2, B0, -1L);
                                                        long t3 = t(b2, C0, -1L);
                                                        long j29 = j18;
                                                        String e2 = e(j29, str10, str9);
                                                        if (c6960i703 == null && !treeMap.isEmpty()) {
                                                            C6960i70.b[] bVarArr = (C6960i70.b[]) treeMap.values().toArray(new C6960i70.b[0]);
                                                            c6960i703 = new C6960i70(str5, bVarArr);
                                                            if (c6960i704 == null) {
                                                                c6960i704 = d(str5, bVarArr);
                                                            }
                                                        }
                                                        C6960i70 c6960i705 = c6960i703;
                                                        int i13 = (t2 > (-1L) ? 1 : (t2 == (-1L) ? 0 : -1));
                                                        if (i13 == 0 || t3 != -1) {
                                                            if (i13 != 0) {
                                                                j7 = t2;
                                                            } else {
                                                                j7 = 0;
                                                            }
                                                            bVar2 = new UH0.b(z18, eVar4, 0L, i5, j17, c6960i705, str10, e2, j7, t3, false, false, true);
                                                        }
                                                        vh02 = vh0;
                                                        uh02 = uh0;
                                                        str7 = str10;
                                                        str6 = str9;
                                                        j18 = j29;
                                                        c6960i703 = c6960i705;
                                                        gVar2 = gVar;
                                                        z8 = z16;
                                                        arrayList4 = arrayList6;
                                                        str4 = str2;
                                                        treeMap2 = treeMap;
                                                        j22 = -1;
                                                    }
                                                } else {
                                                    j4 = j18;
                                                    if (b2.startsWith(l)) {
                                                        String e3 = e(j4, str10, str9);
                                                        String z19 = z(b2, G0, hashMap);
                                                        long j30 = (long) (j(b2, j0) * 1000000.0d);
                                                        boolean q2 = q(b2, S0, false);
                                                        if (z7 && arrayList2.isEmpty()) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        boolean z20 = q2 | z4;
                                                        boolean q3 = q(b2, T0, false);
                                                        String v5 = v(b2, A0, hashMap);
                                                        if (v5 != null) {
                                                            String[] J13 = TD2.J1(v5, "@");
                                                            long parseLong = Long.parseLong(J13[0]);
                                                            if (J13.length > 1) {
                                                                j20 = Long.parseLong(J13[1]);
                                                            }
                                                            j8 = parseLong;
                                                        } else {
                                                            j8 = -1;
                                                        }
                                                        int i14 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
                                                        if (i14 == 0) {
                                                            j9 = 0;
                                                        } else {
                                                            j9 = j20;
                                                        }
                                                        if (c6960i703 == null && !treeMap.isEmpty()) {
                                                            C6960i70.b[] bVarArr2 = (C6960i70.b[]) treeMap.values().toArray(new C6960i70.b[0]);
                                                            c6960i703 = new C6960i70(str5, bVarArr2);
                                                            if (c6960i704 == null) {
                                                                c6960i704 = d(str5, bVarArr2);
                                                            }
                                                        }
                                                        C6960i70 c6960i706 = c6960i703;
                                                        UH0.e eVar8 = eVar4;
                                                        int i15 = i5;
                                                        arrayList2.add(new UH0.b(z19, eVar4, j30, i5, j17, c6960i706, str10, e3, j9, j8, q3, z20, false));
                                                        j17 += j30;
                                                        if (i14 != 0) {
                                                            j9 += j8;
                                                        }
                                                        j20 = j9;
                                                        vh02 = vh0;
                                                        eVar4 = eVar8;
                                                        str7 = str10;
                                                        str6 = str9;
                                                        j18 = j4;
                                                        i5 = i15;
                                                        c6960i703 = c6960i706;
                                                        gVar2 = gVar;
                                                        z8 = z16;
                                                        arrayList4 = arrayList6;
                                                        str4 = str2;
                                                        treeMap2 = treeMap;
                                                    } else {
                                                        eVar = eVar4;
                                                        i2 = i5;
                                                        if (!b2.startsWith("#")) {
                                                            long j31 = j15;
                                                            String e4 = e(j4, str10, str9);
                                                            j18 = j4 + 1;
                                                            String B2 = B(b2, hashMap);
                                                            UH0.e eVar9 = (UH0.e) hashMap2.get(B2);
                                                            int i16 = (j21 > (-1L) ? 1 : (j21 == (-1L) ? 0 : -1));
                                                            if (i16 == 0) {
                                                                eVar2 = eVar9;
                                                                j11 = 0;
                                                            } else {
                                                                if (z12 && eVar == null && eVar9 == null) {
                                                                    j10 = j14;
                                                                    eVar9 = new UH0.e(B2, 0L, j10, null, null);
                                                                    hashMap2.put(B2, eVar9);
                                                                } else {
                                                                    j10 = j14;
                                                                }
                                                                eVar2 = eVar9;
                                                                j11 = j10;
                                                            }
                                                            if (c6960i703 == null && !treeMap.isEmpty()) {
                                                                z5 = false;
                                                                C6960i70.b[] bVarArr3 = (C6960i70.b[]) treeMap.values().toArray(new C6960i70.b[0]);
                                                                c6960i703 = new C6960i70(str5, bVarArr3);
                                                                if (c6960i704 == null) {
                                                                    c6960i702 = d(str5, bVarArr3);
                                                                    c6960i70 = c6960i703;
                                                                    if (eVar == null) {
                                                                        eVar3 = eVar;
                                                                    } else {
                                                                        eVar3 = eVar2;
                                                                    }
                                                                    long j32 = j19;
                                                                    arrayList.add(new UH0.e(B2, eVar3, str3, j32, i2, j31, c6960i70, str10, e4, j11, j21, z10, arrayList2));
                                                                    j17 = j31 + j32;
                                                                    arrayList2 = new ArrayList();
                                                                    if (i16 != 0) {
                                                                        j11 += j21;
                                                                    }
                                                                    j14 = j11;
                                                                    vh02 = vh0;
                                                                    eVar4 = eVar;
                                                                    str7 = str10;
                                                                    str6 = str9;
                                                                    c6960i704 = c6960i702;
                                                                    z10 = z5;
                                                                    i5 = i2;
                                                                    c6960i703 = c6960i70;
                                                                    j15 = j17;
                                                                    j19 = 0;
                                                                    gVar2 = gVar;
                                                                    z8 = z16;
                                                                    arrayList4 = arrayList6;
                                                                    str3 = str2;
                                                                    str4 = str3;
                                                                    treeMap2 = treeMap;
                                                                    j21 = -1;
                                                                }
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            c6960i70 = c6960i703;
                                                            c6960i702 = c6960i704;
                                                            if (eVar == null) {
                                                            }
                                                            long j322 = j19;
                                                            arrayList.add(new UH0.e(B2, eVar3, str3, j322, i2, j31, c6960i70, str10, e4, j11, j21, z10, arrayList2));
                                                            j17 = j31 + j322;
                                                            arrayList2 = new ArrayList();
                                                            if (i16 != 0) {
                                                            }
                                                            j14 = j11;
                                                            vh02 = vh0;
                                                            eVar4 = eVar;
                                                            str7 = str10;
                                                            str6 = str9;
                                                            c6960i704 = c6960i702;
                                                            z10 = z5;
                                                            i5 = i2;
                                                            c6960i703 = c6960i70;
                                                            j15 = j17;
                                                            j19 = 0;
                                                            gVar2 = gVar;
                                                            z8 = z16;
                                                            arrayList4 = arrayList6;
                                                            str3 = str2;
                                                            str4 = str3;
                                                            treeMap2 = treeMap;
                                                            j21 = -1;
                                                        } else {
                                                            j5 = j14;
                                                            j3 = j15;
                                                            j6 = j19;
                                                            vh02 = vh0;
                                                            eVar4 = eVar;
                                                            str7 = str10;
                                                            str6 = str9;
                                                            j18 = j4;
                                                            str3 = str3;
                                                            j19 = j6;
                                                            j15 = j3;
                                                            j14 = j5;
                                                            gVar2 = gVar;
                                                            z8 = z16;
                                                            arrayList4 = arrayList6;
                                                            str4 = str2;
                                                            treeMap2 = treeMap;
                                                            j22 = -1;
                                                            uh02 = uh0;
                                                            i5 = i2;
                                                        }
                                                    }
                                                    j22 = -1;
                                                    uh02 = uh0;
                                                }
                                            }
                                            j3 = j15;
                                        }
                                        vh02 = vh0;
                                        str7 = str10;
                                        str6 = str9;
                                    }
                                }
                                gVar2 = gVar;
                                z8 = z16;
                                arrayList4 = arrayList6;
                                str4 = str2;
                            }
                            eVar = eVar4;
                            i2 = i5;
                            j4 = j18;
                            j5 = j14;
                            j6 = j19;
                            vh02 = vh0;
                            eVar4 = eVar;
                            str7 = str10;
                            str6 = str9;
                            j18 = j4;
                            str3 = str3;
                            j19 = j6;
                            j15 = j3;
                            j14 = j5;
                            gVar2 = gVar;
                            z8 = z16;
                            arrayList4 = arrayList6;
                            str4 = str2;
                            treeMap2 = treeMap;
                            j22 = -1;
                            uh02 = uh0;
                            i5 = i2;
                        }
                        str7 = str10;
                        str6 = str9;
                        gVar2 = gVar;
                        z8 = z16;
                        arrayList4 = arrayList6;
                    }
                }
                gVar2 = gVar;
            }
        }
        boolean z21 = z8;
        ArrayList arrayList7 = arrayList4;
        UH0.g gVar3 = gVar2;
        HashMap hashMap3 = new HashMap();
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            UH0.d dVar = (UH0.d) arrayList3.get(i17);
            long j33 = dVar.b;
            if (j33 == -1) {
                j33 = (j24 + arrayList.size()) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int i18 = dVar.c;
            if (i18 == -1 && j13 != C10323vs.b) {
                if (arrayList2.isEmpty()) {
                    list = ((UH0.e) C5098aU0.w(arrayList)).h1;
                } else {
                    list = arrayList2;
                }
                i18 = list.size() - 1;
            }
            Uri uri = dVar.a;
            hashMap3.put(uri, new UH0.d(uri, j33, i18));
        }
        if (bVar2 != null) {
            arrayList2.add(bVar2);
        }
        if (j16 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new UH0(i3, str, arrayList7, j12, z21, j16, z11, i4, j24, i6, j23, j13, z7, z9, z2, c6960i704, arrayList, arrayList2, gVar3, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static VH0 p(b bVar, String str) throws IOException {
        ArrayList arrayList;
        Uri f2;
        char c2;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        ArrayList arrayList4;
        VH0.b bVar2;
        String str4;
        boolean z2;
        int i2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        boolean z3;
        int i3;
        int i4;
        ArrayList arrayList7;
        float f3;
        ArrayList arrayList8;
        Uri f4;
        int i5;
        String str5 = str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            int i6 = 1;
            if (bVar.a()) {
                String b2 = bVar.b();
                if (b2.startsWith(e)) {
                    arrayList16.add(b2);
                }
                boolean startsWith = b2.startsWith(m);
                ArrayList arrayList17 = arrayList13;
                if (b2.startsWith(h)) {
                    hashMap2.put(z(b2, L0, hashMap2), z(b2, V0, hashMap2));
                } else {
                    if (b2.equals(u)) {
                        arrayList8 = arrayList11;
                        arrayList7 = arrayList12;
                        arrayList5 = arrayList16;
                        arrayList6 = arrayList15;
                        z5 = true;
                    } else if (b2.startsWith(f659o)) {
                        arrayList14.add(b2);
                    } else if (b2.startsWith(A)) {
                        C6960i70.b k2 = k(b2, u(b2, E0, S, hashMap2), hashMap2);
                        if (k2 != null) {
                            arrayList15.add(new C6960i70(l(z(b2, D0, hashMap2)), k2));
                        }
                    } else if (b2.startsWith(j) || startsWith) {
                        boolean contains = z4 | b2.contains(X);
                        if (startsWith) {
                            i2 = 16384;
                        } else {
                            i2 = 0;
                        }
                        arrayList5 = arrayList16;
                        int m2 = m(b2, d0);
                        int s2 = s(b2, Y, -1);
                        String v2 = v(b2, f0, hashMap2);
                        arrayList6 = arrayList15;
                        String v3 = v(b2, g0, hashMap2);
                        if (v3 != null) {
                            z3 = z5;
                            String[] J1 = TD2.J1(v3, "x");
                            int parseInt2 = Integer.parseInt(J1[0]);
                            int parseInt3 = Integer.parseInt(J1[1]);
                            if (parseInt2 > 0 && parseInt3 > 0) {
                                i5 = parseInt2;
                            } else {
                                parseInt3 = -1;
                                i5 = -1;
                            }
                            i4 = parseInt3;
                            i3 = i5;
                        } else {
                            z3 = z5;
                            i3 = -1;
                            i4 = -1;
                        }
                        arrayList7 = arrayList12;
                        String v4 = v(b2, h0, hashMap2);
                        if (v4 != null) {
                            f3 = Float.parseFloat(v4);
                        } else {
                            f3 = -1.0f;
                        }
                        arrayList8 = arrayList11;
                        String v5 = v(b2, Z, hashMap2);
                        String v6 = v(b2, a0, hashMap2);
                        String v7 = v(b2, b0, hashMap2);
                        String v8 = v(b2, c0, hashMap2);
                        if (startsWith) {
                            f4 = RC2.f(str5, z(b2, G0, hashMap2));
                        } else if (bVar.a()) {
                            f4 = RC2.f(str5, B(bVar.b(), hashMap2));
                        } else {
                            throw C3989Py1.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        Uri uri = f4;
                        arrayList9.add(new VH0.b(uri, new C10833xx0.b().T(arrayList9.size()).M(C4128Rj1.u0).K(v2).I(s2).b0(m2).n0(i3).S(i4).R(f3).e0(i2).G(), v5, v6, v7, v8));
                        ArrayList arrayList18 = (ArrayList) hashMap.get(uri);
                        if (arrayList18 == null) {
                            arrayList18 = new ArrayList();
                            hashMap.put(uri, arrayList18);
                        }
                        arrayList18.add(new C6263fI0.b(s2, m2, v5, v6, v7, v8));
                        z4 = contains;
                        z5 = z3;
                    }
                    arrayList13 = arrayList17;
                    arrayList16 = arrayList5;
                    arrayList15 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                }
                arrayList8 = arrayList11;
                arrayList7 = arrayList12;
                arrayList5 = arrayList16;
                arrayList6 = arrayList15;
                arrayList13 = arrayList17;
                arrayList16 = arrayList5;
                arrayList15 = arrayList6;
                arrayList12 = arrayList7;
                arrayList11 = arrayList8;
            } else {
                ArrayList arrayList19 = arrayList11;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList13;
                ArrayList arrayList22 = arrayList16;
                boolean z6 = z4;
                ArrayList arrayList23 = arrayList15;
                boolean z7 = z5;
                ArrayList arrayList24 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i7 = 0;
                while (i7 < arrayList9.size()) {
                    VH0.b bVar3 = (VH0.b) arrayList9.get(i7);
                    if (hashSet.add(bVar3.a)) {
                        if (bVar3.b.e1 == null) {
                            z2 = i6;
                        } else {
                            z2 = 0;
                        }
                        C9542sf.i(z2);
                        C4224Si1.b[] bVarArr = new C4224Si1.b[i6];
                        bVarArr[0] = new C6263fI0(null, null, (List) C9542sf.g((ArrayList) hashMap.get(bVar3.a)));
                        arrayList24.add(bVar3.a(bVar3.b.b().Z(new C4224Si1(bVarArr)).G()));
                    }
                    i7++;
                    i6 = 1;
                }
                int i8 = 0;
                ArrayList arrayList25 = null;
                C10833xx0 c10833xx0 = null;
                while (i8 < arrayList14.size()) {
                    String str6 = (String) arrayList14.get(i8);
                    String z8 = z(str6, M0, hashMap2);
                    String z9 = z(str6, L0, hashMap2);
                    C10833xx0.b bVar4 = new C10833xx0.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append(z8);
                    ArrayList arrayList26 = arrayList25;
                    sb.append(":");
                    sb.append(z9);
                    C10833xx0.b X2 = bVar4.U(sb.toString()).W(z9).M(C4128Rj1.u0).i0(x(str6)).e0(w(str6, hashMap2)).X(v(str6, K0, hashMap2));
                    String v9 = v(str6, G0, hashMap2);
                    if (v9 == null) {
                        f2 = null;
                    } else {
                        f2 = RC2.f(str5, v9);
                    }
                    ArrayList arrayList27 = arrayList14;
                    C4224Si1 c4224Si1 = new C4224Si1(new C6263fI0(z8, z9, Collections.EMPTY_LIST));
                    String z10 = z(str6, I0, hashMap2);
                    z10.getClass();
                    switch (z10.hashCode()) {
                        case -959297733:
                            if (z10.equals(I)) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (z10.equals(J)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (z10.equals(G)) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (z10.equals("VIDEO")) {
                                c2 = 3;
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
                            arrayList2 = arrayList19;
                            VH0.b g2 = g(arrayList9, z8);
                            if (g2 != null) {
                                String Y2 = TD2.Y(g2.b.d1, 3);
                                X2.K(Y2);
                                str2 = C4128Rj1.g(Y2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = C4128Rj1.m0;
                            }
                            X2.g0(str2).Z(c4224Si1);
                            if (f2 != null) {
                                VH0.a aVar = new VH0.a(f2, X2.G(), z8, z9);
                                arrayList3 = arrayList20;
                                arrayList3.add(aVar);
                            } else {
                                arrayList3 = arrayList20;
                                I31.n(c, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList4 = arrayList26;
                            i8++;
                            str5 = str;
                            arrayList20 = arrayList3;
                            arrayList19 = arrayList2;
                            arrayList25 = arrayList4;
                            arrayList14 = arrayList27;
                        case 1:
                            arrayList2 = arrayList19;
                            String z11 = z(str6, O0, hashMap2);
                            if (z11.startsWith("CC")) {
                                parseInt = Integer.parseInt(z11.substring(2));
                                str3 = C4128Rj1.x0;
                            } else {
                                parseInt = Integer.parseInt(z11.substring(7));
                                str3 = C4128Rj1.y0;
                            }
                            if (arrayList26 == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList26;
                            }
                            X2.g0(str3).H(parseInt);
                            arrayList4.add(X2.G());
                            arrayList3 = arrayList20;
                            i8++;
                            str5 = str;
                            arrayList20 = arrayList3;
                            arrayList19 = arrayList2;
                            arrayList25 = arrayList4;
                            arrayList14 = arrayList27;
                        case 2:
                            VH0.b f5 = f(arrayList9, z8);
                            if (f5 != null) {
                                bVar2 = f5;
                                String Y3 = TD2.Y(f5.b.d1, 1);
                                X2.K(Y3);
                                str4 = C4128Rj1.g(Y3);
                            } else {
                                bVar2 = f5;
                                str4 = null;
                            }
                            String v10 = v(str6, e0, hashMap2);
                            if (v10 != null) {
                                X2.J(Integer.parseInt(TD2.K1(v10, RemoteSettings.i)[0]));
                                if (C4128Rj1.R.equals(str4) && v10.endsWith("/JOC")) {
                                    X2.K(C4128Rj1.U0);
                                    str4 = C4128Rj1.S;
                                }
                            }
                            X2.g0(str4);
                            if (f2 != null) {
                                X2.Z(c4224Si1);
                                arrayList2 = arrayList19;
                                arrayList2.add(new VH0.a(f2, X2.G(), z8, z9));
                            } else {
                                arrayList2 = arrayList19;
                                if (bVar2 != null) {
                                    arrayList4 = arrayList26;
                                    c10833xx0 = X2.G();
                                    arrayList3 = arrayList20;
                                    i8++;
                                    str5 = str;
                                    arrayList20 = arrayList3;
                                    arrayList19 = arrayList2;
                                    arrayList25 = arrayList4;
                                    arrayList14 = arrayList27;
                                }
                            }
                            arrayList3 = arrayList20;
                            arrayList4 = arrayList26;
                            i8++;
                            str5 = str;
                            arrayList20 = arrayList3;
                            arrayList19 = arrayList2;
                            arrayList25 = arrayList4;
                            arrayList14 = arrayList27;
                            break;
                        case 3:
                            VH0.b h2 = h(arrayList9, z8);
                            if (h2 != null) {
                                C10833xx0 c10833xx02 = h2.b;
                                String Y4 = TD2.Y(c10833xx02.d1, 2);
                                X2.K(Y4).g0(C4128Rj1.g(Y4)).n0(c10833xx02.l1).S(c10833xx02.m1).R(c10833xx02.n1);
                            }
                            if (f2 != null) {
                                X2.Z(c4224Si1);
                                arrayList10.add(new VH0.a(f2, X2.G(), z8, z9));
                            }
                            arrayList3 = arrayList20;
                            arrayList2 = arrayList19;
                            arrayList4 = arrayList26;
                            i8++;
                            str5 = str;
                            arrayList20 = arrayList3;
                            arrayList19 = arrayList2;
                            arrayList25 = arrayList4;
                            arrayList14 = arrayList27;
                        default:
                            arrayList3 = arrayList20;
                            arrayList2 = arrayList19;
                            arrayList4 = arrayList26;
                            i8++;
                            str5 = str;
                            arrayList20 = arrayList3;
                            arrayList19 = arrayList2;
                            arrayList25 = arrayList4;
                            arrayList14 = arrayList27;
                    }
                }
                ArrayList arrayList28 = arrayList25;
                ArrayList arrayList29 = arrayList20;
                ArrayList arrayList30 = arrayList19;
                if (z6) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = arrayList28;
                }
                return new VH0(str, arrayList22, arrayList24, arrayList10, arrayList30, arrayList29, arrayList21, c10833xx0, arrayList, z7, hashMap2, arrayList23);
            }
        }
    }

    public static boolean q(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return V.equals(matcher.group(1));
        }
        return z2;
    }

    public static double r(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) C9542sf.g(matcher.group(1)));
        }
        return d2;
    }

    public static int s(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) C9542sf.g(matcher.group(1)));
        }
        return i2;
    }

    public static long t(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) C9542sf.g(matcher.group(1)));
        }
        return j2;
    }

    public static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C9542sf.g(matcher.group(1));
        }
        if (!map.isEmpty() && str2 != null) {
            return B(str2, map);
        }
        return str2;
    }

    @InterfaceC11300zs1
    public static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map<String, String> map) {
        String v2 = v(str, N0, map);
        int i2 = 0;
        if (TextUtils.isEmpty(v2)) {
            return 0;
        }
        String[] J1 = TD2.J1(v2, ",");
        if (TD2.y(J1, "public.accessibility.describes-video")) {
            i2 = 512;
        }
        if (TD2.y(J1, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (TD2.y(J1, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        if (TD2.y(J1, "public.easy-to-read")) {
            return i2 | 8192;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int x(String str) {
        boolean q2 = q(str, Q0, false);
        ?? r02 = q2;
        if (q(str, R0, false)) {
            r02 = (q2 ? 1 : 0) | true;
        }
        if (q(str, P0, false)) {
            return r02 | 4;
        }
        return r02;
    }

    public static UH0.g y(String str) {
        long j2;
        long j3;
        double r2 = r(str, n0, -9.223372036854776E18d);
        int i2 = (r2 > (-9.223372036854776E18d) ? 1 : (r2 == (-9.223372036854776E18d) ? 0 : -1));
        long j4 = C10323vs.b;
        if (i2 == 0) {
            j2 = -9223372036854775807L;
        } else {
            j2 = (long) (r2 * 1000000.0d);
        }
        boolean q2 = q(str, o0, false);
        double r3 = r(str, q0, -9.223372036854776E18d);
        if (r3 == -9.223372036854776E18d) {
            j3 = -9223372036854775807L;
        } else {
            j3 = (long) (r3 * 1000000.0d);
        }
        double r4 = r(str, r0, -9.223372036854776E18d);
        if (r4 != -9.223372036854776E18d) {
            j4 = (long) (r4 * 1000000.0d);
        }
        return new UH0.g(j2, q2, j3, j4, q(str, s0, false));
    }

    public static String z(String str, Pattern pattern, Map<String, String> map) throws C3989Py1 {
        String v2 = v(str, pattern, map);
        if (v2 != null) {
            return v2;
        }
        throw C3989Py1.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // o.C4086Qy1.a
    /* renamed from: i */
    public WH0 a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith(j)) {
                                arrayDeque.add(trim);
                                return p(new b(arrayDeque, bufferedReader), uri.toString());
                            } else if (trim.startsWith(p) || trim.startsWith(w) || trim.startsWith(v) || trim.startsWith(z) || trim.startsWith(B) || trim.equals(q) || trim.equals(r) || trim.equals(y)) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        }
                    } else {
                        TD2.t(bufferedReader);
                        throw C3989Py1.c("Failed to parse the playlist, could not identify any tags.", null);
                    }
                }
                arrayDeque.add(trim);
                return o(this.a, this.b, new b(arrayDeque, bufferedReader), uri.toString());
            }
            throw C3989Py1.c("Input does not start with the #EXTM3U header.", null);
        } finally {
            TD2.t(bufferedReader);
        }
    }

    public XH0(VH0 vh0, @InterfaceC11300zs1 UH0 uh0) {
        this.a = vh0;
        this.b = uh0;
    }
}
