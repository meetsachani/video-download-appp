package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class HttpUtils {
    public static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final Pattern b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Map<String, String> a(@InterfaceC5670cr1 URI uri, @InterfaceC5670cr1 String str) {
        String str2;
        Map<String, String> map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap<>();
            zzx c2 = zzx.c(zzo.b('='));
            for (String str3 : zzx.c(zzo.b('&')).b().d(rawQuery)) {
                List f = c2.f(str3);
                if (!f.isEmpty() && f.size() <= 2) {
                    String b2 = b((String) f.get(0), str);
                    if (f.size() == 2) {
                        str2 = b((String) f.get(1), str);
                    } else {
                        str2 = null;
                    }
                    map.put(b2, str2);
                } else {
                    throw new IllegalArgumentException("bad parameter");
                }
            }
        }
        return map;
    }

    public static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
