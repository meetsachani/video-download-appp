package o;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.lV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7781lV extends AbstractC8831pl {
    public static final String i = j();
    public final J31 g;
    public boolean h;

    public C7781lV() {
        this(false);
    }

    public static String j() {
        return new DateFormatSymbols(Locale.US).getLocalPatternChars();
    }

    @Override // o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        DateFormat simpleDateFormat;
        if (obj instanceof Date) {
            return obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (this.f) {
            str = h(str, this.d);
        }
        if (str == null) {
            simpleDateFormat = DateFormat.getDateInstance(3, this.d);
        } else {
            simpleDateFormat = new SimpleDateFormat(str, this.d);
        }
        simpleDateFormat.setLenient(this.h);
        ParsePosition parsePosition = new ParsePosition(0);
        String obj2 = obj.toString();
        Object parseObject = simpleDateFormat.parseObject(obj2, parsePosition);
        if (parsePosition.getErrorIndex() <= -1) {
            if (parsePosition.getIndex() >= obj2.length()) {
                return parseObject;
            }
            throw new WM("Date '" + obj + "' contains unparsed characters from position=" + parsePosition.getIndex());
        }
        throw new WM("Error parsing date '" + obj + "' at position=" + parsePosition.getErrorIndex());
    }

    public final String h(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        String localPatternChars = new DateFormatSymbols(locale).getLocalPatternChars();
        String str2 = i;
        if (str2.equals(localPatternChars)) {
            return str;
        }
        try {
            return i(str, localPatternChars, str2);
        } catch (Exception e) {
            J31 j31 = this.g;
            j31.l("Converting pattern '" + str + "' for " + locale, e);
            return null;
        }
    }

    public final String i(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                if (charAt == '\'') {
                    z = false;
                }
            } else if (charAt == '\'') {
                z = true;
            } else if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                int indexOf = str2.indexOf(charAt);
                if (indexOf != -1) {
                    charAt = str3.charAt(indexOf);
                } else {
                    throw new IllegalArgumentException("Illegal pattern character '" + charAt + "'");
                }
            }
            sb.append(charAt);
        }
        if (!z) {
            return sb.toString();
        }
        throw new IllegalArgumentException("Unfinished quote in pattern");
    }

    public boolean k() {
        return this.h;
    }

    public void l(boolean z) {
        this.h = z;
    }

    public C7781lV(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C7781lV(Locale locale) {
        this(locale, false);
    }

    public C7781lV(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C7781lV(Locale locale, String str) {
        this(locale, str, false);
    }

    public C7781lV(Locale locale, String str, boolean z) {
        super(locale, str, z);
        this.g = U31.q(C7781lV.class);
        this.h = false;
    }

    public C7781lV(Object obj) {
        this(obj, false);
    }

    public C7781lV(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C7781lV(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C7781lV(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C7781lV(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C7781lV(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
        this.g = U31.q(C7781lV.class);
        this.h = false;
    }
}
