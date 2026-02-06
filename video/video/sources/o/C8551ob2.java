package o;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: o.ob2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8551ob2 extends AbstractC8387nv2<Timestamp> {
    public static final InterfaceC8631ov2 b = new a();
    public final AbstractC8387nv2<Date> a;

    /* renamed from: o.ob2$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() != Timestamp.class) {
                return null;
            }
            return new C8551ob2(c5523cF0.t(Date.class), null);
        }
    }

    public /* synthetic */ C8551ob2(AbstractC8387nv2 abstractC8387nv2, a aVar) {
        this(abstractC8387nv2);
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: j */
    public Timestamp e(OV0 ov0) throws IOException {
        Date e = this.a.e(ov0);
        if (e != null) {
            return new Timestamp(e.getTime());
        }
        return null;
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: k */
    public void i(C5589cW0 c5589cW0, Timestamp timestamp) throws IOException {
        this.a.i(c5589cW0, timestamp);
    }

    public C8551ob2(AbstractC8387nv2<Date> abstractC8387nv2) {
        this.a = abstractC8387nv2;
    }
}
