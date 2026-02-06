package o;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* renamed from: o.ib2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7076ib2 extends AbstractC8387nv2<Date> {
    public static final InterfaceC8631ov2 b = new a();
    public final DateFormat a;

    /* renamed from: o.ib2$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() != Date.class) {
                return null;
            }
            return new C7076ib2(null);
        }
    }

    public /* synthetic */ C7076ib2(a aVar) {
        this();
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: j */
    public Date e(OV0 ov0) throws IOException {
        Date date;
        if (ov0.I() == XV0.NULL) {
            ov0.E();
            return null;
        }
        String G = ov0.G();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                date = new Date(this.a.parse(G).getTime());
                this.a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new WV0("Failed parsing '" + G + "' as SQL Date; at path " + ov0.p(), e);
            }
        }
        return date;
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: k */
    public void i(C5589cW0 c5589cW0, Date date) throws IOException {
        String format;
        if (date == null) {
            c5589cW0.u();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        c5589cW0.R(format);
    }

    private C7076ib2() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
