package o;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.mV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8042mV {
    String b();

    TimeZone c();

    boolean f(String str, ParsePosition parsePosition, Calendar calendar);

    Locale getLocale();

    Date h(String str, ParsePosition parsePosition);

    Date parse(String str) throws ParseException;

    Object parseObject(String str) throws ParseException;

    Object parseObject(String str, ParsePosition parsePosition);
}
