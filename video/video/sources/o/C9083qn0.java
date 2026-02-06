package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.qn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9083qn0 implements InterfaceC8042mV, Serializable {
    private static final long serialVersionUID = 3;
    public final String X;
    public final TimeZone Y;
    public final int Y0;
    public final Locale Z;
    public final int Z0;
    public transient List<l> a1;
    public static final Locale b1 = new Locale("ja", "JP", "JP");
    public static final Comparator<String> c1 = Comparator.reverseOrder();
    public static final ConcurrentMap<Locale, k>[] d1 = new ConcurrentMap[17];
    public static final k e1 = new a(1);
    public static final k f1 = new b(2);
    public static final k g1 = new i(1);
    public static final k h1 = new i(3);
    public static final k i1 = new i(4);
    public static final k j1 = new i(6);
    public static final k k1 = new i(5);
    public static final k l1 = new c(7);
    public static final k m1 = new i(8);
    public static final k n1 = new i(11);
    public static final k o1 = new d(11);
    public static final k p1 = new e(10);
    public static final k q1 = new i(10);
    public static final k r1 = new i(12);
    public static final k s1 = new i(13);
    public static final k t1 = new i(14);

    /* renamed from: o.qn0$a */
    /* loaded from: classes4.dex */
    public static class a extends i {
        public a(int i) {
            super(i);
        }

        @Override // o.C9083qn0.i
        public int c(C9083qn0 c9083qn0, int i) {
            if (i < 100) {
                return c9083qn0.l(i);
            }
            return i;
        }
    }

    /* renamed from: o.qn0$b */
    /* loaded from: classes4.dex */
    public static class b extends i {
        public b(int i) {
            super(i);
        }

        @Override // o.C9083qn0.i
        public int c(C9083qn0 c9083qn0, int i) {
            return i - 1;
        }
    }

    /* renamed from: o.qn0$c */
    /* loaded from: classes4.dex */
    public static class c extends i {
        public c(int i) {
            super(i);
        }

        @Override // o.C9083qn0.i
        public int c(C9083qn0 c9083qn0, int i) {
            if (i == 7) {
                return 1;
            }
            return i + 1;
        }
    }

    /* renamed from: o.qn0$d */
    /* loaded from: classes4.dex */
    public static class d extends i {
        public d(int i) {
            super(i);
        }

        @Override // o.C9083qn0.i
        public int c(C9083qn0 c9083qn0, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: o.qn0$e */
    /* loaded from: classes4.dex */
    public static class e extends i {
        public e(int i) {
            super(i);
        }

        @Override // o.C9083qn0.i
        public int c(C9083qn0 c9083qn0, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: o.qn0$f */
    /* loaded from: classes4.dex */
    public static class f extends j {
        public final int b;
        public final Locale c;
        public final Map<String, Integer> d;

        public f(int i, Calendar calendar, Locale locale) {
            super(null);
            this.b = i;
            this.c = G21.m(locale);
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)");
            this.d = C9083qn0.m(calendar, locale, i, sb);
            sb.setLength(sb.length() - 1);
            sb.append(C9811tl1.d);
            d(sb);
        }

        @Override // o.C9083qn0.j
        public void e(C9083qn0 c9083qn0, Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.c);
            Integer num = this.d.get(lowerCase);
            if (num == null) {
                Map<String, Integer> map = this.d;
                num = map.get(lowerCase + '.');
            }
            calendar.set(this.b, num.intValue());
        }

        @Override // o.C9083qn0.j
        public String toString() {
            return "CaseInsensitiveTextStrategy [field=" + this.b + ", locale=" + this.c + ", lKeyValues=" + this.d + ", pattern=" + this.a + C6566gU0.g;
        }
    }

    /* renamed from: o.qn0$g */
    /* loaded from: classes4.dex */
    public static class g extends k {
        public final String a;

        public g(String str) {
            super(null);
            this.a = str;
        }

        @Override // o.C9083qn0.k
        public boolean a() {
            return false;
        }

        @Override // o.C9083qn0.k
        public boolean b(C9083qn0 c9083qn0, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.a.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else if (this.a.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.a.length() + parsePosition.getIndex());
            return true;
        }

        public String toString() {
            return "CopyQuotedStrategy [formatField=" + this.a + C6566gU0.g;
        }
    }

    /* renamed from: o.qn0$h */
    /* loaded from: classes4.dex */
    public static class h extends j {
        public static final k b = new h("(Z|(?:[+-]\\d{2}))");
        public static final k c = new h("(Z|(?:[+-]\\d{2}\\d{2}))");
        public static final k d = new h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        public h(String str) {
            super(null);
            c(str);
        }

        public static k g(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return d;
                    }
                    throw new IllegalArgumentException("invalid number of X");
                }
                return c;
            }
            return b;
        }

        @Override // o.C9083qn0.j
        public void e(C9083qn0 c9083qn0, Calendar calendar, String str) {
            calendar.setTimeZone(C11279zn0.b(str));
        }
    }

    /* renamed from: o.qn0$j */
    /* loaded from: classes4.dex */
    public static abstract class j extends k {
        public Pattern a;

        public j() {
            super(null);
        }

        @Override // o.C9083qn0.k
        public boolean a() {
            return false;
        }

        @Override // o.C9083qn0.k
        public boolean b(C9083qn0 c9083qn0, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            e(c9083qn0, calendar, matcher.group(1));
            return true;
        }

        public void c(String str) {
            this.a = Pattern.compile(str);
        }

        public void d(StringBuilder sb) {
            c(sb.toString());
        }

        public abstract void e(C9083qn0 c9083qn0, Calendar calendar, String str);

        public String toString() {
            return getClass().getSimpleName() + " [pattern=" + this.a + C6566gU0.g;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* renamed from: o.qn0$k */
    /* loaded from: classes4.dex */
    public static abstract class k {
        public k() {
        }

        public boolean a() {
            return false;
        }

        public abstract boolean b(C9083qn0 c9083qn0, Calendar calendar, String str, ParsePosition parsePosition, int i);

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* renamed from: o.qn0$l */
    /* loaded from: classes4.dex */
    public static class l {
        public final k a;
        public final int b;

        public l(k kVar, int i) {
            this.a = kVar;
            this.b = i;
        }

        public int a(ListIterator<l> listIterator) {
            if (this.a.a() && listIterator.hasNext()) {
                k kVar = listIterator.next().a;
                listIterator.previous();
                if (kVar.a()) {
                    return this.b;
                }
            }
            return 0;
        }

        public String toString() {
            return "StrategyAndWidth [strategy=" + this.a + ", width=" + this.b + C6566gU0.g;
        }
    }

    /* renamed from: o.qn0$m */
    /* loaded from: classes4.dex */
    public class m {
        public final Calendar a;
        public int b;

        public m(Calendar calendar) {
            this.a = calendar;
        }

        public l a() {
            if (this.b >= C9083qn0.this.X.length()) {
                return null;
            }
            char charAt = C9083qn0.this.X.charAt(this.b);
            if (C9083qn0.r(charAt)) {
                return b(charAt);
            }
            return c();
        }

        public final l b(char c) {
            int i = this.b;
            do {
                int i2 = this.b + 1;
                this.b = i2;
                if (i2 >= C9083qn0.this.X.length()) {
                    break;
                }
            } while (C9083qn0.this.X.charAt(this.b) == c);
            int i3 = this.b - i;
            return new l(C9083qn0.this.p(c, i3, this.a), i3);
        }

        public final l c() {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.b < C9083qn0.this.X.length()) {
                char charAt = C9083qn0.this.X.charAt(this.b);
                if (!z && C9083qn0.r(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i = this.b + 1;
                    this.b = i;
                    if (i == C9083qn0.this.X.length() || C9083qn0.this.X.charAt(this.b) != '\'') {
                        z = !z;
                    }
                }
                this.b++;
                sb.append(charAt);
            }
            if (!z) {
                String sb2 = sb.toString();
                return new l(new g(sb2), sb2.length());
            }
            throw new IllegalArgumentException("Unterminated quote");
        }
    }

    /* renamed from: o.qn0$n */
    /* loaded from: classes4.dex */
    public static class n extends j {
        public static final String d = "[+-]\\d{4}";
        public static final String e = "GMT[+-]\\d{1,2}:\\d{2}";
        public static final int f = 0;
        public final Locale b;
        public final Map<String, a> c;

        /* renamed from: o.qn0$n$a */
        /* loaded from: classes4.dex */
        public static class a {
            public final TimeZone a;
            public final int b;

            public a(TimeZone timeZone, boolean z) {
                int i;
                this.a = timeZone;
                if (z) {
                    i = timeZone.getDSTSavings();
                } else {
                    i = 0;
                }
                this.b = i;
            }
        }

        public n(Locale locale) {
            super(null);
            String[][] zoneStrings;
            this.c = new HashMap();
            this.b = G21.m(locale);
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(C9083qn0.c1);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase(C5663cp2.a)) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i != 3) {
                            if (i == 5) {
                                aVar2 = aVar;
                            }
                        } else {
                            aVar2 = new a(timeZone, true);
                        }
                        String str2 = strArr[i];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str3 : treeSet) {
                sb.append('|');
                C9083qn0.s(sb, str3);
            }
            sb.append(C9811tl1.d);
            d(sb);
        }

        @Override // o.C9083qn0.j
        public void e(C9083qn0 c9083qn0, Calendar calendar, String str) {
            TimeZone b = C11279zn0.b(str);
            if (b != null) {
                calendar.setTimeZone(b);
                return;
            }
            String lowerCase = str.toLowerCase(this.b);
            a aVar = this.c.get(lowerCase);
            if (aVar == null) {
                Map<String, a> map = this.c;
                aVar = map.get(lowerCase + '.');
            }
            calendar.set(16, aVar.b);
            calendar.set(15, aVar.a.getRawOffset());
        }

        @Override // o.C9083qn0.j
        public String toString() {
            return "TimeZoneStrategy [locale=" + this.b + ", tzNames=" + this.c + ", pattern=" + this.a + C6566gU0.g;
        }
    }

    public C9083qn0(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static Map<String, Integer> m(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Locale m2 = G21.m(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, m2);
        TreeSet treeSet = new TreeSet(c1);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(m2);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            s(sb, (String) it.next()).append('|');
        }
        return hashMap;
    }

    public static ConcurrentMap<Locale, k> n(int i2) {
        ConcurrentMap<Locale, k> concurrentMap;
        ConcurrentMap<Locale, k>[] concurrentMapArr = d1;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i2] == null) {
                    concurrentMapArr[i2] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i2];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    public static boolean r(char c2) {
        if (c2 < 'A' || c2 > 'Z') {
            if (c2 >= 'a' && c2 <= 'z') {
                return true;
            }
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        q(Calendar.getInstance(this.Y, this.Z));
    }

    public static StringBuilder s(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '$' && charAt != '.' && charAt != '?' && charAt != '^' && charAt != '[' && charAt != '\\' && charAt != '{' && charAt != '|') {
                switch (charAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        sb.append(charAt);
                }
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    @Override // o.InterfaceC8042mV, o.InterfaceC8285nV
    public String b() {
        return this.X;
    }

    @Override // o.InterfaceC8042mV, o.InterfaceC8285nV
    public TimeZone c() {
        return this.Y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9083qn0)) {
            return false;
        }
        C9083qn0 c9083qn0 = (C9083qn0) obj;
        if (!this.X.equals(c9083qn0.X) || !this.Y.equals(c9083qn0.Y) || !this.Z.equals(c9083qn0.Z)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC8042mV
    public boolean f(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<l> listIterator = this.a1.listIterator();
        while (listIterator.hasNext()) {
            l next = listIterator.next();
            String str2 = str;
            ParsePosition parsePosition2 = parsePosition;
            Calendar calendar2 = calendar;
            if (!next.a.b(this, calendar2, str2, parsePosition2, next.a(listIterator))) {
                return false;
            }
            calendar = calendar2;
            str = str2;
            parsePosition = parsePosition2;
        }
        return true;
    }

    @Override // o.InterfaceC8042mV, o.InterfaceC8285nV
    public Locale getLocale() {
        return this.Z;
    }

    @Override // o.InterfaceC8042mV
    public Date h(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.Y, this.Z);
        calendar.clear();
        if (f(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    public int hashCode() {
        return this.X.hashCode() + ((this.Y.hashCode() + (this.Z.hashCode() * 13)) * 13);
    }

    public final int l(int i2) {
        int i3 = this.Y0 + i2;
        if (i2 >= this.Z0) {
            return i3;
        }
        return i3 + 100;
    }

    public final k o(int i2, Calendar calendar) {
        k fVar;
        ConcurrentMap<Locale, k> n2 = n(i2);
        k kVar = n2.get(this.Z);
        if (kVar == null) {
            if (i2 == 15) {
                fVar = new n(this.Z);
            } else {
                fVar = new f(i2, calendar, this.Z);
            }
            k putIfAbsent = n2.putIfAbsent(this.Z, fVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return fVar;
        }
        return kVar;
    }

    public final k p(char c2, int i2, Calendar calendar) {
        if (c2 != 'y') {
            if (c2 != 'z') {
                switch (c2) {
                    case 'D':
                        return j1;
                    case 'E':
                        return o(7, calendar);
                    case 'F':
                        return m1;
                    case 'G':
                        return o(0, calendar);
                    case 'H':
                        return n1;
                    default:
                        switch (c2) {
                            case 'K':
                                return q1;
                            case 'M':
                                if (i2 >= 3) {
                                    return o(2, calendar);
                                }
                                return f1;
                            case 'S':
                                return t1;
                            case 'a':
                                return o(9, calendar);
                            case 'd':
                                return k1;
                            case 'h':
                                return p1;
                            case 'k':
                                return o1;
                            case 'm':
                                return r1;
                            case 's':
                                return s1;
                            case 'u':
                                return l1;
                            case 'w':
                                return h1;
                            default:
                                switch (c2) {
                                    case 'W':
                                        return i1;
                                    case 'X':
                                        return h.g(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return h.d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c2 + "' not supported");
                                }
                        }
                }
            }
            return o(15, calendar);
        }
        if (i2 > 2) {
            return g1;
        }
        return e1;
    }

    @Override // o.InterfaceC8042mV
    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date h2 = h(str, parsePosition);
        if (h2 == null) {
            if (this.Z.equals(b1)) {
                throw new ParseException("(The " + this.Z + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
            }
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        return h2;
    }

    @Override // o.InterfaceC8042mV
    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public final void q(Calendar calendar) {
        this.a1 = new ArrayList();
        m mVar = new m(calendar);
        while (true) {
            l a2 = mVar.a();
            if (a2 == null) {
                return;
            }
            this.a1.add(a2);
        }
    }

    public String t() {
        return "FastDateParser [pattern=" + this.X + ", timeZone=" + this.Y + ", locale=" + this.Z + ", century=" + this.Y0 + ", startYear=" + this.Z0 + ", patterns=" + this.a1 + C6566gU0.g;
    }

    public String toString() {
        return "FastDateParser[" + this.X + C6566gU0.h + this.Z + C6566gU0.h + this.Y.getID() + C6566gU0.g;
    }

    public C9083qn0(String str, TimeZone timeZone, Locale locale, Date date) {
        int i2;
        this.X = str;
        this.Y = timeZone;
        Locale m2 = G21.m(locale);
        this.Z = m2;
        Calendar calendar = Calendar.getInstance(timeZone, m2);
        if (date != null) {
            calendar.setTime(date);
            i2 = calendar.get(1);
        } else if (m2.equals(b1)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.Y0 = i3;
        this.Z0 = i2 - i3;
        q(calendar);
    }

    @Override // o.InterfaceC8042mV
    public Object parseObject(String str, ParsePosition parsePosition) {
        return h(str, parsePosition);
    }

    /* renamed from: o.qn0$i */
    /* loaded from: classes4.dex */
    public static class i extends k {
        public final int a;

        public i(int i) {
            super(null);
            this.a = i;
        }

        @Override // o.C9083qn0.k
        public boolean a() {
            return true;
        }

        @Override // o.C9083qn0.k
        public boolean b(C9083qn0 c9083qn0, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.a, c(c9083qn0, parseInt));
            return true;
        }

        public String toString() {
            return "NumberStrategy [field=" + this.a + C6566gU0.g;
        }

        public int c(C9083qn0 c9083qn0, int i) {
            return i;
        }
    }
}
