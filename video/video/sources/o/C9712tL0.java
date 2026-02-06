package o;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.tL0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9712tL0 {
    public static final String a = "UTC";
    public static final TimeZone b = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    public static String b(Date date) {
        return d(date, false, b);
    }

    public static String c(Date date, boolean z) {
        return d(date, z, b);
    }

    public static String d(Date date, boolean z, TimeZone timeZone) {
        int i;
        int i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        int i3 = 19 + i;
        if (timeZone.getRawOffset() == 0) {
            i2 = 1;
        } else {
            i2 = 6;
        }
        StringBuilder sb = new StringBuilder(i3 + i2);
        f(sb, gregorianCalendar.get(1), 4);
        char c = '-';
        sb.append('-');
        f(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        f(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        f(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            f(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            if (offset >= 0) {
                c = '+';
            }
            sb.append(c);
            f(sb, abs, 2);
            sb.append(':');
            f(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static int e(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            } else {
                return i;
            }
        }
        return str.length();
    }

    public static void f(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append(C3599Ly1.j);
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00df A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date g(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int h = h(str, index, i5);
            if (a(str, i5, '-')) {
                i5 = index + 5;
            }
            int i6 = i5 + 2;
            int h2 = h(str, i5, i6);
            if (a(str, i6, '-')) {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int h3 = h(str, i6, i7);
            boolean a2 = a(str, i7, 'T');
            if (!a2 && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(h, h2 - 1, h3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i8 = i6 + 5;
                int h4 = h(str, i6 + 3, i8);
                if (a(str, i8, ':')) {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                int h5 = h(str, i8, i9);
                if (a(str, i9, ':')) {
                    i9 = i8 + 3;
                }
                if (str.length() > i9 && (charAt = str.charAt(i9)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i10 = i9 + 2;
                    i4 = h(str, i9, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a(str, i10, '.')) {
                        int i11 = i9 + 3;
                        int e = e(str, i9 + 4);
                        int min = Math.min(e, i9 + 6);
                        int h6 = h(str, i11, min);
                        int i12 = min - i11;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                h6 *= 10;
                            }
                        } else {
                            h6 *= 100;
                        }
                        i = h4;
                        i7 = e;
                        i2 = h5;
                        i3 = h6;
                    } else {
                        i = h4;
                        i7 = i10;
                        i2 = h5;
                        i3 = 0;
                    }
                    if (str.length() <= i7) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 == 'Z') {
                            timeZone = b;
                            length = i7 + 1;
                        } else {
                            if (charAt2 != '+' && charAt2 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                            }
                            String substring = str.substring(i7);
                            if (substring.length() < 5) {
                                substring = substring + ChipTextInputComboView.b.Y;
                            }
                            length = i7 + substring.length();
                            if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                                String str3 = C5663cp2.a + substring;
                                TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                                String id = timeZone2.getID();
                                if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                                }
                                timeZone = timeZone2;
                            }
                            timeZone = b;
                        }
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                        gregorianCalendar2.setLenient(false);
                        gregorianCalendar2.set(1, h);
                        gregorianCalendar2.set(2, h2 - 1);
                        gregorianCalendar2.set(5, h3);
                        gregorianCalendar2.set(11, i);
                        gregorianCalendar2.set(12, i2);
                        gregorianCalendar2.set(13, i4);
                        gregorianCalendar2.set(14, i3);
                        parsePosition.setIndex(length);
                        return gregorianCalendar2.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i7 = i9;
                i = h4;
                i2 = h5;
            } else {
                i = 0;
                i2 = 0;
            }
            i3 = 0;
            i4 = 0;
            if (str.length() <= i7) {
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            if (str != null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = C9811tl1.c + e.getClass().getName() + C9811tl1.d;
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = C9811tl1.c + e.getClass().getName() + C9811tl1.d;
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int h(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }
}
