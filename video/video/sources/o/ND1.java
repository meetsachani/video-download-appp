package o;

import android.media.metrics.LogSessionId;

@Deprecated
/* loaded from: classes2.dex */
public final class ND1 {
    public static final ND1 b;
    @InterfaceC11300zs1
    public final a a;

    @ES1(31)
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a b;
        public final LogSessionId a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.a = logSessionId;
        }
    }

    static {
        ND1 nd1;
        if (TD2.a < 31) {
            nd1 = new ND1();
        } else {
            nd1 = new ND1(a.b);
        }
        b = nd1;
    }

    public ND1() {
        this((a) null);
        C9542sf.i(TD2.a < 31);
    }

    @ES1(31)
    public LogSessionId a() {
        return ((a) C9542sf.g(this.a)).a;
    }

    @ES1(31)
    public ND1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public ND1(@InterfaceC11300zs1 a aVar) {
        this.a = aVar;
    }
}
