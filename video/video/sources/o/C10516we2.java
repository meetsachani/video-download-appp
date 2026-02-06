package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.we2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10516we2 extends AbstractC8831pl {
    public final J31 g;

    public C10516we2() {
        this(false);
    }

    @Override // o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof BigInteger) && !(obj instanceof Byte) && !(obj instanceof Short)) {
            if (!(obj instanceof Double) && !(obj instanceof BigDecimal) && !(obj instanceof Float)) {
                if (obj instanceof Date) {
                    return new SimpleDateFormat(str, this.d).format(obj);
                }
                return obj.toString();
            }
            return h(this.d, str).format(((Number) obj).doubleValue());
        }
        return h(this.d, str).format(((Number) obj).longValue());
    }

    public final DecimalFormat h(Locale locale, String str) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        if (str != null) {
            if (this.f) {
                decimalFormat.applyLocalizedPattern(str);
                return decimalFormat;
            }
            decimalFormat.applyPattern(str);
            return decimalFormat;
        }
        this.g.a("No pattern provided, using default.");
        return decimalFormat;
    }

    public C10516we2(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C10516we2(Locale locale) {
        this(locale, false);
    }

    public C10516we2(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C10516we2(Locale locale, String str) {
        this(locale, str, false);
    }

    public C10516we2(Locale locale, String str, boolean z) {
        super(locale, str, z);
        this.g = U31.q(C10516we2.class);
    }

    public C10516we2(Object obj) {
        this(obj, false);
    }

    public C10516we2(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C10516we2(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C10516we2(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C10516we2(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C10516we2(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
        this.g = U31.q(C10516we2.class);
    }
}
