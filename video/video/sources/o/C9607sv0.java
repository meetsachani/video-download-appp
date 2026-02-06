package o;

import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.sv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9607sv0 extends UV {
    public C9607sv0() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Number number = (Number) super.g(obj, str);
        double doubleValue = number.doubleValue();
        if (doubleValue < 0.0d) {
            doubleValue *= -1.0d;
        }
        if (doubleValue != 0.0d && (doubleValue < 1.401298464324817E-45d || doubleValue > 3.4028234663852886E38d)) {
            throw new WM("Supplied number is not of type Float: " + number);
        }
        return new Float(number.floatValue());
    }

    public C9607sv0(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C9607sv0(Locale locale) {
        this(locale, false);
    }

    public C9607sv0(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C9607sv0(Locale locale, String str) {
        this(locale, str, false);
    }

    public C9607sv0(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C9607sv0(Object obj) {
        this(obj, false);
    }

    public C9607sv0(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C9607sv0(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C9607sv0(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C9607sv0(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C9607sv0(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
