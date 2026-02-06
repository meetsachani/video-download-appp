package o;

import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.y42  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10864y42 extends UV {
    public C10864y42() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Object g = super.g(obj, str);
        if (g != null && !(g instanceof Short)) {
            Number number = (Number) g;
            if (number.longValue() == number.shortValue()) {
                return new Short(number.shortValue());
            }
            throw new WM("Supplied number is not of type Short: " + number.longValue());
        }
        return g;
    }

    public C10864y42(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C10864y42(Locale locale) {
        this(locale, false);
    }

    public C10864y42(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C10864y42(Locale locale, String str) {
        this(locale, str, false);
    }

    public C10864y42(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C10864y42(Object obj) {
        this(obj, false);
    }

    public C10864y42(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C10864y42(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C10864y42(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C10864y42(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C10864y42(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
