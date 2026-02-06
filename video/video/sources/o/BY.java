package o;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class BY<T extends Date> extends AbstractC8387nv2<T> {
    public static final String c = "DefaultDateTypeAdapter";
    public static final InterfaceC8631ov2 d = new a();
    public final b<T> a;
    public final List<DateFormat> b;

    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() != Date.class) {
                return null;
            }
            return new BY(b.b, 2, 2, null);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public /* synthetic */ BY(b bVar, int i, int i2, a aVar) {
        this(bVar, i, i2);
    }

    public final Date j(OV0 ov0) throws IOException {
        String G = ov0.G();
        synchronized (this.b) {
            try {
                for (DateFormat dateFormat : this.b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        Date parse = dateFormat.parse(G);
                        dateFormat.setTimeZone(timeZone);
                        return parse;
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return C9712tL0.g(G, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new WV0("Failed parsing '" + G + "' as Date; at path " + ov0.p(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: k */
    public T e(OV0 ov0) throws IOException {
        if (ov0.I() == XV0.NULL) {
            ov0.E();
            return null;
        }
        return this.a.d(j(ov0));
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: l */
    public void i(C5589cW0 c5589cW0, Date date) throws IOException {
        String format;
        if (date == null) {
            c5589cW0.u();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        c5589cW0.R(format);
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public /* synthetic */ BY(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    public BY(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public BY(b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (IU0.d()) {
            arrayList.add(XE1.c(i, i2));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);
        public final Class<T> a;

        public b(Class<T> cls) {
            this.a = cls;
        }

        public final InterfaceC8631ov2 a(int i, int i2) {
            return c(new BY<>(this, i, i2, null));
        }

        public final InterfaceC8631ov2 b(String str) {
            return c(new BY<>(this, str, (a) null));
        }

        public final InterfaceC8631ov2 c(BY<T> by) {
            return C9117qv2.b(this.a, by);
        }

        public abstract T d(Date date);

        /* loaded from: classes3.dex */
        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // o.BY.b
            public Date d(Date date) {
                return date;
            }
        }
    }
}
