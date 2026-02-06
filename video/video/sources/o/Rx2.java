package o;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Rx2 {
    public static final Pattern a = Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    public static String a(String str, String str2) {
        Charset forName = Charset.forName(str2);
        StringBuilder sb = new StringBuilder();
        for (byte b : forName.encode(C2555Bk.p1).array()) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return str.replaceAll("\\+", sb.toString());
    }

    public static boolean b(String str, String str2) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1));
        if (mimeTypeFromExtension != null && !mimeTypeFromExtension.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    public static String c(String str) {
        String group;
        String[] split = str.trim().split(";", 2);
        String str2 = null;
        if (split.length < 2 || "inline".equalsIgnoreCase(split[0].trim())) {
            return null;
        }
        Matcher matcher = a.matcher(split[1]);
        String str3 = null;
        while (matcher.find()) {
            String group2 = matcher.group(1);
            if (matcher.group(2) != null) {
                group = g(matcher.group(2));
            } else if (matcher.group(3) != null) {
                group = g(matcher.group(3));
            } else {
                group = matcher.group(4);
            }
            if (group2 != null && group != null) {
                if ("filename*".equalsIgnoreCase(group2)) {
                    str2 = f(group);
                } else if ("filename".equalsIgnoreCase(group2)) {
                    str3 = group;
                }
            }
        }
        if (str2 != null) {
            return str2;
        }
        return str3;
    }

    public static String d(String str, String str2) {
        String lastPathSegment;
        String c;
        if (str2 != null && (c = c(str2)) != null) {
            return h(c);
        }
        Uri parse = Uri.parse(str);
        if (parse != null && (lastPathSegment = parse.getLastPathSegment()) != null) {
            return h(lastPathSegment);
        }
        return "downloadfile";
    }

    public static String e(String str, String str2, String str3) {
        String d = d(str, str2);
        String i = i(str3);
        if (d.indexOf(46) < 0) {
            return d + i;
        } else if (str3 != null && b(d, str3)) {
            return d + i;
        } else {
            return d;
        }
    }

    public static String f(String str) {
        String[] split = str.split("'", 3);
        if (split.length < 3) {
            return null;
        }
        String str2 = split[0];
        try {
            return URLDecoder.decode(a(split[2], str2), str2);
        } catch (UnsupportedEncodingException | RuntimeException unused) {
            return null;
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\(.)", "$1");
    }

    public static String h(String str) {
        return str.replaceAll(RemoteSettings.i, CrashlyticsReportPersistence.m);
    }

    public static String i(String str) {
        if (str == null) {
            return ".bin";
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            return UE.h + extensionFromMimeType;
        } else if (str.equalsIgnoreCase("text/html")) {
            return ".html";
        } else {
            if (!str.toLowerCase(Locale.ROOT).startsWith("text/")) {
                return ".bin";
            }
            return ".txt";
        }
    }
}
