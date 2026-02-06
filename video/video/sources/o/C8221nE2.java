package o;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.nE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8221nE2 extends TT1 {
    public static final Pattern f = Pattern.compile("BEGIN:VCARD", 2);
    public static final Pattern g = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
    public static final Pattern h = Pattern.compile("\r\n[ \t]");
    public static final Pattern i = Pattern.compile("\\\\[nN]");
    public static final Pattern j = Pattern.compile("\\\\([,;\\\\])");
    public static final Pattern k = Pattern.compile("=");
    public static final Pattern l = Pattern.compile(";");
    public static final Pattern m = Pattern.compile("(?<!\\\\);+");
    public static final Pattern n = Pattern.compile(",");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f822o = Pattern.compile("[;,]");

    public static String[] A(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str2 = list.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i2 = 1;
                while (true) {
                    if (i2 < list.size()) {
                        str = list.get(i2);
                        int indexOf = str.indexOf(61);
                        if (indexOf < 0) {
                            break;
                        } else if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                            str = str.substring(indexOf + 1);
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String q(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    w(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (i2 < length - 2 && (charAt = charSequence.charAt(i2 + 1)) != '\r' && charAt != '\n') {
                    i2 += 2;
                    char charAt3 = charSequence.charAt(i2);
                    int l2 = TT1.l(charAt);
                    int l3 = TT1.l(charAt3);
                    if (l2 >= 0 && l3 >= 0) {
                        byteArrayOutputStream.write((l2 << 4) + l3);
                    }
                }
            }
            i2++;
        }
        w(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    public static void r(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i2 = 0;
                int i3 = 0;
                while (i2 < 4 && (indexOf = str.indexOf(59, i3)) >= 0) {
                    strArr[i2] = str.substring(i3, indexOf);
                    i2++;
                    i3 = indexOf + 1;
                }
                strArr[i2] = str.substring(i3);
                StringBuilder sb = new StringBuilder(100);
                v(strArr, 3, sb);
                v(strArr, 1, sb);
                v(strArr, 2, sb);
                v(strArr, 0, sb);
                v(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    public static boolean s(CharSequence charSequence) {
        if (charSequence != null && !g.matcher(charSequence).matches()) {
            return false;
        }
        return true;
    }

    public static List<String> t(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> u = u(charSequence, str, z, z2);
        if (u != null && !u.isEmpty()) {
            return u.get(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
        r4 = r1;
        r3 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<List<String>> u(CharSequence charSequence, String str, boolean z, boolean z2) {
        int i2;
        int i3;
        ArrayList arrayList;
        String str2;
        String str3;
        int indexOf;
        int i4;
        String replaceAll;
        int i5;
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        ArrayList arrayList2 = null;
        while (i7 < length) {
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i7 > 0) {
                i7--;
            }
            if (!matcher.find(i7)) {
                break;
            }
            int end = matcher.end(i6);
            int i8 = 1;
            String group = matcher.group(1);
            if (group != null) {
                String[] split = l.split(group);
                int length2 = split.length;
                int i9 = i6;
                i3 = i9;
                arrayList = null;
                str2 = null;
                str3 = null;
                while (i9 < length2) {
                    String str4 = split[i9];
                    if (arrayList == null) {
                        arrayList = new ArrayList(i8);
                    }
                    arrayList.add(str4);
                    int i10 = i6;
                    String[] split2 = k.split(str4, 2);
                    if (split2.length > i8) {
                        String str5 = split2[i10];
                        String str6 = split2[i8];
                        i5 = i8;
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            i3 = i5;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if ("VALUE".equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    } else {
                        i5 = i8;
                    }
                    i9++;
                    i6 = i10;
                    i8 = i5;
                }
                i2 = i6;
            } else {
                i2 = i6;
                i3 = i2;
                arrayList = null;
                str2 = null;
                str3 = null;
            }
            int i11 = i8;
            int i12 = end;
            while (true) {
                indexOf = str.indexOf(10, i12);
                if (indexOf >= 0) {
                    if (indexOf < str.length() - 1) {
                        int i13 = indexOf + 1;
                        if (str.charAt(i13) == ' ' || str.charAt(i13) == '\t') {
                            i12 = indexOf + 2;
                        }
                    }
                    if (i3 == 0 || ((indexOf <= 0 || str.charAt(indexOf - 1) != '=') && (indexOf < 2 || str.charAt(indexOf - 2) != '='))) {
                        break;
                    }
                    i12 = indexOf + 1;
                } else {
                    break;
                }
            }
            if (indexOf > end) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(i11);
                }
                if (indexOf > 0 && str.charAt(indexOf - 1) == '\r') {
                    indexOf--;
                }
                String substring = str.substring(end, indexOf);
                if (z) {
                    substring = substring.trim();
                }
                if (i3 != 0) {
                    replaceAll = q(substring, str2);
                    if (z2) {
                        replaceAll = m.matcher(replaceAll).replaceAll("\n").trim();
                    }
                } else {
                    if (z2) {
                        substring = m.matcher(substring).replaceAll("\n").trim();
                    }
                    replaceAll = j.matcher(i.matcher(h.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                }
                if ("uri".equals(str3)) {
                    try {
                        replaceAll = URI.create(replaceAll).getSchemeSpecificPart();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (arrayList == null) {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(replaceAll);
                    arrayList2.add(arrayList3);
                } else {
                    i4 = i2;
                    arrayList.add(i4, replaceAll);
                    arrayList2.add(arrayList);
                    i6 = i4;
                    i7 = indexOf + 1;
                }
            }
            i4 = i2;
            i6 = i4;
            i7 = indexOf + 1;
        }
        return arrayList2;
    }

    public static void v(String[] strArr, int i2, StringBuilder sb) {
        String str = strArr[i2];
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i2]);
        }
    }

    public static void w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    public static String y(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public static String[] z(Collection<List<String>> collection) {
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection.size());
            for (List<String> list : collection) {
                String str = list.get(0);
                if (str != null && !str.isEmpty()) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    @Override // o.TT1
    /* renamed from: x */
    public C9655t7 k(QT1 qt1) {
        String[] split;
        String[] split2;
        String[] strArr;
        String c = TT1.c(qt1);
        Matcher matcher = f.matcher(c);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> u = u("FN", c, true, false);
        if (u == null) {
            u = u("N", c, true, false);
            r(u);
        }
        List<String> t = t("NICKNAME", c, true, false);
        if (t == null) {
            split = null;
        } else {
            split = n.split(t.get(0));
        }
        List<List<String>> u2 = u("TEL", c, true, false);
        List<List<String>> u3 = u("EMAIL", c, true, false);
        List<String> t2 = t(AK2.v, c, false, false);
        List<List<String>> u4 = u("ADR", c, true, true);
        List<String> t3 = t("ORG", c, true, true);
        List<String> t4 = t("BDAY", c, true, false);
        if (t4 != null && !s(t4.get(0))) {
            t4 = null;
        }
        List<String> t5 = t(C9642t32.N, c, true, false);
        List<List<String>> u5 = u("URL", c, true, false);
        List<String> t6 = t("IMPP", c, true, false);
        List<String> t7 = t("GEO", c, true, false);
        if (t7 == null) {
            split2 = null;
        } else {
            split2 = f822o.split(t7.get(0));
        }
        if (split2 != null && split2.length != 2) {
            strArr = null;
        } else {
            strArr = split2;
        }
        return new C9655t7(z(u), split, null, z(u2), A(u2), z(u3), A(u3), y(t6), y(t2), z(u4), A(u4), y(t3), y(t4), y(t5), z(u5), strArr);
    }
}
