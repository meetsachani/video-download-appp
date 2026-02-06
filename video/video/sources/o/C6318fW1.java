package o;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.fW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6318fW1 {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 9;

    /* renamed from: o  reason: collision with root package name */
    public static final int f744o = 10;
    public static final int p = 11;
    public static final int q = 12;
    public final Uri a;
    public final int b;
    public final com.google.android.exoplayer2.source.rtsp.e c;
    public final String d;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.fW1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C6318fW1(Uri uri, int i2, com.google.android.exoplayer2.source.rtsp.e eVar, String str) {
        this.a = uri;
        this.b = i2;
        this.c = eVar;
        this.d = str;
    }
}
