package o;

import java.net.URLClassLoader;
import java.util.Arrays;

/* renamed from: o.dD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5757dD {
    public static String a(ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            return b((URLClassLoader) classLoader);
        }
        return classLoader.toString();
    }

    public static String b(URLClassLoader uRLClassLoader) {
        return uRLClassLoader + Arrays.toString(uRLClassLoader.getURLs());
    }
}
