package o;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: o.hD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6740hD {
    public static String a(Class<?> cls, String str) {
        C11147zE2.V(cls, "context", new Object[0]);
        C11147zE2.V(str, "resourceName", new Object[0]);
        return b(cls.getPackage(), str);
    }

    public static String b(Package r3, String str) {
        C11147zE2.V(r3, "context", new Object[0]);
        C11147zE2.V(str, "resourceName", new Object[0]);
        return r3.getName() + UE.h + str;
    }

    public static String c(Class<?> cls, String str) {
        C11147zE2.V(cls, "context", new Object[0]);
        C11147zE2.V(str, "resourceName", new Object[0]);
        return d(cls.getPackage(), str);
    }

    public static String d(Package r3, String str) {
        C11147zE2.V(r3, "context", new Object[0]);
        C11147zE2.V(str, "resourceName", new Object[0]);
        return r3.getName().replace('.', '/') + RemoteSettings.i + str;
    }
}
