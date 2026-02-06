package o;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: o.uV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9993uV {
    public static final long a = 1000;
    public static final long b = 60000;
    public static final long c = 3600000;
    public static final long d = 86400000;
    public static final int e = 1001;
    public static final int[][] f = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;

    /* renamed from: o.uV$a */
    /* loaded from: classes4.dex */
    public static class a implements Iterator<Calendar> {
        public final Calendar X;
        public final Calendar Y;

        public a(Calendar calendar, Calendar calendar2) {
            this.X = calendar2;
            this.Y = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Calendar next() {
            if (!this.Y.equals(this.X)) {
                this.Y.add(5, 1);
                return (Calendar) this.Y.clone();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Y.before(this.X);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.uV$b */
    /* loaded from: classes4.dex */
    public enum b {
        TRUNCATE,
        ROUND,
        CEILING
    }

    public static boolean A(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.getTime().getTime() == calendar2.getTime().getTime()) {
                return true;
            }
            return false;
        }
        throw H();
    }

    public static boolean B(Date date, Date date2) {
        if (date != null && date2 != null) {
            if (date.getTime() == date2.getTime()) {
                return true;
            }
            return false;
        }
        throw H();
    }

    public static boolean C(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(14) != calendar2.get(14) || calendar.get(13) != calendar2.get(13) || calendar.get(12) != calendar2.get(12) || calendar.get(11) != calendar2.get(11) || calendar.get(6) != calendar2.get(6) || calendar.get(1) != calendar2.get(1) || calendar.get(0) != calendar2.get(0) || calendar.getClass() != calendar2.getClass()) {
                return false;
            }
            return true;
        }
        throw H();
    }

    public static Iterator<?> D(Object obj, int i2) {
        if (obj != null) {
            if (obj instanceof Date) {
                return F((Date) obj, i2);
            }
            if (obj instanceof Calendar) {
                return E((Calendar) obj, i2);
            }
            throw new ClassCastException("Could not iterate based on " + obj);
        }
        throw H();
    }

    public static Iterator<Calendar> E(Calendar calendar, int i2) {
        Calendar a0;
        Calendar a02;
        int i3;
        if (calendar != null) {
            int i4 = 2;
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                    a0 = a0(calendar, 5);
                    a02 = a0(calendar, 5);
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                i4 = 1;
                                i3 = 7;
                                break;
                            } else {
                                i3 = calendar.get(7) + 3;
                                i4 = calendar.get(7) - 3;
                                break;
                            }
                        } else {
                            i4 = calendar.get(7);
                            i3 = i4 - 1;
                            break;
                        }
                    }
                    i3 = 1;
                    break;
                case 5:
                case 6:
                    Calendar a03 = a0(calendar, 2);
                    Calendar calendar2 = (Calendar) a03.clone();
                    calendar2.add(2, 1);
                    calendar2.add(5, -1);
                    if (i2 == 6) {
                        a02 = calendar2;
                        a0 = a03;
                        i3 = 1;
                        break;
                    } else {
                        i4 = 1;
                        a02 = calendar2;
                        a0 = a03;
                        i3 = 7;
                        break;
                    }
                default:
                    throw new IllegalArgumentException("The range style " + i2 + " is not valid.");
            }
            if (i4 < 1) {
                i4 += 7;
            }
            if (i4 > 7) {
                i4 -= 7;
            }
            if (i3 < 1) {
                i3 += 7;
            }
            if (i3 > 7) {
                i3 -= 7;
            }
            while (a0.get(7) != i4) {
                a0.add(5, -1);
            }
            while (a02.get(7) != i3) {
                a02.add(5, 1);
            }
            return new a(a0, a02);
        }
        throw H();
    }

    public static Iterator<Calendar> F(Date date, int i2) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return E(calendar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G(Calendar calendar, int i2, b bVar) {
        boolean z;
        int[][] iArr;
        char c2;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        if (calendar.get(1) <= 280000000) {
            if (i2 != 14) {
                Date time = calendar.getTime();
                long time2 = time.getTime();
                int i4 = calendar.get(14);
                b bVar2 = b.TRUNCATE;
                if (bVar2 == bVar || i4 < 500) {
                    time2 -= i4;
                }
                if (i2 == 13) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = calendar.get(13);
                if (!z && (bVar2 == bVar || i5 < 30)) {
                    time2 -= i5 * 1000;
                }
                if (i2 == 12) {
                    z = true;
                }
                int i6 = calendar.get(12);
                if (!z && (bVar2 == bVar || i6 < 30)) {
                    time2 -= i6 * 60000;
                }
                if (time.getTime() != time2) {
                    time.setTime(time2);
                    calendar.setTime(time);
                }
                boolean z6 = false;
                for (int[] iArr2 : f) {
                    for (int i7 : iArr2) {
                        if (i7 == i2) {
                            if (bVar != b.CEILING && (bVar != b.ROUND || !z6)) {
                                return;
                            }
                            if (i2 == 1001) {
                                if (calendar.get(5) == 1) {
                                    calendar.add(5, 15);
                                    return;
                                }
                                calendar.add(5, -15);
                                calendar.add(2, 1);
                                return;
                            } else if (i2 == 9) {
                                if (calendar.get(11) == 0) {
                                    calendar.add(11, 12);
                                    return;
                                }
                                calendar.add(11, -12);
                                calendar.add(5, 1);
                                return;
                            } else {
                                calendar.add(iArr2[0], 1);
                                return;
                            }
                        }
                    }
                    if (i2 != 9) {
                        if (i2 == 1001 && iArr2[0] == 5) {
                            int i8 = calendar.get(5);
                            int i9 = i8 - 1;
                            if (i9 >= 15) {
                                i9 = i8 - 16;
                            }
                            if (i9 > 7) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int i10 = i9;
                            z6 = z5;
                            i3 = i10;
                            z3 = true;
                            c2 = '\f';
                            if (!z3) {
                                int actualMinimum = calendar.getActualMinimum(iArr2[0]);
                                int actualMaximum = calendar.getActualMaximum(iArr2[0]);
                                int i11 = calendar.get(iArr2[0]) - actualMinimum;
                                if (i11 > (actualMaximum - actualMinimum) / 2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z6 = z4;
                                i3 = i11;
                            }
                            if (i3 == 0) {
                                int i12 = iArr2[0];
                                calendar.set(i12, calendar.get(i12) - i3);
                            }
                        }
                        c2 = '\f';
                        i3 = 0;
                        z3 = false;
                        if (!z3) {
                        }
                        if (i3 == 0) {
                        }
                    } else {
                        if (iArr2[0] == 11) {
                            int i13 = calendar.get(11);
                            c2 = '\f';
                            if (i13 >= 12) {
                                i13 -= 12;
                            }
                            int i14 = i13;
                            if (i14 >= 6) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z6 = z2;
                            i3 = i14;
                            z3 = true;
                            if (!z3) {
                            }
                            if (i3 == 0) {
                            }
                        }
                        c2 = '\f';
                        i3 = 0;
                        z3 = false;
                        if (!z3) {
                        }
                        if (i3 == 0) {
                        }
                    }
                }
                throw new IllegalArgumentException("The field " + i2 + " is not supported");
            }
            return;
        }
        throw new ArithmeticException("Calendar value too large for accurate calculations");
    }

    public static IllegalArgumentException H() {
        return new IllegalArgumentException("The date must not be null");
    }

    public static Date I(String str, Locale locale, String... strArr) throws ParseException {
        return M(str, locale, strArr, true);
    }

    public static Date J(String str, String... strArr) throws ParseException {
        return I(str, null, strArr);
    }

    public static Date K(String str, Locale locale, String... strArr) throws ParseException {
        return M(str, locale, strArr, false);
    }

    public static Date L(String str, String... strArr) throws ParseException {
        return K(str, null, strArr);
    }

    public static Date M(String str, Locale locale, String[] strArr, boolean z) throws ParseException {
        if (str != null && strArr != null) {
            TimeZone timeZone = TimeZone.getDefault();
            Locale m = G21.m(locale);
            ParsePosition parsePosition = new ParsePosition(0);
            Calendar calendar = Calendar.getInstance(timeZone, m);
            calendar.setLenient(z);
            for (String str2 : strArr) {
                C9083qn0 c9083qn0 = new C9083qn0(str2, timeZone, m);
                calendar.clear();
                try {
                    if (c9083qn0.f(str, parsePosition, calendar) && parsePosition.getIndex() == str.length()) {
                        return calendar.getTime();
                    }
                } catch (IllegalArgumentException unused) {
                }
                parsePosition.setIndex(0);
            }
            throw new ParseException("Unable to parse the date: " + str, -1);
        }
        throw new IllegalArgumentException("Date and Patterns must not be null");
    }

    public static Calendar N(Calendar calendar, int i2) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            G(calendar2, i2, b.ROUND);
            return calendar2;
        }
        throw H();
    }

    public static Date O(Object obj, int i2) {
        if (obj != null) {
            if (obj instanceof Date) {
                return P((Date) obj, i2);
            }
            if (obj instanceof Calendar) {
                return N((Calendar) obj, i2).getTime();
            }
            throw new ClassCastException("Could not round " + obj);
        }
        throw H();
    }

    public static Date P(Date date, int i2) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i2, b.ROUND);
        return calendar.getTime();
    }

    public static Date Q(Date date, int i2, int i3) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i2, i3);
        return calendar.getTime();
    }

    public static Date R(Date date, int i2) {
        return Q(date, 5, i2);
    }

    public static Date S(Date date, int i2) {
        return Q(date, 11, i2);
    }

    public static Date T(Date date, int i2) {
        return Q(date, 14, i2);
    }

    public static Date U(Date date, int i2) {
        return Q(date, 12, i2);
    }

    public static Date V(Date date, int i2) {
        return Q(date, 2, i2);
    }

    public static Date W(Date date, int i2) {
        return Q(date, 13, i2);
    }

    public static Date X(Date date, int i2) {
        return Q(date, 1, i2);
    }

    public static Calendar Y(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Calendar Z(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        return calendar;
    }

    public static Date a(Date date, int i2, int i3) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i2, i3);
        return calendar.getTime();
    }

    public static Calendar a0(Calendar calendar, int i2) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            G(calendar2, i2, b.TRUNCATE);
            return calendar2;
        }
        throw H();
    }

    public static Date b(Date date, int i2) {
        return a(date, 5, i2);
    }

    public static Date b0(Object obj, int i2) {
        if (obj != null) {
            if (obj instanceof Date) {
                return c0((Date) obj, i2);
            }
            if (obj instanceof Calendar) {
                return a0((Calendar) obj, i2).getTime();
            }
            throw new ClassCastException("Could not truncate " + obj);
        }
        throw H();
    }

    public static Date c(Date date, int i2) {
        return a(date, 11, i2);
    }

    public static Date c0(Date date, int i2) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i2, b.TRUNCATE);
        return calendar.getTime();
    }

    public static Date d(Date date, int i2) {
        return a(date, 14, i2);
    }

    public static int d0(Calendar calendar, Calendar calendar2, int i2) {
        return a0(calendar, i2).compareTo(a0(calendar2, i2));
    }

    public static Date e(Date date, int i2) {
        return a(date, 12, i2);
    }

    public static int e0(Date date, Date date2, int i2) {
        return c0(date, i2).compareTo(c0(date2, i2));
    }

    public static Date f(Date date, int i2) {
        return a(date, 2, i2);
    }

    public static boolean f0(Calendar calendar, Calendar calendar2, int i2) {
        if (d0(calendar, calendar2, i2) == 0) {
            return true;
        }
        return false;
    }

    public static Date g(Date date, int i2) {
        return a(date, 13, i2);
    }

    public static boolean g0(Date date, Date date2, int i2) {
        if (e0(date, date2, i2) == 0) {
            return true;
        }
        return false;
    }

    public static Date h(Date date, int i2) {
        return a(date, 3, i2);
    }

    public static void h0(Date date) {
        C11147zE2.V(date, C2730De2.j, new Object[0]);
    }

    public static Date i(Date date, int i2) {
        return a(date, 1, i2);
    }

    public static Calendar j(Calendar calendar, int i2) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            G(calendar2, i2, b.CEILING);
            return calendar2;
        }
        throw H();
    }

    public static Date k(Object obj, int i2) {
        if (obj != null) {
            if (obj instanceof Date) {
                return l((Date) obj, i2);
            }
            if (obj instanceof Calendar) {
                return j((Calendar) obj, i2).getTime();
            }
            throw new ClassCastException("Could not find ceiling of for type: " + obj.getClass());
        }
        throw H();
    }

    public static Date l(Date date, int i2) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i2, b.CEILING);
        return calendar.getTime();
    }

    public static long m(Calendar calendar, int i2, TimeUnit timeUnit) {
        int i3;
        long convert;
        if (calendar != null) {
            TimeUnit timeUnit2 = TimeUnit.DAYS;
            if (timeUnit == timeUnit2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    convert = 0;
                } else {
                    convert = timeUnit.convert(calendar.get(5) - i3, timeUnit2);
                }
            } else {
                convert = timeUnit.convert(calendar.get(6) - i3, timeUnit2);
            }
            if (i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6) {
                convert += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
            } else {
                switch (i2) {
                    case 11:
                        break;
                    case 12:
                        convert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
                        break;
                    case 13:
                        break;
                    case 14:
                        return convert;
                    default:
                        throw new IllegalArgumentException("The fragment " + i2 + " is not supported");
                }
                return convert + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
            }
            convert += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
            convert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
            return convert + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
        }
        throw H();
    }

    public static long n(Date date, int i2, TimeUnit timeUnit) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return m(calendar, i2, timeUnit);
    }

    public static long o(Calendar calendar, int i2) {
        return m(calendar, i2, TimeUnit.DAYS);
    }

    public static long p(Date date, int i2) {
        return n(date, i2, TimeUnit.DAYS);
    }

    public static long q(Calendar calendar, int i2) {
        return m(calendar, i2, TimeUnit.HOURS);
    }

    public static long r(Date date, int i2) {
        return n(date, i2, TimeUnit.HOURS);
    }

    public static long s(Calendar calendar, int i2) {
        return m(calendar, i2, TimeUnit.MILLISECONDS);
    }

    public static long t(Date date, int i2) {
        return n(date, i2, TimeUnit.MILLISECONDS);
    }

    public static long u(Calendar calendar, int i2) {
        return m(calendar, i2, TimeUnit.MINUTES);
    }

    public static long v(Date date, int i2) {
        return n(date, i2, TimeUnit.MINUTES);
    }

    public static long w(Calendar calendar, int i2) {
        return m(calendar, i2, TimeUnit.SECONDS);
    }

    public static long x(Date date, int i2) {
        return n(date, i2, TimeUnit.SECONDS);
    }

    public static boolean y(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) != calendar2.get(0) || calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                return false;
            }
            return true;
        }
        throw H();
    }

    public static boolean z(Date date, Date date2) {
        if (date != null && date2 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            return y(calendar, calendar2);
        }
        throw H();
    }
}
