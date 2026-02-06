package o;

import java.text.ParseException;
import java.util.Locale;

/* loaded from: classes4.dex */
public class OR0 extends UV {
    public OR0() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Number number = (Number) super.g(obj, str);
        if (number.longValue() == number.intValue()) {
            return new Integer(number.intValue());
        }
        throw new WM("Suplied number is not of type Integer: " + number.longValue());
    }

    public OR0(boolean z) {
        this(Locale.getDefault(), z);
    }

    public OR0(Locale locale) {
        this(locale, false);
    }

    public OR0(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public OR0(Locale locale, String str) {
        this(locale, str, false);
    }

    public OR0(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public OR0(Object obj) {
        this(obj, false);
    }

    public OR0(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public OR0(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public OR0(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public OR0(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public OR0(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
