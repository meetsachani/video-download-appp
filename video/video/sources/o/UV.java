package o;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* loaded from: classes4.dex */
public class UV extends AbstractC8831pl {
    public final J31 g;

    public UV() {
        this(false);
    }

    @Override // o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        if (obj instanceof Number) {
            return obj;
        }
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(this.d);
        if (str != null) {
            if (this.f) {
                decimalFormat.applyLocalizedPattern(str);
            } else {
                decimalFormat.applyPattern(str);
            }
        } else {
            this.g.a("No pattern provided, using default.");
        }
        return decimalFormat.parse((String) obj);
    }

    public UV(boolean z) {
        this(Locale.getDefault(), z);
    }

    public UV(Locale locale) {
        this(locale, false);
    }

    public UV(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public UV(Locale locale, String str) {
        this(locale, str, false);
    }

    public UV(Locale locale, String str, boolean z) {
        super(locale, str, z);
        this.g = U31.q(UV.class);
    }

    public UV(Object obj) {
        this(obj, false);
    }

    public UV(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public UV(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public UV(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public UV(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public UV(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
        this.g = U31.q(UV.class);
    }
}
