package o;

import android.net.Uri;

/* renamed from: o.bx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5452bx1 {
    public static AbstractC5452bx1 b(Uri uri) {
        C10907yF1.m(uri, "OutputUri cannot be null.");
        return new C5394bj(uri);
    }

    public abstract Uri a();
}
