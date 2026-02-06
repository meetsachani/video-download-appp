package o;

import java.io.IOException;
import java.io.Writer;

/* renamed from: o.Vs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4553Vs extends AbstractC6190f0 {
    public final char Z0;
    public final char a1;
    public final char b1;

    public C4553Vs(Writer writer) {
        this(writer, ',', '\"', '\"', "\n");
    }

    @Override // o.AbstractC6190f0
    public void f(String[] strArr, boolean z, Appendable appendable) throws IOException {
        if (strArr == null) {
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                appendable.append(this.Z0);
            }
            String str = strArr[i];
            if (str != null) {
                boolean l = l(str);
                Boolean valueOf = Boolean.valueOf(l);
                h(z, appendable, valueOf);
                if (l) {
                    k(str, appendable);
                } else {
                    appendable.append(str);
                }
                h(z, appendable, valueOf);
            }
        }
        appendable.append(this.Y);
        this.X.write(appendable.toString());
    }

    public final void h(boolean z, Appendable appendable, Boolean bool) throws IOException {
        char c;
        if ((z || bool.booleanValue()) && (c = this.a1) != 0) {
            appendable.append(c);
        }
    }

    public boolean i(char c) {
        char c2 = this.a1;
        if (c2 == 0) {
            if (c == c2 || c == this.b1 || c == this.Z0 || c == '\n') {
                return true;
            }
            return false;
        } else if (c == c2 || c == this.b1) {
            return true;
        } else {
            return false;
        }
    }

    public void j(Appendable appendable, char c) throws IOException {
        if (this.b1 != 0 && i(c)) {
            appendable.append(this.b1);
        }
        appendable.append(c);
    }

    public void k(String str, Appendable appendable) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            j(appendable, str.charAt(i));
        }
    }

    public boolean l(String str) {
        if (str.indexOf(this.a1) == -1 && str.indexOf(this.b1) == -1 && str.indexOf(this.Z0) == -1 && !str.contains("\n") && !str.contains("\r")) {
            return false;
        }
        return true;
    }

    public C4553Vs(Writer writer, char c, char c2, char c3, String str) {
        super(writer, str);
        this.b1 = c3;
        this.a1 = c2;
        this.Z0 = c;
    }
}
