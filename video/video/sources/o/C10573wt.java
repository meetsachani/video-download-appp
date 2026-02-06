package o;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.wt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10573wt extends AbstractC3697My1 {
    public static final Pattern m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
    public static final long[] n = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f906o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    public final String b;
    public final long c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String[] i;
    public final String j;
    public final double k;
    public final double l;

    public C10573wt(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(EnumC3795Ny1.CALENDAR);
        boolean z;
        long j;
        this.b = str;
        try {
            long s = s(str2);
            this.c = s;
            if (str3 == null) {
                long u = u(str4);
                if (u < 0) {
                    j = -1;
                } else {
                    j = s + u;
                }
                this.e = j;
            } else {
                try {
                    this.e = s(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            int length = str2.length();
            boolean z2 = false;
            if (length == 8) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            if (str3 != null && str3.length() == 8) {
                z2 = true;
            }
            this.f = z2;
            this.g = str5;
            this.h = str6;
            this.i = strArr;
            this.j = str7;
            this.k = d;
            this.l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    public static String e(boolean z, long j) {
        DateFormat dateTimeInstance;
        if (j < 0) {
            return null;
        }
        if (z) {
            dateTimeInstance = DateFormat.getDateInstance(2);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateTimeInstance.format(Long.valueOf(j));
    }

    public static long s(String str) throws ParseException {
        if (f906o.matcher(str).matches()) {
            if (str.length() == 8) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C5663cp2.a));
                return simpleDateFormat.parse(str).getTime();
            } else if (str.length() == 16 && str.charAt(15) == 'Z') {
                long t = t(str.substring(0, 15));
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                long j = t + gregorianCalendar.get(15);
                gregorianCalendar.setTime(new Date(j));
                return j + gregorianCalendar.get(16);
            } else {
                return t(str);
            }
        }
        throw new ParseException(str, 0);
    }

    public static long t(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    public static long u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = n;
            if (i < jArr.length) {
                int i2 = i + 1;
                String group = matcher.group(i2);
                if (group != null) {
                    j += jArr[i] * Integer.parseInt(group);
                }
                i = i2;
            } else {
                return j;
            }
        }
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC3697My1.c(this.b, sb);
        AbstractC3697My1.c(e(this.d, this.c), sb);
        AbstractC3697My1.c(e(this.f, this.e), sb);
        AbstractC3697My1.c(this.g, sb);
        AbstractC3697My1.c(this.h, sb);
        AbstractC3697My1.d(this.i, sb);
        AbstractC3697My1.c(this.j, sb);
        return sb.toString();
    }

    public String[] f() {
        return this.i;
    }

    public String g() {
        return this.j;
    }

    @Deprecated
    public Date h() {
        if (this.e < 0) {
            return null;
        }
        return new Date(this.e);
    }

    public long i() {
        return this.e;
    }

    public double j() {
        return this.k;
    }

    public String k() {
        return this.g;
    }

    public double l() {
        return this.l;
    }

    public String m() {
        return this.h;
    }

    @Deprecated
    public Date n() {
        return new Date(this.c);
    }

    public long o() {
        return this.c;
    }

    public String p() {
        return this.b;
    }

    public boolean q() {
        return this.f;
    }

    public boolean r() {
        return this.d;
    }
}
