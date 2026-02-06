package o;

import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* renamed from: o.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5947e0 implements UI0 {
    public final char n;

    /* renamed from: o */
    public final char f720o;
    public final EnumC4456Us p;
    public String q;

    public AbstractC5947e0(char c, char c2, EnumC4456Us enumC4456Us) {
        this.n = c;
        this.f720o = c2;
        this.p = enumC4456Us;
    }

    @Override // o.UI0
    public char a() {
        return this.n;
    }

    @Override // o.UI0
    public String b() {
        return C4500Ve2.L(this.q);
    }

    @Override // o.UI0
    public String[] c(String str) throws IOException {
        return m(str, false);
    }

    @Override // o.UI0
    public String[] e(String str) throws IOException {
        return m(str, true);
    }

    @Override // o.UI0
    public String f(String[] strArr, final boolean z) {
        return (String) Stream.of((Object[]) strArr).map(new Function() { // from class: o.d0
            {
                AbstractC5947e0.this = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String k;
                k = AbstractC5947e0.this.k((String) obj, z);
                return k;
            }
        }).collect(Collectors.joining(Character.toString(a())));
    }

    @Override // o.UI0
    public char g() {
        return this.f720o;
    }

    @Override // o.UI0
    public boolean h() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    @Override // o.UI0
    public EnumC4456Us i() {
        return this.p;
    }

    public abstract String k(String str, boolean z);

    public boolean l(String str, boolean z) {
        if (str == null) {
            return this.p.equals(EnumC4456Us.EMPTY_QUOTES);
        }
        if ((str.isEmpty() && this.p.equals(EnumC4456Us.EMPTY_SEPARATORS)) || z || str.contains(Character.toString(a())) || str.contains("\n")) {
            return true;
        }
        return false;
    }

    public abstract String[] m(String str, boolean z) throws IOException;
}
