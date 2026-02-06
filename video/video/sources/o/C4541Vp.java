package o;

import android.app.PendingIntent;
import android.net.Uri;

@Deprecated
/* renamed from: o.Vp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4541Vp {
    public final String a;
    public final PendingIntent b;
    public int c;
    public Uri d;
    public Runnable e;

    public C4541Vp(String str, PendingIntent pendingIntent, int i) {
        this.a = str;
        this.b = pendingIntent;
        this.c = i;
    }

    public PendingIntent a() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.c;
    }

    public Uri c() {
        return this.d;
    }

    public Runnable d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public C4541Vp(String str, PendingIntent pendingIntent, Uri uri) {
        this.a = str;
        this.b = pendingIntent;
        this.d = uri;
    }

    public C4541Vp(String str, Runnable runnable) {
        this.a = str;
        this.b = null;
        this.e = runnable;
    }

    public C4541Vp(String str, PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
