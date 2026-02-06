package com.facebook.messenger;

import android.net.Uri;

/* loaded from: classes2.dex */
public class f {
    public final Uri a;
    public final String b;
    public String c;
    public Uri d;

    public f(Uri uri, String mimeType) {
        this.a = uri;
        this.b = mimeType;
    }

    public e a() {
        return new e(this);
    }

    public Uri b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public Uri e() {
        return this.a;
    }

    public f f(Uri externalUri) {
        this.d = externalUri;
        return this;
    }

    public f g(String metaData) {
        this.c = metaData;
        return this;
    }
}
