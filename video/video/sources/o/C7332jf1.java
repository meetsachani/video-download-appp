package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.jf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7332jf1 extends IOException {
    public final OU X;
    public final Uri Y;
    public final long Y0;
    public final Map<String, List<String>> Z;

    public C7332jf1(OU ou, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.X = ou;
        this.Y = uri;
        this.Z = map;
        this.Y0 = j;
    }
}
