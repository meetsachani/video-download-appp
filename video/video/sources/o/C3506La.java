package o;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* renamed from: o.La  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3506La {
    public static Uri a(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
