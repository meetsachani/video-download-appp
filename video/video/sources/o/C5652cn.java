package o;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.cn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5652cn extends UV {
    public C5652cn() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Object g = super.g(obj, str);
        if (g != null && !(g instanceof BigDecimal)) {
            try {
                return new BigDecimal(g.toString());
            } catch (NumberFormatException unused) {
                throw new WM("Suplied number is not of type BigDecimal: " + g);
            }
        }
        return g;
    }

    public C5652cn(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C5652cn(Locale locale) {
        this(locale, false);
    }

    public C5652cn(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C5652cn(Locale locale, String str) {
        this(locale, str, false);
    }

    public C5652cn(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C5652cn(Object obj) {
        this(obj, false);
    }

    public C5652cn(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C5652cn(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C5652cn(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C5652cn(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C5652cn(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
