package o;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "TimersKt")
/* renamed from: o.sp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9585sp2 {

    /* renamed from: o.sp2$a */
    /* loaded from: classes3.dex */
    public static final class a extends TimerTask {
        public final /* synthetic */ HA0<TimerTask, C7458kA2> X;

        /* JADX WARN: Multi-variable type inference failed */
        public a(HA0<? super TimerTask, C7458kA2> ha0) {
            this.X = ha0;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.X.invoke(this);
        }
    }

    @XP0
    public static final Timer a(String str, boolean z, long j, long j2, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(ha0), j, j2);
        return k;
    }

    @XP0
    public static final Timer b(String str, boolean z, Date date, long j, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(date, "startAt");
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(ha0), date, j);
        return k;
    }

    public static /* synthetic */ Timer c(String str, boolean z, long j, long j2, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(ha0), j, j2);
        return k;
    }

    public static /* synthetic */ Timer d(String str, boolean z, Date date, long j, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        C6562gT0.p(date, "startAt");
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(ha0), date, j);
        return k;
    }

    @XP0
    public static final TimerTask e(Timer timer, long j, long j2, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(timer, "<this>");
        C6562gT0.p(ha0, "action");
        a aVar = new a(ha0);
        timer.schedule(aVar, j, j2);
        return aVar;
    }

    @XP0
    public static final TimerTask f(Timer timer, long j, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(timer, "<this>");
        C6562gT0.p(ha0, "action");
        a aVar = new a(ha0);
        timer.schedule(aVar, j);
        return aVar;
    }

    @XP0
    public static final TimerTask g(Timer timer, Date date, long j, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(timer, "<this>");
        C6562gT0.p(date, "time");
        C6562gT0.p(ha0, "action");
        a aVar = new a(ha0);
        timer.schedule(aVar, date, j);
        return aVar;
    }

    @XP0
    public static final TimerTask h(Timer timer, Date date, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(timer, "<this>");
        C6562gT0.p(date, "time");
        C6562gT0.p(ha0, "action");
        a aVar = new a(ha0);
        timer.schedule(aVar, date);
        return aVar;
    }

    @XP0
    public static final TimerTask i(Timer timer, long j, long j2, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(timer, "<this>");
        C6562gT0.p(ha0, "action");
        a aVar = new a(ha0);
        timer.scheduleAtFixedRate(aVar, j, j2);
        return aVar;
    }

    @XP0
    public static final TimerTask j(Timer timer, Date date, long j, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(timer, "<this>");
        C6562gT0.p(date, "time");
        C6562gT0.p(ha0, "action");
        a aVar = new a(ha0);
        timer.scheduleAtFixedRate(aVar, date, j);
        return aVar;
    }

    @HK1
    @NotNull
    public static final Timer k(@Nullable String str, boolean z) {
        if (str == null) {
            return new Timer(z);
        }
        return new Timer(str, z);
    }

    @XP0
    public static final Timer l(String str, boolean z, long j, long j2, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.schedule(new a(ha0), j, j2);
        return k;
    }

    @XP0
    public static final Timer m(String str, boolean z, Date date, long j, HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(date, "startAt");
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.schedule(new a(ha0), date, j);
        return k;
    }

    public static /* synthetic */ Timer n(String str, boolean z, long j, long j2, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.schedule(new a(ha0), j, j2);
        return k;
    }

    public static /* synthetic */ Timer o(String str, boolean z, Date date, long j, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        C6562gT0.p(date, "startAt");
        C6562gT0.p(ha0, "action");
        Timer k = k(str, z);
        k.schedule(new a(ha0), date, j);
        return k;
    }

    @XP0
    public static final TimerTask p(HA0<? super TimerTask, C7458kA2> ha0) {
        C6562gT0.p(ha0, "action");
        return new a(ha0);
    }
}
