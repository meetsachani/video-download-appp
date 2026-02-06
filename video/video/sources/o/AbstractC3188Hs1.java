package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.Hs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3188Hs1 extends AbstractC9141r0 {
    public static final Integer j = new Integer(0);
    public static final Integer k = new Integer(1);
    public String f;
    public final boolean g;
    public boolean h;
    public Locale i;

    public AbstractC3188Hs1(boolean z) {
        this.g = z;
    }

    @Override // o.AbstractC9141r0
    public String f(Object obj) throws Throwable {
        if (this.h && (obj instanceof Number)) {
            NumberFormat p = p();
            p.setGroupingUsed(false);
            String format = p.format(obj);
            if (m().c()) {
                J31 m = m();
                m.a("    Converted  to String using format '" + format + "'");
            }
            return format;
        }
        String obj2 = obj.toString();
        if (m().c()) {
            J31 m2 = m();
            m2.a("    Converted  to String using toString() '" + obj2 + "'");
        }
        return obj2;
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        Number x;
        Integer num;
        Class<?> cls2 = obj.getClass();
        if (obj instanceof Number) {
            return (T) y(cls2, cls, (Number) obj);
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                num = k;
            } else {
                num = j;
            }
            return (T) y(cls2, cls, num);
        } else if ((obj instanceof Date) && Long.class.equals(cls)) {
            return cls.cast(new Long(((Date) obj).getTime()));
        } else {
            if ((obj instanceof Calendar) && Long.class.equals(cls)) {
                return cls.cast(new Long(((Calendar) obj).getTime().getTime()));
            }
            String trim = obj.toString().trim();
            if (trim.length() == 0) {
                return (T) k(cls);
            }
            if (this.h) {
                x = t(cls2, cls, trim, p());
            } else {
                if (m().c()) {
                    m().a("    No NumberFormat, using default conversion");
                }
                x = x(cls2, cls, trim);
            }
            return (T) y(cls2, cls, x);
        }
    }

    public final NumberFormat p() {
        NumberFormat numberFormat;
        if (this.f != null) {
            if (this.i == null) {
                if (m().c()) {
                    J31 m = m();
                    m.a("    Using pattern '" + this.f + "'");
                }
                numberFormat = new DecimalFormat(this.f);
            } else {
                if (m().c()) {
                    J31 m2 = m();
                    m2.a("    Using pattern '" + this.f + "' with Locale[" + this.i + C6566gU0.g);
                }
                numberFormat = new DecimalFormat(this.f, new DecimalFormatSymbols(this.i));
            }
        } else if (this.i == null) {
            if (m().c()) {
                m().a("    Using default Locale format");
            }
            numberFormat = NumberFormat.getInstance();
        } else {
            if (m().c()) {
                J31 m3 = m();
                m3.a("    Using Locale[" + this.i + "] format");
            }
            numberFormat = NumberFormat.getInstance(this.i);
        }
        if (!this.g) {
            numberFormat.setParseIntegerOnly(true);
        }
        return numberFormat;
    }

    public Locale q() {
        return this.i;
    }

    public String r() {
        return this.f;
    }

    public boolean s() {
        return this.g;
    }

    public final Number t(Class<?> cls, Class<?> cls2, String str, NumberFormat numberFormat) {
        ParsePosition parsePosition = new ParsePosition(0);
        Number parse = numberFormat.parse(str, parsePosition);
        if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() == str.length() && parse != null) {
            return parse;
        }
        String str2 = "Error converting from '" + o(cls) + "' to '" + o(cls2) + "'";
        if (numberFormat instanceof DecimalFormat) {
            str2 = str2 + " using pattern '" + ((DecimalFormat) numberFormat).toPattern() + "'";
        }
        if (this.i != null) {
            str2 = str2 + " for locale=[" + this.i + C6566gU0.g;
        }
        if (m().c()) {
            m().a("    " + str2);
        }
        throw new WM(str2);
    }

    @Override // o.AbstractC9141r0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(o(getClass()));
        sb.append("[UseDefault=");
        sb.append(l());
        sb.append(", UseLocaleFormat=");
        sb.append(this.h);
        if (this.f != null) {
            sb.append(", Pattern=");
            sb.append(this.f);
        }
        if (this.i != null) {
            sb.append(", Locale=");
            sb.append(this.i);
        }
        sb.append(']');
        return sb.toString();
    }

    public void u(Locale locale) {
        this.i = locale;
        w(true);
    }

    public void v(String str) {
        this.f = str;
        w(true);
    }

    public void w(boolean z) {
        this.h = z;
    }

    public final Number x(Class<?> cls, Class<?> cls2, String str) {
        if (cls2.equals(Byte.class)) {
            return new Byte(str);
        }
        if (cls2.equals(Short.class)) {
            return new Short(str);
        }
        if (cls2.equals(Integer.class)) {
            return new Integer(str);
        }
        if (cls2.equals(Long.class)) {
            return new Long(str);
        }
        if (cls2.equals(Float.class)) {
            return new Float(str);
        }
        if (cls2.equals(Double.class)) {
            return new Double(str);
        }
        if (cls2.equals(BigDecimal.class)) {
            return new BigDecimal(str);
        }
        if (cls2.equals(BigInteger.class)) {
            return new BigInteger(str);
        }
        String str2 = o(getClass()) + " cannot handle conversion from '" + o(cls) + "' to '" + o(cls2) + "'";
        if (m().b()) {
            m().q("    " + str2);
        }
        throw new WM(str2);
    }

    public final <T> T y(Class<?> cls, Class<T> cls2, Number number) {
        if (cls2.equals(number.getClass())) {
            return cls2.cast(number);
        }
        if (cls2.equals(Byte.class)) {
            long longValue = number.longValue();
            if (longValue <= 127) {
                if (longValue >= -128) {
                    return cls2.cast(new Byte(number.byteValue()));
                }
                throw new WM(o(cls) + " value '" + number + "' is too small " + o(cls2));
            }
            throw new WM(o(cls) + " value '" + number + "' is too large for " + o(cls2));
        } else if (cls2.equals(Short.class)) {
            long longValue2 = number.longValue();
            if (longValue2 <= 32767) {
                if (longValue2 >= -32768) {
                    return cls2.cast(new Short(number.shortValue()));
                }
                throw new WM(o(cls) + " value '" + number + "' is too small " + o(cls2));
            }
            throw new WM(o(cls) + " value '" + number + "' is too large for " + o(cls2));
        } else if (cls2.equals(Integer.class)) {
            long longValue3 = number.longValue();
            if (longValue3 <= 2147483647L) {
                if (longValue3 >= -2147483648L) {
                    return cls2.cast(new Integer(number.intValue()));
                }
                throw new WM(o(cls) + " value '" + number + "' is too small " + o(cls2));
            }
            throw new WM(o(cls) + " value '" + number + "' is too large for " + o(cls2));
        } else if (cls2.equals(Long.class)) {
            return cls2.cast(new Long(number.longValue()));
        } else {
            if (cls2.equals(Float.class)) {
                if (number.doubleValue() <= 3.4028234663852886E38d) {
                    return cls2.cast(new Float(number.floatValue()));
                }
                throw new WM(o(cls) + " value '" + number + "' is too large for " + o(cls2));
            } else if (cls2.equals(Double.class)) {
                return cls2.cast(new Double(number.doubleValue()));
            } else {
                if (cls2.equals(BigDecimal.class)) {
                    if (!(number instanceof Float) && !(number instanceof Double)) {
                        if (number instanceof BigInteger) {
                            return cls2.cast(new BigDecimal((BigInteger) number));
                        }
                        if (number instanceof BigDecimal) {
                            return cls2.cast(new BigDecimal(number.toString()));
                        }
                        return cls2.cast(BigDecimal.valueOf(number.longValue()));
                    }
                    return cls2.cast(new BigDecimal(number.toString()));
                } else if (cls2.equals(BigInteger.class)) {
                    if (number instanceof BigDecimal) {
                        return cls2.cast(((BigDecimal) number).toBigInteger());
                    }
                    return cls2.cast(BigInteger.valueOf(number.longValue()));
                } else {
                    String str = o(getClass()) + " cannot handle conversion to '" + o(cls2) + "'";
                    if (m().b()) {
                        m().q("    " + str);
                    }
                    throw new WM(str);
                }
            }
        }
    }

    public AbstractC3188Hs1(boolean z, Object obj) {
        this.g = z;
        n(obj);
    }
}
