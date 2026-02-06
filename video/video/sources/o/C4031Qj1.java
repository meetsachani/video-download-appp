package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;

/* renamed from: o.Qj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4031Qj1 {
    public static String a(String str, String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(RemoteSettings.i);
        for (String str2 : strArr) {
            if (e(split, str2.split(RemoteSettings.i))) {
                return str2;
            }
        }
        return null;
    }

    public static String b(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split(RemoteSettings.i);
        for (String str2 : strArr) {
            if (e(str2.split(RemoteSettings.i), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(String str, String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split(RemoteSettings.i), str2.split(RemoteSettings.i));
    }

    public static String[] d(String[] strArr, String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(RemoteSettings.i);
        for (String str2 : strArr) {
            if (e(str2.split(RemoteSettings.i), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean e(String[] strArr, String[] strArr2) {
        if (strArr2.length == 2) {
            if (!strArr2[0].isEmpty() && !strArr2[1].isEmpty()) {
                if (strArr.length != 2) {
                    return false;
                }
                if (!"*".equals(strArr2[0]) && !strArr2[0].equals(strArr[0])) {
                    return false;
                }
                if (!"*".equals(strArr2[1]) && !strArr2[1].equals(strArr[1])) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }
}
