package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: o.wb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10504wb2 {
    public static final String k = "SsaStyle";
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f904o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    public static final int s = 7;
    public static final int t = 8;
    public static final int u = 9;
    public static final int v = -1;
    public static final int w = 1;
    public static final int x = 3;
    public final String a;
    public final int b;
    @InterfaceC11300zs1
    @JF
    public final Integer c;
    @InterfaceC11300zs1
    @JF
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    /* renamed from: o.wb2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @InterfaceC11300zs1
        public static a a(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < split.length; i11++) {
                String g = C8077mf.g(split[i11].trim());
                g.getClass();
                switch (g.hashCode()) {
                    case -1178781136:
                        if (g.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026963764:
                        if (g.equals("underline")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192095652:
                        if (g.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (g.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (g.equals("bold")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (g.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (g.equals("fontsize")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 767321349:
                        if (g.equals("borderstyle")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (g.equals("alignment")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1988365454:
                        if (g.equals("outlinecolour")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i7 = i11;
                        break;
                    case 1:
                        i8 = i11;
                        break;
                    case 2:
                        i9 = i11;
                        break;
                    case 3:
                        i3 = i11;
                        break;
                    case 4:
                        i6 = i11;
                        break;
                    case 5:
                        i = i11;
                        break;
                    case 6:
                        i5 = i11;
                        break;
                    case 7:
                        i10 = i11;
                        break;
                    case '\b':
                        i2 = i11;
                        break;
                    case '\t':
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, split.length);
            }
            return null;
        }
    }

    /* renamed from: o.wb2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final String c = "SsaStyle.Overrides";
        public static final Pattern d = Pattern.compile("\\{([^}]*)\\}");
        public static final String e = "\\s*\\d+(?:\\.\\d+)?\\s*";
        public static final Pattern f = Pattern.compile(TD2.M("\\\\pos\\((%1$s),(%1$s)\\)", e));
        public static final Pattern g = Pattern.compile(TD2.M("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", e));
        public static final Pattern h = Pattern.compile("\\\\an(\\d+)");
        public final int a;
        @InterfaceC11300zs1
        public final PointF b;

        public b(int i, @InterfaceC11300zs1 PointF pointF) {
            this.a = i;
            this.b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = h.matcher(str);
            if (matcher.find()) {
                return C10504wb2.e((String) C9542sf.g(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = d.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) C9542sf.g(matcher.group(1));
                try {
                    PointF c2 = c(str2);
                    if (c2 != null) {
                        pointF = c2;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a = a(str2);
                    if (a != -1) {
                        i = a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }

        @InterfaceC11300zs1
        public static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f.matcher(str);
            Matcher matcher2 = g.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    I31.h(c, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            return new PointF(Float.parseFloat(((String) C9542sf.g(group)).trim()), Float.parseFloat(((String) C9542sf.g(group2)).trim()));
        }

        public static String d(String str) {
            return d.matcher(str).replaceAll("");
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wb2$c */
    /* loaded from: classes2.dex */
    public @interface c {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wb2$d */
    /* loaded from: classes2.dex */
    public @interface d {
    }

    public C10504wb2(String str, int i, @InterfaceC11300zs1 @JF Integer num, @InterfaceC11300zs1 @JF Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    @InterfaceC11300zs1
    public static C10504wb2 b(String str, a aVar) {
        int i;
        Integer num;
        Integer num2;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        C9542sf.a(str.startsWith(C10015ub2.w));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = aVar.k;
        if (length != i2) {
            I31.n(k, TD2.M("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.a].trim();
            int i3 = aVar.b;
            int i4 = -1;
            if (i3 != -1) {
                i = e(split[i3].trim());
            } else {
                i = -1;
            }
            int i5 = aVar.c;
            if (i5 != -1) {
                num = h(split[i5].trim());
            } else {
                num = null;
            }
            int i6 = aVar.d;
            if (i6 != -1) {
                num2 = h(split[i6].trim());
            } else {
                num2 = null;
            }
            int i7 = aVar.e;
            if (i7 != -1) {
                f = i(split[i7].trim());
            } else {
                f = -3.4028235E38f;
            }
            float f2 = f;
            int i8 = aVar.f;
            boolean z4 = false;
            boolean z5 = true;
            if (i8 != -1 && f(split[i8].trim())) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            int i9 = aVar.g;
            if (i9 != -1 && f(split[i9].trim())) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            int i10 = aVar.h;
            if (i10 == -1 || !f(split[i10].trim())) {
                z2 = false;
            }
            int i11 = aVar.i;
            if (i11 != -1 && f(split[i11].trim())) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i12 = aVar.j;
            if (i12 != -1) {
                i4 = g(split[i12].trim());
            }
            return new C10504wb2(trim, i, num, num2, f2, z4, z5, z2, z3, i4);
        } catch (RuntimeException e) {
            I31.o(k, "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    public static boolean c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i) {
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        I31.n(k, "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            I31.o(k, "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        I31.n(k, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @InterfaceC11300zs1
    @JF
    public static Integer h(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            int d2 = C7775lT0.d(((parseLong >> 24) & 255) ^ 255);
            int d3 = C7775lT0.d((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(d2, C7775lT0.d(parseLong & 255), C7775lT0.d((parseLong >> 8) & 255), d3));
        } catch (IllegalArgumentException e) {
            I31.o(k, "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            I31.o(k, "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
