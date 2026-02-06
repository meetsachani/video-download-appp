package o;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.mb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8064mb2 extends AbstractC9750tV {
    public C8064mb2() {
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return Timestamp.class;
    }

    @Override // o.AbstractC9750tV
    public DateFormat q(Locale locale, TimeZone timeZone) {
        DateFormat dateTimeInstance;
        if (locale == null) {
            dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(3, 3, locale);
        }
        if (timeZone != null) {
            dateTimeInstance.setTimeZone(timeZone);
        }
        return dateTimeInstance;
    }

    public C8064mb2(Object obj) {
        super(obj);
    }
}
