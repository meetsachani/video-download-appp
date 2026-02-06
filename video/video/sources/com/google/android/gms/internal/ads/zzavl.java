package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzavl {
    public static final String[] d = {"/aclk", "/pcs/click", "/dbm/clk"};
    public final String a = "ad.doubleclick.net";
    public final String[] b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final zzavg c;

    @Deprecated
    public zzavl(zzavg zzavgVar) {
        this.c = zzavgVar;
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) throws zzavm {
        try {
            return g(uri, this.c.h(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavm("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) throws zzavm {
        return g(uri, this.c.a(context));
    }

    @Deprecated
    public final zzavg c() {
        return this.c;
    }

    @Deprecated
    public final void d(MotionEvent motionEvent) {
        this.c.e(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri g(Uri uri, String str) throws zzavm {
        try {
            if (uri != null) {
                try {
                    if (uri.getHost().equals(this.a)) {
                        if (uri.getPath().contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i = indexOf + 1;
                                    return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                                }
                                String encodedPath = uri.getEncodedPath();
                                int indexOf2 = uri2.indexOf(encodedPath);
                                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                            }
                            throw new zzavm("Parameter already exists: dc_ms");
                        }
                    }
                } catch (NullPointerException unused) {
                }
                if (uri.getQueryParameter("ms") == null) {
                    String uri3 = uri.toString();
                    int indexOf3 = uri3.indexOf("&adurl");
                    if (indexOf3 == -1) {
                        indexOf3 = uri3.indexOf("?adurl");
                    }
                    if (indexOf3 != -1) {
                        int i2 = indexOf3 + 1;
                        return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
                    }
                    return uri.buildUpon().appendQueryParameter("ms", str).build();
                }
                throw new zzavm("Query parameter already exists: ms");
            }
            throw null;
        } catch (UnsupportedOperationException unused2) {
            throw new zzavm("Provided Uri is not in a valid state");
        }
    }
}
