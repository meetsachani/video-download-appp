package o;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.tV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9750tV extends AbstractC9141r0 {
    public String[] f;
    public String g;
    public Locale h;
    public TimeZone i;
    public boolean j;

    public AbstractC9750tV() {
    }

    public void A(TimeZone timeZone) {
        this.i = timeZone;
    }

    public void B(boolean z) {
        this.j = z;
    }

    public final <T> T C(Class<T> cls, long j) {
        Calendar calendar;
        if (cls.equals(Date.class)) {
            return cls.cast(new Date(j));
        }
        if (cls.equals(java.sql.Date.class)) {
            return cls.cast(new java.sql.Date(j));
        }
        if (cls.equals(Time.class)) {
            return cls.cast(new Time(j));
        }
        if (cls.equals(Timestamp.class)) {
            return cls.cast(new Timestamp(j));
        }
        if (cls.equals(Calendar.class)) {
            Locale locale = this.h;
            if (locale == null && this.i == null) {
                calendar = Calendar.getInstance();
            } else if (locale == null) {
                calendar = Calendar.getInstance(this.i);
            } else {
                TimeZone timeZone = this.i;
                if (timeZone == null) {
                    calendar = Calendar.getInstance(locale);
                } else {
                    calendar = Calendar.getInstance(timeZone, locale);
                }
            }
            calendar.setTime(new Date(j));
            calendar.setLenient(false);
            return cls.cast(calendar);
        }
        String str = o(getClass()) + " cannot handle conversion to '" + o(cls) + "'";
        if (m().b()) {
            m().q("    " + str);
        }
        throw new WM(str);
    }

    public final <T> T D(Class<T> cls, String str) {
        if (cls.equals(java.sql.Date.class)) {
            try {
                return cls.cast(java.sql.Date.valueOf(str));
            } catch (IllegalArgumentException unused) {
                throw new WM("String must be in JDBC format [yyyy-MM-dd] to create a java.sql.Date");
            }
        } else if (cls.equals(Time.class)) {
            try {
                return cls.cast(Time.valueOf(str));
            } catch (IllegalArgumentException unused2) {
                throw new WM("String must be in JDBC format [HH:mm:ss] to create a java.sql.Time");
            }
        } else if (cls.equals(Timestamp.class)) {
            try {
                return cls.cast(Timestamp.valueOf(str));
            } catch (IllegalArgumentException unused3) {
                throw new WM("String must be in JDBC format [yyyy-MM-dd HH:mm:ss.fffffffff] to create a java.sql.Timestamp");
            }
        } else {
            String str2 = o(getClass()) + " does not support default String to '" + o(cls) + "' conversion.";
            if (m().b()) {
                m().q("    " + str2);
                m().q("    (N.B. Re-configure Converter or use alternative implementation)");
            }
            throw new WM(str2);
        }
    }

    @Override // o.AbstractC9141r0
    public String f(Object obj) throws Throwable {
        Date date;
        DateFormat q;
        if (obj instanceof Date) {
            date = (Date) obj;
        } else if (obj instanceof Calendar) {
            date = ((Calendar) obj).getTime();
        } else if (obj instanceof Long) {
            date = new Date(((Long) obj).longValue());
        } else {
            date = null;
        }
        if (this.j && date != null) {
            String[] strArr = this.f;
            if (strArr != null && strArr.length > 0) {
                q = p(strArr[0]);
            } else {
                q = q(this.h, this.i);
            }
            u("Formatting", q);
            String format = q.format(date);
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
    public <T> T g(Class<T> cls, Object obj) throws Exception {
        Calendar w;
        Class<?> cls2 = obj.getClass();
        if (obj instanceof Timestamp) {
            Timestamp timestamp = (Timestamp) obj;
            return (T) C(cls, ((timestamp.getTime() / 1000) * 1000) + (timestamp.getNanos() / 1000000));
        } else if (obj instanceof Date) {
            return (T) C(cls, ((Date) obj).getTime());
        } else {
            if (obj instanceof Calendar) {
                return (T) C(cls, ((Calendar) obj).getTime().getTime());
            }
            if (obj instanceof Long) {
                return (T) C(cls, ((Long) obj).longValue());
            }
            String trim = obj.toString().trim();
            if (trim.length() == 0) {
                return (T) k(cls);
            }
            if (this.j) {
                String[] strArr = this.f;
                if (strArr != null && strArr.length > 0) {
                    w = v(cls2, cls, trim);
                } else {
                    w = w(cls2, cls, trim, q(this.h, this.i));
                }
                if (Calendar.class.isAssignableFrom(cls)) {
                    return cls.cast(w);
                }
                return (T) C(cls, w.getTime().getTime());
            }
            return (T) D(cls, trim);
        }
    }

    public final DateFormat p(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        TimeZone timeZone = this.i;
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }

    public DateFormat q(Locale locale, TimeZone timeZone) {
        DateFormat dateInstance;
        if (locale == null) {
            dateInstance = DateFormat.getDateInstance(3);
        } else {
            dateInstance = DateFormat.getDateInstance(3, locale);
        }
        if (timeZone != null) {
            dateInstance.setTimeZone(timeZone);
        }
        return dateInstance;
    }

    public Locale r() {
        return this.h;
    }

    public String[] s() {
        return this.f;
    }

    public TimeZone t() {
        return this.i;
    }

    @Override // o.AbstractC9141r0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(o(getClass()));
        sb.append("[UseDefault=");
        sb.append(l());
        sb.append(", UseLocaleFormat=");
        sb.append(this.j);
        if (this.g != null) {
            sb.append(", Patterns={");
            sb.append(this.g);
            sb.append('}');
        }
        if (this.h != null) {
            sb.append(", Locale=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", TimeZone=");
            sb.append(this.i);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void u(String str, DateFormat dateFormat) {
        if (m().c()) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("    ");
            sb.append(str);
            sb.append(" with Format");
            if (dateFormat instanceof SimpleDateFormat) {
                sb.append(C6566gU0.f);
                sb.append(((SimpleDateFormat) dateFormat).toPattern());
                sb.append(C6566gU0.g);
            }
            sb.append(" for ");
            if (this.h == null) {
                sb.append("default locale");
            } else {
                sb.append("locale[");
                sb.append(this.h);
                sb.append(C6566gU0.g);
            }
            if (this.i != null) {
                sb.append(", TimeZone[");
                sb.append(this.i);
                sb.append(C6566gU0.g);
            }
            m().a(sb.toString());
        }
    }

    public final Calendar v(Class<?> cls, Class<?> cls2, String str) throws Exception {
        Exception exc = null;
        for (String str2 : this.f) {
            try {
                return w(cls, cls2, str, p(str2));
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.f.length > 1) {
            throw new WM("Error converting '" + o(cls) + "' to '" + o(cls2) + "' using  patterns '" + this.g + "'");
        }
        throw exc;
    }

    public final Calendar w(Class<?> cls, Class<?> cls2, String str, DateFormat dateFormat) {
        u("Parsing", dateFormat);
        dateFormat.setLenient(false);
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = dateFormat.parse(str, parsePosition);
        if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() == str.length() && parse != null) {
            return dateFormat.getCalendar();
        }
        String str2 = "Error converting '" + o(cls) + "' to '" + o(cls2) + "'";
        if (dateFormat instanceof SimpleDateFormat) {
            str2 = str2 + " using pattern '" + ((SimpleDateFormat) dateFormat).toPattern() + "'";
        }
        if (m().c()) {
            m().a("    " + str2);
        }
        throw new WM(str2);
    }

    public void x(Locale locale) {
        this.h = locale;
        B(true);
    }

    public void y(String str) {
        z(new String[]{str});
    }

    public void z(String[] strArr) {
        this.f = strArr;
        if (strArr != null && strArr.length > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    sb.append(C6566gU0.h);
                }
                sb.append(strArr[i]);
            }
            this.g = sb.toString();
        }
        B(true);
    }

    public AbstractC9750tV(Object obj) {
        super(obj);
    }
}
