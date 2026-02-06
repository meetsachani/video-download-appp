package o;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahEra;
import java.time.chrono.IsoEra;
import java.time.chrono.JapaneseEra;
import java.time.chrono.MinguoEra;
import java.time.chrono.ThaiBuddhistEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.function.BiFunction;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/* renamed from: o.qP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8992qP extends AbstractC10113v0 {
    public static final String k = "csvdate.not.date";
    public final SimpleDateFormat e;
    public final SimpleDateFormat f;
    public final DateTimeFormatter g;
    public final DateTimeFormatter h;
    public final BiFunction<DateTimeFormatter, String, TemporalAccessor> i;
    public final BiFunction<DateTimeFormatter, TemporalAccessor, String> j;

    public C8992qP(Class<?> cls, String str, String str2, Locale locale, String str3, String str4, String str5, String str6) {
        super(cls, str, str2, locale);
        DateTimeFormatter withChronology;
        DateTimeFormatter withChronology2;
        Chronology D = D(str5, this.b);
        Chronology D2 = D(str6, this.c);
        try {
            if (C8988qO.a().isAssignableFrom(cls)) {
                this.e = null;
                withChronology2 = F(str3, this.b).withChronology(D);
                this.g = withChronology2;
                this.i = B(cls);
            } else {
                this.g = null;
                this.i = null;
                this.e = E(str3, this.b);
            }
            try {
                if (C8988qO.a().isAssignableFrom(cls)) {
                    this.f = null;
                    withChronology = F(str4, this.c).withChronology(D2);
                    this.h = withChronology;
                    this.j = C(cls);
                    return;
                }
                this.h = null;
                this.j = null;
                this.f = E(str4, this.c);
            } catch (IllegalArgumentException e) {
                C8027mR c8027mR = new C8027mR(getClass(), String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("invalid.date.format.string"), str4));
                c8027mR.initCause(e);
                throw c8027mR;
            }
        } catch (IllegalArgumentException e2) {
            C8027mR c8027mR2 = new C8027mR(getClass(), String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("invalid.date.format.string"), str3));
            c8027mR2.initCause(e2);
            throw c8027mR2;
        }
    }

    public static /* synthetic */ TemporalAccessor A(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.MO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return C10694xN.a(temporalAccessor);
            }
        });
        return C11180zN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor i(DateTimeFormatter dateTimeFormatter, String str) {
        TemporalAccessor parse;
        ChronoField chronoField;
        int i;
        MinguoEra of;
        parse = dateTimeFormatter.parse(str);
        chronoField = ChronoField.ERA;
        i = parse.get(chronoField);
        of = MinguoEra.of(i);
        return of;
    }

    public static /* synthetic */ TemporalAccessor j(DateTimeFormatter dateTimeFormatter, String str) {
        TemporalAccessor parse;
        ChronoField chronoField;
        int i;
        ThaiBuddhistEra of;
        parse = dateTimeFormatter.parse(str);
        chronoField = ChronoField.ERA;
        i = parse.get(chronoField);
        of = ThaiBuddhistEra.of(i);
        return of;
    }

    public static /* synthetic */ TemporalAccessor k(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.bP
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return TN.a(temporalAccessor);
            }
        });
        return VN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor l(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.WO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return IN.a(temporalAccessor);
            }
        });
        return LN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor m(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.OO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return CN.a(temporalAccessor);
            }
        });
        return DN.a(parse);
    }

    public static /* synthetic */ String n(DateTimeFormatter dateTimeFormatter, TemporalAccessor temporalAccessor) {
        ZoneId of;
        LocalDateTime ofInstant;
        String format;
        Instant a = com.facebook.gamingservices.D.a(temporalAccessor);
        of = ZoneId.of("UTC");
        ofInstant = LocalDateTime.ofInstant(a, of);
        format = dateTimeFormatter.format(ofInstant);
        return format;
    }

    public static /* synthetic */ TemporalAccessor o(DateTimeFormatter dateTimeFormatter, String str) {
        TemporalAccessor parse;
        ChronoField chronoField;
        int i;
        HijrahEra of;
        parse = dateTimeFormatter.parse(str);
        chronoField = ChronoField.ERA;
        i = parse.get(chronoField);
        of = HijrahEra.of(i);
        return of;
    }

    public static /* synthetic */ TemporalAccessor p(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.IO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return C8498oN.a(temporalAccessor);
            }
        });
        return C8741pN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor q(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.ZO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                Instant from;
                from = Instant.from(temporalAccessor);
                return from;
            }
        });
        return com.facebook.gamingservices.D.a(parse);
    }

    public static /* synthetic */ TemporalAccessor r(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.JO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return C8984qN.a(temporalAccessor);
            }
        });
        return C9233rN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor s(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.LO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return C9962uN.a(temporalAccessor);
            }
        });
        return C10205vN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor t(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.HO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return C10455wO.a(temporalAccessor);
            }
        });
        return C10941yO.a(parse);
    }

    public static /* synthetic */ TemporalAccessor u(DateTimeFormatter dateTimeFormatter, String str) {
        TemporalAccessor parse;
        ChronoField chronoField;
        int i;
        IsoEra of;
        parse = dateTimeFormatter.parse(str);
        chronoField = ChronoField.ERA;
        i = parse.get(chronoField);
        of = IsoEra.of(i);
        return of;
    }

    public static /* synthetic */ TemporalAccessor v(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.KO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return C9476sN.a(temporalAccessor);
            }
        });
        return C9719tN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor w(DateTimeFormatter dateTimeFormatter, String str) {
        TemporalAccessor parse;
        ChronoField chronoField;
        int i;
        JapaneseEra of;
        parse = dateTimeFormatter.parse(str);
        chronoField = ChronoField.ERA;
        i = parse.get(chronoField);
        of = JapaneseEra.of(i);
        return of;
    }

    public static /* synthetic */ TemporalAccessor x(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.NO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return AN.a(temporalAccessor);
            }
        });
        return BN.a(parse);
    }

    public static /* synthetic */ TemporalAccessor y(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.GO
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return GN.a(temporalAccessor);
            }
        });
        return C10209vO.a(parse);
    }

    public static /* synthetic */ TemporalAccessor z(DateTimeFormatter dateTimeFormatter, String str) {
        Object parse;
        parse = dateTimeFormatter.parse(str, new TemporalQuery() { // from class: o.aP
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return RN.a(temporalAccessor);
            }
        });
        return SN.a(parse);
    }

    public final BiFunction<DateTimeFormatter, String, TemporalAccessor> B(Class<?> cls) {
        if (C8988qO.a().equals(cls)) {
            return new BiFunction() { // from class: o.hP
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    TemporalAccessor parse;
                    parse = ((DateTimeFormatter) obj).parse((String) obj2);
                    return parse;
                }
            };
        }
        if (!C8015mO.a().equals(cls) && !C8745pO.a().equals(cls)) {
            if (!C9237rO.a().equals(cls) && !C9480sO.a().equals(cls)) {
                if (C9723tO.a().equals(cls)) {
                    return new BiFunction() { // from class: o.cP
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            TemporalAccessor parseBest;
                            parseBest = ((DateTimeFormatter) obj).parseBest((String) obj2, new TemporalQuery() { // from class: o.PO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    return CN.a(temporalAccessor);
                                }
                            }, new TemporalQuery() { // from class: o.SO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    return IN.a(temporalAccessor);
                                }
                            }, new TemporalQuery() { // from class: o.TO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    Instant from;
                                    from = Instant.from(temporalAccessor);
                                    return from;
                                }
                            }, new TemporalQuery() { // from class: o.UO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    return C8498oN.a(temporalAccessor);
                                }
                            }, new TemporalQuery() { // from class: o.VO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    return KN.a(temporalAccessor);
                                }
                            }, new TemporalQuery() { // from class: o.QO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    return C9962uN.a(temporalAccessor);
                                }
                            }, new TemporalQuery() { // from class: o.RO
                                @Override // java.time.temporal.TemporalQuery
                                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                                    return GN.a(temporalAccessor);
                                }
                            });
                            return parseBest;
                        }
                    };
                }
                if (!XN.a().equals(cls) && !YN.a().equals(cls)) {
                    if (ZN.a().equals(cls)) {
                        return new BiFunction() { // from class: o.eP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.k((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C5073aO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.fP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.o((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (PN.a().equals(cls)) {
                        return new BiFunction() { // from class: o.gP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.q((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C5316bO.a().isAssignableFrom(cls)) {
                        return new BiFunction() { // from class: o.iP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.x((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C5558cO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.jP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.w((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C5801dO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.kP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.y((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C6043eO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.lP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.i((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C6541gO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.mP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.v((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C6784hO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.nP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.t((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C7027iO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.oP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.l((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C7268jO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.pP
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.s((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C7511kO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.AO
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.j((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C7754lO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.BO
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.A((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C8258nO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.CO
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.z((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    if (C8502oO.a().equals(cls)) {
                        return new BiFunction() { // from class: o.DO
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                return C8992qP.r((DateTimeFormatter) obj, (String) obj2);
                            }
                        };
                    }
                    throw new C8027mR(getClass(), String.format(ResourceBundle.getBundle(UI0.k, this.d).getString(k), cls));
                }
                return new BiFunction() { // from class: o.dP
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return C8992qP.u((DateTimeFormatter) obj, (String) obj2);
                    }
                };
            }
            return new BiFunction() { // from class: o.FO
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return C8992qP.m((DateTimeFormatter) obj, (String) obj2);
                }
            };
        }
        return new BiFunction() { // from class: o.EO
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C8992qP.p((DateTimeFormatter) obj, (String) obj2);
            }
        };
    }

    public final BiFunction<DateTimeFormatter, TemporalAccessor, String> C(Class<?> cls) {
        if (PN.a().equals(cls)) {
            return new BiFunction() { // from class: o.XO
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return C8992qP.n((DateTimeFormatter) obj, (TemporalAccessor) obj2);
                }
            };
        }
        return new BiFunction() { // from class: o.YO
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                String format;
                format = ((DateTimeFormatter) obj).format((TemporalAccessor) obj2);
                return format;
            }
        };
    }

    public final Chronology D(String str, Locale locale) {
        Chronology ofLocale;
        Chronology of;
        try {
            if (C4500Ve2.M0(str)) {
                of = Chronology.of(str);
                return of;
            }
            ofLocale = Chronology.ofLocale(locale);
            return ofLocale;
        } catch (DateTimeException e) {
            C8027mR c8027mR = new C8027mR(getClass(), String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("chronology.not.found"), str));
            c8027mR.initCause(e);
            throw c8027mR;
        }
    }

    public final SimpleDateFormat E(String str, Locale locale) {
        if (locale != null) {
            return new SimpleDateFormat(str, locale);
        }
        return new SimpleDateFormat(str);
    }

    public final DateTimeFormatter F(String str, Locale locale) {
        DateTimeFormatter ofPattern;
        DateTimeFormatter ofPattern2;
        if (this.c != null) {
            ofPattern2 = DateTimeFormatter.ofPattern(str, locale);
            return ofPattern2;
        }
        ofPattern = DateTimeFormatter.ofPattern(str);
        return ofPattern;
    }

    @Override // o.ER
    public Object a(String str) throws JR {
        Date parse;
        Date parse2;
        if (C4500Ve2.M0(str)) {
            if (Date.class.isAssignableFrom(this.a)) {
                try {
                    synchronized (this.e) {
                        parse = this.e.parse(str);
                    }
                    return this.a.getConstructor(Long.TYPE).newInstance(Long.valueOf(parse.getTime()));
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException | ParseException e) {
                    JR jr = new JR(str, this.a);
                    jr.initCause(e);
                    throw jr;
                }
            } else if (C8988qO.a().isAssignableFrom(this.a)) {
                try {
                    return this.a.cast(this.i.apply(this.g, str));
                } catch (ArithmeticException | DateTimeException e2) {
                    JR jr2 = new JR(str, this.a);
                    jr2.initCause(e2);
                    throw jr2;
                }
            } else if (!Calendar.class.isAssignableFrom(this.a) && !XMLGregorianCalendar.class.isAssignableFrom(this.a)) {
                throw new JR(str, this.a, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString(k), this.a));
            } else {
                try {
                    synchronized (this.e) {
                        parse2 = this.e.parse(str);
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(parse2);
                    Class<?> cls = this.a;
                    if (cls == XMLGregorianCalendar.class) {
                        try {
                            return cls.cast(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar));
                        } catch (DatatypeConfigurationException e3) {
                            JR jr3 = new JR(ResourceBundle.getBundle(UI0.k, this.d).getString("xmlgregoriancalendar.impossible"));
                            jr3.initCause(e3);
                            throw jr3;
                        }
                    }
                    return cls.cast(gregorianCalendar);
                } catch (ParseException e4) {
                    JR jr4 = new JR(str, this.a);
                    jr4.initCause(e4);
                    throw jr4;
                }
            }
        }
        return null;
    }

    @Override // o.AbstractC10113v0, o.ER
    public String b(Object obj) throws JR {
        Calendar calendar;
        String format;
        String format2;
        if (obj != null) {
            if (Date.class.isAssignableFrom(this.a)) {
                synchronized (this.f) {
                    format2 = this.f.format((Date) obj);
                }
                return format2;
            } else if (C8988qO.a().isAssignableFrom(this.a)) {
                try {
                    return this.j.apply(this.h, com.facebook.gamingservices.B.a(obj));
                } catch (ArithmeticException | DateTimeException e) {
                    JR jr = new JR(obj, this.a);
                    jr.initCause(e);
                    throw jr;
                }
            } else if (!Calendar.class.isAssignableFrom(this.a) && !XMLGregorianCalendar.class.isAssignableFrom(this.a)) {
                throw new JR(obj, this.a, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString(k), this.a));
            } else {
                if (obj instanceof XMLGregorianCalendar) {
                    calendar = ((XMLGregorianCalendar) obj).toGregorianCalendar();
                } else {
                    calendar = (Calendar) obj;
                }
                synchronized (this.f) {
                    format = this.f.format(calendar.getTime());
                }
                return format;
            }
        }
        return null;
    }
}
