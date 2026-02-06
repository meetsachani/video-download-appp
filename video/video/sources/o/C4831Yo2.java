package o;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: o.Yo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4831Yo2 {
    public static final C4831Yo2 c = new C4831Yo2(null, null);
    @InterfaceC11300zs1
    public final Long a;
    @InterfaceC11300zs1
    public final TimeZone b;

    public C4831Yo2(@InterfaceC11300zs1 Long l, @InterfaceC11300zs1 TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static C4831Yo2 a(long j) {
        return new C4831Yo2(Long.valueOf(j), null);
    }

    public static C4831Yo2 b(long j, @InterfaceC11300zs1 TimeZone timeZone) {
        return new C4831Yo2(Long.valueOf(j), timeZone);
    }

    public static C4831Yo2 e() {
        return c;
    }

    public Calendar c() {
        return d(this.b);
    }

    public Calendar d(@InterfaceC11300zs1 TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
