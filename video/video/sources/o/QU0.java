package o;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@InterfaceC11149zF0
@InterfaceC8301na0
/* loaded from: classes3.dex */
public final class QU0 extends OG implements Serializable {
    private static final long serialVersionUID = 0;
    public final Pattern X;

    /* loaded from: classes3.dex */
    public static final class a extends MG {
        public final Matcher a;

        public a(Matcher matcher) {
            this.a = (Matcher) C10664xF1.E(matcher);
        }

        @Override // o.MG
        public int a() {
            return this.a.end();
        }

        @Override // o.MG
        public boolean b() {
            return this.a.find();
        }

        @Override // o.MG
        public boolean c(int i) {
            return this.a.find(i);
        }

        @Override // o.MG
        public boolean d() {
            return this.a.matches();
        }

        @Override // o.MG
        public String e(String str) {
            return this.a.replaceAll(str);
        }

        @Override // o.MG
        public int f() {
            return this.a.start();
        }
    }

    public QU0(Pattern pattern) {
        this.X = (Pattern) C10664xF1.E(pattern);
    }

    @Override // o.OG
    public int b() {
        return this.X.flags();
    }

    @Override // o.OG
    public MG d(CharSequence charSequence) {
        return new a(this.X.matcher(charSequence));
    }

    @Override // o.OG
    public String e() {
        return this.X.pattern();
    }

    @Override // o.OG
    public String toString() {
        return this.X.toString();
    }
}
