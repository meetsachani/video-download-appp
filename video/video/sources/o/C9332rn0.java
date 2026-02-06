package o;

import com.google.firebase.crashlytics.internal.send.ReportQueue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.rn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9332rn0 implements InterfaceC8285nV, Serializable {
    public static final int b1 = 0;
    public static final int c1 = 1;
    public static final int d1 = 2;
    public static final int e1 = 3;
    public static final int f1 = 10;
    private static final long serialVersionUID = 1;
    public final String X;
    public final TimeZone Y;
    public transient f[] Y0;
    public final Locale Z;
    public transient int Z0;
    public static final f[] a1 = new f[0];
    public static final ConcurrentMap<i, String> g1 = new ConcurrentHashMap(7);

    /* renamed from: o.rn0$a */
    /* loaded from: classes4.dex */
    public static class a implements f {
        public final char a;

        public a(char c) {
            this.a = c;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return 1;
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.a);
        }
    }

    /* renamed from: o.rn0$b */
    /* loaded from: classes4.dex */
    public static class b implements d {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return this.a.a();
        }

        @Override // o.C9332rn0.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = 7;
            int i2 = calendar.get(7);
            d dVar = this.a;
            if (i2 != 1) {
                i = i2 - 1;
            }
            dVar.b(appendable, i);
        }
    }

    /* renamed from: o.rn0$c */
    /* loaded from: classes4.dex */
    public static class c implements f {
        public static final c b = new c(3);
        public static final c c = new c(5);
        public static final c d = new c(6);
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public static c d(int i) {
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

        @Override // o.C9332rn0.f
        public int a() {
            return this.a;
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i == 0) {
                appendable.append("Z");
                return;
            }
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / ReportQueue.n;
            C9332rn0.h(appendable, i2);
            int i3 = this.a;
            if (i3 < 5) {
                return;
            }
            if (i3 == 6) {
                appendable.append(':');
            }
            C9332rn0.h(appendable, (i / 60000) - (i2 * 60));
        }
    }

    /* renamed from: o.rn0$d */
    /* loaded from: classes4.dex */
    public interface d extends f {
        void b(Appendable appendable, int i) throws IOException;
    }

    /* renamed from: o.rn0$e */
    /* loaded from: classes4.dex */
    public static class e implements d {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            if (i2 >= 3) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // o.C9332rn0.f
        public int a() {
            return this.b;
        }

        @Override // o.C9332rn0.d
        public final void b(Appendable appendable, int i) throws IOException {
            C9332rn0.o(appendable, i, this.b);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.a));
        }
    }

    /* renamed from: o.rn0$f */
    /* loaded from: classes4.dex */
    public interface f {
        int a();

        void c(Appendable appendable, Calendar calendar) throws IOException;
    }

    /* renamed from: o.rn0$g */
    /* loaded from: classes4.dex */
    public static class g implements f {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return this.a.length();
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.a);
        }
    }

    /* renamed from: o.rn0$h */
    /* loaded from: classes4.dex */
    public static class h implements f {
        public final int a;
        public final String[] b;

        public h(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        @Override // o.C9332rn0.f
        public int a() {
            int length = this.b.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    int length2 = this.b[length].length();
                    if (length2 > i) {
                        i = length2;
                    }
                } else {
                    return i;
                }
            }
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.b[calendar.get(this.a)]);
        }
    }

    /* renamed from: o.rn0$i */
    /* loaded from: classes4.dex */
    public static class i {
        public final TimeZone a;
        public final int b;
        public final Locale c;

        public i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.a = timeZone;
            if (z) {
                this.b = Integer.MIN_VALUE | i;
            } else {
                this.b = i;
            }
            this.c = G21.m(locale);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.a.equals(iVar.a) && this.b == iVar.b && this.c.equals(iVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.b * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }
    }

    /* renamed from: o.rn0$j */
    /* loaded from: classes4.dex */
    public static class j implements f {
        public final Locale a;
        public final int b;
        public final String c;
        public final String d;

        public j(TimeZone timeZone, Locale locale, int i) {
            this.a = G21.m(locale);
            this.b = i;
            this.c = C9332rn0.u(timeZone, false, i, locale);
            this.d = C9332rn0.u(timeZone, true, i, locale);
        }

        @Override // o.C9332rn0.f
        public int a() {
            return Math.max(this.c.length(), this.d.length());
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(C9332rn0.u(timeZone, false, this.b, this.a));
            } else {
                appendable.append(C9332rn0.u(timeZone, true, this.b, this.a));
            }
        }
    }

    /* renamed from: o.rn0$k */
    /* loaded from: classes4.dex */
    public static class k implements f {
        public static final k b = new k(true);
        public static final k c = new k(false);
        public final boolean a;

        public k(boolean z) {
            this.a = z;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return 5;
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / ReportQueue.n;
            C9332rn0.h(appendable, i2);
            if (this.a) {
                appendable.append(':');
            }
            C9332rn0.h(appendable, (i / 60000) - (i2 * 60));
        }
    }

    /* renamed from: o.rn0$l */
    /* loaded from: classes4.dex */
    public static class l implements d {
        public final d a;

        public l(d dVar) {
            this.a = dVar;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return this.a.a();
        }

        @Override // o.C9332rn0.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.a.b(appendable, i);
        }
    }

    /* renamed from: o.rn0$m */
    /* loaded from: classes4.dex */
    public static class m implements d {
        public final d a;

        public m(d dVar) {
            this.a = dVar;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return this.a.a();
        }

        @Override // o.C9332rn0.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.a.b(appendable, i);
        }
    }

    /* renamed from: o.rn0$n */
    /* loaded from: classes4.dex */
    public static class n implements d {
        public static final n a = new n();

        @Override // o.C9332rn0.f
        public int a() {
            return 2;
        }

        @Override // o.C9332rn0.d
        public final void b(Appendable appendable, int i) throws IOException {
            C9332rn0.h(appendable, i);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    /* renamed from: o.rn0$o */
    /* loaded from: classes4.dex */
    public static class o implements d {
        public final int a;

        public o(int i) {
            this.a = i;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return 2;
        }

        @Override // o.C9332rn0.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                C9332rn0.h(appendable, i);
            } else {
                C9332rn0.o(appendable, i, 2);
            }
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.a));
        }
    }

    /* renamed from: o.rn0$p */
    /* loaded from: classes4.dex */
    public static class p implements d {
        public static final p a = new p();

        @Override // o.C9332rn0.f
        public int a() {
            return 2;
        }

        @Override // o.C9332rn0.d
        public final void b(Appendable appendable, int i) throws IOException {
            C9332rn0.h(appendable, i % 100);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(1) % 100);
        }
    }

    /* renamed from: o.rn0$q */
    /* loaded from: classes4.dex */
    public static class q implements d {
        public static final q a = new q();

        @Override // o.C9332rn0.f
        public int a() {
            return 2;
        }

        @Override // o.C9332rn0.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i >= 10) {
                C9332rn0.h(appendable, i);
            } else {
                appendable.append((char) (i + 48));
            }
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    /* renamed from: o.rn0$r */
    /* loaded from: classes4.dex */
    public static class r implements d {
        public final int a;

        public r(int i) {
            this.a = i;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return 4;
        }

        @Override // o.C9332rn0.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                C9332rn0.h(appendable, i);
            } else {
                C9332rn0.o(appendable, i, 1);
            }
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.a));
        }
    }

    /* renamed from: o.rn0$s */
    /* loaded from: classes4.dex */
    public static class s implements d {
        public final d a;

        public s(d dVar) {
            this.a = dVar;
        }

        @Override // o.C9332rn0.f
        public int a() {
            return this.a.a();
        }

        @Override // o.C9332rn0.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // o.C9332rn0.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            this.a.b(appendable, calendar.getWeekYear());
        }
    }

    public C9332rn0(String str, TimeZone timeZone, Locale locale) {
        this.X = str;
        this.Y = timeZone;
        this.Z = G21.m(locale);
        v();
    }

    public static void h(Appendable appendable, int i2) throws IOException {
        appendable.append((char) ((i2 / 10) + 48));
        appendable.append((char) ((i2 % 10) + 48));
    }

    public static void o(Appendable appendable, int i2, int i3) throws IOException {
        int i4;
        if (i2 < 10000) {
            if (i2 < 1000) {
                if (i2 < 100) {
                    if (i2 < 10) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 3;
                }
            } else {
                i4 = 4;
            }
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                appendable.append(C3599Ly1.j);
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            appendable.append((char) ((i2 / 1000) + 48));
                            i2 %= 1000;
                        } else {
                            return;
                        }
                    }
                    if (i2 >= 100) {
                        appendable.append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        appendable.append(C3599Ly1.j);
                    }
                }
                if (i2 >= 10) {
                    appendable.append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    appendable.append(C3599Ly1.j);
                }
            }
            appendable.append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i6++;
        }
        while (i6 < i3) {
            appendable.append(C3599Ly1.j);
            i3--;
        }
        while (true) {
            i6--;
            if (i6 >= 0) {
                appendable.append(cArr[i6]);
            } else {
                return;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        v();
    }

    public static String u(TimeZone timeZone, boolean z, int i2, Locale locale) {
        i iVar = new i(timeZone, z, i2, locale);
        ConcurrentMap<i, String> concurrentMap = g1;
        String str = concurrentMap.get(iVar);
        if (str == null) {
            String displayName = timeZone.getDisplayName(z, i2, locale);
            String putIfAbsent = concurrentMap.putIfAbsent(iVar, displayName);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return displayName;
        }
        return str;
    }

    @Override // o.InterfaceC8285nV
    public String b() {
        return this.X;
    }

    @Override // o.InterfaceC8285nV
    public TimeZone c() {
        return this.Y;
    }

    @Override // o.InterfaceC8285nV
    public StringBuffer d(long j2, StringBuffer stringBuffer) {
        Calendar w = w();
        w.setTimeInMillis(j2);
        return (StringBuffer) p(w, stringBuffer);
    }

    @Override // o.InterfaceC8285nV
    public StringBuffer e(Date date, StringBuffer stringBuffer) {
        Calendar w = w();
        w.setTime(date);
        return (StringBuffer) p(w, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9332rn0)) {
            return false;
        }
        C9332rn0 c9332rn0 = (C9332rn0) obj;
        if (!this.X.equals(c9332rn0.X) || !this.Y.equals(c9332rn0.Y) || !this.Z.equals(c9332rn0.Z)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC8285nV
    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String name;
        if (obj instanceof Date) {
            return e((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return j((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return d(((Long) obj).longValue(), stringBuffer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        if (obj == null) {
            name = "<null>";
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // o.InterfaceC8285nV
    public <B extends Appendable> B g(Calendar calendar, B b2) {
        if (!calendar.getTimeZone().equals(this.Y)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.Y);
        }
        return (B) p(calendar, b2);
    }

    @Override // o.InterfaceC8285nV
    public Locale getLocale() {
        return this.Z;
    }

    public int hashCode() {
        return this.X.hashCode() + ((this.Y.hashCode() + (this.Z.hashCode() * 13)) * 13);
    }

    @Override // o.InterfaceC8285nV
    public String i(Date date) {
        Calendar w = w();
        w.setTime(date);
        return r(w);
    }

    @Override // o.InterfaceC8285nV
    public StringBuffer j(Calendar calendar, StringBuffer stringBuffer) {
        return e(calendar.getTime(), stringBuffer);
    }

    @Override // o.InterfaceC8285nV
    public String k(long j2) {
        Calendar w = w();
        w.setTimeInMillis(j2);
        return r(w);
    }

    @Override // o.InterfaceC8285nV
    public <B extends Appendable> B l(long j2, B b2) {
        Calendar w = w();
        w.setTimeInMillis(j2);
        return (B) p(w, b2);
    }

    @Override // o.InterfaceC8285nV
    public <B extends Appendable> B m(Date date, B b2) {
        Calendar w = w();
        w.setTime(date);
        return (B) p(w, b2);
    }

    @Override // o.InterfaceC8285nV
    public String n(Calendar calendar) {
        return ((StringBuilder) g(calendar, new StringBuilder(this.Z0))).toString();
    }

    public final <B extends Appendable> B p(Calendar calendar, B b2) {
        try {
            for (f fVar : this.Y0) {
                fVar.c(b2, calendar);
            }
            return b2;
        } catch (IOException e2) {
            C10761xf0.z(e2);
            return b2;
        }
    }

    @Deprecated
    public StringBuffer q(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) p(calendar, stringBuffer);
    }

    public final String r(Calendar calendar) {
        return ((StringBuilder) p(calendar, new StringBuilder(this.Z0))).toString();
    }

    public String s(Object obj) {
        String name;
        if (obj instanceof Date) {
            return i((Date) obj);
        }
        if (obj instanceof Calendar) {
            return n((Calendar) obj);
        }
        if (obj instanceof Long) {
            return k(((Long) obj).longValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        if (obj == null) {
            name = "<null>";
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public int t() {
        return this.Z0;
    }

    public String toString() {
        return "FastDatePrinter[" + this.X + "," + this.Z + "," + this.Y.getID() + C6566gU0.g;
    }

    public final void v() {
        f[] fVarArr = (f[]) x().toArray(a1);
        this.Y0 = fVarArr;
        int length = fVarArr.length;
        int i2 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i2 += this.Y0[length].a();
            } else {
                this.Z0 = i2;
                return;
            }
        }
    }

    public final Calendar w() {
        return Calendar.getInstance(this.Y, this.Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [o.rn0$j] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v44, types: [o.rn0$h] */
    /* JADX WARN: Type inference failed for: r11v5, types: [o.rn0$d] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    public List<f> x() {
        int i2;
        ?? r11;
        Object gVar;
        String[] strArr;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.Z);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.X.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int[] iArr = {i4};
            String y = y(this.X, iArr);
            int i5 = iArr[i3];
            int length2 = y.length();
            if (length2 != 0) {
                char charAt = y.charAt(i3);
                if (charAt != 'y') {
                    if (charAt != 'z') {
                        switch (charAt) {
                            case '\'':
                                String substring = y.substring(1);
                                if (substring.length() == 1) {
                                    gVar = new a(substring.charAt(0));
                                } else {
                                    gVar = new g(substring);
                                }
                                r11 = gVar;
                                i2 = 0;
                                break;
                            case 'K':
                                r11 = z(10, length2);
                                i2 = 0;
                                break;
                            case 'M':
                                if (length2 >= 4) {
                                    r11 = new h(2, months);
                                } else if (length2 == 3) {
                                    r11 = new h(2, shortMonths);
                                } else if (length2 == 2) {
                                    r11 = n.a;
                                } else {
                                    r11 = q.a;
                                }
                                i2 = 0;
                                break;
                            case 'S':
                                r11 = z(14, length2);
                                i2 = 0;
                                break;
                            case 'a':
                                r11 = new h(9, amPmStrings);
                                i2 = 0;
                                break;
                            case 'd':
                                r11 = z(5, length2);
                                i2 = 0;
                                break;
                            case 'h':
                                r11 = new l(z(10, length2));
                                i2 = 0;
                                break;
                            case 'k':
                                r11 = new m(z(11, length2));
                                i2 = 0;
                                break;
                            case 'm':
                                r11 = z(12, length2);
                                i2 = 0;
                                break;
                            case 's':
                                r11 = z(13, length2);
                                i2 = 0;
                                break;
                            case 'u':
                                r11 = new b(z(7, length2));
                                i2 = 0;
                                break;
                            case 'w':
                                r11 = z(3, length2);
                                i2 = 0;
                                break;
                            default:
                                switch (charAt) {
                                    case 'D':
                                        r11 = z(6, length2);
                                        i2 = 0;
                                        break;
                                    case 'E':
                                        if (length2 < 4) {
                                            strArr = shortWeekdays;
                                        } else {
                                            strArr = weekdays;
                                        }
                                        r11 = new h(7, strArr);
                                        i2 = 0;
                                        break;
                                    case 'F':
                                        r11 = z(8, length2);
                                        i2 = 0;
                                        break;
                                    case 'G':
                                        r11 = new h(0, eras);
                                        i2 = 0;
                                        break;
                                    case 'H':
                                        r11 = z(11, length2);
                                        i2 = 0;
                                        break;
                                    default:
                                        switch (charAt) {
                                            case 'W':
                                                r11 = z(4, length2);
                                                i2 = 0;
                                                break;
                                            case 'X':
                                                r11 = c.d(length2);
                                                i2 = 0;
                                                break;
                                            case 'Y':
                                                break;
                                            case 'Z':
                                                if (length2 == 1) {
                                                    r11 = k.c;
                                                } else if (length2 == 2) {
                                                    r11 = c.d;
                                                } else {
                                                    r11 = k.b;
                                                }
                                                i2 = 0;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Illegal pattern component: " + y);
                                        }
                                }
                        }
                        arrayList.add(r11);
                        i4 = i5 + 1;
                        i3 = i2;
                    } else if (length2 >= 4) {
                        r11 = new j(this.Y, this.Z, 1);
                        i2 = 0;
                        arrayList.add(r11);
                        i4 = i5 + 1;
                        i3 = i2;
                    } else {
                        i2 = 0;
                        r11 = new j(this.Y, this.Z, 0);
                        arrayList.add(r11);
                        i4 = i5 + 1;
                        i3 = i2;
                    }
                }
                i2 = 0;
                if (length2 == 2) {
                    r11 = p.a;
                } else {
                    r11 = z(1, Math.max(length2, 4));
                }
                if (charAt == 'Y') {
                    r11 = new s(r11);
                }
                arrayList.add(r11);
                i4 = i5 + 1;
                i3 = i2;
            } else {
                return arrayList;
            }
        }
        return arrayList;
    }

    public String y(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i2);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= length || str.charAt(i3) != charAt) {
                    break;
                }
                sb.append(charAt);
                i2 = i3;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt2 == '\'') {
                    int i4 = i2 + 1;
                    if (i4 < length && str.charAt(i4) == '\'') {
                        sb.append(charAt2);
                        i2 = i4;
                    } else {
                        z = !z;
                    }
                } else if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                    i2--;
                    break;
                } else {
                    sb.append(charAt2);
                }
                i2++;
            }
        }
        iArr[0] = i2;
        return sb.toString();
    }

    public d z(int i2, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                return new e(i2, i3);
            }
            return new o(i2);
        }
        return new r(i2);
    }
}
