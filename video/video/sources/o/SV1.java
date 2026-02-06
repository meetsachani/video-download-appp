package o;

import android.net.Uri;

@Deprecated
/* loaded from: classes2.dex */
public final class SV1 {
    public static final String a = "rtp://0.0.0.0";

    public static OU a(int i) {
        return new OU(Uri.parse(TD2.M("%s:%d", a, Integer.valueOf(i))));
    }
}
