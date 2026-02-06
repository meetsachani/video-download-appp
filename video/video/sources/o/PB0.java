package o;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes4.dex */
public class PB0 extends RuntimeException {
    public static final boolean Y;
    public static /* synthetic */ Class Z;
    public final Throwable X;

    static {
        boolean z;
        try {
            Class cls = Z;
            if (cls == null) {
                cls = a("java.lang.Throwable");
                Z = cls;
            }
            cls.getDeclaredMethod("getCause", null);
            z = true;
        } catch (NoSuchMethodException unused) {
            z = false;
        }
        Y = z;
    }

    public PB0() {
        this.X = null;
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.X;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        synchronized (printStream) {
            PrintWriter printWriter = new PrintWriter((OutputStream) printStream, false);
            printStackTrace(printWriter);
            printWriter.flush();
        }
    }

    public PB0(String str) {
        super(str);
        this.X = null;
    }

    public PB0(Throwable th) {
        super(th == null ? null : th.getMessage());
        this.X = th;
    }

    public PB0(String str, Throwable th) {
        super(str);
        this.X = th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        synchronized (printWriter) {
            try {
                super.printStackTrace(printWriter);
                if (this.X != null && !Y) {
                    printWriter.print("Caused by: ");
                    this.X.printStackTrace(printWriter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
