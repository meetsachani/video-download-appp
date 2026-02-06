package o;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class TD0 extends Exception {
    public static final StackTraceElement[] b1 = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    public final List<Throwable> X;
    public InterfaceC6575gX0 Y;
    public Class<?> Y0;
    public GU Z;
    public String Z0;
    public Exception a1;

    public TD0(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof TD0) {
                ((TD0) th).i(appendable);
            } else {
                d(th, appendable);
            }
            i = i2;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof TD0) {
            for (Throwable th2 : ((TD0) th).e()) {
                a(th2, list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    public List<Throwable> e() {
        return this.X;
    }

    public Exception f() {
        return this.a1;
    }

    public List<Throwable> g() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.Z0);
        String str3 = "";
        if (this.Y0 == null) {
            str = "";
        } else {
            str = C6566gU0.h + this.Y0;
        }
        sb.append(str);
        if (this.Z == null) {
            str2 = "";
        } else {
            str2 = C6566gU0.h + this.Z;
        }
        sb.append(str2);
        if (this.Y != null) {
            str3 = C6566gU0.h + this.Y;
        }
        sb.append(str3);
        List<Throwable> g = g();
        if (g.isEmpty()) {
            return sb.toString();
        }
        if (g.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(g.size());
            sb.append(" root causes:");
        }
        for (Throwable th : g) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void h(String str) {
        List<Throwable> g = g();
        int size = g.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(C9811tl1.d);
            Log.i(str, sb.toString(), g.get(i));
            i = i2;
        }
    }

    public final void i(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public void j(InterfaceC6575gX0 interfaceC6575gX0, GU gu) {
        k(interfaceC6575gX0, gu, null);
    }

    public void k(InterfaceC6575gX0 interfaceC6575gX0, GU gu, Class<?> cls) {
        this.Y = interfaceC6575gX0;
        this.Z = gu;
        this.Y0 = cls;
    }

    public void l(Exception exc) {
        this.a1 = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public TD0(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    public TD0(String str, List<Throwable> list) {
        this.Z0 = str;
        setStackTrace(b1);
        this.X = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }

    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        public static final String Y0 = "  ";
        public static final String Z = "";
        public final Appendable X;
        public boolean Y = true;

        public a(Appendable appendable) {
            this.X = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.Y) {
                this.Y = false;
                this.X.append(Y0);
            }
            this.Y = c == '\n';
            this.X.append(c);
            return this;
        }

        public final CharSequence b(CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            return charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence b = b(charSequence);
            return append(b, 0, b.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence b = b(charSequence);
            boolean z = false;
            if (this.Y) {
                this.Y = false;
                this.X.append(Y0);
            }
            if (b.length() > 0 && b.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.Y = z;
            this.X.append(b, i, i2);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
