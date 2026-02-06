package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public class CP extends AbstractC10113v0 {
    public final DecimalFormat e;
    public final DecimalFormat f;
    public final UnaryOperator<Number> g;

    public CP(Class<?> cls, String str, String str2, Locale locale, String str3, String str4) throws C8027mR {
        super(cls, str, str2, locale);
        Class<?> cls2;
        if (this.a.isPrimitive()) {
            cls2 = C8457oD.W(this.a);
        } else {
            cls2 = this.a;
        }
        if (Number.class.isAssignableFrom(cls2)) {
            DecimalFormat i = i(str3, this.b);
            this.e = i;
            Class<?> cls3 = this.a;
            if (cls3 == BigInteger.class || cls3 == BigDecimal.class) {
                i.setParseBigDecimal(true);
            }
            Class<?> cls4 = this.a;
            if (cls4 != Byte.class && cls4 != Byte.TYPE) {
                if (cls4 != Short.class && cls4 != Short.TYPE) {
                    if (cls4 != Integer.class && cls4 != Integer.TYPE) {
                        if (cls4 != Long.class && cls4 != Long.TYPE) {
                            if (cls4 != Float.class && cls4 != Float.TYPE) {
                                if (cls4 != Double.class && cls4 != Double.TYPE) {
                                    if (cls4 == BigInteger.class) {
                                        this.g = new UnaryOperator() { // from class: o.AP
                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                Number bigInteger;
                                                bigInteger = ((BigDecimal) ((Number) obj)).toBigInteger();
                                                return bigInteger;
                                            }
                                        };
                                    } else {
                                        this.g = new UnaryOperator() { // from class: o.BP
                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                return CP.g((Number) obj);
                                            }
                                        };
                                    }
                                } else {
                                    this.g = new UnaryOperator() { // from class: o.zP
                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return Double.valueOf(((Number) obj).doubleValue());
                                        }
                                    };
                                }
                            } else {
                                this.g = new UnaryOperator() { // from class: o.yP
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return Float.valueOf(((Number) obj).floatValue());
                                    }
                                };
                            }
                        } else {
                            this.g = new UnaryOperator() { // from class: o.xP
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(((Number) obj).longValue());
                                }
                            };
                        }
                    } else {
                        this.g = new UnaryOperator() { // from class: o.wP
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Integer.valueOf(((Number) obj).intValue());
                            }
                        };
                    }
                } else {
                    this.g = new UnaryOperator() { // from class: o.vP
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Short.valueOf(((Number) obj).shortValue());
                        }
                    };
                }
            } else {
                this.g = new UnaryOperator() { // from class: o.uP
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Byte.valueOf(((Number) obj).byteValue());
                    }
                };
            }
            this.f = i(str4, this.c);
            return;
        }
        throw new C8027mR(CP.class, ResourceBundle.getBundle(UI0.k, this.d).getString("csvnumber.not.number"));
    }

    public static /* synthetic */ Number g(Number number) {
        return number;
    }

    @Override // o.ER
    public Object a(String str) throws JR {
        Number parse;
        if (C4500Ve2.N0(str)) {
            try {
                synchronized (this.e) {
                    parse = this.e.parse(str);
                }
                return (Number) this.g.apply(parse);
            } catch (ParseException e) {
                JR jr = new JR(str, this.a, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("unparsable.number"), str, this.e.toPattern()));
                jr.initCause(e);
                throw jr;
            }
        }
        return null;
    }

    @Override // o.AbstractC10113v0, o.ER
    public String b(Object obj) {
        String format;
        synchronized (this.f) {
            if (obj != null) {
                try {
                    format = this.f.format(obj);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                format = null;
            }
        }
        return format;
    }

    public final DecimalFormat i(String str, Locale locale) {
        NumberFormat numberFormat = NumberFormat.getInstance((Locale) C11304zt1.t(locale, Locale.getDefault(Locale.Category.FORMAT)));
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            try {
                decimalFormat.applyLocalizedPattern(str);
                return decimalFormat;
            } catch (IllegalArgumentException e) {
                C8027mR c8027mR = new C8027mR(CP.class, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("invalid.number.pattern"), str));
                c8027mR.initCause(e);
                throw c8027mR;
            }
        }
        throw new C8027mR(CP.class, ResourceBundle.getBundle(UI0.k, this.d).getString("numberformat.not.decimalformat"));
    }
}
