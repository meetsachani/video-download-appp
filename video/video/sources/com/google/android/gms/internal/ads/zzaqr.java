package com.google.android.gms.internal.ads;

import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import o.AI0;
import o.C11161zI0;
import o.C5663cp2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaqr {
    public static long a(String str) {
        try {
            return d(C11161zI0.c).parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzaqg.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqg.d("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @InterfaceC11300zs1
    public static zzapd b(zzapq zzapqVar) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzapqVar.c;
        if (map != null) {
            String str = (String) map.get("Date");
            if (str != null) {
                j = a(str);
            } else {
                j = 0;
            }
            String str2 = (String) map.get("Cache-Control");
            int i = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z = false;
                j3 = 0;
                j4 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals(FirebaseInstallationServiceClient.u) && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j4 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j3 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i++;
                    } else {
                        return null;
                    }
                }
                j2 = 0;
                i = 1;
            } else {
                j2 = 0;
                z = false;
                j3 = 0;
                j4 = 0;
            }
            String str3 = (String) map.get("Expires");
            if (str3 != null) {
                j5 = a(str3);
            } else {
                j5 = j2;
            }
            String str4 = (String) map.get(AI0.r0);
            if (str4 != null) {
                j6 = currentTimeMillis;
                j7 = a(str4);
            } else {
                j6 = currentTimeMillis;
                j7 = j2;
            }
            String str5 = (String) map.get("ETag");
            if (i != 0) {
                long j10 = (j4 * 1000) + j6;
                if (z) {
                    j9 = j10;
                } else {
                    j9 = (j3 * 1000) + j10;
                }
                j8 = j10;
            } else {
                if (j > j2 && j5 >= j) {
                    j8 = (j5 - j) + j6;
                } else {
                    j8 = j2;
                }
                j9 = j8;
            }
            zzapd zzapdVar = new zzapd();
            zzapdVar.a = zzapqVar.b;
            zzapdVar.b = str5;
            zzapdVar.f = j8;
            zzapdVar.e = j9;
            zzapdVar.c = j;
            zzapdVar.d = j7;
            zzapdVar.g = map;
            zzapdVar.h = zzapqVar.d;
            return zzapdVar;
        }
        return null;
    }

    public static String c(long j) {
        return d(C11161zI0.d).format(new Date(j));
    }

    public static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C5663cp2.a));
        return simpleDateFormat;
    }
}
