package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.Ms  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3675Ms extends AbstractC5947e0 {
    public static final int y = 3;
    public final char r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public boolean w;
    public Locale x;

    /* renamed from: o.Ms$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4456Us.values().length];
            a = iArr;
            try {
                iArr[EnumC4456Us.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC4456Us.EMPTY_SEPARATORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC4456Us.EMPTY_QUOTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: o.Ms$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final String a;
        public StringBuilder c;
        public int b = 0;
        public int d = 0;
        public int e = 0;

        public b(String str) {
            this.a = str;
        }

        public void b(char c) {
            h().append(c);
        }

        public void c(String str) {
            h().append(str);
        }

        public void d() {
            int i = this.e;
            if (i == this.d) {
                int i2 = this.b;
                this.d = i2 - 1;
                this.e = i2;
            } else if (i == this.b - 1) {
                this.e = i + 1;
            } else {
                h().append(this.a.charAt(this.b - 1));
            }
        }

        public void e() {
            StringBuilder sb = this.c;
            if (sb != null) {
                sb.setLength(0);
            }
            int i = this.b;
            this.e = i;
            this.d = i;
        }

        public boolean f() {
            if (this.b >= this.a.length()) {
                return true;
            }
            return false;
        }

        public boolean g() {
            if (this.d >= this.e) {
                StringBuilder sb = this.c;
                if (sb == null || sb.length() == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final StringBuilder h() {
            if (this.c == null) {
                this.c = new StringBuilder(this.a.length() + 128);
            }
            int i = this.d;
            int i2 = this.e;
            if (i < i2) {
                this.c.append((CharSequence) this.a, i, i2);
                int i3 = this.b;
                this.e = i3;
                this.d = i3;
            }
            return this.c;
        }

        public String i() {
            StringBuilder sb = this.c;
            if (sb != null && sb.length() != 0) {
                return h().toString();
            }
            return this.a.substring(this.d, this.e);
        }

        public char j() {
            String str = this.a;
            int i = this.b;
            this.b = i + 1;
            return str.charAt(i);
        }

        public String k() {
            String i = i();
            e();
            return i;
        }
    }

    public C3675Ms() {
        this(',', '\"', '\\', false, true, false, UI0.j, Locale.getDefault());
    }

    public final boolean A(String str, boolean z, int i) {
        int i2;
        if (z && str.length() > (i2 = i + 1) && v(str.charAt(i2))) {
            return true;
        }
        return false;
    }

    public final boolean B(char c, char c2) {
        if (c != 0 && c == c2) {
            return true;
        }
        return false;
    }

    public boolean C() {
        return this.s;
    }

    public final boolean D(boolean z) {
        int i = a.a[this.p.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            return z;
        }
        return !z;
    }

    @Override // o.UI0
    public void d(Locale locale) {
        this.x = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // o.AbstractC5947e0
    public String k(String str, boolean z) {
        String str2;
        int length;
        boolean z2;
        if (str == null && !this.p.equals(EnumC4456Us.NEITHER)) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (str2 == null) {
            length = 16;
        } else {
            length = str2.length() * 2;
        }
        StringBuilder sb = new StringBuilder(length);
        boolean t = C4500Ve2.t(str2, g());
        boolean t2 = C4500Ve2.t(str2, p());
        boolean t3 = C4500Ve2.t(str2, a());
        if (!z && !l(str, t3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (t) {
            String ch = Character.toString(g());
            str2 = str2.replaceAll(ch, Character.toString(g()) + g());
        }
        if (t2) {
            String ch2 = Character.toString(p());
            str2 = str2.replace(ch2, Character.toString(p()) + p());
        }
        if (z2) {
            sb.append(g());
        }
        sb.append(str2);
        if (z2) {
            sb.append(g());
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0090 -> B:20:0x003e). Please submit an issue!!! */
    @Override // o.AbstractC5947e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] m(String str, boolean z) throws IOException {
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        if (!z && this.q != null) {
            this.q = null;
        }
        if (str == null) {
            String str2 = this.q;
            if (str2 == null) {
                return null;
            }
            this.q = null;
            return new String[]{str2};
        }
        if (this.v <= 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((this.v + 1) * 2);
        }
        b bVar = new b(str);
        String str3 = this.q;
        if (str3 != null) {
            bVar.c(str3);
            this.q = null;
            z2 = !this.u;
            z3 = false;
            while (!bVar.f()) {
                char j = bVar.j();
                if (j == this.r) {
                    if (!this.s) {
                        this.w = true;
                    }
                    q(str, bVar, z2);
                } else if (j == this.f720o) {
                    if (A(str, s(z2), bVar.b - 1)) {
                        bVar.j();
                        bVar.d();
                    } else {
                        z2 = !z2;
                        if (bVar.g()) {
                            z3 = true;
                        }
                        r(str, bVar);
                    }
                    this.w = !this.w;
                } else if (j == this.n && (!z2 || this.u)) {
                    arrayList.add(o(bVar.k(), z3));
                    this.w = false;
                    z3 = false;
                    while (!bVar.f()) {
                    }
                } else if (!this.s || (z2 && !this.u)) {
                    bVar.d();
                    this.w = true;
                    z3 = true;
                }
            }
            if (!z2 && !this.u) {
                if (z) {
                    bVar.b('\n');
                    this.q = bVar.i();
                } else {
                    throw new IOException(String.format(ResourceBundle.getBundle(UI0.k, this.x).getString("unterminated.quote"), bVar.i()));
                }
            } else {
                this.w = false;
                arrayList.add(o(bVar.k(), z3));
            }
            this.v = arrayList.size();
            return (String[]) arrayList.toArray(C4206Se.u);
        }
        z2 = false;
        z3 = false;
        while (!bVar.f()) {
        }
        if (!z2) {
        }
        this.w = false;
        arrayList.add(o(bVar.k(), z3));
        this.v = arrayList.size();
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public final boolean n(char c, char c2, char c3) {
        if (!B(c, c2) && !B(c, c3) && !B(c2, c3)) {
            return false;
        }
        return true;
    }

    public final String o(String str, boolean z) {
        if (str.isEmpty() && D(z)) {
            return null;
        }
        return str;
    }

    public char p() {
        return this.r;
    }

    public final void q(String str, b bVar, boolean z) {
        if (z(str, s(z), bVar.b - 1)) {
            bVar.j();
            bVar.d();
        }
    }

    public final void r(String str, b bVar) {
        int i;
        if (!this.s && (i = bVar.b) > 3 && str.charAt(i - 2) != this.n && str.length() > i && str.charAt(i) != this.n) {
            if (this.t && !bVar.g() && C4500Ve2.Q0(bVar.i())) {
                bVar.e();
            } else {
                bVar.d();
            }
        }
    }

    public final boolean s(boolean z) {
        if ((z && !this.u) || this.w) {
            return true;
        }
        return false;
    }

    public final boolean t(char c) {
        if (!v(c) && !u(c) && !w(c)) {
            return false;
        }
        return true;
    }

    public final boolean u(char c) {
        if (c == this.r) {
            return true;
        }
        return false;
    }

    public final boolean v(char c) {
        if (c == this.f720o) {
            return true;
        }
        return false;
    }

    public final boolean w(char c) {
        if (c == this.n) {
            return true;
        }
        return false;
    }

    public boolean x() {
        return this.t;
    }

    public boolean y() {
        return this.u;
    }

    public boolean z(String str, boolean z, int i) {
        int i2;
        if (z && str.length() > (i2 = i + 1) && t(str.charAt(i2))) {
            return true;
        }
        return false;
    }

    public C3675Ms(char c, char c2, char c3, boolean z, boolean z2, boolean z3, EnumC4456Us enumC4456Us, Locale locale) {
        super(c, c2, enumC4456Us);
        this.v = -1;
        this.w = false;
        this.x = (Locale) C11304zt1.t(locale, Locale.getDefault());
        if (n(c, c2, c3)) {
            throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, this.x).getString("special.characters.must.differ"));
        }
        if (c != 0) {
            this.r = c3;
            this.s = z;
            this.t = z2;
            this.u = z3;
            return;
        }
        throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, this.x).getString("define.separator"));
    }
}
