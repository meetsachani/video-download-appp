package o;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: o.lb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7803lb2 extends AbstractC8387nv2<Time> {
    public static final InterfaceC8631ov2 b = new a();
    public final DateFormat a;

    /* renamed from: o.lb2$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() != Time.class) {
                return null;
            }
            return new C7803lb2(null);
        }
    }

    public /* synthetic */ C7803lb2(a aVar) {
        this();
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: j */
    public Time e(OV0 ov0) throws IOException {
        Time time;
        if (ov0.I() == XV0.NULL) {
            ov0.E();
            return null;
        }
        String G = ov0.G();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                time = new Time(this.a.parse(G).getTime());
                this.a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new WV0("Failed parsing '" + G + "' as SQL Time; at path " + ov0.p(), e);
            }
        }
        return time;
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: k */
    public void i(C5589cW0 c5589cW0, Time time) throws IOException {
        String format;
        if (time == null) {
            c5589cW0.u();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        c5589cW0.R(format);
    }

    private C7803lb2() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
