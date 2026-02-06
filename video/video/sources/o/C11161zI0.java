package o;

import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import o.InterfaceC4747Xs;

/* renamed from: o.zI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11161zI0 {
    public static final String a = "Content-Type";
    public static final String b = "ISO-8859-1";
    public static final String c = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final String d = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";

    public static List<MG0> a(List<MG0> list, InterfaceC4747Xs.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (MG0 mg0 : list) {
                treeSet.add(mg0.a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<MG0> list2 = aVar.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (MG0 mg02 : aVar.h) {
                    if (!treeSet.contains(mg02.a())) {
                        arrayList.add(mg02);
                    }
                }
            }
        } else if (!aVar.g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new MG0(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String b(long j) {
        return d(d).format(new Date(j));
    }

    public static Map<String, String> c(InterfaceC4747Xs.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        String str = aVar.b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = aVar.d;
        if (j > 0) {
            hashMap.put(AI0.z, b(j));
        }
        return hashMap;
    }

    public static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C5663cp2.a));
        return simpleDateFormat;
    }

    public static InterfaceC4747Xs.a e(C3470Kp1 c3470Kp1) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c3470Kp1.c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j = h(str);
        } else {
            j = 0;
        }
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j3 = 0;
            j4 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals(FirebaseInstallationServiceClient.u) || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j4 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j2 = 0;
            i = 1;
        } else {
            j2 = 0;
            z = false;
            j3 = 0;
            j4 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j5 = h(str3);
        } else {
            j5 = j2;
        }
        String str4 = map.get(AI0.r0);
        if (str4 != null) {
            j6 = h(str4);
        } else {
            j6 = j2;
        }
        String str5 = map.get("ETag");
        if (i != 0) {
            long j9 = currentTimeMillis + (j3 * 1000);
            if (z) {
                j8 = j9;
            } else {
                j8 = (j4 * 1000) + j9;
            }
            j7 = j9;
        } else {
            if (j > j2 && j5 >= j) {
                j7 = currentTimeMillis + (j5 - j);
            } else {
                j7 = j2;
            }
            j8 = j7;
        }
        InterfaceC4747Xs.a aVar = new InterfaceC4747Xs.a();
        aVar.a = c3470Kp1.b;
        aVar.b = str5;
        aVar.f = j7;
        aVar.e = j8;
        aVar.c = j;
        aVar.d = j6;
        aVar.g = map;
        aVar.h = c3470Kp1.d;
        return aVar;
    }

    public static String f(Map<String, String> map) {
        return g(map, "ISO-8859-1");
    }

    public static String g(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals(C4317Th1.g)) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long h(String str) {
        try {
            return d(c).parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                C6767hJ2.d(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            C6767hJ2.f("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static List<MG0> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new MG0(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> j(List<MG0> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (MG0 mg0 : list) {
            treeMap.put(mg0.a(), mg0.b());
        }
        return treeMap;
    }
}
