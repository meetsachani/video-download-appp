package o;

import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.bs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5430bs extends UV {
    public C5430bs() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Number number = (Number) super.g(obj, str);
        if (number.longValue() == number.byteValue()) {
            return new Byte(number.byteValue());
        }
        throw new WM("Supplied number is not of type Byte: " + number.longValue());
    }

    public C5430bs(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C5430bs(Locale locale) {
        this(locale, false);
    }

    public C5430bs(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C5430bs(Locale locale, String str) {
        this(locale, str, false);
    }

    public C5430bs(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C5430bs(Object obj) {
        this(obj, false);
    }

    public C5430bs(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C5430bs(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C5430bs(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C5430bs(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C5430bs(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
