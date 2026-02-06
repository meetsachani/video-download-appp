package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
/* loaded from: classes2.dex */
public final class N11 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final OU b;
    public final Uri c;
    public final Map<String, List<String>> d;
    public final long e;
    public final long f;
    public final long g;

    public N11(long j, OU ou, long j2) {
        this(j, ou, ou.a, Collections.EMPTY_MAP, j2, 0L, 0L);
    }

    public static long a() {
        return h.getAndIncrement();
    }

    public N11(long j, OU ou, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.a = j;
        this.b = ou;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
