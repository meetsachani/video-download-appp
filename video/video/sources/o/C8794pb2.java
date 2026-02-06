package o;

import java.sql.Timestamp;
import java.util.Date;
import o.BY;

/* renamed from: o.pb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8794pb2 {
    public static final boolean a;
    public static final BY.b<? extends Date> b;
    public static final BY.b<? extends Date> c;
    public static final InterfaceC8631ov2 d;
    public static final InterfaceC8631ov2 e;
    public static final InterfaceC8631ov2 f;

    /* renamed from: o.pb2$a */
    /* loaded from: classes3.dex */
    public class a extends BY.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // o.BY.b
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: o.pb2$b */
    /* loaded from: classes3.dex */
    public class b extends BY.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // o.BY.b
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new a(java.sql.Date.class);
            c = new b(Timestamp.class);
            d = C7076ib2.b;
            e = C7803lb2.b;
            f = C8551ob2.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
