package o;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.n71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8192n71 {
    public static final String b = "mailto:";
    public static final String c = "mailto";
    public static final String d = "to";
    public static final String e = "body";
    public static final String f = "cc";
    public static final String g = "bcc";
    public static final String h = "subject";
    public HashMap<String, String> a = new HashMap<>();

    public static boolean g(Uri uri) {
        if (uri != null && c.equals(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public static boolean h(String str) {
        if (str != null && str.startsWith(b)) {
            return true;
        }
        return false;
    }

    public static C8192n71 i(Uri uri) throws C3404Jy1 {
        return j(uri.toString());
    }

    public static C8192n71 j(String str) throws C3404Jy1 {
        String decode;
        String substring;
        String str2;
        C10907yF1.l(str);
        if (h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                decode = Uri.decode(str.substring(7));
                substring = null;
            } else {
                decode = Uri.decode(str.substring(7, indexOf2));
                substring = str.substring(indexOf2 + 1);
            }
            C8192n71 c8192n71 = new C8192n71();
            if (substring != null) {
                for (String str3 : substring.split("&")) {
                    String[] split = str3.split("=", 2);
                    if (split.length != 0) {
                        String lowerCase = Uri.decode(split[0]).toLowerCase(Locale.ROOT);
                        if (split.length > 1) {
                            str2 = Uri.decode(split[1]);
                        } else {
                            str2 = null;
                        }
                        c8192n71.a.put(lowerCase, str2);
                    }
                }
            }
            String f2 = c8192n71.f();
            if (f2 != null) {
                decode = decode + C6566gU0.h + f2;
            }
            c8192n71.a.put("to", decode);
            return c8192n71;
        }
        throw new C3404Jy1("Not a mailto scheme");
    }

    public String a() {
        return this.a.get(g);
    }

    public String b() {
        return this.a.get("body");
    }

    public String c() {
        return this.a.get(f);
    }

    public Map<String, String> d() {
        return this.a;
    }

    public String e() {
        return this.a.get(h);
    }

    public String f() {
        return this.a.get("to");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(b);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
