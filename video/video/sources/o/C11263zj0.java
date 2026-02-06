package o;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: o.zj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11263zj0 extends MessageFormat {
    public static final String Y0 = "";
    public static final int Z = 31;
    public static final char Z0 = ',';
    public static final char a1 = '}';
    public static final char b1 = '{';
    public static final char c1 = '\'';
    public static final /* synthetic */ boolean d1 = false;
    private static final long serialVersionUID = -2362048321261811743L;
    public String X;
    public final Map<String, ? extends InterfaceC2703Cx0> Y;

    public C11263zj0(String str) {
        this(str, Locale.getDefault(Locale.Category.FORMAT));
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String str2;
        Format format;
        if (this.Y == null) {
            super.applyPattern(str);
            this.X = super.toPattern();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c = charArray[parsePosition.getIndex()];
            if (c != '\'') {
                if (c == '{') {
                    i2++;
                    j(str, parsePosition);
                    int index = parsePosition.getIndex();
                    int i3 = i(str, g(parsePosition));
                    sb.append('{');
                    sb.append(i3);
                    j(str, parsePosition);
                    String str3 = null;
                    if (charArray[parsePosition.getIndex()] == ',') {
                        str2 = h(str, g(parsePosition));
                        format = d(str2);
                        if (format == null) {
                            sb.append(',');
                            sb.append(str2);
                        }
                    } else {
                        str2 = null;
                        format = null;
                    }
                    arrayList.add(format);
                    if (format != null) {
                        str3 = str2;
                    }
                    arrayList2.add(str3);
                    if (arrayList.size() == i2) {
                        if (arrayList2.size() == i2) {
                            if (charArray[parsePosition.getIndex()] != '}') {
                                throw new IllegalArgumentException("Unreadable format element at position " + index);
                            }
                        } else {
                            throw new IllegalArgumentException(C11147zE2.g);
                        }
                    } else {
                        throw new IllegalArgumentException(C11147zE2.g);
                    }
                }
                sb.append(charArray[parsePosition.getIndex()]);
                g(parsePosition);
            } else {
                b(str, parsePosition, sb);
            }
        }
        super.applyPattern(sb.toString());
        this.X = f(super.toPattern(), arrayList2);
        if (c(arrayList)) {
            Format[] formats = getFormats();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Format format2 = (Format) it.next();
                if (format2 != null) {
                    formats[i] = format2;
                }
                i++;
            }
            super.setFormats(formats);
        }
    }

    public final void b(String str, ParsePosition parsePosition, StringBuilder sb) {
        if (sb != null) {
            sb.append('\'');
        }
        g(parsePosition);
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        for (int index2 = parsePosition.getIndex(); index2 < str.length(); index2++) {
            if (charArray[parsePosition.getIndex()] != '\'') {
                g(parsePosition);
            } else {
                g(parsePosition);
                if (sb != null) {
                    sb.append(charArray, index, parsePosition.getIndex() - index);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Unterminated quoted string at position " + index);
    }

    public final boolean c(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return collection.stream().anyMatch(new Predicate() { // from class: o.yj0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull(obj);
                }
            });
        }
        return false;
    }

    public final Format d(String str) {
        String str2;
        if (this.Y != null) {
            int indexOf = str.indexOf(44);
            if (indexOf > 0) {
                String trim = str.substring(0, indexOf).trim();
                str2 = str.substring(indexOf + 1).trim();
                str = trim;
            } else {
                str2 = null;
            }
            InterfaceC2703Cx0 interfaceC2703Cx0 = this.Y.get(str);
            if (interfaceC2703Cx0 != null) {
                return interfaceC2703Cx0.a(str, str2, getLocale());
            }
        }
        return null;
    }

    public final void e(String str, ParsePosition parsePosition) {
        b(str, parsePosition, null);
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C11263zj0 c11263zj0 = (C11263zj0) obj;
        if (!Objects.equals(this.X, c11263zj0.X) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.Y, c11263zj0.Y);
    }

    public final String f(String str, ArrayList<String> arrayList) {
        String str2;
        if (!c(arrayList)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        int i2 = -1;
        while (parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (charAt != '\'') {
                if (charAt != '{') {
                    if (charAt == '}') {
                        i--;
                    }
                    sb.append(charAt);
                    g(parsePosition);
                } else {
                    i++;
                    sb.append('{');
                    sb.append(i(str, g(parsePosition)));
                    if (i == 1 && (str2 = arrayList.get((i2 = i2 + 1))) != null) {
                        sb.append(',');
                        sb.append(str2);
                    }
                }
            } else {
                b(str, parsePosition, sb);
            }
        }
        return sb.toString();
    }

    public final ParsePosition g(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    public final String h(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        j(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i = 1;
        while (parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (charAt != '\'') {
                if (charAt != '{') {
                    if (charAt != '}') {
                        g(parsePosition);
                    } else {
                        i--;
                        if (i == 0) {
                            return str.substring(index2, parsePosition.getIndex());
                        }
                        g(parsePosition);
                    }
                } else {
                    i++;
                    g(parsePosition);
                }
            } else {
                e(str, parsePosition);
            }
        }
        throw new IllegalArgumentException("Unterminated format element at position " + index);
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return (((super.hashCode() * 31) + Objects.hashCode(this.Y)) * 31) + Objects.hashCode(this.X);
    }

    public final int i(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        j(str, parsePosition);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!z && parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(charAt)) {
                j(str, parsePosition);
                charAt = str.charAt(parsePosition.getIndex());
                if (charAt != ',' && charAt != '}') {
                    z = true;
                    g(parsePosition);
                }
            }
            if ((charAt == ',' || charAt == '}') && sb.length() > 0) {
                try {
                    return Integer.parseInt(sb.toString());
                } catch (NumberFormatException unused) {
                }
            }
            sb.append(charAt);
            z = !Character.isDigit(charAt);
            g(parsePosition);
        }
        if (z) {
            throw new IllegalArgumentException("Invalid format argument index at position " + index + ": " + str.substring(index, parsePosition.getIndex()));
        }
        throw new IllegalArgumentException("Unterminated format element at position " + index);
    }

    public final void j(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int b = C2937Fe2.c.k().b(charArray, parsePosition.getIndex(), 0, charArray.length);
            parsePosition.setIndex(parsePosition.getIndex() + b);
            if (b <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormats(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public String toPattern() {
        return this.X;
    }

    public C11263zj0(String str, Locale locale) {
        this(str, locale, null);
    }

    public C11263zj0(String str, Locale locale, Map<String, ? extends InterfaceC2703Cx0> map) {
        super("");
        setLocale(locale);
        this.Y = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        applyPattern(str);
    }

    public C11263zj0(String str, Map<String, ? extends InterfaceC2703Cx0> map) {
        this(str, Locale.getDefault(Locale.Category.FORMAT), map);
    }
}
