package o;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.nV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8285nV {
    String b();

    TimeZone c();

    @Deprecated
    StringBuffer d(long j, StringBuffer stringBuffer);

    @Deprecated
    StringBuffer e(Date date, StringBuffer stringBuffer);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    <B extends Appendable> B g(Calendar calendar, B b);

    Locale getLocale();

    String i(Date date);

    @Deprecated
    StringBuffer j(Calendar calendar, StringBuffer stringBuffer);

    String k(long j);

    <B extends Appendable> B l(long j, B b);

    <B extends Appendable> B m(Date date, B b);

    String n(Calendar calendar);
}
