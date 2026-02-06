package o;

import java.text.ParseException;
import java.util.Locale;

/* loaded from: classes4.dex */
public class N41 extends UV {
    public N41() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Object g = super.g(obj, str);
        if (g != null && !(g instanceof Long)) {
            return new Long(((Number) g).longValue());
        }
        return g;
    }

    public N41(boolean z) {
        this(Locale.getDefault(), z);
    }

    public N41(Locale locale) {
        this(locale, false);
    }

    public N41(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public N41(Locale locale, String str) {
        this(locale, str, false);
    }

    public N41(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public N41(Object obj) {
        this(obj, false);
    }

    public N41(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public N41(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public N41(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public N41(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public N41(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
