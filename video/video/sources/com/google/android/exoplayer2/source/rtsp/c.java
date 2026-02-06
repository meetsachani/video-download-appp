package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.C3989Py1;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class c {
    public static final int e = 1;
    public static final int f = 2;
    public static final String g = "Basic %s";
    public static final String h = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";
    public static final String i = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";
    public static final String j = "MD5";
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public c(int i2, String str, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public String a(h.a aVar, Uri uri, int i2) throws C3989Py1 {
        int i3 = this.a;
        if (i3 != 1) {
            if (i3 == 2) {
                return c(aVar, uri, i2);
            }
            throw C3989Py1.d(null, new UnsupportedOperationException());
        }
        return b(aVar);
    }

    public final String b(h.a aVar) {
        return TD2.M(g, Base64.encodeToString(h.d(aVar.a + ":" + aVar.b), 0));
    }

    public final String c(h.a aVar, Uri uri, int i2) throws C3989Py1 {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String t = h.t(i2);
            String V1 = TD2.V1(messageDigest.digest(h.d(aVar.a + ":" + this.b + ":" + aVar.b)));
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.append(":");
            sb.append(uri);
            String V12 = TD2.V1(messageDigest.digest(h.d(sb.toString())));
            String V13 = TD2.V1(messageDigest.digest(h.d(V1 + ":" + this.c + ":" + V12)));
            if (this.d.isEmpty()) {
                return TD2.M(h, aVar.a, this.b, this.c, uri, V13);
            }
            return TD2.M(i, aVar.a, this.b, this.c, uri, V13, this.d);
        } catch (NoSuchAlgorithmException e2) {
            throw C3989Py1.d(null, e2);
        }
    }
}
