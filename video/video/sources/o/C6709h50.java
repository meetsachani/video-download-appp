package o;

import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.h50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6709h50 extends UV {
    public C6709h50() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Number number = (Number) super.g(obj, str);
        if (number instanceof Long) {
            return new Double(number.doubleValue());
        }
        return number;
    }

    public C6709h50(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C6709h50(Locale locale) {
        this(locale, false);
    }

    public C6709h50(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C6709h50(Locale locale, String str) {
        this(locale, str, false);
    }

    public C6709h50(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C6709h50(Object obj) {
        this(obj, false);
    }

    public C6709h50(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C6709h50(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C6709h50(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C6709h50(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C6709h50(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
