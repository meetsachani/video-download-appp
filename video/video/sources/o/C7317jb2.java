package o;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.jb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7317jb2 extends AbstractC9750tV {
    public C7317jb2() {
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return Time.class;
    }

    @Override // o.AbstractC9750tV
    public DateFormat q(Locale locale, TimeZone timeZone) {
        DateFormat timeInstance;
        if (locale == null) {
            timeInstance = DateFormat.getTimeInstance(3);
        } else {
            timeInstance = DateFormat.getTimeInstance(3, locale);
        }
        if (timeZone != null) {
            timeInstance.setTimeZone(timeZone);
        }
        return timeInstance;
    }

    public C7317jb2(Object obj) {
        super(obj);
    }
}
