package o;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: o.gX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6575gX0 {
    public static final String a = "UTF-8";
    public static final Charset b = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
