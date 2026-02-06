package o;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.pn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8840pn0 extends Format implements InterfaceC8042mV, InterfaceC8285nV {
    public static final int Y0 = 1;
    public static final int Z = 0;
    public static final int Z0 = 2;
    public static final int a1 = 3;
    public static final AbstractC2507Ax0<C8840pn0> b1 = new a();
    private static final long serialVersionUID = 2;
    public final C9332rn0 X;
    public final C9083qn0 Y;

    /* renamed from: o.pn0$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC2507Ax0<C8840pn0> {
        @Override // o.AbstractC2507Ax0
        /* renamed from: i */
        public C8840pn0 a(String str, TimeZone timeZone, Locale locale) {
            return new C8840pn0(str, timeZone, locale);
        }
    }

    public C8840pn0(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static C8840pn0 A(String str, TimeZone timeZone) {
        return b1.f(str, timeZone, null);
    }

    public static C8840pn0 B(String str, TimeZone timeZone, Locale locale) {
        return b1.f(str, timeZone, locale);
    }

    public static C8840pn0 D(int i) {
        return b1.h(i, null, null);
    }

    public static C8840pn0 E(int i, Locale locale) {
        return b1.h(i, null, locale);
    }

    public static C8840pn0 F(int i, TimeZone timeZone) {
        return b1.h(i, timeZone, null);
    }

    public static C8840pn0 G(int i, TimeZone timeZone, Locale locale) {
        return b1.h(i, timeZone, locale);
    }

    public static C8840pn0 p(int i) {
        return b1.b(i, null, null);
    }

    public static C8840pn0 q(int i, Locale locale) {
        return b1.b(i, null, locale);
    }

    public static C8840pn0 r(int i, TimeZone timeZone) {
        return b1.b(i, timeZone, null);
    }

    public static C8840pn0 s(int i, TimeZone timeZone, Locale locale) {
        return b1.b(i, timeZone, locale);
    }

    public static C8840pn0 t(int i, int i2) {
        return b1.c(i, i2, null, null);
    }

    public static C8840pn0 u(int i, int i2, Locale locale) {
        return b1.c(i, i2, null, locale);
    }

    public static C8840pn0 v(int i, int i2, TimeZone timeZone) {
        return w(i, i2, timeZone, null);
    }

    public static C8840pn0 w(int i, int i2, TimeZone timeZone, Locale locale) {
        return b1.c(i, i2, timeZone, locale);
    }

    public static C8840pn0 x() {
        return b1.e();
    }

    public static C8840pn0 y(String str) {
        return b1.f(str, null, null);
    }

    public static C8840pn0 z(String str, Locale locale) {
        return b1.f(str, null, locale);
    }

    public int C() {
        return this.X.t();
    }

    @Override // o.InterfaceC8042mV, o.InterfaceC8285nV
    public String b() {
        return this.X.b();
    }

    @Override // o.InterfaceC8042mV, o.InterfaceC8285nV
    public TimeZone c() {
        return this.X.c();
    }

    @Override // o.InterfaceC8285nV
    @Deprecated
    public StringBuffer d(long j, StringBuffer stringBuffer) {
        return this.X.d(j, stringBuffer);
    }

    @Override // o.InterfaceC8285nV
    @Deprecated
    public StringBuffer e(Date date, StringBuffer stringBuffer) {
        return this.X.e(date, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8840pn0)) {
            return false;
        }
        return this.X.equals(((C8840pn0) obj).X);
    }

    @Override // o.InterfaceC8042mV
    public boolean f(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.Y.f(str, parsePosition, calendar);
    }

    @Override // java.text.Format, o.InterfaceC8285nV
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.X.s(obj));
        return stringBuffer;
    }

    @Override // o.InterfaceC8285nV
    public <B extends Appendable> B g(Calendar calendar, B b) {
        return (B) this.X.g(calendar, b);
    }

    @Override // o.InterfaceC8042mV, o.InterfaceC8285nV
    public Locale getLocale() {
        return this.X.getLocale();
    }

    @Override // o.InterfaceC8042mV
    public Date h(String str, ParsePosition parsePosition) {
        return this.Y.h(str, parsePosition);
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // o.InterfaceC8285nV
    public String i(Date date) {
        return this.X.i(date);
    }

    @Override // o.InterfaceC8285nV
    @Deprecated
    public StringBuffer j(Calendar calendar, StringBuffer stringBuffer) {
        return this.X.j(calendar, stringBuffer);
    }

    @Override // o.InterfaceC8285nV
    public String k(long j) {
        return this.X.k(j);
    }

    @Override // o.InterfaceC8285nV
    public <B extends Appendable> B l(long j, B b) {
        return (B) this.X.l(j, b);
    }

    @Override // o.InterfaceC8285nV
    public <B extends Appendable> B m(Date date, B b) {
        return (B) this.X.m(date, b);
    }

    @Override // o.InterfaceC8285nV
    public String n(Calendar calendar) {
        return this.X.n(calendar);
    }

    @Deprecated
    public StringBuffer o(Calendar calendar, StringBuffer stringBuffer) {
        return this.X.q(calendar, stringBuffer);
    }

    @Override // o.InterfaceC8042mV
    public Date parse(String str) throws ParseException {
        return this.Y.parse(str);
    }

    @Override // java.text.Format, o.InterfaceC8042mV
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.Y.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.X.b() + "," + this.X.getLocale() + "," + this.X.c().getID() + C6566gU0.g;
    }

    public C8840pn0(String str, TimeZone timeZone, Locale locale, Date date) {
        this.X = new C9332rn0(str, timeZone, locale);
        this.Y = new C9083qn0(str, timeZone, locale, date);
    }
}
